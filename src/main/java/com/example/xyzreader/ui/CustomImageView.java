package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by FBrigati on 14/03/2017.
 */

public class CustomImageView extends ImageView {


    public CustomImageView(Context context) {
        super(context);
    }

    public CustomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec){
        int customHeight = MeasureSpec.getSize(widthSpec) * 2 / 3;
        int customHeightSpec = MeasureSpec.makeMeasureSpec(customHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec, customHeightSpec);
    }
}
