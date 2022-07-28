import { UpperCasePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes-example',
  templateUrl: './pipes-example.component.html',
  styleUrls: ['./pipes-example.component.css']
})
export class PipesExampleComponent implements OnInit {
  number = 0;
  text = 'Hello, World!';
  date = new Date;
  pessoa = {
    nome: 'Ivonaldo',
    idade: 26,
    profissao: 'Instrutor'
  }
  nomes = ['ivonaldo']

  constructor(private upperCasePipe: UpperCasePipe) { }

  ngOnInit(): void {
    this.text = this.upperCasePipe.transform(this.text);
  }

  mudaValor(){
    // this.number = 123456789;
    this.text = 'Novo texto';
  }

  add(text: string){
    this.nomes.push(text);
  }

}
