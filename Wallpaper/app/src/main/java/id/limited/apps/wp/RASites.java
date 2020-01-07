package id.limited.apps.wp;
import android.app.*;
import android.os.*;
import android.webkit.*;

public class RASites extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ra_web);
		
		WebView mWebview = (WebView)findViewById(R.id.ra_sites);
		
	}
	
	
}
