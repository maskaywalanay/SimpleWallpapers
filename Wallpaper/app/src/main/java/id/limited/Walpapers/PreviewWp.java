package id.limited.Walpapers;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
import android.graphics.*;

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
					Intent intent = new Intent(Intent.ACTION_SET_WALLPAPER);
					wallpaper.setSaveEnabled(true);
					
					startActivity(intent);
				}
				
			
		});
	}
	
	
}
