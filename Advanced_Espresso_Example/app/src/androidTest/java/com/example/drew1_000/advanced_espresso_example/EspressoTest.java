package com.example.drew1_000.advanced_espresso_example;

import android.app.Application;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;

import org.junit.Test;
import org.junit.Rule;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
public class EspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void changeText() {

        //Check that original text is displayed
        onView(withId(R.id.top_text)).check(matches(withText("Hello World!")));

        //Send text to our edit text
        onView(withContentDescription("text_field")).perform(typeText("Whoa Espresso is easy!"));

        //Click on change button
        onView(withText("Change")).perform(click());

        //Check that new text is displayed
        onView(withId(R.id.top_text)).check(matches(withText("Whoa Espresso is easy!")));
    }
}