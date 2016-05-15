package com.corejava.oops.collections;

import java.util.Comparator;

public class Songs implements Comparator<Songs> {
	
	private String title;
	private String artist;
	private String movieName;

	public Songs(){
		
	}
	public Songs(String title, String artist, String movieName) {
		this.title = title;
		this.artist = artist;
		this.movieName = movieName;
	}
	
	@Override
	public String toString() {
		return "Songs [title=" + title + ", artist=" + artist + ", movieName=" + movieName + "]/n";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Songs other = (Songs) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/*public int compareTo(Songs sng) {
	// TODO Auto-generated method stub
		return movieName.compareTo(sng.getTitle());
	}*/
	@Override
	public int compare(Songs o1, Songs o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
