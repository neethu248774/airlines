package com.ust.air_lines;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JsonDataController {

	@Autowired
	private JsonDataService jds;

 

    @GetMapping("/fetch-json")
    public ResponseEntity<String> fetchJSONData() throws IOException {
        // Read the JSON file from the classpath (assuming it's in src/main/resources)
//        Resource resource = new ClassPathResource("./").getFile();
//        byte[] jsonBytes = Files.readAllBytes(Paths.get(resource.getURI()));
//
//        // Convert the bytes to a string
//        String jsonData = new String(jsonBytes, StandardCharsets.UTF_8);
//
//        // Return the JSON data as a response

 

    	
//    	Resource resource = new ClassPathResource("/main/resources/json/airlinesdb1.json");
//
//    	File file = resource.getFile();
//    	String content = new String(Files.readAllBytes(file.toPath()));
//    	System.out.println(content);
//    	return ResponseEntity.ok(content);
//    	

    	return ResponseEntity.ok(jds.readJsonFromFileSystem("src/main/resources/json/airlinesdb.json"));
    }


}
