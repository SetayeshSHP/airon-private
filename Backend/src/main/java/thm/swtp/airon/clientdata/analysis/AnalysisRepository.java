package thm.swtp.airon.clientdata.analysis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import thm.swtp.airon.clientdata.analysis.model.Analysis;
import java.util.Optional;

/** Represent an Anaylsis repository for database access for all Analysis
 * @author  Malek Alshweiki
 * @version 1.0
 * @since 1.0
 */


public interface AnalysisRepository extends JpaRepository<Analysis,Long> {

    @Query("SELECT a FROM Analysis a WHERE a.id = ?1")
    Optional<Analysis> findAnalysisById( Long id);

}
