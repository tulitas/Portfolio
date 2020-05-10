package Portfolio.Applications.Calendar.Controllers;

import Portfolio.Applications.Calendar.Entities.Jobform;
import Portfolio.Applications.Calendar.Services.JobformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class JobformController {
    private JobformService jobformService;

    @Autowired
    public JobformController(JobformService jobformService) {
        this.jobformService = jobformService;
    }
    @RequestMapping(value = "added", method = RequestMethod.POST)
    public String addNew(@Valid Jobform jobform, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "calendar/add-new";
        }
        jobformService.addNewJobform(jobform);
        model.addAttribute("jobforms", jobform);
        return "calendar/added";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        System.out.println("edit");
        List<Jobform> jobFormList = jobformService.findById(id);
        model.addAttribute("jobform", jobFormList);
        return "calendar/edit";
    }
    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
    public String updateUser(@PathVariable("id") long id, @Valid Jobform jobForm, BindingResult result, Model model) {
        System.out.println("33");
        jobformService.addNewJobform(jobForm);
        model.addAttribute("users", jobformService.findById(id));
        return "calendar/add-new";
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String deleteJobform(@PathVariable("id") long id) {
        jobformService.delete(id);
        System.out.println("deleted " + id);
        return "calendar/calendar";
    }
//    @PostMapping("/update/{id}")
//    public String updateUser(@PathVariable("id") long id, @Valid Jobform jobform,
//                             BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            jobform.setId(id);
//            return "update-user";
//        }
//
//        jobformService.addNewJobform(jobform);
//        model.addAttribute("users", jobformService.findAll());
//        return "index";
//    }

//    @GetMapping("/delte/{id}")
//    public String deleteJobform(@PathVariable("id") long id, Model model) {
//        Jobform jobform = (Jobform) jobformService.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("Invalid form id: " + id));
//        jobformService.delete(jobform);
//        model.addAttribute("jobforms", jobformService.findAll());
//        return "calendar/calendar";
//    }
}
