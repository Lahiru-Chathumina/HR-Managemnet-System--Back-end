package edu.lahiru_chathumina_bandara.ecom.service;

import edu.lahiru_chathumina_bandara.ecom.dto.Staff;

import java.util.List;

public interface StafdService {
    void addStaff(Staff staff);

    List<Staff> getAll();

    void deleteStaff(Integer id);

    void updateStaff(Staff staff);

    Staff searchById(Integer id);
}
