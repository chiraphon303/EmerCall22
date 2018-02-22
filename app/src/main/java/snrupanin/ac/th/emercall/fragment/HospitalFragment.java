package snrupanin.ac.th.emercall.fragment;


import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import snrupanin.ac.th.emercall.R;
import snrupanin.ac.th.emercall.utility.HopitalAdapter;

/**
 * Created by DSS on 02/22/18.
 */

public class HospitalFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create ListView
        ListView listView = getView().findViewById(R.id.listViewHopotal);

        int[] ints = new int[]{R.drawable.station1, R.drawable.station2,
               R.drawable.station3, R.drawable.station4, R.drawable.station1,
               R.drawable.station2, R.drawable.station3, R.drawable.station4,};

        String[] titleStrings = new String[]{"Hospital 1","Hospital 2","Hospital 3","Hospital 4","Hospital 5","Hospital 6",
                "Hospital 7","Hospital 8",};
        String[] phoneStrings = new String[]{"1111","1112","1113","1114","1115","1116","1117","1118",};

        HopitalAdapter hopitalAdapter = new HopitalAdapter(getActivity(), ints, titleStrings, phoneStrings);
        ListView.setAdapter(hopitalAdapter);

    }   // Main Method

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_hospital, container, false);
      return  view;
    }
}  // Main Class
