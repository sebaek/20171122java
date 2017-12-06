package array;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 6, 7};
		String[] stringArray = {"웬디", "아이린", "지수", "로제"};
		int[] intArray2 = new int[5];
		intArray2[0] = 2872;
		intArray2[1] = 22;
		
		for (int item : intArray2) {
			System.out.println(item);
		}
		
		String[] strArry = new String[3];
		strArry[0] = "리사";
		/*
		String[] newArray = new String[4];
		
		for (int i = 0; i < strArry.length; i++) {
			newArray[i] = strArry[i];
		}
		*/
		String[] newArray = Arrays.copyOf(strArry, 4);
		newArray[3] = "제니";
		
		for (String s : newArray) {
			System.out.println(s);
		}
		
		
		for (String item : strArry) {
			System.out.println(item);
		}
		
		int[][] matrix = new int[3][];
		
		matrix[0] = new int[2];
		matrix[1] = new int[7];
		matrix[2] = new int[10];
		
		matrix[0][1] = 5;
		
		
		
		
		
	}
	
}



