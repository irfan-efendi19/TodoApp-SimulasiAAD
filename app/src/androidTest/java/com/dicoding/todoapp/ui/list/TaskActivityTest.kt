package com.dicoding.todoapp.ui.list

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.todoapp.R
import com.dicoding.todoapp.ui.add.AddTaskActivity
import org.junit.Before
import org.junit.Rule
import org.junit.Test

//TODO 16 : Write UI test to validate when user tap Add Task (+), the AddTaskActivity displayed
class TaskActivityTest {
    @get:Rule
    var activityRule = ActivityScenarioRule(TaskActivity::class.java)

    @Rule
    @JvmField
    val taskActivityRule = IntentsTestRule(TaskActivity::class.java)

    @Before
    fun setUp(){
        ActivityScenario.launch(TaskActivity::class.java)
    }

    @Test
    fun clickAddButton(){
        Espresso.onView(ViewMatchers.withId(R.id.fab)).perform(ViewActions.click())
        Intents.intended(IntentMatchers.hasComponent(AddTaskActivity::class.java.name))
    }
}