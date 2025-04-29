package edu.lahiru_chathumina_bandara.ecom.service.impl;

import edu.lahiru_chathumina_bandara.ecom.dto.Staff;
import edu.lahiru_chathumina_bandara.ecom.service.StafdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StaffServiceImpl implements StafdService {

    final StafdService service;

    @Override
    public void addStaff(Staff staff) {

    }

    @Override
    public List<Staff> getAll() {
        return List.of();
    }

    @Override
    public void deleteStaff(Integer id) {

    }

    @Override
    public void updateStaff(Staff staff) {

    }

    @Override
    public Staff searchById(Integer id) {
        return null;
    }
}
