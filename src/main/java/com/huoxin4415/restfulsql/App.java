package com.huoxin4415.restfulsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.huoxin4415.restfulsql.framework.EnableRestfulSQL;

@EnableRestfulSQL
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
