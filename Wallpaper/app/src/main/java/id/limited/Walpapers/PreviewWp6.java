package id.limited.Walpapers;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;

public class PreviewWp6 extends Activity
{
	
	Button bt7;
	ImageView iv7;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.review_wp7);
		
		bt7 = (Button)findViewById(R.id.setwp_7);
		iv7 = (ImageView)findViewById(R.id.wp_7);
		
		bt7.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					WallpaperManager wm7 = WallpaperManager.getInstance(getApplicationContext());
					
					try
					{
						wm7.setResource(R.drawable.wp_7);
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
