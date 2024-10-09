package ru.springtest.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);


        System.out.println(classicalMusic.getSong());




/*
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.playMusic();
        secondMusicPlayer.playMusic();
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
*/

        context.close();
    }
}
