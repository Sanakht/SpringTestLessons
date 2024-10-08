package ru.springtest.springcourse;

import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> list;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> list) {
        this.list = list;
    }

    public void PlayMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    public void PlayAllMusic(){
        for(Music musicPlay: list){
            System.out.println("Plating: " + musicPlay.getSong());
        }
    }
}
