package songSet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Jukebox8TreeSet {

	ArrayList<Songset> songlist = new ArrayList<Songset>();
	
	public static void main(String[] args)
	{
		new Jukebox8TreeSet().go();
	}

	private void go() {
		getsongs();
		System.out.println("1. The songlist is: " + songlist);
		Collections.sort(songlist);
		System.out.println("2. The songlist is: " + songlist);
		
		artistcompare artistc = new artistcompare();
		Collections.sort(songlist, artistc);
		System.out.println("3. The songlist is: " + songlist);
		
		System.out.println("TreeSet-----------------------");
		TreeSet<Songset> songsets = new TreeSet<Songset>();
		songsets.addAll(songlist);
		System.out.println("4. The Treeset songlist is: " + songsets);		
	}
	
	public void getsongs()
	{
		try {
			File file = new File("SongList.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line = null;
			while ( (line = bufferedReader.readLine()) != null )
			{
				addsongs(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void addsongs(String line) {
		String[] tokens = line.split("/");
		Songset addedsong = new Songset(tokens[0], tokens[1], tokens[2], tokens[3]);
		songlist.add(addedsong);
	}
	
	class artistcompare implements Comparator<Songset>
	{

		@Override
		public int compare(Songset o1, Songset o2) {
			// TODO Auto-generated method stub
			return o1.getArtist().compareTo(o2.getArtist());
		}
		
	}
	
}
