package studio3;
import java.util.Scanner;
public class Sieve {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		int [] primeNums;
		boolean prime = true;
		
	
		primeNums = new int[number];
		
		for(int i = 0; i < primeNums.length; i++) 	
		{
		
		prime = true;
		primeNums [i] = i + 1;
			
			int [] oneTen = {2,3,4,5,6,7,8,9};
				
			
				for(int z = 0; z < oneTen.length; z++) {
					int remainder = primeNums [i] % oneTen[z];
					System.out.println(remainder);
					if (remainder == 0) {
						
						prime = false;
					
					}

				}
				
				if (prime = true) {
				//System.out.println(primeNums[i]);
				}

		}
}
}
