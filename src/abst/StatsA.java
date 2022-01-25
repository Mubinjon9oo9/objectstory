package abst;

import interfaces.Stats;

public abstract class StatsA implements Stats {
    public String name;
    public Status state;

    public StatsA(String name, Status state){
        this.name=name;
        this.state=state;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Status getState(Status state) {
        return state;
    }

    public void joinStory(String name){
        System.out.println("Персонаж " + name + " вступает в игру");
    }
}
