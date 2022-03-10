/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theunnamedstockgame;

import java.math.BigDecimal;

/**
 *
 * @author lexis
 */
public class Stock {
    
    public final static int TREND_NORMAL = 1;
    public final static int TREND_RANDOM = 2;
    public final static int TREND_SEASONAL = 3;
    public final static int TREND_TREND = 4;
    public final static int TREND_GRADUAL_RISE = 5;
    public final static int TREND_GRADUAL_FALL = 6;
    public final static int TREND_SHARP_RISE = 7;
    public final static int TREND_SHARP_FALL = 8;
    
    public final static int SEASON_SUMMER = 1;
    public final static int SEASON_WINTER = 2; 
    
    public final String stockName; //Name of the stock
    private final int trendTypePrimary; //how the stock should naturally move
    private final int trendTypeFlux; //If the stock trend is in flux 
    private int trendFluxLength; //number of units of time the flux trend will last for
    private int seasonTrend; //For seasonal trends the season type
    
    private BigDecimal currentValue;
    
}
