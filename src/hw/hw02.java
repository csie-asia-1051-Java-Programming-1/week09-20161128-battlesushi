package hw;
import java.util.Scanner;
/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 105021030 張廷毓
 */
public class hw02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=1,y=1;
		System.out.print("數列ㄧ(超過N):  ");//+1 +2 +3 +4...
		while(x<=n){
			System.out.print(x+"  ");
			x=x+y;		y++;
			if(x>n)
				System.out.print(x);
		}
		System.out.println("");
		System.out.print("數列二(超過N):  ");
		for(int i=1;i<=n+1;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"  ");
			}
		}		
	}
}