package com.grsuuu.instagramble.util;

import android.util.Log;

import com.grsuuu.instagramble.Main;

public class MyLog {

	public static final boolean IS_DEBUG = true;

	public static int e(String msg) {
		return Log.e(Main.APP_NAME, msg);
	}

	public static int e(String msg, Throwable tr) {
		return Log.e(Main.APP_NAME, msg, tr);
	}

	public static int w(String msg) {
		return Log.w(Main.APP_NAME, msg);
	}

	public static int w(String msg, Throwable tr) {
		return Log.w(Main.APP_NAME, msg, tr);
	}

	public static int i(String msg) {
		return Log.i(Main.APP_NAME, msg);
	}

	public static int i(String msg, Throwable tr) {
		return Log.i(Main.APP_NAME, msg, tr);
	}

	public static int d(String msg) {
		if (IS_DEBUG) {
			return Log.d(Main.APP_NAME, msg);
		} else {
			return Log.DEBUG;
		}
	}

	public static int d(String msg, Throwable tr) {
		if (IS_DEBUG) {
			return Log.d(Main.APP_NAME, msg, tr);
		} else {
			return Log.DEBUG;
		}
	}

	public static int v(String msg) {
		if (IS_DEBUG) {
			return Log.v(Main.APP_NAME, msg);
		} else {
			return Log.VERBOSE;
		}
	}

	public static int v(String msg, Throwable tr) {
		if (IS_DEBUG) {
			return Log.v(Main.APP_NAME, msg, tr);
		} else {
			return Log.VERBOSE;
		}
	}

}
