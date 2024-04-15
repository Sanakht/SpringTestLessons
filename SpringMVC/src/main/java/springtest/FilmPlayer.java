package springtest;

import java.util.ArrayList;
import java.util.List;

public class FilmPlayer {
    private List<Film> filmList = new ArrayList<>();
    private int time;
    private String name;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFilm(List<Film> filmList) {
        this.filmList = filmList;
    }

   // public FilmPlayer(Film film) {
   //     this.film = film;
   // }

    public void playFilm(){
        for (Film film : filmList){
            System.out.println(film.getNameFilm());
        }
    }
}
