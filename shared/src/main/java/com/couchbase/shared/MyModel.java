package com.couchbase.shared;

import com.couchbase.lite.CouchbaseLiteException;
import com.couchbase.lite.Database;
import com.couchbase.lite.JavaContext;
import com.couchbase.lite.Manager;
import com.couchbase.lite.ManagerOptions;
import com.couchbase.lite.util.Log;

import java.io.IOException;

public class MyModel {

    static final String LOG = "J2ObjC";
    Manager manager;
    Database database;

    public MyModel() {

        try {
            Manager.enableLogging(LOG, Log.VERBOSE);

            Boolean bool = Database.isValidDocumentId("mydb");
            Log.d(LOG, "Validity of db name is" + bool);

            manager = new Manager(new JavaContext(), Manager.DEFAULT_OPTIONS);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            database = manager.getExistingDatabase("mydb");
//        } catch (CouchbaseLiteException e) {
//            e.printStackTrace();
//        }
//
//        database.createDocument();
    }

}
