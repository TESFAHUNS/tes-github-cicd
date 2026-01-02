package com.tes.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TesGithubCicdActionsApplication {
    @GetMapping("/welcome")
    public String Welcome(){
        return "Welcome to test git repository";
    }
    public static void main(String[] args) {
        SpringApplication.run(TesGithubCicdActionsApplication.class, args);
    }

}


//echo "# tes-github-cicd" >> README.mdgig
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/TESFAHUNS/tes-github-cicd.git
//git push -u origin main