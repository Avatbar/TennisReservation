package local.tennisreservation.tennis.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Tadeas Machacek
 */
@RestController
@RequestMapping(path = "api/v1/registeredUser")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public void registerUser(@RequestBody User user) {
        userService.addNewUser(user);
    }
}
