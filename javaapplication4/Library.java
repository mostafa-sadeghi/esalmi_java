/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author msa
 */
public class Library {
    private ArrayList<Song> 		songs; 
	private ArrayList<AudioBook> 	audiobooks;
	private ArrayList<Playlist> 	playlists; 
	
  //private ArrayList<Podcast> 	podcasts;
	
	// Public methods in this class set errorMesg string 
	// Error Messages can be retrieved from main in class MyAudioUI by calling  getErrorMessage()
	// In assignment 2 we will replace this with Java Exceptions
	String errorMsg = "";
	
	public String getErrorMessage()
	{
		return errorMsg;
	}

	public Library()
	{
		songs 		= new ArrayList<Song>(); 
		audiobooks 	= new ArrayList<AudioBook>(); 
		playlists       = new ArrayList<Playlist>();
	  //podcasts		= new ArrayList<Podcast>(); ;
	}
	/*
	 * Download audio content from the store. Since we have decided (design decision) to keep 3 separate lists in our library
	 * to store our songs, podcasts and audiobooks (we could have used one list) then we need to look at the type of
	 * audio content (hint: use the getType() method and compare to Song.TYPENAME or AudioBook.TYPENAME etc)
	 * to determine which list it belongs to above
	 * 
	 * Make sure you do not add song/podcast/audiobook to a list if it is already there. Hint: use the equals() method
	 * If it is already in a list, set the errorMsg string and return false. Otherwise add it to the list and return true
	 * See the video
	 */
	public boolean download(AudioContent content)
	{
		return true;
	}
	
	// Print Information (printInfo()) about all songs in the array list
	public void listAllSongs()
	{
		for (int i = 0; i < songs.size(); i++)
		{
			int index = i + 1;
			System.out.print("" + index + ". ");
			songs.get(i).printInfo();
			System.out.println();	
		}
	}
	
	// Print Information (printInfo()) about all audiobooks in the array list
	public void listAllAudioBooks()
	{
		for (int i = 0; i < audiobooks.size(); i++)
		{
			int index = i + 1;
			System.out.print("" + index + ". ");
			songs.get(i).printInfo();
			System.out.println();	
		}
	}
	
  // Print Information (printInfo()) about all podcasts in the array list
	public void listAllPodcasts()
	{
//		for (int i = 0; i < podcasts.size(); i++)
//		{
//			int index = i + 1;
//			System.out.print("" + index + ". ");
//			songs.get(i).printInfo();
//			System.out.println();	
//		}
	}
	
  // Print the name of all playlists in the playlists array list
	// First print the index number as in listAllSongs() above
	public void listAllPlaylists()
	{
            
                    for (int i = 0; i < playlists.size(); i++)
		{
			int index = i + 1;
			System.out.print("" + index + ". ");
			songs.get(i).printInfo();
			System.out.println();	
		}
		
	}
	
  // Print the name of all artists. 
	public void listAllArtists()
	{
		// First create a new (empty) array list of string 
		// Go through the songs array list and add the artist name to the new arraylist only if it is
		// not already there. Once the artist arrayl ist is complete, print the artists names
            ArrayList<String> ar = new ArrayList<>();
            for (int i = 0; i < songs.size(); i++) {
                if(!ar.contains(songs.get(i).getArtist())){
                    ar.add(songs.get(i).getArtist());
                }
                
            }
            for (int i = 0; i < ar.size(); i++) {
                System.out.println(ar.get(i));
                
            }
            
		
	}

	// Delete a song from the library (i.e. the songs list) - 
	// also go through all playlists and remove it from any playlist as well if it is part of the playlist
	public boolean deleteSong(int index)
	{
            Song s = songs.remove(index);
            for (int i = 0; i < playlists.size(); i++) {
                ArrayList<AudioContent> ao = playlists.get(i).getContent();
                for (int j = 0; j < ao.size(); j++) {
                    if(ao.get(j).getType() == "SONG"){
                       if(ao.get(j).equals(s)){
                           playlists.remove(i);
                       }
                    }
                }
            }
               
                
            
            
            
            return false;
	}
	
  //Sort songs in library by year
	public void sortSongsByYear()
	{
		// Use Collections.sort() 
            songs.sort(Comparator.comparing(Song ::getYear));
	
	}
  // Write a class SongYearComparator that implements
	// the Comparator interface and compare two songs based on year
	private class SongYearComparator implements Comparator
	{

        @Override
        public int compare(Object o1, Object o2) {
            Song s1 = (Song) o1;
            Song s2 = (Song) o2;
            if(s1.getYear() == s2.getYear()){
                return 1;
            }
            return 0;
        }
		
	}

	// Sort songs by length
	public void sortSongsByLength()
	{
	 // Use Collections.sort()
            songs.sort(Comparator.comparing(Song ::getLength));
	}
  // Write a class SongLengthComparator that implements
	// the Comparator interface and compare two songs based on length
	private class SongLengthComparator implements Comparator
	{

        @Override
        public int compare(Object o1, Object o2) {
            Song s1 = (Song) o1;
            Song s2 = (Song) o2;
            if(s1.getLength() == s2.getLength()){
                return 1;
            }
            return 0;
        }
		
	}

	// Sort songs by title 
	public void sortSongsByName()
	{
	  // Use Collections.sort()
		// class Song should implement the Comparable interface
		// see class Song code
            songs.sort(Comparator.comparing(Song ::getTitle));
	}

	
	
	/*
	 * Play Content
	 */
	
	// Play song from songs list
	public boolean playSong(int index)
	{
		if (index < 1 || index > songs.size())
		{
			errorMsg = "Song Not Found";
			return false;
		}
		songs.get(index-1).play();
		return true;
	}
	
	// Play podcast from list (specify season and episode)
	// Bonus
	public boolean playPodcast(int index, int season, int episode)
	{
		return false;
	}
	
	// Print the episode titles of a specified season
	// Bonus 
	public boolean printPodcastEpisodes(int index, int season)
	{
		return false;
	}
	
	// Play a chapter of an audio book from list of audiobooks
	public boolean playAudioBook(int index, int chapter)
	{
		
            AudioBook ak = audiobooks.get(index);
            ak.selectChapter(chapter);
            ak.play();
            return true;
	}
	
	// Print the chapter titles (Table Of Contents) of an audiobook
	// see class AudioBook
	public boolean printAudioBookTOC(int index)
	{
            AudioBook ab =audiobooks.get(index);
            ArrayList<String> ch =  ab.getChapterTitles();
            for (int i = 0; i < ch.size(); i++) {
                System.out.println(ch.get(i)); 
            }
            
            return true;
	}
	
  /*
   * Playlist Related Methods
   */
	
	// Make a new playlist and add to playlists array list
	// Make sure a playlist with the same title doesn't already exist
	public boolean makePlaylist(String title)
	{
            boolean exists = false;
            Playlist new_play_list = new Playlist(title);
            for (int i = 0; i < playlists.size(); i++) {
                if(playlists.get(i).equals(new_play_list)){
                    exists = true;
                }
            }
            if(!exists){
              playlists.add(new_play_list);  
            }
            
            return true;
	}
	
	// Print list of content information (songs, audiobooks etc) in playlist named title from list of playlists
	public boolean printPlaylist(String title)
	{
            boolean exists = false;
            int play_list_index = 0;
            Playlist new_play_list = new Playlist(title);
            for (int i = 0; i < playlists.size(); i++) {
                if(playlists.get(i).equals(new_play_list)){
                    exists = true;
                }
            }
            if(exists){
               playlists.get(play_list_index).printContents(); 
            }
            return true;
	}
	
	// Play all content in a playlist
	public boolean playPlaylist(String playlistTitle)
	{
		boolean exists = false;
            int play_list_index = 0;
            Playlist new_play_list = new Playlist(playlistTitle);
            for (int i = 0; i < playlists.size(); i++) {
                if(playlists.get(i).equals(new_play_list)){
                    exists = true;
                }
            }
            if(exists){
               playlists.get(play_list_index).playAll(); 
            }
            return true;
	}
	
	// Play a specific song/audiobook in a playlist
	public boolean playPlaylist(String playlistTitle, int indexInPL)
	{
		boolean exists = false;
            int play_list_index = 0;
            Playlist new_play_list = new Playlist(playlistTitle);
            for (int i = 0; i < playlists.size(); i++) {
                if(playlists.get(i).equals(new_play_list)){
                    exists = true;
                }
            }
            if(exists){
               playlists.get(play_list_index).play(indexInPL); 
            }
            return true;
	}
	
	// Add a song/audiobook/podcast from library lists at top to a playlist
	// Use the type parameter and compare to Song.TYPENAME etc
	// to determine which array list it comes from then use the given index
	// for that list
	public boolean addContentToPlaylist(String type, int index, String playlistTitle)
	{
            if(type == Song.TYPENAME){
                Playlist pl = new Playlist(playlistTitle);
              pl.addContent(songs.get(index));
              playlists.add(pl);
              return true;
            }
            
            
            return false;
	}

  // Delete a song/audiobook/podcast from a playlist with the given title
	// Make sure the given index of the song/audiobook/podcast in the playlist is valid 
	public boolean delContentFromPlaylist(int index, String title)
	{
            if((index >= 0)&&(index < playlists.size())){
               Playlist pl = playlists.get(index); 
               ArrayList<AudioContent> ac_array_list = pl.getContent();
                for (int i = 0; i < ac_array_list.size(); i++) {
                    if (ac_array_list.get(i).getTitle() == title) {
                       ac_array_list.remove(index);
                        return true;
                    }
                }
               
            }
            
            
            return false;
	}
}
