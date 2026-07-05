public class Interfaces {
    public static void main(String[] args) {
        Queen Q = new Queen();
        Q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("It Moves - Up, Down, Right, left, Digonally in 4 Directions");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("It Moves - Up, Down, Right, left");
    }
}