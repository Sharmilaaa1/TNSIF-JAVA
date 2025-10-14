package com.tnsif.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import com.tnsif.springproject.model.College;
import com.tnsif.springproject.service.CollegeService;
@RestController
public class CollegeController {
	@Autowired
       CollegeService cs;
       @PostMapping("/addCollege")
       public College addcol(@RequestBody College col ) {
    	   return cs.addcol(col);
       }   
       @GetMapping("/getCollege")
    	   public List<College>getCol()
    	   {
    		   return cs.getAllCol();
    	   }
       @GetMapping("/getCollege/{id}")
       public Optional<College> getCollegeById(@PathVariable Long id){
    	   return cs.getCollegeById(id);
       }
       //update
       @PutMapping("/updateCollege/{id}")
       public College updateCollege(@PathVariable Long id,@RequestBody College collegedetails) {
    	   return cs.updateCol(id,collegedetails);
       }
       @DeleteMapping("/delete/{id}")
    	public void delete(@PathVariable Long id) {
    	   cs.delete(id);
}
       //deleting all 
       @DeleteMapping("/delcollege")
        public void deleteAllColleges() {
    	   cs.deleteAllColleges();
       }
}