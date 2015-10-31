package com.example.vedkey;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HomeScreen extends Activity{

	TextView vedketxt;
	private long delayMillis = 5000;
	RelativeLayout introlayout;
	TextView taphere;

	SharedPref _sref;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		_sref=new SharedPref();
		
		/*	Typeface trajan_pro_regular = Typeface.createFromAsset(getAssets(),
                "fonts/Lato-Black.ttf");*/
	
		
		vedketxt=(TextView)findViewById(R.id.vedkeytxt);

		taphere=(TextView)findViewById(R.id.taphere);
		blink();

		//vedketxt.setTypeface(trajan_pro_regular);

		introlayout=(RelativeLayout)findViewById(R.id.introlayout);
		taphere.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				HomeScreen.this.finish();
				Intent admin = new Intent(HomeScreen.this, OpionsActivity.class);
				startActivity(admin);
				overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
			}
		});


		

	}
	
	private void blink(){
	    final Handler handler = new Handler();
	    new Thread(new Runnable() {
	        @Override
	        public void run() {
	        int timeToBlink = 1000;    //in milissegunds
	        try{Thread.sleep(timeToBlink);}catch (Exception e) {}
	            handler.post(new Runnable() {
	                @Override
	                    public void run() {
	                    
	                    if(taphere.getVisibility() == View.VISIBLE){
	                    	taphere.setVisibility(View.INVISIBLE);
	                    }else{
	                    	taphere.setVisibility(View.VISIBLE);
	                    }
	                    blink();
	                }
	                });
	            }
	        }).start();
	    }

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		//super.onBackPressed();
		//this.finish();

		//overridePendingTransition(R.anim.slideright1, R.anim.slideright2);
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		
		super.onDestroy();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		
	}
}
