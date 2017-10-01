package com.example.madhusudhanbr.assignment4;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;


public class RecyclerViewFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;

  //  private OnFragmentInteractionListener mListener;

    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    MovieData movieData = new MovieData() ;
    MyRecyclerViewAdapter mRecyclerViewAdapter;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    public interface CustomNewFrag {
        public void customClick(HashMap movie);
    }


    private CustomNewFrag customNewFrag;

    // TODO: Rename and change types and number of parameters
//    public static RecyclerViewFragment newInstance(String param1, String param2) {
//        RecyclerViewFragment fragment = new RecyclerViewFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerViewAdapter = new MyRecyclerViewAdapter(getActivity(), movieData.getMoviesList());
        mRecyclerView.setAdapter(mRecyclerViewAdapter);

        Button btnSort = (Button)rootView.findViewById(R.id.sort);

        itemAnimator();
        adapterAnimation();

        btnSort.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Collections.sort(movieData.getMoviesList(), new Comparator<Map<String, ?>>() {
                    @Override
                    public int compare(Map<String, ?> o1, Map<String, ?> o2) {
                        return o2.get("release").toString().compareTo(o1.get("release").toString());
                    }
                });
                mRecyclerViewAdapter.notifyDataSetChanged();
            }
        });

        Button btnSelectAll = (Button)rootView.findViewById(R.id.select);
        btnSelectAll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                for(int i=0; i<mRecyclerViewAdapter.getItemCount(); i++){
                    HashMap<String,Boolean> item = (HashMap<String,Boolean>)movieData.getItem(i);
                    item.put("selection",true);
                }
                mRecyclerViewAdapter.notifyDataSetChanged();
            }
        });

        Button btnClearAll = (Button)rootView.findViewById(R.id.clear);
        btnClearAll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                for(int i=0; i<mRecyclerViewAdapter.getItemCount(); i++){
                    HashMap<String,Boolean>item = (HashMap<String,Boolean>)movieData.getItem(i);
                    item.put("selection",false);
                }
                mRecyclerViewAdapter.notifyDataSetChanged();
            }
        });

        Button btnDelete = (Button)rootView.findViewById(R.id.delete);
        btnDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                for(int i=mRecyclerViewAdapter.getItemCount()-1;i>=0;i--){
                    HashMap<String,Boolean>item = (HashMap<String,Boolean>)movieData.getItem(i);
                    boolean b = item.get("selection");
                    if(b==true){
                        movieData.removeItem(i);
                        mRecyclerViewAdapter.notifyItemRemoved(i);
                    }
                }

            }
        });


        mRecyclerViewAdapter.SetOnItemClickListener(new MyRecyclerViewAdapter.OnItemClickListener() {

            @Override
            public void onItemClick(View view, int position) {
                int pos = position;
                //Toast.makeText(getActivity(), Integer.toString(position)  , Toast.LENGTH_SHORT).show();
                customNewFrag.customClick(movieData.getItem(pos));
            }

            @Override
            public void onItemLongClick(View view, int position) {
                //Toast.makeText(getActivity(), Integer.toString(position), Toast.LENGTH_SHORT).show();
                movieData.addItem(position);
                //movieData.add(position+1, (HashMap) movieData.getItem(position).clone());

                mRecyclerViewAdapter.notifyItemInserted(position + 1);





            }

            @Override
            public void onCheckBoxClick(View view, int position){
                HashMap<String,Boolean>item = (HashMap<String,Boolean>)movieData.getItem(position);
                boolean checked = item.get("selection");
                if(checked == true){
                    item.put("selection",false);
                }else if(checked == false){
                    item.put("selection",true);
                }
            }
        });


        return rootView;
    }

    private void itemAnimator(){
        SlideInUpAnimator animator = new SlideInUpAnimator(new OvershootInterpolator());
        mRecyclerView.setItemAnimator(animator);
        animator.setAddDuration(1000);
        animator.setRemoveDuration(1000);
    }

    private void adapterAnimation() {
        AlphaInAnimationAdapter alphaInAnimationAdapter = new AlphaInAnimationAdapter(mRecyclerViewAdapter);
        ScaleInAnimationAdapter scaleInAnimationAdapter = new ScaleInAnimationAdapter(alphaInAnimationAdapter);
        mRecyclerView.setAdapter(scaleInAnimationAdapter);
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

    public void onAttach ( Activity activity ) {
        super .onAttach(activity);
        customNewFrag = (CustomNewFrag) activity ;
    }
}
