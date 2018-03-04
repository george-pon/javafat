package test.my;

import java.util.HashMap;
import java.util.Map;

public class HashMapSingleton {

	private static HashMapSingleton instance;

	private HashMap<String, String> datamap = new HashMap<String, String>();

	// �v���C�x�[�g�ȃR���X�g���N�^
	private HashMapSingleton() {

	}

	// �V���O���g���𓾂�
	public synchronized static HashMapSingleton getInstance() {
		if (instance == null) {
			instance = new HashMapSingleton();
		}
		return instance;
	}

	// �f�[�^�ۑ��p��map�𓾂�
	public Map<String, String> getMap() {
		return this.datamap;
	}

}
