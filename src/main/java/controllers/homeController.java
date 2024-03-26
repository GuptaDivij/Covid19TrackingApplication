package controllers;

import services.CovidData;
import models.LocationStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class homeController {

    @Autowired
    CovidData covidService;
    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = covidService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stats -> stats.getLatestCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stats -> stats.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);
        return "home";
    }
}