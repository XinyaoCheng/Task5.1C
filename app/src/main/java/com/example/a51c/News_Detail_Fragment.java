package com.example.a51c;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link News_Detail_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class News_Detail_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String news_title;
    private String news_desc;
    private TextView news_title_view, news_desc_view;
    private ImageView news_image_view;
    private int news_image;
    public News_Detail_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment news_detail_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static News_Detail_Fragment newInstance(String param1, String param2) {
        News_Detail_Fragment fragment = new News_Detail_Fragment();
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
        View rootView = inflater.inflate(R.layout.news_detail_fragment, container, false);

        Bundle bundle = getArguments();
        if(bundle!=null){
            news_title = bundle.getString("news_title");
            news_desc = bundle.getString("news_desc");
            news_image = bundle.getInt("news_image");
        }

        //set title, description, and an image for detailed news fragment
        news_title_view = rootView.findViewById(R.id.news_detail_title);
        news_desc_view = rootView.findViewById(R.id.news_detail_desc);
        news_image_view = rootView.findViewById(R.id.news_detail_image);
        news_title_view.setText(news_title);
        news_desc_view.setText(news_desc);
        news_image_view.setImageResource(news_image);
        news_image_view.setScaleType(ImageView.ScaleType.FIT_XY);
        return rootView;
    }
}