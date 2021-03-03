package it.iad.jpademo.controller;

import it.iad.jpademo.model.Prodotto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.iad.jpademo.service.SpesaService;
import it.iad.prodottoDto.RequestDto;
import it.iad.prodottoDto.ResponseDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin("*")
@RestController
public class ProdottoController {

    @Autowired
    private SpesaService spesaService;

    @RequestMapping("/aggiungi")
    @ResponseBody
    public void aggiungi(@RequestBody RequestDto dto) {
        spesaService.aggiungiProdotto(dto);
        System.out.println("Siamo nel controller");
    }
@RequestMapping("/aggiungi")
    @ResponseBody
    public void cancellaLista(@RequestBody RequestDto dto) {
        spesaService.cancellaLista();
        System.out.println("Siamo nel controller");

    }
}
