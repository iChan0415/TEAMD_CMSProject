package teamd_certification.teamd_springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Criteria {

    @Id
    @GeneratedValue
    private Long id;
    private String coursetitle;
    private String instructor;
    private String quiz;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoursetitle() {
        return this.coursetitle;
    }

    public void setCoursetitle(String coursetitle) {
        this.coursetitle = coursetitle;
    }

    public String getInstructor() {
        return this.instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getQuiz() {
        return this.quiz;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }


}