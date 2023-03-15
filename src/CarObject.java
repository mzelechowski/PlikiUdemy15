import java.io.Serializable;

public class CarObject implements Serializable {
    static int counter=0;
    private String manufacturer;
    private String name;
    private int productionYear;
    public int topSpeed;
    private transient int id;

    public CarObject(String manufacturer, String name, int productionYear, int topSpeed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.productionYear = productionYear;
        this.topSpeed = topSpeed;
        this.id = ++counter;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CarObject{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", topSpeed=" + topSpeed +
                ", id=" + id +
                '}';
    }
}
