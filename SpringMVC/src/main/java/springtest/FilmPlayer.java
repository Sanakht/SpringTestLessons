package springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FilmPlayer {
    @Autowired
    @Qualifier("horrorFilm20")
    private Film film;

    public String playFilm(){
        return "Playing: " + film.getNameFilm();

    }
}
