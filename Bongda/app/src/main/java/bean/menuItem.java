package bean;

/**
 * Created by Pham Duyen on 27/04/2016.
 */
public class menuItem {
    private String funtion;
    private int idImage;

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public menuItem(int idImage,String funtion) {
        this.funtion = funtion;
        this.idImage = idImage;
    }

    public String getFuntion() {
        return funtion;
    }

    public void setFuntion(String funtion) {
        this.funtion = funtion;
    }

}
