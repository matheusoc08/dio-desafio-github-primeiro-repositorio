import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

export type ApiResponse = {
  info: {},
  results: {}
}

@Injectable({
  providedIn: 'root'
})
export class ListService {
  apiUrl = 'https://rickandmortyapi.com/api/character';
  // apiUrl = 'https://pokeapi.co/api/v2/pokemon?limit=100&offset=200';

  constructor(private httpClient: HttpClient) { }

  getList(): Observable<any>{
    return this.httpClient.get<any>(this.apiUrl);
  }


}
