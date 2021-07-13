package com.example.Zadanie11.service;

import com.example.Zadanie11.model.TabelaTestowa;
import com.example.Zadanie11.repository.TabelaTestowaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TabelaTestowaServiceImpl implements  TabelaTestowaService {

    @Autowired
    TabelaTestowaRepository tabelaTestowaRepository;

    @Override
    public List<TabelaTestowa> getAll() {return tabelaTestowaRepository.findAll();};

    @Override
    public List<TabelaTestowa> getAllDuplicate(Integer nrTabeli)
    {
    if(nrTabeli == 1)
        {
            return tabelaTestowaRepository.getAllDuplicateK1();
        }

    if(nrTabeli == 2)
    {
        return tabelaTestowaRepository.getAllDuplicateK2();
    }

    if(nrTabeli == 3)
    {
        return tabelaTestowaRepository.getAllDuplicateK3();
    }

    if(nrTabeli == 4)
    {
        return tabelaTestowaRepository.getAllDuplicateK4();
    }
    else
    {
        return tabelaTestowaRepository.findAll();
    }

    }

    @Override
    public List<TabelaTestowa> getAllUniqe(Integer nrTabeli)
    {
        if(nrTabeli == 1)
        {
            return tabelaTestowaRepository.getAllUniqueK1();
        }

        if(nrTabeli == 2)
        {
            return tabelaTestowaRepository.getAllUniqueK2();
        }

        if(nrTabeli == 3)
        {
            return tabelaTestowaRepository.getAllUniqueK3();
        }

        if(nrTabeli == 4)
        {
            return tabelaTestowaRepository.getAllUniqueK4();
        }
        else
        {
            return tabelaTestowaRepository.findAll();
        }

    }


}
