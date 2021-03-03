import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { RichiestaDto } from './richiesta-dto';
import { RispostaDto } from './risposta-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  lista: String[] = [];
  nome: String = "";

  constructor(private http: HttpClient) { }

  aggiungi() {
    let dto: RichiestaDto = new RichiestaDto();
     dto.nome = this.nome;
     this.lista.push(this.nome)
   
    let oss: Observable<RispostaDto> = this.http.post<RispostaDto>("http://localhost:8080/aggiungi", dto);
    oss.subscribe(s => this.nome = s.nome);
    this.nome=""; 

  }
  
  cancella(lista) {
    let dto: RichiestaDto = new RichiestaDto();
     dto.nome = this.nome;
     this.lista.splice(lista,this.lista.length);
   
    let oss: Observable<RispostaDto> = this.http.post<RispostaDto>("http://localhost:8080/cancella", dto);
    oss.subscribe(s => this.nome = s.nome); 

  }

}
