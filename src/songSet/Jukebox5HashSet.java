package songSet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import songArrarylist.Song;

public class Jukebox5HashSet {
	ArrayList<Songset> songlist = new ArrayList<Songset>();
	
	public static void main(String[] args)
	{
		new Jukebox5HashSet().go();
	}
	
	class ArtistCompare implements Comparator<Songset>
	{
		@Override
		public int compare(Songset o1, Songset o2) {
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
		
		System.out.println("HashSet-----------------------");
		HashSet<Songset> songset = new HashSet<Songset>();
		songset.addAll(songlist);
		System.out.println("Songset is: " + songset);
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
		Songset addedsong = new Songset(s[0], s[1], s[2], s[3]);
		songlist.add(addedsong);		
	}

}
