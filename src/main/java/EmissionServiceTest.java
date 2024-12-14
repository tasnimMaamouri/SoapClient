
import com.mycompany.emissionserviceclient.Emission;
import com.mycompany.emissionserviceclient.EmissionService;
import com.mycompany.emissionserviceclient.EmissionService_Service;
import com.mycompany.emissionserviceclient.GetEmissionsByRegion;
import com.mycompany.emissionserviceclient.GetEmissionsByRegionResponse;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tassm
 */
public class EmissionServiceTest {
    public static void main(String[] args) {
        try {
            EmissionService_Service service = new EmissionService_Service();
            
            EmissionService emissionServicePort = service.getEmissionServicePort(); // Explicitly declare the type
            
            GetEmissionsByRegion request = new GetEmissionsByRegion();
            

            List<Emission> result = new ArrayList<>();

            result = emissionServicePort.getEmissionsByRegion("Italy");
            

            for (Emission emission : result) {
                System.out.println("sector: "+emission.getSector()+" /region: "+emission.getRegion()+" /co2Emissions: "+emission.getCo2Emissions()); // This will now use the overridden toString method
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
