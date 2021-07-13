package com.example.Zadanie11.service;

import com.example.Zadanie11.model.TabelaTestowa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TabelaTestowaService {

    List<TabelaTestowa> getAll();

    List<TabelaTestowa> getAllDuplicate(Integer nrTabeli);
    List<TabelaTestowa> getAllUniqe(Integer nrTabeli);


}
