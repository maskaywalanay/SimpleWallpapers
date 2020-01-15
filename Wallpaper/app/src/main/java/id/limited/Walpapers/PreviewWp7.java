package id.limited.Walpapers;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;

public class PreviewWp7 extends Activity
{

	Button bt8;
	ImageView iv8;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.review_wp8);
		
		bt8 = (Button)findViewById(R.id.setwp_8);
		iv8 = (ImageView)findViewById(R.id.wp_8);
		
		bt8.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					WallpaperManager wm8 = WallpaperManager.getInstance(getApplicationContext());
					try
					{
						wm8.setResource(R.drawable.wp_8);
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
