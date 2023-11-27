package model;

public class Player {
    private String name;
    private TypePicture typePicture;
    private int tablero [][];

    public Player() {
        tablero = new int [3][3];
        limpiar();
    }
    public Player(TypePicture typePicture) {
        this.typePicture = typePicture;
        tablero = new int [3][3];
        limpiar();
    }
    public Player(String name, TypePicture typePicture) {
        this.name = name;
        this.typePicture = typePicture;
        tablero = new int [3][3];
        limpiar();
    }
    public void limpiar(){
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tablero[i][j] = 0;
            }
        }
    }
    public TypePicture tresEnRaya(Player opponent){
        if(tablero [0][0] == 1 && tablero [0][1] == 1 && tablero [0][2] == 1) return TypePicture.LINE1;
        if(tablero [1][0] == 1 && tablero [1][1] == 1 && tablero [1][2] == 1) return TypePicture.LINE2;
        if(tablero [2][0] == 1 && tablero [2][1] == 1 && tablero [2][2] == 1) return TypePicture.LINE3;
        if(tablero [0][0] == 1 && tablero [1][0] == 1 && tablero [2][0] == 1) return TypePicture.LINE4;
        if(tablero [0][1] == 1 && tablero [1][1] == 1 && tablero [2][1] == 1) return TypePicture.LINE5;
        if(tablero [0][2] == 1 && tablero [1][2] == 1 && tablero [2][2] == 1) return TypePicture.LINE6;
        if(tablero [2][0] == 1 && tablero [1][1] == 1 && tablero [0][2] == 1) return TypePicture.LINE7;
        if(tablero [0][0] == 1 && tablero [1][1] == 1 && tablero [2][2] == 1) return TypePicture.LINE8;
        
        int counter = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (tablero [i][j]== 1) counter++;
                if(opponent.getTablero()[i][j] == 1)counter++;
            }
        }
        if (counter == 9) return TypePicture.TIE;
        return null;
    }
    

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypePicture getTypePicture() {
        return typePicture;
    }

    public void setTypePicture(TypePicture typePicture) {
        this.typePicture = typePicture;
    }

     
}
