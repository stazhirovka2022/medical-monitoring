package ru.clinic.app.service;

import org.springframework.stereotype.Service;
import ru.clinic.app.dto.PatientDto;
import ru.clinic.app.repository.PatientDtoRepository;
import ru.clinic.app.repository.PatientRepository;
import ru.clinic.app.utils.PatientMapper;

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

    public PatientDto findByName(String name) {
        return mapper.toDto(repository.findByName(name));
    }
}
