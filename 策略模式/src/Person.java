/**
 * @program: DesignPattern
 * @description: 使用策略的主体
 * @author: Yang Clark
 * @create: 2020-04-29 23:07:21
 **/

public class Person {

    private MakeMoney makeMoney;
    private SpendMoney spendMoney;

    public Person(MakeMoney makeMoney, SpendMoney spendMoney) {
        this.makeMoney = makeMoney;
        this.spendMoney = spendMoney;
    }

    public void makeMoney(){
        makeMoney.makeMoney();
    }

    public void spendMoney(){
        spendMoney.spendMoney();
    }
}
