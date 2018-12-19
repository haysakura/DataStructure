package songArrarylist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox5 {
	ArrayList<Song> songlist = new ArrayList<Song>();
	
	public static void main(String[] args)
	{
		new Jukebox5().go();
	}
	
	class ArtistCompare implements Comparator<Song>
	{
		@Override
		public int compare(Song o1, Song o2) {
			// TODO Auto-generated method stub
			return o1.getArtist().compareTo(o2.getArtist());
		}		
	}

	private void go() {
		getSongs();
		System.out.println(songlist);
		Collections.sort(songlist);
		System.out.println(songlist);	
		
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songlist, artistCompare);
		System.out.println(songlist);
	}
	
	private void getSongs()
	{
		try {
			File file = new File("SongList.txt");
			BufferedReader b = new BufferedReader(new FileReader(file));
			String line = null;
			while ( (line = b.readLine()) != null )
			{
				addsongs(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void addsongs(String line) {
		String[] s = line.split("/");
		Song addedsong = new Song(s[0], s[1], s[2], s[3]);
		songlist.add(addedsong);		
	}

}
