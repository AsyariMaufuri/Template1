package com.Template.repository;

import com.Template.entity.Template1;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Template1Repository extends JpaRepository<Template1, String> {
    @Query("""
        SELECT t1
        FROM Template1 t1
        WHERE
            (:kode IS NULL OR t1.kode = :kode)
            AND (:nama IS NULL OR t1.nama = :nama)
            AND (:status IS NULL OR t1.status = :status)
            AND t1.deleteDate IS NULL
        """)
    List<Template1> getAllBySearch(Pageable pagination, String kode, String nama, Boolean status);

    @Query("""
        SELECT COUNT(t1)
        FROM Template1 t1
        WHERE
            (:kode IS NULL OR t1.kode = :kode)
            AND (:nama IS NULL OR t1.nama = :nama)
            AND (:status IS NULL OR t1.status = :status)
            AND t1.deleteDate IS NULL
        """)
    Integer countAllBySearch(String kode, String nama, Boolean status);


    @Query("""
        SELECT t1
        FROM Template1 t1
        WHERE t1.kode = :kode
        """)
    Template1 getTemplate1ById(String kode);

}
