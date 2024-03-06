package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Humor {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesHumor and quotesHumorAuthors
        int listSize = getHumorListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesHumor[randomIndexToSwap];
            tempAuthor = quotesHumorAuthors[randomIndexToSwap];
            tempTags = humorTags[randomIndexToSwap];
            quotesHumor[randomIndexToSwap] = quotesHumor[i];
            quotesHumorAuthors[randomIndexToSwap] = quotesHumorAuthors[i];
            humorTags[randomIndexToSwap] = humorTags[i];
            quotesHumor[i] = tempQuote;
            quotesHumorAuthors[i] = tempAuthor;
            humorTags[i] = tempTags;
        }
    }

    private static String[] quotesHumor = {
            //0
            "\"A black cat crossing your path signifies that the animal is going somewhere.\"",
            //1
            "\"Remember, today is the tomorrow you worried about yesterday.\"",
            //2
            "\"War is God’s way of teaching Americans geography.\"",
            //3
            "\"Never put off till tomorrow what you can do the day after tomorrow just as well.\"",
            //4
            "\"Never let anyone treat you like you’re regular glue. You’re glitter glue.\"",
            //5
            "\"Men cannot live by bread alone; he must have peanut butter.\"",
            //6
            "\"You can’t buy happiness but you can buy ice cream. And that’s kind of the same thing.\"",
            //7
            "\"My grandmother started walking five miles a day when she was sixty. She’s ninety-seven now, and we don’t know where the hell she is.\"",
            //8
            "\"All the things I really like to do are either immoral, illegal or fattening.\"",
            //9
            "\"A woman’s mind is cleaner than a man’s: She changes it more often.\"",
            //10
            "\"Marriage is like mushrooms: we notice too late if they are good or bad.\"",
            //11
            "\"The only time a woman really succeeds in changing a man is when he is a baby.\"",
            //12
            "\"My life feels like a test I didn’t study for.\"",
            //13
            "\"Happiness is nothing more than good health and a bad memory.\"",
            //14
            "\"I don’t believe in astrology; I’m a Sagittarius and we’re skeptical.\"",
            //15
            "\"Haters are just confused admirers because they can’t figure out the reason why everyone loves you.\"",
            //16
            "\"Never do anything out of hunger. Not even eating.\"",
            //17
            "\"If at first you don’t succeed, then skydiving isn’t for you.\"",
            //18
            "\"I intend to live forever. So far, so good.\"",
            //19
            "\"Before you marry a person, you should first make them use a computer with slow Internet to see who they really are.\"",
            //20
            "\"My opinions may have changed, but not the fact that I’m right.\"",
            //21
            "\"Ah, yes, divorce… from the Latin word meaning to rip out a man’s genitals through his wallet.\"",
            //22
            "\"Am I perfect? No. But am I striving to be a better person every day? Also no.\"",
            //23
            "\"What do people do with all the extra time they save by writing ‘k’ instead of ’ok’?\"",
            //24
            "\"Remember, when you are dead, you do not know you are dead. It is only painful for others. The same applies when you are stupid.\"",
            //25
            "\"Money is not the most important thing in the world. Love is. Fortunately, I love money.\"",
            //26
            "\"See, the problem is that God gives men a brain and a penis, and only enough blood to run one at a time.\"",
            //27
            "\"Mondays are fine. It’s your life that sucks.\"",
            //28
            "\"Before you criticize someone, you should walk a mile in their shoes. That way when you criticize them, you are a mile away from them and you have their shoes.\"",
            //29
            "\"Today me will live in the moment. Unless it is unpleasant. In which case me will eat a cookie.\"",
            //30
            "\"Never doubt the courage of the French. They were the ones who discovered that snails are edible.\"",
            //31
            "\"A woman is like a tea bag – you can’t tell how strong she is until you put her in hot water.\"",
            //32
            "\"Clothes make the man. Naked people have little or no influence in society.\"",
            //33
            "\"If you are lonely, dim all lights and put on a horror movie. After a while it won’t feel like you are alone anymore.\"",
            //34
            "\"Always borrow money from a pessimist. He won’t expect it back.\"",
            //35
            "\"When I was a kid my parents moved a lot, but I always found them.\"",
            //36
            "\"Behind every great man is a woman rolling her eyes.\"",
            //37
            "\"Have you ever noticed that anybody driving faster than you is a maniac, and anyone going slower than you is a moron?\"",
            //38
            "\"Knowledge is like underwear. It is useful to have it, but not necessary to show it off.\"",
            //39
            "\"My pessimism extends to the point of even suspecting the sincerity of other pessimists.\"",
            //40
            "\"If women ran the world we wouldn’t have wars, just intense negotiations every 28 days.\"",
            //41
            "\"People say nothing is impossible, but I do nothing every day.\"",
            //42
            "\"I always wanted to be somebody but now I realize I should have been more specific.\"",
            //43
            "\"There are only three things women need in life: food, water, and compliments.\"",
            //44
            "\"If you think nobody cares about you, try missing a couple of payments.\"",
            //45
            "\"A man in love is incomplete until he has married. Then he is finished.\"",
            //46
            "\"Analyzing humor is like dissecting a frog. Few people are interested and the frog dies of it.\"",
            //47
            "\"All generalizations are false, including this one.\"",
            //48
            "\"I’m sick of following my dreams, man. I’m just going to ask where they’re going and hook up with ‘em later.\"",
            //49
            "\"Have you noticed that all the people in favor of birth control are already born?\"",
            //50
            "\"When I die, I want to die like my grandfather who died peacefully in his sleep. Not screaming like all the passengers in his car.\"",
            //51
            "\"High heels were invented by a woman who had been kissed on the forehead.\"",
            //52
            "\"I’ve developed a new philosophy. I only dread one day at a time.\"",
            //53
            "\"If you think you are too small to make a difference, try sleeping with a mosquito.\"",
            //54
            "\"One tequila, two tequila, three tequila, floor.\"",
            //55
            "\"To be sure of hitting the target, shoot first, and call whatever you hit the target.\"",
            //56
            "\"Laughing at our mistakes can lengthen our own life. Laughing at someone else’s can shorten it.\"",
            //57
            "\"May your coffee be strong and your Monday be short.\"",
            //58
            "\"It’s okay if you don’t like me. Not everyone has a good taste.\"",
            //59
            "\"If you’re going to tell people the truth, be funny or they’ll kill you.\"",
            //60
            "\"Food is like sex: when you abstain, even the worst stuff begins to look good.\"",
            //61
            "\"Finally my winter fat is done. Now I have spring rolls.\"",
            //62
            "\"Biologically speaking, if something bites you it’s more likely to be female.\"",
            //63
            "\"Boys fuck things up. Girls are fucked up.\"",
            //64
            "\"Always remember that you are absolutely unique. Just like everyone else.\"",
            //65
            "\"The first time I see a jogger smiling, I’ll consider it.\"",
            //66
            "\"I’m in shape. Round is a shape.\"",
            //67
            "\"It would be nice to spend billions on schools and roads, but right now that money is desperately needed for political ads.\"",
            //68
            "\"Woke up today. It was terrible.\"",
            //69
            "\"Roses are red, violets are blue, I’m schizophrenic, and so am I.\"",
            //70
            "\"A successful man is one who makes more money than his wife can spend. A successful woman is one who can find such a man.\"",
            //71
            "\"The first time I sang in a church choir; two hundred people changed their religion.\"",
            //72
            "\"A positive attitude won’t solve all your problems – but it will annoy enough people to make it worth it.\"",
            //73
            "\"The early bird gets the worm, but the second mouse gets the cheese.\"",
            //74
            "\"Wine is constant proof that God loves us and loves to see us happy.\"",
            //75
            "\"If you can’t live without me, why aren’t you dead already.\"",
            //76
            "\"I’ve come to view Jesus much the way I view Elvis. I love the guy but the fan clubs really freak me out.\"",
            //77
            "\"I haven’t spoken to my wife in years. I didn’t want to interrupt her.\"",
            //78
            "\"According to a new survey, 90% of men say their lover is also their best friend. Which is really kind of disturbing when you consider man’s best friend is his dog.\"",
            //79
            "\"I was just viciously body shamed by my mirror.\"",
            //80
            "\"Women are wiser than men because they know less and understand more.\"",
            //81
            "\"Roses are red, blood is too, violets are violet, they’re not fucking blue.\"",
            //82
            "\"A pessimist is a person who has had to listen to too many optimists.\"",
            //83
            "\"My brain has too many tabs open.\"",
            //84
            "\"The only thing that stops God from sending another flood is that the first one was useless.\"",
            //85
            "\"If there are no stupid questions, then what kind of questions do stupid people ask? Do they get smart just in time to ask questions?\"",
            //86
            "\"My life needs editing.\"",
            //87
            "\"Light travels faster than sound. This is why some people appear bright until you hear them speak.\"",
            //88
            "\"I walk around like everything is fine, but deep down, inside my shoe, my sock is sliding off.\"",
            //89
            "\"There are two types of people in the world: People who say they pee in the shower and dirty fucking liars.\"",
            //90
            "\"If I still cannot hear what you have to say after you have repeated it three times, I will just laugh and hope it was not a question.\"",
            //91
            "\"If you live to be one hundred, you’ve got it made. Very few people die past that age.\"",
            //92
            "\"I have learned from my mistakes, and I am sure I can repeat them exactly.\"",
            //93
            "\"A day without sunshine is like, you know, night.\"",
            //94
            "\"I am so clever that sometimes I don’t understand a single word of what I am saying.\"",
            //95
            "\"The only mystery in life is why the kamikaze pilots wore helmets.\"",
            //96
            "\"I prefer not to think before speaking. I like being as surprised as everyone else by what comes out of my mouth.\"",
            //97
            "\"An alcoholic is someone you don’t like who drinks as much as you do.\"",
            //98
            "\"Don’t be so humble – you are not that great.\"",
            //99
            "\"I love being married. It’s so great to find that one special person you want to annoy for the rest of your life.\"",
            //100
            "\"If you fall – I’ll be there.\"",
            //101
            "\"Two things are infinite: the universe and human stupidity; and I’m not sure about the universe.\"",
            //102
            "\"Everyone has a purpose in life. Perhaps yours is watching television.\"",
            //103
            "\"We learn from experience that men never learn anything from experience.\"",
            //104
            "\"Trying to be happy by accumulating possessions is like trying to satisfy hunger by taping sandwiches all over your body.\"",
            //105
            "\"The average dog is a nicer person than the average person.\"",
            //106
            "\"It’s amazing that the amount of news that happens in the world every day always just exactly fits the newspaper.\"",
            //107
            "\"There is no sunrise so beautiful that it is worth waking me up to see it.\"",
            //108
            "\"It’s only when you look at an ant through a magnifying glass on a sunny day that you realize how often they burst into flames.\"",
            //109
            "\"The best way to teach your kids about taxes is by eating 30 percent of their ice cream.\"",
            //110
            "\"Trying is the first step toward failure.\"",
            //111
            "\"Men want the same thing from their underwear that they want from women: a little bit of support, and a little bit of freedom.\"",
            //112
            "\"As a child my family’s menu consisted of two choices: take it or leave it.\"",
            //113
            "\"I live by my own rules (reviewed, revised, and approved by my wife)… but still my own.\"",
            //114
            "\"Marriage is the only war in which you sleep with the enemy.\"",
            //115
            "\"A bank is a place that will lend you money if you can prove that you don’t need it.\"",
            //116
            "\"I am the human version of tangled headphones.\"",
            //117
            "\"Sometimes I’m grateful that thoughts don’t appear as bubbles over our heads.\"",
            //118
            "\"Accept who you are. Unless you’re a serial killer.\"",
            //119
            "\"You love flowers, but you cut them. You love animals, but you eat them. You tell me you love me, so now I’m scared!\"",
            //120
            "\"If you can’t laugh at your own problems, call me and I’ll laugh at them.\"",
            //121
            "\"I don’t insult people, I just describe them!\"",
            //122
            "\"You never realize what you have until it’s gone. Toilet paper is a good example.\"",
            //123
            "\"Dear Lord, there is a bug in your software… it’s called Monday, please fix it.\"",
            //124
            "\"Relationship Status: Looking for a FREE WiFi connection.\"",
            //125
            "\"Never go to bed mad. Stay up and fight.\"",
            //126
            "\"Everyone should be able to do one card trick, tell two jokes, and recite three poems, in case they are ever trapped in an elevator.\"",
            //127
            "\"I’m nobody, nobody is perfect, and therefore I’m perfect.\"",
            //128
            "\"Whenever I have a problem, I just sing, then I realize my voice is a lot worse than my problem.\"",
            //129
            "\"Never miss a good chance to shut up.\"",
            //130
            "\"Never do anything yourself that others can do for you.\"",
            //131
            "\"If you had to choose between eating tacos every day or being skinny for life… would you choose hard or soft tacos?\"",
            //132
            "\"Life’s biggest struggle: I need to pee, but I don’t want to get out of bed.\"",
            //133
            "\"My goal this weekend is to move… just enough so people don’t think I’m dead.\"",
            //134
            "\"Dear life, when I said ‘Can this day get any worse’ it was a rhetorical question, not a challenge.\"",
            //135
            "\"Lazy people fact #2347827309. You were too lazy to read that number.\"",
            //136
            "\"Relationships are like fat people, most of them don’t work out.\"",
            //137
            "\"I dream of a better tomorrow, where chickens can cross the road and not be questioned about their motives.\"",
            //138
            "\"God couldn’t be everywhere, so he created mothers.\"",
            //139
            "\"I did not attend his funeral, but I sent a nice letter saying I approved of it.\"",
            //140
            "\"People say me bad. Trust me I am the worst.\"",
            //141
            "\"How come iPhone chargers are not called apple juice?\"",
            //142
            "\"When I said that I cleaned my room, I just meant I made a path from the doorway to my bed.\"",
            //143
            "\"Sometimes, when I close my eyes, I can’t see.\"",
            //144
            "\"I solemnly swear that I am up to no good.\"",
            //145
            "\"The difference between stupidity and genius is that genius has its limits.\""
    };
    private static String[] quotesHumorAuthors = {
            //0
            "Groucho Marx",
            //1
            "Dale Carnegie",
            //2
            "Ambrose Bierce",
            //3
            "Mark Twain",
            //4
            "Unknown",
            //5
            "James A. Garfield",
            //6
            "Unknown",
            //7
            "Ellen DeGeneres",
            //8
            "Alexander Woollcott",
            //9
            "Oliver Herford",
            //10
            "Woody Allen",
            //11
            "Natalie Wood",
            //12
            "Unknown",
            //13
            "Albert Schweitzer",
            //14
            "Arthur C. Clarke",
            //15
            "Jeffree Star",
            //16
            "Frank Semyon (True Detective)",
            //17
            "Steven Wright",
            //18
            "Steven Wright",
            //19
            "Will Ferrell",
            //20
            "Ashleigh Brilliant",
            //21
            "Robin Williams",
            //22
            "Unknown",
            //23
            "Unknown",
            //24
            "Ricky Gervais",
            //25
            "Jackie Mason",
            //26
            "Robin Williams",
            //27
            "Ricky Gervais",
            //28
            "Jack Handey",
            //29
            "Cookie Monster",
            //30
            "Doug Larson",
            //31
            "Eleanor Roosevelt",
            //32
            "Mark Twain",
            //33
            "Unknown",
            //34
            "Oscar Wilde",
            //35
            "Rodney Dangerfield",
            //36
            "Jim Carrey",
            //37
            "George Carlin",
            //38
            "Bill Murray",
            //39
            "Jean Rostand",
            //40
            "Robin Williams",
            //41
            "Winnie the Pooh",
            //42
            "Lily Tomlin",
            //43
            "Chris Rock",
            //44
            "Steven Wright",
            //45
            "Zsa Zsa Gabor",
            //46
            "E. B. White",
            //47
            "Mark Twain",
            //48
            "Mitch Hedberg",
            //49
            "Benry Hill",
            //50
            "Will Rogers",
            //51
            "Cristopher Morley",
            //52
            "Charlie Brown",
            //53
            "Dalai Lama",
            //54
            "George Carlin",
            //55
            "Ashleigh Brilliant",
            //56
            "Cullen Hightower",
            //57
            "Unknown",
            //58
            "Unknown",
            //59
            "Billy Wilder",
            //60
            "Beth McCollister",
            //61
            "Unknown",
            //62
            "Desmond Morris",
            //63
            "Louis C. K.",
            //64
            "Margaret Mead",
            //65
            "Joan Rivers",
            //66
            "George Carlin",
            //67
            "Andy Borowitz",
            //68
            "Grumpy Cat",
            //69
            "Oscar Levant",
            //70
            "Lana Turner",
            //71
            "Fred Allen",
            //72
            "Herm Albright",
            //73
            "Steven Wright",
            //74
            "Benjamin Franklin",
            //75
            "Cynthia Heimel",
            //76
            "John Fugelsang",
            //77
            "Rodney Dangerfield",
            //78
            "Jay Leno",
            //79
            "Danny Zuker",
            //80
            "James Thruber",
            //81
            "Unknown",
            //82
            "Don Marquis",
            //83
            "Unknown",
            //84
            "Nicolas Chamfort",
            //85
            "Unknown",
            //86
            "Mort Sahl",
            //87
            "Alan Dundes",
            //88
            "Unknown",
            //89
            "Louis C. K.",
            //90
            "Kevin Hart",
            //91
            "George Burns",
            //92
            "Peter Cook",
            //93
            "Steve Martin",
            //94
            "Oscar Wilde",
            //95
            "Al McGuire",
            //96
            "Unknown",
            //97
            "Dylan Thomas",
            //98
            "Golda Meir",
            //99
            "Rita Rudner",
            //100
            "Floor",
            //101
            "Albert Einstein",
            //102
            "David Letterman",
            //103
            "George Bernard Shaw",
            //104
            "George Carlin",
            //105
            "Andy Rooney",
            //106
            "Jerry Seinfeld",
            //107
            "Mindy Kaling",
            //108
            "Harry Hill",
            //109
            "Bill Murray",
            //110
            "Homer Simpson",
            //111
            "Jerry Seinfeld",
            //112
            "Buddy Hackett",
            //113
            "Si Robertson",
            //114
            "Francois de La Rochefoucauld",
            //115
            "Bob Hope",
            //116
            "Unknown",
            //117
            "Unknown",
            //118
            "Ellen DeGeneres",
            //119
            "Unknown",
            //120
            "Unknown",
            //121
            "Unknown",
            //122
            "Unknown",
            //123
            "Unknown",
            //124
            "Unknown",
            //125
            "Phyllis Diller",
            //126
            "Lemony Snicket",
            //127
            "Unknown",
            //128
            "Unknown",
            //129
            "Will Rogers",
            //130
            "Unknown",
            //131
            "Unknown",
            //132
            "Unknown",
            //133
            "Unknown",
            //134
            "Unknown",
            //135
            "Unknown",
            //136
            "Unknown",
            //137
            "Unknown",
            //138
            "Unknown",
            //139
            "Mark Twain",
            //140
            "Unknown",
            //141
            "Unknown",
            //142
            "Unknown",
            //143
            "Unknown",
            //144
            "J. K. Rowling (Harry Potter)",
            //145
            "Albert Einstein"
    };
    private static String[][] humorTags = {
            //0
            {"humor", "groucho", "marx", "a", "black", "cat", "crossing", "your", "path", "signifies", "that", "the", "animal", "is", "going", "somewhere"},
            //1
            {"humor", "dale", "carnegie", "remember", "today", "is", "the", "tomorrow", "you", "worried", "about", "yesterday"},
            //2
            {"humor", "ambrose", "bierce", "war", "is", "god’s", "way", "of", "teaching", "americans", "geography"},
            //3
            {"humor", "mark", "twain", "never", "put", "off", "till", "tomorrow", "what", "you", "can", "do", "the", "day", "after", "just", "as", "well"},
            //4
            {"humor", "never", "let", "anyone", "treat", "you", "like", "you’re", "regular", "glue", "glitter"},
            //5
            {"humor", "james", "a", "garfield", "men", "cannot", "live", "by", "bread", "alone", "he", "must", "have", "peanut", "butter"},
            //6
            {"humor", "you", "can’t", "buy", "happiness", "but", "can", "ice", "cream", "and", "that’s", "kind", "of", "the", "same", "thing"},
            //7
            {"humor", "ellen", "degeneres", "my", "grandmother", "started", "walking", "five", "miles", "a", "day", "when", "she", "was", "sixty", "she’s", "ninetyseven", "now", "and", "we", "don’t", "know", "where", "the", "hell", "is"},
            //8
            {"humor", "alexander", "woollcott", "all", "the", "things", "i", "really", "like", "to", "do", "are", "either", "immoral", "illegal", "or", "fattening"},
            //9
            {"humor", "oliver", "herford", "a", "woman’s", "mind", "is", "cleaner", "than", "man’s", "she", "changes", "it", "more", "often"},
            //10
            {"humor", "woody", "allen", "marriage", "is", "like", "mushrooms", "we", "notice", "too", "late", "if", "they", "are", "good", "or", "bad"},
            //11
            {"humor", "natalie", "wood", "the", "only", "time", "a", "woman", "really", "succeeds", "in", "changing", "man", "is", "when", "he", "baby"},
            //12
            {"humor", "my", "life", "feels", "like", "a", "test", "i", "didn’t", "study", "for"},
            //13
            {"humor", "albert", "schweitzer", "happiness", "is", "nothing", "more", "than", "good", "health", "and", "a", "bad", "memory"},
            //14
            {"humor", "arthur", "c", "clarke", "i", "don’t", "believe", "in", "astrology", "i’m", "a", "sagittarius", "and", "we’re", "skeptical"},
            //15
            {"humor", "jeffree", "star", "haters", "are", "just", "confused", "admirers", "because", "they", "can’t", "figure", "out", "the", "reason", "why", "everyone", "loves", "you"},
            //16
            {"humor", "frank", "semyon", "true", "detective", "never", "do", "anything", "out", "of", "hunger", "not", "even", "eating"},
            //17
            {"humor", "steven", "wright", "if", "at", "first", "you", "don’t", "succeed", "then", "skydiving", "isn’t", "for"},
            //18
            {"humor", "steven", "wright", "i", "intend", "to", "live", "forever", "so", "far", "good"},
            //19
            {"humor", "will", "ferrell", "before", "you", "marry", "a", "person", "should", "first", "make", "them", "use", "computer", "with", "slow", "internet", "to", "see", "who", "they", "really", "are"},
            //20
            {"humor", "ashleigh", "brilliant", "my", "opinions", "may", "have", "changed", "but", "not", "the", "fact", "that", "i’m", "right"},
            //21
            {"humor", "robin", "williams", "ah", "yes", "divorce…", "from", "the", "latin", "word", "meaning", "to", "rip", "out", "a", "man’s", "genitals", "through", "his", "wallet"},
            //22
            {"humor", "am", "i", "perfect", "no", "but", "striving", "to", "be", "a", "better", "person", "every", "day", "also"},
            //23
            {"humor", "what", "do", "people", "with", "all", "the", "extra", "time", "they", "save", "by", "writing", "‘k’", "instead", "of", "’ok’"},
            //24
            {"humor", "ricky", "gervais", "remember", "when", "you", "are", "dead", "do", "not", "know", "it", "is", "only", "painful", "for", "others", "the", "same", "applies", "stupid"},
            //25
            {"humor", "jackie", "mason", "money", "is", "not", "the", "most", "important", "thing", "in", "world", "love", "fortunately", "i"},
            //26
            {"humor", "robin", "williams", "see", "the", "problem", "is", "that", "god", "gives", "men", "a", "brain", "and", "penis", "only", "enough", "blood", "to", "run", "one", "at", "time"},
            //27
            {"humor", "ricky", "gervais", "mondays", "are", "fine", "it’s", "your", "life", "that", "sucks"},
            //28
            {"humor", "jack", "handey", "before", "you", "criticize", "someone", "should", "walk", "a", "mile", "in", "their", "shoes", "that", "way", "when", "them", "are", "away", "from", "and", "have"},
            //29
            {"humor", "cookie", "monster", "today", "me", "will", "live", "in", "the", "moment", "unless", "it", "is", "unpleasant", "which", "case", "eat", "a", "cookie"},
            //30
            {"humor", "doug", "larson", "never", "doubt", "the", "courage", "of", "french", "they", "were", "ones", "who", "discovered", "that", "snails", "are", "edible"},
            //31
            {"humor", "eleanor", "roosevelt", "a", "woman", "is", "like", "tea", "bag", "you", "can’t", "tell", "how", "strong", "she", "until", "put", "her", "in", "hot", "water"},
            //32
            {"humor", "mark", "twain", "clothes", "make", "the", "man", "naked", "people", "have", "little", "or", "no", "influence", "in", "society"},
            //33
            {"humor", "if", "you", "are", "lonely", "dim", "all", "lights", "and", "put", "on", "a", "horror", "movie", "after", "while", "it", "won’t", "feel", "like", "alone", "anymore"},
            //34
            {"humor", "oscar", "wilde", "always", "borrow", "money", "from", "a", "pessimist", "he", "won’t", "expect", "it", "back"},
            //35
            {"humor", "rodney", "dangerfield", "when", "i", "was", "a", "kid", "my", "parents", "moved", "lot", "but", "always", "found", "them"},
            //36
            {"humor", "jim", "carrey", "behind", "every", "great", "man", "is", "a", "woman", "rolling", "her", "eyes"},
            //37
            {"humor", "george", "carlin", "have", "you", "ever", "noticed", "that", "anybody", "driving", "faster", "than", "is", "a", "maniac", "and", "anyone", "going", "slower", "moron"},
            //38
            {"humor", "bill", "murray", "knowledge", "is", "like", "underwear", "it", "useful", "to", "have", "but", "not", "necessary", "show", "off"},
            //39
            {"humor", "jean", "rostand", "my", "pessimism", "extends", "to", "the", "point", "of", "even", "suspecting", "sincerity", "other", "pessimists"},
            //40
            {"humor", "robin", "williams", "if", "women", "ran", "the", "world", "we", "wouldn’t", "have", "wars", "just", "intense", "negotiations", "every", "28", "days"},
            //41
            {"humor", "winnie", "the", "pooh", "people", "say", "nothing", "is", "impossible", "but", "i", "do", "every", "day"},
            //42
            {"humor", "lily", "tomlin", "i", "always", "wanted", "to", "be", "somebody", "but", "now", "realize", "should", "have", "been", "more", "specific"},
            //43
            {"humor", "chris", "rock", "there", "are", "only", "three", "things", "women", "need", "in", "life", "food", "water", "and", "compliments"},
            //44
            {"humor", "steven", "wright", "if", "you", "think", "nobody", "cares", "about", "try", "missing", "a", "couple", "of", "payments"},
            //45
            {"humor", "zsa", "gabor", "a", "man", "in", "love", "is", "incomplete", "until", "he", "has", "married", "then", "finished"},
            //46
            {"humor","e", "elwyn", "b", "brooks", "white", "analyzing", "is", "like", "dissecting", "a", "frog", "few", "people", "are", "interested", "and", "the", "dies", "of", "it"},
            //47
            {"humor", "mark", "twain", "all", "generalizations", "are", "false", "including", "this", "one"},
            //48
            {"humor", "mitch", "hedberg", "i’m", "sick", "of", "following", "my", "dreams", "man", "just", "going", "to", "ask", "where", "they’re", "and", "hook", "up", "with", "‘em", "later"},
            //49
            {"humor", "benry", "hill", "have", "you", "noticed", "that", "all", "the", "people", "in", "favor", "of", "birth", "control", "are", "already", "born"},
            //50
            {"humor", "will", "rogers", "when", "i", "die", "want", "to", "like", "my", "grandfather", "who", "died", "peacefully", "in", "his", "sleep", "not", "screaming", "all", "the", "passengers", "car"},
            //51
            {"humor", "cristopher", "morley", "high", "heels", "were", "invented", "by", "a", "woman", "who", "had", "been", "kissed", "on", "the", "forehead"},
            //52
            {"humor", "charlie", "brown", "i’ve", "developed", "a", "new", "philosophy", "i", "only", "dread", "one", "day", "at", "time"},
            //53
            {"humor", "dalai", "lama", "if", "you", "think", "are", "too", "small", "to", "make", "a", "difference", "try", "sleeping", "with", "mosquito"},
            //54
            {"humor", "george", "carlin", "one", "tequila", "two", "three", "floor"},
            //55
            {"humor", "ashleigh", "brilliant", "to", "be", "sure", "of", "hitting", "the", "target", "shoot", "first", "and", "call", "whatever", "you", "hit"},
            //56
            {"humor", "cullen", "hightower", "laughing", "at", "our", "mistakes", "can", "lengthen", "own", "life", "someone", "else’s", "shorten", "it"},
            //57
            {"humor", "may", "your", "coffee", "be", "strong", "and", "monday", "short"},
            //58
            {"humor", "it’s", "okay", "if", "you", "don’t", "like", "me", "not", "everyone", "has", "a", "good", "taste"},
            //59
            {"humor", "billy", "wilder", "if", "you’re", "going", "to", "tell", "people", "the", "truth", "be", "funny", "or", "they’ll", "kill", "you"},
            //60
            {"humor", "beth", "mccollister", "food", "is", "like", "sex", "when", "you", "abstain", "even", "the", "worst", "stuff", "begins", "to", "look", "good"},
            //61
            {"humor", "finally", "my", "winter", "fat", "is", "done", "now", "i", "have", "spring", "rolls"},
            //62
            {"humor", "desmond", "morris", "biologically", "speaking", "if", "something", "bites", "you", "it’s", "more", "likely", "to", "be", "female"},
            //63
            {"humor", "louis", "c", "k", "ck", "boys", "fuck", "things", "up", "girls", "are", "fucked"},
            //64
            {"humor", "margaret", "mead", "always", "remember", "that", "you", "are", "absolutely", "unique", "just", "like", "everyone", "else"},
            //65
            {"humor", "joan", "rivers", "the", "first", "time", "i", "see", "a", "jogger", "smiling", "i’ll", "consider", "it"},
            //66
            {"humor", "george", "carlin", "i’m", "in", "shape", "round", "is", "a"},
            //67
            {"humor", "andy", "borowitz", "it", "would", "be", "nice", "to", "spend", "billions", "on", "schools", "and", "roads", "but", "right", "now", "that", "money", "is", "desperately", "needed", "for", "political", "ads"},
            //68
            {"humor", "grumpy", "cat", "woke", "up", "today", "it", "was", "terrible"},
            //69
            {"humor", "oscar", "levant", "roses", "are", "red", "violets", "blue", "i’m", "schizophrenic", "and", "so", "am", "i"},
            //70
            {"humor", "lana", "turner", "a", "successful", "man", "is", "one", "who", "makes", "more", "money", "than", "his", "wife", "can", "spend", "woman", "find", "such"},
            //71
            {"humor", "fred", "allen", "the", "first", "time", "i", "sang", "in", "a", "church", "choir", "two", "hundred", "people", "changed", "their", "religion"},
            //72
            {"humor", "herm", "albright", "a", "positive", "attitude", "won’t", "solve", "all", "your", "problems", "but", "it", "will", "annoy", "enough", "people", "to", "make", "worth"},
            //73
            {"humor", "steven", "wright", "the", "early", "bird", "gets", "worm", "but", "second", "mouse", "cheese"},
            //74
            {"humor", "benjamin", "franklin", "wine", "is", "constant", "proof", "that", "god", "loves", "us", "and", "to", "see", "happy"},
            //75
            {"humor", "cynthia", "heimel", "if", "you", "can’t", "live", "without", "me", "why", "aren’t", "dead", "already"},
            //76
            {"humor", "john", "fugelsang", "i’ve", "come", "to", "view", "jesus", "much", "the", "way", "i", "elvis", "love", "guy", "but", "fan", "clubs", "really", "freak", "me", "out"},
            //77
            {"humor", "rodney", "dangerfield", "i", "haven’t", "spoken", "to", "my", "wife", "in", "years", "didn’t", "want", "interrupt", "her"},
            //78
            {"humor", "jay", "leno", "according", "to", "a", "new", "survey", "90%", "of", "men", "say", "their", "lover", "is", "also", "best", "friend", "which", "really", "kind", "disturbing", "when", "you", "consider", "man’s", "his", "dog"},
            //79
            {"humor", "danny", "zuker", "i", "was", "just", "viciously", "body", "shamed", "by", "my", "mirror"},
            //80
            {"humor", "james", "thruber", "women", "are", "wiser", "than", "men", "because", "they", "know", "less", "and", "understand", "more"},
            //81
            {"humor", "roses", "are", "red", "blood", "is", "too", "violets", "violet", "they’re", "not", "fucking", "blue"},
            //82
            {"humor", "don", "marquis", "a", "pessimist", "is", "person", "who", "has", "had", "to", "listen", "too", "many", "optimists"},
            //83
            {"humor", "my", "brain", "has", "too", "many", "tabs", "open"},
            //84
            {"humor", "nicolas", "charmfort", "the", "only", "thing", "that", "stops", "god", "from", "sending", "another", "flood", "is", "first", "one", "was", "useless"},
            //85
            {"humor", "if", "there", "are", "no", "stupid", "questions", "then", "what", "kind", "of", "do", "people", "ask", "they", "get", "smart", "just", "in", "time", "to"},
            //86
            {"humor", "mort", "sahl", "my", "life", "needs", "editing"},
            //87
            {"humor", "alan", "dundes", "light", "travels", "faster", "than", "sound", "this", "is", "why", "some", "people", "appear", "bright", "until", "you", "hear", "them", "speak"},
            //88
            {"humor", "i", "walk", "around", "like", "everything", "is", "fine", "but", "deep", "down", "inside", "my", "shoe", "sock", "sliding", "off"},
            //89
            {"humor", "louis", "c", "k", "ck", "there", "are", "two", "types", "of", "people", "in", "the", "world", "who", "say", "they", "pee", "shower", "and", "dirty", "fucking", "liars"},
            //90
            {"humor", "kevin", "hart", "if", "i", "still", "cannot", "hear", "what", "you", "have", "to", "say", "after", "repeated", "it", "three", "times", "will", "just", "laugh", "and", "hope", "was", "not", "a", "question"},
            //91
            {"humor", "george", "burns", "if", "you", "live", "to", "be", "one", "hundred", "you’ve", "got", "it", "made", "very", "few", "people", "die", "past", "that", "age"},
            //92
            {"humor", "peter", "cook", "i", "have", "learned", "from", "my", "mistakes", "and", "am", "sure", "can", "repeat", "them", "exactly"},
            //93
            {"humor", "steve", "martin", "a", "day", "without", "sunshine", "is", "like", "you", "know", "night"},
            //94
            {"humor", "oscar", "wilde", "i", "am", "so", "clever", "that", "sometimes", "don’t", "understand", "a", "single", "word", "of", "what", "saying"},
            //95
            {"humor", "al", "mcguire", "the", "only", "mystery", "in", "life", "is", "why", "kamikaze", "pilots", "wore", "helmets"},
            //96
            {"humor", "i", "prefer", "not", "to", "think", "before", "speaking", "like", "being", "as", "surprised", "everyone", "else", "by", "what", "comes", "out", "of", "my", "mouth"},
            //97
            {"humor", "dylan", "thomas", "an", "alcoholic", "is", "someone", "you", "don’t", "like", "who", "drinks", "as", "much", "do"},
            //98
            {"humor", "golda", "meir", "don’t", "be", "so", "humble", "you", "are", "not", "that", "great"},
            //99
            {"humor", "rita", "rudner", "i", "love", "being", "married", "it’s", "so", "great", "to", "find", "that", "one", "special", "person", "you", "want", "annoy", "for", "the", "rest", "of", "your", "life"},
            //100
            {"humor", "floor", "if", "you", "fall", "i’ll", "be", "there"},
            //101
            {"humor", "albert", "einstein", "two", "things", "are", "infinite", "the", "universe", "and", "human", "stupidity", "i’m", "not", "sure", "about"},
            //102
            {"humor", "david", "letterman", "everyone", "has", "a", "purpose", "in", "life", "perhaps", "yours", "is", "watching", "television"},
            //103
            {"humor", "george", "b", "bernard", "shaw", "we", "learn", "from", "experience", "that", "men", "never", "anything"},
            //104
            {"humor", "george", "carlin", "trying", "to", "be", "happy", "by", "accumulating", "possessions", "is", "like", "satisfy", "hunger", "taping", "sandwiches", "all", "over", "your", "body"},
            //105
            {"humor", "andy", "rooney", "the", "average", "dog", "is", "a", "nicer", "person", "than"},
            //106
            {"humor", "jerry", "seinfeld", "it’s", "amazing", "that", "the", "amount", "of", "news", "happens", "in", "world", "every", "day", "always", "just", "exactly", "fits", "newspaper"},
            //107
            {"humor", "mindy", "kaling", "there", "is", "no", "sunrise", "so", "beautiful", "that", "it", "worth", "waking", "me", "up", "to", "see"},
            //108
            {"humor", "harry", "hill", "it’s", "only", "when", "you", "look", "at", "an", "ant", "through", "a", "magnifying", "glass", "on", "sunny", "day", "that", "realize", "how", "often", "they", "burst", "into", "flames"},
            //109
            {"humor", "bill", "murray", "the", "best", "way", "to", "teach", "your", "kids", "about", "taxes", "is", "by", "eating", "30", "percent", "of", "their", "ice", "cream"},
            //110
            {"humor", "homer", "simpson", "trying", "is", "the", "first", "step", "toward", "failure"},
            //111
            {"humor", "jerry", "seinfeld", "men", "want", "the", "same", "thing", "from", "their", "underwear", "that", "they", "women", "a", "little", "bit", "of", "support", "and", "freedom"},
            //112
            {"humor", "buddy", "hackett", "as", "a", "child", "my", "family’s", "menu", "consisted", "of", "two", "choices", "take", "it", "or", "leave"},
            //113
            {"humor", "si", "robertson", "i", "live", "by", "my", "own", "rules", "reviewed", "revised", "and", "approved", "wife…", "but", "still"},
            //114
            {"humor", "francois", "de", "la", "rochefoucauld", "marriage", "is", "the", "only", "war", "in", "which", "you", "sleep", "with", "enemy"},
            //115
            {"humor", "bob", "hope", "a", "bank", "is", "place", "that", "will", "lend", "you", "money", "if", "can", "prove", "don’t", "need", "it"},
            //116
            {"humor", "i", "am", "the", "human", "version", "of", "tangled", "headphones"},
            //117
            {"humor", "sometimes", "i’m", "grateful", "that", "thoughts", "don’t", "appear", "as", "bubbles", "over", "our", "heads"},
            //118
            {"humor", "ellen", "degeneres", "accept", "who", "you", "are", "unless", "you’re", "a", "serial", "killer"},
            //119
            {"humor", "you", "love", "flowers", "but", "cut", "them", "animals", "eat", "tell", "me", "so", "now", "i’m", "scared"},
            //120
            {"humor", "if", "you", "can’t", "laugh", "at", "your", "own", "problems", "call", "me", "and", "i’ll", "them"},
            //121
            {"humor", "i", "don’t", "insult", "people", "just", "describe", "them"},
            //122
            {"humor", "you", "never", "realize", "what", "have", "until", "it’s", "gone", "toilet", "paper", "is", "a", "good", "example"},
            //123
            {"humor", "dear", "lord", "there", "is", "a", "bug", "in", "your", "software", "it’s", "called", "monday", "please", "fix", "it"},
            //124
            {"humor", "relationship", "status", "looking", "for", "a", "free", "wifi", "connection"},
            //125
            {"humor", "phyllis", "diller", "never", "go", "to", "bed", "mad", "stay", "up", "and", "fight"},
            //126
            {"humor", "lemony", "snicket", "everyone", "should", "be", "able", "to", "do", "one", "card", "trick", "tell", "two", "jokes", "and", "recite", "three", "poems", "in", "case", "they", "are", "ever", "trapped", "an", "elevator"},
            //127
            {"humor", "i’m", "nobody", "is", "perfect", "and", "therefore"},
            //128
            {"humor", "whenever", "i", "have", "a", "problem", "just", "sing", "then", "realize", "my", "voice", "is", "lot", "worse", "than"},
            //129
            {"humor", "will", "rogers", "never", "miss", "a", "good", "chance", "to", "shut", "up"},
            //130
            {"humor", "never", "do", "anything", "yourself", "that", "others", "can", "for", "you"},
            //131
            {"humor", "if", "you", "had", "to", "choose", "between", "eating", "tacos", "every", "day", "or", "being", "skinny", "for", "life", "would", "hard", "soft"},
            //132
            {"humor", "life’s", "biggest", "struggle", "i", "need", "to", "pee", "but", "don’t", "want", "get", "out", "of", "bed"},
            //133
            {"humor", "my", "goal", "this", "weekend", "is", "to", "move", "just", "enough", "so", "people", "don’t", "think", "i’m", "dead"},
            //134
            {"humor", "dear", "life", "when", "i", "said", "‘can", "this", "day", "get", "any", "worse’", "it", "was", "a", "rhetorical", "question", "not", "challenge"},
            //135
            {"humor", "lazy", "people", "fact", "#2347827309", "you", "were", "too", "to", "read", "that", "number"},
            //136
            {"humor", "relationships", "are", "like", "fat", "people", "most", "of", "them", "don’t", "work", "out"},
            //137
            {"humor", "i", "dream", "of", "a", "better", "tomorrow", "where", "chickens", "can", "cross", "the", "road", "and", "not", "be", "questioned", "about", "their", "motives"},
            //138
            {"humor", "god", "couldn’t", "be", "everywhere", "so", "he", "created", "mothers"},
            //139
            {"humor", "mark", "twain", "i", "did", "not", "attend", "his", "funeral", "but", "sent", "a", "nice", "letter", "saying", "approved", "of", "it"},
            //140
            {"humor", "people", "say", "me", "bad", "trust", "i", "am", "the", "worst"},
            //141
            {"humor", "how", "come", "iphone", "chargers", "are", "not", "called", "apple", "juice"},
            //142
            {"humor", "when", "i", "said", "that", "cleaned", "my", "room", "just", "meant", "made", "a", "path", "from", "the", "doorway", "to", "bed"},
            //143
            {"humor", "sometimes", "when", "i", "close", "my", "eyes", "can’t", "see"},
            //144
            {"humor", "j", "k", "rowling", "harry", "potter", "i", "solemnly", "swear", "that", "am", "up", "to", "no", "good"},
            //145
            {"humor", "albert", "einstein", "the", "difference", "between", "stupidity", "and", "genius", "is", "that", "has", "its", "limits"}
    };

    public static String getHumorQuote(int position) {
        return quotesHumor[position];
    }

    public static String getHumorAuthor(int position) {
        return quotesHumorAuthors[position];
    }

    public static String[] getHumorList() {
        return quotesHumor;
    }

    static String[][] getHumorTags() {
        return humorTags;
    }

    public static int getHumorListSize() {
        return quotesHumor.length;
    }
}
