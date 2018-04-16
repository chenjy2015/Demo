package com.kye.nb.banner;

import android.support.v4.view.ViewPager.PageTransformer;

import com.kye.nb.banner.transformer.AccordionTransformer;
import com.kye.nb.banner.transformer.BackgroundToForegroundTransformer;
import com.kye.nb.banner.transformer.CubeInTransformer;
import com.kye.nb.banner.transformer.CubeOutTransformer;
import com.kye.nb.banner.transformer.DefaultTransformer;
import com.kye.nb.banner.transformer.DepthPageTransformer;
import com.kye.nb.banner.transformer.FlipHorizontalTransformer;
import com.kye.nb.banner.transformer.FlipVerticalTransformer;
import com.kye.nb.banner.transformer.ForegroundToBackgroundTransformer;
import com.kye.nb.banner.transformer.RotateDownTransformer;
import com.kye.nb.banner.transformer.RotateUpTransformer;
import com.kye.nb.banner.transformer.ScaleInOutTransformer;
import com.kye.nb.banner.transformer.StackTransformer;
import com.kye.nb.banner.transformer.TabletTransformer;
import com.kye.nb.banner.transformer.ZoomInTransformer;
import com.kye.nb.banner.transformer.ZoomOutSlideTransformer;
import com.kye.nb.banner.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
