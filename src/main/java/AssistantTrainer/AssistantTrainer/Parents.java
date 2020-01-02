package AssistantTrainer.AssistantTrainer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
RODZICE ZAWODNIKÓW
 */

@Entity
public class Parents {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    //public Integer idParticipant; - powiązać z polem parents w tabeli Participant;
    private String parentName;
    private String parentLastName;
    private String parentTelephone;
    private String parentEmail;
    private Boolean parentAssent;

    public Parents(String parentName, String parentLastName, String parentTelephone, String parentEmail, Boolean parentAssent) {
        this.parentName = parentName;
        this.parentLastName = parentLastName;
        this.parentTelephone = parentTelephone;
        this.parentEmail = parentEmail;
        this.parentAssent = parentAssent;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }

    public String getParentTelephone() {
        return parentTelephone;
    }

    public void setParentTelephone(String parentTelephone) {
        this.parentTelephone = parentTelephone;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public Boolean getParentAssent() {
        return parentAssent;
    }

    public void setParentAssent(Boolean parentAssent) {
        this.parentAssent = parentAssent;
    }
}
