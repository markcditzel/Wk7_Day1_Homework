public class Visitor {
    //Properties

    private int age;
    private int height;
    private double money;

    //Constructor

    public Visitor(int age, int height, double money){
        this.age = age;
        this.height = height;
        this.money = money;
    }

    //  GETTERS

    public int getAge(){
        return this.age;
    }

    public int getHeight(){
        return this.height;
    }

    public double getMoney(){
        return this.money;
    }

    public double setMoney(double fee){
        return this.money - fee;
    }


}
