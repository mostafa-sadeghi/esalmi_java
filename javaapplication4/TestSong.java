/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author msa
 */
public class TestSong {
    public static void main(String[] args) {
        Song song = new Song( "songTitle", 2023, "1", "audio", "myfile.mp3", 200, "artist",
			"composer", Song.Genre.POP,  "");
        Song song2 = new Song( "songTitle", 2023, "1", "audio", "myfile.mp3", 200, "artist",
			"composer", Song.Genre.POP,  "");
        song.printInfo();
        song.play();
        int res = song.compareTo(song2);
        System.out.println(res);
    }
}
