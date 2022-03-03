package liga.medical.medicalmonitoring.core.controller.rest;

import liga.medical.medicalmonitoring.api.PatientService;
import liga.medical.medicalmonitoring.dto.PatientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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