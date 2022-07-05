package az.bitlab.bd;

import java.util.ArrayList;

public class DbMeneger {

    private static ArrayList<HrPersons> hrPersons = new ArrayList<>();

    static {

        hrPersons.add(new HrPersons("Iliyas","Zhuanyshev","IT",550000));
        hrPersons.add(new HrPersons("Aybek","Bagit","Management",650000));
        hrPersons.add(new HrPersons("Alibek","Serikov","HR",350000));
        hrPersons.add(new HrPersons("Serzhan","Berikov","IT",450000));
        hrPersons.add(new HrPersons("Madina","Asetova","PR",350000));
        hrPersons.add(new HrPersons("Anel","Mukhamejanova","Management",400000));

    }
    public static ArrayList<HrPersons> getHrPersons(){
        return hrPersons;
    }
}
