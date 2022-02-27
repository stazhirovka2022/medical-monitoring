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
public class MedicalHistory {

    @Id
    private Long id;

    @Column(name="patient")
    private Patient patient;

    @Column(name="doc_number")
    private String docNumber;

    @Column(name="create_dttm")
    private OffsetDateTime createDttm;

    @Column(name="modify_dttm")
    private OffsetDateTime modifyDttm;

    @Column(name="doctor")
    private String doctor;

    @Column(name="diagnosis")
    private String diagnosis;

    @Column(name="medical_history")
    private MedicalHistory medicalHistory;

}
