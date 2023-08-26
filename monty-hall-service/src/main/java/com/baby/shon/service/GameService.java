package com.baby.shon.service;

import com.baby.shon.vo.GameResponse;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {
    public int totalGames = 0;
    public int safeDoor;
    public int winsWithoutSwitching = 0;
    public int winsWithSwitching = 0;
    public Random randomNumberGenerator = new Random();

    public GameService() {
        this.safeDoor = randomNumberGenerator.nextInt(1, 4);
    }

    public void runGame() {
        totalGames++;
        this.safeDoor = randomNumberGenerator.nextInt(1, 4);
        int originalChoice = randomNumberGenerator.nextInt(1, 4);
        if (originalChoice == safeDoor) {
            winsWithoutSwitching++;
        }
        else {
            winsWithSwitching++;
        }
    }

    public GameResponse runGames(int totalRuns) {
        resetStats();
        for (int i = 0; i < totalRuns; i++) {
            runGame();
        }
        return getGameStats();
    }

    public void resetStats() {
        this.totalGames = 0;
        this.winsWithSwitching = 0;
        this.winsWithoutSwitching = 0;
    }

    public GameResponse getGameStats() {
        GameResponse gameResponse = new GameResponse();
        gameResponse.setTotalGames(this.totalGames);
        gameResponse.setWinsWithoutSwitching(this.winsWithoutSwitching);
        gameResponse.setWinsWithSwitching(this.winsWithSwitching);
        return gameResponse;
    }

}
