import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { AnimeModel } from '../model/anime.model';

@Component({
  selector: 'app-anime-form',
  templateUrl: './anime-form.component.html',
  styleUrls: ['./anime-form.component.css']
})
export class AnimeFormComponent implements OnInit {

  animeList?: Array<AnimeModel>;

  constructor() { }

  ngOnInit(): void {
  }

  saveAnime(): Observable<AnimeModel>{
    this.animeList?.push
  }

}
