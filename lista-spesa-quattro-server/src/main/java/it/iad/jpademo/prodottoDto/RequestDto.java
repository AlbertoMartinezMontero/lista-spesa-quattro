
package it.iad.jpademo.prodottoDto;

public class RequestDto {

    private String nome;

    public RequestDto() {
    }

    public RequestDto(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "RequestDto{" + "nome=" + nome + '}';
    }

}
