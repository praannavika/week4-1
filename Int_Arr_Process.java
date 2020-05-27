package week4;

//public class Int_Arr_Process {
	import java.util.Scanner;
	import java.util.Arrays;
	class Int_Arr_Process
	{
	    int size;int array[];
	    Scanner scanner = new Scanner(System.in);
	    Int_Arr_Process()
	    {
	        this.size= 10;
	        array=new int[10];
	    }
	    Int_Arr_Process(int x)
	    {
	        this.size=x;
	        array=new int[size];
	    }
	    Int_Arr_Process(Int_Arr_Process copy)
	    {
	        this.size=copy.size;
	        this.array=copy.array;
	    }
	    void readData()
	    {
	        System.out.println("Enter the elements into the array:");
	        for(int i=0;i<array.length;i++)
	        {
	            array[i]=scanner.nextInt();
	        }
	    }
	    void displayDataVertically()
	    {
	        System.out.println("Entered elements into the array vertically :");
	        for(int i=0;i<array.length;i++)
	        {
	            System.out.println(array[i]);
	        }
	    }
	    void displayDataHorizontally()
	    {
	        System.out.println("Entered elements into the array horizontally :");
	        for(int i=0;i<array.length;i++)
	        {
	            System.out.print(array[i]+" ");
	        }
	    }
	    void sortArray()
	    {
	        Arrays.sort(array);
	    }
	    int smallest()
	    {
	        return array[0];
	    }
	    int largest()
	    {
	        return array[size-1];
	    }
	    int sum()
	    {
	        int res=0;
	        for(int i=0;i<array.length;i++)
	        {
	            res=res+array[i];
	        }
	        return res;
	    }
	    int k;
	    int secondBiggest()
	    {
	        int m=array[size]-1;
			for(int i=array[size]-2;i>=0;i--) {
				if(array[i]!=m) {
	               int k=  array[i];
	                break;
	            }

	    }
			return k;
	}

}
