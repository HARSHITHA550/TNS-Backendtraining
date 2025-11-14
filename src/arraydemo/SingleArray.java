package arraydemo;

import java.util.Arrays;
//Demo for Array implementation
public class SingleArray {

	public static void main(String[] args) {
		
		//create an Array
		//data type array name=new data type
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=25;
		arr[2]=30;
		arr[3]=5;
		arr[4]=15;
		
		//sort the array
		Arrays.sort(arr);
		
		System.out.println("The result for for loop");
		
		//for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements in the array "+arr[i]);
		}
		System.out.println();
		System.out.println("The result for enhanced loop");
		
		
		//Enhanced for loop
		for(int num:arr) {
			System.out.println("Elements in the array "+num);
		}
		

	}

}
