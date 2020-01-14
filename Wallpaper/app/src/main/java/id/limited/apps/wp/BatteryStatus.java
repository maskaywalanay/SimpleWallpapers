package id.limited.apps.wp;
import android.widget.*;
import android.content.*;
import android.util.*;
import id.limited.apps.wp.R;


public class BatteryStatus extends ImageView
{
	public BatteryStatus(Context c, AttributeSet attr){
		
		super(c, attr);
		c.registerReceiver(new BroadcastReceiver(){
			
			@Override
			public void onReceive(Context c, Intent intent){
				
				boolean isCharging = false;
				int level = intent.getIntExtra("level",0);
				BatteryStatus.this.setImageLevel(level);
				int status = intent.getIntExtra("status",0);
				
				if(status == 2 || status == 5){
					isCharging = true;
				}
				
				if(isCharging){
					
					BatteryStatus.this.setImageLevel(level);
					BatteryStatus.this.setImageResource(setSumber("stat_sys_battery_charge","drawable"));
					return;
					
					
				}
				
				BatteryStatus.this.setImageResource(setSumber("stat_sys_battery_normal","drawable"));
			}

			private int setSumber(String p0, String p1)
			{
				
				return getContext().
				getResources().
				getIdentifier(p0, p1, getContext().
				getPackageName());
			}
			
		},new IntentFilter("android.intent.action.BATTERY_CHANGED"));
	}
}
