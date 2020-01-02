package AssistantTrainer.AssistantTrainer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
STOPIEŃ KYU

ma wyświetlać:
historia wpisów: data egzaminu, stopień kyu
 */

@Entity
public class LevelKyu {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    //public Integer idParticipant; - powiązać z polem levelKyu w tabeli Participant;
    private String examDate;
    private Integer levelKyu;

    public LevelKyu(String examDate, Integer levelKyu) {
        this.examDate = examDate;
        this.levelKyu = levelKyu;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public Integer getLevelKyu() {
        return levelKyu;
    }

    public void setLevelKyu(Integer levelKyu) {
        this.levelKyu = levelKyu;
    }
}
