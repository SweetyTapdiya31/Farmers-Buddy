import { Farmer } from './Farmer';
import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

import { Observable } from 'rxjs';

@Injectable() //Dependency Injection
export class FarmerService{
    //This class will talk to server

    constructor(private http:HttpClient)
    {
            
    }
	 sendToServer(farmer: Farmer){
        //Send data to server in JSON form
        let url = "http://localhost:8181/farmer/add";
        return this.http.post(url, farmer);
    } 
    

}