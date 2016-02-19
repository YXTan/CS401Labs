
public class Stapler {
    
    private int _staplerNum;
    private int _page;
    
    public Stapler(){
        
    }
    
    
    public void setStatus(int staplerNum){
        _staplerNum = staplerNum;
        
        if (_staplerNum > 10){
            System.out.println("The stapler feels... really heavy.");
        }else if (_staplerNum >5 && _staplerNum <= 10){
            System.out.println("The stapler feels... heavy.");
        }else if (_staplerNum > 0 && _staplerNum <= 5){
            System.out.println("The stapler feels... light.");
        }else if (_staplerNum == 0){
            System.out.println("The stapler feels... really light.");
        }
    }
    
    public void addStaple(){
        _staplerNum += 10;
    }
    
    public int staple(int page){
        _page = page;
        
        if (page > 50){
            System.out.println("The stapler jammed!");
            _staplerNum -= 3;
        }else if (page > 0 && page <= 50){
            _staplerNum -= 1;
        }
        
        return _staplerNum;
    }
    
    public void check(){
        if (_staplerNum <= 0){
            System.out.println("You have run out of stapler!");
            System.out.println("You could not survive the ordeal of the OFFICE QUEST.");
            System.exit(0);           
        }
    }
}
