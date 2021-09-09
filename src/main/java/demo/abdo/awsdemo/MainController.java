package demo.abdo.awsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    @GetMapping("/aws")
    public String aws(){
        return "aws";
    }
}
