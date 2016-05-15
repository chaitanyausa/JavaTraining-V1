package com.corejava.oops.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortTest  {
	static final Comparator<Songs> rehaman = new Comparator<Songs>(){
		 public int compare(Songs s1, Songs s2) {
             return s1.getMovieName().compareTo(s2.getMovieName());
         }

		
	};

	
	public static void main(String[] args){
		
	}

	
}
