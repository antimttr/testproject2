package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mwest.testproject.MainActivity;
import com.example.mwest.testproject.R;

import java.nio.charset.MalformedInputException;

/**asdfasdf
 * Created by mwest on 4/13/2016.
 */
public class Junit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public Junit_test() {
        super(MainActivity.class);

    }

    public void test_first() {
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.textView);
        String tester = textView.getText().toString();

        assertEquals("Text Field 2", tester);
    }

    public void test_add() {
        mainActivity = getActivity();
        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                EditText op1 = (EditText) mainActivity.findViewById(R.id.op1);
                EditText op2 = (EditText) mainActivity.findViewById(R.id.op2);
                Button button = (Button) mainActivity.findViewById(R.id.Addbutton);
                TextView textView = (TextView) mainActivity.findViewById(R.id.textView2);
                final String test;

                op1.setText("1", TextView.BufferType.EDITABLE);
                op2.setText("10", TextView.BufferType.EDITABLE);
                button.performClick();
                test = textView.getText().toString();

                assertEquals("11", test);
            }
        });



    }

}
