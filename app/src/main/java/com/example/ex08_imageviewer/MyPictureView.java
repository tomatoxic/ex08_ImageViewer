package com.example.ex08_imageviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyPictureView extends View {

    String imagePath = null;

    public MyPictureView(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        // renoir.jpg -> byte[] -> bitmap 객체 -> canvas -> onDraw() 메소드 -> View
        if(imagePath != null) {
            Bitmap bitmap1 = BitmapFactory.decodeFile(imagePath);
            canvas.drawBitmap(bitmap1, 0, 0, null);
            bitmap1.recycle();
        }
    }
}
