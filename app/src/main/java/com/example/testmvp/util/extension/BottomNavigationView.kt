package com.example.testmvp.util.extension

import android.annotation.SuppressLint
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.util.Log
import android.widget.TextView
import com.example.testmvp.R

@SuppressLint("RestrictedApi")
        /**
         * Created by Yasuhiro Suzuki on 2017/07/15.
         *
         * http://stackoverflow.com/questions/40176244/how-to-disable-bottomnavigationview-shift-mode
         */

fun BottomNavigationView.disableShiftMode() {
    val menuView = getChildAt(0) as BottomNavigationMenuView
    try {
//        menuView.javaClass.getDeclaredField("mShiftingMode").also { shiftMode ->
//            shiftMode.isAccessible = true
//            shiftMode.setBoolean(menuView, false)
//            shiftMode.isAccessible = false
//        }

//        val shiftingMode = menuView::class.java.getDeclaredField("mShiftingMode")
//        shiftingMode.isAccessible = true
//        shiftingMode.setBoolean(menuView, false)
//        shiftingMode.isAccessible = false

        for (i in 0 until menuView.childCount) {
            (menuView.getChildAt(i) as BottomNavigationItemView).also { item ->
                item.setShifting(false)
                item.setChecked(item.itemData.isChecked)

                val itemViews = menuView.getChildAt(i) as BottomNavigationItemView
                val activeLabel = itemViews.findViewById<TextView>(R.id.largeLabel);
                if (activeLabel is TextView) {
                    activeLabel.setPadding(0, 0, 0, 0);
                }
            }
        }
    } catch (e: NoSuchFieldException) {
        Log.e("BottomNavigationHelper", "Unable to get shift mode field", e)
    } catch (e: IllegalAccessException) {
        Log.e("BottomNavigationHelper", "Unable to change value of shift mode", e)
    }catch (ex:Exception){
        Log.e("BottomNavigationHelper", "Unable to change value of shift mode", ex)
    }
}

fun BottomNavigationView.active(position: Int) {
    menu.getItem(position).isChecked = true
}