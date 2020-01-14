package com.example.resume.Controller;

import com.example.resume.Service.aboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class indexController {

    @Autowired
    private aboutService aboutService;

    public indexController(aboutService aboutService) {
        this.aboutService = aboutService;

    }

    @ResponseBody
    @RequestMapping(value="/Hello", method = RequestMethod.GET)
    public Map<String, List<String>> Hello() {
        Map<String, List<String>> ans = new HashMap<String, List<String>>(100);
        List<String> about = new ArrayList<String>(10);
        about.add("3.82 (Top %5)");
        about.add("HHA University");
        about.add("+86 13512563888");
        about.add("CET-6 507");
        about.add("Bachelor");
        about.add("1864322516@qq.com");
        about.add("Principle of computer composition,");
        about.add("Operating system principle, Data structure, Computer network");

        ans.put("about", about);
        return ans;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage() {

        return "index";
    }
}
