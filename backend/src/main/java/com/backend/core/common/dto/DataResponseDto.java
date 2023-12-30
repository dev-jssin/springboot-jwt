package com.backend.core.common.dto;

import com.backend.core.common.enums.StatusCode;
import lombok.Getter;

@Getter
public class DataResponseDto<T> extends ResponseDto {

    private final T data;

    private DataResponseDto(T data) {
        super(true, StatusCode.OK.getCode(), StatusCode.OK.getMessage());
        this.data = data;
    }

    private DataResponseDto(T data, String message) {
        super(true, StatusCode.OK.getCode(), message);
        this.data = data;
    }

    public static <T> DataResponseDto<T> of(T data) {
        return new DataResponseDto<>(data);
    }

    public static <T> DataResponseDto<T> of(T data, String message) {
        return new DataResponseDto<>(data, message);
    }

    public static <T> DataResponseDto<T> empty() {
        return new DataResponseDto<>(null);
    }
}
