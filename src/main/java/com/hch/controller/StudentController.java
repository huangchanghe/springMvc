package com.hch.controller;

import com.hch.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
   private static List<Student> studentList=new ArrayList<>();
    static {

        studentList.add(new Student(1,"hch1",34));
        studentList.add(new Student(2,"hch2",35));
        studentList.add(new Student(3,"hch3",36));
    }
    @RequestMapping("/student/list")
    public ModelAndView list(){
        ModelAndView av=new ModelAndView();
        av.addObject("studentList",studentList);
        av.setViewName("/student/list");
        return av;
    }
    @RequestMapping("/student/ajax")
    public @ResponseBody Student list2(){
        return new Student(1,"hch",33);
    }

    @RequestMapping("/student/supload")
    public String studentUpload(HttpServletRequest request){
        return "upload/imgUpload";
    }
}
