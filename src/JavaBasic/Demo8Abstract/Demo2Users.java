package JavaBasic.Demo8Abstract;



/*
* 1.创建3个类，用户，群主，用户
* 2.用户包含 姓名和余额
* 3.在子类中重写信息，输出个人信息
* 4.群主可以发红包；
*
*
* */
public  class Demo2Users {
    private String name;
    private int money;

    public Demo2Users() {
    }

    public Demo2Users(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void show(){
        System.out.println("name:"+name+",money:"+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
