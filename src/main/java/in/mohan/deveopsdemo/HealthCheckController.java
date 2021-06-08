package in.mohan.deveopsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mohan on 08/06/21
 */
@RestController
public class HealthCheckController {

    @GetMapping("health")
    public String health() {
        return "All is well.. Ready to Rock";
    }
}
