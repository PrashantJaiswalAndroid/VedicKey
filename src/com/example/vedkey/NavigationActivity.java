package com.example.vedkey;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

import com.example.vedkey.Nvigations.NavigationDrawerCallbacks;
import com.example.vedkey.Nvigations.NavigationDrawerFragment;
import com.example.vedkey.fragments.OptionThirdtryyourself;
import com.example.vedkey.fragments.OptionthirdFragment;


public class NavigationActivity extends ActionBarActivity implements NavigationDrawerCallbacks {

    private Toolbar mToolbar;
    private NavigationDrawerFragment mNavigationDrawerFragment;
    Fragment fragment      = null;
	FragmentManager fm     = null;
	FragmentTransaction ft = null;
	public static String header="";
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_topdrawer);
        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        



        mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager().findFragmentById(R.id.fragment_drawer);
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);
 
        	// Add FragmentMain as the initial fragment       
		/*FragmentManager fm = NavigationActivity.this.getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();


		fragment = new ListFragment();
		ft.add(R.id.container, fragment);
		ft.commit();
		*/
        
System.out.println("OpionsActivity.option: "+OpionsActivity.option);
     
    	if(OpionsActivity.option.equalsIgnoreCase("Tutorial"))
		{
    		FragmentManager fm = NavigationActivity.this.getSupportFragmentManager();
    		FragmentTransaction ft = fm.beginTransaction();

        	fragment = new ListFragment();
        	if(fragment!=null)
			{
        		header="Tutorial";
				ft.replace(R.id.container, fragment);
				ft.commit();
			}
		}
		else if(OpionsActivity.option.equalsIgnoreCase("Try it yourself"))
		{
			FragmentManager fm = NavigationActivity.this.getSupportFragmentManager();
    		FragmentTransaction ft = fm.beginTransaction();

			fragment = new ListFragment();
        	if(fragment!=null)
			{
        		header="Try it yourself";
				ft.replace(R.id.container, fragment);
				ft.commit();
			}
		}
   
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        //Toast.makeText(this, "Menu item selected -> " + position, Toast.LENGTH_SHORT).show();
    	FragmentManager fm = NavigationActivity.this.getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
	
		
		
        if(position==0)
        {
        	fragment = new ListFragment();
        	if(fragment!=null)
			{
        		header="Tutorial";
				ft.replace(R.id.container, fragment);
				ft.commit();
			}
        	
        }
        else if(position==1)
        {
        	fragment = new ListFragment();
        	if(fragment!=null)
			{
        		header="Try it yourself";
				ft.replace(R.id.container, fragment);
				ft.commit();
			}
        }
        else if(position==4)
        {
        	NavigationActivity.this.finish();
        }
        
        
        
        
    }

    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else{
        	// super.onBackPressed();
        	NavigationActivity.this.finish();
        }
           
    }
    
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	
    }
}
