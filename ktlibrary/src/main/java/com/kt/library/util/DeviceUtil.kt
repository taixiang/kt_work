package com.kt.library.util

import android.content.Context
import android.os.Build
import android.telephony.TelephonyManager

/**
 * @author tx
 * @date 2018/5/11
 */
object DeviceUtil {

    /**
     * 得到设备屏幕的宽度
     */
    fun getScreenWidths(context: Context):Int{
        return context.resources.displayMetrics.widthPixels
    }

    /**
     * 得到设备屏幕的高度
     */
    fun getScreenHeights(context: Context): Int {
        return context.resources.displayMetrics.heightPixels
    }

    /**
     * 得到设备的密度
     */
    fun getScreenDensity(context: Context): Float {
        return context.resources.displayMetrics.density
    }
    /**
     * 获取设备型号，如MX4
     */
    fun getBuildModel():String{
        return Build.MODEL
    }

    /**
     * 获取设备厂商，如魅族
     */
    fun getBuildBrand(): String {
        return Build.BRAND
    }

    /**
     * 获取版本
     */
    fun getBuildVersion(): String {
        return Build.VERSION.RELEASE
    }

    fun getDeviceId(context: Context):String{
        val tm:TelephonyManager =context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            return if (tm.getImei()!=null) tm.getImei() else tm.getMeid()
        }
        return tm.deviceId
    }

}