package it.iad.jpademo.service;

import it.iad.prodottoDto.RequestDto;
import it.iad.prodottoDto.ResponseDto;

public interface SpesaService {

   void aggiungiProdotto(RequestDto dto);
    void cancellaLista();
    
}
