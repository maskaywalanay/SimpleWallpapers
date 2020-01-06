package id.limited.apps.wp;
import android.app.*;
import android.os.*;
import android.content.*;

public class AppSplash extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app_splash_screen);
		
		Thread mThread = new Thread(){
			
			public void run(){
				
				try{
					sleep(3000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					startActivity(new Intent(AppSplash.this,MainActivity.class));
					finish();
				}
			}
		};
		mThread.start();
	}
	
	
}
