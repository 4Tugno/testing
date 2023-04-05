package com.daniloFortugno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //per dire che è una spring application
@RestController //In questo modo vengono visualizzati gli endpoints della classe
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args); //permette di runnare l'applicazione
    }

    @GetMapping("/") //Permette di inserire un end point, lo slash serve per indicare il path
    public String hello(){
        return "Hello sborr";
    }

    @GetMapping("/prova") //Se inseriamo questo quando andremo ad avviare il server per raggiungere il metodo sottostante dovremo
    //mettere l'intero path+/prova
    public String prova(){
        return "Questa è una prova";
    }
}
