package com.baby.shon.montyhall.vo;

import lombok.Data;

@Data
public class GameResponse {
    private int totalGamesResult;
    private int winsWithoutSwitching;
    private int winsWithSwitching;
}
