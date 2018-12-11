package example.com.listproject.data.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class Message implements Parcelable{
    private String autor;
    private String mensaje;

    public Message(String autor, String mensaje) {
        this.autor = autor;
        this.mensaje = mensaje;
    }

    protected Message(Parcel in) {
        autor = in.readString();
        mensaje = in.readString();
    }

    public static final Creator<Message> CREATOR = new Creator<Message>() {
        @Override
        public Message createFromParcel(Parcel in) {
            return new Message(in);
        }

        @Override
        public Message[] newArray(int size) {
            return new Message[size];
        }
    };

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(new String[]{
                this.autor,
                this.mensaje
        });
    }
}
