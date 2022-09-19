package thm.swtp.airon.usermanagement.model;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import thm.swtp.airon.clientdata.analysis.model.Analysis;
import thm.swtp.airon.clientdata.patient.model.Patient;

import java.util.Set;

@Getter
@Entity
@Table(name = "user_sb")
public class User {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String department;

    private String email;

    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<Patient> patient;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

