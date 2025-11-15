package com.pixelacademy.securitu_project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MagicRestController {

@Value("${wizard.name}")
    private String wizardName;

@Value("${wizard.house}")
    private String wizardHouse;

@Value("${wizard.spell}")
    private String wizardSpell;

@GetMapping("/team")
    public String getTeamInfo() {
    return      "Wizard name:  " + wizardName +
            "<br>Wizard house: " + wizardHouse +
            "<br>Wizard spell: " + wizardSpell;
}
}
