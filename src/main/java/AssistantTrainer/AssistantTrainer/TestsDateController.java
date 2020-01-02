package AssistantTrainer.AssistantTrainer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test2")
public class TestsDateController {

    TestsDateRepository repository;

    public TestsDateController (TestsDateRepository repository){this.repository = repository;}
/*
    @GetMapping
    public TestsDate testsDate(){
        TestsDate testsDate = new TestsDate( "22-03-2019",1,1.8,76.6,"");
        return repository.save(testsDate);
    }


 */
}
