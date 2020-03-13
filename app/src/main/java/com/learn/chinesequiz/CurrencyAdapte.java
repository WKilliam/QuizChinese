package com.learn.chinesequiz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CurrencyAdapte extends RecyclerView.Adapter<CurrencyAdapte.ViewHolder> {

    private ArrayList<Question> currencies;

    public CurrencyAdapte(ArrayList<Question> currencies) {
        this.currencies = currencies;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_currency,parent,false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Question currency = currencies.get(position);
        holder.flag.setImageResource(currency.getPicture());
        holder.sybol.setText(currency.getQuestion() + " " + position);
        //holder.itemView.setOnClickListener();
    }

    @Override
    public int getItemCount() {
        return currencies.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        final ImageView flag;
        final TextView sybol;
        final TextView rate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.imageView6);
            sybol = itemView.findViewById(R.id.textViewTaux);
            rate = itemView.findViewById(R.id.textView2);
        }
    }
}