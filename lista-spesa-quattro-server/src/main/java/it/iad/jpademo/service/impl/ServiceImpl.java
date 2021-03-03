package it.iad.jpademo.service.impl;

import it.iad.jpademo.model.Prodotto;
import it.iad.jpademo.repository.ProdottoRepository;
import it.iad.jpademo.service.SpesaService;
import it.iad.prodottoDto.RequestDto;
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
       
        
        }
        
        

    @Override
    public void cancellaLista() {
        prodottoRepository.deleteAll();
    }

}
