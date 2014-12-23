package edu.pjwstk.kor.queries;

import java.util.*;
import com.db4o.ObjectContainer;
import edu.pjwstk.kor.model.*;
import edu.pjwstk.kor.model.data.*;

public class MyQuery {
    private DataGenerator data;
    private ObjectContainer dataBase;
    
    public static void main(String[] args) {
        MyQuery mainOb = new MyQuery();
    }
    
    public MyQuery() {
        super();
        data = new DataGenerator();
        dataBase = data.getConnection();
        query15();
        dataBase.close();
    }
    
    public void query15() {
        Collection<Packagement> avgWeight = new MyQuery_SbqlQuery0(dataBase).executeQuery();
        System.out.println(avgWeight);
    }
}