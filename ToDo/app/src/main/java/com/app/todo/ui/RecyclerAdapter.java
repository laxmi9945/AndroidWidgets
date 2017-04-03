package com.app.todo.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.todo.R;

import java.util.List;

/**
 * Created by bridgeit on 3/4/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    AppCompatTextView textView;
    Context context;
    List<String> strings;
    CardView cardview;
    public RecyclerAdapter(Context context,List<String> strings){
        this.strings=strings;
        this.context=context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.activity_todoitems,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }
        
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        textView.setText(strings.get(position));
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),ItemDetailsActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("keys",strings.get(position));
                intent.putExtra("name",bundle);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return strings.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(final View itemView) {
            super(itemView);
            textView=(AppCompatTextView)itemView.findViewById(R.id.mytextView);
            cardview=(CardView) itemView.findViewById(R.id.myCardView);

        }
    }
}
