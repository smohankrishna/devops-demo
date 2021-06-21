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
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("Status","Up");
        return hashMap;
    }
}
