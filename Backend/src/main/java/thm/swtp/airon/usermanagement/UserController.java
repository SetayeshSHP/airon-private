package thm.swtp.airon.usermanagement;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thm.swtp.airon.usermanagement.model.User;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    final private UserService userService;


    // get all Users
    @GetMapping(value = "get-all-users")
    public List<User> getAllUser (){
        return userService.GetAllUsers();
    }

    // add new User
    @PostMapping(value = "add-user")
    public ResponseEntity<User> addNewUser(@RequestBody User user){
       user= userService.addNewUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }

    // Update User
    @PutMapping(value = "update-user")
    public ResponseEntity<User> updateUser(@RequestBody User user){
       user= userService.updateUser(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
    }

    // Delete User
    @DeleteMapping(value = "delete-user")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
         userService.deleteUser(id);
        return  ResponseEntity.status(HttpStatus.OK).body("User wurde gelöscht");
    }

}
