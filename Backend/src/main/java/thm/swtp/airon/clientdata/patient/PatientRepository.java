package thm.swtp.airon.clientdata.patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import thm.swtp.airon.clientdata.patient.model.Patient;
import java.util.Optional;

/** Represent an Patient repository for database access for all Patients
 * @author  Malek Alshweiki
 * @version 1.0
 * @since 1.0
 */



public interface PatientRepository extends JpaRepository<Patient,Long> {

    @Query("SELECT p FROM Patient p WHERE p.inpId = ?1")
    Optional<Patient> findPatientByInpId(String inpId);
}


