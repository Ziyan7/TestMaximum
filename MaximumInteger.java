package TestMaximum;


public class MaximumInteger <E extends Comparable<E>> {

	E number1,number2,number3;  //class variables
	
	//Constructors
	public MaximumInteger(E number1,E number2,E number3) {
		this.number1=number1;
		this.number2=number2;
		this.number3=number3;
	}
	
	//To get the maximum value
		 public E maximum()
		 {
			 return MaximumInteger.maximum(number1, number2, number3);
		 }
	 
	/*@method used to compare between elements
	 * takes 3 integer values
	 * returns maximum of all
	 */
	public static  <E extends Comparable<E>>  E maximum(E number1,E number2,E number3) 
	{
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
	public static <E> void printMax(E number1, E number2, E number3, E max)
	{
		System.out.printf("Maximum of %s,%s and %s is %s\n",number1, number2, number3,max);
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		//test case 1
		Integer num1=7,num2=6,num3=5;
		new MaximumInteger(num1,num2,num3).maximum();
		
		//Test case 2
		Integer num4=6,num5=7,num6=5;
		new MaximumInteger(num4,num5,num6).maximum();
		
		//Test case 3
		Integer num7=5,num8=6,num9=7;
		new MaximumInteger(num7,num8,num9).maximum();
}

}