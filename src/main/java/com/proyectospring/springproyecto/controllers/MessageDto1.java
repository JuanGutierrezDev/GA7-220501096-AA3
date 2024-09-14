package com.proyectospring.springproyecto.controllers;

import java.time.LocalDateTime;


public class MessageDto1 {

private LocalDateTime time;
private String Message;
private String NombreAprendiz;
private String FichaAprendiz;




public MessageDto1() {
}


public MessageDto1(LocalDateTime time, String message, String NombreAprendiz, String FichaAprendiz) {
    this.time = time;
    this.Message = message;
    this.NombreAprendiz = NombreAprendiz;
    this.FichaAprendiz = FichaAprendiz;

    
}


public LocalDateTime getTime() {
    return time;
}




public void setTime(LocalDateTime time) {
    this.time = time;
}




public String getMessage() {
    return Message;
}




public void setMessage(String message) {
    Message = message;
}




public String getNombreAprendiz() {
    return NombreAprendiz;
}




public void setNombreAprendiz(String nombreAprendiz) {
    this.NombreAprendiz = nombreAprendiz;
}

public String getFichaAprendiz() {
    return FichaAprendiz;
}

public void setApellidoAprendiz(String FichaAprendiz) {
    this.FichaAprendiz = FichaAprendiz;
}

}
