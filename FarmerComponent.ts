
import { Component } from '@angular/core';
import { FarmerService } from 'FarmerService';
import { Farmer } from 'Farmer';

@Component({
selector :'add-farmer',
templateUrl:'./farmer-component.html',
//styleUrls: ['../css/mdb.min.css', '../css/bootstrap.min.css']
})

export class FarmerComponent{
    farmer:Farmer = new Farmer();
    response: string;
    constructor(private fs: FarmerService){

    }
    keyPress(event: any) {
        const pattern = /[0-9\+\-\ ]/;
        let inputChar = String.fromCharCode(event.charCode);
        if (event.keyCode != 8 && !pattern.test(inputChar)) {
          event.preventDefault();
        }
      }
   add(mform){
        this.fs.sendToServer(this.farmer).subscribe(
            data => {
                //Take the response from server and storing in string variable
                this.response = data['status'];
            }
        );
    } 

   

}