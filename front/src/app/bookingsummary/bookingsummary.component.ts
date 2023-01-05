import { Component, OnInit } from '@angular/core';
import { Booking } from '../booking';
import { BookingService } from '../booking.service';
import { Buses } from '../buses';
import { BusesService } from '../buses.service';
import { TestServiceService } from '../test-service.service';

@Component({
  selector: 'app-bookingsummary',
  templateUrl: './bookingsummary.component.html',
  styleUrls: ['./bookingsummary.component.css']
})
export class BookingsummaryComponent implements OnInit {
  filteredBookings: Booking[] = [];
  buses!: Buses[]
  bookings: Booking[] = [];
  toToggle:Boolean=false
  aadh!:number;
  deleteBookings!:Booking[]
  constructor(public bookingService: BookingService, public testService: TestServiceService, public busesService: BusesService) { }
  a = this.testService.aadhar
  ngOnInit(): void {
  }
  btn(){
    this.toToggle=true;
    this.getBookingByUid(this.aadh);
  }
 cancelBooking(){
   for(var i of this.filteredBookings){
     i.ticketStatus="false"
   }
  this.getBookingByUid(this.aadh);   
  //  this.deleteBookingByUid(this.);
   this.btn()
 }
  private getBookingByUid(a: number) {
    this.bookingService.getbookingById(a).subscribe(data => {
      this.filteredBookings = data;
      
    })
  }
  
}
