package org.example.controller;

import org.example.model.Cinema;
import org.example.model.Movie;
import org.example.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cinema")

public class CinemaController {
    private final CinemaService cinemaService;

    @Autowired
    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping("/find_all")
    public String findAll(Model model) {
        model.addAttribute("cinema", cinemaService.findAll());
        List<Cinema> cinemas = cinemaService.findAll();
        for (int i = 0; i < cinemas.size(); i++) {
            cinemas.get(i).getId();
        }
        for (Cinema cinema : cinemas) {
            cinema.getId();
        }
        return "cinemas";
    }

    @GetMapping("/post")
    public String addCinema(Model model) {
        model.addAttribute("cinema", new Cinema());
        return "add_cinema ?";
    }

    @GetMapping("/")
    public String saveCinema(@ModelAttribute("cinema") Cinema cinema) {
        cinemaService.save(cinema);
        return "redirect:/cinema/find_all";
    }

    @GetMapping("/search")
    public String search() {
        return "search_movie";
    }

    @GetMapping("/result")
    public String getResultOfSearch(@ModelAttribute("movie") String movie, Model model) {
        model.addAttribute("movie", cinemaService.searchName(cinemaname));
        return "find_by_id";
    }
}
