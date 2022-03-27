package pl.musialowicz.java.lsm.model;

public class Dzik
{
    private String name;

    private String imageName;

    private String dutiesCount;

    private String foodCount;

    private String imagePath;

    public Dzik(String name, String imageName, String dutiesCount, String foodCount) {
        this.name = name;
        this.imageName = imageName;
        this.dutiesCount = dutiesCount;
        this.foodCount = foodCount;
        this.imagePath = "@drawable/" + imageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getDutiesCount() {
        return dutiesCount;
    }

    public void setDutiesCount(String dutiesCount) {
        this.dutiesCount = dutiesCount;
    }

    public String getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(String foodCount) {
        this.foodCount = foodCount;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
