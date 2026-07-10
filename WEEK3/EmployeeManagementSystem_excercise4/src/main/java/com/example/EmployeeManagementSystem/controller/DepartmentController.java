package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){
        Department savedDeparment= departmentService.createDepartment(department);
        return new ResponseEntity<>(savedDeparment, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartment() {
        List<Department> departemnts = departmentService.getAllDepartments();
        return new ResponseEntity<>(departemnts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDeparmentById(@PathVariable Long id) {
        Department department = departmentService.getDepartmentById(id);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable Long id, @RequestBody Department DepartmentDetails) {
        Department updatedDepartment = departmentService.updateDepartment(id, DepartmentDetails);
        return new ResponseEntity<>(updatedDepartment, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
        return new ResponseEntity<>("Department deleted successfully", HttpStatus.OK);
    }

}
