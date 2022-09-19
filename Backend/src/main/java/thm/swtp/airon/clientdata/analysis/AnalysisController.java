package thm.swtp.airon.clientdata.analysis;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thm.swtp.airon.clientdata.analysis.model.Analysis;
import thm.swtp.airon.clientdata.analysismethod.AnalysisMethodRepository;
import thm.swtp.airon.clientdata.analysismethod.model.AnalysisMethod;
import thm.swtp.airon.clientdata.patient.PatientRepository;
import thm.swtp.airon.clientdata.patient.model.Patient;
import thm.swtp.airon.clientdata.wholeslideimage.WholeSlideImageRepository;
import thm.swtp.airon.clientdata.wholeslideimage.model.WholeSlideImage;

import java.util.List;

/** Represent an  Analysis-Controller for the Mapping of Analysis Informations
 * @author  Malek Alshweiki
 * @version 1.0
 * @since 1.0
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("analysis")
@CrossOrigin(origins = "http://localhost:3000")
public class AnalysisController {
    final private AnalysisService analysisService;

    @Autowired
    AnalysisRepository analysisRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    AnalysisMethodRepository analysisMethodRepository;

    @Autowired
    WholeSlideImageRepository wholeSlideImageRepository;


    /**
     *this method shows how to use the Method "GetAllAnalysis" from the UserService to show all Analysis from the Database on the Path:http://localhost:8080/analysis/get-all-analysis
     *
     */
    @GetMapping(value = "get-all-analysis")
    public List<Analysis> getAllAnalysis (){
        return analysisService.GetAllAnalysis();
    }

    /**
     *this method shows how to use the Method "AddNewAnalysis" from the UserService to show the new added Analysis in the Database on the Path:http://localhost:8080/analysis/add-analysis
     *
     */
    @PostMapping (value="add-analysis")
    public ResponseEntity<Analysis> addNewAnalysis(@RequestBody Analysis analysis){
       analysis= analysisService.addNewAnalysis(analysis);
        return ResponseEntity.status(HttpStatus.CREATED).body(analysis);
    }
    /**
     *this method shows how to use the Method "updateAnalysis" from the UserService to show the changes on the current Analysis  in the Database on the Path:http://localhost:8080/analysis/update-analysis
     *
     */
    @PutMapping(value = "update-analysis")
    public ResponseEntity<Analysis> updateAnalysis(@RequestBody Analysis analysis){
        analysisService.updateAnalysis(analysis);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(analysis);
    }

    /**
     * this method shows how to use the Method "deleteAnalysis" from the UserService to show the Confimation for the deleted Analysis from the Databse on the path:http://localhost:8080/analysis/delete-analysis
     *
     */
    @DeleteMapping(value = "delete-analysis/{id}")
    public ResponseEntity<String> deleteAnalysis(@PathVariable Long id){
         analysisService.deleteAnalysis(id);
        return  ResponseEntity.status(HttpStatus.OK).body("Analyse wurde gelöscht");

    }

    @PutMapping(value = "{analysisId}/patient/{patientId}")
    public Analysis addPatientToAnalysis
            (@PathVariable Long analysisId, @PathVariable Long patientId){

        Analysis analysis = analysisRepository.findById(analysisId).get();
        Patient patient = patientRepository.findById(patientId).get();

        analysis.setPatient(patient);

        return analysisRepository.save(analysis);
    }

    @PutMapping("/{analysisId}/method/{methodId}")
    Analysis addMethodToAnalysis
            (@PathVariable Long analysisId, @PathVariable Long methodId) {

        Analysis analysis = analysisRepository.findById(analysisId).get();
        AnalysisMethod method = analysisMethodRepository.findById(methodId).get();

        analysis.methodAwork(method);

        return analysisRepository.save(analysis);
    }

    @PutMapping("/{analysisId}/image/{imageId}")
    Analysis addImageToAnalysis
            (@PathVariable Long analysisId, @PathVariable Long imageId) {

        Analysis analysis = analysisRepository.findById(analysisId).get();
        WholeSlideImage image = wholeSlideImageRepository.findById(imageId).get();

        analysis.setImage(image);

        return analysisRepository.save(analysis);
    }
}
