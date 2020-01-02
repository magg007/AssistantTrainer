package AssistantTrainer.AssistantTrainer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    List<Participant> findAllByIdNotNullOrderByIdAsc();

}
