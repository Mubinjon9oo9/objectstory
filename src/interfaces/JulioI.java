package interfaces;



public interface JulioI extends Stats{
    String getName();
    boolean isReanimating(String name,String name1);
    boolean isNotExpecting(String name);
    boolean isFalling(String name);
}
