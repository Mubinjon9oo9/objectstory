package characters;

import abst.StatsA;
import abst.Status;

public class Stats extends StatsA {
    public String name;
    public Status state;

    public Stats(){
        super("", Status.DYING);
    }

    @Override
    public Status getState(Status state) {
        this.state = state;
        System.out.print(state);
        return state;
    }
}
