/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;
import rogeriolucon.locadora.FipeApi;
import rogeriolucon.locadora.JsonDecoder;
import rogeriolucon.locadora.model.Brand;
import rogeriolucon.locadora.model.Model;

/**
 *
 * @author Rogerio
 */
public class VehicleService {
    private Map<String, Brand> brands;
    private Map<Integer, List<Model>> models = new HashMap<>();
    
    
    public VehicleService() {
        try{
        List<Brand> b = (List<Brand>) JsonDecoder.fetch("Brands", (TypeReference) new TypeReference<List<Brand>>(){});
        
        this.brands = b.stream()
            .collect(Collectors.toMap(Brand::getName, brand -> brand));
        
//        for (Map.Entry<Integer,List<Model>> pair : models.entrySet()) {
//            System.out.println(pair.getKey());
//            for (Model elem : pair.getValue()) {
//                System.out.println(elem.getName()); 
//           }
//        }
        } catch(Exception ex){
            System.out.println("Erro VSERVICE");
        }
    }
    
    private void addModelsByBrandId(Integer id) throws Exception{
        List<Model> m = (List<Model>) FipeApi.fetchData("/veiculos/"+id+".json", (TypeReference) new TypeReference<List<Model>>(){});
        
        models.put(id, m);
    }
    
    public List<Model> getModelByBrandName(String name)throws Exception{
        Integer id = brands.get(name).getId();
        
        if(!models.containsKey(id)){
            addModelsByBrandId(id);
            System.out.println("Add Nova marca");
        } 
        return models.get(id);
    }
    
    public List<String> getBrandNames(){
        List<String> aux = brands.entrySet().stream()
                .map(b -> b.getValue()
                .getName()).collect(Collectors.toList());

        Collections.sort(aux);
        return aux;
    }
    
//    public void teste(){
//         for (Map.Entry<String,Brand> pair : brands.entrySet()) {
//            List<Model> aux = m.stream()
//                    .filter(e -> e.getMarca() == pair.getValue().getName())
//            .collect(Collectors.toList());
//            models.put(pair.getValue().getId(), aux);
//        }
//        
//          for (Map.Entry<Integer, List<Model>> pair : models.entrySet()) {
//            System.out.println(pair.getKey());
//              for (Model elem : pair.getValue()) {
//                    System.out.println(elem.getName());
//              }
//        }
//    }
}
