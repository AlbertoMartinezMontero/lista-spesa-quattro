package it.iad.jpademo.service;

import it.iad.jpademo.model.Prodotto;
import it.iad.jpademo.prodottoDto.RequestDto;
import it.iad.jpademo.prodottoDto.ResponseDto;
import java.util.List;

public interface SpesaService {

   ResponseDto aggiungiProdotto(RequestDto dto);

    ResponseDto cancellaLista();
    public List<Prodotto> listaCompleta();

}
