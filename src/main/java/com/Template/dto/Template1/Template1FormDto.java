package com.Template.dto.Template1;

import com.Template.entity.Template1;
import com.Template.entity.Template2;
import lombok.Data;

import java.util.List;

@Data
public class Template1FormDto {
    private String kode;

    private String nama;

    private Boolean status;

    private List<Template2> template2List;
}
