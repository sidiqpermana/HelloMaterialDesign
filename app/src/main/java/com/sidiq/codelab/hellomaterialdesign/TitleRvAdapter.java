package com.sidiq.codelab.hellomaterialdesign;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Sidiq on 14/08/2015.
 */
public class TitleRvAdapter extends RecyclerView.Adapter<TitleRvAdapter.TitleRvViewHolder>{

    Activity activity;
    String[] items;

    public TitleRvAdapter(Activity activity, String[] items){
        this.activity = activity;
        this.items = items;
    }

    @Override
    public TitleRvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cards_view, parent, false);
        TitleRvViewHolder titleRvViewHolder = new TitleRvViewHolder(view);
        return titleRvViewHolder;
    }

    @Override
    public void onBindViewHolder(TitleRvViewHolder holder, int position) {
        holder.txtTitle.setText(items[position]);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    public static class TitleRvViewHolder extends RecyclerView.ViewHolder{
        CardView item;
        TextView txtTitle;
        TitleRvViewHolder(View viewItem){
            super(viewItem);

            item = (CardView)viewItem.findViewById(R.id.cv);
            txtTitle = (TextView)viewItem.findViewById(R.id.txt_item_title);
        }
    }

}