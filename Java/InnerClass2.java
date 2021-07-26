package com.ust.examples;

class Car {
    String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }

// inner class
    class Engine {
        String engineType;
        void setEngine() {

           // Accessing the carType property of Car
            if(Car.this.carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            }else{
                this.engineType = "Bigger";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}

public class InnerClass2
{
    public static void main(String[] args) {

// create an object of the outer class Car
   Car car1=new Car("mazda","bmw");
   Car.Engine engine=car1.new Engine();
   engine.setEngine();
   System.out.println(engine.getEngineType());
   
   Car car2=new Car("crysler","4wd");
   Car.Engine engines=car2.new Engine();
   engines.setEngine();
   System.out.println(engines.getEngineType());
    }
}
	 