package com.example.potter.challengerpotter5;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Potter on 27/03/2018.
 */

public class test3 {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mainActivity=null;

    @Before
    public void setUp() throws Exception {
        mainActivity = mainActivityActivityTestRule.getActivity();

    }

    @Test
    public void name() throws Exception {
        assertNotNull(mainActivity.findViewById(R.id.txt_mail));
        assertNotNull(mainActivity.findViewById(R.id.txt_pwd));
        assertNotNull(mainActivity.findViewById(R.id.btn_login));
        ////////////////////////////////////////////////////////////////////////////////////////////

        onView(withId(R.id.txt_mail)).perform(typeText("potter20@gmail.com")).toString();

        onView(withId(R.id.txt_pwd)).perform(typeText("12345"));

        onView(withId(R.id.btn_login)).perform(click());

        onView(withId(R.id.txt_mail)).perform(clearText());

        onView(withId(R.id.txt_pwd)).perform(clearText());
        ////////////////////////////////////////////////////////////////////////////////////////////

        pressBack();
    }



    @After
    public void tearDown() throws Exception {
        mainActivity=null;
    }
}
