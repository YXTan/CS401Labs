
public class CoogieException extends Exception{
    private int _catNum = 0;
    
    public CoogieException(int catNum){
        _catNum = catNum;
    }
    
    @Override
    public String toString(){
        String str = _catNum + " is too many cats!\"";
        return str;
    }
}
