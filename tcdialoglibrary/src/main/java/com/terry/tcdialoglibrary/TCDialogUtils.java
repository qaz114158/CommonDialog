package com.terry.tcdialoglibrary;

import android.content.Context;

/**
 * This class can show custom dialog for app
 * Support title content button with custom text
 * Created by terry on 8/2/16.
 */

public class TCDialogUtils {

    /**
     * This dialog has title content and two button
     * @param context
     * @param title
     * @param content
     * @param leftBtnText
     * @param rightBtnText
     * @param onDialogBtnClickListener
     */
    public static void showTipDialog(Context context, String title, String content, String leftBtnText, String rightBtnText, TipDialog.OnDialogBtnClickListener onDialogBtnClickListener) {
        if (context == null) {
            return;
        }
        TipDialog tipDialog = new TipDialog(context);
        tipDialog.setTitle(title);
        tipDialog.setContent(content);
        tipDialog.setLeftBtnText(leftBtnText);
        tipDialog.setRightBtnText(rightBtnText);
        tipDialog.setOnBtnClickListener(onDialogBtnClickListener);
        try{
            tipDialog.show();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This dialog has content and two button but no title
     * @param context
     * @param content
     * @param leftBtnText
     * @param rightBtnText
     * @param onDialogBtnClickListener
     */
    public static void showTipDialogNoTitle(Context context, String content, String leftBtnText, String rightBtnText, TipDialog.OnDialogBtnClickListener onDialogBtnClickListener) {
        if (context == null) {
            return;
        }
        TipDialog tipDialog = new TipDialog(context);
        tipDialog.hideTitle();
        tipDialog.setContent(content);
        tipDialog.setLeftBtnText(leftBtnText);
        tipDialog.setRightBtnText(rightBtnText);
        tipDialog.setOnBtnClickListener(onDialogBtnClickListener);
        try{
            tipDialog.show();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This dialog is support for update
     * @param context
     * @param title
     * @param content
     * @param leftBtnText
     * @param rightBtnText
     * @param onDialogBtnClickListener
     */
    public static void showUpdateDialog(Context context, String title, String content, String leftBtnText, String rightBtnText, TipDialog.OnDialogBtnClickListener onDialogBtnClickListener) {
        if (context == null) {
            return;
        }
        TipDialog tipDialog = new TipDialog(context);
        tipDialog.setTitle(title);
        tipDialog.setContent(content);
        tipDialog.setLeftBtnText(leftBtnText);
        tipDialog.setRightBtnText(rightBtnText);
        tipDialog.setOnBtnClickListener(onDialogBtnClickListener);
        tipDialog.setCancelable(false);
        try{
            tipDialog.show();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This dialog has one button title and content
     * @param context
     * @param title
     * @param content
     * @param leftBtnText
     * @param onConfirmListener
     */
    public static void showTipDialogOneButton(Context context, String title, String content, String leftBtnText, TipDialogOneButton.OnConfirmListener onConfirmListener) {
        if (context == null) {
            return;
        }
        TipDialogOneButton tipDialogOneButton = new TipDialogOneButton(context);
        tipDialogOneButton.setTitle(title);
        tipDialogOneButton.setContent(content);
        tipDialogOneButton.setBtnText(leftBtnText);
        tipDialogOneButton.setOnConfirmListener(onConfirmListener);
        try {
            tipDialogOneButton.show();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This dialog has one button content but no title
     * @param context
     * @param content
     * @param leftBtnText
     * @param onConfirmListener
     */
    public static void showTipDialogOneButtonNoTitle(Context context, String content, String leftBtnText, TipDialogOneButton.OnConfirmListener onConfirmListener) {
        if (context == null) {
            return;
        }
        TipDialogOneButton tipDialogOneButton = new TipDialogOneButton(context);
        tipDialogOneButton.hideTitle();
        tipDialogOneButton.setContent(content);
        tipDialogOneButton.setBtnText(leftBtnText);
        tipDialogOneButton.setOnConfirmListener(onConfirmListener);
        try {
            tipDialogOneButton.show();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * This dialog has one button content but no title
     * 点击其他地方不能关闭
     * @param context
     * @param content
     * @param leftBtnText
     * @param onConfirmListener
     */
    public static void showTipDialogOneButtonNoTitleNoCancelable(Context context, String content, String leftBtnText, TipDialogOneButton.OnConfirmListener onConfirmListener) {
        if (context == null) {
            return;
        }
        TipDialogOneButton tipDialogOneButton = new TipDialogOneButton(context);
        tipDialogOneButton.hideTitle();
        tipDialogOneButton.setContent(content);
        tipDialogOneButton.setBtnText(leftBtnText);
        tipDialogOneButton.setCancelable(false);// 点击其他地方不能关闭
        tipDialogOneButton.setOnConfirmListener(onConfirmListener);
        try {
            tipDialogOneButton.show();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This dialog has one button title and content
     * @param context
     * @param title
     * @param content
     * @param leftBtnText
     * @param onConfirmListener
     */
    public static void showTipDialogOneButtonNoCancelable(Context context, String title, String content, String leftBtnText, TipDialogOneButton.OnConfirmListener onConfirmListener) {
        if (context == null) {
            return;
        }
        TipDialogOneButton tipDialogOneButton = new TipDialogOneButton(context);
        tipDialogOneButton.setTitle(title);
        tipDialogOneButton.setContent(content);
        tipDialogOneButton.setBtnText(leftBtnText);
        tipDialogOneButton.setCancelable(false);// 点击其他地方不能关闭
        tipDialogOneButton.setOnConfirmListener(onConfirmListener);
        try {
            tipDialogOneButton.show();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * This dialog has content and two button but no title
     * @param context
     * @param content
     * @param leftBtnText
     * @param rightBtnText
     * @param onDialogBtnClickListener
     */
    public static void showTipDialogNoTitle(Context context, String content, String leftBtnText, String rightBtnText, int leftBtnTextColor, int rightBtnTextColor, TipDialog.OnDialogBtnClickListener onDialogBtnClickListener) {
        if (context == null) {
            return;
        }
        TipDialog tipDialog = new TipDialog(context);
        tipDialog.hideTitle();
        tipDialog.setContent(content);
        tipDialog.setLeftBtnText(leftBtnText);
        tipDialog.setLeftBtnTextColor(leftBtnTextColor);
        tipDialog.setRightBtnText(rightBtnText);
        tipDialog.setRightBtnTextColor(rightBtnTextColor);
        tipDialog.setOnBtnClickListener(onDialogBtnClickListener);
        try{
            tipDialog.show();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
