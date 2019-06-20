package com.neofytosneocleous.recyclerviewtest;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsAdapter.ViewHolder>{

    private Context context;
    private ArrayList<Animal> animals;

    public AnimalsAdapter(Context context, ArrayList<Animal> animals) {
        this.context = context;
        this.animals = animals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_animal,parent, false);

        return new ViewHolder(v);

    }

// takes the data from the animals list
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.tv_animal_name.setText(String.valueOf(animal.getName()));
        holder.tv_animal_age.setText(String.valueOf(animal.getAge()));

    }

//    how many items in the recycler view
    @Override
    public int getItemCount() {
        return animals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_animal_name, tv_animal_age;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_animal_name = itemView.findViewById(R.id.tv_animal_name);
            tv_animal_age = itemView.findViewById(R.id.tv_animal_age);

        }
    }
}
