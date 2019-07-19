//20個数字を入力させ、バブルソートする

package newkadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int[] nums = new int[20];
		
		System.out.println("20個の数字を入力してください");
		for (int i = 0; i < nums.length; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			nums[i] = Integer.parseInt(str);
		}
		
		for(int i=nums.length-1 ; i > 0; i--) {
			for(int j=0;j<i; j++) {
				if(nums[j]>nums[j+1]) {
					int t= nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=t;
				}
			}
		}for(int a=0;a<nums.length;a++) {
			System.out.print(nums[a]);
		}
		
	}
}
