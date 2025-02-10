package com.Template.service;

import com.Template.dto.OptionDTO;
import com.Template.dto.Template1.Template1FormDto;
import com.Template.dto.Template1.Template1IndexDto;
import com.Template.dto.Template2.Template2FormDto;
import com.Template.dto.Template2.Template2IndexDto;
import com.Template.entity.Template1;
import com.Template.entity.Template2;
import com.Template.helper.Helper;
import com.Template.repository.Template1Repository;
import com.Template.repository.Template2Repository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Service
public class Template2ServiceImplement implements Template2Service{
    private final Template1Repository template1Repository;
    private final Template2Repository template2Repository;
    private final Integer rowInPage = 1;

    public Template2ServiceImplement(Template1Repository template1Repository, Template2Repository template2Repository) {
        this.template1Repository = template1Repository;
        this.template2Repository = template2Repository;
    }


    @Override
    public List<Template2IndexDto> getAll(String filter1, String search1, String filter2, String search2, String filter3, String search3, String filter4, String search4, String filter5, String search5, String filter6, String search6, String filter7, String search7, Integer page, LocalDate tanggalAwal, LocalDate tanggalAkhir) {
        LocalDate tanggalAwalInput = tanggalAwal;
        LocalDate tanggalAkhirInput = tanggalAkhir;
        tanggalAwal = null;
        tanggalAkhir = null;
        String template1 = null;
        String kode = null;
        String name = null;
        BigDecimal harga = null;
        Integer diskon = null;
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
                case "template1" :
                    template1 = search1;
                    break;
                case "diskon" :
                    try {
                        diskon = Integer.parseInt(search1);
                    }catch (Exception exception){
                        diskon = null;
                    }
                    break;
                case "tanggal" :
                    tanggalAwal = tanggalAwalInput;
                    tanggalAkhir = tanggalAkhirInput;
                    break;
                case "harga" :
                    try {
                        harga = new BigDecimal(search1);
                    }catch (Exception exception){
                        harga = null;
                    }
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
                case "template1" :
                    template1 = search2;
                    break;
                case "diskon" :
                    try {
                        diskon = Integer.parseInt(search2);
                    }catch (Exception exception){
                        diskon = null;
                    }
                    break;
                case "tanggal" :
                    tanggalAwal = tanggalAwalInput;
                    tanggalAkhir = tanggalAkhirInput;
                    break;
                case "harga" :
                    try {
                        harga = new BigDecimal(search2);
                    }catch (Exception exception){
                        harga = null;
                    }
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
                case "template1" :
                    template1 = search3;
                    break;
                case "diskon" :
                    try {
                        diskon = Integer.parseInt(search3);
                    }catch (Exception exception){
                        diskon = null;
                    }
                    break;
                case "tanggal" :
                    tanggalAwal = tanggalAwalInput;
                    tanggalAkhir = tanggalAkhirInput;
                    break;
                case "harga" :
                    try {
                        harga = new BigDecimal(search3);
                    }catch (Exception exception){
                        harga = null;
                    }
                    break;
            }
        }
        if (filter4.isBlank()){
        }else {
            switch (filter4){
                case "kode" :
                    try{
                        kode = search4;
                    }catch (Exception exception){
                        kode = null;
                    }
                    break;
                case  "name":
                    name = search4;
                    break;
                case "status" :
                    status = Boolean.getBoolean(search4);
                    break;
                case "template1" :
                    template1 = search4;
                    break;
                case "diskon" :
                    try {
                        diskon = Integer.parseInt(search4);
                    }catch (Exception exception){
                        diskon = null;
                    }
                    break;
                case "tanggal" :
                    tanggalAwal = tanggalAwalInput;
                    tanggalAkhir = tanggalAkhirInput;
                    break;
                case "harga" :
                    try {
                        harga = new BigDecimal(search4);
                    }catch (Exception exception){
                        harga = null;
                    }
                    break;
            }
        }
        if (search5.isBlank()){
        }else {
            switch (search5){
                case "kode" :
                    try{
                        kode = search5;
                    }catch (Exception exception){
                        kode = null;
                    }
                    break;
                case  "name":
                    name = search5;
                    break;
                case "status" :
                    status = Boolean.getBoolean(search5);
                    break;
                case "template1" :
                    template1 = search5;
                    break;
                case "diskon" :
                    try {
                        diskon = Integer.parseInt(search5);
                    }catch (Exception exception){
                        diskon = null;
                    }
                    break;
                case "tanggal" :
                    tanggalAwal = tanggalAwalInput;
                    tanggalAkhir = tanggalAkhirInput;
                    break;
                case "harga" :
                    try {
                        harga = new BigDecimal(search5);
                    }catch (Exception exception){
                        harga = null;
                    }
                    break;
            }
        }
        if (filter6.isBlank()){
        }else {
            switch (filter6){
                case "kode" :
                    try{
                        kode = search6;
                    }catch (Exception exception){
                        kode = null;
                    }
                    break;
                case  "name":
                    name = search6;
                    break;
                case "status" :
                    status = Boolean.getBoolean(search6);
                    break;
                case "template1" :
                    template1 = search6;
                    break;
                case "diskon" :
                    try {
                        diskon = Integer.parseInt(search6);
                    }catch (Exception exception){
                        diskon = null;
                    }
                    break;
                case "tanggal" :
                    tanggalAwal = tanggalAwalInput;
                    tanggalAkhir = tanggalAkhirInput;
                    break;
                case "harga" :
                    try {
                        harga = new BigDecimal(search6);
                    }catch (Exception exception){
                        harga = null;
                    }
                    break;
            }
        }
        if (filter7.isBlank()){
        }else {
            switch (filter7){
                case "kode" :
                    try{
                        kode = search7;
                    }catch (Exception exception){
                        kode = null;
                    }
                    break;
                case  "name":
                    name = search7;
                    break;
                case "status" :
                    status = Boolean.getBoolean(search7);
                    break;
                case "template1" :
                    template1 = search7;
                    break;
                case "diskon" :
                    try {
                        diskon = Integer.parseInt(search7);
                    }catch (Exception exception){
                        diskon = null;
                    }
                    break;
                case "tanggal" :
                    tanggalAwal = tanggalAwalInput;
                    tanggalAkhir = tanggalAkhirInput;
                    break;
                case "harga" :
                    try {
                        harga = new BigDecimal(search7);
                    }catch (Exception exception){
                        harga = null;
                    }
                    break;
            }
        }

        Pageable pagination = PageRequest.of(page-1,rowInPage, Sort.by("kode"));
        List<Template2> template2List = template2Repository.getAllBySearch(pagination,kode,name,tanggalAwal,tanggalAkhir,harga,diskon,status,template1);
        List<Template2IndexDto> indexDtoList = new LinkedList<>();

        for(var template2: template2List){
            Template2IndexDto dto = new Template2IndexDto();
            dto.setKode(template2.getKode());
            dto.setNama(template2.getNama());
            dto.setStatus(template2.getStatus());
            dto.setDiskon(template2.getDiskon().toString().concat("%"));
            dto.setHarga(Helper.formatCurrency(template2.getHarga()));
            dto.setTanggal(Helper.formatLocalDate(template2.getTanggal()));
            dto.setKodeTemplate1(template2.getKodeTemplate1());
            indexDtoList.add(dto);
        }


        return indexDtoList;
    }

    @Override
    public Integer totalPage(String filter1, String search1, String filter2, String search2, String filter3, String search3, String filter4, String search4, String filter5, String search5, String filter6, String search6, String filter7, String search7, LocalDate tanggalAwal, LocalDate tanggalAkhir) {

            LocalDate tanggalAwalInput = tanggalAwal;
            LocalDate tanggalAkhirInput = tanggalAkhir;
            tanggalAwal = null;
            tanggalAkhir = null;
            String template1 = null;
            String kode = null;
            String name = null;
            BigDecimal harga = null;
            Integer diskon = null;
            Boolean status = null;

            if (filter1.isBlank()) {
            } else {
                switch (filter1) {
                    case "kode":
                        try {
                            kode = search1;
                        } catch (Exception exception) {
                            kode = null;
                        }
                        break;
                    case "name":
                        name = search1;
                        break;
                    case "status":
                        status = Boolean.getBoolean(search1);
                        break;
                    case "template1":
                        template1 = search1;
                        break;
                    case "diskon":
                        try {
                            diskon = Integer.parseInt(search1);
                        } catch (Exception exception) {
                            diskon = null;
                        }
                        break;
                    case "tanggal":
                        tanggalAwal = tanggalAwalInput;
                        tanggalAkhir = tanggalAkhirInput;
                        break;
                    case "harga":
                        try {
                            harga = new BigDecimal(search1);
                        } catch (Exception exception) {
                            harga = null;
                        }
                        break;
                }
            }

            if (filter2.isBlank()) {
            } else {
                switch (filter2) {
                    case "kode":
                        try {
                            kode = search2;
                        } catch (Exception exception) {
                            kode = null;
                        }
                        break;
                    case "name":
                        name = search2;
                        break;
                    case "status":
                        status = Boolean.getBoolean(search2);
                        break;
                    case "template1":
                        template1 = search2;
                        break;
                    case "diskon":
                        try {
                            diskon = Integer.parseInt(search2);
                        } catch (Exception exception) {
                            diskon = null;
                        }
                        break;
                    case "tanggal":
                        tanggalAwal = tanggalAwalInput;
                        tanggalAkhir = tanggalAkhirInput;
                        break;
                    case "harga":
                        try {
                            harga = new BigDecimal(search2);
                        } catch (Exception exception) {
                            harga = null;
                        }
                        break;
                }
            }
            if (filter3.isBlank()) {
            } else {
                switch (filter3) {
                    case "kode":
                        try {
                            kode = search3;
                        } catch (Exception exception) {
                            kode = null;
                        }
                        break;
                    case "name":
                        name = search3;
                        break;
                    case "status":
                        status = Boolean.getBoolean(search3);
                        break;
                    case "template1":
                        template1 = search3;
                        break;
                    case "diskon":
                        try {
                            diskon = Integer.parseInt(search3);
                        } catch (Exception exception) {
                            diskon = null;
                        }
                        break;
                    case "tanggal":
                        tanggalAwal = tanggalAwalInput;
                        tanggalAkhir = tanggalAkhirInput;
                        break;
                    case "harga":
                        try {
                            harga = new BigDecimal(search3);
                        } catch (Exception exception) {
                            harga = null;
                        }
                        break;
                }
            }
            if (filter4.isBlank()) {
            } else {
                switch (filter4) {
                    case "kode":
                        try {
                            kode = search4;
                        } catch (Exception exception) {
                            kode = null;
                        }
                        break;
                    case "name":
                        name = search4;
                        break;
                    case "status":
                        status = Boolean.getBoolean(search4);
                        break;
                    case "template1":
                        template1 = search4;
                        break;
                    case "diskon":
                        try {
                            diskon = Integer.parseInt(search4);
                        } catch (Exception exception) {
                            diskon = null;
                        }
                        break;
                    case "tanggal":
                        tanggalAwal = tanggalAwalInput;
                        tanggalAkhir = tanggalAkhirInput;
                        break;
                    case "harga":
                        try {
                            harga = new BigDecimal(search4);
                        } catch (Exception exception) {
                            harga = null;
                        }
                        break;
                }
            }
            if (search5.isBlank()) {
            } else {
                switch (search5) {
                    case "kode":
                        try {
                            kode = search5;
                        } catch (Exception exception) {
                            kode = null;
                        }
                        break;
                    case "name":
                        name = search5;
                        break;
                    case "status":
                        status = Boolean.getBoolean(search5);
                        break;
                    case "template1":
                        template1 = search5;
                        break;
                    case "diskon":
                        try {
                            diskon = Integer.parseInt(search5);
                        } catch (Exception exception) {
                            diskon = null;
                        }
                        break;
                    case "tanggal":
                        tanggalAwal = tanggalAwalInput;
                        tanggalAkhir = tanggalAkhirInput;
                        break;
                    case "harga":
                        try {
                            harga = new BigDecimal(search5);
                        } catch (Exception exception) {
                            harga = null;
                        }
                        break;
                }
            }
            if (filter6.isBlank()) {
            } else {
                switch (filter6) {
                    case "kode":
                        try {
                            kode = search6;
                        } catch (Exception exception) {
                            kode = null;
                        }
                        break;
                    case "name":
                        name = search6;
                        break;
                    case "status":
                        status = Boolean.getBoolean(search6);
                        break;
                    case "template1":
                        template1 = search6;
                        break;
                    case "diskon":
                        try {
                            diskon = Integer.parseInt(search6);
                        } catch (Exception exception) {
                            diskon = null;
                        }
                        break;
                    case "tanggal":
                        tanggalAwal = tanggalAwalInput;
                        tanggalAkhir = tanggalAkhirInput;
                        break;
                    case "harga":
                        try {
                            harga = new BigDecimal(search6);
                        } catch (Exception exception) {
                            harga = null;
                        }
                        break;
                }
            }
            if (filter7.isBlank()) {
            } else {
                switch (filter7) {
                    case "kode":
                        try {
                            kode = search7;
                        } catch (Exception exception) {
                            kode = null;
                        }
                        break;
                    case "name":
                        name = search7;
                        break;
                    case "status":
                        status = Boolean.getBoolean(search7);
                        break;
                    case "template1":
                        template1 = search7;
                        break;
                    case "diskon":
                        try {
                            diskon = Integer.parseInt(search7);
                        } catch (Exception exception) {
                            diskon = null;
                        }
                        break;
                    case "tanggal":
                        tanggalAwal = tanggalAwalInput;
                        tanggalAkhir = tanggalAkhirInput;
                        break;
                    case "harga":
                        try {
                            harga = new BigDecimal(search7);
                        } catch (Exception exception) {
                            harga = null;
                        }
                        break;
                }
            }

        Integer totalPage = (int) Math.ceil(((double)template2Repository.countAllBySearch( kode, name, tanggalAwal,tanggalAkhir,harga,diskon,status,template1)) / rowInPage);

        return  totalPage;
    }

    @Override
    public Template2FormDto getTemplate2ById(String kode) {
        Template2FormDto dto = new Template2FormDto();
        Template2 template2 = template2Repository.getTemplate1ById(kode);
        if(template2 != null){
            dto.setKode(template2.getKode());
            dto.setStatus(template2.getStatus());
            dto.setNama(template2.getNama());
            dto.setDiskon(template2.getDiskon());
            dto.setTanggal(template2.getTanggal());
            dto.setHarga(template2.getHarga());
            dto.setKodeTamplate1(template2.getKodeTemplate1());
        }
        return dto;
    }

    @Override
    public List<OptionDTO> filter() {
        OptionDTO dto1 = new OptionDTO();
        OptionDTO dto2 = new OptionDTO();
        OptionDTO dto3 = new OptionDTO();
        OptionDTO dto4 = new OptionDTO();
        OptionDTO dto5 = new OptionDTO();
        OptionDTO dto6 = new OptionDTO();
        OptionDTO dto7 = new OptionDTO();
        List<OptionDTO> dtoList = new LinkedList<>();
        dto4.setText("Template 1");
        dto4.setValue("template1");
        dto1.setText("Kode");
        dto1.setValue("kode");
        dto2.setText("Nama");
        dto2.setValue("name");
        dto5.setText("Tanggal");
        dto5.setValue("tanggal");
        dto6.setText("Harga");
        dto6.setValue("harga");
        dto7.setText("Diskon");
        dto7.setValue("diskon");
        dto3.setText("Status");
        dto3.setValue("status");

        dtoList.add(dto4);
        dtoList.add(dto1);
        dtoList.add(dto2);
        dtoList.add(dto5);
        dtoList.add(dto6);
        dtoList.add(dto7);
        dtoList.add(dto3);
        return dtoList;
    }

    @Override
    public List<OptionDTO> getSearchFilter(String filter) {
        return null;
    }

    @Override
    public void updateInsert(Template2FormDto template2FormDto) {
        Template2 template2 = new Template2();
        template2.setKodeTemplate1(template2FormDto.getKodeTamplate1());
        template2.setKode(template2FormDto.getKode());
        template2.setNama(template2FormDto.getNama());
        template2.setTanggal(template2FormDto.getTanggal());
        template2.setHarga(template2FormDto.getHarga());
        template2.setDiskon(template2FormDto.getDiskon());
        template2.setStatus(template2FormDto.getStatus());
        template2Repository.save(template2);
    }

    @Override
    public void delete(String kode) {
        Template2 template2 = template2Repository.getTemplate1ById(kode);
        template2.setDeleteDate(LocalDate.now());
        template2Repository.save(template2);
    }
}
