package thm.swtp.airon.analysistool.result;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import thm.swtp.airon.analysistool.result.model.Result;

import java.util.Optional;

public interface ResultRepository extends JpaRepository<Result,Long> {

    @Query("SELECT a FROM Result a WHERE a.id = ?1")
    Optional<Result> findResultById(Long id);

}
