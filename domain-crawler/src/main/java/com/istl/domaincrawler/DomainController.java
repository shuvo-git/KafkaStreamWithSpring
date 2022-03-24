package com.istl.domaincrawler;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domain")
public class DomainController {

    @GetMapping("/lookup/{name}")
    public void lookupByName(@PathVariable("name") final String name)
    {
        final String apiUrl = "https://api.domainsdb.info/v1/domains/search?domain=" + name;
    }
}
