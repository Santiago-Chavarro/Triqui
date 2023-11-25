package model;

public class Player {
    private String name;
    private TypePicture typePicture;

    public Player(TypePicture typePicture) {
        this.typePicture = typePicture;
    }

    public Player(String name, TypePicture typePicture) {
        this.name = name;
        this.typePicture = typePicture;
    }

    Player() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
