package id.limited.Walpapers;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.io.*;

public class PreviewWp1 extends Activity
{

	ImageView iView;
	Button mButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.review_wp2);
		
		iView = (ImageView)findViewById(R.id.wp_2);
		mButton = (Button)findViewById(R.id.setwp_2);
		mButton.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					
					WallpaperManager mWall = WallpaperManager.getInstance(getApplicationContext());
					
					try
					{
						mWall.setResource(R.drawable.wp_2);
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
