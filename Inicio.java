import java.lang.Character;
import java.util.ArrayList;


public class Inicio {
	
	//-----------
	public static void imprimir(int n[]) {
		
		System.out.println(n.length);
	}
	
	//------------
	public static int[] desafio01(int arr[]) {
		
		int[] res= {0, 0};
		
			for(int i=0; i < arr.length; i++) {
				if(arr[i]>0) {
					res[0]= res[0]+1;
				}else {
					res[1]= res[1]+1;
				}
			}
		
		return res;
	
	}
	
	//Return the number (count) of vowels in the given string..
	public static int desafio03(String s) {
		
		char[] vogais = {'a', 'b', 'c', 'd', 'e'};
		int count=0;
		
		for(int i=0; i < s.length(); i++) {
			
			char character = s.charAt(i);
				for(int j=0; j < vogais.length; j++) {
					if(character==vogais[j]) {
						count++;
					} 
				}
			
		}
		return count;
		
		
	}
	
	
	//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
	public static boolean desafio04(String s) {
		
		if(s.length()!=4 && s.length()!=6) {
			return false;
		}
		
		for(int i=0; i<s.length();i++) {
			
			char c = s.charAt(i);
			if(!Character.isDigit(c)) {
				return false;
			}
		}
				
		return true;
	
	}
	
	//Very simple, given an integer or a floating-point number, find its opposite.
	public static float desafio05(float n) {
		return n*(-1);
	}

	
	//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
	public static void desafio06(String s) {
		
		char p1_lower = s.charAt(0);
		char p2_lower =' ';
		String resultado;
		
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
				if (c==' ') {
					p2_lower = s.charAt(i+1);
				}
			
		}
		
		char p1_upper = Character.toUpperCase(p1_lower);
		char p2_upper = Character.toUpperCase(p2_lower);
		
		resultado = p1_upper + "." + p2_upper;
		
		System.out.println(resultado);
	}
	
	//Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
	public static void desafio07(String s, String end) {
	    
	  int end_qtd = end.length();
	  String resultado = s.substring(s.length()-end_qtd, s.length());
	  System.out.println(s.substring(s.length()-end_qtd, s.length()).equals(end));
  
	  
	}
	
	//Your goal is to create a function that removes the first and last characters of a string.
	public static void desafio08(String s) {
		
		String res =  s.substring(1,s.length()-1);
		System.out.println(res);
	}	
	
	//return the middle character of the word. If the word's length is odd, return the middle character. 
	//If the word's length is even, return the middle 2 characters
	public static void desafio09(String s) {
		
		String res="";
		
		if(s.length()%2==0) {
			char b = s.charAt((s.length()/2)-1);
			char c = s.charAt((s.length()/2));
			res = res+b+c;
			
		}else {
			char c = s.charAt((s.length()/2));
			res = res+c;
		}
		
		
		System.out.println(res);
		
	}
	
	//Complete the function that accepts a string parameter, and reverses
	public static void desafio10(String s) {
		
		String res="";
		
		for(int i=s.length()-1; i>=0;i--) {
			res = res + s.charAt(i);
		}
		
		System.out.println(res);
		
	}
	
	//Like system facebook
	public static void desafio11(String[] arr) {
		
		int count=0;
		String res="";
		
		
		 for (String s : arr) {
			 count++;
		 }
		 
		 if(count==0) {
			 res = res + "no one ";
		 }
		 
		 if(count>3) {
			 
			 int limite=3;
			 
			 for (String s : arr) {
				 if(limite>0) {
					 res = res + s + " and ";
				 }
				 limite--;
				
			 }
			 
			 limite--; 
			 res = res.substring(0,res.length()-4);
			 res = res + " and " + (count-3) + " others ";
		 }else {
			 
			 for (String s : arr) {
				 res = res + s + " and ";				 
			 }
			 
			 if(count!=0) {
				 res = res.substring(0,res.length()-4);
			 }
		 }
		 
	
		 res = res + "likes this.";
		 
		 System.out.println(res);
		 
	}
	
	//Given an array of ones and zeroes, convert the equivalent binary value to an decimal.
	public static void desafio12(double[] arr) {
		
		double res=0;
		double aux_pow=arr.length-1;
		
		for(int i=0; i<arr.length;i++) {
			
			res = res + arr[i]*Math.pow(2, aux_pow);
			aux_pow--;
		
		}
		
		System.out.println(res);
		
	}

	
	//accepts 3 integer values a, b, c. The function should return true if a triangle can be built with the sides of given length.
	public static void desafio13(int a, int b, int c) {
		
		if( (a+b>c)&&(a+c>b)&&(b+c>a)) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		
	}
	
	
	//Complete the solution so that it splits the string into pairs of two characters and use '_' if last char is alone
	public static void desafio14(String s) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0; i<s.length();i++) {
			
			String res="";
			
			if(i!=s.length()-1) {
				char c1= s.charAt(i);
				char c2= s.charAt(i+1);
				res = res+c1+c2;
				arr.add(res);
				i++;
			}else {
				char c1= s.charAt(i);
				char c2= '_';
				res = res+c1+c2;
				arr.add(res);
				i++;
			}
			
		}
		
		
		
	}
	
	//"(" if that character appears only once in the original string, or ")" if that character appears more than once
	public static void desafio15(String s) {
		
		String res="";
		
		for(int i=0; i<s.length();i++) {
			
			char c = s.charAt(i);
			
			int count=0;
			
			for(int j=0; j<s.length();j++) {
				if(c == s.charAt(j)) {
					count++;
				}
			}
			
			if(count==1) {
				res = res+"(";
			}else {
				res = res+")";
			}
			
		}
	
		System.out.println(res);
	
	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {

		
		
	}

}



