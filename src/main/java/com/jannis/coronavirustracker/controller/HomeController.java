package com.jannis.coronavirustracker.controller;

import com.jannis.coronavirustracker.model.LocationStats;
import com.jannis.coronavirustracker.services.CoronaVirusDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataServices coronaVirusDataServices;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronaVirusDataServices.getAllStats();
        int totalReportedDeath = allStats.stream().mapToInt(stats -> Integer.parseInt(stats.getLatestTotalDeath())).sum();
        int totalReportedCases = allStats.stream().mapToInt(stats -> Integer.parseInt(stats.getLatestConfirmedCases())).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedDeath",totalReportedDeath);
        model.addAttribute("totalReportedCases",totalReportedCases);
        return "home";
    }

}
