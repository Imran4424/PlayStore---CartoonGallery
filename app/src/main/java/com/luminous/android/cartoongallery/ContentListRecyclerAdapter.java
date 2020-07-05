package com.luminous.android.cartoongallery;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Shah Md Imran Hossain on 05, July, 2020
 */
public class ContentListRecyclerAdapter extends RecyclerView.Adapter<ContentListRecyclerAdapter.ViewHolder> {
    private final Context context;
    private final LayoutInflater layoutInflater;
    private final List<String> contentLinksList;

    public ContentListRecyclerAdapter(Context context, List<String> contentLinksList) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.contentLinksList = contentLinksList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.item_content_list, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.currentPosition = position;

        String imageLink = "https://img.youtube.com/vi/" + contentLinksList.get(position) + "/hqdefault.jpg";
        Picasso.get().load(imageLink).into(holder.contentThumbnail);
    }

    @Override
    public int getItemCount() {
        return contentLinksList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView contentThumbnail;
        public int currentPosition;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contentThumbnail = itemView.findViewById(R.id.listThumbnail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent youtubePlayerIntent = new Intent(context, YoutubePlayer.class);
                    YoutubePlayer.youtubeVideoId = contentLinksList.get(currentPosition);

                    context.startActivity(youtubePlayerIntent);
                }
            });
        }
    }
}
