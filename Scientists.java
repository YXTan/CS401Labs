
public class Scientists {

    private int _dimension;
    private int _numUnits;
    private World world = new World();
    private int[][][][][] _world = world.getWorld();
    private int[] temp = new int[6]; 
    
    public Scientists(World w) {
        world = w;
    }

    public int[] move(int dimension, int numUnits) {

        _dimension = dimension;
        _numUnits = numUnits;
        int currentNum = 0;
           
        if(_dimension == 1){
            currentNum = temp[0];
            if (_world[(_numUnits-1 + temp[0])%10][0][0][0][0] != 0){
                temp[5] = 100;
            }else{
                _world[(_numUnits-1 + temp[0])%10][0][0][0][0] = (numUnits + currentNum)%10;
            }
            temp[0] = _world[(_numUnits-1 + temp[0])%10][0][0][0][0];
        }else if (_dimension == 2){
            currentNum = temp[1];
            if (_world[0][(_numUnits-1 + temp[1])%10][0][0][0] != 0){
                temp[5] = 100;
            }else{
                _world[0][(_numUnits-1 + temp[1])%10][0][0][0] = (numUnits + currentNum)%10;
            }
            temp[1] = _world[0][(_numUnits-1 + temp[1])%10][0][0][0];
        }else if (_dimension == 3){
            currentNum = temp[2];
            if (_world[0][0][(_numUnits-1 + temp[2])%10][0][0]!=0){
                temp[5] =100;
            }else{
                _world[0][0][(_numUnits-1 + temp[2])%10][0][0] = (numUnits + currentNum)%10;
            }
            temp[2] = _world[0][0][(_numUnits-1 + temp[2])%10][0][0];
        }else if (_dimension == 4){
            currentNum = temp[3];
            if (_world[0][0][0][(_numUnits-1 + temp[3])%10][0]!=0){
                temp[5] = 100;
            }else{
                _world[0][0][0][(_numUnits-1 + temp[3])%10][0] = (numUnits + currentNum)%10;
            }
            temp[3] = _world[0][0][0][(_numUnits-1 + temp[3])%10][0];
        }else if (_dimension == 5){
            currentNum = temp[4];
            if (_world[0][0][0][0][(_numUnits-1 + temp[4])%10]!=0){
                temp[5] =100;
            }else{
                _world[0][0][0][0][(_numUnits-1 + temp[4])%10] = (numUnits + currentNum)%10;
            }
            temp[4] = _world[0][0][0][0][(_numUnits-1 + temp[4])%10];
        }
        int count = 0;
        for (int i=0; i<5; i++){
            count += temp[i];
        }

        if (temp[5]!=100){
            temp[5] = count % 10;
        }
        return temp;
    }
}
