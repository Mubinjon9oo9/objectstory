package abst;

import interfaces.MigaI;

public abstract class MigaA implements MigaI {
    String name;
    boolean states;
    Status moves;

    public MigaA(String name, boolean states){
        this.name=name;
        this.states=states;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isHelping(String name, String name1) {
        System.out.print("\n"+name + " помогает " + name1);
        return true;
    }

    @Override
    public boolean isCatching(String name, String name1) {
        System.out.print("\n"+name+ " пытается поймать "+name1);
        return true;
    }

    @Override
    public boolean isFallen(String name) {
        System.out.print("\n"+name + " упал");
        return true;
    }

    @Override
    public boolean isStanding(String name, String name1) {
        System.out.print("\n"+name + " встал и ищет " + name1);
        return true;
    }

    @Override
    public Status getState(Status state) {
        return state;
    }
}
