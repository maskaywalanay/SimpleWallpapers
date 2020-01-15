package id.limited.Walpapers;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;

public class PreviewWp8 extends Activity
{

	Button bt9;
	ImageView iv9;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.review_wp9);
		
		bt9 = (Button)findViewById(R.id.setwp_9);
		iv9 = (ImageView)findViewById(R.id.wp_9);
		
		bt9.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					WallpaperManager wm9 = WallpaperManager.getInstance(getApplicationContext());
					try
					{
						wm9.setResource(R.drawable.wp_9);
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
