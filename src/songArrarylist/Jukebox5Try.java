package songArrarylist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox5Try {
	
	ArrayList<Song> arrayList = new ArrayList<Song>();
	
	public static void main(String[] args)
	{
		new Jukebox5Try().go();
	}

	private void go() {
		getsongs();
		System.out.println("1. the songlist is: " + arrayList);
		Collections.sort(arrayList);
		System.out.println("2. the songlist is: " + arrayList);
		artistcomaparator artistcom = new artistcomaparator();
		Collections.sort(arrayList, artistcom);
		System.out.println("3. the songlist is: " + arrayList);
	}
	
	class artistcomaparator implements Comparator<Song> {
		@Override
		public int compare(Song o1, Song o2) {
			// TODO Auto-generated method stub
			return o1.getArtist().compareTo(o2.getArtist());
		}
	}

	private void getsongs()
	{
		
		try {
			File file = new File("SongList.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line = null;
			while ( (line = bufferedReader.readLine()) != null )
			{
				addsong(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	private void addsong(String line) {
		String[] tokens = line.split("/");
		Song addedsong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		arrayList.add(addedsong);
	}
	
}
