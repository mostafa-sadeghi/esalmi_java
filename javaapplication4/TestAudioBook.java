/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.ArrayList;

/**
 *
 * @author msa
 */
public class TestAudioBook {
    public static void main(String[] args) {
        ArrayList<String> chapterTitles = new ArrayList<>();
        chapterTitles.add("chaptertitleone");
        ArrayList<String> chapters = new ArrayList<>();
        chapters.add("one");
        AudioBook ab = new AudioBook("", 2023, "1", "audio", "audioFile.mp3", 100,
								"author", "narrator",  chapterTitles, chapters);
        ab.play();
    }
}
