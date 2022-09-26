import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  constructor(private service: AdminService) { }
  customers:any
  displaycustomer(){
    this.service.displaycustomerdata()
      .subscribe(response=>{
        this.customers = response;
        console.log(response)
      });
    }
  
  ngOnInit(): void {
  }

}
