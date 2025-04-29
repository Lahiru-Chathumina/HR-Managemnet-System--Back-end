package edu.lahiru_chathumina_bandara.ecom.controller;

import edu.lahiru_chathumina_bandara.ecom.dto.HR;
import edu.lahiru_chathumina_bandara.ecom.dto.Staff;
import edu.lahiru_chathumina_bandara.ecom.service.HRService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Hr")
@RequiredArgsConstructor
public class HrController {

    final HRService service;


    @PostMapping("/add")
    public void addHR(@RequestBody HR hr){
        service.addHR(hr);

    }

    @GetMapping("/get-all")
    public List<HR> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteaHR(@PathVariable Integer id){
        service.deleteHR(id);
    }

    @PutMapping("/update")
    public void updateHR(@RequestBody HR hr){
        service.updateHR(hr);
    }

    @GetMapping("/search-by-id/{id}")
    public Staff searchByIdearchById(@PathVariable Integer id){
        return service.searchById(id);
    }
}
