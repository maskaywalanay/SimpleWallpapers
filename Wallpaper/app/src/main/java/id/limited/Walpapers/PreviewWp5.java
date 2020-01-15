package id.limited.Walpapers;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;

public class PreviewWp5 extends Activity
{

	ImageView iv6;
	Button bt6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.review_wp6);
		
		bt6 = (Button)findViewById(R.id.setwp_6);
		iv6 = (ImageView)findViewById(R.id.wp_6);
		bt6.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					WallpaperManager wm6 = WallpaperManager.getInstance(getApplicationContext());
					
					try
					{
						wm6.setResource(R.drawable.wp_6);
						Toast.makeText(getApplicationContext(),R.string.ic_toast_wallpaper,Toast.LENGTH_SHORT).show();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
			
		});
		
	}
	
	
}
