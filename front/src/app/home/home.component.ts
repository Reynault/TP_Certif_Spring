import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Result} from '../shared/interfaces/result-interface';
import {OperationsService} from '../shared/services/operations-service';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  private _form: FormGroup;
  private _result: string;

  constructor(private _operationService: OperationsService) {
  }

  ngOnInit(): void {
    this._form = this.buildForm();
    this._result = "the result will be shown here...";
  }

  sendRequest() {
    if (this.form.valid) {
      let a = this.form.get('a').value;
      let b = this.form.get('b').value;
      let obs: Observable<Result>;
      switch (this.form.get('operator').value) {
        case "1":
          obs = this._operationService.sendAddRequest(a, b);
          break;
        case "2":
          obs = this._operationService.sendSubstractRequest(a, b);
          break;
        case "3":
          obs = this._operationService.sendDivideRequest(a, b);
          break;
        case "4":
          obs = this._operationService.sendMultiplyRequest(a, b);
          break;
        default:
          obs = this._operationService.sendAddRequest(a, b);
          break;
      }
      obs.subscribe(
        data => {
          if (data.c !== undefined) {
            this._result = data.c;
          } else if (data.error !== undefined) {
            this._result = data.error;
          }
        },
        error => {
          if(error.status === 0){
            this._result = "Can't connect to the server";
          }else{
            this._result = error.error.error;
          }
        }
      );
    }
  }

  buildForm() {
    return new FormGroup({
      a: new FormControl('', Validators.compose(
        [Validators.required, Validators.max(99999999), Validators.pattern(/\d+/)])),
      b: new FormControl('', Validators.compose(
        [Validators.required, Validators.max(99999999), Validators.pattern(/\d+/)])),
      operator: new FormControl('', Validators.compose(
        [Validators.required])),
    });
  }

  get result(): string {
    return this._result;
  }

  set result(value: string) {
    this._result = value;
  }

  get form(): FormGroup {
    return this._form;
  }

  set form(value: FormGroup) {
    this._form = value;
  }
}
