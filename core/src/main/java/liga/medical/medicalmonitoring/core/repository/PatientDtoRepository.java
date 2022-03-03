package liga.medical.medicalmonitoring.core.repository;

import liga.medical.medicalmonitoring.dto.PatientDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import liga.medical.medicalmonitoring.core.model.Patient;

@Repository
public interface PatientDtoRepository extends JpaRepository<Long, PatientDto> {

    void save(Patient patient);

}
