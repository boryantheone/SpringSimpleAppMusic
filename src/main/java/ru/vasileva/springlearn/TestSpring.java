package ru.vasileva.springlearn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.instrument.ClassDefinition;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//       Music music = context.getBean("rockMusic", Music.class);
//       MusicPlayer musicPlayer = new MusicPlayer(music);
//       musicPlayer.playMusic();
//
//       Music music1 = context.getBean("classicalMusic", Music.class);
//       MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//       musicPlayer1.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

         MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic);

        context.close();
    }
}
