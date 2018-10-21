package pl.baldy.rntShadowModule;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.awesomeproject.R;

/**
 * Created by lbaldy on 21/10/2018.
 */

public class ShadowView extends LinearLayout {
    private Context context;

    public ShadowView(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public void init() {
        Log.d("ShadowView", "Inflating the layout");
        View v = inflate(context, R.layout.button_layout, this);
//        inflate(context, R.layout.content_main, this);
//        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.horizontal_number_picker);
//        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//            @Override
//            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
//                Log.d(TAG, String.format(Locale.US, "oldVal: %d, newVal: %d", oldVal, newVal));
//                WritableMap event = Arguments.createMap();
//                event.putString("selectedValue", Integer.toString(newVal));
//                ReactContext reactContext = (ReactContext)getContext();
//                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
//                        getId(),
//                        "onSelect",
//                        event);
//            }
//        });
    }
}
