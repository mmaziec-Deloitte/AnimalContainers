import java.util.List;

public class Container<T extends Animal> {
    public Container(List<T> t) {
        this.t = t;
    }

    private List<T> t;

    public List<T> getT() {
        return t;
    }

    public void setT(List<T> t) {
        this.t = t;
    }
}
