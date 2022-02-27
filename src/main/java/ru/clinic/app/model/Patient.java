package ru.clinic.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.OffsetDateTime;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="gender")
    private String gender;

    @Column(name="age")
    private Integer age;

    @Column(name="address")
    private String address;

    @Column(name="birthday_dt")
    private OffsetDateTime birthdayDt;

    @Column(name="birth_place")
    private String birthPlace;

    @Column(name="registration")
    private String registration;

    @Column(name="passport_series")
    private String passportSeries;

    @Column(name="passport_number")
    private String passportNumber;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="another_document")
    private String anotherDocument;

    @Column(name="medical_history")
    private MedicalHistory medicalHistory;


}

