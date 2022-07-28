public class Dog extends Mammal{
    private String breed;
    private String boneName;

    public Dog(String breed, String boneName, int dogHouseNumber) {
        this.breed = breed;
        this.boneName = boneName;
        this.dogHouseNumber = dogHouseNumber;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBoneName() {
        return boneName;
    }

    public void setBoneName(String boneName) {
        this.boneName = boneName;
    }

    public int getDogHouseNumber() {
        return dogHouseNumber;
    }

    public void setDogHouseNumber(int dogHouseNumber) {
        this.dogHouseNumber = dogHouseNumber;
    }

    private int dogHouseNumber;
}

