public class InterFacesInJava {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear bhalu = new Bear();
        bhalu.eatHerb();
        bhalu.eatMeat();
    }
}

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("L,R,U,D,Diagonal");
    }
}
class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("U,Diagonal when killing");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("L,R,U,D,Diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("L,R,U,D");
    }
}

interface Herbivore{
    void eatHerb();
}
interface Carnivore{
    void eatMeat();
}
class Bear implements Herbivore,Carnivore{
    @Override
    public void eatHerb() {
        System.out.println("Bear eats grasses and bushes");
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear likes eating fishes");
    }
}
