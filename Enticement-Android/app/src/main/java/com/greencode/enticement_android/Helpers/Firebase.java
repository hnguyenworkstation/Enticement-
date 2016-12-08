package com.greencode.enticement_android.Helpers;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.greencode.enticement_android.Models.MyProfile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hung Nguyen on 11/28/2016.
 */

public class Firebase {
    public static DatabaseReference ChatRoomRef = FirebaseDatabase.getInstance().getReference().child("Chatroom");
    public static DatabaseReference UserRef = FirebaseDatabase.getInstance().getReference().child("Users");

    public static final String USER_ID = "user_id";
    public static final String USER_NAME = "user_name";
    public static final String USER_NICKNAME = "user_nickname";
    public static final String USER_BIRTHDAY = "user_birthday";
    public static final String USER_CREATEDAT = "user_created_at";

    public static void registerNewUser(MyProfile myProfile) {
        Map<String, Object> mapUser = new HashMap<>();
        String key = UserRef.push().getKey();
        mapUser.put(USER_ID, key);
        mapUser.put(USER_NAME, myProfile.getName());
    }
}
