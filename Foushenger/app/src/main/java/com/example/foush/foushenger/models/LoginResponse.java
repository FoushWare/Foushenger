package com.example.foush.foushenger.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by foush on 10/23/17.
 */

public class LoginResponse {

    @SerializedName("status")
    public String status;
    @SerializedName("message")
    public String message;
    @SerializedName("user")
    public User user;

    public static  class User{
        @SerializedName("id")
        public String id;
        @SerializedName("user_name")
        public String user_name;
        @SerializedName("user_email")
        public String getUser_email;
        @SerializedName("is_user_admin")
        public String is_user_admin;
    }


}
