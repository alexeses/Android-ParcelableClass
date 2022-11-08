package es.uem.testparceablebueno.javabean;

import android.os.Parcel;
import android.os.Parcelable;

public class Persona implements Parcelable {

    public String nombre;
    public String nacionalidad;
    public int edad;

    public Persona(String nombre, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    protected Persona(Parcel in) {
        nombre = in.readString();
        nacionalidad = in.readString();
        edad = in.readInt();
    }

    public static final Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel in) {
            return new Persona(in);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(nacionalidad);
        parcel.writeInt(edad);

    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }
}
