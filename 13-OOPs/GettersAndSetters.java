public class GettersAndSetters {
    public static void main(String args[]){
       
    Penn p1 = new Penn();
    p1.setColor("Blue");
    System.out.println(p1.getColor());    

    p1.setTip(8);
    System.out.println(p1.getTip());
  }
}

class Penn {             
    String Color;       
    int Tip;     
    
    String getColor(){
        return this.Color;
    }

    int getTip(){
        return this.Tip;
    }

    void setColor(String Color){ 
        this.Color = Color;
    }

    void setTip(int Tip){ 
        this.Tip = Tip;
    }
}

