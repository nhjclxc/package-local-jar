package com.example.localjartest;

import com.nhjclxc.destjar.test.DestJarTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalJarTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalJarTestApplication.class, args);

        System.out.println("LocalJarTestApplication = " + DestJarTest.getInfo());

    }

}
