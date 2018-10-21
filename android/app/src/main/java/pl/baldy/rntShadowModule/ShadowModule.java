package pl.baldy.rntShadowModule;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

/**
 * Created by lbaldy on 21/10/2018.
 */

public class ShadowModule extends ReactContextBaseJavaModule {
    public ShadowModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ShadowModuleView";
    }
}
