package dzimmermann.tgm.dzimmermann_listviews;

import android.view.View;
import android.widget.AdapterView;

public class CustomListener implements AdapterView.OnItemClickListener {


    private GeoLocActivity creator;
    public CustomListener(GeoLocActivity creator) {
        this.creator = creator;
    }

    @Override
    public void onItemClick(AdapterView<?> a, View v, int position, long id) {
        creator.switchDisplayWithPosDataFrom(position);
    }
}
