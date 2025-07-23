package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

@RestController
@RequestMapping("/api/qr")
@PreAuthorize("hasAnyRole('ROLE_BENHNHAN', 'ROLE_LETAN')")
public class QRCodeController {

    @GetMapping("/generate")
    public ResponseEntity<byte[]> generateQRCode(@RequestParam String text) {
        try {
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix matrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, 200, 200);

            ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(matrix, "PNG", pngOutputStream);
            byte[] pngData = pngOutputStream.toByteArray();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_PNG);
            headers.setContentLength(pngData.length);

            Path path = FileSystems.getDefault().getPath("src/main/resources/static/qrcode.png");
            MatrixToImageWriter.writeToPath(matrix, "PNG", path);

            return ResponseEntity.ok()
                    .headers(headers)
                    .body(pngData);

        } catch (WriterException | IOException e) {
            return ResponseEntity.status(500).build();
        }
    }
}