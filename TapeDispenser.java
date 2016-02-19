
public class TapeDispenser {

    private double _tape;

    public TapeDispenser() {

    }

    public void setStatus(double tape) {
        _tape = tape;

        if (_tape >= 45) {
            System.out.println("The tape dispenser looks... full.");
        } else if (_tape >= 35 && _tape < 45) {
            System.out.println("The tape dispenser looks... almost full.");
        } else if (_tape >= 15 && _tape < 35) {
            System.out.println("The tape dispenser looks... about halfway full.");
        } else if (_tape > 0 && _tape < 15) {
            System.out.println("The tape dispenser looks... almost empty.");
        } else if (_tape == 0) {
            System.out.println("The tape dispenser is empty!");
        }
    }
    
    public void refill(){
        _tape = 50.0;
        setStatus(_tape);
    }
    
    public double tape(int page){
        _tape -= 0.25 * page;
        return _tape;
    }
    
    public void check(){
        if (_tape <= 0){
            System.out.println("You have run out of tape!");
            System.out.println("You could not survive the ordeal of the OFFICE QUEST.");
            System.exit(0);   
        }
    }
}
