package ru.springtest.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");


        MusicPlayer musicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);

        musicPlayer.PlayAllMusic();
        context.close();
    }
}
