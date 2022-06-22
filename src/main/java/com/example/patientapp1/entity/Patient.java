package com.example.patientapp1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "patients")
public class Patient {
   @org.springframework.data.annotation.Id
   private String Id;
   @Field(value = "patientNumber")
   private String patientNumber;
   @Field(value = "isAnOutPatient")
   private Double isAnOutPatient;
   @Field(value = "fullNames")
   private String fullNames;
   @Field(value = "emailAddress")
   private String emailAddress;
   @Field(value = "contactPhoneNumber")
   private String contactPhoneNumber;
   @Field(value = "dateOfBirth")
   @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
   private LocalDate dateOfBirth;

}
