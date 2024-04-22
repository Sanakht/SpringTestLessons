package springtest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class FilmPlayer {
    @Autowired
    @Qualifier("classicalFilm")
    private Film film;

    @Value("${filmPlayer.name}")
    private String name;

    @Value("${filmPlayer.value}")
    private int value;

    @PostConstruct
    public void doMyInit(){
        System.out.println("Метод срабатывающий при инициализации объекта!");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Метод срабатывающий при уничтожение объекта!");
    }

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
