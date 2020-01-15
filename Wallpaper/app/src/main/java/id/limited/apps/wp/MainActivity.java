package id.limited.apps.wp;

import android.os.*;
import android.support.v7.app.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity 
{
	
	void create(){
		String s = "senin 6 januari 2020";
	}
	
	LinearLayout ln0, ln2, ln4, ln6, ln7, ln8;
	ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Toolbar mToolbar = (Toolbar)findViewById(R.id.ra_toolbar);
		getSupportActionBar();
		
		Toast.makeText(getApplicationContext(),R.string.app_toast_a,Toast.LENGTH_SHORT).show();
		
		// Fix launch facebook
		ln0 = (LinearLayout)findViewById(R.id.sc_facebook);
		ln0.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					
					Intent intent = new Intent();
					intent.setClassName("com.facebook.katana","com.facebook.katana.activity.FbMainTabActivity");
					startActivity(intent);
				}
		});
		
		// Messenger launch
		ln2 = (LinearLayout)findViewById(R.id.sc_messenger);
		ln2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("com.facebook.orca","com.facebook.orca.auth.StartScreenActivity");
					startActivity(intent);
					Toast.makeText(getApplicationContext(),R.string.drawer_messenger_toast,Toast.LENGTH_SHORT).show();
				}
		});
		
		// My sites
		ln4 = (LinearLayout)findViewById(R.id.sc_youtube);
		ln4.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// sementara 
					Toast.makeText(getApplicationContext(),"Please Install Youtube",Toast.LENGTH_SHORT).show();
				}
		});
		
		
		// launch web free facebook
		ln6 = (LinearLayout)findViewById(R.id.sc_facebook_free);
		ln6.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("id.limited.apps.wp","id.sosmed.FreeFacebookSite");
					startActivity(intent);
				}
		});
		
		// Pengaturan Aplikasi
		ln7 = (LinearLayout)findViewById(R.id.drawer_preference);
		ln7.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("id.limited.apps.wp","id.limited.Settings.Preferensi");
					startActivity(intent);
				}
		});
		
		// Exit Drawer
		ln8 = (LinearLayout)findViewById(R.id.drawer_exit);
		ln8.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Toast.makeText(getApplicationContext(),R.string.app_toast_b,Toast.LENGTH_SHORT).show();
					finishAndRemoveTask();
				}
		});
		
		// launch preview wallpaper 1
		img1 = (ImageView)findViewById(R.id.wp_1);
		img1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent inten = new Intent();
					inten.setClassName("id.limited.apps.wp","id.limited.Walpapers.PreviewWp");
					startActivity(inten);
				}
		});
		
		// launch preview wallpaper 2
		img2 = (ImageView)findViewById(R.id.wp_2);
		img2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("id.limited.apps.wp","id.limited.Walpapers.PreviewWp1");
					startActivity(intent);
				}
		});
		
		// launch preview wallpaper 3
		img3 = (ImageView)findViewById(R.id.wp_3);
		img3.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("id.limited.apps.wp","id.limited.Walpapers.PreviewWp2");
					startActivity(intent);
				}
			});
			
			// Launch preview wallpaper 4
			img4 = (ImageView)findViewById(R.id.wp_4);
			img4.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("id.limited.apps.wp","id.limited.Walpapers.PreviewWp3");
					startActivity(intent);
				}
			});
			
			// Launch preview wallpaper 5
			img5 = (ImageView)findViewById(R.id.wp_5);
			img5.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("id.limited.apps.wp","id.limited.Walpapers.PreviewWp4");
					startActivity(intent);
				}
			});
			
			// Launch preview wallpaper 6
			img6 = (ImageView)findViewById(R.id.wp_6);
		img6.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("id.limited.apps.wp","id.limited.Walpapers.PreviewWp5");
					startActivity(intent);
				}
			});
			
			// Launch preview wallpaper 7
			img7 = (ImageView)findViewById(R.id.wp_7);
			img7.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("id.limited.apps.wp","id.limited.Walpapers.PreviewWp6");
					startActivity(intent);
				}
			});
			
			// Launch preview wallpaper 8
			img8 = (ImageView)findViewById(R.id.wp_8);
			img8.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("id.limited.apps.wp","id.limited.Walpapers.PreviewWp7");
					startActivity(intent);
				}
			});
			
			// Launch preview wallpaper 9
			img9 = (ImageView)findViewById(R.id.wp_9);
			img9.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("id.limited.apps.wp","id.limited.Walpapers.PreviewWp8");
					startActivity(intent);
				}
			});
			
	}

	@Override
	public void onBackPressed()
	{
		super.onBackPressed();
		finishAndRemoveTask();
	}
    
	
}
