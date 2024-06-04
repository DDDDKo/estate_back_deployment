package com.estate.back.service;

import org.springframework.http.ResponseEntity;

import com.estate.back.dto.response.estate.GetLocalDataResponseDto;
import com.estate.back.dto.response.estate.GetRatioDataResponseDto;

public interface EstateService {

    ResponseEntity<? super GetLocalDataResponseDto> getLocalData (String Local);
    ResponseEntity<? super GetRatioDataResponseDto> getRatioData (String Local);
}
