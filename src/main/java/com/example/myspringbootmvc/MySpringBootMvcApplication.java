package com.example.myspringbootmvc;

import javazoom.jl.player.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;

@SpringBootApplication
public class MySpringBootMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootMvcApplication.class, args);
        try {
            FileInputStream fis = new FileInputStream("CoolMusic3.mp3");
            Player playMP3 = new Player(fis);
            playMP3.play();

            FileInputStream fis2 = new FileInputStream("CoolMusic2.mp3");
            Player playMP32 = new Player(fis2);

            playMP32.play();
            FileInputStream fis3 = new FileInputStream("CoolMusic.mp3");
            Player playMP33 = new Player(fis3);

            playMP33.play();
        } catch(Exception e) {
        }
    }
    }


