package com.example.patientapp1.controllers;

import com.example.patientapp1.entity.Patient;
import com.example.patientapp1.services.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    @GetMapping
    public List<Patient> getAll(){
        return patientService.getAllPatients();
    }
}
