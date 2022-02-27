package ru.clinic.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.clinic.app.model.Patient;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Long, Patient> {

    Patient findAllBy(Long id);

    Patient findByName(String name);

    List<Patient> getAll();

    Patient save(Patient patient);

    void update(Patient patient);

    void deleteById(Long id);

}
