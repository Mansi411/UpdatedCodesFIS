import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerComponent } from './customer/customer.component';
import { DeleteComponent } from './delete/delete.component';
import { DisplayComponent } from './display/display.component';
import { InsertComponent } from './insert/insert.component';
const routes: Routes = [

  {path:'display', component:DisplayComponent},
  {path:'insert', component:InsertComponent},
  {path:'delete', component:DeleteComponent},
  {path:'displaycustomer', component:CustomerComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
