package appewtc.masterung.welovewheelchair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CommentWheelChair extends AppCompatActivity {

    //ประกาศตัวแปร
    private String[] chooseString, dataStrings;
    private int chooseATnt, imageAnInt;
    private String contentString;
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_wheel_chair);

        //Bind Widget
        imageView = (ImageView) findViewById(R.id.imageView20);
        textView = (TextView) findViewById(R.id.txtDetail);

        //รับค่า from intent
        chooseString = getIntent().getStringArrayExtra("Choose");
        // setup value
        chooseATnt = findChoose();

        //showView();
        ShowView();
    } //หลัก

    private void ShowView() {
        dataStrings = getResources().getStringArray(R.array.my_content);

        switch (chooseATnt) {


            case 11111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 11112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 11113:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 11114:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 11121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 11122:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 11123:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 11124:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            //
            case 11231:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 11232:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 1123:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 11234:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            //
            case 11241:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 11242:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 11243:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 11244:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;

            // 1.2
            case 12111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12113:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 12114:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[3];
                break;
            //
            case 12121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12122:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12123:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 12124:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            //
            case 12231:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12232:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12233:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 12234:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[3];
                break;
            //
            case 12341:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12342:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12343:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 12344:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            //
            case 13111:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 13112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 13113:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13114:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            //
            case 13121:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 13122:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13123:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13124:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            //
            case 13231:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 13232:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13233:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13234:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            //
            case 13241:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 13242:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13243:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13244:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;

            // group 2
            case 21111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 21112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 21113:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21114:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 21121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 21122:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21123:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21124:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 21231:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 21232:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21233:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21234:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 21241:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 21242:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21243:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21244:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //  2.1
            case 22111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;

            case 22112:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 22113:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 22114:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 22121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22122:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22123:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 22124:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 22231:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22232:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22233:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22234:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            //
            case 22241:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22242:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22243:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22244:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            //
            case 23111:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23112:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23113:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 23114:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            //
            case 23221:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23222:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23223:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 23224:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;

            //
            case 23231:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23232:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 23233:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 23234:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            //
            case 23241:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23242:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23243:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23244:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            // group 3
            case 31111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31113:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 31114:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 31121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31122:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
            case 31123:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
            case 31124:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                //
            case 31231:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31232:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
            case 31233:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
            case 31234:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                //
            case 31241:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31242:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31243:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31244:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            // 3.2
            case 32111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32113:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 32114:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 32121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32122:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
            case 32123:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
            case 32124:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                //
            case 32231:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32232:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32233:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32234:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            //
            case 32241:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32242:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32243:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32244:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            //
            case 33111:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 33112:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 33113:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33114:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            //
            case 33121:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 33122:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33123:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33124:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            //
            case 33231:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 33232:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33233:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33234:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            //
            case 33241:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 33242:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33243:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33244:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            default:

                imageAnInt = R.drawable.wh3;
                contentString = "ไม่มีข้อมูล";
                break;


        }   // Switch

        imageView.setImageResource(imageAnInt);
        textView.setText(contentString);

    }   // Show View

    private int findChoose() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chooseString.length; i++) {
            stringBuilder.append(chooseString[i]);
        }


        return Integer.parseInt(stringBuilder.toString());
    }

} //ย่อย