import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-reservation-date',
  templateUrl: './reservation-date.component.html',
  styleUrls: ['./reservation-date.component.css']
})
export class ReservationDateComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  previousPageOpen() {
    this.router.navigate(['/address']);
  }

}
