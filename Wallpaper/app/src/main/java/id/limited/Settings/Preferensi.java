package id.limited.Settings;
import android.preference.*;
import android.os.*;
import id.limited.apps.wp.*;

public class Preferensi extends PreferenceActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference_settings);
	}
}
