package TestPackage;

public class TestClass {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "id=" + id +
                '}';
    }
}
