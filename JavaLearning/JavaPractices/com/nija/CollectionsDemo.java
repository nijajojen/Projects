package com.nija;
import java.util.*;
public class CollectionsDemo {
  public static void main(String[] args) {
	 //Array List //ordered
	  List<String> al= new ArrayList<String>();
	  al.add("Alfie");
	  al.add("Binoy");
	  al.add("Nija");
	  System.out.println("Array List"+al);
	  
	  //LinkedList
	  List<String> l1= new LinkedList<String>();
	  l1.add("Nija");
	  l1.add("Binoy");
	  l1.add("Alfie");
	  System.out.println("Linked List"+ l1);
	  
	  //Hash Set
	  Set<String> s1 = new HashSet<String>();
	  s1.add("Binoy");
	  s1.add("Alfie");
	  s1.add("Nija");
	  s1.add("AlfieBinoy");
	  System.out.println(s1);
	  System.out.println("AlfieBinoy".hashCode());
	  System.out.println("Alfie".hashCode());
	  
	  //Hash Map
	  Map<String, String> m1= new HashMap<String, String>();
	  m1.put("2", "Alfie");
	  m1.put("3", "Nija");
	  m1.put("1", "Binoy");
	  System.out.println(m1);
	  
	  
	  
	  
  }
}
