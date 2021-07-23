import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees: Employee[];
  constructor() { }

  ngOnInit(): void {

    this.employees = [
      {
        "id": 1,
        "firstName": "yash",
        "lastName": "R",
        "email": "a.com"
      },
      {
        "id": 2,
        "firstName": "Ram",
        "lastName": "P",
        "email": "b.com"
      }
    ];

  }

}
