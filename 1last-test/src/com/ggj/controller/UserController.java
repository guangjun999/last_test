package com.ggj.controller;

import com.ggj.model.Resume;
import com.ggj.model.User;
import com.ggj.service.ResumeService;
import com.ggj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/1/29.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private ResumeService resumeService;

    @RequestMapping("/jumptoRegest")
    public String regest()throws Exception{
        return "regest";
    }

    @RequestMapping("/regest")
    public String regestll(User user,HttpSession session)throws Exception{
        userService.saveUser(user);
        return "../../index";
    }

    @RequestMapping("/login")
    public String login(User user, HttpSession session)throws Exception{
        User user1 = userService.login(user);
        if (user1!=null){
            session.setAttribute("user",user1);
            return "inner";
        }
        return "../../index";
    }
    @RequestMapping("/checkName")
    public void checkName(String name, HttpServletResponse response)throws Exception{
        User user1 = userService.checkName(name);
        if (user1!=null){
            response.getWriter().print("111");
        }else {
            response.getWriter().print("11");
        }
    }

    @RequestMapping("/jumpresume")
    public String resume(HttpSession session)throws Exception{
        User user = (User) session.getAttribute("user");
        System.out.println(user.getU_id());
        Resume resume = resumeService.getResumes(user.getU_id());
        session.setAttribute("resume",resume);
        return "resume";
    }

    @RequestMapping("/jumpMakeResume")
    public String jumpMakeResume(HttpSession session)throws Exception{
        return "makeResume";
    }

    @RequestMapping("/makeResume")
    public String makeResume(Resume resume,HttpSession session)throws Exception{
       if (resumeService.saveResume(resume)){
           User user = (User) session.getAttribute("user");
           Resume resumeList = resumeService.getResumes(user.getU_id());
           session.setAttribute("resume",resumeList);
       }
        return "resume";
    }

    @RequestMapping("/checkResumeNum")
    public void checkResumeNum(HttpSession session,HttpServletResponse response) throws Exception {
        User user = (User) session.getAttribute("user");
        Resume resume =resumeService.getResumes(user.getU_id());
        System.out.println(resume.getR_address());
        if (resume!=null){
            response.getWriter().print("1");
        }else {
            response.getWriter().print("11");
        }
    }

    @RequestMapping("/modifireResume")
    public String modifireResume(Resume resume,HttpSession session)throws Exception{
        resumeService.updateResume(resume);
        session.setAttribute("resume",resumeService.getResume(resume.getR_id()));
        return "resume";
    }

    @RequestMapping("/jumpToModifireResume")
    public String jumpToModifireResume(HttpSession session)throws Exception{
        return "modifireResume";
    }
}
