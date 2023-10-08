package cloudVandana_Assignment;

import java.util.Arrays;
import java.util.Random;

public class Array_Shuffle
{
public static void main(String[] args) 
{
	int a[]= {1,2,3,4,5,6,7};
	Random random=new Random();
	for(int i=4;i>0;i--)
	{
		int rnum=random.nextInt(i+1);
		int temp=a[rnum];
		a[rnum]=a[i];
		a[i]=temp;
	}
	System.out.println(Arrays.toString(a));
	}
}

