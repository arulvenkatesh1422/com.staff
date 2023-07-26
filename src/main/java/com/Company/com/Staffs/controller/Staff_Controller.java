package com.Company.com.Staffs.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Company.com.Staffs.model.Staff;
import com.Company.com.Staffs.service.Staff_Service;

@RestController()
@RequestMapping("/")
public class Staff_Controller {
	
	private Staff_Service Staffservice;

	public Staff_Controller(Staff_Service staffservice) {
		super();
		Staffservice = staffservice;
	}
		
	@PostMapping("/save")
	public ResponseEntity<Staff> savestaff(@RequestBody  Staff  staff)
	{ 
		return new ResponseEntity<Staff> (Staffservice.savestaff(staff),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/list")
	List<Staff> GetAllStaff()

	{
		return Staffservice.GetAllStaff();
		
		
		/* Hardcoded value
		List<Staff> st=new ArrayList<>();
		st.add(new Staff("chennai","ayay@gmail","beem"));
		return st;*/
	}

	@GetMapping("{id}")
	public ResponseEntity<Staff> getById(@PathVariable long  id) 
	{
		return new ResponseEntity<Staff> (Staffservice.getById(id),HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Staff> updatestaff(@PathVariable("id") long id ,@RequestBody Staff staff)
	
	{
		return new ResponseEntity<Staff>(Staffservice.updatestaff(staff, id),HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletestaff(@PathVariable("id") long  id)
	
	{
		Staffservice.deletestaff(id);
		return new ResponseEntity<String>("Delete Successfully.",HttpStatus.NO_CONTENT);
	}
	
	
	
    }
		
	
	
	
		
	
	
	

	

	

