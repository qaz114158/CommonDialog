package com.terry.mom;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.terry.tcdialoglibrary.TCDialogUtils;
import com.terry.tcdialoglibrary.TipDialog;
import com.terry.tcdialoglibrary.TipDialogOneButton;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    private Context mContext;

    public MainActivity() {
        mContext = MainActivity.this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        Button bt_button1 = (Button) findViewById(R.id.bt_button1);
        bt_button1.setOnClickListener(this);
        Button bt_button2 = (Button) findViewById(R.id.bt_button2);
        bt_button2.setOnClickListener(this);
        Button bt_button3 = (Button) findViewById(R.id.bt_button3);
        bt_button3.setOnClickListener(this);
        Button bt_button4 = (Button) findViewById(R.id.bt_button4);
        bt_button4.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_button1:
                TCDialogUtils.showTipDialog(mContext, "Notice", "This dialog has title content and two button", "cancel", "confirm", new TipDialog.OnDialogBtnClickListener() {
                    @Override
                    public void onLeftBtnClicked(TipDialog paramTipDialog) {

                    }

                    @Override
                    public void onRightBtnClicked(TipDialog paramTipDialog) {

                    }
                });
                break;
            case R.id.bt_button2:
                TCDialogUtils.showTipDialogNoTitle(mContext, "This dialog has content and two button but no title", "cancel", "confirm", new TipDialog.OnDialogBtnClickListener() {
                    @Override
                    public void onLeftBtnClicked(TipDialog paramTipDialog) {

                    }

                    @Override
                    public void onRightBtnClicked(TipDialog paramTipDialog) {

                    }
                });
                break;
            case R.id.bt_button3:
                TCDialogUtils.showTipDialogOneButton(mContext, "title", "This dialog has one button title and content", "confirm", new TipDialogOneButton.OnConfirmListener() {
                    @Override
                    public void onConfirm(Dialog paramDialog) {

                    }
                });
                break;
            case R.id.bt_button4:
                TCDialogUtils.showTipDialogOneButtonNoTitle(mContext, "This dialog has one button content but no title", "confirm", new TipDialogOneButton.OnConfirmListener() {
                    @Override
                    public void onConfirm(Dialog paramDialog) {

                    }
                });
                break;
        }
    }
}
