
package thm.swtp.airon.clientdata.wholeslideimage.model;

//import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import thm.swtp.airon.clientdata.analysis.model.Analysis;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "wholeslideimage_sb")
public class WholeSlideImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String staining;

    private String manification;

    @JsonIgnore
    @OneToOne(mappedBy = "image")
    private Analysis analysis;


    public void setStaining(String staining) {
        this.staining = staining;
    }

    public void setManification(String manification) {
        this.manification = manification;
    }

}



