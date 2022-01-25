package ex1;

import abst.Status;
public class nullException extends NullPointerException {
    public void Check(String name,Status moves){
        if(moves==Status.NotMOVING) {
            try {
                Object o =null;
                o.hashCode();
            } catch (NullPointerException e) {
                System.out.print("-----" +name + " НЕ ДВИГАЕТСЯ!!!");
            }
        }
    }
}
