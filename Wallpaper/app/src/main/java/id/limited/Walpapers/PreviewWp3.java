package id.limited.Walpapers;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;

public class PreviewWp3 extends Activity
{

	Button bt4;
	ImageView iView4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.review_wp4);
		
		bt4 = (Button)findViewById(R.id.setwp_4);
		iView4 = (ImageView)findViewById(R.id.wp_4);
		
		bt4.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					WallpaperManager wm4 = WallpaperManager.getInstance(getApplicationContext());
					
					try
					{
						wm4.setResource(R.drawable.wp_4);
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
