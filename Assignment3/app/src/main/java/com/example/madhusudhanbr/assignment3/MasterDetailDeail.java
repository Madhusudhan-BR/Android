package com.example.madhusudhanbr.assignment3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
//import android.app.Fragment;
import android.support.v4.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;


public class MasterDetailDeail extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
 HashMap<String, ?> movie;
//    private String mParam2;

    //private OnFragmentInteractionListener mListener;

    public MasterDetailDeail() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static MasterDetailDeail newInstance(HashMap<String, ?> movie) {
        MasterDetailDeail fragment = new MasterDetailDeail();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, movie);
      //  args.putString(ARG_PARAM2, param2);
        //fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            movie = (HashMap<String, ?>) getArguments().getSerializable(ARG_PARAM1);
            //mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_master_detail_deail, container, false);

        TextView idView = (TextView) view.findViewById(R.id.textView4);
        TextView titleView = (TextView) view.findViewById(R.id.textView6);
        TextView descView = (TextView) view.findViewById(R.id.textView8);
        TextView releaseView = (TextView) view.findViewById(R.id.textView10);
        TextView voteView = (TextView) view.findViewById(R.id.textView12);

        TextView id = (TextView) view.findViewById(R.id.textView5);
        TextView title = (TextView) view.findViewById(R.id.textView7);
        TextView desc = (TextView) view.findViewById(R.id.textView9);
        TextView release = (TextView) view.findViewById(R.id.textView11);
        TextView vote = (TextView) view.findViewById(R.id.textView13);
        final ImageView image = (ImageView) view.findViewById(R.id.imageView2);

        idView.setText("ID");
        titleView.setText("Title");
        descView.setText("Description");
        releaseView.setText("Release date");
        voteView.setText("Votes");
        Log.d("movie", movie.toString());
        id.setText(movie.get("id").toString());
        title.setText(movie.get("title").toString());
        image.setImageResource((Integer) movie.get( "image"));
        vote.setText(movie.get("voteCount").toString());
        release.setText(movie.get("release").toString());
        desc.setText(movie.get("overview").toString());

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
}
