package llmoraleslearn.curseplatzi.marker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class HelloWordController {

    @GetMapping("/hello")
    public String greet(){
        return "Hello stop learning";
    }
}
