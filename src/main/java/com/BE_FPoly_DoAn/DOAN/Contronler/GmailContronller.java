package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.GmailDTO;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.MailConfig;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class GmailContronller {

     private MailConfig mailConfig;

     public GmailContronller(MailConfig mailConfig) {
          this.mailConfig = mailConfig;
     }

     @PostMapping("/send-mail")
     public ResponseEntity<?> sendMail(@RequestBody GmailDTO sendGmail ){
         try {
             mailConfig.sendTo("dai582005@gmail.com", sendGmail.getEmail(), sendGmail.getSubject(), sendGmail.getMessage());
               return ResponseEntity.ok("Đã gửi mail thành công");
         } catch (Exception e) {
             throw new RuntimeException(e);
         }
     }
}
