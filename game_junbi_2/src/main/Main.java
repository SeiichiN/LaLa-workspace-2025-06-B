package main;

/**
 * このバージョンは、モンスターが移動しない点に特色がある。
 * また、メニュー構造がシンプルである。
 * つまり、移動コマンドとその他のコマンドが同時に表示される。
 * また、持ち物を格納するのに配列を使用している。
 */
public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.start();

	}

}
