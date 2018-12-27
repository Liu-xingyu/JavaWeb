package yerenpeng.stream;

/**
 * 模型
 */
public class ObjectModel {

    private int id;

    private String name;

    public ObjectModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ObjectModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
