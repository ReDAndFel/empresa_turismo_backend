package app.controllers;

import app.model.dtos.MessageDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/agencia")
@CrossOrigin(origins = "*")
public class AgenciaController {
    @PostMapping("url")
    public ResponseEntity<MessageDTO> ExampleFunction(@Valid @RequestBody String dto) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body( new MessageDTO(HttpStatus.OK, false, null /*funcion*/ ));
    }
}
