package springtest;

import org.springframework.stereotype.Component;

@Component
public class HorrorFilm implements Film{
    @Override
    public String getNameFilm() {
        return "Нечто";
    }
}
