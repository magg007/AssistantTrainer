package AssistantTrainer.AssistantTrainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("part")
public class ParticipantController {


    ParticipantRepository repository;

    public ParticipantController(ParticipantRepository repository) {
        this.repository = repository;
    }


    @GetMapping("part")
    Participant participant(){
        Participant participant = new Participant("Jaaaan", "Kowalski", "222-222-222", "j.kowalski@email.com", "22-02-1999", "1");
         return repository.save(participant);
    }

    @PostMapping("add")
    Participant participant(@RequestBody Participant participant){
        return repository.save(participant);
    }


    @GetMapping("all")
    List<Participant> findAll(){
        return repository.findAllByIdNotNullOrderByIdAsc();
    }


    @GetMapping("{id}")
    Optional<Participant> findById(@PathVariable Long id){
        return repository.findById(id);
    }

    @PutMapping("{id}")
    Participant updateParticipant(@RequestBody Participant newParticipant, @PathVariable Long id){
        return repository.findById(id).map(participant -> {
            participant.setParticipantName(newParticipant.getParticipantName());
            participant.setParticipantLastName(newParticipant.getParticipantLastName());
            participant.setParticipantTelephone(newParticipant.getParticipantTelephone());
            participant.setParticipantEmail(newParticipant.getParticipantEmail());
            participant.setParticipantBirthDate(newParticipant.getParticipantBirthDate());
            participant.setParticipantGroup(newParticipant.getParticipantGroup());

            return repository.save(participant);
        }).orElseGet(() -> {
            newParticipant.setId(id);
            return repository.save(newParticipant);
        });
    }


    @DeleteMapping("{id}")
    void deleteParticipant(@PathVariable Long id){
        repository.deleteById(id);
    }


}
