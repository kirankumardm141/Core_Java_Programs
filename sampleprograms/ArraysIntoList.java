package sampleprograms;

import java.util.Arrays;
import java.util.List;

public class ArraysIntoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[] = {7,14,21,28,35};
		
		
		// OR
		/*Integer arr[] = new Integer[5];
		int j=0;
		for(int i=7;i<=35;i=i+7)
		{
			arr[j]=i;
			j++;
		}*/
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		List<Integer> asList = Arrays.asList(arr);
		
		System.out.println(asList);
		
		Object[] array = asList.toArray();
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
