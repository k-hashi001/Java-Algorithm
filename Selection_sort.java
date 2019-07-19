//20個の整数のソート(選択法)

package newkadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Selection_sort {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		int[] nums = new int[20];
		
		System.out.println("20個の数字を入力してください");
		for (int i = 0; i < nums.length; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			nums[i] = Integer.parseInt(str);
		}
		for(int i=0;i<nums.length-1;i++) {
			int min=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[min] > nums[j]) {
					min=j;
				}
			} if(i !=min){
				int t= nums[i];
				nums[i]=nums[min];
				nums[min]=t;
			}
		}for(int a=0;a<nums.length;a++) {
			System.out.print(nums[a]);
		}
	}

}
