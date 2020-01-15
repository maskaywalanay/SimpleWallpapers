package id.limited.Walpapers;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
import android.graphics.*;
import java.io.*;

public class PreviewWp extends Activity
{

	Button b;
	ImageView wallpaper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.review_wp1);
		
		wallpaper = (ImageView)findViewById(R.id.wallpaper_1);
		
		
		b = (Button)findViewById(R.id.setwp_1);
		b.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
					
					try{
						wallpaperManager.setResource(R.drawable.wp_1);
						Toast.makeText(getApplicationContext(),R.string.ic_toast_wallpaper,Toast.LENGTH_SHORT).show();
					}catch(IOException e){
						e.printStackTrace();
					}
					
				}
				
			
		});
	}
	
	
}
