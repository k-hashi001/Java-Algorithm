package kadai;

public class kadai26 {
	protected String Moji1;
	protected String Moji2;
	protected int count;

	public void setMoji1(String m) {
		if (m.length() == 10) {
			Moji1 = m;
		} else {
			System.out.println("10文字を正しく入力してください");
		}
	}

	public void setMoji2(String n) {
		if (n.length() == 3) {
			Moji2 = n;
		} else {
			System.out.println("3文字を正しく入力してください");
		}
	}

	public void ShowNumber() {
		try {
			String b = null;
			for (int i = 3; i <= 10; i++) {
				b = Moji1.substring(i - 3, i);
				if (Moji2.equals(b)) {
					count++;
				}

			}
			System.out.println("等しいパターンは" + this.count + "個ありました。");
		} catch (NullPointerException e) {
			System.out.println("エラーが発生しました");
		}
	}
}

