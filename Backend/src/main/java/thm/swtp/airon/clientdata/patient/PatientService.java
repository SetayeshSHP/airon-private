package thm.swtp.airon.clientdata.patient;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thm.swtp.airon.clientdata.patient.model.Patient;

import java.util.List;
import java.util.Optional;

/** Represent an  Patient-Service for the Methods  of Patients Informations
 * @author  Malek Alshweiki
 * @version 1.0
 * @since 1.0
 */

@Service
@RequiredArgsConstructor
public class PatientService {
    final private  PatientRepository patientRepository;

    /**
     *this method shows how to get all Patients from the Database
     */

    public  List<Patient> getAllPatienten(){
        return patientRepository.findAll();
    }

    /**
     *this method shows how to add a new Patient in the Database
     */

    public Patient addNewPatient(Patient patient) {

        Optional<Patient> patientOptional = patientRepository.findPatientByInpId(patient.getInpId());

        if (patientOptional.isPresent()) {
            throw new IllegalStateException("Der eingegebene ID existiert");
        }
        patientRepository.save(patient);
        return patient;
    }

    /**
     *this method shows how to make changes on a Patient from the Database
     */

    public Patient updatePatient(Patient patient) {
        patientRepository.save(patient);

        return  patient;
    }

    /**
     *this method shows how to delete a Patient from the Database
     */

    public  void deletePatient(Long id){
        patientRepository.deleteById(id);

    }
}

