import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {environment} from '../../../environments/environment';
import {Observable} from 'rxjs';
import {Result} from '../interfaces/result-interface';

@Injectable({
  providedIn: 'root'
})
export class OperationsService{
  private readonly _backendURL: any;

  constructor(private _http: HttpClient){
    this._backendURL = {};

    // build backend base url
    let baseUrl = `${environment.backend.protocol}://${environment.backend.host}`;
    if (environment.backend.port) {
      baseUrl += `:${environment.backend.port}`;
    }

    // build all backend urls
    Object.keys(environment.backend.endpoints).forEach(k => this._backendURL[k] = `${baseUrl}${environment.backend.endpoints[k]}`);

  }

  private getParams(a: number, b: number): HttpParams{
    let params: HttpParams = new HttpParams({
      fromObject: {
        a: `${a}`,
        b: `${b}`,
      }
    });
    return params;
  }

  sendAddRequest(a:number, b:number): Observable<Result>{
    let params: HttpParams = this.getParams(a, b);
    return this._http.get<Result>(this._backendURL.add, {params: params});
  }

  sendDivideRequest(a:number, b:number): Observable<Result>{
    let params: HttpParams = this.getParams(a, b);
    return this._http.get<Result>(this._backendURL.divide, {params: params});
  }

  sendMultiplyRequest(a:number, b:number): Observable<Result>{
    let params: HttpParams = this.getParams(a, b);
    return this._http.get<Result>(this._backendURL.multiply, {params: params});
  }

  sendSubstractRequest(a:number, b:number): Observable<Result>{
    let params: HttpParams = this.getParams(a, b);
    return this._http.get<Result>(this._backendURL.substract, {params: params});
  }
}
