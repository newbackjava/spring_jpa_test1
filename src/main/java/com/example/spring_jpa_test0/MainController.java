package com.example.spring_jpa_test0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("blog_single")
    public String blog_single() {
        return "blog-single";
    }

    @GetMapping("contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("blog_default")
    public String blog_default() {
        return "blog-default";
    }

    @GetMapping("service_detail")
    public String service_detail() {
        return "service-detail";
    }

    @GetMapping("service_list")
    public String service_list() {
        return "service-list";
    }

    @GetMapping("styleguide")
    public String styleguide() {
        return "styleguide";
    }



}
