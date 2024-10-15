package ru.springtest.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

  /*      Music rockMusic = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(rockMusic);

        musicPlayer.playMusic();

        Music classicalMusic = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(classicalMusic);
        
        musicPlayer1.playMusic();*/

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();
    }
}
