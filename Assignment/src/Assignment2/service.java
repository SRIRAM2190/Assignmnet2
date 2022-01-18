package Assignment2;


import java.util.*;

public class service {
	
	public void GreatestNumber() {
		int size,temp;
		int primecheck=0,squarecheck=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the size of the array");
		size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("pls enter the "+size+"elements");
		
		//Getting the array elements
		
			for(int i=0;i<size;i++) {
				
				a[i]=scan.nextInt();
			}
		
		//sorting the array elements
			
			for(int i=0;i<size;i++) {
				
			for(int j=i+1;j<size;j++) {
		
					if(a[i]>a[j]) {
						
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
		}
		
		int big_num=a[size-1];
		
		
		//checking for prime number
		
		for(int i=2;i<=a[size-1];i++) {
			
			if(a[size-1]%i==0) {
				
				primecheck++;
				}
			}
		
		//Checking for the perfect square
		
		
		for(int j=1;j<a[size-1];j++) {
			
			if(a[size-1]==j*j) {
				
				squarecheck++;
			}
			
		}
		
		//conditions checkings and print the appropriate 
		
		if(primecheck==1) {
		//if its prime number ignore it	
			
			
		}
		else if(squarecheck>0) {
			System.out.println("Great Number is "+a[size-1]);
		}
		
		else {
			System.out.println(a[size-1]);
		}
		
		
		System.out.println("program finished here");		
		scan.close();	
}
	

	
	

}
