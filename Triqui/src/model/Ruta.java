package model;

public class Ruta {
    public static final String EQUIS = "/resources/Equis.png";
    public static final String CIRCULO = "/resources/Circulo.png";
    public static final String JUGADOREQUIS = "/resources/JugadorEquis.png";
    public static final String JUGADORCIRCULO = "/resources/JugadorCirculo.png";
    public static final String JUGADORAUXILIAR = "/resources/JugadorAuxillar.png";
    
    public static String LINE1 = "/resources/CirculoLinea1.png";
    public static String LINE2 = "/resources/CirculoLinea2.png";
    public static String LINE3 = "/resources/CirculoLinea3.png";
    public static String LINE4 = "/resources/CirculoLinea4.png";
    public static String LINE5 = "/resources/CirculoLinea5.png";
    public static String LINE6 = "/resources/CirculoLinea6.png";
    public static String LINE7 = "/resources/CirculoLinea7.png";
    public static String LINE8 = "/resources/CirculoLinea8.png";
    
    public static void cambiarRutas(TypePicture typePicture){
        if(typePicture == TypePicture.CIRCULO){
        LINE1 = "/resources/CirculoLinea1.png";
        LINE2 = "/resources/CirculoLinea2.png";
        LINE3 = "/resources/CirculoLinea3.png";
        LINE4 = "/resources/CirculoLinea4.png";
        LINE5 = "/resources/CirculoLinea5.png";
        LINE6 = "/resources/CirculoLinea6.png";
        LINE7 = "/resources/CirculoLinea7.png";
        LINE8 = "/resources/CirculoLinea8.png";
        
    }else if(typePicture == TypePicture.EQUIS){
        LINE1 = "/resources/EquisLinea1.png";
        LINE2 = "/resources/EquisLinea2.png";
        LINE3 = "/resources/EquisLinea3.png";
        LINE4 = "/resources/EquisLinea4.png";
        LINE5 = "/resources/EquisLinea5.png";
        LINE6 = "/resources/EquisLinea6.png";
        LINE7 = "/resources/EquisLinea7.png";
        LINE8 = "/resources/EquisLinea8.png";
    }
        
    }
    
}
