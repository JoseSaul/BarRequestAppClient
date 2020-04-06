import android.content.Context;
import android.widget.LinearLayout;

import com.example.kotlin.R;

public class DynamicViews {

    Context products;

    public DynamicViews(Context products){
        this.products = products;
    }

    final LinearLayout d = (LinearLayout) findViewById(R.id.LayoutFood);
}
