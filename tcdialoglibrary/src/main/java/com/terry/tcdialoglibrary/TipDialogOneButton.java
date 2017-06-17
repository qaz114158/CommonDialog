package com.terry.tcdialoglibrary;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by terry on 8/2/16.
 */

public class TipDialogOneButton extends CommonDialog {

    private TextView txt_title;
    private TextView txt_content;
    private Button btn_confirm;
    private OnConfirmListener mOnConfirmListener;

    public TipDialogOneButton(Context context) {
        super(context, R.style.CommonDialog);
        initDialogView();
    }

    public TipDialogOneButton(Context context, int themeResId) {
        super(context, themeResId);
        initDialogView();
    }

    protected TipDialogOneButton(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        initDialogView();
    }

    private void initDialogView() {
        setContentView(R.layout.dialog_tip_onebutton);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        txt_title = (TextView) findViewById(R.id.txt_title);
        txt_content = ((TextView) findViewById(R.id.txt_content));
        btn_confirm = ((Button) findViewById(R.id.btn_confirm));
        btn_confirm.setOnClickListener(this);
    }

    public static TipDialogOneButton newInstance(Context paramContext)
    {
        return new TipDialogOneButton(paramContext);
    }

    public void hideTitle()
    {
        this.txt_title.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        int i = v.getId();
        if (i == R.id.btn_confirm) {
            if (mOnConfirmListener != null) {
                mOnConfirmListener.onConfirm(this);
            }

        }
        dismiss();
    }

    public void setBtnText(String paramString)
    {
        this.btn_confirm.setText(paramString);
    }

    public void setContent(String paramString)
    {
        this.txt_content.setText(paramString);
    }

    public void setOnConfirmListener(OnConfirmListener paramOnConfirmListener)
    {
        this.mOnConfirmListener = paramOnConfirmListener;
    }

    public void setTitle(String paramString)
    {
        this.txt_title.setText(paramString);
    }

    public static abstract interface OnConfirmListener
    {
        public abstract void onConfirm(Dialog paramDialog);
    }

}
