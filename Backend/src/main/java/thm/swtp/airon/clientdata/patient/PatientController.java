package thm.swtp.airon.clientdata.patient;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thm.swtp.airon.clientdata.analysis.model.Analysis;
import thm.swtp.airon.clientdata.patient.model.Patient;
import thm.swtp.airon.usermanagement.UserRepository;
import thm.swtp.airon.usermanagement.model.User;

import java.util.List;


/** Represent an  Patient-Controller for the Mapping of Patients Informations
 * @author  Malek Alshweiki
 * @version 1.0
 * @since 1.0
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("patient")
@CrossOrigin(origins = "http://localhost:3000")
public class PatientController {

    final private PatientService patientService;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    UserRepository userRepository;

    /**
     *this method shows how to use the Method "GetAllPatienten" from the PatientService to show all Patients from the Database on the Path:http://localhost:8080/Patient/get-all-patients
     *
     */

    @GetMapping("/get-all-patients")
    public List<Patient> getAllPatient (){
        return patientService.getAllPatienten();
    }

    /**
     *this method shows how to use the Method "addNewPatient" from the PatientService to show the new added Patient in the Database on the Path:http://localhost:8080/Patient/add-patient
     *
     */

    @PostMapping("/add-patient")
    public ResponseEntity<Patient> addNewPatient(@RequestBody Patient patient){
        patient= patientService.addNewPatient(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(patient);
    }
    /**
     *this method shows how to use the Method "updatePatient" from the PatientService to show the changes on the current Patients in the Database on the Path:http://localhost:8080/Patient/update-patient
     *
     */

    @PutMapping(value= "/update-patient")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient){
       patient= patientService.updatePatient(patient);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(patient);

    }
    /**
     *this method shows how to delete a Patient from the Database
     */

    @DeleteMapping(value= "/delete-patient/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable Long id){
        patientService.deletePatient(id);
        return ResponseEntity.status(HttpStatus.OK).body("Patient wurde gelöscht");
    }

    @PutMapping(value = "{patientId}/user/{userId}")
    public Patient addUserToPatient
            (@PathVariable Long patientId, @PathVariable Long userId){

        Patient patient = patientRepository.findById(patientId).get();
        User user = userRepository.findUserById(userId).get();

        patient.setUser(user);

        return patientRepository.save(patient);
    }
}
