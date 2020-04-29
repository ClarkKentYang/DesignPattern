import java.time.Period;

/**
 * @program: DesignPattern
 * @description: 代码测试
 * @author: Yang Clark
 * @create: 2020-04-29 23:19:27
 **/

public class Main {

    /*
     * @auther Yang Clark
     * @date 2020/4/29 23:31
     * @descript    策略模式：就是把策略主体会用到的不同的算法、策略封装为一个接口，交给子类去实现。
     * @param null
     * @return
     */

    public static void main(String[] args) {
        MakeMoney makeMoney = new MakeMoneyBySex();
        SpendMoney spendMoney = new SpendMoneyForSex();
        Person person = new Person(makeMoney,spendMoney);
        person.makeMoney();
        person.spendMoney();
    }

}
