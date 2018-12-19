package songArrarylist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1try {
	
	ArrayList<Song> songlist = new ArrayList<Song>();
	
	public static void main(String[] args)
	{
		new Jukebox1try().go();
	}

	private void go() {
		getsongs();
		System.out.println(songlist);	
		Collections.sort(songlist);
		System.out.println(songlist);
	}

	private void getsongs() {		
		try {
			File file = new File("SongList.txt");
			BufferedReader bfreader = new BufferedReader(new FileReader(file));
			String line = null;
			while ( (line = bfreader.readLine()) != null )
			{
				addSong(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void addSong(String line) {
		String[] tokens = line.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songlist.add(nextSong);		
	}

}
