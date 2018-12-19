package songArrarylist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {
	
	ArrayList<String> songlist = new ArrayList<String>();
	
	public static void main(String[] args)
	{
		new Jukebox1().go();
		
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
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null)
			{
				addSong(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		songlist.add(tokens[0]);
	}

}
