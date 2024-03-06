package com.leanderchristmann.octoquotes.data;

import java.util.Arrays;

public final class SearchAlgorithm {

    private static final String[][][] DATA_TO_BE_SEARCHED = {
            Attitude.getAttitudeTags(),
            Happiness.getHappinessTags(),
            Humor.getHumorTags(),
            Inspiration.getInspirationTags(),
            Love.getLoveTags(),
            Motivation.getMotivationTags(),
            Purpose.getPurposeTags(),
            Success.getSuccessTags(),
            Time.getTimeTags(),
            Wisdom.getWisdomTags(),
            Sports.getSportsTags(),
            Nature.getNatureTags(),
            Coding.getCodingTags(),
            Short.getShortTags(),
            Faith.getFaithTags()
    };

    public static int searchNumberOfMatches(String[] inputArray) {

        int count = 0;
        boolean allArrayElementsFound;

        //goes through each category's 2-dimensional tags array
        for (String[][] tagsOfOneCategory : DATA_TO_BE_SEARCHED) {
            //in that 2-dimensional array of each category, go through 1-dimensional array (tags for ONE quote) and check if it contains every String of the input Array
            for(String[] tagsOfOneQuote: tagsOfOneCategory) {
                allArrayElementsFound = true;
                //check if all elements of inputArray (this inner for-loop) are contained in array of tags
                for (String s : inputArray) {
                    if (!Arrays.asList(tagsOfOneQuote).contains(s)) {
                        allArrayElementsFound = false;
                        break;
                    }
                }
                if (allArrayElementsFound)
                    count++;
            }
        }

        return count;
    }

    public static String[][] getMatchesArray(String[] searchArray, int arrayLength) {

        //returns: [quotesArray]+[authorArray] to set on ListView - [categoryArray]+[positionsArray] to pass with intent to SearchQuoteActivity (category+position uniquely identifies & its required for setting the Icon, and the FavoritesList stuff)
        String[][] resultArray = new String[4][];
        resultArray[0] = new String[arrayLength];      //quote text
        resultArray[1] = new String[arrayLength];      //author text
        resultArray[2] = new String[arrayLength];      //category
        resultArray[3] = new String[arrayLength];      //position
        int arrayPositionCount = 0;
        boolean allArrayElementsFound;

        //same strucutre as reading, but here we have count which category it is (fori->i) so we can get the right quote,author and give category in switch-case below
        for (int i = 0; i < DATA_TO_BE_SEARCHED.length; i++) {
            for (int j = 0; j < DATA_TO_BE_SEARCHED[i].length; j++) {
                allArrayElementsFound = true;
                for (String s : searchArray) {
                    if (!Arrays.asList(DATA_TO_BE_SEARCHED[i][j]).contains(s)) {
                        allArrayElementsFound = false;
                        break;
                    }
                }
                if (allArrayElementsFound) {
                    switch (i){
                        case 0:
                            resultArray[0][arrayPositionCount] = Attitude.getAttitudeQuote(j);
                            resultArray[1][arrayPositionCount] = Attitude.getAttitudeAuthor(j);
                            resultArray[2][arrayPositionCount] = "Attitude";
                            break;
                        case 1:
                            resultArray[0][arrayPositionCount] = Happiness.getHappinessQuote(j);
                            resultArray[1][arrayPositionCount] = Happiness.getHappinessAuthor(j);
                            resultArray[2][arrayPositionCount] = "Happiness";
                            break;
                        case 2:
                            resultArray[0][arrayPositionCount] = Humor.getHumorQuote(j);
                            resultArray[1][arrayPositionCount] = Humor.getHumorAuthor(j);
                            resultArray[2][arrayPositionCount] = "Humor";
                            break;
                        case 3:
                            resultArray[0][arrayPositionCount] = Inspiration.getInspirationQuote(j);
                            resultArray[1][arrayPositionCount] = Inspiration.getInspirationAuthor(j);
                            resultArray[2][arrayPositionCount] = "Inspiration";
                            break;
                        case 4:
                            resultArray[0][arrayPositionCount] = Love.getLoveQuote(j);
                            resultArray[1][arrayPositionCount] = Love.getLoveAuthor(j);
                            resultArray[2][arrayPositionCount] = "Love";
                            break;
                        case 5:
                            resultArray[0][arrayPositionCount] = Motivation.getMotivationQuote(j);
                            resultArray[1][arrayPositionCount] = Motivation.getMotivationAuthor(j);
                            resultArray[2][arrayPositionCount] = "Motivation";
                            break;
                        case 6:
                            resultArray[0][arrayPositionCount] = Purpose.getPurposeQuote(j);
                            resultArray[1][arrayPositionCount] = Purpose.getPurposeAuthor(j);
                            resultArray[2][arrayPositionCount] = "Purpose";
                            break;
                        case 7:
                            resultArray[0][arrayPositionCount] = Success.getSuccessQuote(j);
                            resultArray[1][arrayPositionCount] = Success.getSuccessAuthor(j);
                            resultArray[2][arrayPositionCount] = "Success";
                            break;
                        case 8:
                            resultArray[0][arrayPositionCount] = Time.getTimeQuote(j);
                            resultArray[1][arrayPositionCount] = Time.getTimeAuthor(j);
                            resultArray[2][arrayPositionCount] = "Time";
                            break;
                        case 9:
                            resultArray[0][arrayPositionCount] = Wisdom.getWisdomQuote(j);
                            resultArray[1][arrayPositionCount] = Wisdom.getWisdomAuthor(j);
                            resultArray[2][arrayPositionCount] = "Wisdom";
                            break;
                        case 10:
                            resultArray[0][arrayPositionCount] = Sports.getSportsQuote(j);
                            resultArray[1][arrayPositionCount] = Sports.getSportsAuthor(j);
                            resultArray[2][arrayPositionCount] = "Sports";
                            break;
                        case 11:
                            resultArray[0][arrayPositionCount] = Nature.getNatureQuote(j);
                            resultArray[1][arrayPositionCount] = Nature.getNatureAuthor(j);
                            resultArray[2][arrayPositionCount] = "Nature";
                            break;
                        case 12:
                            resultArray[0][arrayPositionCount] = Coding.getCodingQuote(j);
                            resultArray[1][arrayPositionCount] = Coding.getCodingAuthor(j);
                            resultArray[2][arrayPositionCount] = "Coding";
                            break;
                        case 13:
                            resultArray[0][arrayPositionCount] = Short.getShortQuote(j);
                            resultArray[1][arrayPositionCount] = Short.getShortAuthor(j);
                            resultArray[2][arrayPositionCount] = "Short";
                            break;
                        case 14:
                            resultArray[0][arrayPositionCount] = Faith.getFaithQuote(j);
                            resultArray[1][arrayPositionCount] = Faith.getFaithAuthor(j);
                            resultArray[2][arrayPositionCount] = "Faith";
                            break;
                    }
                    resultArray[3][arrayPositionCount] = String.valueOf(j);
                    arrayPositionCount++;
                }
            }
        }
        return resultArray;
    }
}