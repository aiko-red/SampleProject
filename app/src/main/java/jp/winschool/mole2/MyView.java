package jp.winschool.mole2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by test on 2017/04/21.
 */

public class MyView extends View {

//    private double touch_x;
//    private double touch_y;
    private int x;
    private int y;

    private Paint ball = new Paint();
    private Paint text;

    private int count;

    public MyView(Context context, AttributeSet attrribute) {
        super(context, attrribute);
        context = context;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        touch_x = Math.random();
//        touch_y = Math.random();
        x = (int)(Math.random() * 400);
        y = (int)(Math.random() * 400);
        System.out.println("(x,y)=" + x + " " + y);
//        ball = new Paint();
        ball.setColor(Color.GREEN);

        ball.setAntiAlias(true);
        canvas.drawCircle(x, y, 50.0f, ball);

    }
    @Override
    public void invalidate()
    {
        super.invalidate();
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        super.onTouchEvent(event);
//
//        touch_x = (int) event.getX();
//        touch_y = (int) event.getY();
//        invalidate();
//
//        return true;
//    }
}
