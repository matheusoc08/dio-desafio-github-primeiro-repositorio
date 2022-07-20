import { Component, OnInit } from '@angular/core';
import { Anime } from '../anime-info/anime';

@Component({
  selector: 'app-anime-home',
  templateUrl: './anime-home.component.html',
  styleUrls: ['./anime-home.component.css']
})
export class AnimeHomeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  animeList?: Anime[] = [
    {id: 1,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/manga/2/193111.webp?s=4b286f09b20ca50e26c63a145e200819',  name: 'Isekai Yakkyoku', gender: 'Fantasy', releaseYear: 2022, numberOfEpisodes: 12, dayOfExhibition: 'sunday', description: '', animeStatus: 'Ongoing', watchingStatus: ''},
    {id: 2,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1349/124349.webp?s=81730f45c02d0b546deed1e678e2b8d5',  name: 'Yurei Deco', gender: 'Mystery', releaseYear: 2022, numberOfEpisodes: 12, dayOfExhibition: 'sunday', description: '', animeStatus: 'Ongoing', watchingStatus: ''},
    {id: 3,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1010/124180.webp?s=4c2823f4f413a43f0b57ff024255e884',  name: 'Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e', gender: 'Drama', releaseYear: 2022, numberOfEpisodes: 13, dayOfExhibition: 'monday', description: '', animeStatus: 'Ongoing', watchingStatus: ''},
    {id: 4,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1724/120368.webp?s=e6c3851e6ca3760ed89a01e891507742',  name: 'Tensei Kenja no Isekai Life: Dai-2 no Shokugyou wo Ete', gender: 'Action', releaseYear: 2022, numberOfEpisodes: 12, dayOfExhibition: 'monday', description: '', animeStatus: 'Ongoing', watchingStatus: ''},
    {id: 5,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1530/120110.webp?s=dbc593cefee84f9a614208e3b2a893e1',  name: 'Overlord IV', gender: 'Action', releaseYear: 2022, numberOfEpisodes: 13, dayOfExhibition: 'tuesday', description: '', animeStatus: 'Ongoing', watchingStatus: ''},
    {id: 6,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1606/121831.webp?s=fea8470f952ed60b6b4560f17f6d2a19',  name: 'Isekai Meikyuu de Harem wo', gender: 'Harem', releaseYear: 2022, numberOfEpisodes: 12, dayOfExhibition: 'wednesday', description: '', animeStatus: 'Ongoing', watchingStatus: ''},
    {id: 7,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1045/124347.webp?s=d3683b07f28f51d090f3dc110bae4d51',  name: 'Isekai Ojisan', gender: 'Comedy', releaseYear: 2022, numberOfEpisodes: 12, dayOfExhibition: 'wednesday', description: '', animeStatus: 'Ongoing', watchingStatus: ''},
    {id: 8,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1864/122519.webp?s=877843fc73b17536e51ea4ec9eff3823',  name: 'Made in Abyss', gender: 'Adventure', releaseYear: 2022, numberOfEpisodes: 12, dayOfExhibition: 'wednesday', description: '', animeStatus: 'Ongoing', watchingStatus: ''},
    {id: 9,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1462/124919.webp?s=d35130dd41f47619b058c18e387a1920',  name: 'Hoshi no Samidare', gender: 'Action', releaseYear: 2022, numberOfEpisodes: 12, dayOfExhibition: 'friday', description: '', animeStatus: 'Ongoing', watchingStatus: ''},
    {id: 10,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1083/124088.webp?s=b0adbc5bda4eee7425d109df5ff643b0',  name: 'Kami Kuzu☆Idol', gender: 'Comedy', releaseYear: 2022, numberOfEpisodes: 10, dayOfExhibition: 'friday', description: '', animeStatus: 'Ongoing', watchingStatus: ''},
    {id: 11,coverImg: 'https://cdn.myanimelist.net/r/100x140/images/anime/1392/124401.webp?s=dad926b5844936fedf29c505ab4401f0',  name: 'Lycoris Recoil', gender: 'Action', releaseYear: 2022, numberOfEpisodes: 13, dayOfExhibition: 'saturday', description: '', animeStatus: 'Ongoing', watchingStatus: ''}
    
  ];

  showDay(){

    
    
  }

}
