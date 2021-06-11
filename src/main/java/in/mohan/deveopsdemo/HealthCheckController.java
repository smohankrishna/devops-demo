package in.mohan.deveopsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by mohan on 08/06/21
 */
@RestController
public class HealthCheckController {

    @GetMapping("health")
    public Map<String,String> health() {
        //Source tree commit
        return Map.of("Status","Up");
    }
}
