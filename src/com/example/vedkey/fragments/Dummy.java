package com.example.vedkey.fragments;

import com.example.vedkey.NavigationActivity;
import com.example.vedkey.R;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Dummy extends Fragment{

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.headerlayout, container, false);

		getActivity().setTitle(NavigationActivity.header);


		ImageView im= (ImageView)rootView.findViewById(R.id.guruicon);
		im.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				
				Toast.makeText(getActivity(), "sss", Toast.LENGTH_SHORT).show();
				
			}
		});
		

		return rootView;
	}
}
