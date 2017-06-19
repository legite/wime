package main;

import java.util.Scanner;

public class ABC {
	public static String createString(int N, int K) {
		
		int x = N / 3;
		int y = N % 3;
		int a = x;
		int b = x;
		int c = x;
		if(y == 1){
			a += 1;
		}else if(y == 2){
			a += 1;
			b += 1;
		}
		
		char[] abc = new char[N];
		for(int i = 0; i < N; i ++){
			abc[i] = 'A';
		}
		
		if(K == 0){
			return "";
		}else{
			int lb = -1;
			int sb = 0;
			int sc = 0;
			if(K < a + b){
				sb = K / a;
				lb = K % a;
				sc = 0;
			}else if(K <= c * (a + b)){
				sc = K / (a + b);
				sb = (K % (a + b)) / a;
				lb = (K % (a + b)) % a;
			}else if( K <= c * (a + b) + a * b){
				sc = c;
				sb = (K - c * (a + b)) / a;
				lb = (K - c * (a + b)) % a;
			}else{
				return "";
			}
			
			while(sc > 0){
				abc[a + b + sc - 1] = 'C';
				sc --;
			}
			if(lb == 0){
				while(sb > 0){
					abc[a + sb - 1] = 'B';
					sb --;
				}
			}else{
				abc[lb] = 'B';
				while(sb > 0){
					abc[a + sb] = 'B';
					sb --;
				}
			}
		}
		String string = String.copyValueOf(abc);
		return string;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		in.close();
		System.out.println(createString(N, K));
	}
}
