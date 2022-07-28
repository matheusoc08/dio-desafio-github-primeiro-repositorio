import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders} from "@angular/common/http"
import { Book } from "./model/book";

@Injectable()
export class BooksService{
    private url = 'https://sheet.best/api/sheets/4d89ed9c-5a80-46d6-94ee-ccd748dcb924';
    httpOptions = {
        Headers: new HttpHeaders({"content-type": "application/json"})
    }

    constructor(private http: HttpClient){}

    getBook(){
        return this.http.get(this.url);
    }
    

}