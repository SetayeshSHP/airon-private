package thm.swtp.airon.analysistool.result;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thm.swtp.airon.analysistool.result.model.Result;
import thm.swtp.airon.clientdata.analysis.AnalysisRepository;
import thm.swtp.airon.clientdata.analysis.model.Analysis;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("result")
@CrossOrigin(origins = "http://localhost:3000")
public class ResultController {

    final private ResultService resultService;

    @Autowired
    ResultRepository resultRepository;
    @Autowired
    AnalysisRepository analysisRepository;

    @GetMapping(value = "get-all-result")
    public List<Result> getAllResult (){
        return resultService.GetAllResult();
    }


    @PostMapping(value="add-result")
    public ResponseEntity<Result> addNewResult(@RequestBody Result result){
        result = resultService.addNewResult(result);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }


    @DeleteMapping(value = "delete-result/{id}")
    public ResponseEntity<String> deleteResult(@PathVariable Long id){
        resultService.deleteResult(id);
        return  ResponseEntity.status(HttpStatus.OK).body("Das Ergebnis wurde gelöscht");
    }

    @PutMapping("/{resultId}/analysis/{analysisId}")
    Result addAnalysisToResult
            (@PathVariable Long resultId, @PathVariable Long analysisId) {

        Result result = resultRepository.findById(resultId).get();
        Analysis analysis = analysisRepository.findById(analysisId).get();

        result.setAnalysis(analysis);

        return resultRepository.save(result);
    }

}
