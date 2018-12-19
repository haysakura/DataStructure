package songArrarylist;

public class Song implements Comparable<Song> {
	
	String title;
	String artist;
	String rating;
	String bpm;
	
	public Song(String t, String a, String r, String b)
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
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return title.compareTo(o.getTitle());
	}

	private void testprivate()
	{
		System.out.println("Test if the children can get the private decorator method.");
	}
	
	protected void testdefault()
	{
		System.out.println("Test if the children can get the default decorator method.");
	}
	
}
