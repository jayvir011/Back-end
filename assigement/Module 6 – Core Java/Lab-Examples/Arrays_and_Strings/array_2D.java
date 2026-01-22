package Arrays_and_Strings;

public class array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int sub=0;
		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of all elements in 2D array: "+sum);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum-=arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sub of all elements in 2D array: "+sub);
            

	}

}
