package cn.smbms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller

public class IndexController extends AbstractController {
    @Override
    @RequestMapping("index.html")
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("hello");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("welcome")
    public ModelAndView welcome(@RequestParam(value = "name",required = false) String userName) {
        System.out.println(userName);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name",userName);
        modelAndView.setViewName("welcome");
        return modelAndView;
    }


    @RequestMapping("welcome2")
    public String welcome2(String name , Map<String , Object> map) {
        map.put("name" , name);
        return "welcome";


    }
}
