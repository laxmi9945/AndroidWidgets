
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.todo.R;
import com.app.todo.ui.ItemDetailsActivity;

import java.util.List;

/**
 * Created by laxmi9946 on 4/2/2017.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    AppCompatTextView textView;
    Context context;
    List<String> strings;
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
    public void onBindViewHolder(MyViewHolder holder, int position) {
        textView.setText(strings.get(position));
    }

    @Override
    public int getItemCount() {
        return strings.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(final View itemView) {
            super(itemView);
            textView=(AppCompatTextView)itemView.findViewById(R.id.myCardView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(itemView.getContext(),ItemDetailsActivity.class);
                    Bundle bundle=new Bundle();
                    bundle.putString("key",textView.getText().toString());
                    intent.putExtra("name","value");
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}