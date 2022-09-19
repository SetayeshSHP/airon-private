package thm.swtp.airon.clientdata.analysismethod.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import thm.swtp.airon.clientdata.analysis.model.Analysis;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Table(name = "analysismethod_sb")
public class AnalysisMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    @JsonIgnore
    @ManyToMany(mappedBy = "methodAWork")
    private Set<Analysis> analysis = new HashSet<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
