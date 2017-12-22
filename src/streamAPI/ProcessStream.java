package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream APIを用いたロジッククラス.
 * 
 * @author Noriyuki-Shimizu
 */
public class ProcessStream {
	
	/** thisクラス */
	private static ProcessStream processStream = new ProcessStream();
	
	/**
	 * シングルトンパターン.
	 * 
	 * @return インスタンス化されたthisクラス
	 */
	public static ProcessStream getInstance() {
		return processStream;
	}
	
	/**
	 * StreamAPIでの処理実装.
	 */
	public void process1() {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		
		// リストの中身を2倍して表示する
		integerList.stream()
			// map: 要素の変換
			.map(i -> i*2)
			// filter: 要素の絞り込み
			.filter(i -> i%4 == 0)
			// forEach: ループ
			.forEach(System.out::println);
		
		// 改行
		System.out.println();
		
		Stream<String> stream1 = Stream.of("あ", "い", "う", "え", "お");
		Stream<String> stream2 = Stream.of("ア", "イ", "ウ", "エ", "オ");
		// 並列処理
		Stream<String> parallelStream = stream1.parallel();
		
		Stream<String> concatStream = Stream.concat(parallelStream, stream2);
		concatStream.forEach(System.out::println);
	}
	
	/**
	 * Stream APIを用いたFizzBuss問題.
	 */
	public void fizzBuzz() {
		// 初期値設定
		List<Integer> numList = new ArrayList<Integer>();
		for(int i=1; i<=100; i++) {
			numList.add(i);
		}

		// 実装
		numList.stream()
			// mapにより、FizzBussの抽出を行う
			.map(num -> {
				if(num % 3 == 0) {
					return "Fizz";
				} else if(num % 5 == 0){
					return "Buzz";
				} else {
					return String.valueOf(num);
				}
			})
			// 結果の出力
			.forEach(System.out::println);
	}

}
