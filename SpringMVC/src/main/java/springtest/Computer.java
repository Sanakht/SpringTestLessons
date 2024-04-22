package springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private FilmPlayer filmPlayer;

    public FilmPlayer getFilmPlayer() {
        return filmPlayer;
    }

    @Autowired
    public Computer(FilmPlayer filmPlayer) {
        this.id = 1;
        this.filmPlayer = filmPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + filmPlayer.playFilm();
    }
}
