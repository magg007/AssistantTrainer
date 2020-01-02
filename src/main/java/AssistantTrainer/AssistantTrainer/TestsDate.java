package AssistantTrainer.AssistantTrainer;


import javax.persistence.*;

/*
BADANIA

ma wyświetlać:
historia wpisow do dadań, data ważności badania (data badania + 12 miesięcy), wzrost, waga, uwagi
*/

@Entity
public class TestsDate {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "participant_id")
    private Participant participant;
    private String date;
    //private Integer expiryDate; expiryDate = date + 12 month
    private Double height;
    private Double weight;
    private String note;

    public TestsDate(Long id, Participant participant, String date, Double height, Double weight, String note) {
        this.id = id;
        this.participant = participant;
        this.date = date;
        this.height = height;
        this.weight = weight;
        this.note = note;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
