package srinu;

public class PrintArrayValues {

	public static void main(String[] args)
	{
	int[]arr=new int[]{1,2,3,4,5,6};
	System.out.println("Elements of given array");//array elements
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	System.out.println("array in revers order:");//revers order
	for(int i=arr.length-1;i>=0;i--)//revers
	{
		System.out.println(arr[i]+" ");//
	}
}
}
