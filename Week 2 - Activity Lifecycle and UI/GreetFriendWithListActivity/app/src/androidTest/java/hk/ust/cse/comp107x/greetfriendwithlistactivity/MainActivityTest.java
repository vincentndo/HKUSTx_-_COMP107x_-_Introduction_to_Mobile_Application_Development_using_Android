package hk.ust.cse.comp107x.greetfriendwithlistactivity;

import android.test.ActivityInstrumentationTestCase2;
import org.junit.Before;

import hk.ust.cse.comp107x.greetfriendwithlistactivity.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by muppala on 7/6/16.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }


    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(getInstrumentation());
        mainActivity = getActivity();
    }

    public void testChangeText() {
        // Type text and then press the button.
        onView(withId(R.id.editFriendName))
                .perform(typeText("John"), closeSoftKeyboard());
        onView(withId(R.id.greetButton)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.textMessage)).check(matches(withText("Good Day John!")));
    }

}