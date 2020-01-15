package id.limited.Walpapers;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;

public class PreviewWp4 extends Activity
{

	Button bt5;
	ImageView iView5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.review_wp5);
		
		bt5 = (Button)findViewById(R.id.setwp_5);
		iView5 = (ImageView)findViewById(R.id.wp_5);
		bt5.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					WallpaperManager wm5 = WallpaperManager.getInstance(getApplicationContext());
					
					try
					{
						wm5.setResource(R.drawable.wp_5);
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
