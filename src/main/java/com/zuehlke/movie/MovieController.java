package com.zuehlke.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RequestMapping("/api/v1/")
@Controller
public class MovieController {

    private final MovieRepository movieRepository = new MovieRepository();

    @RequestMapping(value = "/movies", method = GET)
    @ResponseBody
    public List<Movie> getMovies() {
        return movieRepository.getAll();
    }

}
