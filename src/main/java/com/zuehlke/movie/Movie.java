package com.zuehlke.movie;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("unused")
public class Movie {

    private final long id;
    private final String title;
    private final String poster;
    private final String plot;
    private final int year;
    private final String genre;
    private final String imdbId;

    @JsonCreator
    public Movie(@JsonProperty("id") long id,
                 @JsonProperty("Title") String title,
                 @JsonProperty("Poster") String poster,
                 @JsonProperty("Plot") String plot,
                 @JsonProperty("Year") int year,
                 @JsonProperty("Genre") String genre,
                 @JsonProperty("imdbId") String imdbId) {
        this.id = id;
        this.title = title;
        this.poster = poster;
        this.plot = plot;
        this.year = year;
        this.genre = genre;
        this.imdbId = imdbId;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster() {
        return poster;
    }

    public String getPlot() {
        return plot;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getImdbId() {
        return imdbId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        return id == movie.id && year == movie.year && title.equals(movie.title) && poster.equals(movie.poster)
                && plot.equals(movie.plot) && genre.equals(movie.genre) && imdbId.equals(movie.imdbId);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + title.hashCode();
        result = 31 * result + poster.hashCode();
        result = 31 * result + plot.hashCode();
        result = 31 * result + year;
        result = 31 * result + genre.hashCode();
        result = 31 * result + imdbId.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", poster='" + poster + '\'' +
                ", plot='" + plot + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", imdbId='" + imdbId + '\'' +
                '}';
    }
}
