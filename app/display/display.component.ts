import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})


export class DisplayComponent implements OnInit {

  constructor(private service:AdminService) { }
  admins:any
  findallMovieData(){
    this.service.findallMovieData()
    .subscribe(response=>{
      this.admins = response;
      console.log(response)
    });
  }

  ngOnInit(): void {
  }

}
