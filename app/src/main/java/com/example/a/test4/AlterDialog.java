package com.example.a.test4;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;

import java.lang.reflect.Field;

public class AlterDialog extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog dialog = new AlertDialog.Builder(this).create();//创建对话框
        View view=View.inflate(AlterDialog.this,R.layout.alertdialog111,null);

        dialog.setInverseBackgroundForced(true);
        dialog.setView(view);
        //分别设置三个button
        dialog.setButton(DialogInterface.BUTTON_POSITIVE,"cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();//关闭对话框
            }
        });
        dialog.setButton(DialogInterface.BUTTON_NEUTRAL,"Sign in", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { }
        });

        dialog.show();//显示对话
    }

}
