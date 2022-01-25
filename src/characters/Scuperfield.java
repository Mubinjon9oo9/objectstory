package characters;

import abst.ScuperfieldA;
import abst.Status;
import ex1.*;

public class Scuperfield extends ScuperfieldA {
    public String name;
    public Status state,moves;
    public boolean NoHeadDress=false;
    nullException s1 = new nullException();
    public Scuperfield() {
        super("Скуперильд", true);
        this.name=getName();
    }
    public void Dying(String name){
        isDying(name);
        this.state = Status.DYING;
        this.moves = Status.NotMOVING;
        s1.Check(this.name,moves);
    }
    public void Alive(String name){
        isAlive(name);
        this.state = Status.ALIVE;
        this.moves = Status.MOVING;
        s1.Check(this.name,moves);
    }
    public void Exercising(String name) throws HeadDressException {
        isExercising(name);
        if (Math.random()>= 0.5){
            Cylinder c1 = new Cylinder();
        }
        else {
            NoHeadDress=true;
            Cylinder c1 =new Cylinder();

        }
        this.state = Status.EXERCISING;
        this.moves = Status.MOVING;
        s1.Check(this.name,moves);
    }
    public void Beating(String name, String name1){

        isBeating(name,name1);
        this.state = Status.BEATING;
        this.moves = Status.MOVING;
        s1.Check(this.name,moves);
    }
    public void Escaping(String name){
        isEscaping(name);
        this.state = Status.ESCAPING;
        this.moves = Status.MOVING;
        s1.Check(this.name,moves);
    }
    public void Hidden(String name){
        isHidden(name);
        this.state = Status.HIDDEN;
        this.moves = Status.MOVING;
        s1.Check(this.name,moves);
    }
    public class Cylinder {
        public Cylinder()throws HeadDressException{
            if (NoHeadDress==true){
                throw new HeadDressException("У "+name+" НЕТ ГОЛОВНОГО УБОРА" );
            }
            else {
                System.out.print(" И НАДЕЛ НА ГОЛОВУ ВАЛЯВШИЙСЯ НА ЗЕМЛЕ ЦИЛИНДР");
            }
        }
    }
}

