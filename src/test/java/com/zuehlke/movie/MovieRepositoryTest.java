package com.zuehlke.movie;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class MovieRepositoryTest {
    @Test
    public void getAll() throws Exception {
        MovieRepository movieRepository = new MovieRepository();

        List<Movie> movies = movieRepository.getAll();

        Movie batman = new Movie(
                1,
                "Batman Begins",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNTM3OTc0MzM2OV5BMl5BanBnXkFtZTYwNzUwMTI3._V1_SX300.jpg",
                "After training with his mentor, Batman begins his fight to free crime-ridden Gotham City from the corruption that Scarecrow and the League of Shadows have cast upon it.",
                2005,
                "Action, Adventure",
                "tt0372784");

        assertThat(movies, hasSize(7));
        assertThat(movies, hasItem(batman));
    }

}