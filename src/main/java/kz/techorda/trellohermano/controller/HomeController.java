package kz.techorda.trellohermano.controller;

import kz.techorda.trellohermano.repository.CommentsRep;
import kz.techorda.trellohermano.repository.FoldersRep;
import kz.techorda.trellohermano.repository.TaskCategoriesRep;
import kz.techorda.trellohermano.repository.TasksRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private TasksRep tasksrep;

    @Autowired
    private CommentsRep commentsRep;

    @Autowired
    private FoldersRep foldersRep;

    @Autowired
    private TaskCategoriesRep taskCategoriesRep;

    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("");
        return "index";
    }
}
