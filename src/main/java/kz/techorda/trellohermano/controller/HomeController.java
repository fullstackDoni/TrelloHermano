package kz.techorda.trellohermano.controller;

import kz.techorda.trellohermano.model.Tasks;
import kz.techorda.trellohermano.repository.CommentsRepository;
import kz.techorda.trellohermano.repository.FoldersRepository;
import kz.techorda.trellohermano.repository.TaskCategoriesRepository;
import kz.techorda.trellohermano.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private TasksRepository tasksRepository;

    @Autowired
    private CommentsRepository commentsRepository;

    @Autowired
    private FoldersRepository foldersRepository;

    @Autowired
    private TaskCategoriesRepository taskCategoriesRepository;

    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("");
        return "index";
    }

    @PostMapping(value = "/addtask")
    public String addtask(Tasks tasks){

        return "redirect:/";
    }
}
