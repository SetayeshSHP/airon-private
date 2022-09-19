
package thm.swtp.airon.clientdata.analysis.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import org.springframework.web.bind.annotation.CrossOrigin;
import thm.swtp.airon.analysistool.result.model.Result;
import thm.swtp.airon.clientdata.analysismethod.model.AnalysisMethod;
import thm.swtp.airon.clientdata.patient.model.Patient;
import thm.swtp.airon.clientdata.wholeslideimage.model.WholeSlideImage;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/** Represent an Analysis Class and the Attribute and Table Structure in the Database
 * @author  Malek Alshweiki
 * @version 1.0
 * @since 1.0
 */

@Getter
@Entity
@Table(name = "analysis_sb")
@CrossOrigin(origins = "http://localhost:3000")
public class Analysis {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
/*
    private String data;
    private String row;
 */

    @ManyToMany
    @JoinTable(
            name = "methods_work",
            joinColumns = @JoinColumn(name = "analysis_id"),
            inverseJoinColumns = @JoinColumn(name = "analysismethod_id")
    )
    Set<AnalysisMethod> methodAWork = new HashSet<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "image_id", referencedColumnName = "id")
    private WholeSlideImage image;

    @JsonIgnore
    @OneToOne(mappedBy = "analysis")
    private Result result;

/*
    public void setData(String data) {
        this.data = data;
    }
    public void setRow(String row) {
        this.row = row;
    }
 */

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void methodAwork(AnalysisMethod method){
        methodAWork.add(method);
    }

    public void setImage(WholeSlideImage image) {
        this.image = image;
    }


}


