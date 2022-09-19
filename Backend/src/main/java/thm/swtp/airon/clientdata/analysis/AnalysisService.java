package thm.swtp.airon.clientdata.analysis;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thm.swtp.airon.clientdata.analysis.model.Analysis;
import java.util.List;
import java.util.Optional;

/** Represent an  Analysis-Service for the Methods of Analysis Informations
 * @author  Malek Alshweiki
 * @version 1.0
 * @since 1.0
 */


@Service
@RequiredArgsConstructor
public class AnalysisService {
    final private AnalysisRepository analysisRepository;

    /**
     *this method shows how to get all Analysis from the Database
     */

    public List<Analysis> GetAllAnalysis() {
        return analysisRepository.findAll();
    }

    /**
     *this method shows how to add a new Analysis in the Database
     */

    public Analysis addNewAnalysis(Analysis analysis) {

        Optional<Analysis> analysisOptional = analysisRepository.findAnalysisById(analysis.getId());

        if (analysisOptional.isPresent()) {
            throw new IllegalStateException("Die Analyse existiert");
        }
        analysisRepository.save(analysis);
        return analysis;

    }
    /**
     *this method shows how to make changes on a Analysis from the Database
     */
    public  Analysis updateAnalysis(Analysis analysis){
        analysisRepository.save(analysis);
        return analysis;

    }
    /**
     *this method shows how to delete a Analysis from the Database
     */
    public  void deleteAnalysis(Long id){
        analysisRepository.deleteById(id);

    }
}