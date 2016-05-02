package appewtc.masterung.welovewheelchair;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class CategoryListView extends AppCompatActivity {

    //Explicit
    private TextView textView;
    private ListView listView;
    private String catString;
    private String urlJSON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list_view);

        //Bind Widget
        textView = (TextView) findViewById(R.id.textView36);
        listView = (ListView) findViewById(R.id.listView2);

        //Show View
        catString = getIntent().getStringExtra("Category");
        textView.setText(catString);

        //Choose URL JSON
        urlJSON = chooseURLjson(catString);
        Log.d("2MayV2", "URL ==> " + urlJSON);


    }   // Main Method

    private String chooseURLjson(String catString) {

        String[] jsonStrings = new String[5];
        jsonStrings[0] = "http://swiftcodingthai.com/nuk/php_get_cat1.php";
        jsonStrings[1] = "http://swiftcodingthai.com/nuk/php_get_cat2.php";
        jsonStrings[2] = "http://swiftcodingthai.com/nuk/php_get_cat3.php";
        jsonStrings[3] = "http://swiftcodingthai.com/nuk/php_get_cat4.php";
        jsonStrings[4] = "http://swiftcodingthai.com/nuk/php_get_cat5.php";

        String urlJSON = null;
        if (catString.equals("ภาคกลาง")) {
            urlJSON = jsonStrings[0];
        } else if (catString.equals("ภาคตะวันออก")) {
            urlJSON = jsonStrings[1];
        } else if (catString.equals("ภาคตะวันออกเฉียงเหนือ")) {
            urlJSON = jsonStrings[2];
        } else if (catString.equals("ภาคใต้")) {
            urlJSON = jsonStrings[3];
        } else {
            urlJSON = jsonStrings[4];
        }


        return urlJSON;
    }

    public void clickBackCatListView(View view) {
        finish();
    }

}   // Main Class
