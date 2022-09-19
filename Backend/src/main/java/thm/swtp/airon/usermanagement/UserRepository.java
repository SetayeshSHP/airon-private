package thm.swtp.airon.usermanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import thm.swtp.airon.clientdata.patient.model.Patient;
import thm.swtp.airon.usermanagement.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {


    Optional<User> findUserById(Long id);
}