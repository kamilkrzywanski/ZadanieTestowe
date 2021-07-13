package com.example.Zadanie11.controler;



import java.util.ArrayList;
import java.util.List;
import com.example.Zadanie11.model.TabelaTestowa;
import com.example.Zadanie11.messages.Response;
import com.example.Zadanie11.service.TabelaTestowaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RestWebController {

    @Autowired
    private TabelaTestowaServiceImpl tabelaTestowaServiceimpl;

    //Pobieranie unikalnych wpisów z AJAX
    @GetMapping(value = "/getUniAjax/{idKolumna}")
    public Response getUniAjax(@PathVariable() Integer idKolumna) {

        Response response = new Response("Done", tabelaTestowaServiceimpl.getAllUniqe(idKolumna));
        return response;
    }

    //Pobieranie zdublowanych wpisów z AJAX
    @GetMapping(value = "/getDubAjax/{idKolumna}")
    public Response getDubAjax(@PathVariable() Integer idKolumna) {

        Response response = new Response("Done", tabelaTestowaServiceimpl.getAllDuplicate(idKolumna));
        return response;
    }
}