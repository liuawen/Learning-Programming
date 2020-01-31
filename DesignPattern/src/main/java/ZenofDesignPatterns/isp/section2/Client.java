package ZenofDesignPatterns.isp.section2;

/**
 * 场景类
 */
public class Client {

    //搜索并展示美女信息
    public static void main(String[] args) {
        //定义一个气质美女
        IGreatTemperamentGirl yanYan = new PettyGirl("嫣嫣");
        AbstractSearcher searcher = new Searcher(yanYan);
        searcher.show();
        //定义一个外形美的美女  叫柳依依
        IGoodBodyGirl yiYi = new PettyGirl("依依");
        searcher = new Searcher(yiYi);
        searcher.show();

        //有一个内在、外形都美的 柳江雪
    }

}
