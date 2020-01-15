package id.limited.Walpapers;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;

public class PreviewWp2 extends Activity
{

	Button bt3;
	ImageView iView3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.review_wp3);
		
		bt3 = (Button)findViewById(R.id.setwp_3);
		iView3 = (ImageView)findViewById(R.id.wp_3);
		bt3.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					WallpaperManager wm3 = WallpaperManager.getInstance(getApplicationContext());
					
					try
					{
						wm3.setResource(R.drawable.wp_3);
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
