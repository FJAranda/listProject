package example.com.listproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import example.com.listproject.R;
import example.com.listproject.data.pojo.Mensaje;
import example.com.listproject.data.repository.MessageRepository;

public class ListAdapter extends ArrayAdapter<Mensaje> {

    public ListAdapter(@NonNull Context context) {
        super(context, R.layout.list_item, MessageRepository.getRepository().getMensajes());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView tvAutor;
        TextView tvMensaje;
        View view;

        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.list_item, null);
        tvAutor = view.findViewById(R.id.tvAutor);
        tvMensaje = view.findViewById(R.id.tvMensaje);

        tvAutor.setText(getItem(position).getAutor());
        tvMensaje.setText(getItem(position).getMensaje());

        return view;
    }
}
