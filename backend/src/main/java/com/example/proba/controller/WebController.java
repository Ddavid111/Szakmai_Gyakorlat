package com.example.proba.controller;

import com.example.proba.entity.Titles;
import com.example.proba.service.*;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Controller
public class WebController {

    @Autowired
    private FilesService fileService;

    @Autowired
    private TitlesService titlesService;

    @Autowired
    private UsersService usersService;

    @Autowired
    private UserRolesService userRolesService;

    @Autowired
    private ReviewsService reviewsService;

    @Autowired
    private ThesesesService thesesesService;

    @Autowired
    private EmailSenderService emailSenderService;

    @GetMapping("/")
    public String showIndexPage()
    {
        return "index";
    }

    @GetMapping("/proba")
    public String showProbaPage()
    {
        usersService.testSelect();

        return "proba";
    }

    @PostMapping ("/proba")
    public String testForm(@RequestParam String name)
    {

     fileService.testInit(name, new Date(System.currentTimeMillis()));

        System.out.println(name);
      //  System.out.println(paramGackenden);
        return "proba";
    }
    @PostMapping ("/proba1")
    public String testFrom(@RequestParam String title,@RequestParam String birthday,
                           @RequestParam String email,
                           @RequestParam String familyName,
                           @RequestParam String firstName, @RequestParam String password) throws ParseException {
        System.out.println(birthday);
        Date temp = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
        titlesService.testInit(title);
   //     userRolesService.test_init(User_roles.Role.Hallgato);
        usersService.testInit(email,password,titlesService.findRoleIdByRoleName(title),firstName,familyName, LocalDate.of(temp.getYear(),temp.getMonth(),temp.getDay()));
        //usersService.testInit("asd","asd",1,"asd","asd",new Date(9999, Calendar.AUGUST, 23));
        return "proba";
    }
    @PostMapping ("/proba2")
    public String testFormZwei(@RequestParam String invitationDate,@RequestParam Integer score,
                           @RequestParam String description,
                           @RequestParam String city, @RequestParam String responseDate, @RequestParam String submissionDate) throws ParseException {

        System.out.println(invitationDate);
        Date temp =new SimpleDateFormat("yyyy-MM-dd").parse(invitationDate);
        System.out.println(responseDate);
        Date tempTwo =new SimpleDateFormat("yyyy-MM-dd").parse(responseDate);
        System.out.println(submissionDate);
        Date tempThree =new SimpleDateFormat("yyyy-MM-dd").parse(submissionDate);
        reviewsService.testInit(temp,score,description,city,false,tempTwo,tempThree);
        return "proba";
    }
    @PostMapping ("/proba3")
    public String testFormDrei(@RequestParam String title,@RequestParam String faculty,
                                @RequestParam String department,
                                @RequestParam String speciality, @RequestParam String language,
                                @RequestParam Integer defenseScore, @RequestParam Integer subjectScore, @RequestParam Integer finalScore) {
        thesesesService.testInit(title,faculty,department,speciality,language,defenseScore,subjectScore,finalScore);
        return "proba";
    }
    @GetMapping("/proba4")
    public String collection(){
        for (Titles titles : titlesService.collect()) {
            System.out.println(titles);
        }
        return "proba";
    }
    @PostMapping("/probaUpload")
    public String uploadFile(@RequestParam("file") MultipartFile file)
    {
        fileService.uploadFile(file);

        return "proba";

    }

    @PostMapping("/probaMessage")
    public String sendEmailMessage() throws MessagingException {
        this.emailSenderService.sendEmail("zalman2020201@gmail.com","Hello There","Remélhetőleg sikerült","D://num_feladatok.pdf");

        return "Message sent succesfull";




    }




}
