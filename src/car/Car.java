package car;

/**
 * Created by koqfl on 04.05.2017.
 */
public class Car {
    private static String type;
    private int yearProduction;
    private double engineCapacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    Car(String type, int yearProduction, double engineCapacity) {
        setType(type);
        setYearProduction(yearProduction);
        setEngineCapacity(engineCapacity);
    }

    public static Car[] year(Car[] cars, int year){
        int i=0;
        for (Car e: cars) {
            if (e.getYearProduction()==year){
                i++;
            }
        }
        Car[] output = new Car[i];
        i=0;
        for (Car e: cars) {
            if (e.getYearProduction()==year){
                output[i]=e;
                i++;
            }
        }
        return output;
    }

    public static void sort(Car[] Cars) {
        for (int i = 0; i < Cars.length; i++) {
            for (int j = 0; j < Cars.length; j++) {
                if (Cars[i].getYearProduction()<Cars[j].getYearProduction()){
                    Car e=Cars[i];
                    Cars[i]=Cars[j];
                    Cars[j]=e;
                }
            }
        }
    }
@Override
    public String toString() {
        return "type='" + type + '\'' +", yearProduction=" + yearProduction + ", engineCapacity=" + engineCapacity;
    }
}

