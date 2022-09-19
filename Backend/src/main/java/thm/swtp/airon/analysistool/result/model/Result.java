package thm.swtp.airon.analysistool.result.model;


import javax.persistence.*;
import lombok.Getter;
import thm.swtp.airon.clientdata.analysis.model.Analysis;

@Getter
@Entity
@Table(name = "result_sb")
public class Result {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resultsb;

    private String x;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "analyse_id", referencedColumnName = "id")
    private Analysis analysis;


    public void setResultsb(String resultsb) {
        this.resultsb = resultsb;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setAnalysis(Analysis analysis) {
        this.analysis = analysis;
    }


}


