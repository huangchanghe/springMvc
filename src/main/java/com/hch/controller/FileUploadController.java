package com.hch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@Controller
public class FileUploadController {

    @RequestMapping(value ="fileUpload",method ={RequestMethod.POST, RequestMethod.GET})
    public String uploadFile(@RequestParam(value="file1",required = true) MultipartFile file1, HttpServletRequest request) throws Exception{
        // 指定上传图片的保存路径
        String path=request.getServletContext().getRealPath("/");
        // 获取上传的文件名全称
        String fileName=file1.getOriginalFilename();
        // 获取上传文件的后缀名
        String suffix=fileName.substring(fileName.lastIndexOf("."));
        // 给文件定义一个新的名称,杜绝文件重名覆盖现象
        String newFileName= UUID.randomUUID().toString()+suffix;
        // 在指定路径中创建一个文件(该文件是空的)
        File file=new File(path +"/"+ newFileName);
        // 将上传的文件写入指定文件
        file1.transferTo(file);
        // 将新文件名添加到HttpServletRequest
        request.setAttribute("newFileName",newFileName);
        return "/upload/imgUpload";
    }
}
