package characters;

import abst.MigaA;
import abst.Status;
import ex1.*;


public class Miga extends MigaA {
    public String name;
    public Status state, moves;
    nullException s1 = new nullException();

    public Miga() {
        super("Мига", true);
        this.name = getName();

    }

    public void Helping(String name, String name1) {
        isHelping(name, name1);
        this.state = Status.HELPING;
        this.moves = Status.MOVING;
        s1.Check(this.name,moves);
    }

    public void Catching(String name, String name1) {
        isCatching(name, name1);
        this.state = Status.CATCHING;
        this.moves = Status.MOVING;
        s1.Check(this.name,moves);
    }

    public void Fallen(String name) {
        isFallen(name);
        this.state = Status.FALLEN;
        this.moves = Status.NotMOVING;
        s1.Check(this.name,moves);
    }
    public void Standing(String name, String name1) {
        isStanding(name, name1);
        this.state = Status.STANDING;
        this.moves = Status.NotMOVING;
        s1.Check(this.name,moves);
    }
}
