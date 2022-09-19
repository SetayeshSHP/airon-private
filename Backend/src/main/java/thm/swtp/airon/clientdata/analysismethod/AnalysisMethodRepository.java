package thm.swtp.airon.clientdata.analysismethod;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import thm.swtp.airon.clientdata.analysismethod.model.AnalysisMethod;

import java.util.Optional;


public interface AnalysisMethodRepository extends JpaRepository<AnalysisMethod,Long> {

    @Query("SELECT a FROM AnalysisMethod a WHERE a.name = ?1")
    Optional<AnalysisMethod> findAnalysisById(String name);
}
