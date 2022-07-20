import { Component, OnInit } from '@angular/core';
import { AnimeModel } from '../model/anime.model';

@Component({
  selector: 'app-anime-index',
  templateUrl: './anime-index.component.html',
  styleUrls: ['./anime-index.component.css']
})
export class AnimeIndexComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  animeList?: AnimeModel[] = [
    {id: 1,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1981/113348.webp?s=54d2ce27faddb4744b1e50ea379c8d4c', name: 'Odd Taxi', gender: 'Drama', releaseYear: 2020, description: 'Bonzao', animeStatus: 'Finished'},
    {id: 2,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1530/120110.webp?s=dbc593cefee84f9a614208e3b2a893e1', name: 'Overlord IV', gender: 'Action', releaseYear: 2022, description: 'Bonzao', animeStatus: 'Watching'},
    {id: 3,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1864/122519.webp?s=877843fc73b17536e51ea4ec9eff3823', name: 'Made in Abyss 2S', gender: 'Adventure', releaseYear: 2022, description: 'Bonzao', animeStatus: 'Watching'}
  ]

}
