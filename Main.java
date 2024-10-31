import java.util.Scanner;
//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] ab = new int[b];
		int p = 0;

		for(int i=a; i<=b; i++){
			int count = 0;
			for(int k=0; k<=i; k++){
				if(k != 0 && i%k == 0){
					count++;
				}
				if(count>2){
					ab[p] = a;
					p++;
					p++;
				}
			}
		}
		for(int i=0; i<=ab.length; i++){
			System.out.println(ab[i],ab[i]);
		}
    }
}