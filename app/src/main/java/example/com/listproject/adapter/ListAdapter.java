package example.com.listproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import example.com.listproject.data.pojo.Mensaje;
import example.com.listproject.data.repository.MessageRepository;

public class ListAdapter extends ArrayAdapter<Mensaje> {

    public ListAdapter(@NonNull Context context) {
        super(context, layu, MessageRepository.getRepository().getMensajes());
    }
}
