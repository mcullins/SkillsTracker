package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skillsTrackerList(){
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Possible Skills/Languages" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>Javascript</li>" +
                            "<li>Python</li>" +
                            "<li>Ruby</li>" +
                        "<ol>" +
                    "</body>" +
                "</html>";
    }
    @GetMapping(value="form")
    public String favSkillsForm(){
        return "<html>" +
                    "<body>" +
                        "<form method = 'post'>" +
                            "<h1>Name:</h1>" +
                            "<input type = 'text' name = 'name'>" +
                            "<h1>My favorite language</h1>" +
                            "<select name='lang1'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='python'>Python</option>" +
                                "<option value='ruby'>Ruby</option>" +
                            "</select>" +
                            "<h1>My second favorite language</h1>" +
                            "<select name='lang2'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='python'>Python</option>" +
                                "<option value='ruby'>Ruby</option>" +
                            "</select>" +
                            "<h1>My third favorite language</h1>" +
                            "<select name='lang3'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='python'>Python</option>" +
                                "<option value='ruby'>Ruby</option>" +
                            "</select>" +
                            "</br>" +
                            "<input type = 'submit' value='Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }
    @PostMapping(value="form")
    public String submittedForm(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        return "<html>" +
                    "<body>" +
                    "<h1>" + name + "</h1>" +
                    "<ol>" +
                        "<li>" + lang1 + "</li>" +
                        "<li>" + lang2 + "</li>" +
                        "<li>" + lang3 + "</li>" +
                    "</ol>" +
                    "</body>" +
                "</html>";

    }
}

