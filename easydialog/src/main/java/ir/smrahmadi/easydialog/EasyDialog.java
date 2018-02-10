package ir.smrahmadi.easydialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by smrahmadi on 12/5/17.
 */

public class EasyDialog {


    public void oneItem(Context context , String title , String message , int icon , String item , final showClickOneItem callback ){

        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             callback.Item();
            }



        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        if (icon!=0)
            builder.setIcon(icon);

        if(title!=null)
            builder.setTitle(title);

        if(message!=null)
            builder.setMessage(message);

        builder.setNeutralButton(item, dialogClickListener);
        builder.show();

    }


    public void twoItem(Context context , String title , String message , int icon , String first_item , String second_item , final showClickTwoItem callback ){


        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        //Yes button clicked
                        callback.firstItem();
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //No button clicked
                        callback.secondItem();
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

     if (icon!=0)
        builder.setIcon(icon);

     if(title!=null)
        builder.setTitle(title);

     if(message!=null)
        builder.setMessage(message);

        builder.setPositiveButton(first_item, dialogClickListener);
        builder.setNegativeButton(second_item, dialogClickListener);
        builder.show();

    }



    public void threeItem(Context context , String title , String message , int icon , String first_item , String second_item, String three_item , final showClickThreeItem callback ){


        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        //Yes button clicked
                        callback.firstItem();
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //No button clicked
                        callback.secondItem();
                        break;

                    case DialogInterface.BUTTON_NEUTRAL:
                        //No button clicked
                        callback.thirdItem();
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        if (icon!=0)
            builder.setIcon(icon);

        if(title!=null)
            builder.setTitle(title);

        if(message!=null)
            builder.setMessage(message);

        builder.setPositiveButton(first_item, dialogClickListener);
        builder.setNegativeButton(second_item, dialogClickListener);
        builder.setNeutralButton(three_item, dialogClickListener);
        builder.show();
    }



    public interface showClickOneItem {
        void Item();
    }
    public interface showClickTwoItem {
        void firstItem();
        void secondItem();
    }
    public interface showClickThreeItem{
        void firstItem();
        void secondItem();
        void thirdItem();


    }
}
