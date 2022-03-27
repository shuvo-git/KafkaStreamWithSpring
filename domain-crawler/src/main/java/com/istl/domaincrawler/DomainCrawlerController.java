package com.istl.domaincrawler;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domain")
public class DomainCrawlerController {

    private final DomainCrawlerService domainCrawlerService;

    public DomainCrawlerController(DomainCrawlerService domainCrawlerService) {
        this.domainCrawlerService = domainCrawlerService;
    }


    @GetMapping("/lookup/{name}")
    public String lookupByName(@PathVariable("name") final String name)
    {
        domainCrawlerService.crawl(name);
        return "Domain Crawler has scrapped your data...";
    }
}
