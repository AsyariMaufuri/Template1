package com.Template.repository;

import com.Template.entity.Template1;
import com.Template.entity.Template2;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface Template2Repository extends JpaRepository<Template2, String> {
    @Query("""
        SELECT t2
        FROM Template2 t2
        WHERE
            (:kode IS NULL OR t2.kode = :kode)
            AND (:nama IS NULL OR t2.nama = :nama)
            AND (:status IS NULL OR t2.status = :status)
            AND (:tanggal IS NULL OR t2.tanggal BETWEEN :tanggalAwal AND :tanggalAkhir)
            AND (:harga IS NULL OR t2.harga = :harga)
            AND (:diskon IS NULL OR t2.diskon = :diskon)
            AND t2.deleteDate IS NULL
        """)
    List<Template2> getAllBySearch(Pageable pagination, String kode, String nama, LocalDate tanggalAwal, LocalDate tanggalAkhir, BigDecimal harga, Integer diskon, Boolean status);

    @Query("""
        SELECT COUNT(t2)
        FROM Template2 t2
        WHERE
            (:kode IS NULL OR t2.kode = :kode)
            AND (:nama IS NULL OR t2.nama = :nama)
            AND (:status IS NULL OR t2.status = :status)
            AND (:tanggal IS NULL OR t2.tanggal BETWEEN :tanggalAwal AND :tanggalAkhir)
            AND (:harga IS NULL OR t2.harga = :harga)
            AND (:diskon IS NULL OR t2.diskon = :diskon)
            AND t2.deleteDate IS NULL
        """)
    Integer countAllBySearch(String kode, String nama, LocalDate tanggalAwal, LocalDate tanggalAkhir, BigDecimal harga, Integer diskon, Boolean status);


    @Query("""
        SELECT t2
        FROM Template2 t2
        WHERE t2.kode = :kode
        """)
    Template2 getTemplate1ById(String kode);

}
