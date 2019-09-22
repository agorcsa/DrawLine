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
    }

    private  void  drawVerticalLines(Canvas canvas) {
        canvas.drawLine(getWidth() * X_PARTITION_RATIO, 0f, getWidth() * X_PARTITION_RATIO, getHeight(), paint);
        canvas.drawLine(getWidth() * (2 * X_PARTITION_RATIO), 0f, getWidth() * (2 * X_PARTITION_RATIO), getHeight(), paint);
    }

    private void drawHorizontalLines(Canvas canvas) {
        canvas.drawLine(0f, getHeight() * Y_PARTITION_RATIO, getWidth(), getHeight() * Y_PARTITION_RATIO, paint);
        canvas.drawLine(0f, getHeight() * (2 * Y_PARTITION_RATIO), getWidth(), getHeight() * (2 * Y_PARTITION_RATIO), paint);
    }
}
