import { Component, OnInit } from '@angular/core';

export interface Reservation {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
  reservations: Reservation[] = [
    {value: 'restaurant-0', viewValue: 'Restaurant'},
    {value: 'werkstatt-1', viewValue: 'Werkstatt'},
    {value: 'berber-2', viewValue: 'Berber'}
  ];

  constructor() { }

  ngOnInit() {
  }

}
