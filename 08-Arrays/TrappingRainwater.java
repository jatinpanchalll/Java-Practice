public class TrappingRainwater{
    public static int TrappedWater(int Height[]){

        int Leftmax[] = new int[Height.length];
        Leftmax[0] = Height[0];
        for(int i=1; i<Height.length; i++){
           Leftmax[i] = Math.max(Height[i], Leftmax[i-1]);
        }

        int Rightmax[] = new int[Height.length];
        Rightmax[Height.length - 1] = Height[Height.length - 1];
        for(int i=Height.length-2; i>=0; i--){
            Rightmax[i] = Math.max(Height[i], Rightmax[i+1]);
        }
        
        int TrappedWater = 0;
        for(int i=0; i<Height.length; i++){
            int Waterlevel = Math.min(Leftmax[i], Rightmax[i]);
           TrappedWater += Waterlevel - Height[i];
        }
        return TrappedWater;
    }

    public static void main(String[] args) {
        int Height[] = {4,2,0,6,3,2,5};
        System.out.println(TrappedWater(Height));
    }
}