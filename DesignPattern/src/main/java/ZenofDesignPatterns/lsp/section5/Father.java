package ZenofDesignPatterns.lsp.section5;

import java.util.Collection;
import java.util.Map;

/**
 *  父类
 */
@SuppressWarnings("all")
public class Father {
	
	public Collection doSomething(Map map){
		System.out.println("父类被执行...");		
		return map.values();
		
	}
}
