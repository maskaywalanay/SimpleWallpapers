package id.limited.apps.wp;

import android.os.*;
import android.support.v7.app.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity 
{
	
	void create(){
		String s = "senin 6 januari 2020";
	}
	
	// first commit
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Toast.makeText(getApplicationContext(),R.string.app_toast_a,Toast.LENGTH_SHORT).show();
		
		
		
    }
}
