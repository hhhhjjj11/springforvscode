package springforvscode.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    
        public int exactSum() throws IOException {
        ClassPathResource resource = new ClassPathResource("file/info.csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
        
        String line ;
        int result = 0;
        while ((line = br.readLine()) != null){
            String[] arr = line.split(",");
            result += Integer.parseInt(arr[1]);
        };

        return result;
    };
}
