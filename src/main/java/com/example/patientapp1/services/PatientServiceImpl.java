package com.example.patientapp1.services;

import com.example.patientapp1.entity.Patient;
import com.example.patientapp1.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImpl implements PatientService{
    private PatientRepository patient;

    @Autowired
    public PatientServiceImpl(PatientRepository patient) {
        this.patient = patient;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patient.findAll(Sort.by("fullNames"));
    }
}
