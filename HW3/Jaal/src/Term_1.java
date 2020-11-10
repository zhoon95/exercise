import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Term_1 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int number = scanner.nextInt();
		int rangeA = scanner.nextInt();
		int rangeB = scanner.nextInt();
		
		int array_1[] = new int[number];
		int array_2[] = new int[rangeB-rangeA+1];
		
		for(int i=0; i<array_1.length; i++)
		{
			array_1[i] = random.nextInt(100);
		}
		
		for(int i=0; i<array_2.length;i++)
		{
			array_2[i] = array_1[i+rangeA-1];
		}
		
		Arrays.sort(array_2);
		int min = array_2[0];
		int max = array_2[rangeB-rangeA];
		int plus = min + max;
		
		System.out.println("최소값 : "+min+" 최댓값 : "+max+" 최소최대 합: "+plus);
		
		

	}

}
