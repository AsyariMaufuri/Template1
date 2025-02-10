package com.Template.service;

import com.Template.dto.OptionDTO;
import com.Template.dto.Template1.Template1FormDto;
import com.Template.dto.Template1.Template1IndexDto;
import com.Template.dto.Template2.Template2FormDto;
import com.Template.dto.Template2.Template2IndexDto;

import java.time.LocalDate;
import java.util.List;

public interface Template2Service {
    List<Template2IndexDto> getAll(String filter1, String search1, String filter2, String search2, String filter3, String search3, String filter4, String search4, String filter5, String search5, String filter6, String search6, String filter7, String search7, Integer page, LocalDate tanggalAwal, LocalDate tanggalAkhir);
    Integer totalPage(String filter1, String search1,String filter2, String search2,String filter3, String search3,String filter4, String search4,String filter5, String search5,String filter6, String search6,String filter7, String search7, LocalDate tanggalAwal, LocalDate tanggalAkhir);
    Template2FormDto getTemplate2ById(String kode);
    List<OptionDTO> filter();
    List<OptionDTO> getSearchFilter(String filter);


    public void updateInsert(Template2FormDto template2FormDtoFormDto);
    public void delete(String kode);
}
