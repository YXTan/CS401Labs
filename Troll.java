
public class Troll  extends Monster {
    
    private boolean _defeats = false;
    
    public static int _defeatTime = 0;
    
    public Troll() {
	_hp = 30;
    }

    // Here, we are overriding the getName() method in Monster
    // by having it return "Goblin".
    
    @Override
    public String getName() {
	return "Troll";
    }

    // Calculate damage from a regular attack
    
    @Override
    public int attack(int hit) {
        
	_hp -= hit;

	if (_hp <= 0) {
	    _defeats = true;
            _defeatTime ++;
	}

	int damage = _rng.nextInt(10) + 1;
	return damage;
    }

    // Calculate damage from a berserk attack

    @Override
    public int berserk(int hit) {
        
	_hp -= hit;
        System.out.println(_hp);

	if (_hp <= 0) {
	    _defeats = true;
            _defeatTime ++;
	}

	int damage = _rng.nextInt(10) + 1;
	return damage * 2;
    }

    @Override
    public boolean getStatus(){
        return _defeats;
    }
}
