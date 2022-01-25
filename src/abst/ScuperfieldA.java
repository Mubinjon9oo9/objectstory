package abst;

import interfaces.ScuperfieldI;

public abstract class ScuperfieldA implements ScuperfieldI {
    String name;
    boolean states;
    public ScuperfieldA(String name, boolean states){
        this.name=name;
        this.states=states;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Status getState(Status state) {
        return state;
    }

    @Override
    public boolean isDying(String name) {
        System.out.print("\n"+name + " умерает");
        return true;
    }

    @Override
    public boolean isAlive(String name) {
        System.out.print("\n"+name + " вернулся к жизни");
        return true;
    }

    @Override
    public boolean isExercising(String name) {
        System.out.print("\n"+name + " сделал упражнения");
        return true;
    }

    @Override
    public boolean isBeating(String name,String name1) {
        System.out.print("\n"+name + " бьет персонажа "+name1);
        return true;
    }

    @Override
    public boolean isEscaping(String name) {
        System.out.print("\n"+name + " сбегает");
        return true;
    }

    @Override
    public boolean isHidden(String name) {
        System.out.print("\n"+name + " спрятался");
        return true;
    }
}
