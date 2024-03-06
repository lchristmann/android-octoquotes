package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Time {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesTime and quotesTimeAuthors
        int listSize = getTimeListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesTime[randomIndexToSwap];
            tempAuthor = quotesTimeAuthors[randomIndexToSwap];
            tempTags = timeTags[randomIndexToSwap];
            quotesTime[randomIndexToSwap] = quotesTime[i];
            quotesTimeAuthors[randomIndexToSwap] = quotesTimeAuthors[i];
            timeTags[randomIndexToSwap] = timeTags[i];
            quotesTime[i] = tempQuote;
            quotesTimeAuthors[i] = tempAuthor;
            timeTags[i] = tempTags;
        }
    }

    private static String[] quotesTime = {
            //0
            "\"Time slips away like grains of sand never to return again.\"",
            //1
            "\"It’s not that we have little time, but more that we waste a good deal of it.\"",
            //2
            "\"You can have it all. Just not all at once.\"",
            //3
            "\"It’s not about having enough time, it’s about making enough time.\"",
            //4
            "\"Times will change for the better when you change.\"",
            //5
            "\"Time is a created thing. To say “I don’t have time” is to say “I don’t want to.\"",
            //6
            "\"You can’t make up for lost time. You can only do better in the future.\"",
            //7
            "\"Until you value yourself, you won’t value your time. Until you value your time, you will not do anything with it.\"",
            //8
            "\"In such seconds of decision entire futures are made.\"",
            //9
            "\"Life isn’t a matter of milestones, but of moments.\"",
            //10
            "\"Punctuality is not just limited to arriving at a place at right time, it is also about taking actions at right time.\"",
            //11
            "\"Who controls the past controls the future: who controls the present controls the past.\"",
            //12
            "\"Regret for wasted time is more wasted time.\"",
            //13
            "\"The key is in not spending time, but in investing it.\"",
            //14
            "\"Time always exposes what you mean to someone.\"",
            //15
            "\"An inch of time is an inch of gold but you can’t buy that inch of time with an inch of gold.\"",
            //16
            "\"The best use of time is stepping back to identify the best use of time.\"",
            //17
            "\"Lack of time is actually lack of priorities.\"",
            //18
            "\"It is the time you have wasted for your rose that makes your rose so important.\"",
            //19
            "\"Time is a cruel thief to rob us of our former selves. We lose as much to life as we do to death.\"",
            //20
            "\"The greatest gift you could give someone is your time. Because when you give your time, you are giving a portion of your life you can’t get back.\"",
            //21
            "\"Do we need more time? Or do we need to be more disciplined with the time we have?\"",
            //22
            "\"The future is something which everyone reaches at the rate of sixty minutes an hour, whatever he does, whoever he is.\"",
            //23
            "\"Sunsets are the proof that endings can often be beautiful, too.\"",
            //24
            "\"The trouble is, you think you have time.\"",
            //25
            "\"There is one kind of robber whom the law does not strike at, and who steals what is most precious to men: time.\"",
            //26
            "\"It’s really clear that the most precious resource we all have is time.\"",
            //27
            "\"Day n. A period of twenty-four hours, mostly misspent.\"",
            //28
            "\"The only reason for time is so that everything doesn’t happen at once.\"",
            //29
            "\"The common man is not concerned about the passage of time, the man of talent is driven by it.\"",
            //30
            "\"Time is free, but it’s priceless. You can’t own it, but you can use it. You can’t keep it, but you can spend it. Once you’ve lost it you can never get it back.\"",
            //31
            "\"Lost wealth may be replaced by industry, lost knowledge by study, lost health by temperance or medicine, but lost time is gone forever.\"",
            //32
            "\"As if you could kill time without injuring eternity.\"",
            //33
            "\"The two most powerful warriors are patience and time.\"",
            //34
            "\"Life, if well lived, is long enough.\"",
            //35
            "\"Time takes it all, whether you want it to or not.\"",
            //36
            "\"We must use time wisely and forever realize that the time is always ripe to do right.\"",
            //37
            "\"Time is an illusion.\"",
            //38
            "\"Whether it’s the best of times or the worst of times, it’s the only time we’ve got.\"",
            //39
            "\"Time flies over us, but leaves its shadow behind.\"",
            //40
            "\"Time is the devourer of everything.\"",
            //41
            "\"Enjoy yourself. It’s later than you think.\"",
            //42
            "\"The time for action is now. It’s never too late to do something.\"",
            //43
            "\"They always say time changes things, but you actually have to change them yourself.\"",
            //44
            "\"Lost time is never found again.\"",
            //45
            "\"Time isn’t the main thing. It’s the only thing.\"",
            //46
            "\"The more you know yourself, the more you understand life, the more you value your time.\"",
            //47
            "\"How we spend our days, is, of course, how we spend our lives.\"",
            //48
            "\"You will never find time for anything. If you want time you must make it.\"",
            //49
            "\"If we take care of the moments, the years will take care of themselves.\"",
            //50
            "\"I recommend you take care of the minutes and the hours will take care of themselves.\"",
            //51
            "\"Time is the longest distance between two places.\"",
            //52
            "\"Time brings all things to pass.\"",
            //53
            "\"Time is what we want most and what we use worst.\"",
            //54
            "\"Time is the most valuable thing that a man can spend.\"",
            //55
            "\"Time is too slow for those who wait, too swift for those who fear, too long for those who grieve, too short for those who rejoice, but for those who love, time is eternity.\"",
            //56
            "\"Time, which changes people, does not alter the image we have of them.\"",
            //57
            "\"The future has a way of arriving unannounced.\"",
            //58
            "\"Nature does not hurry, yet everything is accomplished.\"",
            //59
            "\"Time is the wisest of all things that are; for it brings everything to light.\"",
            //60
            "\"Change your 24 hours and you will change your life.\"",
            //61
            "\"If you love life, don’t waste time, for time is what life is made up of.\"",
            //62
            "\"All we have to decide is what to do with the time that is given us.\"",
            //63
            "\"Let your dreams be bigger than you fears and your actions be louder than your words.\"",
            //64
            "\"After all this time? Always.\"",
            //65
            "\"The way we spend our time defines who we are.\"",
            //66
            "\"Ordinary people think merely of spending time, great people think of using it.\"",
            //67
            "\"Time changes everything except something within us which is always surprised by change.\"",
            //68
            "\"Either you run the day, or the day runs you.\"",
            //69
            "\"Every second is of infinite value.\"",
            //70
            "\"Time is long but life is short.\"",
            //71
            "\"Time won’t make you forget, it will make you grow and understand things.\"",
            //72
            "\"Know the true value of time; snatch, seize, and enjoy every moment of it.\"",
            //73
            "\"Better three hours too soon than a minute too late.\"",
            //74
            "\"Time is a storm in which we are all lost.\"",
            //75
            "\"Time is the coin of your life. It is the only coin you have, and only you can determine how it will be spent. Be careful lest you let other people spend it for you.\"",
            //76
            "\"Time is the most valuable thing a man can spend.\"",
            //77
            "\"Do you love life? Then do not squander time, for that is the stuff life is made of.\"",
            //78
            "\"Sometimes you will never know the value of a moment, until it becomes a memory.\"",
            //79
            "\"In the end, it’s not the years in your life that count. It’s the life in your years.\"",
            //80
            "\"Your time is your life. That is why the greatest gift you can give someone is your time.\"",
            //81
            "\"We should always allow some time to elapse, for time discloses the truth.\"",
            //82
            "\"You may delay, but time will not.\"",
            //83
            "\"For the present is the point at which time touches eternity.\"",
            //84
            "\"Don’t wait. The time will never be just right.\"",
            //85
            "\"The present time has one advantage over every other – it is our own.\"",
            //86
            "\"Time is the wisest counsellor of all.\"",
            //87
            "\"There’s never enough time to do all the nothing you want.\"",
            //88
            "\"The whole future lies in uncertainty: live immediately.\"",
            //89
            "\"Time is like the wind, it lifts the light and leaves the heavy.\"",
            //90
            "\"Time waits for no one.\"",
            //91
            "\"Time is money.\"",
            //92
            "\"How to stop time: kiss. How to travel in time: read. How to escape time: music. How to feel time: write. How to release time: breathe.\"",
            //93
            "\"You can’t have a better tomorrow if you are thinking about yesterday all the time.\"",
            //94
            "\"Your time is limited, so don’t waste it living someone else’s life. Don’t be trapped by dogma – which is living with the results of other people’s thinking.\"",
            //95
            "\"To live is so startling it leaves little time for anything else.\"",
            //96
            "\"We must use time as a tool, not as a couch.\"",
            //97
            "\"Waste no more time arguing about what a good person should be. Be one.\"",
            //98
            "\"We all have our time machines. Some take us back, they’re called memories. Some take us forward, they’re called dreams.\"",
            //99
            "\"If time travel is possible, where are the tourists from the future?.\"",
            //100
            "\"Men talk of killing time, while time quietly kills them.\"",
            //101
            "\"Forever is composed of nows.\"",
            //102
            "\"Time stays long enough for those who use it.\"",
            //103
            "\"People who use their time wisely spend it on activities that advance their overall purpose in life.\"",
            //104
            "\"Don’t waste your time with explanations, people only hear what they want to hear.\"",
            //105
            "\"There’s only one thing more precious than out time and that’s who we spend it on.\"",
            //106
            "\"A man who dares to waste one hour of time has not discovered the value life.\"",
            //107
            "\"Don’t wait. Life goes faster than you think.\"",
            //108
            "\"Time expands, then contracts, and in tune with the stirrings of the heart.\"",
            //109
            "\"Yesterday’s the past, tomorrow’s the future, but today is a gift. That’s why it’s called the present.\"",
            //110
            "\"Don’t watch the clock. Do what it does. Keep going.\"",
            //111
            "\"Be not afraid of growing slowly, be afraid of standing still.\"",
            //112
            "\"Life is short and the older you get, the more you feel it. Indeed, the shorter it is. People lose their capacity to walk, run, travel, think, and experience life. I realise how important it is to use the time I have.\"",
            //113
            "\"If you are too busy to enjoy quality time with your family, then you need to re-evaluate your priorities.\"",
            //114
            "\"I refuse to entertain negativity. Life is too big and time is too short to get caught up in empty drama.\"",
            //115
            "\"With endless time, nothing is special. With no loss or sacrifice, we can’t appreciate what we have.\"",
            //116
            "\"Time is more value than money. You can get more money, but you cannot get more time.\"",
            //117
            "\"It’s surprising how much free time and productivity you gain when you lose the busyness in your mind.\"",
            //118
            "\"Conscious of not being able to separate myself from my time, I have decided to become part of it.\"",
            //119
            "\"The key is in not spending time, but in investing it.\"",
            //120
            "\"Time management is life management.\"",
            //121
            "\"You get to decide where your time goes. You can either spend it moving forward, or you can spend it putting out fires. You decide. And if you don’t decide, others will decide for you.\"",
            //122
            "\"We all know our money isn’t infinite, yet we end up treating our time and energy and attention as if they are.\"",
            //123
            "\"Be selective with who you invest your time, wasted time is worse than wasted money.\"",
            //124
            "\"Lack of direction, not lack of time, is the problem. We all have twenty-four hour days.\"",
            //125
            "\"Time = life; therefore, waste your time and waste your life, or master your time and master your life.\"",
            //126
            "\"Yesterday is gone. Tomorrow has not yet come. We have only today. Let us begin.\"",
            //127
            "\"Realize that now, in this moment of time, you are creating. You are creating your next moment. That is what’s real.\"",
            //128
            "\"Don’t be fooled by the calendar. There are only as many days in the year as you make use of. One man gets only a week’s value out of a year while another man gets a full year’s value out of a week.\"",
            //129
            "\"The time to start is now.\"",
            //130
            "\"Don’t waste your time with lazy people who have no ambition.\"",
            //131
            "\"Time can be an ally or an enemy. What it becomes depends entirely upon you, your goals, and your determination to use every available minute.\"",
            //132
            "\"The bad news is time flies. The good news is you’re the pilot.\"",
            //133
            "\"If you spend too much time thinking about a thing, you’ll never get it done.\"",
            //134
            "\"Procrastination is the art of keeping up with yesterday and avoiding today.\"",
            //135
            "\"Time management is an oxymoron. Time is beyond our control, and the clock keeps ticking regardless of how we lead our lives. Priority management is the answer to maximizing the time we have.\""
    };
    private static String[] quotesTimeAuthors = {
            //0
            "Robin Sharma",
            //1
            "Seneca",
            //2
            "Oprah Winfrey",
            //3
            "Rachael Bermingham",
            //4
            "Unknown",
            //5
            "Lao Tzu",
            //6
            "Ashley Ormon",
            //7
            "M. Scott Peck",
            //8
            "Dan Simmons",
            //9
            "Rose Kennedy",
            //10
            "Amit Kalantri",
            //11
            "George Orwell",
            //12
            "Mason Cooley",
            //13
            "Stephen R. Covey",
            //14
            "Unknown",
            //15
            "Chinese proverb",
            //16
            "Unknown",
            //17
            "Tim Ferriss",
            //18
            "Antoine de Saint-Exupeéry (The Little Prince)",
            //19
            "Elizabeth Forsythe Haily",
            //20
            "Unknown",
            //21
            "Kerry Johnson",
            //22
            "C. S. Lewis",
            //23
            "Beau Taplin",
            //24
            "Buddha",
            //25
            "Napoleon Bonaparte",
            //26
            "Steve Jobs",
            //27
            "Ambrose Bierce",
            //28
            "Albert Einstein",
            //29
            "Arthur Schopenhauer",
            //30
            "Harvey Mackay",
            //31
            "Samuel Smiles",
            //32
            "Henry David Thoreau",
            //33
            "Leo Tolstoy (War and Peace)",
            //34
            "Seneca",
            //35
            "Stephen King (The Green Mile)",
            //36
            "Nelson Mandela",
            //37
            "Albert Einstein",
            //38
            "Art Buchwald",
            //39
            "Nathaniel Hawthorne",
            //40
            "Ovid",
            //41
            "Chinese proverb",
            //42
            "Antoine de Saint-Exupéry",
            //43
            "Andy Warhol",
            //44
            "Benjamin Franklin",
            //45
            "Miles David",
            //46
            "Maxime Lagacé",
            //47
            "Annie Dillard",
            //48
            "Charles Buxto",
            //49
            "Maria Edgeworth",
            //50
            "Earl of Chesterfield",
            //51
            "Tennessee Williams (The Glass Menagerie)",
            //52
            "Aeschylus",
            //53
            "William Penn",
            //54
            "Diogenes",
            //55
            "Henry van Dyke",
            //56
            "Marcel Proust",
            //57
            "George F. Will",
            //58
            "Lao Tzu",
            //59
            "Thales",
            //60
            "Eric Thomas",
            //61
            "Bruce Lee",
            //62
            "J. R. R. Tolkien",
            //63
            "M. Scott Peck",
            //64
            "J. K. Rowling",
            //65
            "Jonathan Estrin",
            //66
            "Arthur Schopenhauer",
            //67
            "Thomas Hardy",
            //68
            "Jim Rohn",
            //69
            "Johann Wolfgang von Goethe",
            //70
            "Stevie Wonder",
            //71
            "Unknown",
            //72
            "Lord Chesterfield",
            //73
            "William Shakespeare",
            //74
            "William Carlos Williams",
            //75
            "Carl Sandburg",
            //76
            "Theophrastus",
            //77
            "Benjamin Franklin",
            //78
            "Dr. Seuss",
            //79
            "Abraham Lincoln",
            //80
            "Rich Warren",
            //81
            "Seneca",
            //82
            "Benjamin Franklin",
            //83
            "C. S. Lewis",
            //84
            "Napoleon Hill",
            //85
            "Charles Caleb Colton",
            //86
            "Pericles",
            //87
            "Bill Watterson",
            //88
            "Seneca",
            //89
            "Doménico Cieri Estrada",
            //90
            "Unknown",
            //91
            "Benjamin Franklin",
            //92
            "Matt Haig",
            //93
            "Charles F. Kettering",
            //94
            "Steve Jobs",
            //95
            "Emily Dickinson",
            //96
            "John F. Kennedy",
            //97
            "Marcus Aurelius",
            //98
            "Jeremy Irons",
            //99
            "Stephen Hawking",
            //100
            "Dion Boucicault",
            //101
            "Emily Dickinson",
            //102
            "Leonardo da Vinci",
            //103
            "John C. Maxwell",
            //104
            "Paulo Coelho",
            //105
            "Leo Christopher",
            //106
            "Charles Darwin",
            //107
            "Unknown",
            //108
            "Haruki Murakami",
            //109
            "Bill Keane",
            //110
            "Sam Levenson",
            //111
            "Chinese proverb",
            //112
            "Viggo Mortensen",
            //113
            "Dave Willis",
            //114
            "Unknown",
            //115
            "Mitch Albom",
            //116
            "Jim Rohn",
            //117
            "Brittany Burgunder",
            //118
            "Albert Camus",
            //119
            "Stephen R. Covey",
            //120
            "Unknown",
            //121
            "Tony Morgan",
            //122
            "Shane Parrish",
            //123
            "Unknown",
            //124
            "Zig Ziglar",
            //125
            "Alan Lakein",
            //126
            "Mother Teresa",
            //127
            "Sara Paddison",
            //128
            "Charles Richards",
            //129
            "Unknown",
            //130
            "Unknown",
            //131
            "Zig Ziglar",
            //132
            "Unknown",
            //133
            "Bruce Lee",
            //134
            "Wayne Dyer",
            //135
            "John C. Maxwell"
    };
    private static String[][] timeTags = {
            //0
            {"time", "robin", "sharma", "slips", "away", "like", "grains", "of", "sand", "never", "to", "return", "again"},
            //1
            {"time", "seneca", "it’s", "not", "that", "we", "have", "little", "but", "more", "waste", "a", "good", "deal", "of", "it"},
            //2
            {"time", "oprah", "winfrey", "you", "can", "have", "it", "all", "just", "not", "at", "once"},
            //3
            {"time", "rachael", "bermingham", "it’s", "not", "about", "having", "enough", "making"},
            //4
            {"time", "times", "will", "change", "for", "the", "better", "when", "you"},
            //5
            {"time", "lao", "tzu", "is", "a", "created", "thing", "to", "say", "“i", "don’t", "have", "time”", "want"},
            //6
            {"time", "ashley", "ormon", "you", "can’t", "make", "up", "for", "lost", "can", "only", "do", "better", "in", "the", "future"},
            //7
            {"time", "m", "scott", "peck", "until", "you", "value", "yourself", "won’t", "your", "will", "not", "do", "anything", "with", "it"},
            //8
            {"time", "dan", "simmons", "in", "such", "seconds", "of", "decision", "entire", "futures", "are", "made"},
            //9
            {"time", "rose", "kennedy", "life", "isn’t", "a", "matter", "of", "milestones", "but", "moments"},
            //10
            {"time", "amit", "kalantri", "punctuality", "is", "not", "just", "limited", "to", "arriving", "at", "a", "place", "right", "it", "also", "about", "taking", "actions"},
            //11
            {"time", "george", "orwell", "who", "controls", "the", "past", "future", "present"},
            //12
            {"time", "mason", "cooley", "regret", "for", "wasted", "is", "more"},
            //13
            {"time", "stephen", "r", "covey", "the", "key", "is", "in", "not", "spending", "but", "investing", "it"},
            //14
            {"time", "always", "exposes", "what", "you", "mean", "to", "someone"},
            //15
            {"time", "chinese", "proverb", "an", "inch", "of", "is", "gold", "but", "you", "can’t", "buy", "that", "with"},
            //16
            {"time", "the", "best", "use", "of", "is", "stepping", "back", "to", "identify"},
            //17
            {"time", "tim", "ferriss", "lack", "of", "is", "actually", "priorities"},
            //18
            {"time", "antoine", "de", "saintexupéry", "saintexupery", "it", "is", "the", "you", "have", "wasted", "for", "your", "rose", "that", "makes", "so", "important"},
            //19
            {"time", "elizabeth", "f", "forsythe", "haily", "is", "a", "cruel", "thief", "to", "rob", "us", "of", "our", "former", "selves", "we", "lose", "as", "much", "life", "do", "death"},
            //20
            {"time", "the", "greatest", "gift", "you", "could", "give", "someone", "is", "your", "because", "when", "are", "giving", "a", "portion", "of", "life", "can’t", "get", "back"},
            //21
            {"time", "kerry", "johnson", "do", "we", "need", "more", "or", "to", "be", "disciplined", "with", "the", "have"},
            //22
            {"time", "c", "s", "lewis", "the", "future", "is", "something", "which", "everyone", "reaches", "at", "rate", "of", "sixty", "minutes", "an", "hour", "whatever", "he", "does", "whoever"},
            //23
            {"time", "beau", "taplin", "sunsets", "are", "the", "proof", "that", "endings", "can", "often", "be", "beautiful", "too"},
            //24
            {"time", "buddha", "the", "trouble", "is", "you", "think", "have"},
            //25
            {"time", "napoleon", "bonaparte", "there", "is", "one", "kind", "of", "robber", "whom", "the", "law", "does", "not", "strike", "at", "and", "who", "steals", "what", "most", "precious", "to", "men"},
            //26
            {"time", "steve", "jobs", "it’s", "really", "clear", "that", "the", "most", "precious", "resource", "we", "all", "have", "is"},
            //27
            {"time", "ambrose", "bierce", "day", "n", "a", "period", "of", "twentyfour", "hours", "mostly", "misspent"},
            //28
            {"time", "albert", "einstein", "the", "only", "reason", "for", "is", "so", "that", "everything", "doesn’t", "happen", "at", "once"},
            //29
            {"time", "arthur", "schopenhauer", "the", "common", "man", "is", "not", "concerned", "about", "passage", "of", "talent", "driven", "by", "it"},
            //30
            {"time", "harvey", "mackay", "is", "free", "but", "it’s", "priceless", "you", "can’t", "own", "it", "can", "use", "keep", "spend", "once", "you’ve", "lost", "never", "get", "back"},
            //31
            {"time", "samuel", "smiles", "lost", "wealth", "may", "be", "replaced", "by", "industry", "knowledge", "study", "health", "temperance", "or", "medicine", "but", "is", "gone", "forever"},
            //32
            {"time", "henry", "d", "david", "thoreau", "as", "if", "you", "could", "kill", "without", "injuring", "eternity"},
            //33
            {"time", "leo", "tolstoy", "war", "and", "peace", "the", "two", "most", "powerful", "warriors", "are", "patience", "and"},
            //34
            {"time", "seneca", "life", "if", "well", "lived", "is", "long", "enough"},
            //35
            {"time", "stephen", "king", "the", "green", "mile", "takes", "it", "all", "whether", "you", "want", "to", "or", "not"},
            //36
            {"time", "nelson", "mandela", "we", "must", "use", "wisely", "and", "forever", "realize", "that", "the", "is", "always", "ripe", "to", "do", "right"},
            //37
            {"time", "albert", "einstein", "is", "an", "illusion"},
            //38
            {"time", "art", "buchwald", "whether", "it’s", "the", "best", "of", "times", "or", "worst", "only", "we’ve", "got"},
            //39
            {"time", "nathaniel", "hawthorne", "flies", "over", "us", "but", "leaves", "its", "shadow", "behind"},
            //40
            {"time", "ovid", "is", "the", "devourer", "of", "everything"},
            //41
            {"time", "chinese", "proverb", "enjoy", "yourself", "it’s", "later", "than", "you", "think"},
            //42
            {"time", "antoine", "de", "saintexupéry", "saintexupery", "the", "for", "action", "is", "now", "it’s", "never", "too", "late", "to", "do", "something"},
            //43
            {"time", "andy", "warhol", "they", "always", "say", "changes", "things", "but", "you", "actually", "have", "to", "change", "them", "yourself"},
            //44
            {"time", "banjamin", "franklin", "lost", "is", "never", "found", "again"},
            //45
            {"time", "miles", "david", "isn’t", "the", "main", "thing", "it’s", "only"},
            //46
            {"time", "maxime", "legacé", "legace", "the", "more", "you", "know", "yourself", "understand", "life", "value", "your"},
            //47
            {"time", "annie", "dillard", "how", "we", "spend", "our", "days", "is", "of", "course", "lives"},
            //48
            {"time", "charles", "buxto", "you", "will", "never", "find", "for", "anything", "if", "want", "must", "make", "it"},
            //49
            {"time", "maria", "edgeworth", "if", "we", "take", "care", "of", "the", "moments", "years", "will", "themselves"},
            //50
            {"time", "earl", "of", "chesterfield", "i", "recommend", "you", "take", "care", "of", "the", "minutes", "and", "hours", "will", "themselves"},
            //51
            {"time", "tenessee", "williams", "the", "glass", "menagerie", "is", "the", "longest", "distance", "between", "two", "places"},
            //52
            {"time", "aeschylus", "brings", "all", "things", "to", "pass"},
            //53
            {"time", "william", "penn", "is", "what", "we", "want", "most", "and", "use", "worst"},
            //54
            {"time", "diogenes", "is", "the", "most", "valuable", "thing", "that", "a", "man", "can", "spend"},
            //55
            {"time", "henry", "van", "dyke", "is", "too", "slow", "for", "those", "who", "wait", "swift", "fear", "long", "grieve", "short", "rejoice", "but", "love", "eternity"},
            //56
            {"time", "marcel", "proust", "which", "changes", "people", "does", "not", "alter", "the", "image", "we", "have", "of", "them"},
            //57
            {"time", "george", "f", "will", "the", "future", "has", "a", "way", "of", "arriving", "unannounced"},
            //58
            {"time", "lao", "tzu", "nature", "does", "not", "hurry", "yet", "everything", "is", "accomplished"},
            //59
            {"time", "thales", "is", "the", "wisest", "of", "all", "things", "that", "are", "for", "it", "brings", "everything", "to", "light"},
            //60
            {"time", "eric", "thomas", "change", "your", "24", "hours", "and", "you", "will", "life"},
            //61
            {"time", "bruce", "lee", "if", "you", "love", "life", "don’t", "waste", "for", "is", "what", "made", "up", "of"},
            //62
            {"time", "j", "r", "tolkien", "all", "we", "have", "to", "decide", "is", "what", "do", "with", "the", "that", "given", "us"},
            //63
            {"time", "m", "scott", "peck", "let", "your", "dreams", "be", "bigger", "than", "you", "fears", "and", "actions", "louder", "words"},
            //64
            {"time", "j", "k", "rowling", "after", "all", "this", "always"},
            //65
            {"time", "jonathan", "estrin", "the", "way", "we", "spend", "our", "defines", "who", "are"},
            //66
            {"time", "arthur", "schopenhauer", "ordinary", "people", "think", "merely", "of", "spending", "great", "using", "it"},
            //67
            {"time", "thomas", "hardy", "changes", "everything", "except", "something", "within", "us", "which", "is", "always", "surprised", "by", "change"},
            //68
            {"time", "jim", "rohn", "either", "you", "run", "the", "day", "or", "runs"},
            //69
            {"time", "johann", "wolfgang", "von", "goethe", "every", "second", "is", "of", "infinite", "value"},
            //70
            {"time", "stevie", "wonder", "is", "long", "but", "life", "short"},
            //71
            {"time", "won’t", "make", "you", "forget", "it", "will", "grow", "and", "understand", "things"},
            //72
            {"time", "lord", "chesterfield", "know", "the", "true", "value", "of", "snatch", "seize", "and", "enjoy", "every", "moment", "it"},
            //73
            {"time", "william", "shakespeare", "better", "three", "hours", "too", "soon", "than", "a", "minute", "late"},
            //74
            {"time", "william", "c", "carlos", "williams", "is", "a", "storm", "in", "which", "we", "are", "all", "lost"},
            //75
            {"time", "carl", "sandburg", "is", "the", "coin", "of", "your", "life", "it", "only", "you", "have", "and", "can", "determine", "how", "will", "be", "spent", "careful", "lest", "let", "other", "people", "spend", "for"},
            //76
            {"time", "theophrastus", "is", "the", "most", "valuable", "thing", "a", "man", "can", "spend"},
            //77
            {"time", "benjamin", "franklin", "do", "you", "love", "life", "then", "not", "squander", "for", "that", "is", "the", "stuff", "made", "of"},
            //78
            {"time", "dr", "seuss", "sometimes", "you", "will", "never", "know", "the", "value", "of", "a", "moment", "until", "it", "becomes", "memory"},
            //79
            {"time", "abraham", "lincoln", "in", "the", "end", "it’s", "not", "years", "your", "life", "that", "count"},
            //80
            {"time", "rich", "warren", "your", "is", "life", "that", "why", "the", "greatest", "gift", "you", "can", "give", "someone"},
            //81
            {"time", "seneca", "we", "should", "always", "allow", "some", "to", "elapse", "for", "discloses", "the", "truth"},
            //82
            {"time", "benjamin", "franklin", "you", "may", "delay", "but", "will", "not"},
            //83
            {"time", "c", "s", "lewis", "for", "the", "present", "is", "point", "at", "which", "touches", "eternity"},
            //84
            {"time", "napoleon", "hill", "don’t", "wait", "the", "will", "never", "be", "just", "right"},
            //85
            {"time", "charles", "c", "caleb", "colton", "the", "present", "has", "one", "advantage", "over", "every", "other", "it", "is", "our", "own"},
            //86
            {"time", "pericles", "is", "the", "wisest", "counsellor", "of", "all"},
            //87
            {"time", "bill", "watterson", "there’s", "never", "enough", "to", "do", "all", "the", "nothing", "you", "want"},
            //88
            {"time", "seneca", "the", "whole", "future", "lies", "in", "uncertainty", "live", "immediately"},
            //89
            {"time", "doménico", "domenico", "c", "cieri", "estrada", "is", "like", "the", "wind", "it", "lifts", "light", "and", "leaves", "heavy"},
            //90
            {"time", "waits", "for", "no", "one"},
            //91
            {"time", "benjamin", "franklin", "is", "money"},
            //92
            {"time", "matt", "haig", "how", "to", "stop", "kiss", "travel", "in", "read", "escape", "music", "feel", "write", "release", "breathe"},
            //93
            {"time", "charles", "f", "kettering", "you", "can’t", "have", "a", "better", "tomorrow", "if", "are", "thinking", "about", "yesterday", "all", "the"},
            //94
            {"time", "steve", "jobs", "your", "is", "limited", "so", "don’t", "waste", "it", "living", "someone", "else’s", "life", "be", "trapped", "by", "dogma", "which", "with", "the", "results", "of", "other", "people’s", "thinking"},
            //95
            {"time", "emily", "dickinson", "to", "live", "is", "so", "startling", "it", "leaves", "little", "for", "anything", "else"},
            //96
            {"time", "john", "f", "kennedy", "we", "must", "use", "as", "a", "tool", "not", "couch"},
            //97
            {"time", "marcus", "aurelius", "waste", "no", "more", "arguing", "about", "what", "a", "good", "person", "should", "be", "one"},
            //98
            {"time", "jeremy", "irons", "we", "all", "have", "our", "machines", "some", "take", "us", "back", "they’re", "called", "memories", "forward", "dreams"},
            //99
            {"time", "stephen", "hawking", "if", "travel", "is", "possible", "where", "are", "the", "tourists", "from", "future"},
            //100
            {"time", "dion", "boucicault", "men", "talk", "of", "killing", "while", "quietly", "kills", "them"},
            //101
            {"time", "emily", "dickinson", "forever", "is", "composed", "of", "nows"},
            //102
            {"time", "leonardo", "da", "vinci", "stays", "long", "enough", "for", "those", "who", "use", "it"},
            //103
            {"time", "john", "c", "maxwell", "people", "who", "use", "their", "wisely", "spend", "it", "on", "activities", "that", "advance", "overall", "purpose", "in", "life"},
            //104
            {"time", "paulo", "coelho", "don’t", "waste", "your", "with", "explanations", "people", "only", "hear", "what", "they", "want", "to"},
            //105
            {"time", "leo", "cristopher", "there’s", "only", "one", "thing", "more", "precious", "than", "out", "and", "that’s", "who", "we", "spend", "it", "on"},
            //106
            {"time", "charles", "darwin", "a", "man", "who", "dares", "to", "waste", "one", "hour", "of", "has", "not", "discovered", "the", "value", "life"},
            //107
            {"time", "don’t", "wait", "life", "goes", "faster", "than", "you", "think"},
            //108
            {"time", "haruki", "murakami", "expands", "then", "contracts", "and", "in", "tune", "with", "the", "stirrings", "of", "heart"},
            //109
            {"time", "bill", "keane", "yesterday’s", "the", "past", "tomorrow’s", "future", "but", "today", "is", "a", "gift", "that’s", "why", "it’s", "called", "present"},
            //110
            {"time", "sam", "levenson", "don’t", "watch", "the", "clock", "do", "what", "it", "does", "keep", "going"},
            //111
            {"time", "chinese", "proverb", "be", "not", "afraid", "of", "growing", "slowly", "standing", "still"},
            //112
            {"time", "viggo", "mortensen", "life", "is", "short", "and", "the", "older", "you", "get", "more", "feel", "it", "indeed", "shorter", "people", "lose", "their", "capacity", "to", "walk", "run", "travel", "think", "experience", "i", "realise", "how", "important", "use", "have"},
            //113
            {"time", "dave", "willis", "if", "you", "are", "too", "busy", "to", "enjoy", "quality", "with", "your", "family", "then", "need", "reevaluate", "priorities"},
            //114
            {"time", "i", "refuse", "to", "entertain", "negativity", "life", "is", "too", "big", "and", "short", "get", "caught", "up", "in", "empty", "drama"},
            //115
            {"time", "mitch", "albom", "with", "endless", "nothing", "is", "special", "no", "loss", "or", "sacrifice", "we", "can’t", "appreciate", "what", "have"},
            //116
            {"time", "jim", "rohn", "is", "more", "value", "than", "money", "you", "can", "get", "but", "cannot"},
            //117
            {"time", "brittany", "burgunder", "it’s", "surprising", "how", "much", "free", "and", "productivity", "you", "gain", "when", "lose", "the", "busyness", "in", "your", "mind"},
            //118
            {"time", "albert", "camus", "conscious", "of", "not", "being", "able", "to", "separate", "myself", "from", "my", "i", "have", "decided", "become", "part", "it"},
            //119
            {"time", "stephen", "r", "covey", "the", "key", "is", "in", "not", "spending", "but", "investing", "it"},
            //120
            {"time", "management", "is", "life"},
            //121
            {"time", "tony", "morgan", "you", "get", "to", "decide", "where", "your", "goes", "can", "either", "spend", "it", "moving", "forward", "or", "putting", "out", "fires", "and", "if", "don’t", "others", "will", "for"},
            //122
            {"time", "shane", "parrish", "we", "all", "know", "our", "money", "isn’t", "infinite", "yet", "end", "up", "treating", "and", "energy", "attention", "as", "if", "they", "are"},
            //123
            {"time", "be", "selective", "with", "who", "you", "invest", "your", "wasted", "is", "worse", "than", "money"},
            //124
            {"time", "zig", "ziglar", "lack", "of", "direction", "not", "is", "the", "problem", "we", "all", "have", "twentyfour", "hour", "days"},
            //125
            {"time", "alan", "lakein", "=", "life", "therefore", "waste", "your", "and", "or", "master"},
            //126
            {"time", "mother", "teresa", "yesterday", "is", "gone", "tomorrow", "has", "not", "yet", "come", "we", "have", "only", "today", "let", "us", "begin"},
            //127
            {"time", "sara", "paddison", "realize", "that", "now", "in", "this", "moment", "of", "you", "are", "creating", "your", "next", "is", "what’s", "real"},
            //128
            {"time", "charles", "richards", "don’t", "be", "fooled", "by", "the", "calendar", "there", "are", "only", "as", "many", "days", "in", "year", "you", "make", "use", "of", "one", "man", "gets", "a", "week’s", "value", "out", "while", "another", "full", "year’s", "week"},
            //129
            {"time", "the", "to", "start", "is", "now"},
            //130
            {"time", "don’t", "waste", "your", "with", "lazy", "people", "who", "have", "no", "ambition"},
            //131
            {"time", "zig", "ziglar", "can", "be", "an", "ally", "or", "enemy", "what", "it", "becomes", "depends", "entirely", "upon", "you", "your", "goals", "and", "determination", "to", "use", "every", "available", "minute"},
            //132
            {"time", "the", "bad", "news", "is", "flies", "good", "you’re", "pilot"},
            //133
            {"time", "bruce", "lee", "if", "you", "spend", "too", "much", "thinking", "about", "a", "thing", "you’ll", "never", "get", "it", "done"},
            //134
            {"time", "wayne", "dyer", "procrastination", "is", "the", "art", "of", "keeping", "up", "with", "yesterday", "and", "avoiding", "today"},
            //135
            {"time", "john", "c", "maxwell", "management", "is", "an", "oxymoron", "beyond", "our", "control", "and", "the", "clock", "keeps", "ticking", "regardless", "of", "how", "we", "lead", "lives", "priority", "answer", "to", "maximizing", "have"}
    };

    public static String getTimeQuote(int position) {
        return quotesTime[position];
    }

    public static String getTimeAuthor(int position) {
        return quotesTimeAuthors[position];
    }

    public static String[] getTimeList() {
        return quotesTime;
    }

    static String[][]getTimeTags() {
        return timeTags;
    }

    public static int getTimeListSize() {
        return quotesTime.length;
    }
}
