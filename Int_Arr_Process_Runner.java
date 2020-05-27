package week4;

//public class Int_Arr_Process_Runner {
	import java.util.Scanner;

public	class Int_Arr_Process_Runner
	{
	    public static void main(String[] args) {
	        System.out.println("Do you want to enter the size of array ? y/n");
	        Scanner sc = new Scanner(System.in);
	        char option=sc.next().charAt(0);
	        if(option=='y')
	        {
	        System.out.println("Enter the size of the array");
	        int x=sc.nextInt();
	       // Int_Arr_Process ob1 = new Int_Arr_Process();
	        Int_Arr_Process ob2= new Int_Arr_Process();
	        ob2.readData();
	        ob2.displayDataVertically();
	        ob2.displayDataHorizontally();
	        ob2.sortArray();
	        System.out.println(" ");
	        System.out.println();
	        System.out.println(ob2.smallest());
	        System.out.println(ob2.largest());
	        System.out.println(ob2.sum());
	        System.out.println(ob2.secondBiggest());
	        }
	        else
	        {
	            System.out.println("Array takes the default size of 10");
	            Int_Arr_Process ob = new Int_Arr_Process();
	            ob.readData();
	            ob.displayDataVertically();
	            ob.displayDataHorizontally();
	            ob.sortArray();
	            System.out.println(" ");
	            System.out.println(ob.smallest());
	            System.out.println(ob.largest());
	            System.out.println(ob.sum());
	            System.out.println(ob.secondBiggest());
	        

	        }
	        
	    }
	}

