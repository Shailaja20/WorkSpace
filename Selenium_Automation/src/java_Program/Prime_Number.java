package java_Program;

public class Prime_Number {
	int number;
	int m;
	
	public void PrimeNumber(int number)
	{
		int m=number%2;
		if(m!=0)
		{
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not a Prime NUmber");
		}
	}
	

	public static void main(String[] args) {
		Prime_Number prime=new Prime_Number();
		prime.PrimeNumber(35);
		prime.PrimeNumber(70);

	}

}