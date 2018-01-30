package com.ggj.controller;

import com.ggj.service.DeptService;
import com.ggj.service.JobService;
import com.ggj.service.ResumeService;
import com.ggj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/1/30.
 */
@Controller
public class AdminController {
    @Resource
    private DeptService deptService;
    @Resource
    private JobService jobService;
    @Resource
    private UserService userService;
    @Resource
    private ResumeService resumeService;


    @RequestMapping("/jumptoadminLogin")
    public String jumptoadminLogin(){
        return "adminlogin";
    }
    @RequestMapping("/adminLogin")
    public String AdminLogin(HttpServletRequest request)throws Exception{
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        if (name.equals("admin")&&pass.equals("admin")){
            return "adminInner";
        }else{
            return "../../index";
        }
    }
}
