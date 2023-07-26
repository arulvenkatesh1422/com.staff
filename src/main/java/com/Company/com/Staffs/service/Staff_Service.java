package com.Company.com.Staffs.service;
import java.util.*;

import com.Company.com.Staffs.model.Staff;
public interface Staff_Service {
	
Staff savestaff(Staff staff);	
List<Staff> GetAllStaff();
Staff getById(long id);
Staff updatestaff(Staff staff,long id);
String deletestaff(long id);


}
