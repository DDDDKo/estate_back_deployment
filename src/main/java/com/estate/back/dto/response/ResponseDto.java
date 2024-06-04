package com.estate.back.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;

// 200 성공 / SU Success.
// 400 필수 데이터 미입력 / VF Varidation Failed.
// 400 중복된 아이디 / DI Duplicated Id.
// 400 중복된 이메일 / DE Duplicated Email.
// 400 불일치 보드 / NB No Exist Board.
// 401 로그인 정보 불일치 / SF Sign in Failed.
// 401 인증 실패 / AF Authentication Failed.
// 500 토큰 생성 실패 / TF Token creation Failed.
// 500 이메일 전송 실패 / MF Mail send Failed.
// 500 데이터베이스 오류 / DBE Database Error.

// Response의 공통 형태
@Getter
@AllArgsConstructor
public class ResponseDto {
    private String code;
    private String message;

    public static ResponseEntity<ResponseDto> success () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    };

    public static ResponseEntity<ResponseDto> validationFailed () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.VARIDATION_FAILED, ResponseMessage.VARIDATION_FAILED);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    public static ResponseEntity<ResponseDto> duplicatedEmail () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.DUPLICATED_EMAIL, ResponseMessage.DUPLICATED_EMAIL);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    };

    public static ResponseEntity<ResponseDto> noExistBoard () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.NO_EXIST_BOARD, ResponseMessage.NO_EXIST_BOARD);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    };

    public static ResponseEntity<ResponseDto> writtenComment () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.WRITTEN_COMMENT, ResponseMessage.WRITTEN_COMMENT);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    };

    public static ResponseEntity<ResponseDto> duplicatedId () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.DUPLICATED_ID, ResponseMessage.DUPLICATED_ID);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    };

    public static ResponseEntity<ResponseDto> signInFailed () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.SIGN_IN_FAILED, ResponseMessage.SIGN_IN_FAILED);
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseBody);
    };

    public static ResponseEntity<ResponseDto> authenticationFailed () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.AUTHENTICATION_FAILED, ResponseMessage.AUTHENTICATION_FAILED);
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseBody);
    };

    public static ResponseEntity<ResponseDto> authorizationFailed () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.AUTHORIZATION_FAILED, ResponseMessage.AUTHORIZATION_FAILED);
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(responseBody);
    };

    public static ResponseEntity<ResponseDto> notFound () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.NOT_FOUND, ResponseMessage.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseBody);
    };

    public static ResponseEntity<ResponseDto> TokenCreationFailed () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.TOKEN_CREATION_FAILED, ResponseMessage.TOKEN_CREATION_FAILED);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
    };

    public static ResponseEntity<ResponseDto> mailSendFailed () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.MAIL_SEND_FAILED, ResponseMessage.MAIL_SEND_FAILED);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
    };

    public static ResponseEntity<ResponseDto> databaseError () {
        ResponseDto responseBody = new ResponseDto(ResponseCode.DATABASE_ERROR, ResponseMessage.DATABASE_ERROR);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
    };
    
}
