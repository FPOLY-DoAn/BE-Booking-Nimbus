package com.BE_FPoly_DoAn.DOAN.DTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GmailDTO {
    private String name;
    private String email;
    private String phone;
    private String subject;
    private String message;

    public GmailDTO(String name, String subject, String phone, String email, String message) {
        this.name = name;
        this.subject = subject;
        this.phone = phone;
        this.email = email;
        this.message = message;
    }
}
