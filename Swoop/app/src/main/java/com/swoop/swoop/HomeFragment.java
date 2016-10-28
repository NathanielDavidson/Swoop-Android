package com.swoop.swoop;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * PreferencesFragment
 *
 * @author Yarely Chino
 * @version 1.0
 */

public class HomeFragment extends Fragment implements View.OnClickListener{

    private Button mCreateSwoopButton, mSwoopButton, mNotificationButton, mNewSwoops;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home_fragment, container, false);

        mCreateSwoopButton = (Button) view.findViewById(R.id.create_swoop_button);
        mSwoopButton = (Button) view.findViewById(R.id.swoop_button);
        mNotificationButton = (Button) view.findViewById(R.id.notification_button);
        mNewSwoops = (Button) view.findViewById(R.id.new_swoops_button);


        mCreateSwoopButton.setOnClickListener(this);
        mSwoopButton.setOnClickListener(this);
        mNotificationButton.setOnClickListener(this);
        mNewSwoops.setOnClickListener(this);


        // Inflate the layout for this fragment
        return view;
    }


    /**
     * Implementation for View.onClickListener
     *
     * @param //View v
     */
    @Override
    public void onClick(View v) {

        // Check what was clicked
        switch (v.getId()) {
            case R.id.create_swoop_button:
                Intent intent = new Intent(v.getContext(), CreateCarpoolActivity.class);
                startActivity(intent);
                break;
            case R.id.swoop_button:
                createToast("Swoop button was clicked");
                break;
            case R.id.notification_button:
                createToast("Notification button was clicked");
                break;
            case R.id.new_swoops_button:
                createToast("New Swoop button was clicked");
                break;

        }

    }

    void createToast(String s) {
        Toast toast = Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT);
        toast.show();
    }




}
