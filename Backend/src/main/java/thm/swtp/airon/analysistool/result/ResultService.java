package thm.swtp.airon.analysistool.result;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thm.swtp.airon.analysistool.result.model.Result;
import thm.swtp.airon.clientdata.analysis.model.Analysis;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ResultService {

    final private ResultRepository resultRepository;


    public List<Result> GetAllResult() {
        return resultRepository.findAll();
    }


    public Result addNewResult(Result result) {

        Optional<Result> resultOptional = resultRepository.findResultById(result.getId());

        if (resultOptional.isPresent()) {
            throw new IllegalStateException("Die Ergebnis existiert");
        }
        resultRepository.save(result);
        return result;

    }


    public Result updateResult(Result result){
        resultRepository.save(result);
        return result;

    }


    public void deleteResult(Long id){
        resultRepository.deleteById(id);
    }

}
