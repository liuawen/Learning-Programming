package ZenofDesignPatterns.lsp.section6;

import java.util.Collection;
import java.util.Map;

/**
 * 子类
 */
@SuppressWarnings("all")
public class Son extends Father {

	public Collection doSomething(Map map){
		System.out.println("子类被执行...");		
		return map.values();
	}
	
}
