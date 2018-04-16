package com.example.chenjiayou.mycustomapplication.view.bind_adapter;

import android.databinding.BindingAdapter;

import net.soulwolf.widget.ratiolayout.RatioDatumMode;
import net.soulwolf.widget.ratiolayout.widget.RatioFrameLayout;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 28/12/2017
 * @updated : 28/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RatioLayoutBindingAdapter {

    @BindingAdapter({"binddatumRatio", "bindwidthRatio", "bindheightRatio"})
    public static void setWidthRatio(RatioFrameLayout view, String datumRatio, float widthRatio, float heightRatio) {
//        <attr name="datumRatio">
//            <enum name="datumAuto" value="0"/>
//            <enum name="datumWidth" value="1"/>
//            <enum name="datumHeight" value="2"/>
//        </attr>
        RatioDatumMode mode;
        switch (datumRatio) {
            case "datumAuto": {
                mode = RatioDatumMode.DATUM_AUTO;
                break;
            }
            case "datumWidth": {
                mode = RatioDatumMode.DATUM_WIDTH;
                break;
            }
            case "datumHeight": {
                mode = RatioDatumMode.DATUM_HEIGHT;
                break;
            }
            default: {
                mode = RatioDatumMode.DATUM_AUTO;
                break;
            }
        }
        view.setRatio(mode, widthRatio, heightRatio);
    }
}
