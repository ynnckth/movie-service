package com.zuehlke.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static java.util.Arrays.asList;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RequestMapping("/api/v1/")
@Controller
public class MovieController {

    @RequestMapping(value = "/movies", method = GET)
    @ResponseBody
    public List<Movie> getMovies() {
        return asList(
                new Movie(1, "Batman Begins", "https://images-na.ssl-images-amazon.com/images/M/MV5BNTM3OTc0MzM2OV5BMl5BanBnXkFtZTYwNzUwMTI3._V1_SX300.jpg"),
                new Movie(2, "Ted", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ1OTU0ODcxMV5BMl5BanBnXkFtZTcwOTMxNTUwOA@@._V1_SX300.jpg"),
                new Movie(3, "Inception", "https://images-na.ssl-images-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_SX300.jpg")
        );
    }
    
}
