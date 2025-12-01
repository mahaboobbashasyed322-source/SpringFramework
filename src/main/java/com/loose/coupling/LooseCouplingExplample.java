package com.loose.coupling;

public class LooseCouplingExplample {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserDataManager userManagerDB = new UserDataManager(userDataProvider);

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserDataManager userManagerWithWS = new UserDataManager(webServiceProvider);

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserDataManager userManagerWithNewDB = new UserDataManager(newDatabaseProvider);

        System.out.println(userManagerDB.getUserInfo());
        System.out.println(userManagerWithWS.getUserInfo());
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
