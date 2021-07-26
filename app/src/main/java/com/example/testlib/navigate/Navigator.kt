package com.example.testlib.navigate

import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentTransaction
import com.example.testlib.fragments.*
import ru.terrakok.cicerone.android.SupportAppNavigator
import ru.terrakok.cicerone.commands.Command
import javax.inject.Inject

class Navigator @Inject constructor(activity: FragmentActivity, containerId: Int): SupportAppNavigator(activity, containerId) {

    var currentFragment: Fragment? = null
    var backFragment: Fragment? = null

    private lateinit var screens: Screens

    override fun createActivityIntent(screenKey: String?, data: Any?): Intent {
        return Intent()
    }

    override fun setupFragmentTransactionAnimation(
        command: Command?,
        currentFragment: Fragment?,
        nextFragment: Fragment?,
        fragmentTransaction: FragmentTransaction?
    ) {

        this.backFragment = currentFragment
        this.currentFragment = nextFragment

        super.setupFragmentTransactionAnimation(
            command,
            currentFragment,
            nextFragment,
            fragmentTransaction
        )
    }

    override fun createFragment(screenKey: String?, data: Any?): Fragment {
        return when (screenKey) {
            screens.MAIN_SCREEN -> MainFragment()
            screens.ALL_TASKS_SCREEN -> AllTasksFragment()
            screens.CREATE_TASK_SCREEN -> CreateTaskFragment()
            screens.TASK_SCREEN -> TaskFragment()
            screens.STATS_SCREEN -> StatsFragment()
            else -> Fragment()
        }
    }
}