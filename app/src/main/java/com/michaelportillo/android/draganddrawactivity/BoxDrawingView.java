package com.michaelportillo.android.draganddrawactivity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by USER on 1/11/19.
 */

public class BoxDrawingView extends View {

    //Used when creating the view in code
    public BoxDrawingView(Context context){
        this(context, null);
    }

    //Used when inflating the view from XML
    public BoxDrawingView(Context context, AttributeSet attrs){
        super(context, attrs);
    }
}
