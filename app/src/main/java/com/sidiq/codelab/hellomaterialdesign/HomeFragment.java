package com.sidiq.codelab.hellomaterialdesign;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private String[] footballClubs = new String[]{
            "Juventus",
            "Manchester United",
            "Bayern Munchen",
            "Liverpool",
            "Inter Milan",
            "Barcelona",
            "Ajax Amsterdam",
            "Dynamo Kiev",
            "Chelsea",
            "Ac Milan"
    };

    private RecyclerView rvItem;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rvItem = (RecyclerView)view.findViewById(R.id.rv_item);
        rvItem.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rvItem.setLayoutManager(linearLayoutManager);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TitleRvAdapter adapter = new TitleRvAdapter(getActivity(), footballClubs);
        rvItem.setAdapter(adapter);
    }
}
