import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReservationTypComponent } from './reservation-typ.component';

describe('ReservationTypComponent', () => {
  let component: ReservationTypComponent;
  let fixture: ComponentFixture<ReservationTypComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReservationTypComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReservationTypComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
