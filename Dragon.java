
public class Dragon  extends Monster {
    
    public static int _defeatTime = 0;
    private boolean _defeats = false;

    public Dragon() {
	_hp = 100;
    }

    public String getName() {
	return "Dragon";
    }
    
    public int attack(int hit) {
        
	_hp -= hit;

	if (_hp <= 0) {
	    _defeats = true;
            _defeatTime ++;
	}

	int damage = _rng.nextInt(20) + 1;
	return damage;
    }
    
    public int berserk(int hit) {
        
	_hp -= hit;

	if (_hp <= 0) {
	    _defeats = true;
            _defeatTime ++;
	}

	int damage = _rng.nextInt(20) + 1;
	return damage * 2;
    }

    public boolean getStatus(){
        return _defeats;
    }
}
