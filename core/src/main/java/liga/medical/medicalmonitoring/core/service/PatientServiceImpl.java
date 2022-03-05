package liga.medical.medicalmonitoring.core.service;

import liga.medical.medicalmonitoring.core.mapper.PatientMapper;
import liga.medical.medicalmonitoring.dto.PatientDto;
import org.springframework.stereotype.Service;
import liga.medical.medicalmonitoring.core.repository.PatientDtoRepository;
import liga.medical.medicalmonitoring.core.repository.PatientRepository;

@Service
public class PatientServiceImpl {

    private final PatientRepository repository;
    private final PatientDtoRepository dtoRepository;
    private final PatientMapper mapper;

    public PatientServiceImpl(PatientRepository repository, PatientDtoRepository dtoRepository, PatientMapper mapper) {
        this.repository = repository;
        this.dtoRepository = dtoRepository;
        this.mapper = mapper;
    }

    public PatientDto save(PatientDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

}
