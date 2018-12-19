package songSet;

public class Songset implements Comparable<Songset> {
	
	String title;
	String artist;
	String rating;
	String bpm;
	
	public Songset(String t, String a, String r, String b)
	{
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public String getRating()
	{
		return rating;
	}
	
	public String getBpm()
	{
		return bpm;
	}
	
	public String toString()
	{
		return title;
	}

	@Override
	public int compareTo(Songset o) {
		// TODO Auto-generated method stub
		return title.compareTo(o.getTitle());
	}

	public boolean equals(Object asongset)
	{
		Songset s = (Songset) asongset;
		return getTitle().equals(s.getTitle());
	}
	
	public int hashCode()
	{
		return title.hashCode();
	}
	
}
