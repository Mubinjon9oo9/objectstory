package interfaces;

import abst.Status;

public interface Stats {
    String getName();
    Status getState(Status state);
}
