package com.zuehlke.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/api/v1/")
@Controller
public class MovieController {

    private final MovieRepository movieRepository = new MovieRepository();

    @GetMapping("/movies")
    @ResponseBody
    public List<Movie> getMovies() {
        return movieRepository.getAll();
    }

    @GetMapping("/movies/{id}")
    @ResponseBody
    public Movie getMovieById(@PathVariable("id") long id) {
        return movieRepository.getMovieById(id)
                .orElseThrow(() -> new MovieNotFoundException("No movie found with id=" + id));
    }

}
