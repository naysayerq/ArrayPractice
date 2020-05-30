/*
 * Classname Main
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 */

package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //  1. Find in the net and download a text version of a novel about
        //  Harry Potter. For instance, "Harry Potter and the Sorcerer's Stone":

        String text = new String(Files.readAllBytes(Paths.get("C:\\Users" +
                "\\Intel\\IdeaProjects\\ArrayPractice\\src\\com\\company" +
                "\\harry.txt")));


        //  2. Clean the words from a punctuation signs:

        String cleanedText = text.replaceAll("[^A-Za-zА-Яа-я]", " ");
        cleanedText = cleanedText.toLowerCase();

        //  3. Split the novel into an array of words:

        String[] words = cleanedText.split(" ");

        //  4. Create another array containing distinct words:

        String distinctString = "";

        for (int i = 0; i < words.length; i++) {
            if (!distinctString.contains(words[i])){
                distinctString += words[i] + " ";
            }
        }

        String [] distinctArray = distinctString.split(" ");

        //  5. Order the words in alphabetic order:

        Arrays.sort(distinctArray);

        for (int i = 0; i < distinctArray.length; i++) {
            System.out.println(distinctArray[i]);
        }

    }
}
