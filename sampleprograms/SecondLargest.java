package sampleprograms;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {58,5,10,52,51,55,85,23};
		int first=0,second=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second = first;
				first = arr[i];
			}
		}
		System.out.println(second);

		
	}

}
