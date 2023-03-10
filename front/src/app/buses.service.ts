import { Time } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Buses } from './buses';

@Injectable({
  providedIn: 'root'
})
export class BusesService {
  busId!:number;
  busName!:String;
  busNumber!:String;
  busStartTime!:Time;
  busEndTime!:Time;
  busFair!:String;
  busFrom!:String;
  busTo!:String;
  travelTime!: Time;
    baseURL = "http://localhost:1228/buses"
  constructor(private httpClient: HttpClient) { }
  getBusesList() {
    return this.httpClient.get<Buses[]>(`${this.baseURL}/get`);
  }
  getBusesByIdList(busId: any) {
    return this.httpClient.get<Buses[]>(`${this.baseURL}/${busId}`);
  }
  getBusesRouteList(busFrom: String, busTo: String) {
    console.log("busfrom = ", busFrom, "busTo = ", busTo)
    return this.httpClient.get<Buses[]>(`${this.baseURL}/getbus/${busFrom}/${busTo}`);
  }
}
