package ais;

import java.util.ArrayList;

public class BCell {
	
	ArrayList<String> subject;
	ArrayList<String> sender;
	
	public ArrayList<String> getSet(){
		ArrayList<String> ret = sender;
		for(String element:subject){
			ret.add(element);
		}
		return ret;
	}
	

}
