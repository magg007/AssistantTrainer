package AssistantTrainer.AssistantTrainer;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

public class ParticipantService {
    ParticipantRepository repository;
    public ParticipantService(ParticipantRepository repository) {
        this.repository = repository;
    }

    public List<Participant> findAll(){
        return repository.findAll();
    }

    public Optional<Participant> findById(Long id){
        return repository.findById(id);
    }

}
