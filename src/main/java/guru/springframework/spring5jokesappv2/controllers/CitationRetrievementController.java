package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.CitationRetrievementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CitationRetrievementController {

    private final CitationRetrievementService citationRetrievementService;

    public CitationRetrievementController(CitationRetrievementService citationRetrievementService) {
        this.citationRetrievementService = citationRetrievementService;
    }

    @RequestMapping({"/", ""})
    public String getRandomCitation(Model model) {

        model.addAttribute("joke", citationRetrievementService.getRandomQuote());

        return "joke/index";
    }
}
