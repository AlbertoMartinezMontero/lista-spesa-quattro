package it.iad.jpademo.controller;

import it.iad.jpademo.model.Prodotto;
import it.iad.jpademo.prodottoDto.RequestDto;
import it.iad.jpademo.prodottoDto.ResponseDto;
import it.iad.jpademo.repository.ProdottoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.iad.jpademo.service.SpesaService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin("*")
@RestController
public class ProdottoController {

    @Autowired

    private SpesaService spesaService;

    @RequestMapping("/aggiungi")
    @ResponseBody

    public ResponseDto aggiungi(@RequestBody RequestDto dto) {

        System.out.println("Siamo in aggiungi " + dto);
        spesaService.aggiungiProdotto(dto);
        System.out.println("Siamo nel controller");
        ResponseDto dtod = new ResponseDto(spesaService.listaCompleta());
        return dtod;

    }

    @RequestMapping("/cancellaLista")
    @ResponseBody
    public ResponseDto cancellaLista(@RequestBody RequestDto dto) {
        spesaService.cancellaLista();
        System.out.println("Siamo nel controller");
        ResponseDto dtod = new ResponseDto(spesaService.listaCompleta());
        return dtod;

    }
}
