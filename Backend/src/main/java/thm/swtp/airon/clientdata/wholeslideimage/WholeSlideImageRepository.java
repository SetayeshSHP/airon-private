package thm.swtp.airon.clientdata.wholeslideimage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import thm.swtp.airon.clientdata.wholeslideimage.model.WholeSlideImage;
import java.util.Optional;

public interface WholeSlideImageRepository extends JpaRepository<WholeSlideImage, Long> {

    @Query("SELECT a FROM WholeSlideImage a WHERE a.id = ?1")
    Optional<WholeSlideImage> findAnalysisById(Long id);

}
