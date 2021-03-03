package it.iad.jpademo.service;

import it.iad.jpademo.prodottoDto.RequestDto;

public interface SpesaService {

    void aggiungiProdotto(RequestDto dto);

    void cancellaLista();

}
