package com.Company.com.Staffs.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.Company.com.Staffs.exception.ResourceNotFoundException;
import com.Company.com.Staffs.model.Staff;
import com.Company.com.Staffs.repository.Staff_Repository;
import com.Company.com.Staffs.service.Staff_Service;

@Service
public class Staff_impl implements Staff_Service{


	private Staff_Repository staffrepo;


	public Staff_impl(Staff_Repository staffrepo) {
		super();
		this.staffrepo = staffrepo;
	}


	@Override
	public Staff savestaff(Staff staff) {

		return staffrepo.save(staff);
	}


	@Override
	public List<Staff> GetAllStaff() {
		
		List<Staff> allemployee=staffrepo.findAll();
		return allemployee;
	}


	@Override
	public Staff getById(long id) {
		Optional<Staff> staff=staffrepo.findById(id);

		if(staff.isPresent())

			return staff.get();

		else
		{
			throw new ResourceNotFoundException("Staff","id",id);
		}

	}

	@Override
	public Staff updatestaff(Staff staff, long id) {

		Staff existinfstaff=staffrepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Staff","Id",id));

		existinfstaff.setStaffname(staff.getStaffname());
		existinfstaff.setAddress(staff.getAddress());
		existinfstaff.setEmail(staff.getEmail());

	   staffrepo.save(existinfstaff) ;
	   
	   return existinfstaff;
	}


	@Override
	public String deletestaff(long id) {

		staffrepo.findById(id).orElseThrow(()
				-> new ResourceNotFoundException("Staff","Id",id));
		
		staffrepo.deleteById(id);
		
		return "deleted successfully";
		
		


	}






}
