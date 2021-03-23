package com.revstring;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringExample {
	
	 static StringBuffer reverseStringBuffer(String s){
		 StringBuffer sb=new StringBuffer(s);
		 StringBuffer rev=sb.reverse();
		 return rev ;
		 
	 }

	 static StringBuilder reverseStringBuilder(String s){
		 
		 StringBuilder sb=new StringBuilder(s);
		 StringBuilder rev=sb.reverse();
		 return rev ;
				 
	 }
	 static String charAtMethod(String s){
		 int leng=s.length();
		String rev="";
		for(int i=leng-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		 return rev;
	 }
	static String charArrayMethod(String s){
		char[] array=s.toCharArray();
		String rev="";
		for(int i=array.length-1;i>=0;i--){
			rev=rev+array[i];
			}
		return rev;
	}
	static String reverseRecursion(String s){
		if(s.length()<2){
			return s;
		}
		return reverseRecursion(s.substring(1))+s.charAt(0);
	}
	 static void collectionsReverseMethod(){
		ArrayList<String> l=new ArrayList();
		l.add("ABC");
		l.add("XYZ");
		l.add("PQR");	
		Collections.reverse(l);
		System.out.println("Using collectionsReverseMethod() method : " + l);
	}
	public static void main(String[] args) {
		
		String s="Java Program";
		System.out.println("Using StringBuffer reverse() method : " +reverseStringBuffer(s));
		System.out.println("Using StringBuilder reverse() method : " +reverseStringBuilder(s));
		System.out.println("Using charAt() method : " +charAtMethod(s));
		System.out.println("Using charArray() method : " +charArrayMethod(s));
		System.out.println("Using reverseRecursion() method : " +reverseRecursion(s));
		collectionsReverseMethod();

	}

}
