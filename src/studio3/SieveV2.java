package studio3;
import java.util.Scanner;
public class SieveV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		boolean [] primeNums;
		boolean prime = true;
		double Stupid = 0;
		
		primeNums = new boolean[number];
		
		for(int i = 0; i < primeNums.length; i++) 	
		{
		primeNums [i] = true;
		}
		
		
		
			for (int i = 0; i < Math.sqrt(primeNums.length); i++) {
			
					if (primeNums[i] == true) {
					
							for (int j = 0; j < Math.sqrt(primeNums.length); j++) {
							Stupid = (i*i)+(j*i);
							
								if (Stupid < number) {
								primeNums [i] = false;
								}
								
							}	
					}
					if (primeNums [i] == true) {
						System.out.println(i);
					}
					
			}
			
			
		
		
		}
		
		
	}
	


