package com.example.madhusudhanbr.assignment3;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
//import android.app.Fragment;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



public class MasterDetailFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
    TextView textView;
    Button increaseButton;
    Button decreaseButton;
    static int count;

    public interface CustomListerner {
        public void clicked(View view , int count);
    }

    private CustomListerner customListerner;

    //private OnFragmentInteractionListener mListener;

    public MasterDetailFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static MasterDetailFragment newInstance(int counter) {
        MasterDetailFragment fragment = new MasterDetailFragment();
        Bundle args = new Bundle();
        count = counter;
        args.putInt("count",count);
        fragment.setArguments(args);
        return fragment;
    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            count = getArguments().getInt("count");
//
//        }
//    }

    private void readBundle(Bundle bundle) {
        if(bundle != null) {
            count = bundle.getInt("count");
        }
    }

    private void setBundle(Bundle bundle, int counter) {
        if(bundle != null) {
            bundle.putInt("count",counter);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_master_detail, container, false);

        textView = (TextView) view.findViewById(R.id.textView14);
        increaseButton = (Button) view.findViewById(R.id.button);
        decreaseButton = (Button) view.findViewById(R.id.button5);


        readBundle(getArguments());

        textView.setText(Integer.toString(count));

        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count + 1;
                if(count >= 25) {
                    count = 24;
                }
                //savedInstanceState.putInt("count", count);
                //setBundle(getArguments(), count);
                buttonClicked(v, count);
                textView.setText(Integer.toString(count));
            }
        });

        decreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count -1;
                if(count <= -1) {
                    count = 0;
                }
                buttonClicked(v, count);
                //savedInstanceState.putInt("count", count);
                //setBundle(getArguments(),count);
                textView.setText(Integer.toString(count));
            }
        });

        return view ;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        setBundle(getArguments(),count);
       MasterDetailActivity activity = (MasterDetailActivity) getActivity();
        activity.count = count;

    }

    public  void buttonClicked(View v, int count) {
        customListerner.clicked(v, count);
    }

    @Override
    @Deprecated
    public void onAttach ( Activity activity ) {
        super .onAttach(activity);
        customListerner = (CustomListerner) activity ;
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
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
