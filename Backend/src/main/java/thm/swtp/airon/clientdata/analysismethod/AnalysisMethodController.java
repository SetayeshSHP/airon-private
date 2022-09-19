package thm.swtp.airon.clientdata.analysismethod;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thm.swtp.airon.clientdata.analysismethod.model.AnalysisMethod;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("analysismethod")
@CrossOrigin(origins = "http://localhost:3000")
public class AnalysisMethodController {

    final private AnalysisMethodService analysisMethodService;


    @GetMapping(value = "get-all-methods")
    public List<AnalysisMethod> getAllMethods (){
        return analysisMethodService.GetAllMethod();
    }


    @PostMapping(value="add-method")
    public ResponseEntity<AnalysisMethod> addNewMethod(@RequestBody AnalysisMethod method){
        method = analysisMethodService.addNewMethod(method);
        return ResponseEntity.status(HttpStatus.CREATED).body(method);
    }

    @PutMapping(value = "update-method")
    public ResponseEntity<AnalysisMethod> updateMethod(@RequestBody AnalysisMethod method){
        analysisMethodService.updateMethod(method);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(method);
    }

    @DeleteMapping(value = "delete-method/{id}")
    public ResponseEntity<String> deleteMethod(@PathVariable Long id){
        analysisMethodService.deleteMethod(id);
        return  ResponseEntity.status(HttpStatus.OK).body("Analyse-Methode wurde gelöscht");

    }
}
