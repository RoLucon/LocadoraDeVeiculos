/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora;


import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import rogeriolucon.locadora.model.Brand;
import rogeriolucon.locadora.service.VehicleService;

/**
 *
 * @author rolucon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException, Exception {
//        List<Brand> list = FipeApi.fetchData("/marcas.json");
//        List<Brand> list = (List<Brand>) JsonDecoder.fetch("Brands", (TypeReference) new TypeReference<List<Brand>>(){});
//        
//        for (Object brand : list) {
//            if(brand instanceof Brand){
//                System.out.println("Yes");
//            }else {
//                System.out.println(brand.getClass());
//            }
//        }
          new VehicleService();
//        list.forEach(System.out::println);
    }
    
}
