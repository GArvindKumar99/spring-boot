package com.te.pcm.procatdto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.te.pcm.procatentity.VariationsEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@Component
@AllArgsConstructor
@NoArgsConstructor

public class VariationTypesDto {
private int variationTypeId;
private String variationTypeTitle;
private int categoryId;

private List<VariationsEntity> list;

/*
 * public List<VariationsEntity> getList() { // TODO Auto-generated method stub
 * return list; }
 */


}
