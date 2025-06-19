package main;

public class Advice_20250618 {
	private String temp;
	
	public void Temperature() {

		try {
			System.out.print("ナニキル？最高気温を入力してください > ");
			int temp = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
			
			System.out.println("【最高気温" + temp + "度の服装は…】----------");
			
			if (temp >= 57) {			
				System.out.println("って、そんな気温にはなりません!");
			} else if (temp >= 36 && temp <= 56) {
				System.out.println("暑すぎる！命の危険を感じる！");
				System.out.println("こんな日は服装のことは気にせず自宅のクーラーの効いた部屋でゆっくりしましょう。");
			} else if (temp >= 31 && temp <= 35) {
				System.out.println("■ノースリーブワンピースやハーフパンツで涼し気に");
				System.out.println("■日光を吸収しないような白や淡い色がオススメ");
				System.out.println("■冷房対策の羽織り物は忘れずに");
				System.out.println("■日傘にプラスしてサングラスや帽子などの日焼け対策もマスト");
			} else if (temp >= 26 && temp <= 30) {
				System.out.println("■通気性のよいレーヨンやリネン、吸水性の高いコットン素材がおすすめ");
				System.out.println("■冷房対策の羽織り物は忘れずに");
				System.out.println("■日傘など日焼け対策もマスト");
			} else if (temp >= 21 && temp <= 25) {
				System.out.println("■トップスは半袖が〇");
				System.out.println("■朝晩は涼しいので羽織りを持ち歩く");
				System.out.println("■一枚で過ごしたい時は長袖や七分丈で");
				System.out.println("■最高気温25度でも実は日焼けします！日傘の準備を");
			} else if (temp >= 16 && temp <= 20) {
				System.out.println("■薄手のニットをトップスに合わせるのがぴったり");
				System.out.println("■涼しい夜には軽めのアウターを");
			} else if (temp >= 11 && temp <= 15) {
				System.out.println("■朝晩の激しい冷え込みに備えて暖かいアウターを羽織りましょう");
				System.out.println("■トップスは、厚手のカーディガンやニットなど中に着込めるアイテムがおすすめ");
				System.out.println("■ボトムスも暖かいものを");
			} else if (temp >= 6 && temp <= 10) {
				System.out.println("■ダウンジャケットや厚手のコートなど、本格的な冬用のアウターを羽織りましょう");
				System.out.println("■ニット帽や手袋、マフラーなどの小物類も忘れずに");
				System.out.println("■暖房の効いた室内など、外との寒暖差が大きい場所に行くときは、体温調整しやすいアンサンブルのニットの組み合わせがおすすめ");
			} else if (temp >= 1 && temp <= 5) {
				System.out.println("■お尻まで隠れるロング丈のコートやダウン、厚手のウールコートなど、本格的な冬用のアウターを羽織りましょう");
				System.out.println("■ニット帽や手袋、マフラーなどの小物類や、あったかインナーの着用が必須");
				System.out.println("■汗などの水分を吸収することで発熱する吸湿発熱性のインナーや、発熱する素材を使用したインナーがおすすめ");
			} else if (temp >= -89 && temp <= 0) {
				System.out.println("■経験したことのない寒さ");
				System.out.println("■風を通さない生地で、とにかく厚着！");	
			} else if (temp <= -90) {			
				System.out.println("って、そんな気温にはなりません!");
			}
		} catch (Exception e) {
			System.out.println("数字（整数）を入力してください");
			System.exit(-1); // ここで処理を止める
		}
					
	}
	
	
}
