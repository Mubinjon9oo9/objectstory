package interfaces;

public interface ScuperfieldI extends Stats{
    String getName();
    boolean isDying(String name);
    boolean isAlive(String name);
    boolean isExercising(String name);
    boolean isBeating(String name,String name1);
    boolean isEscaping(String name);
    boolean isHidden(String name);
}
