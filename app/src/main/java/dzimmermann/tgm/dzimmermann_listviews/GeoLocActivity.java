package dzimmermann.tgm.dzimmermann_listviews;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class GeoLocActivity extends AppCompatActivity {

    private Geoloc[] locations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geoloc);

        ListView geoLocListView = (ListView)this.findViewById(R.id.listView_geoloc);

        Geoloc vienna = new Geoloc(48, 16);
        Geoloc salzburg = new Geoloc(48, 13);
        Geoloc new_york = new Geoloc(40,-74);
        Geoloc santiago = new Geoloc(-33,-70);
        Geoloc canberra = new Geoloc(-35, 150);

        this.locations = new Geoloc[]{vienna,salzburg,new_york,santiago,canberra};

        ArrayAdapter<Geoloc> arrayAdapter = new ArrayAdapter<Geoloc>(this, android.R.layout.simple_list_item_1, locations);
        geoLocListView.setAdapter(arrayAdapter);

        geoLocListView.setOnItemClickListener(new CustomListener(this));
    }

    public void switchDisplayWithPosDataFrom(int position) {
        Intent intent = new Intent(this, MapsActivity.class);


        Geoloc point = locations[position];
        int lat = point.getLat();
        int longi = point.getLongi();

        intent.putExtra("LATITUDE",lat+"");
        intent.putExtra("LONGITUDE",longi+"");

        startActivity(intent);
    }
}
