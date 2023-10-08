package dev.achilles.WhatsappWebhook.Controller;


import dev.achilles.WhatsappWebhook.HookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class WebHookController {

    @PostMapping("/api/")
    public ResponseEntity Post(@RequestBody HookData Data) {
        System.out.println(Data);
        return ResponseEntity.ok("");
    }

    @GetMapping("/api/")
    public ResponseEntity GetMap() {
        return new ResponseEntity<String>("Working!",  HttpStatus.OK);
    }
}
