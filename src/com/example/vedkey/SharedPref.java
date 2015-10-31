package com.example.vedkey;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {
	
	public static final String PREFRENCE_KEY_MODE = "MODE";
	public static final String PREFRENCE_KEY_CAR = "CAR";

	

	public static final String PREFRENCE_NAME = "Profile_Prefrence";


	
	public static final String PREFRENCE_MUSIC_Home= "MUSICSTART_Home";
	public static final String PREFRENCE_MUSIC= "MUSICSTART";
	public static final String PREFRENCE_SOUND= "SOUNDSTART";
	
	
	

	public static String getSharedPrefData(Context activity, String key) {
		SharedPreferences prefs = activity.getSharedPreferences(PREFRENCE_NAME,
				Context.MODE_PRIVATE);
		String value = "";
		if (prefs != null && prefs.contains(key)) {
			value = prefs.getString(key, "");
		}
		return value;
	}


	public static String getValue(Context activity, String key) {
		String value = getSharedPrefData(activity, key);
		return value;
	}

	public static void setDataInSharedPrefrence(Context activity, String key,
			String value) {
		SharedPreferences prefs = activity.getSharedPreferences(PREFRENCE_NAME,
				Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString(key, value);
		editor.commit();
	}
	
	


	public static void deletePrefrenceData(Context activity) {
		SharedPreferences prefs = activity.getSharedPreferences(PREFRENCE_NAME,
				Context.MODE_PRIVATE);
		prefs.edit().clear().commit();
	}
}
