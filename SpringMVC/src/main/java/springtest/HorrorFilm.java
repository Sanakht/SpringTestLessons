package springtest;

import org.springframework.stereotype.Component;

@Component("horrorFilm20")
public class HorrorFilm implements Film{
    @Override
    public String getNameFilm() {
        return "Нечто";
    }
}
