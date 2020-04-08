import { Component, OnInit } from '@angular/core';
import { Reservation } from '../main/main.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-reservation-typ',
  templateUrl: './reservation-typ.component.html',
  styleUrls: ['./reservation-typ.component.css']
})
export class ReservationTypComponent implements OnInit {
  reservations: Reservation[] = [
    {value: 'restaurant-0', viewValue: 'Restaurant'},
    {value: 'werkstatt-1', viewValue: 'Werkstatt'},
    {value: 'berber-2', viewValue: 'Berber'}
  ];
  constructor(private router: Router) { }

  ngOnInit() {
  }

  previousPageOpen() {

  }

  nextPageOpen() {
    this.router.navigate(['/address']);
  }

}
