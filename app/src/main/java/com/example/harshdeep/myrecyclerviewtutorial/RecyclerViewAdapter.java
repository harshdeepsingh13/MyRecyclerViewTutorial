package com.example.harshdeep.myrecyclerviewtutorial;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by harshdeep on 15/10/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PersonViewHolder> {

    private List<People> persons;

    public RecyclerViewAdapter(List<People> persons) {
        this.persons = persons;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        PersonViewHolder personViewHolder = new PersonViewHolder(view);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.firstName.setText(persons.get(position).getFirstName());
        holder.lastName.setText(persons.get(position).getLastName());
    }

    @Override
    public int getItemCount() {
        return this.persons.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        public TextView firstName, lastName;
        public PersonViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardView);
            firstName = (TextView)itemView.findViewById(R.id.firstName);
            lastName = (TextView)itemView.findViewById(R.id.lastName);
        }
    }
}
