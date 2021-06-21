package in.mohan.deveopsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by mohan on 08/06/21
 */
@RestController
public class UserController {

    @GetMapping
    public String userHealth() {
        return "User is Up"
    }
}
