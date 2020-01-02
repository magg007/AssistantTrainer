package AssistantTrainer.AssistantTrainer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("test")
public class Test {
    @GetMapping
    public Kit test (){
       return new Kit("Jan", 8);
    }
}
