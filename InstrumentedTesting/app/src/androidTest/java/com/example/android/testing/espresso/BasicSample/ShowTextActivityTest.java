package com.example.android.testing.espresso.BasicSample;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ShowTextActivityTest {

    @Rule
    public ActivityScenarioRule<ShowTextActivity> activityScenarioRule
            = new ActivityScenarioRule<>(ShowTextActivity.class);

    @Test
    public void validateTextView() {
        onView(withId(R.id.show_text_view)).check(matches(withText("")));
    }

}
