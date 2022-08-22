package com.acme;

import java.util.Objects;

public final class PersonaRegistro {

    private final String nombre;
    private final String apellidos;

    PersonaRegistro(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String nombre() {
        return nombre;
    }

    public String apellidos() {
        return apellidos;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (PersonaRegistro) obj;
        return Objects.equals(this.nombre, that.nombre) &&
                Objects.equals(this.apellidos, that.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }

    @Override
    public String toString() {
        return String.format("%s %s", nombre,apellidos);
    }

}
