package com.kraevskiy.vclone.app2.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.kraevskiy.vclone.app2.Adapters.GroupsAdapter;
import com.kraevskiy.vclone.app2.POJO.Group;
import com.kraevskiy.vclone.app2.R;
import com.kraevskiy.vclone.app2.Utils;

public class GroupsActivity extends Activity {

    private static final String TAG = GroupsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        ListView groupsList = (ListView) findViewById(R.id.groups_list);

        groupsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Group group = (Group) adapterView.getItemAtPosition(position);

                Log.d(TAG, "Clicked on " + group);
            }
        });

       final GroupsAdapter groupsAdapter = new GroupsAdapter(this, Utils.getGroupsListArray());

        groupsList.setAdapter(groupsAdapter);

        Log.d(TAG, "GroupsActivity created");
    }
}
