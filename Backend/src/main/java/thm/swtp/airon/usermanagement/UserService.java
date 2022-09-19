package thm.swtp.airon.usermanagement;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thm.swtp.airon.usermanagement.model.User;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    final private UserRepository userRepository;


    public List<User>GetAllUsers(){
        return userRepository.findAll();
    }

    public User addNewUser(User user) {

        Optional<User> userOptional = userRepository.findUserById(user.getId());

        if (userOptional.isPresent()) {
            throw new IllegalStateException("Der Nutzer existiert");
        }
        userRepository.save(user);
        return user;
    }

    public  User updateUser(User user){
            userRepository.save(user);
        return  user;
    }

    public  void deleteUser(Long userid){
        userRepository.deleteById(userid);
    }

}
