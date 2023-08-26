package com.baby.shon.vo;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class GameResponse {
    private int totalGames;
    private int winsWithoutSwitching;
    private int winsWithSwitching;
}
