package id.limited.apps.wp;
import android.view.*;
import android.content.*;
import android.util.*;
import android.animation.*;

public class GradientSplash extends View
{
	private static final int RED = 0xFFFF0000;
	private static final int GREEN = 0xFF00FF00;
	private static final int BLUE = 0xFF0000FF;
	private static final int TRANSPARENT = 0x00000000;
	
	public GradientSplash(Context c, AttributeSet attr){
		super(c, attr);
		
		View mView = (View)findViewById(R.id.gradient_splash);
		ObjectAnimator Views = ObjectAnimator.ofInt(mView,"backgroundColor",RED,GREEN,BLUE,TRANSPARENT);
		Views.setDuration(3000);
		Views.setEvaluator(new ArgbEvaluator());
		Views.setRepeatCount(ValueAnimator.INFINITE);
		Views.setRepeatMode(ValueAnimator.RESTART);
		Views.start();
		
	}
	
}
