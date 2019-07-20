package newkadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Insertion_sort {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int[] nums = new int[20];
		int t = 0;
		int j = 0;
		try {
			System.out.println("20個の数字を入力してください");
			for (int i = 1; i < nums.length; i++) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String str = br.readLine();
				nums[i] = Integer.parseInt(str);
			}
			for (int i = 0; i < nums.length; i++) {
				t = nums[i];
				for (j = i - 1; j >= 0 && nums[j] > t; j--) {
					nums[j + 1] = nums[j];
				}
				nums[j + 1] = t;
			}
			for (int a = 0; a < nums.length; a++) {
				System.out.print(nums[a] + " ");
			}
		} catch (Exception e) {
			System.out.print("エラーが発生しました。");
		}
	}

}
