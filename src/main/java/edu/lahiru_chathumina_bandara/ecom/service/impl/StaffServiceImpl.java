package edu.lahiru_chathumina_bandara.ecom.service.impl;

import edu.lahiru_chathumina_bandara.ecom.dto.Staff;
import edu.lahiru_chathumina_bandara.ecom.entity.StaffEntity;
import edu.lahiru_chathumina_bandara.ecom.repository.StaffRepository;
import edu.lahiru_chathumina_bandara.ecom.service.StafdService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StaffServiceImpl implements StafdService {
    final StaffRepository repository;
    final ModelMapper mapper;

    @Override
    public void addStaff(Staff staff) {
        repository.save(mapper.map(staff, StaffEntity.class));

    }

    @Override
    public List<Staff> getAll() {
        ArrayList<Staff> customerArrayList = new ArrayList<>();
        List<StaffEntity> all = repository.findAll();
        System.out.println(all);

        all.forEach(StaffEntity ->{
            customerArrayList.add(mapper.map(StaffEntity,Staff.class));
        });

        return customerArrayList;
    }

    @Override
    public void deleteStaff(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void updateStaff(Staff staff) {
        repository.save(mapper.map(staff, StaffEntity.class));

    }

    @Override
    public Staff searchById(Integer id) {
        return mapper.map(repository.findById(id), Staff.class);

    }
}
