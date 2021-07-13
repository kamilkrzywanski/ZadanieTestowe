package com.example.Zadanie11.repository;

import com.example.Zadanie11.model.TabelaTestowa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.Entity;
import java.util.List;

public interface TabelaTestowaRepository extends JpaRepository<TabelaTestowa, Integer>  {

    /// zapytania zwracające zduplikowane dla kolumn 1-4 tabeli testowej

    @Query(value = "SELECT DISTINCT a.*\n" +
            "FROM tabela_testowa a\n" +
            "JOIN tabela_testowa b\n" +
            "ON a.kolumna1 = b.kolumna1\n" +
            "AND a.kolumna1 = b.kolumna1\n" +
            "AND a.id != b.id", nativeQuery = true)
    List<TabelaTestowa> getAllDuplicateK1();

    @Query(value = "SELECT DISTINCT a.*\n" +
            "FROM tabela_testowa a\n" +
            "JOIN tabela_testowa b\n" +
            "ON a.kolumna2 = b.kolumna2\n" +
            "AND a.kolumna2 = b.kolumna2\n" +
            "AND a.id != b.id", nativeQuery = true)
    List<TabelaTestowa> getAllDuplicateK2();

    @Query(value = "SELECT DISTINCT a.*\n" +
            "FROM tabela_testowa a\n" +
            "JOIN tabela_testowa b\n" +
            "ON a.kolumna3 = b.kolumna3\n" +
            "AND a.kolumna3 = b.kolumna3\n" +
            "AND a.id != b.id", nativeQuery = true)
    List<TabelaTestowa> getAllDuplicateK3();

    @Query(value = "SELECT DISTINCT a.*\n" +
            "FROM tabela_testowa a\n" +
            "JOIN tabela_testowa b\n" +
            "ON a.kolumna4 = b.kolumna4\n" +
            "AND a.kolumna4 = b.kolumna4\n" +
            "AND a.id != b.id", nativeQuery = true)
    List<TabelaTestowa> getAllDuplicateK4();


    /// zapytania zwracające unikalne wiersze dla kolumn 1-4 tabeli testowej

    @Query(value = "SELECT * FROM tabela_testowa t1\n" +
            "LEFT JOIN tabela_testowa t2 \n" +
            "ON t1.kolumna1 = t2.kolumna1 \n" +
            "AND t1.id != t2.id\n" +
            "WHERE t2.id is  null", nativeQuery = true)
    List<TabelaTestowa> getAllUniqueK1();

    @Query(value = "SELECT * FROM tabela_testowa t1\n" +
            "LEFT JOIN tabela_testowa t2 \n" +
            "ON t1.kolumna2 = t2.kolumna2 \n" +
            "AND t1.id != t2.id\n" +
            "WHERE t2.id is  null", nativeQuery = true)
    List<TabelaTestowa> getAllUniqueK2();

    @Query(value = "SELECT * FROM tabela_testowa t1\n" +
            "LEFT JOIN tabela_testowa t2 \n" +
            "ON t1.kolumna3 = t2.kolumna3 \n" +
            "AND t1.id != t2.id\n" +
            "WHERE t2.id is  null", nativeQuery = true)
    List<TabelaTestowa> getAllUniqueK3();

    @Query(value = "SELECT * FROM tabela_testowa t1\n" +
            "LEFT JOIN tabela_testowa t2 \n" +
            "ON t1.kolumna4 = t2.kolumna4 \n" +
            "AND t1.id != t2.id\n" +
            "WHERE t2.id is  null", nativeQuery = true)
    List<TabelaTestowa> getAllUniqueK4();
}
