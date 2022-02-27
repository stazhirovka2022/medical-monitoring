package ru.clinic.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.clinic.app.dto.PatientDto;
import ru.clinic.app.model.Patient;

@Repository
public interface PatientDtoRepository extends JpaRepository<Long, PatientDto> {

    void save(Patient patient);

}
