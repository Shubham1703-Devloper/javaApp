package MainUI;

import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACS
 */

public class cipertext {
 
	  public String alphavate = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
public String encript(String plainText,int key){

	String cipertext="";
	plainText = plainText.toUpperCase();
	for(int i=0;i<plainText.length();i++){
		char ch=plainText.charAt(i);
		int charIndex = alphavate.indexOf(ch);
		
                int encriptionindex = Math.floorMod(charIndex+key,alphavate.length() );
		cipertext += alphavate.charAt(encriptionindex);
	}
	 return cipertext;
  }
 
  public String decript(String cipertext,int key){
      String plainText="";
	plainText = plainText.toUpperCase();
	for(int i=0;i<cipertext.length();i++){
		char ch=cipertext.charAt(i);
		int charIndex = alphavate.indexOf(ch);
		
                int encriptionindex = Math.floorMod(charIndex-key,alphavate.length() );
		plainText += alphavate.charAt(encriptionindex);
	}
      return plainText;
  }
 // public static void main(String[] args){
	  //cipertext c = new cipertext();
	 // String s1 = ;
         // String s2 = ;
          //String cipertext1 = c.encript(s1,3);
           //String cipertext2 = c.encript(s2,3);
          //System.out.println(cipertext);
          
          //System.out.println(c.decript(cipertext,3));

  
}
  


