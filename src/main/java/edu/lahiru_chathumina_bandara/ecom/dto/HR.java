package edu.lahiru_chathumina_bandara.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HR {
    private Integer id;
    private String name;
    private String address;
    private Double salary;
}
