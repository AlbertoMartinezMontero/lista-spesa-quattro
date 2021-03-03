/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad.prodottoDto;

/**
 *
 * @author alber
 */
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
    
    

