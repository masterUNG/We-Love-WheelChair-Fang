package appewtc.masterung.welovewheelchair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CommentWheelChair extends AppCompatActivity {

    //Explicit
    private String[] chooseStrings, dataStrings;
    private int chooseAnInt, imageAnInt;
    private String contentString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_wheel_chair);

        //Receive Value from Intent
        chooseStrings = getIntent().getStringArrayExtra("Choose");

        //Setup Value to Integer
        chooseAnInt = findChoose();

        //Show View
        ShowView();


    }   // Main Method

    private void ShowView() {




    }   // ShowView

    private int findChoose() {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<chooseStrings.length;i++) {
            stringBuilder.append(chooseStrings[i]);
        }   // for

        return Integer.parseInt(stringBuilder.toString());
    }


}   // Main Class
