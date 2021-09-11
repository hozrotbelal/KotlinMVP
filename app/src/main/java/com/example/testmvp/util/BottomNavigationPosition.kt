package com.example.testmvp.util

import com.example.testmvp.R
import androidx.fragment.app.Fragment
import com.example.testmvp.ui.more.view.MoreFragment

enum class BottomNavigationPosition(val position: Int, val id: Int) {
    POSTTASK(0, R.id.nav_bar_post_task),
    MYTASK(1, R.id.nav_bar_my_task),
    BROWSETASK(2, R.id.nav_bar_browse_tasks),
    MESSAGE(3, R.id.nav_bar_messages),
    MORE(4, R.id.nav_bar_more);
}

fun findNavigationPositionById(id: Int): BottomNavigationPosition = when (id) {
    BottomNavigationPosition.POSTTASK.id -> BottomNavigationPosition.POSTTASK
    BottomNavigationPosition.MYTASK.id -> BottomNavigationPosition.MYTASK
    BottomNavigationPosition.BROWSETASK.id -> BottomNavigationPosition.BROWSETASK
    BottomNavigationPosition.MESSAGE.id -> BottomNavigationPosition.MESSAGE
    BottomNavigationPosition.MORE.id -> BottomNavigationPosition.MORE
    else -> BottomNavigationPosition.POSTTASK
}

fun BottomNavigationPosition.createFragment(): Fragment = when (this) {
    BottomNavigationPosition.POSTTASK -> MoreFragment.newInstance()
    BottomNavigationPosition.MYTASK -> MoreFragment.newInstance()
    BottomNavigationPosition.BROWSETASK -> MoreFragment.newInstance()
    BottomNavigationPosition.MESSAGE -> MoreFragment.newInstance()
    BottomNavigationPosition.MORE -> MoreFragment.newInstance()
}

fun BottomNavigationPosition.getTag(): String = when (this) {
    BottomNavigationPosition.POSTTASK -> MoreFragment.TAG
    BottomNavigationPosition.MYTASK -> MoreFragment.TAG
    BottomNavigationPosition.BROWSETASK -> MoreFragment.TAG
    BottomNavigationPosition.MESSAGE -> MoreFragment.TAG
    BottomNavigationPosition.MORE -> MoreFragment.TAG
}

