package springtest;

import org.springframework.stereotype.Component;

@Component
public class ActionFilm implements Film{
    @Override
    public String getNameFilm() {
        return "Казино Рояль";
    }
}
