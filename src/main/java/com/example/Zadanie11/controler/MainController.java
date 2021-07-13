package com.example.Zadanie11.controler;

import com.example.Zadanie11.model.TabelaTestowa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.Zadanie11.service.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class MainController {
    @Autowired
    private TabelaTestowaServiceImpl tabelaTestowaServiceimpl;


    // strona główna aplikacji
    @GetMapping({"/"})
    public String indexPage(Model model) {

        model.addAttribute("lista", tabelaTestowaServiceimpl.getAll() );

        return "index";
    }
        //kontroler znajdowania zduplikowanych wierszy dla danej kolumny bez AJAX
    @GetMapping({"/selKolumnaDub/{idKolumna}"})
    public String filterbyKolumnaDub(Model model, @PathVariable() Integer idKolumna) {

       List<TabelaTestowa> tabDup =  tabelaTestowaServiceimpl.getAllDuplicate(idKolumna);
       model.addAttribute("elementy", tabDup);

        return "index";
    }

    //kontroler znajdowania unikalnych wierszy dla danej kolumny bez AJAX
    @GetMapping({"/selKolumnaUni/{idKolumna}"})
    public String filterbyKolumnaUni(Model model, @PathVariable() Integer idKolumna) {

        List<TabelaTestowa> tabUni =  tabelaTestowaServiceimpl.getAllUniqe(idKolumna);
        model.addAttribute("elementy", tabUni);

        return "index";
    }

}
