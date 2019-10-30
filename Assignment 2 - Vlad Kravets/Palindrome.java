//Vlad Kravets - bc-cisc3130-my9-fall2019

import java.util.*;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		do {
			Stack<Character> stack = new Stack<Character>();
			System.out.print("Enter: ");
			String string = sc.nextLine();
			char original [] = new char [50];
			int inputSize = 0;
    
			original = fillTheStack(string, stack);      //fill the stack & create array of 
														// characters
			inputSize = stack.size(); 				// length of the entered word
			boolean result = compareForPalindrome(original, stack, inputSize); 
                                                  // compare original array of 
                                                 // elements with reversed elements 
                                                 // in the stack
    
			System.out.print("Checking.." + "\nIs < " + string + 
							" > a Palindrome: " + result
							+ "\n\nEnter again??(y/n): ");
			
			choice = sc.next().charAt(0);
			String garbage = sc.nextLine();
			
		}while(choice == 'y' || choice == 'Y' );
		
		sc.close();
	}
	
	private static char[] fillTheStack(String s, Stack<Character> stack) {
		char temp = '\0';
		char array[] = new char[50]; 
		for(int i = 0; i < s.length(); i++){
			temp = s.charAt(i);   // get an element
			
			if (Character.isLetter(temp) == true && Character.isUpperCase(temp) == true)
				temp = upperToLowerCase(temp);
			if (temp == ' ') continue; // to skip spaces

			stack.push(temp);     // push it to the stack
			array[i] = temp;      // save it to char array
		}
		return array;
	}

	private static boolean compareForPalindrome(char array[], Stack<Character> stack, int numOfElements) {
		boolean result = false;
		char ch1, ch2;                      		// temp vars
		numOfElements = (numOfElements / 2) - 1;    // last index that'll be checked; 
                                        			// to avoid middle point with odd numbers
                                        			// decrement to count from index 0
    
		for(int i = 0; i <= numOfElements; i++) {
			ch1 = array[i];                   // obtain front element from array
			ch2 = stack.pop();                // pop out rear element from stack
			if(ch1 == ch2)
				result = true;
			else {
				result = false;
				return result;
			}
	}

	return result;
  }

	private static char upperToLowerCase(char c) {
		int ascii = (int) c;        // turn char into ascii representation
		ascii +=32;                 // diff between Uppercase & LOwercase in ascii is 32
                                // e.g. A = 65, a = 97
		char lowerCase = (char) ascii;
		return lowerCase;
  }



}
