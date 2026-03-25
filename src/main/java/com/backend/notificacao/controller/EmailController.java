package com.backend.notificacao.controller;

import com.backend.notificacao.business.EmailSevice;
import com.backend.notificacao.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailSevice emailSevice;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDTO dto){
        emailSevice.enviarEmail(dto);

        return ResponseEntity.ok().build();
    }
}
