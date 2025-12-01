package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User details fetched from DB based on data base logic and CRUD Operation";
    }


}
