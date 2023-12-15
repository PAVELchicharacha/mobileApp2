package com.example.mobileapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.Espresso
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    var mActivityRule: ActivityTestRule<Translate> =
        ActivityTestRule(Translate::class.java)
    @Test
    fun addClick() {
        Espresso.onView(withId(R.id.editText)).perform(typeText("15"))
        Espresso.onView(withId(R.id.radioButton16)).perform(click())
        Espresso.onView(withId(R.id.buttonConvert)).perform(click())
        Espresso.onView(withId(R.id.editResult)).check(matches(withText("f")))
    }
    fun addClick2(){
        Espresso.onView(withId(R.id.editText)).perform(typeText("17"))
        Espresso.onView(withId(R.id.radioButton8)).perform(click())
        Espresso.onView(withId(R.id.buttonConvert)).perform(click())
        Espresso.onView(withId(R.id.editResult)).check(matches(withText("21")))
    }
    fun addClick3(){
        Espresso.onView(withId(R.id.editText)).perform(typeText("9"))
        Espresso.onView(withId(R.id.radioButton10)).perform(click())
        Espresso.onView(withId(R.id.buttonConvert)).perform(click())
        Espresso.onView(withId(R.id.editResult)).check(matches(withText("9")))
    }
}