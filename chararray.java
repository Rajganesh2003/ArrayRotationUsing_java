package practice;
/* left ROTATION OF ARRAY
public class chararray
{
	public static void main(String args[]) {
     int array[]= {1,2,3,4,5};
     int tamp=array[0];
      for(int i=1;i<array.length;i++)
      {
    	  array[i-1]=array[i];
    	  
      }
      array[4]=tamp;
     for(int x:array)
     {
    	 System.out.println(x);
     }
		
	}
	
	
	
}
*/ 
//right rotation

import java.util.Scanner;
class chararray {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++)
	{
		int num=scan.nextInt();//12345
		arr[i]=num;//51234
	
	}
	int last=arr[arr.length-1];
	for(int i=arr.length-1;i>0;i--)
	{
		arr[i]=arr[i-1];
	}
	arr[0]=last;
	for(int x: arr)
	{
		System.out.println(x);
	}
	
	
	}
}
