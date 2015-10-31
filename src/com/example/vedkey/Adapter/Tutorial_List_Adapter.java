package com.example.vedkey.Adapter;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.vedkey.R;
import com.example.vedkey.Bean.MultiplicationBean;

public class Tutorial_List_Adapter extends BaseAdapter  {
	private Context context;
	public  ArrayList<MultiplicationBean> _itemList = new ArrayList<MultiplicationBean>();
	
	
	Typeface trajan_pro_regular;


	public Tutorial_List_Adapter(Context context,ArrayList<MultiplicationBean> multplicationlist ) {
		//super();

		this.context = context;
		this._itemList=multplicationlist;
		
	}



	public int getCount() {
		// TODO Auto-generated method stub
		return _itemList != null ? _itemList.size(): 0;
	}
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return _itemList.get(position) ;
	}
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public class ViewHolder
	{
		
		public TextView options;
		


	}

	public View getView(int position, View convertView, ViewGroup parent) {
	
	/*	Typeface times_newroman = Typeface.createFromAsset(context.getAssets(),
				"Fonts/Times New Roman.ttf");
		*/
		
		//trajan_pro_regular = Typeface.createFromAsset(context.getAssets(),"Fonts/TrajanPro-Regular.ttf");

		final ViewHolder view_holder;
		if (convertView == null) {
			
			view_holder = new ViewHolder();
			LayoutInflater _linflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
			convertView = _linflater.inflate(R.layout.tutoriallistrow, null);
			view_holder.options=(TextView)convertView.findViewById(R.id.rowtxt);

			
			convertView.setTag(view_holder);

		} else {
			view_holder = (ViewHolder) convertView.getTag();
		}

		final MultiplicationBean bean=(MultiplicationBean)_itemList.get(position);
	
		view_holder.options.setText(bean.getName());
	

	
		
		
		
		/*view_holder.options.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, College_discount_detail.class);
				intent.putExtra("Image", bean.getImage());
				intent.putExtra("Title", bean.getTitle());
				intent.putExtra("Description", bean.getDescription());
				intent.putExtra("coupon_code", bean.getCoupon_code());
				context.startActivity(intent);
				
			}
		});*/
		
		
	

		return convertView;
	}
	

}