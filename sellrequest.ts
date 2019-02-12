
import {Component} from '@angular/core'

export class SellRequest{

    constructor(
        public cropType?:string,
        public  cropName?:string,
        public fertilizerType?:string,
        public quantity?:number,
        public priceperquintal?:number,
        public soilpHCertificate?:string,
         ){

         }
}