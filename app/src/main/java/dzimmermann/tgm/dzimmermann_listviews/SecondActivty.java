package dzimmermann.tgm.dzimmermann_listviews;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SecondActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        List<Game> dummyGames = getDummyGames();
        final ListView listView = (ListView) findViewById(R.id.individualListView);
        listView.setAdapter(new MyListAdapter(this, dummyGames));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Game game = (Game) o;
                Toast.makeText(SecondActivty.this, "Selected :" + " " + game.getPlayer1() + " vs. " + game.getPlayer2(), Toast.LENGTH_LONG).show();
            }
        });
    }


    private List<Game> getDummyGames() {
        List<Game> dummies = new ArrayList<Game>();

        dummies.add(new Game("ru","4","us", "6", "Match in progress"));
        dummies.add(new Game("ru","4","us", "6", "Match in progress"));
        dummies.add(new Game("ru","4","us", "6", "Match in progress"));
        dummies.add(new Game("ru","4","us", "6", "Match in progress"));
        dummies.add(new Game("ru","4","us", "6", "Match in progress"));
        dummies.add(new Game("ru","4","us", "6", "Match in progress"));
        dummies.add(new Game("ru","4","us", "6", "Match in progress"));
        dummies.add(new Game("ru","4","us", "6", "Match in progress"));
        dummies.add(new Game("ru","4","us", "6", "Match in progress"));
        dummies.add(new Game("ru","4","us", "6", "Match in progress"));
        dummies.add(new Game("ru","4","us", "6", "Match in progress"));
        dummies.add(new Game("ru","4","us", "6", "Match in progress"));


        return dummies;
    }


    public void backToMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}