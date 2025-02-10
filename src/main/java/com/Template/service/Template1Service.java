package com.Template.service;

import com.Template.dto.OptionDTO;
import com.Template.dto.Template1.Template1FormDto;
import com.Template.dto.Template1.Template1IndexDto;

import java.util.List;

public interface Template1Service {
    List<Template1IndexDto> getAll(String filter1, String search1,String filter2, String search2,String filter3, String search3,Integer page);
    Integer totalPage(String filter1, String search1,String filter2, String search2,String filter3, String search3);
    Template1FormDto getTemplate1ById(String kode);
    List<OptionDTO> filter();
    List<OptionDTO> getSearchFilter(String filter);


    public void updateInsert(Template1FormDto template1FormDto);
    public void delete(String kode);
}
