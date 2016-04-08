import java.util.Random;

public class Player {
    
    private int _hp = 100;
    private int _mp = 3;
    private Random _random = new Random();
    private int _dmg = 0;
    private int _dmgTaken = 0;
    
    public Player(){
        System.out.println("Player Created!");
    }
    
    public int getHP(){
        return _hp;
    }
    
    public int getMP(){
        return _mp;
    }
    
    public void run(Monster m){
        _dmgTaken = m.attack(0);
        _hp -= _dmgTaken;
        System.out.println("You run away! But the monster attacks for " + _dmgTaken + " points.");
        System.out.println("You have run from the " + m.getName() + ".");
    }
    
    public void attack(Monster m){
        _dmg = _random.nextInt(15) + 1;
        _dmgTaken = m.attack(_dmg);
        _hp -= _dmgTaken;
        System.out.println(_dmg);
        System.out.println("You dished out " + _dmg + " points, and you received " + _dmgTaken + " points");
    }
    
    public void berserk(Monster m){
        _dmg = 3* (_random.nextInt(15) + 1);
        _dmgTaken = m.berserk(_dmg);
        _hp -= _dmgTaken;
        System.out.println("You dished out " + _dmg + " points, and you received " + _dmgTaken + " points");
    }
    
    public void magic(Monster m){
        _dmgTaken = m.attack(0);
        _hp = 100;
        _hp -= _dmgTaken;
        _mp -= 1;
        System.out.println("You feel revitalized!");
        System.out.println("You are healed! But the monster attacks for " + _dmgTaken + " points.");
    }
}
