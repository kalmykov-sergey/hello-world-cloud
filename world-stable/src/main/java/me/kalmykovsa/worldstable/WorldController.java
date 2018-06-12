package me.kalmykovsa.worldstable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/world")
public class WorldController {

    @GetMapping()
    public String world() {
        System.out.println("STABLE");
        return "world";
    }
}
