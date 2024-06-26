package springtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        FilmPlayer filmPlayer1 = context.getBean("filmPlayer", FilmPlayer.class);

        FilmPlayer filmPlayer2 = context.getBean("filmPlayer", FilmPlayer.class);

        System.out.println(filmPlayer1 == filmPlayer2);


        Computer computer = context.getBean("computer", Computer.class);


        System.out.println(computer.getFilmPlayer().getName());
        System.out.println(computer.getFilmPlayer().getValue());
        System.out.println(computer);

        context.close();
    }
}
