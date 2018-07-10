package com.example.john.testrecyclertabs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.Holder> {
    private LayoutInflater layoutInflater;
    private ArrayList<DataClass> sDatabase;

    //Creates the actual method of performing the recycler
    public DataAdapter(Context context, ArrayList<DataClass> sDatabase) {
        this.layoutInflater = LayoutInflater.from(context);
        this.sDatabase = sDatabase;
    }

    //Creates the view that is inflated via the Recycler
    @Override
    public Holder onCreateViewHolder (ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item_view, parent, false);
        return new Holder(view);
    }

    //Binds your Array data to the particular layout views
    @Override
    public void onBindViewHolder(Holder holder, int position) {
        final DataClass current = sDatabase.get(position);

        //Assign the values of your ArrayList to the assigned holder views
        holder.Name.setText(current.getName());
        holder.Project.setText(current.getProject());
        holder.Id.setText(String.valueOf(current.getId()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "You've selected: " + current.getName(), Toast.LENGTH_SHORT).show();
                //This is where you can define how your item should respond when clicked.
                //Intent, Toasts, etc, etc, etc...
            }
        });

    }

    //Returns your Array size
    @Override
    public int getItemCount() {
        return sDatabase.size();
    }

    //This is a custom holder which is how your data binding occurs, this is where the ids are assigned.
    class Holder extends RecyclerView.ViewHolder {
        private TextView Name;
        private TextView Project;
        private TextView Id;

        private Holder(View View) {
            super(View);
            Name = View.findViewById(R.id.data_name);
            Project = View.findViewById(R.id.data_project);
            Id = View.findViewById(R.id.data_id);
        }
    }
}
