package com.rensh.theme;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Resources a = getResources();
//        Map<String, Integer> themeColor = ResourceUtils.getThemeColor(a);
//        TextView textView = (TextView)findViewById(R.id.textview);
//        textView.setTextColor(themeColor.get("themeTextColor"));



        int radius0 = 10;
        float[] outerR = new float[] { radius0, radius0, radius0, radius0, radius0, radius0, radius0, radius0 };
        RoundRectShape roundRectShape0 = new RoundRectShape(outerR, null, null);

        int radius1 = 10;
        float[] outerR1 = new float[] { radius1, radius1, radius1, radius1, radius1, radius1, radius1, radius1 };
        RoundRectShape roundRectShape1 = new RoundRectShape(outerR1, null, null);

        ShapeDrawable shapeDrawableBg = new ShapeDrawable();

        shapeDrawableBg.setPadding(0, 0, 0, 0);
        shapeDrawableBg.setShape(roundRectShape0);
        shapeDrawableBg.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawableBg.getPaint().setColor(0xffbbbbbb);


        ShapeDrawable shapeDrawableFg = new ShapeDrawable();

        shapeDrawableFg.setPadding(23, 23, 23, 23);
        shapeDrawableFg.setShape(roundRectShape1);

        shapeDrawableFg.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawableFg.getPaint().setColor(0xffdddddd);

        Drawable[] layers = {shapeDrawableBg, shapeDrawableFg};
        LayerDrawable layerDrawable = new LayerDrawable(layers);
        layerDrawable.setLayerInset(1, 0, 0, 1, 1);

    }
}
