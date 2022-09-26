import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { AdminService } from '../admin.service';


@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent implements OnInit {

  constructor(private service:AdminService) { }
  mid:any;
  mname:any;
  mreleaseyear:any;
  mlanguage:any;
  mratings:any;
  mduration:any;
  mtype:any;
  mdirectorname:any;
  mlead1:any;
  mlead2:any;
  ngOnInit(): void {
  }
  insertData(){
    let admin : Admin = {
      "movie_id":this.mid,
      "movie_name":this.mname,
      "release_year":this.mreleaseyear,
      "language":this.mlanguage,
      "rating":this.mratings,
      "duration_in_minutes":this.mduration,
      "movie_type":this.mtype,
      "director_name":this.mdirectorname,
      "lead_actor_name1":this.mlead1,
      "lead_actor_name2":this.mlead2
    }
    this.service.insertmoviedata(admin);
  }
}
