package example.com.listproject.data.repository;

import java.util.ArrayList;

import example.com.listproject.data.pojo.Mensaje;

public class MessageRepository {
    private ArrayList<Mensaje> mensajes;
    private static MessageRepository repository;

    static {
        repository = new MessageRepository();
    }

    private MessageRepository(){
        this.mensajes = new ArrayList<>();
        initialice();
    }

    private void initialice(){
        add(new Mensaje("yo", "Saleritos somos"));
        add(new Mensaje("tu", "Buena sombra le cobija"));
        add(new Mensaje("yo", "Mas vale tarde"));
    }

    private void add(Mensaje mensaje) {
        mensajes.add(mensaje);
    }

    public static MessageRepository getRepository(){
        return repository;
    }

    public ArrayList<Mensaje> getMensajes(){
        return mensajes;
    }
}
