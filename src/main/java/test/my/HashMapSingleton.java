package test.my;

import java.util.HashMap;
import java.util.Map;

public class HashMapSingleton {

	private static HashMapSingleton instance;

	private HashMap<String, String> datamap = new HashMap<String, String>();

	// プライベートなコンストラクタ
	private HashMapSingleton() {

	}

	// シングルトンを得る
	public synchronized static HashMapSingleton getInstance() {
		if (instance == null) {
			instance = new HashMapSingleton();
		}
		return instance;
	}

	// データ保存用のmapを得る
	public Map<String, String> getMap() {
		return this.datamap;
	}

}
