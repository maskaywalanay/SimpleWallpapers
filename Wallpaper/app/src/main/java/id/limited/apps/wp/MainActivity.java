package id.limited.apps.wp;

import android.os.*;
import android.support.v7.app.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;


public class MainActivity extends AppCompatActivity 
{
	
	void create(){
		String s = "senin 6 januari 2020";
	}
	
	LinearLayout ln0, ln1, ln2, ln3, ln4, ln5, ln6, ln7, ln8;
	ImageView img1, img2, img3, img4, img5, img6;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Toast.makeText(getApplicationContext(),R.string.app_toast_a,Toast.LENGTH_SHORT).show();
		
		ln0 = (LinearLayout)findViewById(R.id.sc_facebook);
		ln0.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// sementara
					Intent intent = new Intent();
					intent.setClassName("com.facebook.catana","com.facebook.catana");
					startActivity(intent);
				}
		});
		
		// Facebook lite
		ln1 = (LinearLayout)findViewById(R.id.sc_facebook_lite);
		ln1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent(Intent.ACTION_VIEW);
					intent.setClassName("com.facebook.lite","com.facebook.lite.MainActivity");
					startActivity(intent);
				}
		});
		
		// Messenger launch
		ln2 = (LinearLayout)findViewById(R.id.sc_messenger);
		ln2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Toast.makeText(getApplicationContext(),"Please Install Messenger",Toast.LENGTH_SHORT).show();
				}
		});
		
		// Messenger lite launch
		ln3 = (LinearLayout)findViewById(R.id.sc_messenger_lite);
		ln3.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Toast.makeText(getApplicationContext(),"Please Install Messenger lite",Toast.LENGTH_SHORT).show();
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
		
		// Youtube
		ln5 = (LinearLayout)findViewById(R.id.sc_youtube_web);
		ln5.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent intent = new Intent();
					intent.setClassName("id.limited.apps.wp","id.sosmed.YoutubeSite");
					startActivity(intent);
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
			
	}

	@Override
	public void onBackPressed()
	{
		super.onBackPressed();
		finishAndRemoveTask();
	}
    
	
}
