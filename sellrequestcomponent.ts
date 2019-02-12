import { Component } from '@angular/core';
import { SellRequest } from './sellrequest';
import { sellRequestService } from './sellRequestService';



@Component({
    selector: 'sellrequest',
    templateUrl: './sellrequest.html'
})

export class sellrequestcomponent {
    user: SellRequest=new SellRequest();
    response: string;

    constructor(private ms: sellRequestService){

    }
    keyPress(event: any) {
        const pattern = /[0-9\+\-\ ]/;
        let inputChar = String.fromCharCode(event.charCode);
        if (event.keyCode != 8 && !pattern.test(inputChar)) {
          event.preventDefault();
        }
      }
   

    store(){
        let url = "http://localhost:8181/farmerCrop/add"
        this.ms.sendToServer(url,this.user).subscribe(data => {
            this.response = data['status'];
    });
}
}
   