import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
  text = 'Matheus Carvalho';
  imageUrl = 'https://picsum.photos/536/354';
  imageDescription = 'Imagem aleatoria';
  buttonText = 'Bottão Acessível';
  textRed = false;
  textCor = 'text-red';
  bgColor = 'green';
  fontSize = '42px';
  widthImg = 600;
  textInput = '';
  number = 0;
  destroy = false;

  constructor() { }

  ngOnInit(): void {
  }

  retornaNome(){
    return this.text;
  }

  clicou(){
    this.text = 'Roberto';
    console.log('Clicou aqui');
    this.textRed = true;
  }

  apertou(value: any){
    console.log('Digitou: ', value);
  }

  clicouNoFilho(text: any){
    console.log('Teste 1');
    console.log(text);
  }

  incrementa(){
    this.number++;
  }

  destroiComponent(){
    this.destroy = true;
  }

}
