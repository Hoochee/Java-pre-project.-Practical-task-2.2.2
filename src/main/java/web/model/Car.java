package web.model;


public class Car {

    private String model;
    private String madeIn;
    private int modelYear;

    public void setModel(String model) {
        this.model = model;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getModel() {
        return model;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public int getModelYear() {
        return modelYear;
    }

    public Car(String model, String madeIn, int modelYear) {
        this.model = model;
        this.madeIn = madeIn;
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }
}
