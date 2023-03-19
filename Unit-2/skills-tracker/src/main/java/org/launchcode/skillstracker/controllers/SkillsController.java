package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // add the controller annotation
@ResponseBody
public class SkillsController {

    // TODO 1: At localhost:8080, add text that states the three possible programming languages
    //  someone could be working on. You need to have an h1 with the title “Skills Tracker”, an h2,
    //  and an ol containing three programming languages of your choosing.

    // create a method to display the webpage body
    @GetMapping("/") // set route to default path
    public String displayHomePage(){
        return "<html>" +
                "<body>" +
                "<h1>Skill Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<li>SQL</li>" +
                "<li>R</li>" +
                "</ol>" +
                "<p>Click <a href='/form'>here</a> to select your favorites!</p>" + // link to form
                "</body>" +
                "</html>";
    }

    // TODO 2: At localhost:8080/form, add a form that lets the user enter their name and choose
    //  their favorite, second favorite, and third favorite programming languages on your list.
    //  Use select elements for each of the rankings. Just as with the exercises, we will use @GetMapping().

    @GetMapping("/form") // provide the route
    public String displaySkillsForm(){
        return "<html>" +
                "<body>" +
                "<form action='/results'>" + // the action tells it where to go; if we wanted to use post mapping we would set the method to post here and change the tag on the /results to post mapping
                "<br>" +
                "<label>Name:</label>" +
                "<br>" +
                "<input type='text' name='userName'/>" +
                "<br>" +
                "<label>My favorite language:</label>" +
                "<br>" +
                "<select name='fave1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='SQL'>SQL</option>" +
                "<option value='R'>R</option>" +
                "</select>" +
                "<br>" +
                "<label>My second favorite language:</label>" +
                "<br>" +
                "<select name='fave2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='SQL'>SQL</option>" +
                "<option value='R'>R</option>" +
                "</select>" +
                "<br>" +
                "<label>My third favorite language:</label>" +
                "<br>" +
                "<select name='fave3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='SQL'>SQL</option>" +
                "<option value='R'>R</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    // TODO 3: Also at localhost:8080/form, use @PostMapping and @RequestParam to update the HTML
    //  with an h1 stating the user’s name and an ol showing the three programming languages in
    //  the order they chose.

    // create a method to display the results
    @GetMapping("/results")
    public String skillsOutput(String userName, String fave1, String fave2, String fave3){
        return "<body>" +
                "<h1>" + userName + "'s Favorite Languages:</h1>" +
                "<ol>" +
                "<li>" + fave1 + "</li>" +
                "<li>" + fave2 + "</li>" +
                "<li>" + fave3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
