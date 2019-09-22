package com.example.drawline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.core.content.ContextCompat;

public class MyCanvas extends View {

    Paint paint;
    private float X_PARTITION_RATIO = 1 / 3f;
    private float Y_PARTITION_RATIO = 1 / 3f;

    public MyCanvas(Context context) {
        super(context);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);

        drawVerticalLines(canvas);
        drawHorizontalLines(canvas);
        drawDiagonalLineLeftRight(canvas);
        drawDiagonalLineRightLeft(canvas);
        drawHorizontalLine1(canvas);
        drawHorizontalLine2(canvas);
        drawHorizontalLine3(canvas);
        drawVerticalLine1(canvas);
        drawVerticalLine2(canvas);
        drawVerticalLine3(canvas);
    }

    private  void  drawVerticalLines(Canvas canvas) {
        canvas.drawLine(getWidth() * X_PARTITION_RATIO, 0f, getWidth() * X_PARTITION_RATIO, getHeight(), paint);
        canvas.drawLine(getWidth() * (2 * X_PARTITION_RATIO), 0f, getWidth() * (2 * X_PARTITION_RATIO), getHeight(), paint);
    }

    private void drawHorizontalLines(Canvas canvas) {
        canvas.drawLine(0f, getHeight() * Y_PARTITION_RATIO, getWidth(), getHeight() * Y_PARTITION_RATIO, paint);
        canvas.drawLine(0f, getHeight() * (2 * Y_PARTITION_RATIO), getWidth(), getHeight() * (2 * Y_PARTITION_RATIO), paint);
    }


    private void drawDiagonalLineLeftRight(Canvas canvas) {
        paint.setColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
        paint.setStrokeWidth(2);
        canvas.drawLine(0, 0, getWidth(), getHeight(), paint);
    }

    private void drawDiagonalLineRightLeft(Canvas canvas) {
        paint.setColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
        paint.setStrokeWidth(2);
        canvas.drawLine(0, getHeight(), getWidth(), 0, paint);
    }


    private void drawHorizontalLine1(Canvas canvas) {
        paint.setColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        paint.setStrokeWidth(2);
        canvas.drawLine(0, getHeight()/6, getWidth(), getHeight()/6, paint);
    }

    private void drawHorizontalLine2(Canvas canvas) {
        paint.setColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        paint.setStrokeWidth(2);
        canvas.drawLine(getWidth()/2, 0, getWidth()/2, getHeight(), paint);
    }

    private void drawHorizontalLine3(Canvas canvas) {
        paint.setColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        paint.setStrokeWidth(2);
        canvas.drawLine(0, getHeight() * 5/6, getWidth(), getHeight() * 5/6, paint);
    }


    private void drawVerticalLine1(Canvas canvas) {
        paint.setColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        paint.setStrokeWidth(2);
        canvas.drawLine(getWidth()/6, 0,  getWidth()/6, getHeight(), paint);
    }

    private void drawVerticalLine2(Canvas canvas) {
        paint.setColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        paint.setStrokeWidth(2);
        canvas.drawLine(0, getHeight()/2, getWidth(), getHeight()/2, paint);
    }

    private void drawVerticalLine3(Canvas canvas) {
        paint.setColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        paint.setStrokeWidth(2);
        canvas.drawLine(getWidth() * 5/6, 0, getWidth() * 5/6, getHeight(), paint);
    }
}
