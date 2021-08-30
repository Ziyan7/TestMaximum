package TestMaximum;


public class MaximumFloat <E extends Comparable<E>>{
	
	E number1,number2,number3;  //class variables
	
	//Constructors
	public MaximumFloat(E number1, E  number2, E number3) {
		this.number1=number1;
		this.number2=number2;
		this.number3=number3;
	}
	
	//To get the maximum value
	public E maximum() {
		return MaximumFloat.maximum(number1, number2, number3);
	}
	
	/*@method used to compare between elements
	 * takes 3 Float values
	 * returns maximum of all
	 */
	public static <E extends Comparable<E>> E maximum (E number1,E number2, E number3) {
		E max=number1;     				//initially set maximum to number1, then compare with number2 and number3
		if(number2.compareTo(max)>0) {
			max=number2;
		}
		if(number3.compareTo(max)>0) {
			max=number3;
		}
		printMax(number1, number2, number3,max);
		return max;
	}
	//To print the maximum value
	public static <E> void printMax(E number1,E number2, E number3,E max) {
		System.out.printf("Maximum of %s,%s and %s is %s \n",number1, number2, number3,max);
	}
	
	public static void main(String[] args) {
		//test case 1
		Float num1=7.7f,num2=6.6f,num3=5.5f;
		new MaximumFloat(num1,num2,num3).maximum();
		
		//test case 2
		Float num4=6.6f,num5=7.7f,num6=5.5f;
		new MaximumFloat(num4,num5,num6).maximum();
				
		//test case 3
		Float num7=5.5f,num8=6.6f,num9=7.7f;
		new MaximumFloat(num7,num8,num9).maximum();

	}

}
