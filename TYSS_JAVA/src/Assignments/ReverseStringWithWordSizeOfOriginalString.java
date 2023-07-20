package Assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class ReverseStringWithWordSizeOfOriginalString {
	public static void main(String[] args) {
		String s = "i am a sdet engineer";
		// r ee n igne tedsaami
		LinkedList<Integer> set = new LinkedList();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				set.add(i);
			}
		}
//Rmoving the spaces	
		String[] sp = s.split(" ");
		String wos = "";
		for (int i = 0; i < sp.length; i++) {
			wos = wos + "" + sp[i];
		}

//reverse the string
		String rev = "";
		for (int i = wos.length() - 1; i >= 0; i--) {
			rev = rev + "" + wos.charAt(i);
		}

//Stroring the charecter into array list
		ArrayList<Character> al = new ArrayList<>();
		for (int i = 0; i < rev.length(); i++) {
			al.add(rev.charAt(i));
		}

//putting space
		for (int j = 0; j < set.size(); j++) {
			al.add(set.get(j), ' ');
		}

		for (Character i : al) {
			System.out.print(i);
		}
	}

}
