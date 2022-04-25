package cl.desafiolatm.postresfitness.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.desafiolatm.postresfitness.R;
import cl.desafiolatm.postresfitness.databinding.ItemListBinding;
import cl.desafiolatm.postresfitness.modelo.Item;

public class PostreAdaptador extends RecyclerView.Adapter<PostreAdaptador.CustomViewHolder>{

    private List<Item> postre;
    private OnClickListener listener;

    public PostreAdaptador(List<Item> postre) {
        this.postre = postre;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new CustomViewHolder(v, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.bindData(postre.get(position));

    }

    @Override
    public int getItemCount() {
        return postre.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

    private ItemListBinding b;
    private OnClickListener listener;


    public CustomViewHolder(@NonNull View itemView, OnClickListener listener) {
        super(itemView);
        b = ItemListBinding.bind(itemView);
        this.listener = listener;
    }

    public void bindData(Item postre){

        b.ivImagen.setImageResource(postre.getImagen());
        itemView.setOnClickListener(v -> {
                listener.onPostreClick(postre);
        });
    }
}

    public interface OnClickListener{
        void onPostreClick(Item postre);
    }

    public void setListener(OnClickListener listener)
    {
        this.listener = listener;
    }
}
