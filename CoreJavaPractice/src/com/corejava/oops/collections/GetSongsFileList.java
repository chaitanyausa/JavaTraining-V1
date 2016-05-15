package com.corejava.oops.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetSongsFileList {
	ArrayList<Songs> songsList = new ArrayList<Songs>();

	public void go() throws IOException {
		getSongs();
		System.out.println("");
		//Collections.sort(songsList);
		System.out.println(songsList);
		System.out.println("");
	}

	public void getSongs() throws IOException {
		try {
			File songsFile = new File("F:/Files/Songs.txt");
			BufferedReader reader = new BufferedReader(new FileReader(songsFile));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSongs(line);
			}
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}
	}

	private void addSongs(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Songs songs =  new Songs(tokens[0], tokens[1], tokens[2]);
		songsList.add(songs);

	}
}
