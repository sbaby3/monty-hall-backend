package com.baby.shon.montyhall.controller;

import com.baby.shon.montyhall.vo.GameResponse;
import com.baby.shon.montyhall.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class MontyHallController {

    @Autowired
    GameService gameService;

    @GetMapping("/getResults")
    public GameResponse getResults(@RequestParam("totalGames") int totalGames) {

        return gameService.runGames(totalGames);
    }
}
