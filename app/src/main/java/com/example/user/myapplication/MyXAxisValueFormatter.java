package com.example.user.myapplication;
import com.github.mikephil.charting.formatter.AxisValueFormatter;
import com.github.mikephil.charting.components.AxisBase;

/**
 * Created by user on 2016/9/8.
 */
public class MyXAxisValueFormatter implements AxisValueFormatter {

    private String[] mValues;

    public MyXAxisValueFormatter(String[] values) {
        this.mValues = values;
    }


    public String getFormattedValue(float value, AxisBase axis) {
        // "value" represents the position of the label on the axis (x or y)
        return mValues[(int) value];
    }

    /** this is only needed if numbers are returned, else return 0 */

    public int getDecimalDigits() { return 0; }
}
