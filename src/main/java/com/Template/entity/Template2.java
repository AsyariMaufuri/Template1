package com.Template.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Template_2")
public class Template2 {
    @Id
    @Column(name = "Kode")
    private String kode;

    @Column(name = "Nama",nullable = false)
    private String nama;

    @Column(name = "Tanggal")
    private LocalDate tanggal;

    @Column(name = "Harga")
    private BigDecimal harga;

    @Column(name = "Diskon")
    private Integer diskon;

    @Column(name = "Status")
    private Boolean status;

    @Column(name = "DeleteDate")
    private LocalDate deleteDate;

    @Column(name = "KodeTemplate_1")
    private String kodeTemplate1;

    @ManyToOne
    @JoinColumn(name = "Kode", insertable = false, updatable = false)
    private Template1 template1;
}
