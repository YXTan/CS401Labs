import java.util.*;

public class Hoard{
    private int _goldTotal = 0;
    private Monster _m;
    
    public Hoard() {
        
    }    
    
    public void defeatResult(Monster m){
        _m = m;
        int temp = _m.getGold();
        _goldTotal += temp;
        System.out.println("You have gained "+temp+" gold pieces!");
    }
    
    public void getTotal(){
        System.out.println("Gold pieces acquired: " + _goldTotal);
    }

}
