package AssistantTrainer.AssistantTrainer;

import javax.persistence.*;
import java.util.List;

@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String participantName;
    private String participantLastName;
    private String participantTelephone;
    private String participantEmail;
    private String participantBirthDate;
    private String participantGroup;


    @OneToMany (mappedBy = "participant")
    private List<TestsDate> testsDate;

    Participant() {}

    public Participant(String participantName, String participantLastName, String participantTelephone, String participantEmail, String participantBirthDate, String participantGroup) {
        this.participantName = participantName;
        this.participantLastName = participantLastName;
        this.participantTelephone = participantTelephone;
        this.participantEmail = participantEmail;
        this.participantBirthDate = participantBirthDate;
        this.participantGroup = participantGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantLastName() {
        return participantLastName;
    }

    public void setParticipantLastName(String participantLastName) {
        this.participantLastName = participantLastName;
    }

    public String getParticipantTelephone() {
        return participantTelephone;
    }

    public void setParticipantTelephone(String participantTelephone) {
        this.participantTelephone = participantTelephone;
    }

    public String getParticipantEmail() {
        return participantEmail;
    }

    public void setParticipantEmail(String participantEmail) {
        this.participantEmail = participantEmail;
    }

    public String getParticipantBirthDate() {
        return participantBirthDate;
    }

    public void setParticipantBirthDate(String participantBirthDate) {
        this.participantBirthDate = participantBirthDate;
    }

    public String getParticipantGroup() {
        return participantGroup;
    }

    public void setParticipantGroup(String participantGroup) {
        this.participantGroup = participantGroup;
    }


}
