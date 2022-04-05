package com.example.mapimplementation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>{
    public static String number;
    List<Model> itemList1;   Context context1;
    public ItemAdapter(List<Model> itemList, Context context)
    { // creating a constructor
        this.itemList1=itemList;
        this.context1 = context;   }
    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        // the row we created
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        holder.itemImage.setImageResource(itemList1.get(position).getImage());
        // binding the itemImage of viewholder to data
        holder.itemtxt.setText(itemList1.get(position).getName());
          holder.call.setText(itemList1.get(position).getPhone());
          holder.txtCall.setText(itemList1.get(position).getPhone());
    }   @Override
    public int getItemCount() {
        return itemList1.size();
    }    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    { // viewholder is a class that extends RecyclerView.ViewHolder and
    //is used to
        ImageView itemImage;
        TextView itemtxt,txtCall;
        LinearLayout linearLayout;
        Button call,details;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        itemImage=itemView.findViewById(R.id.itemImg); // getting references
        itemtxt=itemView.findViewById(R.id.itemName);
        call= itemView.findViewById(R.id.call);
        details = itemView.findViewById(R.id.details);
        txtCall = itemView.findViewById(R.id.txtCall);
        linearLayout=itemView.findViewById(R.id.layout_id);
        itemImage.setOnClickListener(this);                        // attaching listners
        itemtxt.setOnClickListener(this);
        call.setOnClickListener(this);
            details.setOnClickListener(this);        }
    @Override
    public void onClick(View view) {
        number = txtCall.getText().toString();
    }
    if (view.getId() == call.getId()) {                               // handling clicks
           Intent callIntent = new Intent(Intent.ACTION_CALL);
           callIntent.setData(Uri.parse("tel:" + number));
           context1.startActivity(callIntent);
    }          if (view.getId() == details.getId()) {
        Intent callIntent;
        callIntent = new Intent(context1, DetailsActivity.class);
        callIntent.putExtra("key", itemtxt.getText().toString());// keeping number instead of id
                  context1.startActivity(callIntent);
    }
}    }}
    }
    }

