package com.example.vedkey.Service;

import com.example.vedkey.R;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.IBinder;

public class MusicService extends Service{
	  MediaPlayer mp;
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		 mp=MediaPlayer.create(this, R.raw.vedickeymusic);
		 mp.start();
		 mp.setOnCompletionListener(new OnCompletionListener() {

				@Override
				public void onCompletion(MediaPlayer mp) {
					mp.start();
				}

			});
	
		
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		if(null!=mp){
			mp.release();
			
		}
			super.onDestroy();
		}
	
	@SuppressLint("NewApi")
	@Override
	public void onTaskRemoved(Intent rootIntent) {
		// TODO Auto-generated method stub
		super.onTaskRemoved(rootIntent);
		
		//Intent ial = new Intent(this, MusicService.class);
		stopSelf();
		
	}
	
}

