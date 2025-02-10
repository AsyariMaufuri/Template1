package com.Template.controller;

import com.Template.dto.Template2.Template2FormDto;
import com.Template.service.Template1Service;
import com.Template.service.Template2Service;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("template2")
public class Template2Controller {
    private final Template2Service service;

    public Template2Controller(Template2Service service) {
        this.service = service;
    }

    @GetMapping("")
    public String index(@RequestParam(defaultValue = "") String filter1,
                        @RequestParam(defaultValue = "") String search1,
                        @RequestParam(defaultValue = "") String filter2,
                        @RequestParam(defaultValue = "") String search2,
                        @RequestParam(defaultValue = "") String filter3,
                        @RequestParam(defaultValue = "") String search3,
                        @RequestParam(defaultValue = "") String filter4,
                        @RequestParam(defaultValue = "") String search4,
                        @RequestParam(defaultValue = "") String filter5,
                        @RequestParam(defaultValue = "") String search5,
                        @RequestParam(defaultValue = "") String filter6,
                        @RequestParam(defaultValue = "") String search6,
                        @RequestParam(defaultValue = "") String filter7,
                        @RequestParam(defaultValue = "") String search7,
                        @RequestParam(defaultValue = "") LocalDate tanggalAwal,
                        @RequestParam(defaultValue = "") LocalDate tanggalAkhir,
                        @RequestParam(defaultValue = "1") int page, Model model){


        var grid =  service.getAll(filter1,search1,filter2,search2,filter3,search3,filter4,search4,filter5,search5,filter6,search6,filter7,search7,page,tanggalAwal,tanggalAkhir);
        var filterItem = service.filter();

        model.addAttribute("grid",grid);
        model.addAttribute("filterItem",filterItem);
        model.addAttribute("filter1",filter1);
        model.addAttribute("filter2",filter2);
        model.addAttribute("filter3",filter3);
        model.addAttribute("filter4",filter4);
        model.addAttribute("filter5",filter5);
        model.addAttribute("filter6",filter6);
        model.addAttribute("filter7",filter7);
        model.addAttribute("search1",search1);
        model.addAttribute("search2",search2);
        model.addAttribute("search3",search3);
        model.addAttribute("search4",search4);
        model.addAttribute("search5",search5);
        model.addAttribute("search6",search6);
        model.addAttribute("search7",search7);
        model.addAttribute("tanggalAkhir",tanggalAkhir);
        model.addAttribute("tanggalAkhir",tanggalAkhir);
        model.addAttribute("totalPages",service.totalPage(filter1,search1,filter2,search2,filter3,search3,filter4,search4,filter5,search5,filter6,search6,filter7,search7,tanggalAwal,tanggalAkhir));
        model.addAttribute("currentPage",page);

        return "template2/template2-index";
    }

    @GetMapping("form")
    public String form(Model model,@RequestParam(defaultValue = "")String kode) {
        var template2ById = service.getTemplate2ById(kode);
        model.addAttribute("template2ById",template2ById);
        return "template2/template2-form";
    }

    @PostMapping("form")
    public String form(@Valid @ModelAttribute("dataLeadsById") Template2FormDto template2FormDto, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "template2/template2-form";
        }else {
            service.updateInsert(template2FormDto);
            return "redirect:/template2/detail?kode=".concat(template2FormDto.getKode());
        }

    }

    @GetMapping("detail")
    public String detail(Model model,@RequestParam(defaultValue = "")String kode) {
        var template2ById = service.getTemplate2ById(kode);
        model.addAttribute("template2ById",template2ById);
        return "template2/template2-detail";
    }

    @GetMapping("delete")
    public String delete(@RequestParam(defaultValue = "") String kode){
        var template2ById = service.getTemplate2ById(kode);
        return "template2/template2-index";
    }
}
