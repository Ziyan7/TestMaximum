package TestMaximum;

public class MaximumString<E extends Comparable<E>> {

E string1,string2,string3;  //class variables
	
	//Constructors
	public MaximumString(E string1, E  string2, E string3) {
		this.string1=string1;
		this.string2=string2;
		this.string3=string3;
	}
	
	//To get the maximum value
	public E maximum() {
		return MaximumString.maximum(string1, string2, string3);
	}
	
	/*@method used to compare between elements
	 * takes 3 String values
	 * returns maximum of all
	 */
	public static <E extends Comparable<E>> E maximum (E string1,E string2, E string3) {
		E max=string1;     				//initially set maximum to number1, then compare with number2 and number3
		if(string2.compareTo(max)>0) {
			max=string2;
		}
		if(string3.compareTo(max)>0) {
			max=string3;
		}
		printMax(string1, string2, string3,max);
		return max;
	}
	//To print the maximum value
	public static <E> void printMax(E string1,E string2, E string3,E max) {
		System.out.printf("Maximum of %s,%s and %s is %s\n",string1, string2, string3,max);
	}
	
	public static void main(String[] args) {
		//test case 1
		String word1="Peach",word2="Banana",word3="Apple";
		new MaximumString(word1,word2,word3).maximum();
		
		//test case 2
		String word4="Apple",word5="Peach",word6="Banana";
		new MaximumString(word4,word5,word6).maximum();
				
		//test case 3
		String word7="Apple",word8="Banana",word9="Peach";
		new MaximumString(word7,word8,word9).maximum();

	}

}
