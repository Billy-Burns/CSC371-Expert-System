package com.expertsystem.expertsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expert-system")
public class ExpertSystemController {
    @Autowired
    private ExpertSystemService expertSystemService;

    @PostMapping("/evaluate")
    public String evaluateQualifications(@RequestBody CandidateInfo candidateInfo) {
        return expertSystemService.evaluateCandidateQualifications(candidateInfo);
    }
}


