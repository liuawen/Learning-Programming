package imooc.proxy.two.one;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() {
	    long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
		//实现开车
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶中... 汽车行驶时间：" + (endtime -starttime) + "毫秒！");
	}

}
