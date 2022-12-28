package com.te.pcm.procatdto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Component
@NoArgsConstructor
public class AppResponse {
private String message;
private String status;
private Object data;
}
