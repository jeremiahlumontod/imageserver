package com.jml.imageserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class ImageServer  extends SpringBootServletInitializer {
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}


@SpringBootApplication
public class ImageServer extends SpringBootServletInitializer {
    public static void main( String[] args )  {
        SpringApplication.run(ImageServer.class, args);
    }
}


