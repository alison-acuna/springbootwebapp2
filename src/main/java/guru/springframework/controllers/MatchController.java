package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aacuna on 3/20/17.
 */
@Controller
public class MatchController {
    @RequestMapping("/match")
    String index(){
        return "match";
    }
}