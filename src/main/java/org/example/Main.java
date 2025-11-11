package org.example;

import org.example.entity.StringSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("************************************************");
        StringSet metin = new StringSet();
        metin.kelimeler = StringSet.findUniqueWords();
        System.out.println(Arrays.toString(metin.kelimeler));
        System.out.println("************************************************");
        String[] essizler = StringSet.findUniqueWords();
        System.out.println(Arrays.toString(essizler));


    }
}