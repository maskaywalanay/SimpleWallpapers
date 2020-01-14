package id.sosmed;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.webkit.*;

public class FreeFacebookSite extends Activity
{

	WebView wff;
	String url = "http://free.facebook.com/";
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.free_facebook);
		
		wff = (WebView)findViewById(R.id.free_facebook);
		wff.setWebViewClient(new MyWebViewClient());
		wff.getSettings().setJavaScriptEnabled(true);
		wff.loadUrl(url);
		
		
	}
	
	private class MyWebViewClient extends WebViewClient
	{

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url)
		{
			view.loadUrl(url);
			return true;
			
		}
		
		
	}
}
