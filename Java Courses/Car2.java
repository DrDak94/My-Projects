public class Car2 {
    
        String models;
        int years;
        Engine engine;

        Car2(String models, int years, String engineType){
            this.models = models;
            this.years = years;
            this.engine = new Engine(engineType);
        }

        void start(){
            this.engine.start();
            System.out.println("The " + this.models + " is running.");
        }
}
