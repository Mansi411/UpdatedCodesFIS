import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http:HttpClient) { }

  findallMovieData(){
    return this.http.get("http://localhost:8081/admin/display")
  }

  insertmoviedata(admin:any){
    this.http.post("http://localhost:8081/admin/add",admin)
    .subscribe(
      response => {
        console.log(response);
      },
      error => {
        console.log(error);
      }
    );
  }

  deleteData(movie_id:number){
    this.http.delete("http://localhost:8081/admin/delete/"+movie_id)
    .subscribe(
      response => {
        console.log(response);
      },
      error => {
        console.log(error);
      }
    );
  }

  displaycustomerdata(){
    return this.http.get("http://localhost:8765/videoadmin/admin/customer/display")
  }
}
