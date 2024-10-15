package ru.springtest.springcourse;

import org.springframework.stereotype.Component;

@Component // Если не задан айди ("..."), то сылка на бин будет название класса с маленькой буквы
public class ClassicalMusic implements Music{

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
