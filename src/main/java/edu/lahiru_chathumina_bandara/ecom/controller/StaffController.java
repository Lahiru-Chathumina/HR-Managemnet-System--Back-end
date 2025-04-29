package edu.lahiru_chathumina_bandara.ecom.controller;

import edu.lahiru_chathumina_bandara.ecom.dto.Staff;
import edu.lahiru_chathumina_bandara.ecom.service.StafdService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Staff")
@RequiredArgsConstructor
@CrossOrigin
public class StaffController {

//    http://localhost:8080/Staff/add


   final StafdService service;

   @PostMapping("/add")
   public void addStaff(@RequestBody Staff staff){
       service.addStaff(staff);

   }

    @GetMapping("/get-all")
    public List<Staff> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStaff(@PathVariable Integer id){
        service.deleteStaff(id);
    }

    @PutMapping("/update")
    public void updateStaff(@RequestBody Staff staff){
        service.updateStaff(staff);
    }

    @GetMapping("/search-by-id/{id}")
    public Staff searchByIdearchById(@PathVariable Integer id){
        return service.searchById(id);
    }

}
