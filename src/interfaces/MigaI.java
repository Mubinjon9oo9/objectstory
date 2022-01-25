package interfaces;
public interface MigaI extends Stats{
    String getName();
    boolean isHelping(String name, String name1);
    boolean isCatching(String name, String name1);
    boolean isFallen(String name);
    boolean isStanding(String name, String name1);
}
