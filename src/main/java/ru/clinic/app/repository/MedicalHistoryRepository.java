package ru.clinic.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.clinic.app.model.MedicalHistory;

import java.util.List;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<Long, MedicalHistory> {

    MedicalHistory findById(Long id);

    MedicalHistory findByName(String name);

    List<MedicalHistory> getAll();

    MedicalHistory save(MedicalHistory medicalHistory);

    void update(MedicalHistory medicalHistory);

    void deleteById(Long id);
}
