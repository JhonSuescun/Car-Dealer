package model;

public class TechnicalReview extends Document
{
    //attributes
    private double gasLevelReleased;

    // builder
    public TechnicalReview(double gasLevelReleased)
    {
        this.gasLevelReleased = gasLevelReleased;
    }
}