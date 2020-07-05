package com.luminous.android.cartoongallery;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by Shah Md Imran Hossain on 05, July, 2020
 */
public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryRecyclerAdapter.ViewHolder> {

    private final Context context;
    private final LayoutInflater layoutInflater;
    private final List<Integer> categoryThumbnailResources;

    public CategoryRecyclerAdapter(Context context, List<Integer> categoryThumbnailResources) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.categoryThumbnailResources = categoryThumbnailResources;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.item_category_list, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.categoryThumbnail.setImageResource(categoryThumbnailResources.get(position));
        holder.currentPosition = position;
    }

    @Override
    public int getItemCount() {
        return categoryThumbnailResources.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public final ImageView categoryThumbnail;
        public int currentPosition;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryThumbnail = itemView.findViewById(R.id.categoryThumbnail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent contentListIntent = new Intent(context, ContentList.class);
                    ContentList.position = currentPosition;

                    context.startActivity(contentListIntent);
                }
            });
        }
    }
}
