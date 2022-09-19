package thm.swtp.airon.clientdata.analysismethod;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thm.swtp.airon.clientdata.analysis.model.Analysis;
import thm.swtp.airon.clientdata.analysismethod.model.AnalysisMethod;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnalysisMethodService {

    final private AnalysisMethodRepository analysisMethodRepository;


    public List<AnalysisMethod> GetAllMethod() {
        return analysisMethodRepository.findAll();
    }

    public AnalysisMethod addNewMethod(AnalysisMethod method) {

        Optional<AnalysisMethod> methodOptional = analysisMethodRepository.findAnalysisById(method.getName());

        if (methodOptional.isPresent()) {
            throw new IllegalStateException("Die Analyse-Methode existiert schon");
        }
        analysisMethodRepository.save(method);
        return method;
    }

    public  AnalysisMethod updateMethod(AnalysisMethod method){
        analysisMethodRepository.save(method);
        return method;

    }

    public  void deleteMethod(Long id){
        analysisMethodRepository.deleteById(id);

    }

}
