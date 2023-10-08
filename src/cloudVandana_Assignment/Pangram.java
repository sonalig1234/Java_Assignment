package cloudVandana_Assignment;

import java.util.Arrays;
import java.util.Scanner;
public class Pangram 
{
	public static void main(String[] a1) 
		{
		  String s1="How vexingly quick daft zebras jump!";;//helo
		  s1=s1.toLowerCase(); 
		  char[]c1=s1.toCharArray();//[h,e,l,l,o];
		   String s2="";
		   
		   for(int i=0;i<c1.length;i++)
		   {
			   int c=0;//1
			   
			   for(int j=i+1;j<c1.length;j++)
			   {
				  if(c1[i]==c1[j]) 
				  {
					  c++;
				  }
			   }
			   if(c==0)
			   {
				   s2=s2+c1[i];
				   
			   }
		   }
		   char[]c2=s2.toCharArray();
		   Arrays.sort(c2);
		   char ch='a';
		   int count=0;
		   do
		   {
			   for(int i=0;i<c2.length;i++)
			   {
				   if(ch==c2[i])
				   {
					   count++;
					   break;
				   }
				   
			   }
		   }
		   while(++ch<='z');
		  if(count==26)
		  {
			  System.out.println("pangram");
		
		  }
		  else
		  System.out.println("not pangram");
		   
	   }
		   

	}

