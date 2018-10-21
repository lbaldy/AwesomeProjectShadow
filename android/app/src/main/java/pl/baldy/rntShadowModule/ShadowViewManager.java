package pl.baldy.rntShadowModule;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

/**
 * Created by lbaldy on 21/10/2018.
 */

public class ShadowViewManager extends SimpleViewManager<ShadowView> {

    public static final String REACT_CLASS = "ShadowModuleView";

    ShadowView shadowView;


    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected ShadowView createViewInstance(ThemedReactContext reactContext) {
        return new ShadowView(reactContext);
    }
}
