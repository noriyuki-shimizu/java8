package viewMethod;

import java.util.Arrays;
import java.util.List;

/**
 * メソッド参照を用いたロジック.
 * 
 * @author Noriyuki-Shimizu
 */
public class ProcessViewMethod {

	/** thisクラス */
	private static ProcessViewMethod processViewMethod = new ProcessViewMethod();
	
	/**
	 * シングルトンパターン.
	 * 
	 * @return インスタンス化されたthisクラス
	 */
	public static ProcessViewMethod getInstance() {
		return processViewMethod;
	}
	
	/**
	 * メソッド参照での処理実装.
	 */
	public void process1() {
		List<String> list = Arrays.asList("A", "D", "B", "C", "E");

		// 関数型インターフェースの引数のメソッドを参照する場合
		System.out.println("ラムダ式");
		list.stream()
				// 受け取った要素の値を小文字に変換
				.map(ValueBase -> ValueBase.toLowerCase())
				// 第1引数としてくるStringの要素を
				// その要素が持つcompareToメソッドで第2引数の要素と
				// 比較して結果を返す
				.sorted((value1, value2) -> value1.compareTo(value2))
				// 最後に要素を出力
				.forEach(System.out::println);

		// 上記のラムダ式と行っている処理は同一
		System.out.println("メソッド参照");
		list.stream()
			.map(String::toLowerCase)
			.sorted(String::compareTo)
			.forEach(System.out::println);
	}

}
