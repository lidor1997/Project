package tirgul01;

import java.util.Arrays;

public class arraycheck {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		int[]arr2=new int[arr.length*2];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		arr=arr2;
		System.out.println(Arrays.toString(arr));
		System.out.println("before change");
		arr[5]=50;
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------");
		System.out.println(Arrays.toString(arr2));
	}

}
