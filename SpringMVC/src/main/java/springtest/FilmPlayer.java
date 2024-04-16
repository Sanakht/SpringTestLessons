package springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FilmPlayer {
    @Autowired
    @Qualifier("classicalFilm")
    private Film film;

    @Value("${filmPlayer.name}")
    private String name;

    @Value("${filmPlayer.value}")
    private int value;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String playFilm(){
        return "Playing: " + film.getNameFilm();

    }
}
