package example.com.listproject.ui;

import android.os.AsyncTask;

import java.util.List;

import example.com.listproject.data.pojo.Mensaje;
import example.com.listproject.data.repository.MessageRepository;

public class ListInteractor {

    ListInteractor.onLoadMensajeItems onLoadMensajeItems;

    public interface onLoadMensajeItems{
        void onSuccess(List<Mensaje> mensajes);
        void onError();
    }

    public ListInteractor(ListPresenter presenter){
        this.onLoadMensajeItems = presenter;
    }


    public void loadMensajes(){
        new AsyncTask<Void, Void, List<Mensaje>>() {
            @Override
            protected List<Mensaje> doInBackground(Void... voids) {
                return MessageRepository.getRepository().getMensajes();
            }

            @Override
            protected void onPostExecute(List<Mensaje> mensajes) {
                onLoadMensajeItems.onSuccess(mensajes);
            }
        }.execute();
    }

}
