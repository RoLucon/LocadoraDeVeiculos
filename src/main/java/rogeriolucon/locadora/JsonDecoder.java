/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import rogeriolucon.locadora.model.Brand;

/**
 *
 * @author Rogerio
 */
public class JsonDecoder {
    
    public static <T> List<T> fetch(String fileName, TypeReference<T> typeRef){
        List<T> list = null;
        try {
            
        ObjectMapper mapper = new ObjectMapper();

        list = (List<T>) mapper.readValue(Paths.get(fileName+".json").toFile(),typeRef);
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
