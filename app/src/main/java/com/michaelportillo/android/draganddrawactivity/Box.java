package com.michaelportillo.android.draganddrawactivity;

import android.graphics.PointF;

/**
 * Created by USER on 1/12/19.
 */

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin){
        mOrigin = origin;
        mCurrent = origin;
    }

    public PointF getCurrent(){
        return mCurrent;
    }

    public void setCurrent(PointF current){
        mCurrent = current;
    }

    public PointF getOrgin(){
        return mOrigin;
    }
}
