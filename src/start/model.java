package start;

import characters.*;
import ex1.*;

public class model {

    public static void main(String[] args) throws HeadDressException {

        Julio p1 = new Julio();
        Scuperfield p2 = new Scuperfield();
        Miga p3 =new Miga();
        Stats s1 = new Stats();
        s1.joinStory(p1.name);
        s1.joinStory(p2.name);
        s1.joinStory(p3.name);
        p2.Dying(p2.name);
        p1.Reanimating(p1.name, p2.name);
        p3.Helping(p3.name, p1.name);
        p2.Alive(p2.name);
        p2.Exercising(p2.name);
        p2.Beating(p2.name, p1.name);
        p1.NotExpecting(p1.name);
        p1.Falling(p1.name);
        p2.Escaping(p2.name);
        p3.Catching(p3.name, p2.name);
        p3.Fallen(p3.name);
        p3.Standing(p3.name, p2.name);
        p2.Hidden(p2.name);
    }
}

