package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        System.out.println( "Server is running" );
    }
}
