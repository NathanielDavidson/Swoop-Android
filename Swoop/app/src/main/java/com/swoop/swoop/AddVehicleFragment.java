package com.swoop.swoop;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * PreferencesFragment
 *
 * @author Yarely Chino
 * @version 1.0
 */

public class AddVehicleFragment extends Fragment implements View.OnClickListener{


    public AddVehicleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.add_vehicle_fragment, container, false);


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

        }

    }

    void createToast(String s) {
        Toast toast = Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT);
        toast.show();
    }




}
