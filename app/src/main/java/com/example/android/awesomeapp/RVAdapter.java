package com.example.android.awesomeapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Nahid on 04-Sep-15.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{
    List<Person> persons;
    Context context;

    RVAdapter(List<Person> persons){
        this.persons = persons;
    }


    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_activity, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(persons.get(i).name);
        personViewHolder.personAge.setText(persons.get(i).age);
        personViewHolder.personPhoto.setImageResource(persons.get(i).photoId);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }


    protected class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        CardView cv;
        TextView personName;
        TextView personAge;
        ImageView personPhoto;


        public PersonViewHolder(View itemView){
            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(this);
            itemView.setClickable(true);
            cv = (CardView) itemView.findViewById(R.id.cv);
            personName = (TextView) itemView.findViewById(R.id.person_name);
            personAge = (TextView) itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
        }

        @Override
        public void onClick(View v) {

            if(getLayoutPosition() == 0){
                try{
                    context.startActivity(new Intent(context, Dexter.class));
                }catch (RuntimeException e){
                    e.printStackTrace();
                }finally {
                    Toast.makeText(context, ""+getLayoutPosition(), Toast.LENGTH_SHORT).show();
                }
            }


            else if(getLayoutPosition() == 1){
                try{
                    context.startActivity(new Intent(context, DeeDee.class));
                }catch (RuntimeException e){
                    e.printStackTrace();
                }finally {
                    Toast.makeText(context, ""+getLayoutPosition(), Toast.LENGTH_SHORT).show();
                }
            }


            else if(getLayoutPosition() == 2){
                try{
                    context.startActivity(new Intent(context, Dad.class));
                }catch (RuntimeException e){
                    e.printStackTrace();
                }finally {
                    Toast.makeText(context, ""+getLayoutPosition(), Toast.LENGTH_SHORT).show();
                }
            }


            else if(getLayoutPosition() == 3){
                try{
                    context.startActivity(new Intent(context, Mom.class));
                }catch (RuntimeException e){
                    e.printStackTrace();
                }finally {
                    Toast.makeText(context, ""+getLayoutPosition(), Toast.LENGTH_SHORT).show();
                }
            }


            else if(getLayoutPosition() == 4){
                try{
                    context.startActivity(new Intent(context, Mandark.class));
                }catch (RuntimeException e){
                    e.printStackTrace();
                }finally {
                    Toast.makeText(context, ""+getLayoutPosition(), Toast.LENGTH_SHORT).show();
                }
            }

        }

    }

}
