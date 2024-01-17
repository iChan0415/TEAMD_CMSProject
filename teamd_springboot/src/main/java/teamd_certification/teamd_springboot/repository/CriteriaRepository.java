package teamd_certification.teamd_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import teamd_certification.teamd_springboot.model.Criteria;


public interface CriteriaRepository extends JpaRepository<Criteria, Long>{
    
}
