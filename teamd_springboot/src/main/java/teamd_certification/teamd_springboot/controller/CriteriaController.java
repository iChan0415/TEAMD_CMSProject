package teamd_certification.teamd_springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import teamd_certification.teamd_springboot.model.Criteria;
import teamd_certification.teamd_springboot.repository.CriteriaRepository;

@RestController
@CrossOrigin("http://localhost:5173")
public class CriteriaController {

  @Autowired
  private CriteriaRepository criteriaRepository;

  @PostMapping("/criteria")
  Criteria newCriteria(@RequestBody Criteria newCriteria) {
    return criteriaRepository.save(newCriteria);
  }

  @GetMapping("/criterias")
  List<Criteria> getAllCriterias() {
    return criteriaRepository.findAll();
  }

 @GetMapping("/criteria/{criteriaId}")
  Criteria getUserById(@PathVariable Long criteriaId) {
    // Assuming userRepository.findById() returns an Optional<User>
    Optional<Criteria> criteriaOptional = criteriaRepository.findById(criteriaId);

    // Check if the user exists
    if (criteriaOptional.isPresent()) {
      return criteriaOptional.get();
    } else {
      // Handle the case where the user with the given ID is not found
      // You can throw an exception, return a specific response, or handle it in a way that suits your application
      // For simplicity, let's throw an exception
      //throw new UserNotFoundException("User not found with ID: " + userId);
    }
    return null;
  }
}
