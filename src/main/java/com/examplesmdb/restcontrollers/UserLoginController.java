package com.examplesmdb.restcontrollers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
@CrossOrigin(origins = "http://localhost:4200")
public class UserLoginController {

	/*@Autowired
	private UserRepositoryImpl userRepository;*/
	
	
	/*@RequestMapping(value="/login", method=RequestMethod.POST, consumes="application/json")
	public ResponseEntity<Map<String, Object>> doLogin(@RequestBody UserVO userRequest){
		
		Map<String, Object> response = new HashMap<>();
		HttpHeaders responseHeaders = new HttpHeaders();		   
		try {
			Integer validCredentials = 1;
			
			if(userRequest.getEmail() == null && userRequest.getUsername() == null){
				response.put("accionStatus", 0);
				response.put("errorMsg", "Not email or username received..");
				validCredentials = 0;
			}
			if(userRequest.getPassword() == null){
				response.put("accionStatus", 0);
				response.put("errorMsg", "Not password provided.");
				validCredentials = 0;
			}
			
			if(validCredentials > 0){
				
				UserDTO user = userRepository.findUserForLogin(userRequest.getUsername(), userRequest.getEmail(), userRequest.getPassword());
				
				if(user != null){
					response.put("accionStatus", 1);
					response.put("user", user);
				}else{
					response.put("accionStatus", 1);
					response.put("user", null);
				}
			}
			
			
		} catch (Exception e) {
			response.put("accionStatus", 0);
			response.put("errorMsg", e.getMessage());
		}		
		 return new ResponseEntity<Map<String, Object>>(response, responseHeaders, HttpStatus.OK);
	}*/
}
