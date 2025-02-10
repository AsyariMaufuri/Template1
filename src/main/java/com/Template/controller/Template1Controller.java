package com.Template.controller;

import com.Template.service.Template1Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("template1")
public class Template1Controller {
    private final Template1Service service;

    public Template1Controller(Template1Service service) {
        this.service = service;
    }

    @GetMapping("")
    public String index(@RequestParam(defaultValue = "") String filter1,
                        @RequestParam(defaultValue = "") String search1,
                        @RequestParam(defaultValue = "") String filter2,
                        @RequestParam(defaultValue = "") String search2,
                        @RequestParam(defaultValue = "") String filter3,
                        @RequestParam(defaultValue = "") String search3,
                        @RequestParam(defaultValue = "1") int page, Model model){


        var grid =  service.getAll(filter1,search1,filter2,search2,filter3,search3,page);
        var filterItem = service.filter();

        model.addAttribute("grid",grid);
        model.addAttribute("filterItem",filterItem);
        model.addAttribute("filter1",filter1);
        model.addAttribute("filter2",filter2);
        model.addAttribute("filter3",filter3);
        model.addAttribute("search1",search1);
        model.addAttribute("search2",search2);
        model.addAttribute("search3",search3);
        model.addAttribute("totalPages",service.totalPage(filter1,search1,filter2,search2,filter3,search3));
        model.addAttribute("currentPage",page);





        return "template1/template1-index";
    }
}
