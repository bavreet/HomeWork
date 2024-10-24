public class Movie {
    public int rateAMovie (int ratingheadLineActor, int numBadWords, int numFunnyScenes){
        int score = 0;
        if(ratingheadLineActor > 10){
            if(numBadWords > 50){
                if(numFunnyScenes > 10){
                    score++;
                }
            }else{
                score += 2;
            }
        }else if(numBadWords > 100){
            if(numFunnyScenes > 30)
                score--;
            else
                score += 10;
        }
        else if(numFunnyScenes < 10){
            if(numBadWords < 60)
                score += 10;
        }
        
        if(ratingheadLineActor > 50)
            score += 20;

        return score;
    }
}
