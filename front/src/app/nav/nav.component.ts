import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthserviceService } from '../authservice.service';
import { TestServiceService } from '../test-service.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})

export class NavComponent implements OnInit {

  constructor(private authservice: AuthserviceService,private router:Router,private testService:TestServiceService) { }

  ngOnInit(): void {
  }
  logout() {
    this.authservice.loggedIn = false;
    this.testService.fname="";
    this.router.navigate(['signin'])
    
    
  }

}
