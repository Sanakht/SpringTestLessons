package springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Film film = context.getBean("filmBean", Film.class);

        //FilmPlayer filmPlayer = new FilmPlayer(film);

        //filmPlayer.playFilm();

        FilmPlayer filmPlayer = context.getBean("filmPlayer", FilmPlayer.class);
        filmPlayer.playFilm();

        System.out.println(filmPlayer.getName());
        System.out.println(filmPlayer.getTime());

        context.close();
    }
}
