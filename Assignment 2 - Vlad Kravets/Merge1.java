//Vlad Kravets - bc-cisc3130-my9-fall2019

// Here, I merged 2 arrays without using Merge Sort tecnhique but I was able to use Queues


public class Merge {

  // Sample input
  public static int[] input1 = {1,3,5,15,20};
  public static int[] input2 = {2,4,5,6,55};

  public static void main(String[] args){

    // Display Input1
    System.out.println("Input1\t" + Arrays.toString(input1));

    // Create empty queues
    Queue<Integer> queue1 = new LinkedList<Integer>();


    int counter1 = 0, counter2 = 0;
    
    // Traverse both array 
    while (counter1 < input1.length && counter2 < input2.length) 
    { 
        // Check if current element of first 
        // array is smaller than current element 
        // of second array. If yes, store first 
        // array element and increment first array 
        // index. Otherwise do same with second array 
        if (input1[counter1] < input2[counter2]) 
            queue1.add(input1[counter1++]); 
        else
        	queue1.add(input2[counter2++]);
    } 
  
    // Store remaining elements of first array 
    while (counter1 < input1.length) 
    	queue1.add(input1[counter1++]); 
  
    // Store remaining elements of second array 
    while (counter2 < input2.length) 
    	queue1.add(input2[counter2++]); 

    // Save the input string
    String output = "";
    while(queue1.peek() != null ){
      //One by one pop all characters from stack and put them back to string.
      output += Integer.toString(queue1.poll()) + " ";
    }

    // Display reversed as string array
    System.out.println("Output1\t" + "[" + output + "]");

  }
}