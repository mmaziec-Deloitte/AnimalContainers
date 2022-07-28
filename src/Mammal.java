public class Mammal extends Animal{
    private String parentName;
    public Mammal(String parentName, int mammalNumber) {
        this.parentName = parentName;
        this.mammalNumber = mammalNumber;
    }
    private int mammalNumber;
    public Mammal() {
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public int getMammalNumber() {
        return mammalNumber;
    }

    public void setMammalNumber(int mammalNumber) {
        this.mammalNumber = mammalNumber;
    }
}
