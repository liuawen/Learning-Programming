package ZenofDesignPatterns.lsp.section4;

import java.util.Collection;
import java.util.HashMap;

/**
 *父类
 */
@SuppressWarnings("all")
public class Father {
	
	public Collection doSomething(HashMap map){
		System.out.println("父类被执行...");		
		return map.values();
		
	}
}
