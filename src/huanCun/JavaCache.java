package huanCun;

import java.util.HashMap;
import java.util.Map;

public class JavaCache {
	
	private Map<String, Object> map = new HashMap<String, Object>();
	
	/**
	 * 
	 * @param key set the key value
	 * @return the value corresponding to key
	 */
	public Object getValue(String key)
	{
		Object obj = map.get(key);
		
		if (obj == null) {
			obj = key + ",key";
			map.put(key, obj);
		}
		
		return obj;
	}

}
