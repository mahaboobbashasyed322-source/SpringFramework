package com.loose.coupling;

public class UserDataManager {
   private UserDataProvider userDataProvider;

   public UserDataManager(UserDataProvider userDataprovider){
       this.userDataProvider=userDataprovider;
   }

   public String getUserInfo(){
       return userDataProvider.getUserDetails();
   }
}
