package edu.lahiru_chathumina_bandara.ecom.service.impl;

import edu.lahiru_chathumina_bandara.ecom.dto.HR;
import edu.lahiru_chathumina_bandara.ecom.dto.Staff;
import edu.lahiru_chathumina_bandara.ecom.entity.HREntity;
import edu.lahiru_chathumina_bandara.ecom.entity.StaffEntity;
import edu.lahiru_chathumina_bandara.ecom.repository.HRRepository;
import edu.lahiru_chathumina_bandara.ecom.service.HRService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class HRserviceImpl implements HRService {
        final HRRepository repository;
        final ModelMapper mapper;

    @Override
    public void addHR(HR hr) {
        repository.save(mapper.map(hr, HREntity.class));

    }

    @Override
    public List<HR> getAll() {
        ArrayList<HR> HRList = new ArrayList<>();
        List<HREntity> all = repository.findAll();
        System.out.println(all);

        all.forEach(HREntity ->{
            HRList.add(mapper.map(HREntity,HR.class));
        });

        return HRList;
    }

    @Override
    public void deleteHR(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void updateHR(HR hr) {
        repository.save(mapper.map(hr, HREntity.class));

    }

    @Override
    public Staff searchById(Integer id) {
        return mapper.map(repository.findById(id), Staff.class);
    }
}
