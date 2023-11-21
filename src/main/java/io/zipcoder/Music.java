package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int countUp = getCountUp(startIndex, selection);
        int countDown = getCountDown(startIndex, selection);
        if (countUp < countDown) {
            return countUp;
        } else {
            return countDown;
        }
    }

    private int getCountDown(Integer startIndex, String selection) {
        int countDown = 0;
        for (int i = startIndex; i >= 0; i--) {
            if (!playList[i].equals(selection)) {
                if (i == 0) {
                    for (int j = playList.length - 1; j > startIndex; j--){
                     if (!playList[j].equals(selection)) {
                         countDown++;
                         //System.out.println(countDown + " before zero");
                     }
                    }
                } else {
                    countDown++;
                    //System.out.println(countDown);
                }
            }
        }
        System.out.println("total countdown "+countDown);
        return countDown;
    }

    private int getCountUp(Integer startIndex, String selection) {
        int countUp = 0;
        for (int i = startIndex; i < playList.length; i++) {
            if (!playList[i].equals(selection)) {
                countUp++;
            }
        }
        System.out.println("total countup " +countUp);
        return countUp;
    }
}
