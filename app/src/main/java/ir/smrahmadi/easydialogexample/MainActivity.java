package ir.smrahmadi.easydialogexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ir.smrahmadi.easydialog.EasyDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EasyDialog easyDialog = new EasyDialog();

    Button btn_one , Btn_two , btn_three ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_one = (Button) findViewById(R.id.one);
        Btn_two = (Button) findViewById(R.id.two);
        btn_three = (Button) findViewById(R.id.three);

        btn_one.setOnClickListener(this);
        Btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.one){
            easyDialog.oneItem(this,
                    "this is a Title"
                    , "This is a message",
                    R.mipmap.ic_launcher,
                    "ok",
                    new EasyDialog.showClickOneItem() {
                        @Override
                        public void Item() {
                            Toast.makeText(MainActivity.this, "click on Ok", Toast.LENGTH_SHORT).show();
                        }
                    });

        }else if (v.getId()==R.id.two){
            easyDialog.twoItem(this,
                    "This is a Title",
                    "This is a message",
                    R.mipmap.ic_launcher,
                    "yes",
                    "no",
                    new EasyDialog.showClickTwoItem() {
                        @Override
                        public void firstItem() {
                            Toast.makeText(MainActivity.this, "click on yes", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void secondItem() {
                            Toast.makeText(MainActivity.this, "click on no", Toast.LENGTH_SHORT).show();

                        }
                    });

        }else if (v.getId()==R.id.three){
            easyDialog.threeItem(this,
                    "This is a Title",
                    "This is a message",
                    R.mipmap.ic_launcher,
                    "yes",
                    "no",
                    "cancel",
                    new EasyDialog.showClickThreeItem() {
                        @Override
                        public void firstItem() {
                            Toast.makeText(MainActivity.this, "click on yes", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void secondItem() {
                            Toast.makeText(MainActivity.this, "click on no", Toast.LENGTH_SHORT).show();

                        }

                        @Override
                        public void thirdItem() {

                            Toast.makeText(MainActivity.this, "click on cancel", Toast.LENGTH_SHORT).show();

                        }
                    });

        }
    }
}
