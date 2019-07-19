package newkadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary_search {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("20個の数字を入力してください");
		int[] nums = new int[20];
		int Search = 0;
		int Left = 0;
		int Right = nums.length - 1;
		int Middle = (Left + Right) / 2;
		boolean Answer = false;
		for (int i = 0; i < nums.length; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str1 = br.readLine();
			nums[i] = Integer.parseInt(str1);
		}
		System.out.println("検索する数字を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str2 = br.readLine();
		Search = Integer.parseInt(str2);
		while (Left <= Right) {
			if (nums[Middle] == Search) {
				Answer = true;
				break;
			}else {
				if (Search < nums[Middle]) {
					Right = Middle - 1;
				} else {
					Left = Middle + 1;
				}
       }
				Middle = (Left + Right) / 2;
			}
			if(Answer==true) {
		System.out.println((Middle+1)+"番目に見つかりました。");
			}else {
				System.out.println("見つかりませんでした。");
			}
		}
	}

