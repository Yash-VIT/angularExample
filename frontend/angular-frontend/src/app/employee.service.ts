import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  baseUrl = 'http://localhost:8080/api/v1/employees';

  constructor(private httpClient: HttpClient) { }

  getEmployeesList(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(`${this.baseUrl}`);
  }
}

