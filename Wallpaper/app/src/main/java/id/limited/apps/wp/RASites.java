package id.limited.apps.wp;
import android.app.*;
import android.os.*;
import android.webkit.*;

public class RASites extends Activity
{

	WebView rasite;
	String url = "http://www.aidacell94.org/";
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ra_web);
		
		WebView mWebview = (WebView)findViewById(R.id.ra_sites);
		mWebview.setWebViewClient(new RaClient());
		mWebview.getSettings().setJavaScriptEnabled(true);
		mWebview.loadUrl(url);
		
		
	}
	
	private class RaClient extends WebViewClient
	{

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url)
		{
			view.loadUrl(url);
			return true;
		}
		
		
	}
}
