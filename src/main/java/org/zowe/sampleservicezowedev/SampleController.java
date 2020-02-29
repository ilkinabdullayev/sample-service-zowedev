package org.zowe.sampleservicezowedev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping
    public String sample() {
        return "I am running";
    }
}
