package com.kraevskiy.vclone.app2;

import android.util.SparseArray;
import com.kraevskiy.vclone.app2.POJO.Friend;
import com.kraevskiy.vclone.app2.POJO.Group;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Utils {

    private static Storage storage;

    private Utils() {}

    public static void init() {
        storage = new Storage();

        storage.init();
    }

    public static Friend generateFriendById(int id) {
        final Friend friend = new Friend();

        final boolean isVeryImportant = (id % 2 == 0);

        final DateFormat dateFormat = DateFormat.getDateInstance();

        friend.setId(id);
        friend.setFirstName(Friend.FRIEND_FIRST_NAME + Friend.FRIEND_STRING_SEPARATOR + id);
        friend.setLastName(Friend.FRIEND_LAST_NAME + Friend.FRIEND_STRING_SEPARATOR + id);
        friend.setIsOnline(isVeryImportant);
        friend.setNickName(Friend.FRIEND_NICKNAME + Friend.FRIEND_STRING_SEPARATOR + id);
        friend.setSex(isVeryImportant ? "Male" : "Female");
        friend.setBirthDate(dateFormat.format(new Date()));
        friend.setCity(Friend.FRIEND_CITY + Friend.FRIEND_STRING_SEPARATOR + id);
        friend.setCountry(Friend.FRIEND_COUNTRY + Friend.FRIEND_STRING_SEPARATOR + id);
        friend.setPhoto(R.mipmap.ic_launcher);
        friend.setHasMobile(isVeryImportant);
        friend.setEducation(Friend.FRIEND_EDUCATION + Friend.FRIEND_STRING_SEPARATOR + id);
        friend.setRelation(Friend.FRIEND_RELATION + Friend.FRIEND_STRING_SEPARATOR + id);
        friend.setLastSeen(dateFormat.format(new Date(System.currentTimeMillis() - Friend.LAST_SEEN_MILLISECONDS_COUNT)));
        friend.setStatus(Friend.FRIEND_STATUS + Friend.FRIEND_STRING_SEPARATOR + id);
        friend.setCanWritePrivateMessage(isVeryImportant);
        friend.setCanSeeAllPosts(isVeryImportant);
        friend.setCanPost(isVeryImportant);
        friend.setUniversities(Friend.FRIEND_UNIVERSITIES + Friend.FRIEND_STRING_SEPARATOR + id);

        return friend;
    }

    public static Group generateGroupById(int id) {
        final Group group = new Group();

        final boolean isImportant = (id % 2 == 0);

        group.setId(id);
        group.setName(Group.NAME + Group.NAME_SEPARATOR + id);
        group.setScreenName(Group.SCREEN_NAME + Group.NAME_SEPARATOR + id);
        group.setIsClosed(isImportant);
        group.setType(Group.TYPES[new Random().nextInt(Group.TYPES.length - 1)]);
        group.setIsAdmin(isImportant);
        group.setIsMember(isImportant);
        group.setPhoto(R.mipmap.ic_launcher);

        return group;
    }

    public static List<Friend> getFriendsListArray() {
        SparseArray<Friend> sparseArray = storage.getFriendsArray();

        List<Friend> arrayList = new ArrayList<Friend>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.valueAt(i));
        }

        return arrayList;
    }

    public static List<Group> getGroupsListArray() {
        SparseArray<Group> sparseArray = storage.getGroupsArray();

        List<Group> arrayList = new ArrayList<Group>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.valueAt(i));
        }

        return arrayList;
    }
}
