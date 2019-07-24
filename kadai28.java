package kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Kadai28_main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String[] charas = new String[10];
		List<String> list = new ArrayList<String>();
		int count = 0;
		String same = null;
		try {
			System.out.println("9回文字を入力してください。");
			for (int i = 0; i < 9; i++) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String chara = br.readLine();
				if (chara.length() == 1) {
					charas[i] = chara;
				}
			}
			charas[9] = "";
			for (int i = 0; i < 10; i++) {
				if (i == 0) {
					count = 1;
					same = charas[0];
				} else if (charas[i].equals(same)) {
					count++;
				} else if (!(charas[i].equals(same)) && count >= 3) {
					String str = Integer.toString(count);
					list.add(same + str);
					same = charas[i];
					count = 1;
				} else if (!(charas[i].equals(same)) && count == 2) {
					list.add(same);
					list.add(charas[i - 1]);
					same = charas[i];
					count = 1;
				} else {
					list.add(same);
					same = charas[i];
					count = 1;
				}
			}
			for (int i = 0; i < list.size(); ++i) {
				System.out.print(list.get(i));
			}
		} catch (Exception e) {
			System.out.println("エラーが発生しました。もう一度入力してください");
		}
	}
}
