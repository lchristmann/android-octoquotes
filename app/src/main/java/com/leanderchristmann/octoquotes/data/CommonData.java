package com.leanderchristmann.octoquotes.data;

import com.leanderchristmann.octoquotes.R;

public final class CommonData {

    //for size of random quote pool: calculate the total number of quotes by adding up the sizes of all quotes arrays (and its the number mainAct next to rand and search)
    private static int getTotalQuotesNumber() {
        return Attitude.getAttitudeListSize() + Happiness.getHappinessListSize() + Humor.getHumorListSize() + Inspiration.getInspirationListSize() +
                Love.getLoveListSize() + Motivation.getMotivationListSize() + Purpose.getPurposeListSize() + Success.getSuccessListSize() +
                Time.getTimeListSize() + Wisdom.getWisdomListSize() + Sports.getSportsListSize() + Nature.getNatureListSize() +
                Coding.getCodingListSize() + Short.getShortListSize() + Faith.getFaithListSize();
    }

    public static final int[] categoryIconsSnow = {
            //0
            R.drawable.x01_attitude_snow,
            //1
            R.drawable.x02_happiness_snow,
            //2
            R.drawable.x03_humor_snow,
            //3
            R.drawable.x04_inspiration_snow,
            //4
            R.drawable.x05_love_snow,
            //5
            R.drawable.x06_motivation_snow,
            //6
            R.drawable.x07_purpose_snow,
            //7
            R.drawable.x08_success_snow,
            //8
            R.drawable.x09_time_snow,
            //9and
            R.drawable.x10_wisdom_snow,
            //10
            R.drawable.x12_sports_snow,
            //11
            R.drawable.x17_nature_snow,
            //12
            R.drawable.x13_coding_snow,
            //13
            R.drawable.x14_short_snow,
            //14
            R.drawable.x15_cross_snow,
            //15
            R.drawable.x11_random_snow,
            //16
            R.drawable.x16_search_snow
    };

    public static final int[] categoryIconsJet = {
            //0
            R.drawable.x01_attitude_jet,
            //1
            R.drawable.x02_happiness_jet,
            //2
            R.drawable.x03_humor_jet,
            //3
            R.drawable.x04_inspiration_jet,
            //4
            R.drawable.x05_love_jet,
            //5
            R.drawable.x06_motivation_jet,
            //6
            R.drawable.x07_purpose_jet,
            //7
            R.drawable.x08_success_jet,
            //8
            R.drawable.x09_time_jet,
            //9
            R.drawable.x10_wisdom_jet,
            //10
            R.drawable.x12_sports_jet,
            //11
            R.drawable.x17_nature_jet,
            //12
            R.drawable.x13_coding_jet,
            //13
            R.drawable.x14_short_jet,
            //14
            R.drawable.x15_cross_jet,
            //15
            R.drawable.x11_random_jet,
            //16
            R.drawable.x16_search_jet
    };

    public static final String[] categoryNames = {
            //0
            "Attitude",
            //1
            "Happiness",
            //2
            "Humor",
            //3
            "Inspiration",
            //4
            "Love",
            //5
            "Motivation",
            //6
            "Purpose",
            //7
            "Success",
            //8
            "Time",
            //9
            "Wisdom",
            //10
            "Sports",
            //11
            "Nature",
            //12
            "Coding",
            //13
            "Short",
            //14
            "Faith",
            //15
            "Random",
            //16
            "Search"
    };

    public static final int[] categorySizes = {
            //0
            Attitude.getAttitudeListSize(),
            //1
            Happiness.getHappinessListSize(),
            //2
            Humor.getHumorListSize(),
            //3
            Inspiration.getInspirationListSize(),
            //4
            Love.getLoveListSize(),
            //5
            Motivation.getMotivationListSize(),
            //6
            Purpose.getPurposeListSize(),
            //7
            Success.getSuccessListSize(),
            //8
            Time.getTimeListSize(),
            //9
            Wisdom.getWisdomListSize(),
            //10
            Sports.getSportsListSize(),
            //11
            Nature.getNatureListSize(),
            //12
            Coding.getCodingListSize(),
            //13
            Short.getShortListSize(),
            //14
            Faith.getFaithListSize(),
            //15
            getTotalQuotesNumber(),
            //16
            getTotalQuotesNumber()
    };

    public static void shuffleAll() {
        Attitude.shuffle();
        Happiness.shuffle();
        Humor.shuffle();
        Inspiration.shuffle();
        Love.shuffle();
        Motivation.shuffle();
        Purpose.shuffle();
        Success.shuffle();
        Time.shuffle();
        Wisdom.shuffle();
        Sports.shuffle();
        Nature.shuffle();
        Coding.shuffle();
        Short.shuffle();
        Faith.shuffle();
    }
}
