package com.example.patientapp1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {
    private String patientNumber;
    private Double isAnOutPatient;
    private String fullNames;
    private String emailAddress;
    private String contactPhoneNumber;
    private LocalDate dateOfBirth;
}
