package thm.swtp.airon.ffb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import thm.swtp.airon.ffb.entities.Image;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, Long> {
	Optional<Image> findByName(String name);
}
