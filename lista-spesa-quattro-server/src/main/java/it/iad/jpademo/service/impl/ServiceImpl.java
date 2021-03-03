package it.iad.jpademo.service.impl;

import it.iad.jpademo.model.Prodotto;
import it.iad.jpademo.prodottoDto.RequestDto;
import it.iad.jpademo.prodottoDto.ResponseDto;
import it.iad.jpademo.repository.ProdottoRepository;
import it.iad.jpademo.service.SpesaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements SpesaService {

    @Autowired
    ProdottoRepository prodottoRepository;

    @Override
    public ResponseDto aggiungiProdotto(RequestDto dto) {
        Prodotto p = new Prodotto(dto.getNome());
        prodottoRepository.save(p);
        System.out.println("Siamo nel service");
        List<Prodotto> listaProdotti = prodottoRepository.findAll();
        ResponseDto dtorit = new ResponseDto(listaProdotti);
        return dtorit;

    }

    @Override
    public ResponseDto cancellaLista() {
        prodottoRepository.deleteAll();
        System.out.println("Siamo nel service");
        List<Prodotto> listaProdotti = listaCompleta();
        ResponseDto dtorit = new ResponseDto(listaProdotti);
        return dtorit;

    }

    @Override
    public List<Prodotto> listaCompleta() {
        List<Prodotto> lp = prodottoRepository.findAll();
        return lp;
    }

}
