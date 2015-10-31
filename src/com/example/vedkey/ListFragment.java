package com.example.vedkey;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.example.vedkey.Adapter.Tutorial_List_Adapter;
import com.example.vedkey.Bean.MultiplicationBean;
import com.example.vedkey.fragments.OptionThirdtryyourself;
import com.example.vedkey.fragments.OptionthirdFragment;



public class ListFragment extends Fragment implements OnClickListener 
{


	ImageView btMenu     = null;
	TextView tvTitle       = null;
	Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;


	public static  ImageView toggle_on_off;

	public static Context _context;

	int width =0;
	int height=0;




	String[] options= new String[]{"1.Multiplying two numbers where first digit of both the numbers are the same and sum of second digit of both the numbers is " +
			"10.","2. Multiplying a number by 9.","3. Multiplying numbers close and less than 100 ( i.e. between 90 to 100 ).",
			"4. Multiplying numbers close and greater than 100 ( i.e. between 101 to 110 )."," 5. Multiplying a two-digit number by 11."
			,"6. Multiplication of any two-digit numbers.","7. Multiplying two numbers where first digit of both the numbers is the same."
			,"8. Multiplying a number by 9’s (i.e 99, 999, 9999 ........).","9. Multiplying a n-digit number by 11.","10. Multiplication of any three-digit numbers."};

	ArrayList<MultiplicationBean> multplicationlist= new ArrayList<MultiplicationBean>();

	Tutorial_List_Adapter adapter;

	ListView list;



	@SuppressLint("NewApi")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.multiplicatonlist, container, false);
		
		getActivity().setTitle(NavigationActivity.header);
		

		Display display = getActivity().getWindowManager().getDefaultDisplay();
		Point size = new Point();
		display.getSize(size);
		width= size.x;
		height = size.y;
		Log.i("width", String.valueOf(width));
		Log.i("height", String.valueOf(height));
		_context=getActivity();




		list=(ListView)rootView.findViewById(R.id.list);

		for(int i=0;i<options.length;i++)
		{
			MultiplicationBean bean= new MultiplicationBean();
			bean.setName(options[i]);

			multplicationlist.add(bean);
		}

		// setting the nav drawer list adapter
		adapter = new Tutorial_List_Adapter(_context,multplicationlist);
		list.setAdapter(adapter);



		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub


				if(multplicationlist.get(position).getName().equalsIgnoreCase("3. Multiplying numbers close and less than 100 ( i.e. between 90 to 100 )."))
				{
					// Add FragmentMain as the initial fragment       
					FragmentManager fm = getActivity().getSupportFragmentManager();
					FragmentTransaction ft = fm.beginTransaction();
					if(NavigationActivity.header.equals("Tutorial"))
					{
						fragment = new OptionthirdFragment();
						if(fragment!=null)
						{
							ft.replace(R.id.container, fragment);
							ft.commit();
						}
					}
					else
					{
						fragment = new OptionThirdtryyourself();
						if(fragment!=null)
						{
							ft.replace(R.id.container, fragment);
							ft.commit();
						}
					}




				}
			}
		});







		return rootView;
	}

	@Override
	public void onResume() {

		super.onResume();
		/*mp= MediaPlayer.create(getActivity(), R.raw.vedickeymusic);
		mp.start();
		mp.setOnCompletionListener(new OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer mp) {
				mp.start();
			}

		});*/

	}

	@Override
	public void onDestroy() {
		
		super.onDestroy();
	}


	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();

	}

	@SuppressLint("NewApi") @Override
	public void onClick(View v) 
	{/*
		fm = TutorialListACtivity.this.getSupportFragmentManager();
		ft = fm.beginTransaction();
		switch (v.getId()) 
		{


		case R.id.user_name_menu:
				Intent i10 = new Intent(Header.this,UserProfileActivity.class);
			startActivity(i10);
			break;












			case R.id.favorites_layout:
			mainLayout.toggleMenu();
			tvTitle.setText(getResources().getString(R.string.favourite_title));
			tvTitle.setTypeface(trajan_pro_regular);
			if(!MainLayout._hide)
			{
				_count.setVisibility(View.GONE);
				_filter.setVisibility(View.GONE);
				_tag.setVisibility(View.VISIBLE);
				_tag.setImageDrawable(getResources().getDrawable(R.drawable.header_plus));
				fragment = new Favorites_Activity();


			}

			break;




		}
		if(fragment != null) 
		{
			// Replace current fragment by this new one
			ft.replace(R.id.activity_main_content_fragment, fragment);
			ft.commit();

		}

	 */}



















}

