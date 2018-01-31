package com.example.arturmusayelyan.cardviewexample.models.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arturmusayelyan.cardviewexample.R;
import com.example.arturmusayelyan.cardviewexample.models.Student;

import java.util.ArrayList;

/**
 * Created by artur.musayelyan on 31/01/2018.
 */

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.MyViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Student> studentsList;

    public RecAdapter(Context context, ArrayList<Student> studentsList) {
        this.context = context;
        this.studentsList = studentsList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.row_with_cardview, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Student currentStudent = studentsList.get(position);
        holder.nameTv.setText(currentStudent.getName());
        holder.idTv.setText(currentStudent.getId());
        holder.salaryTv.setText(currentStudent.getCount());
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private TextView nameTv, idTv, salaryTv;
        private ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view_in_row);
            nameTv = itemView.findViewById(R.id.name_field);
            idTv = itemView.findViewById(R.id.id_field);
            salaryTv = itemView.findViewById(R.id.salary_field);
            imageView = itemView.findViewById(R.id.image_field);
        }
    }
}
