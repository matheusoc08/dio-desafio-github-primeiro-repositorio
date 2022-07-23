import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  apiUrl = 'https://sheet.best/api/sheets/6458bbbd-34b0-4eb9-905c-29b24fc44582';
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
      // 'Token': '123321'
    })
  }

  constructor(private httpClient: HttpClient) { }

  getUser(id: string): Observable<User[]>{
    return this.httpClient.get<User[]>(`${this.apiUrl}/id/${id}`);
  }

  getUsers(): Observable<User[]>{
    return this.httpClient.get<User[]>(this.apiUrl);
  }

  postUser(user: User): Observable<User>{
    return this.httpClient.post<User>(this.apiUrl, user, this.httpOptions);
  }

  deleteUser(id: number): Observable<User>{
    return this.httpClient.delete<User>(`${this.apiUrl}/id/${id}`, this.httpOptions);
  }

  updateUser(id: string, user: User): Observable<User>{
    return this.httpClient.put<User>(`${this.apiUrl}/id/${id}`, user, this.httpOptions);
  }
}
