package springtest;

import org.springframework.stereotype.Component;

@Component
public class ClassicalFilm implements Film{
    @Override
    public String getNameFilm() {
        return "Крестный отец";
    }

    public void doMyInit(){
        System.out.println("Инициализация бина: Классический фильм");
    }

    public void doMyDestroy(){
        System.out.println("Уничтожение бина: Классический фильм");
    }
}
