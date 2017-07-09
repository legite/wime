package main;
/**
 * @le
 */
import java.util.Scanner;

public class AB {

	public static int[] getSub(int n, int k) {
		int m = 0;
		int x = -1;
		//int[] a = new int[2];
		for(int i = 0; i < n; i ++){
			if(k > i * (n - i)){
				m += 1;
			}else{
				x = k - (m - 1) * (n - m - 1);
				int[] a = {m, x};
				return a;
			}
		}
		int[] a = {m, x};
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		in.close();
		int[] b = getSub(n, k);
		int m = b[0];
		int x = b[1];
		if(x < 0){
			System.out.println("");
		}else{
			//String str1;
			//String str2;
			char[] ab = new char[n];
			String str;
			if(x == 0){
				for(int i = 0; i < n; i ++){
					ab[i] =  'A';
				}
				str = String.valueOf(ab);
				System.out.println(str);
			}else if(m == 1){
				for(int i = 0; i < n; i ++){
					ab[i] =  'A';
				}
				ab[x] = 'B';
				str = String.valueOf(ab);
				System.out.println(str);
			}else{
				for(int i = 0; i < n; i ++){
					ab[i] =  'A';
				}
				ab[x] = 'B';
				for(int i = n -1; i > n -2 - m; i --){
					ab[i] = 'B';
				}
				str = String.valueOf(ab);
				System.out.println(str);
			}
		}
	}

}
