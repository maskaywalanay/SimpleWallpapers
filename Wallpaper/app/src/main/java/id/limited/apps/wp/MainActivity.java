package id.limited.apps.wp;

import android.os.*;
import android.support.v7.app.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends AppCompatActivity 
{
	
	void create(){
		String s = "senin 6 januari 2020";
	}
	
	LinearLayout ln0;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Toast.makeText(getApplicationContext(),R.string.app_toast_a,Toast.LENGTH_SHORT).show();
		
		ln0 = (LinearLayout)findViewById(R.id.sc_facebook);
		ln0.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
				}
				
			
		});
		
    }
}
