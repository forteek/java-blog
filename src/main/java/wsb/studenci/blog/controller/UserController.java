package wsb.studenci.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wsb.studenci.blog.model.User;
import wsb.studenci.blog.model.request.user.CreateUserRequest;
import wsb.studenci.blog.repository.UserRepository;


@Controller // This means that this class is a Controller
@RequestMapping(path="/users") // This means URL's start with /demo (after Application path)
public class UserController {
    private @Autowired UserRepository userRepository;

    @PostMapping
    @ResponseBody
    public ResponseEntity<User> create(@RequestBody CreateUserRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setLogin(request.getLogin());
        userRepository.save(user);

        return new ResponseEntity<>(
                user,
                HttpStatus.CREATED
        );
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<Iterable<User>> index() {
        return new ResponseEntity<>(
                userRepository.findAll(),
                HttpStatus.OK
        );
    }
}