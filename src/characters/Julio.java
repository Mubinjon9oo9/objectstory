package characters;
import abst.JulioA;
import abst.Status;
import ex1.*;
public class Julio extends JulioA {
    public String name;
    public Status state,moves;
    nullException s1 = new nullException();

    public Julio() {
        super("Жулио", true);
        this.name = getName();
        s1.Check(this.name,moves);
    }

    public void Reanimating(String name, String name1) {
        isReanimating(name, name1);
        this.state = Status.REANIMATING;
        this.moves = Status.MOVING;
        s1.Check(this.name,moves);
    }

    public void NotExpecting(String name) {
        isNotExpecting(name);
        this.state = Status.NOTEXPECTING;
        this.moves = Status.NotMOVING;
        s1.Check(this.name,moves);
    }

    public void Falling(String name) {
        isFalling(name);
        this.state = Status.FALLEN;
        this.moves = Status.NotMOVING;
        s1.Check(this.name,moves);
    }

}
