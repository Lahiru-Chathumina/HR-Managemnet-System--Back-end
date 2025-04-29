package edu.lahiru_chathumina_bandara.ecom.service;

import edu.lahiru_chathumina_bandara.ecom.dto.HR;
import edu.lahiru_chathumina_bandara.ecom.dto.Staff;

import java.util.List;

public interface HRService {
    void addHR(HR hr);

    List<HR> getAll();

    void deleteHR(Integer id);

    void updateHR(HR hr);

    Staff searchById(Integer id);
}
