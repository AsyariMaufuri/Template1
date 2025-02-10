package com.Template.service;

import com.Template.dto.OptionDTO;
import com.Template.dto.Template1.Template1FormDto;
import com.Template.dto.Template1.Template1IndexDto;
import com.Template.entity.Template1;
import com.Template.repository.Template1Repository;
import com.Template.repository.Template2Repository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class Template1ServiceImplement implements Template1Service{
    private final Template1Repository template1Repository;
    private final Template2Repository template2Repository;
    private final Integer rowInPage = 5;

    public Template1ServiceImplement(Template1Repository template1Repository, Template2Repository template2Repository) {
        this.template1Repository = template1Repository;
        this.template2Repository = template2Repository;
    }


    @Override
    public List<Template1IndexDto> getAll(String filter1, String search1, String filter2, String search2, String filter3, String search3, Integer page) {
        String kode = null;
        String name = null;
        Boolean status = null;

        if (filter1.isBlank()){
        }else {
            switch (filter1){
                case "kode" :
                    try{
                        kode = search1;
                    }catch (Exception exception){
                        kode = null;
                    }
                    break;
                case  "name":
                    name = search1;
                    break;
                case "status" :
                    status = Boolean.getBoolean(search1);
                    break;
            }
        }

        if (filter2.isBlank()){
        }else {
            switch (filter2){
                case "kode" :
                    try{
                        kode = search2;
                    }catch (Exception exception){
                        kode = null;
                    }
                    break;
                case  "name":
                    name = search2;
                    break;
                case "status" :
                    status = Boolean.getBoolean(search2);
                    break;
            }
        }

        if (filter3.isBlank()){
        }else {
            switch (filter3){
                case "kode" :
                    try{
                        kode = search3;
                    }catch (Exception exception){
                        kode = null;
                    }
                    break;
                case  "name":
                    name = search3;
                    break;
                case "status" :
                    status = Boolean.getBoolean(search3);
                    break;
            }
        }
        Pageable pagination = PageRequest.of(page-1,rowInPage, Sort.by("kode"));
        List<Template1> template1List = template1Repository.getAllBySearch(pagination,kode,name,status);
        List<Template1IndexDto> indexDtoList = new LinkedList<>();

        for(var template1: template1List){
            Template1IndexDto dto = new Template1IndexDto();
            dto.setKode(template1.getKode());
            dto.setNama(template1.getNama());
            dto.setStatus(template1.getStatus());
            indexDtoList.add(dto);
        }


        return indexDtoList;
    }

    @Override
    public Integer totalPage(String filter1, String search1, String filter2, String search2, String filter3, String search3) {
        String kode = null;
        String name = null;
        Boolean status = null;

        if (filter1.isBlank()){
        }else {
            switch (filter1){
                case "kode" :
                    try{
                        kode = search1;
                    }catch (Exception exception){
                        kode = null;
                    }
                    break;
                case  "name":
                    name = search1;
                    break;
                case "status" :
                    status = Boolean.getBoolean(search1);
                    break;
            }
        }

        if (filter2.isBlank()){
        }else {
            switch (filter2){
                case "kode" :
                    try{
                        kode = search2;
                    }catch (Exception exception){
                        kode = null;
                    }
                    break;
                case  "name":
                    name = search2;
                    break;
                case "status" :
                    status = Boolean.getBoolean(search2);
                    break;
            }
        }

        if (filter3.isBlank()){
        }else {
            switch (filter3){
                case "kode" :
                    try{
                        kode = search3;
                    }catch (Exception exception){
                        kode = null;
                    }
                    break;
                case  "name":
                    name = search3;
                    break;
                case "status" :
                    status = Boolean.getBoolean(search3);
                    break;
            }
        }

        Integer totalPage = (int) Math.ceil(((double)template1Repository.countAllBySearch( kode, name, status)) / rowInPage);

        return  totalPage;
    }

    @Override
    public Template1FormDto getTipeAplikasiById(String kode) {
        Template1FormDto dto = new Template1FormDto();
        Template1 template1 = template1Repository.getTemplate1ById(kode);
        if(template1 != null){
            dto.setKode(template1.getKode());
            dto.setNama(template1.getNama());
            dto.setStatus(template1.getStatus());
        }
        return dto;
    }

    @Override
    public List<OptionDTO> filter() {
        OptionDTO dto1 = new OptionDTO();
        OptionDTO dto2 = new OptionDTO();
        OptionDTO dto3 = new OptionDTO();
        List<OptionDTO> dtoList = new LinkedList<>();
        dto1.setText("Kode");
        dto1.setValue("kode");
        dto2.setText("Nama");
        dto2.setValue("name");
        dto3.setText("Status");
        dto3.setValue("status");
        dtoList.add(dto1);
        dtoList.add(dto2);
        dtoList.add(dto3);
        return dtoList;
    }

    @Override
    public List<OptionDTO> getSearchFilter(String filter) {
        return null;
    }

    @Override
    public void updateInsert(Template1FormDto template1FormDto) {

    }

    @Override
    public void delete(String kode) {

    }
}
