package com.sdajava.readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String filename = "c://Users//RENT//IdeaProjects//Mime.txt";
        try(Stream<String> readFile = Files.lines(Paths.get(filename))){
        readFile.forEach(System.out::println);
        }catch(IOException e ){}

    }
}
