import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MainComponent } from './main/main.component';
import { AddressComponent } from './address/address.component';
import { ReservationTypComponent } from './reservation-typ/reservation-typ.component';
import { ReservationDateComponent } from './reservation-date/reservation-date.component';


const routes: Routes = [
  { path: '', component: MainComponent },
  { path: 'address', component: AddressComponent},
  { path: 'typ', component: ReservationTypComponent},
  { path: 'date', component: ReservationDateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
