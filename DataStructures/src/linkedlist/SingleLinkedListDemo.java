package linkedlist;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-10-23 21:53
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        //进行测试
        //先创建节点
       HeroNode hero1 = new HeroNode(1,"宋江","及时雨");
       HeroNode hero2 = new HeroNode(2,"卢俊义","玉麒麟");
       HeroNode hero3 = new HeroNode(3,"吴用","智多星");
       HeroNode hero4 = new HeroNode(4,"林冲","豹子头");
       SingleLinkedList singleLinkedList = new SingleLinkedList();
       //加入
       singleLinkedList.add(hero1);
       singleLinkedList.add(hero2);
       singleLinkedList.add(hero3);
       singleLinkedList.add(hero4);
       //显示一波
        singleLinkedList.list();
    }
}
//定义SingleLinkedList 管理我们的英雄
class SingleLinkedList{
    //先初始化一个头节点，头节点不要动,不存放具体的数据
    private HeroNode head = new HeroNode(0,"","");
    //添加节点到单向链表
    //思路，当不考虑编号顺序时
    //1.找到当前链表的最后节点
    //2.将最后这个节点的next 指向 新的节点
    public void add(HeroNode heroNode){
        //辅助节点  因为head节点不能动，因此我们需要一个辅助遍历temp
        HeroNode temp = head;
        //遍历链表，找到最后
        while(true){
            //找到链表的最后  null   temp.next
            if(temp.next == null){
                break;
            }
            //如果没有找到最后，将temp后移
            temp = temp.next;
        }
        //当退出while循环时，temp 就指向了链表的最后
        //将最后这个节点的next 指向 新的节点
        temp.next = heroNode;
    }

    //显示链表 [遍历]
    public void list(){
        // 判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //因为头节点，不能动，因此我们需要一个辅助变量来遍历
        HeroNode temp = head.next;
        while (true){
            //判断是否到链表最后
            if ( temp == null) {
//                System.out.println();
                break;
            }
            //输出节点的信息
            System.out.println(temp);
            //将temp后移，一定小心
            temp = temp.next;
        }
    }
}
//定义HeroNode，每个HeroNode 对象就是一个节点
class HeroNode {
    public int no;
    public String name;
    public String nickName;
    public HeroNode next;   //指向下个节点

    /* //构造器
     public HeroNode(int hNo, String hName, String hNickName){
         this.no = hNo;
         this.name = hName;
         this.nickName = hNickName;
     }*/
    //构造器
    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    //为了显示方法，我们重新toString

    @Override
    /*
    //多输出  next的
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", next=" + next +
                '}';
    }*/
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }


}