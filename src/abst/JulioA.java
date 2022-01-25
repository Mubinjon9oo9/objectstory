package abst;

import interfaces.JulioI;

public abstract class JulioA implements JulioI {
    String name;
    boolean states;

    public JulioA(String name, boolean states){
        this.name=name;
        this.states=states;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean isFalling(String name) {
        System.out.print("\n"+name + " упал");
        return true;
    }

    @Override
    public boolean isNotExpecting(String name) {
        System.out.print("\n"+name + " неожидал удар");
        return true;
    }

    @Override
    public boolean isReanimating(String name,String name1) {
        System.out.print("\n"+name + " реанимирует "+ name1);
        return true;
    }

    @Override
    public Status getState(Status state) {
        return state;
    }
}
