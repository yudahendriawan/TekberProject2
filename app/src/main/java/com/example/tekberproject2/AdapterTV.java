package com.example.tekberproject2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.example.tekberproject2.model.DataTV;

import java.util.ArrayList;

public class AdapterTV extends RecyclerView.Adapter<AdapterTV.AdapterTvViewHolder> {

    private ArrayList<DataTV> listDataTv;
    private Context context;

    public AdapterTV(ArrayList<DataTV> listDataTv, Context context) {
        this.listDataTv = listDataTv;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterTvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card_view, parent, false);
        return new AdapterTvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTvViewHolder holder, int position) {
        holder.binding(listDataTv.get(position));
    }

    @Override
    public int getItemCount() {
        return listDataTv.size();
    }

    public int getItemViewType(int position){
        listDataTv.get(position);
        return position;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    public class AdapterTvViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        ProgressBar progressBar;
        TextView id, airedSeason, episodeName, firstAired, director, rating, guestar, guestar2;

        public AdapterTvViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            id = itemView.findViewById(R.id.tv_id);
            airedSeason = itemView.findViewById(R.id.tv_aired_season);
            episodeName = itemView.findViewById(R.id.tv_episode_name);
            firstAired = itemView.findViewById(R.id.tv_first_aired);
            director = itemView.findViewById(R.id.tv_director);
            rating = itemView.findViewById(R.id.tv_rating);
            guestar = itemView.findViewById(R.id.tv_guestar);
            guestar2 = itemView.findViewById(R.id.tv_guestar2);
            progressBar = itemView.findViewById(R.id.progress_bar_img);

        }

        public void binding(final DataTV dataTV) {

            id.setText(dataTV.getId());
            airedSeason.setText(dataTV.getAiredSeason());
            episodeName.setText(dataTV.getEpisodeName());
            firstAired.setText(dataTV.getFirstAired());
            director.setText(dataTV.getDirector());
            rating.setText(dataTV.getRating());
            guestar.setText(dataTV.getGuestStar().getNama());
            guestar2.setText(dataTV.getGuestStar().getNama2());

            Glide.with(itemView.getContext())
                    .load(dataTV.getPhotos())
                    .apply(new RequestOptions().override(1000, 1000))
                    .listener(new RequestListener<Drawable>() {
                        @Override
                        public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                            progressBar.setVisibility(View.GONE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                            progressBar.setVisibility(View.GONE);
                            return false;
                        }
                    })
                    .into(imgPhoto);

        }
    }
}
