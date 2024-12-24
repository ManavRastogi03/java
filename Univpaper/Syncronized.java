package Univpaper;
class Bank{
    private int bal;
    public synchronized  void account(int amount){
        bal+=amount;
    }
    public int getbalace(){
        return bal;
    }

}
public class Syncronized {
    public static void main(String[] args) {
        Bank b=new Bank();

        Thread A12 = new Thread(() -> {
            b.account(122);
        });
        Thread A22 = new Thread(() -> {
            b.account(122);
        });
        A12.start();

    }

}
