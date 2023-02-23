package top.xhq.pan.file.controller;

import io.github.flashvayne.chatgpt.service.ChatgptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xhq
 * @version 1.0
 * @description Create by 2023/2/23 10:34
 */
@RestController
@RequestMapping("/")
public class ChatGPTController {
    @Autowired
    private ChatgptService chatgptService;

    @CrossOrigin
    @PostMapping("/chatgpt")
    public String getResult(@RequestBody String question){
        String result = chatgptService.sendMessage(question);
        return result;
    }
}
