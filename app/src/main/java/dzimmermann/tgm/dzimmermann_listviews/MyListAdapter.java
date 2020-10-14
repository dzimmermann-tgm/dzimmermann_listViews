package dzimmermann.tgm.dzimmermann_listviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyListAdapter extends BaseAdapter {

    private List<Game> games;
    private LayoutInflater layoutInflater;
    private Context context;

    public MyListAdapter(Context aContext, List<Game> games) {
        this.games = games;
        this.context = aContext;
        this.layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return games.size();
    }

    @Override
    public Object getItem(int position) {
        return games.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.custom_list_item, null);
            holder = new ViewHolder();
            holder.player1_image = (ImageView)convertView.findViewById(R.id.player1_imageView);
            holder.player2_image = (ImageView)convertView.findViewById(R.id.player2_imageView);
            holder.player1_score_text = (TextView)convertView.findViewById(R.id.textView_score_player_1);
            holder.player2_score_text = (TextView)convertView.findViewById(R.id.textView_score_player_2);
            holder.status             = (TextView)convertView.findViewById(R.id.textView_status);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Game game = this.games.get(position);

        holder.player1_score_text.setText(game.getPlayer1_score());
        holder.player2_score_text.setText(game.getPlayer2_score());
        holder.status.setText(game.getStatus());

        holder.player1_image.setImageResource(getMipmapResIdByName(game.getPlayer1()));
        holder.player2_image.setImageResource(getMipmapResIdByName(game.getPlayer2()));

        return convertView;
    }

    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        return resID;
    }

    static class ViewHolder {
        ImageView player1_image;
        ImageView player2_image;
        TextView player1_score_text;
        TextView player2_score_text;
        TextView status;
    }
}
