package example.com.listproject.data.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class Mensaje implements Parcelable{
    private String autor;
    private String mensaje;

    public Mensaje(String autor, String mensaje) {
        this.autor = autor;
        this.mensaje = mensaje;
    }

    protected Mensaje(Parcel in) {
        autor = in.readString();
        mensaje = in.readString();
    }

    public static final Creator<Mensaje> CREATOR = new Creator<Mensaje>() {
        @Override
        public Mensaje createFromParcel(Parcel in) {
            return new Mensaje(in);
        }

        @Override
        public Mensaje[] newArray(int size) {
            return new Mensaje[size];
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
