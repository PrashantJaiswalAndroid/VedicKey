package com.example.vedkey;



import com.example.vedkey.Service.MusicService;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;




public class OpionsActivity extends Activity{


	ImageView settingicon;
	
	View HeaderView;
	SharedPref  pref;
	TextView headetxt;

	Button tutorialbtn,tryityourself,quizbtn,helpbtn,exitbtn;
	
	public static String option="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.optionsactivity);


		pref=new SharedPref();
		

		/*System.out.println("_______________"+pref.getSharedPrefData(OpionsActivity.this,SharedPref.PREFRENCE_MUSIC));

		if(pref.getSharedPrefData(OpionsActivity.this,SharedPref.PREFRENCE_MUSIC).equalsIgnoreCase(""))
		{
			pref.setDataInSharedPrefrence(OpionsActivity.this, SharedPref.PREFRENCE_MUSIC,"MUSICSTART");
			mp.start();
			System.out.println("start");
		}


		mp.setOnCompletionListener(new OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer mp) {
				mp.start();
			}

		});
		 */



		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub


	/*	Typeface trajan_pro_regular = Typeface.createFromAsset(getAssets(),
				"fonts/Lato-Black.ttf");*/

		HeaderView=(View)findViewById(R.id.headerlyt);

		headetxt=(TextView)findViewById(R.id.vedkeytxt);
		//headetxt.setTypeface(trajan_pro_regular);

		tutorialbtn=(Button)findViewById(R.id.tutorialbtn);
		//tutorialbtn.setTypeface(trajan_pro_regular);
		tutorialbtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			option="Tutorial";
				Intent i = new Intent(OpionsActivity.this,NavigationActivity.class);
				startActivity(i);
				overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
				OpionsActivity.this.finish();
			}
		});

		tryityourself=(Button)findViewById(R.id.tryityourself);
		//tryityourself.setTypeface(trajan_pro_regular);
		tryityourself.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				option="Try it yourself";
				Intent i = new Intent(OpionsActivity.this,NavigationActivity.class);
				startActivity(i);
				overridePendingTransition(R.anim.slideleft1, R.anim.slideleft2);
				OpionsActivity.this.finish();
			}
		});

		quizbtn=(Button)findViewById(R.id.quizbtn);
		//quizbtn.setTypeface(trajan_pro_regular);

		helpbtn=(Button)findViewById(R.id.helpbtn);
		//helpbtn.setTypeface(trajan_pro_regular);
		
		exitbtn=(Button)findViewById(R.id.exitbtn);
		//exitbtn.setTypeface(trajan_pro_regular);
		
		exitbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ial = new Intent(OpionsActivity.this, MusicService.class);
				stopService(ial);
				OpionsActivity.this.finish();
				
			}
		});

	


		/*settingicon=(ImageView)HeaderView.findViewById(R.id.settingicon);

		settingicon.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println();

				settingdialog();


			}
		});*/



	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		//super.onBackPressed();
	}

	/*protected void settingdialog() {
		// TODO Auto-generated method stub
		Dialog dialog = new Dialog(OpionsActivity.this);
		dialog.setContentView(R.layout.settingdialog);
		dialog.setTitle("Setting");
		ImageView soundoff = (ImageView) dialog.findViewById(R.id.soundonoff);
		final ImageView musicoff = (ImageView) dialog.findViewById(R.id.musiconoff);

		soundoff.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(pref.getSharedPrefData(OpionsActivity.this,SharedPref.PREFRENCE_SOUND).equalsIgnoreCase("SOUNDSTART"))
				{
					pref.setDataInSharedPrefrence(OpionsActivity.this, SharedPref.PREFRENCE_SOUND,"Stop");
					mp.stop();
				}
				else
				{
					pref.setDataInSharedPrefrence(OpionsActivity.this, SharedPref.PREFRENCE_SOUND,"SOUNDSTART");
					mp.start();
				}



			}
		});
		musicoff.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(pref.getSharedPrefData(OpionsActivity.this,SharedPref.PREFRENCE_MUSIC).equalsIgnoreCase("MUSICSTART"))
				{
					pref.setDataInSharedPrefrence(OpionsActivity.this, SharedPref.PREFRENCE_MUSIC,"");
					mp.stop();
				
				}
				else
				{
					
					
				}

			}
		});
		dialog.show();
	}*/

	@Override
	protected void onDestroy() {
		
		super.onDestroy();
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();

		
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
	

	}





}
