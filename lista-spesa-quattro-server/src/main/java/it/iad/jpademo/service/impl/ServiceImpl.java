package it.iad.jpademo.service.impl;

import it.iad.jpademo.model.Prodotto;
import it.iad.jpademo.prodottoDto.RequestDto;
import it.iad.jpademo.repository.ProdottoRepository;
import it.iad.jpademo.service.SpesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements SpesaService {

    @Autowired
    ProdottoRepository prodottoRepository;

    @Override
    public void aggiungiProdotto(RequestDto dto) {
        Prodotto p = new Prodotto(dto.getNome());
        prodottoRepository.save(p);
        System.out.println("Siamo nel service");

    }

    @Override
    public void cancellaLista() {
        prodottoRepository.deleteAll();
        System.out.println("Siamo nel service");

    }

}
