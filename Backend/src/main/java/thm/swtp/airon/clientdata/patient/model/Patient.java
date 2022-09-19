package thm.swtp.airon.clientdata.patient.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import thm.swtp.airon.clientdata.analysis.model.Analysis;
import thm.swtp.airon.usermanagement.model.User;

import javax.persistence.*;
import java.util.Set;


/** Represent an Patient Class and the Attribute and Table Structure in the Database
 * @author  Malek Alshweiki
 * @version 1.0
 * @since 1.0
 */
@Getter
@Entity
@Table(name = "patient_sb")
@RequiredArgsConstructor
public class Patient  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String inpId;
    private Integer age;
    private Character sex;
    private String diagnosis;


    @JsonIgnore
    @OneToMany(mappedBy = "patient")
    private Set<Analysis> analysis;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;


    public void setInpId(String inpId) {
        this.inpId = inpId;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

