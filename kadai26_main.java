/*■■課題（26）■■　難易度★★★★
テキスト文字列を10文字入力させた後、一行表示する。
その後、パターン文字列として、3文字を入力させ、最初に入力した10文字の中に
等しいパターンが何個含まれているかを数える。
ただし、一致した部分文字列も探索対象に含めるものとする。*/

package kadai;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadai26_main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("10文字入力してください");

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String n1 = br1.readLine();

		System.out.println("3文字入力してください");

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String n2 = br2.readLine();

		kadai26 num1 = new kadai26();
		num1.setMoji1(n1);
		num1.setMoji2(n2);
		num1.ShowNumber();
	}

}
