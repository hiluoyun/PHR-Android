package cn.yang.phr.utils;

import android.content.Context;
import android.widget.Toast;

public class Utils {
	public static void showLongToast(Context context,String text){
		Toast.makeText(context, text, Toast.LENGTH_LONG).show();
	}
	
	public static void showShortToast(Context context,String text){
		Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
	}
}
