package com.Template.dto.Template2;

import com.Template.entity.Template2;
import jakarta.persistence.Column;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class Template2FormDto {

    private String kodeTamplate1;

    private String kode;

    private String nama;

    private LocalDate tanggal;

    private BigDecimal harga;

    private Integer diskon;

    private Boolean status;
}
