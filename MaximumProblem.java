package TestMaximum;
import java.util.*;
public class MaximumProblem <E extends Comparable<E>> {
		
		E value1,value2,value3, value4;  //class variables
		
		//Constructors for 3 parameter
		public MaximumProblem(E value1, E  value2, E value3) {
			this.value1=value1;
			this.value2=value2;
			this.value3=value3;
		}
		
		//Constructors for 3 parameter
		public MaximumProblem(E value1, E  value2, E value3, E value4) {
		this.value1=value1;
		this.value2=value2;
		this.value3=value3;
		this.value4=value4;
		}
				
		
		/*@method used to compare between elements
		 * takes 3  values
		 * returns maximum of all
		 */
		public static <E extends Comparable<E>> E maximum (E value1,E value2, E value3) {
			E max=value1;     				//initially set maximum to number1, then compare with number2 and number3
			if(value2.compareTo(max)>0) {
				max=value2;
			}
			if(value3.compareTo(max)>0) {
				max=value3;
			}
			printMax(value1, value2, value3,max);
			return max;
		}
		
		/*@method used to compare between elements
		 * takes 4 values
		 * returns maximum of all
		 */
		public static <E extends Comparable<E>> E maximum (E value1,E value2, E value3,E value4 ) {
			E max=value1;     				//initially set maximum to number1, then compare with number2 and number3
			if(value2.compareTo(max)>0) {
				max=value2;
			}
			if(value3.compareTo(max)>0) {
				max=value3;
			}
			if(value4.compareTo(max)>0) {
				max=value4;
			}
			printMax(value1, value2, value3,value4,max);
			return max;
		}
		//To print the maximum of 3 values
		public static <E> void printMax(E value1,E value2, E value3,E max) {
			
			System.out.printf("Maximum of %s,%s and %s is %s \n",value1, value2, value3,max);
		}
		
		//To print the maximum of 4 values
		public static <E> void printMax(E value1,E value2, E value3,E value4,E max) {
					
			System.out.printf("Maximum of %s,%s,%s and %s is %s \n",value1, value2, value3,value4,max);
		}
		
		
		public static void main(String[] args) {
			
			System.out.println("Enter the number of value i.e. is either 3 or 4");
			Scanner sc = new Scanner(System.in);
			int choice= sc.nextInt();
			sc.close();
			if (choice==3) {
			
				Integer num1=7,num2=6,num3=5;
			    new MaximumProblem(num1,num2,num3).maximum(num1,num2,num3);
			
			
			    Float num4=6.6f,num5=7.7f,num6=5.5f;
			    new MaximumProblem(num4,num5,num6).maximum(num4,num5,num6);
					
			
			    String word7="Apple",word8="Banana",word9="Peach";
			    new MaximumProblem(word7,word8,word9).maximum(word7,word8,word9);
			}

			if(choice==4) {

				Integer num1=7,num2=6,num3=5 ,num10=4;
			    new MaximumProblem(num1,num2,num3,num10).maximum(num1,num2,num3,num10);
			
			
			    Float num4=6.6f,num5=7.7f,num6=5.5f, num11=4.4f;
			    new MaximumProblem(num4,num5,num6,num11).maximum(num4,num5,num6,num11);
					
			
			    String word7="Apple",word8="Banana",word9="Peach",word12="Orange";
			    new MaximumProblem(word7,word8,word9,word12).maximum(word7,word8,word9,word12);
			}
		}

	}