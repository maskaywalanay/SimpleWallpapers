package id.sosmed;
import android.app.*;
import android.os.*;
import id.limited.apps.wp.*;
import android.webkit.*;

public class YoutubeSite extends Activity
{

	String url = "http://www.youtube.com/";
	WebView ytweb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.youtube_web);
		
		ytweb = (WebView)findViewById(R.id.yt_web);
		ytweb.setWebViewClient(new YtWeb());
		ytweb.getSettings().setJavaScriptEnabled(true);
		ytweb.loadUrl(url);
		
	}
	
	private class YtWeb extends WebViewClient
	{

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url)
		{
			view.loadUrl(url);
			return true;
		}
		
		
	}
}
