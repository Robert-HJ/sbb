package study.wikidocs.sbb;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/sbb")
    public ResponseEntity<String> sbb() {
        return ResponseEntity.ok("hello world");
    }
}
