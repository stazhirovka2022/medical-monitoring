package liga.medical.medicalmonitoring.api;

import liga.medical.medicalmonitoring.dto.PatientDto;

public interface PatientService {

    PatientDto findByName(String name);

    PatientDto save(PatientDto patientDto);

}