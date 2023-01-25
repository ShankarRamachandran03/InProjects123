package com.ineuron;

public class Patterns {

	public static void main(String[] args) {
		int n = 11;
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				if(i==0 || i==n-1 || j==(n-1)/2) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("  ");
			
			for(int j=0; j<n; j++) {
				
				if(j==0 || i==j || j==n-1) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			} 
			System.out.print("  ");
			
			for(int j=0; j<n; j++) {
				
				if(i==0 || i==n-1 || i==(n-1)/2 || j==0)  {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			System.out.print("  ");
			
			for(int j=0; j<n; j++) {
				
				if(j==0 || (i==n-1 && j!=0 && j!=n-1) || j==n-1)  {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("  ");
			
			for(int j=0; j<n; j++) {
				
				if(j==0 || i==0 || i==(n-1)/2 || (j==n-1 && i<=(n-1)/2) || (i==j && i>=(n-1)/2 ) ) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("  ");
			
			for(int j=0; j<n; j++) {
				
				if(i==0 || i==n-1 || j==0 || j==n-1)  {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("  ");
			
			for(int j=0; j<n; j++) {
				
				if(j==0 || i==j || j==n-1) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			} 
			
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				if(i==0 || i==(n-1)/2 || i==n-1 || (j==0 && i<=(n-1)/2) || (j==n-1 && (i>=(n-1)/2)))  {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("  ");
			for(int j=0; j<n; j++) {
				
				if(j==0 || j==(n-1) || i==(n-1)/2)  {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("  ");
			for(int j=0; j<n; j++) {
				
				if(j==0 || j==n-1 || i==0 || i==(n-1)/2)  {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("  ");
			for(int j=0; j<n; j++) {
				
				if(j==0 || j==n-1 || i==j)  {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("  ");
			for(int j=0; j<n; j++) {
				
				if(j==0 || i+j==(n/2)+2 || (i==j) && i>=5 ) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("  ");
			for(int j=0; j<n; j++) {
				
				if(j==0 || j==n-1 || i==0 || i==(n-1)/2)  {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("  ");
			for(int j=0; j<n; j++) {
				
				if(j==0 || i==0 || i==(n-1)/2 || (j==n-1) && i<=(n-1)/2 || (i==j) && i>=(n-1)/2) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int b = 4;
		for(int i=1 ; i<=b ; i++) {
			for(int j=1 ; j<=b ; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
		
        System.out.println();
        System.out.println();
        System.out.println();
        
        int a = 14;
        for(int i=0 ; i<a ; i++) {
            for(int j=0 ; j<a ; j++) {
                if(j == 0 || j== a-1 || i == a-1 || i+j <= (a-1)/2 || j-i >= (a/2) ){
               System.out.print("*");  
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
            
        }
        
        System.out.println();
        System.out.println();
        
        
        for(int i=0 ; i<a ; i++) {
            for(int j=0 ; j<a ; j++) {
                if(i-j >= a/2 || i+j >= (a-1)+(a/2)){
               System.out.print("*");  
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
            
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        for(int i=0 ; i<a ; i++) {
            for(int j=0 ; j<a ; j++) {
                if(i==0 || i== a-1 || i+j <= (a-1)/2 || i-j >= (a-1)/2){
               System.out.print("*");  
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
            
        }
		
		
	}
				
}			
		

	


