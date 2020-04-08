import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrls: ['./address.component.css']
})
export class AddressComponent implements OnInit {

  color = 'accent';
  checked = false;
  disabled = false;

  constructor(private router: Router) { }

  ngOnInit() {
  }

  previousPageOpen() {
    this.router.navigate(['/typ']);
  }

  nextPageOpen() {
    this.router.navigate(['/date']);
  }
}
