package com.te.pcm.procatdto;

import com.te.pcm.procatentity.CategoriesEntity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OptionTypes {
private Integer optionTypeId;
private String optionTypeTitle;
private CategoriesEntity categoriesEntity; 
}
