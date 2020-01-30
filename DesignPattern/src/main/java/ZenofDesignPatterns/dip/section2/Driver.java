package ZenofDesignPatterns.dip.section2;

/**
 *  司机
 */
public class Driver implements IDriver{
	
	//司机的主要职责就是驾驶汽车
	public void drive(ICar car){
		car.run();
	}
}
