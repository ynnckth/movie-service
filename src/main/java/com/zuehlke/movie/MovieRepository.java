package com.zuehlke.movie;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

class MovieRepository {

    List<Movie> getAll() {
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

        try {
            byte[] bytes = Files.readAllBytes(Paths.get("./src/main/resources/movies.json"));
            return mapper.readValue(bytes, new TypeReference<List<Movie>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }

}
