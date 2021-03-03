package it.iad.jpademo.prodottoDto;

import it.iad.jpademo.model.Prodotto;
import java.util.List;

public class ResponseDto {

    List<Prodotto> listaProdotti;

    public ResponseDto() {
    }

    public ResponseDto(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

}
