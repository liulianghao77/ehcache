package ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class CacheTest {
	 public static void main(String[] args) {

	        // 1. �������������
	        CacheManager cacheManager = CacheManager.create("./src/main/resources/ehcache.xml");

	        // 2. ��ȡ�������
	        Cache cache = cacheManager.getCache("HelloWorldCache");

	        // 3. ����Ԫ��
	        Element element = new Element("key1", "value1");

	        // 4. ��Ԫ����ӵ�����
	        cache.put(element);

	        // 5. ��ȡ����
	        Element value = cache.get("key1");
	        System.out.println(value);
	        System.out.println(value.getObjectValue());

	        // 6. ɾ��Ԫ��
	        //cache.remove("key1");
	        
	        /*
	        Dog dog = new Dog(1L, "taidi", (short)2);
	        Element element2 = new Element("taidi", dog);
	        cache.put(element2);
	        Element value2 = cache.get("taidi");
	        Dog dog2 = (Dog) value2.getObjectValue();
	        System.out.println(dog2);
	        */

	        System.out.println(cache.getSize());

	        // 7. ˢ�»���
	        cache.flush();
	        // 8. �رջ��������
	        cacheManager.shutdown();
	 }
}
