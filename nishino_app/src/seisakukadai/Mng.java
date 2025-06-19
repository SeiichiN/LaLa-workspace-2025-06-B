package seisakukadai;

public class Mng {
public static void mng() {
	System.out.println("起動しました");
	System.out.println("何をしますか？");
	while(true) {
	int i =Util.choice("１：単語登録・削除\n２:登録単語の一覧表示\n３：ランダム表示");
	switch(i) {
	case 1:
		System.out.println("単語登録を開始します");
		Jisyo.touroku();
		break;
	case 2:
		System.out.println("既に登録されている単語と説明を表示します。");
		break;
	case 3:
		System.out.println("ランダムに単語を表示します");
	default:
		break;
	}
	}
}
}
