
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { SellRequest } from './sellrequest';


@Injectable()   

export class sellRequestService {

    
    constructor(private http:HttpClient){

    }
    sendToServer(url,user:SellRequest) {
        
        return this.http.post(url,user)
        } 
             
        }