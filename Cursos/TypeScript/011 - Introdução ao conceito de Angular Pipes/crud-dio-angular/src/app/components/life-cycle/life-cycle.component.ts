import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, Input, OnChanges, OnDestroy, OnInit } from '@angular/core';

@Component({
  selector: 'app-life-cycle',
  templateUrl: './life-cycle.component.html',
  styleUrls: ['./life-cycle.component.css']
})
export class LifeCycleComponent implements OnInit, OnChanges, DoCheck, AfterContentInit,AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {
  @Input() number = 10;

  constructor() {
    console.log('Chamou o construtor');
  }

  ngOnChanges(){
    console.log('Chamou OnChanges');
  }

  ngOnInit(): void {
    console.log('Chamou o OnInit');
  }

  ngDoCheck(){
    console.log('Chamou o DoCheck');
  }
  ngAfterContentInit(){
    console.log('Chamou o AfterContentInit');
  }

  ngAfterContentChecked(): void {
    console.log('Chamou o AfterCOntentChecked');
  }

  ngAfterViewInit(){
    console.log('Chamou o AfterViewInit');
  }

  ngAfterViewChecked(): void {
    console.log('Chamou o AfterViewCheckec');
  }

  ngOnDestroy() {
    console.log('Chamou o OnDestroy');
  }
  

}
