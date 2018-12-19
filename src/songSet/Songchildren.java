package songSet;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import songArrarylist.Song;

public class Songchildren extends Song {

	Songchildren(String t, String a, String r, String b) {
		super(t, a, r, b);
		// TODO Auto-generated constructor stub
		
		Songchildren testdefault = new Songchildren("a", "b", "c", "d");
		testdefault.testdefault();
	}
	
	

}
