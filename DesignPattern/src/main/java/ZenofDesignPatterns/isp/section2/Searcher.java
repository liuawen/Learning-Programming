package ZenofDesignPatterns.isp.section2;

/**
 *星探
 */
public class Searcher extends AbstractSearcher{
	public Searcher(IGoodBodyGirl _goodBodyGirl){
		super(_goodBodyGirl);
	}
	public Searcher(IGreatTemperamentGirl _greatTemperamentGirl){
		super(_greatTemperamentGirl);
	}
	
	//展示美女的信息
	public void show(){
		//判断不同的显示 内在美 外形美
		System.out.println("--------美女的信息如下：---------------");
		if(super.goodBodyGirl != null){ //展示外形美的美女
			super.goodBodyGirl.goodLooking();
			super.goodBodyGirl.niceFigure();
		}
		
		if(super.greatTemperamentGirl != null){
			super.greatTemperamentGirl.greatTemperament();
		}
	}
}
