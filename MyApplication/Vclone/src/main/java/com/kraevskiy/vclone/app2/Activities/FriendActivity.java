package com.kraevskiy.vclone.app2.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.kraevskiy.vclone.app2.POJO.Friend;
import com.kraevskiy.vclone.app2.R;

public class FriendActivity extends Activity{

    private static final String TAG = FriendActivity.class.getSimpleName();

    private static final String ONLINE = "Online.";

    private static final String WAS_ONLINE = "Was online ";

    private ImageView fAvatarView;
    private TextView fFullNameView;
    private TextView fLastSeenView;
    private TextView fFirstStatusView;
    private TextView fSecondStatusView;
    private TextView fDateOfBirthdayView;
    private TextView fRelationView;
    private TextView fCountryView;
    private TextView fCityView;
    private TextView fEducationView;
    private TextView fUniversityView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);

        initButtons();

        Friend friend = (Friend) getIntent().getSerializableExtra(FriendsActivity.EXTRA_DATA);

        fAvatarView.setImageResource(friend.getPhoto());
        fFullNameView.setText(friend.getFirstName() + " " + friend.getLastName());

        if (friend.isOnline()) {
            fLastSeenView.setText(ONLINE);
        } else {
            fLastSeenView.setText(WAS_ONLINE + friend.getLastSeen());
        }

        fFirstStatusView.setText(friend.getStatus());
        fSecondStatusView.setText(friend.getStatus());

        fDateOfBirthdayView.setText(friend.getBirthDate());
        fRelationView.setText(friend.getRelation());
        fCountryView.setText(friend.getCountry());
        fCityView.setText(friend.getCity());
        fEducationView.setText(friend.getEducation());
        fUniversityView.setText(friend.getUniversities());

        Log.d(TAG, "Friend activity with id: " + friend.getId() + " was created.");
    }

    private void initButtons() {
        fAvatarView = (ImageView) findViewById(R.id.friend_avatar);
        fFullNameView = (TextView) findViewById(R.id.friend_full_name);
        fLastSeenView = (TextView) findViewById(R.id.friend_last_seen_text);
        fFirstStatusView = (TextView) findViewById(R.id.friend_status_bar);
        fSecondStatusView = (TextView) findViewById(R.id.friend_status_bar_2);
        fDateOfBirthdayView = (TextView) findViewById(R.id.friend_date_of_birthday);
        fRelationView = (TextView) findViewById(R.id.friend_relation);
        fCountryView = (TextView) findViewById(R.id.friend_country);
        fCityView = (TextView) findViewById(R.id.friend_city);
        fEducationView = (TextView) findViewById(R.id.friend_education);
        fUniversityView = (TextView) findViewById(R.id.friend_universities);
    }
}
