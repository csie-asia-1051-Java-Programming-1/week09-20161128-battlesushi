package ex;
import java.util.*;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021030 張廷毓
 */
public class ex03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("輸入(>=2)的值:");
		int n=sc.nextInt();
		int x,count=0;
		System.out.print(1+"   ");
		for(int i=2;i<=n;i++){
			if(n%i==0)
				System.out.print(i+"   ");
		}
		x=n/2;
		if(n%2 == 0 && n != 2) 
			count++;
		if(n==1)
			count++;
			for(int i=2; i<=x; i++){ 
				if(n%i==0)
					count++;
			}
		if(count==0)
			System.out.print("此為質數");
		
	}

}
