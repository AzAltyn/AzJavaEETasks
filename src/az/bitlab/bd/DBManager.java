package az.bitlab.bd;

import com.sun.source.tree.ForLoopTree;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Footballer> footballers = new ArrayList<>();

    private static Long id = 4l;

    static{
        footballers.add(new Footballer(1l,"Cristiano","Ronaldo",750000,"Juventus",1500000));
        footballers.add(new Footballer(2l,"Leonel","Messi",650000,"Barselona",1350000));
        footballers.add(new Footballer(3l,"Twelve","Marsello",550000,"Real Madrid",1100000));
    }

    public static void addFootboller(Footballer footballer){
        footballer.setId(id);
        footballers.add(footballer);
        id++;
    }

    public static ArrayList<Footballer> getFootballers(){
        return footballers;
    }

    public static Footballer getFootboller(Long id){
        for (Footballer fd:footballers) {
            if(fd.getId()==id){
                return fd;
            }
        }
        return null;
    }

}
