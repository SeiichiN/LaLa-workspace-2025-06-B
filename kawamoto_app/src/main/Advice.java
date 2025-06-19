package main;

import java.util.HashMap;
import java.util.Map;

public class Advice {
	private int temp = 0;
	Map<Integer, String> msgs = new HashMap<>();
	
	public void makeMsgs() {
		msgs.put(57 , "って、そんな気温にはなりません!");
		msgs.put(36, "暑すぎる！命の危険を感じる！\n" + 
		  "こんな日は服装のことは気にせず自宅のクーラーの効いた部屋でゆっくりしましょう。");
		msgs.put(31, 
			  "■ノースリーブワンピースやハーフパンツで涼し気に\n"
			+ "■日光を吸収しないような白や淡い色がオススメ\n"
					+ "■冷房対策の羽織り物は忘れずに\n"
			+ "■日傘にプラスしてサングラスや帽子などの日焼け対策もマスト");
		msgs.put(26, 
				"■通気性のよいレーヨンやリネン、吸水性の高いコットン素材がおすすめ\n"
				+ "■冷房対策の羽織り物は忘れずに\n"
				+ "■日傘など日焼け対策もマスト");
		msgs.put(21, 
				"■トップスは半袖が〇\n"
				+ "■朝晩は涼しいので羽織りを持ち歩く\n"
				+ "■一枚で過ごしたい時は長袖や七分丈で\n"
				+ "■最高気温25度でも実は日焼けします！日傘の準備を");
		msgs.put(16, 
				"■薄手のニットをトップスに合わせるのがぴったり\n"
				+ "■涼しい夜には軽めのアウターを");
		msgs.put(11, 
				"■朝晩の激しい冷え込みに備えて暖かいアウターを羽織りましょう\n"
				+ "■トップスは、厚手のカーディガンやニットなど中に着込めるアイテムがおすすめ\n"
				+ "■ボトムスも暖かいものを");
		msgs.put(6, 
				"■ダウンジャケットや厚手のコートなど、本格的な冬用のアウターを羽織りましょう\n"
				+ "■ニット帽や手袋、マフラーなどの小物類も忘れずに\n"
				+ "■暖房の効いた室内など、外との寒暖差が大きい場所に行くときは、体温調整しやすいアンサンブルのニットの組み合わせがおすすめ");
		msgs.put(1, 
				"■お尻まで隠れるロング丈のコートやダウン、厚手のウールコートなど、本格的な冬用のアウターを羽織りましょう\n"
				+ "■ニット帽や手袋、マフラーなどの小物類や、あったかインナーの着用が必須\n"
				+ "■汗などの水分を吸収することで発熱する吸湿発熱性のインナーや、発熱する素材を使用したインナーがおすすめ");
		msgs.put(-89, 
				"■経験したことのない寒さ\n"
				+ "■風を通さない生地で、とにかく厚着！");
		msgs.put(-90, "って、そんな気温にはなりません!");
		
	}
	
	public void selectTemperature() {
		do {
			System.out.print("ナニキル？最高気温を入力してください > ");
			try {
				temp = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
			} catch (Exception e) {
				System.out.println("数字（整数）を入力してください");
			}
		} while (temp <= 0);		
	}
	
	public void Temperature() {
		selectTemperature();
		int _num = (temp - 1) % 5;
		int num = temp - _num;
		System.out.println("【最高気温" + temp + "度の服装は…】----------");
		System.out.println(msgs.get(num));	
	}
	
	
}
