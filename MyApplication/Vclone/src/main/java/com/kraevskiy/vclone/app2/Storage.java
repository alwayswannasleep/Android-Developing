package com.kraevskiy.vclone.app2;

import android.util.Log;
import android.util.SparseArray;
import com.kraevskiy.vclone.app2.POJO.Friend;
import com.kraevskiy.vclone.app2.POJO.Group;

public class Storage {

    private static final int FRIENDS_COUNT = 25;
    private static final int GROUPS_COUNT = 8;

    private static final String TAG = "Storage";

    private SparseArray<Friend> friendsArray;

    private SparseArray<Group> groupsArray;

    public Storage() {
        friendsArray = new SparseArray<Friend>();
        groupsArray = new SparseArray<Group>();
    }

    public void init() {
        generateFriends();
        generateGroups();

        Log.d(TAG, "Storage was initialized");
    }

    public SparseArray<Friend> getFriendsArray() {
        return friendsArray;
    }

    public SparseArray<Group> getGroupsArray() {
        return groupsArray;
    }

    private void generateFriends() {
        for (int id = 0; id < FRIENDS_COUNT; ++id) {
            friendsArray.append(id, Utils.generateFriendById(id));
        }

        Log.d(TAG, "Friends were generated");
    }

    private void generateGroups() {
        for (int id = 0; id < GROUPS_COUNT; ++id) {
            groupsArray.append(id, Utils.generateGroupById(id));
        }

        Log.d(TAG, "Groups were generated");
    }

}
