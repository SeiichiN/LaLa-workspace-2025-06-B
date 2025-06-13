package p652;

public class Person {
	int age;
	
	public void setAge(int age) throws IllegalArgumentException {
 		if (age < 0) {
 			// ここで処理をとめるつもり。
 			// エラーメッセージを出力。
			throw new IllegalArgumentException
			  ("年齢は0以上を指定すべきです。指定値=" + age);
		}
		this.age = age;
	}
}
