package com.example.a51c;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link News_List_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class News_List_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView mainNewsRecycleView;
    private RecyclerView.LayoutManager layoutManager4Main;
    private News_List_Adapter mainNewsAdapter;
    private ArrayList<NewsItems> newsList;

    public News_List_Fragment() {
        // Required empty public constructor
    }
    public News_List_Fragment(ArrayList<NewsItems> newsList) {
        this.newsList = newsList;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_news.
     */
    // TODO: Rename and change types and number of parameters
    public static News_List_Fragment newInstance(String param1, String param2) {
        News_List_Fragment fragment = new News_List_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.news_list_fragment, container, false);
        mainNewsRecycleView = rootView.findViewById(R.id.mainNewsRecycleView);
        mainNewsAdapter = new News_List_Adapter(getContext(),newsList);
        layoutManager4Main = new GridLayoutManager(getContext(), 2);
        mainNewsRecycleView.setLayoutManager(layoutManager4Main);
        mainNewsRecycleView.setAdapter(mainNewsAdapter);
        return rootView;
    }

}