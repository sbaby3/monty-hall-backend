package com.baby.shon.controller;

import com.baby.shon.service.GameService;
import com.baby.shon.vo.GameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MontyHallController {

    @Autowired
    GameService gameService;

    @GetMapping("/getResults")
    public GameResponse getResults(@RequestParam("totalGames") int totalGames) {

        return gameService.runGames(totalGames);
    }
}
