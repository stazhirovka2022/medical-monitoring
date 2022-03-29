package liga.medical.medicalmonitoring.core.service;

import liga.medical.medicalmonitoring.core.mapper.PatientMapper;
import liga.medical.medicalmonitoring.core.model.Patient;
import liga.medical.medicalmonitoring.dto.PatientDto;
import org.springframework.stereotype.Service;
import liga.medical.medicalmonitoring.core.repository.PatientRepository;

import java.util.List;

@Service
public class PatientServiceImpl {

    private final PatientRepository repository;
    private final PatientMapper mapper;

    public PatientServiceImpl(PatientRepository repository, PatientMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public PatientDto save(PatientDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public List<Patient> findAll() {
        return repository.findAll();
    }

}
