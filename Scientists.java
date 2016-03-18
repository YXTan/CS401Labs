
public class Scientists {

    private int _dimension;
    private int _numUnits;
    private World world = new World();
    private int[][] _world = world.getWorld();

    public Scientists(World w) {
        world = w;
    }

    public int[] move(int dimension, int numUnits) {
        _dimension = dimension;
        _numUnits = numUnits;
        int currentNum = _world[_dimension-1][0];
        
        int[] temp = new int[6];
        int count = 0;
        
        if (_world[_dimension-1][(numUnits + currentNum)%10] == 100){
            temp[5] = 100;
        }else{
            _world[_dimension-1][_numUnits + currentNum] = 100; 
        }
        _world[_dimension-1][0] = (numUnits + currentNum)%10;
        
        for (int i=0; i<5; i++){
            temp[i] = _world[i][0];
            count += temp[i];
        }

        if (temp[5]==0){
            temp[5] = count % 10;
        }
        return temp;
    }
}
