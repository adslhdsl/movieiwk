package movieiwk.common;


import movieiwk.MessageApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MessageApplication.class })
public class CucumberSpingConfiguration {
    
}
