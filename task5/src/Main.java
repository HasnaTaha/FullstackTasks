import com.vehiclesSystem.config.Config;
import com.vehiclesSystem.controller.BikeController;
import com.vehiclesSystem.controller.CarController;
import com.vehiclesSystem.controller.PlaneController;
import com.vehiclesSystem.models.Bike;
import com.vehiclesSystem.models.Car;
import com.vehiclesSystem.models.Plane;
import com.vehiclesSystem.models.Type;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        BikeController bikeController = (BikeController) context.getBean("bikeController");
        bikeController.saveVehicle(new Bike("1", "brand zzz", new Type()));

        CarController carController = (CarController) context.getBean("carController");
        carController.saveVehicle(new Car("1", "brand carz", new Type()));

        PlaneController planeController = (PlaneController) context.getBean("planeController");
        planeController.saveVehicle(new Plane("1", "brand plane z", new Type()));
    }
}