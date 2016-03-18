
public class World {
    private int[][] world = new int[5][10];
    
    public int[][] getWorld(){
        return world;
    }
    
    public String getColor(int colorNum){
        String color = "";
        if (colorNum == 1){
            color = "Lime";
        }else if (colorNum == 2){
            color = "Cerulean";
        }else if (colorNum == 3){
            color = "Goldenrod";
        }else if (colorNum == 0 || (colorNum >= 4 && colorNum <= 10)){
            color = "Black";
        }else{
            color = "White";
        }
        return color;
    }
}
