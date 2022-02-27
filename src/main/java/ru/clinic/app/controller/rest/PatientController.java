package ru.clinic.app.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.clinic.app.dto.MedicalHistoryDto;
import ru.clinic.app.dto.PatientDto;
import ru.clinic.app.service.MedicalHistoryService;
import ru.clinic.app.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private final PatientService service;

    @Autowired
    public PatientController(PatientService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PatientDto> save(@RequestBody PatientDto patientDto) {
        return ResponseEntity.ok(service.save(patientDto));
    }

    @GetMapping
    public ResponseEntity<PatientDto> get(@RequestParam String name) {
        return ResponseEntity.ok(service.findByName(name));
    }
}