package teamd_certification.teamd_springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import teamd_certification.teamd_springboot.model.User;
import teamd_certification.teamd_springboot.repository.UserRepository;

@RestController
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @PostMapping("/user")
  User newUser(@RequestBody User newUser) {
    return userRepository.save(newUser);
  }

  @GetMapping("/users")
  List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @GetMapping("/users/{userId}")
  User getUserById(@PathVariable Long userId) {
    // Assuming userRepository.findById() returns an Optional<User>
    Optional<User> userOptional = userRepository.findById(userId);

    // Check if the user exists
    if (userOptional.isPresent()) {
      return userOptional.get();
    } else {
      // Handle the case where the user with the given ID is not found
      // You can throw an exception, return a specific response, or handle it in a way that suits your application
      // For simplicity, let's throw an exception
      //throw new UserNotFoundException("User not found with ID: " + userId);
    }
    return null;
  }
}
