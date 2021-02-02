import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[10];
		System.out.println("Enter all the elements");
		
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Ascending Order is :");
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i] + ",");
			
		}
		
			
		
		

	}



	}


