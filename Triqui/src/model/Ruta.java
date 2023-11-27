package model;

public class Ruta {
    public static final String EQUIS = "/resources/Equis.png";
    public static final String CIRCULO = "/resources/Circulo.png";
    public static final String JUGADOREQUIS = "/resources/JugadorEquis.png";
    public static final String JUGADORCIRCULO = "/resources/JugadorCirculo.png";
    public static final String JUGADORAUXILIAR = "/resources/JugadorAuxiliar.png";
    
    public static String LINEA1 = "/resources/CirculoLine1.png";
    public static String LINEA2 = "/resources/CirculoLine2.png";
    public static String LINEA3 = "/resources/CirculoLine3.png";
    public static String LINEA4 = "/resources/CirculoLine4.png";
    public static String LINEA5 = "/resources/CirculoLine5.png";
    public static String LINEA6 = "/resources/CirculoLine6.png";
    public static String LINEA7 = "/resources/CirculoLine7.png";
    public static String LINEA8 = "/resources/CirculoLine8.png";
    
    public static void cambiarRutas(TypePicture typePicture){
        if(typePicture == TypePicture.CIRCULO){
        LINEA1 = "/resources/CirculoLine1.png";
        LINEA2 = "/resources/CirculoLine2.png";
        LINEA3 = "/resources/CirculoLine3.png";
        LINEA4 = "/resources/CirculoLine4.png";
        LINEA5 = "/resources/CirculoLine5.png";
        LINEA6 = "/resources/CirculoLine6.png";
        LINEA7 = "/resources/CirculoLine7.png";
        LINEA8 = "/resources/CirculoLine8.png";
    }else if(typePicture == TypePicture.EQUIS);{
        LINEA1 = "/resources/EquisLine1.png";
        LINEA2 = "/resources/EquisLine2.png";
        LINEA3 = "/resources/EquisLine3.png";
        LINEA4 = "/resources/EquisLine4.png";
        LINEA5 = "/resources/EquisLine5.png";
        LINEA6 = "/resources/EquisLine6.png";
        LINEA7 = "/resources/EquisLine7.png";
        LINEA8 = "/resources/EquisLine8.png";
    }
        
    }
    
}
