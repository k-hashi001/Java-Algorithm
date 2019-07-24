/*課題28
文字列を９文字入力させる。
同一文字が３文字以上連続する場合に、「文字」と「連続文字数」に置き換え、
出力する。3文字以上連続しない文字はそのまま出力する。*/

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
		System.out.println("9回文字を入力してください。");
		try {
			for (int i = 0; i < 9; i++) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String chara = br.readLine();
				charas[i] = chara;

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
				} else {
					list.add(same);
					same = charas[i];
				}
			}
			for (int i = 0; i < list.size(); ++i) {
				System.out.print(list.get(i));
			}

		} catch (Exception e) {
			System.out.println("エラーが発生しました。");
		}
	}
}
