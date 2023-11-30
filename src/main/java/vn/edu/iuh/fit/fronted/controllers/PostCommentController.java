package vn.edu.iuh.fit.fronted.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comments")
public class PostCommentController {
    private final Logger logger = LoggerFactory.getLogger(PostCommentController.class);
    @GetMapping("/")
    public String index(){
        return "";
    }
}