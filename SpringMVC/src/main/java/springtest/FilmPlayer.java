package springtest;

public class FilmPlayer {
    private Film film;

    public FilmPlayer(Film film) {
        this.film = film;
    }

    public void playFilm(){
        System.out.println("Playing: " + film.getNameFilm());
    }
}
