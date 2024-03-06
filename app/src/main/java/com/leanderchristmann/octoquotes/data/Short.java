package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Short {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesShort and quotesShortAuthors
        int listSize = getShortListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesShort[randomIndexToSwap];
            tempAuthor = quotesShortAuthors[randomIndexToSwap];
            tempTags = shortTags[randomIndexToSwap];
            quotesShort[randomIndexToSwap] = quotesShort[i];
            quotesShortAuthors[randomIndexToSwap] = quotesShortAuthors[i];
            shortTags[randomIndexToSwap] = shortTags[i];
            quotesShort[i] = tempQuote;
            quotesShortAuthors[i] = tempAuthor;
            shortTags[i] = tempTags;
        }
    }

    private static String[] quotesShort = {
            //0
            "\"If it matters to you, you'll find a way.\"",
            //1
            "\"The only thing that can stop me, is me.\"",
            //2
            "\"If you fail to prepare, your're prepared to fail.\"",
            //3
            "\"Yesterday you said tomorrow. Just do it.\"",
            //4
            "\"Keep going. Be all in.\"",
            //5
            "\"Don't tell people your plans. Show them your results.\"",
            //6
            "\"I failed my way to success.\"",
            //7
            "\"Success demands singleness of purpose.\"",
            //8
            "\"Take the risk or lose the chance.\"",
            //9
            "\"Change the world by being yourself.\"",
            //10
            "\"Life begins at the end of your comfort zone.\"",
            //11
            "\"Be so good they can't ignore you.\"",
            //12
            "\"You get what you give.\"",
            //13
            "\"Know your worth.\"",
            //14
            "\"May god have mercy upon my enemies. Cause I won't.\"",
            //15
            "\"Turn your wounds into wisdom.\"",
            //16
            "\"We accept the love we think we deserve.\"",
            //17
            "\"To be the best, you must be able to handle the worst.\"",
            //18
            "\"What we think, we become.\"",
            //19
            "\"Be a voice. Not an echo.\"",
            //20
            "\"It hurt because it mattered.\"",
            //21
            "\"I won’t apologize for who I am.\"",
            //22
            "\"The key to immortality is first living a life worth remembering.\"",
            //23
            "\"Don’t show up to prove. Show up to improve.\"",
            //24
            "\"It always seems impossible until it’s done.\"",
            //25
            "\"No pressure, no diamonds.\"",
            //26
            "\"Die with memories, not dreams.\"",
            //27
            "\"Try to be a rainbow in someone’s cloud.\"",
            //28
            "\"Happiness is not by chance, but by choice.\"",
            //29
            "\"Screw it, let’s do it.\"",
            //30
            "\"It is never too late to be what you might have been.\"",
            //31
            "\"When nothing goes right, go left.\"",
            //32
            "\"With our thoughts, we make the world.\"",
            //33
            "\"The meaning of life is to give life meaning.\"",
            //34
            "\"Impossible is for the unwilling.\"",
            //35
            "\"To live will be an awfully big adventure.\"",
            //36
            "\"Happiness depends upon ourselves.\"",
            //37
            "\"My life is my message.\"",
            //38
            "\"Reality is wrong, dreams are for real.\"",
            //39
            "\"He who has a why to live can bear almost any how.\"",
            //40
            "\"Act as if what you do makes a difference. It does.\"",
            //41
            "\"Try again. Fail again. Fail better.\"",
            //42
            "\"Never  let your emotions overpower your intelligence.\"",
            //43
            "\"It’s not what you look at that matters, it’s what you see.\"",
            //44
            "\"Don’t let your loyalty become slavery.\"",
            //45
            "\"Broken crayons still color.\"",
            //46
            "\"Act as if what you do makes a difference. It does.\"",
            //47
            "\"Opportunities don’t happen, you create them.\"",
            //48
            "\"You must be the change you wish to see in the world.\"",
            //49
            "\"Think and wonder, wonder and think.\"",
            //50
            "\"Everything has beauty, but not everyone sees it.\"",
            //51
            "\"A happy soul is the best shield for a cruel world.\"",
            //52
            "\"Be a good person. But don’t waste time to prove it.\"",
            //53
            "\"Why fit in when you were born to stand out?\"",
            //54
            "\"Change your life today.\"",
            //55
            "\"Don’t let the past steal your present.\"",
            //56
            "\"Perception is the root of all evil.\"",
            //57
            "\"Fall seven times, stand up eight.\"",
            //58
            "\"He who is brave is free.\"",
            //59
            "\"I could agree with you, but then we’d both be wrong.\"",
            //60
            "\"Make it happen.\"",
            //61
            "\"Believe you can and you’re halfway there.\"",
            //62
            "\"Once you choose hope, anything’s possible.\"",
            //63
            "\"Dream big. Start small. But most of all, start.\"",
            //64
            "\"Aspire to inspire before we expire.\"",
            //65
            "\"All limitations are self-imposed.\"",
            //66
            "\"Every moment is a fresh beginning.\"",
            //67
            "\"There are no facts, only interpretations.\"",
            //68
            "\"Stay close to what keeps you alive.\"",
            //69
            "\"Those who fly alone have the strongest wings.\"",
            //70
            "\"One day at a time.\"",
            //71
            "\"Everything you can imagine is real.\"",
            //72
            "\"I can, therefore I am.\"",
            //73
            "\"If you don’t risk anything, you risk even more.\"",
            //74
            "\"Change the game, don’t let the game change you.\"",
            //75
            "\"Believe you can and you’re halfway there.\"",
            //76
            "\"Life isn’t about finding yourself. Life is about creating yourself.\"",
            //77
            "\"Tough times never last but tough people do.\"",
            //78
            "\"Simplicity is the ultimate sophistication.\"",
            //79
            "\"Whatever you do, do it well.\"",
            //80
            "\"We need much less than we think we need.\"",
            //81
            "\"I have nothing to lose but something to gain.\"",
            //82
            "\"The roots of education are bitter, but the fruit is sweet.\"",
            //83
            "\"Every man dies. Not every man lives.\"",
            //84
            "\"When words fail, music speaks.\"",
            //85
            "\"Love for all, hatred for none.\"",
            //86
            "\"Whatever you are, be a good one.\"",
            //87
            "\"Happiness depends upon ourselves.\"",
            //88
            "\"Never regret anything that made you smile.\"",
            //89
            "\"The bird a nest, the spider a web, man friendship.\"",
            //90
            "\"The past does not equal the future.\"",
            //91
            "\"There is no substitute for hard work.\"",
            //92
            "\"Strive for greatness.\"",
            //93
            "\"Stay foolish to stay sane.\"",
            //94
            "\"Some days you have to create your own sunshine.\"",
            //95
            "\"Times will change for the better when you change.\"",
            //96
            "\"Nothing is impossible, the word itself says 'I’m possible'.\"",
            //97
            "\"You do not find the happy life. You make it.\"",
            //98
            "\"The trouble is you think you have time.\"",
            //99
            "\"Problems are not stop signs, they are guidelines.\"",
            //100
            "\"Creativity is intelligence having fun.\"",
            //101
            "\"Genius is 1% inspiration, 99% perspiration.\"",
            //102
            "\"Sometimes you win, sometimes you learn.\"",
            //103
            "\"An optimist ist he human personification of spring.\"",
            //104
            "\"Attitude is everything, so pick a good one.\"",
            //105
            "\"Your aspirations are your possibilities\"",
            //106
            "\"To fly, we have to have resistance.\"",
            //107
            "\"I was born to make mistakes, not to fake perfection.\"",
            //108
            "\"My life needs editing\"",
            //109
            "\"Dreams don't work unless you do.\"",
            //110
            "\"Begin anywhere.\"",
            //111
            "\"Make each day your masterpiece.\"",
            //112
            "\"What is life without a little risk?\"",
            //113
            "\"Don't seek happiness. Create it.\"",
            //114
            "\"Good vibes only.\"",
            //115
            "\"The world is not what it seems.\"",
            //116
            "\"A fake smile can hide a million tears.\"",
            //117
            "\"Love yourself. Love your day. Love your life.\"",
            //118
            "\"Ask me no questions, and I’ll tell you no lies.\"",
            //119
            "\"Do more of what makes you happy.\"",
            //120
            "\"You have to stay strong when it gets tough.\"",
            //121
            "\"True love stories never have an ending.\"",
            //122
            "\"I don’t trust words, I trust actions.\"",
            //123
            "\"There are no mistakes in life, only lessons.\"",
            //124
            "\"Comparison is the thief of joy.\"",
            //125
            "\"Trust is a small word with a big concept.\"",
            //126
            "\"Time is precious, waste it wisely.\"",
            //127
            "\"Respect for those who deserve it, not for those who demand it.\"",
            //128
            "\"Love me or hate me I’m still gonna shine.\"",
            //129
            "\"Always hope. Never expect.\"",
            //130
            "\"Stop checking my status! Go Get A Life.\"",
            //131
            "\"If you have never failed you have never lived.\"",
            //132
            "\"Always smile. It confuses people.\"",
            //133
            "\"Enjoy life. There’s plenty of time to be dead.\"",
            //134
            "\"Totally available!! Please disturb me!!\"",
            //135
            "\"Life is a onetime offer, use it well.\"",
            //136
            "\"Life is short, break the rules.\"",
            //137
            "\"Sometimes the wrong person teaches us the right lessons in life.\"",
            //138
            "\"Always be kinder than you feel.\"",
            //139
            "\"Life is a data pack, use every GB completely.\"",
            //140
            "\"Follow your heart.\"",
            //141
            "\"Life is a beautiful struggle.\"",
            //142
            "\"Make more moves and less announcements.\"",
            //143
            "\"Care less. Smile more.\"",
            //144
            "\"Work hard, dream big!\"",
            //145
            "\"Life is a game, play it!\"",
            //146
            "\"Nowadays people know the price of everything and the value of nothing.\"",
            //147
            "\"Love the life you live, and live the life you love.\"",
            //148
            "\"Life goes on. With or without you.\"",
            //149
            "\"You can do anything, but not everything.\"",
            //150
            "\"Life is better when you’re laughing.\"",
            //151
            "\"Don’t go through life, grow through life.\""
    };
    private static String[] quotesShortAuthors = {
            //0
            "Charlie Gilkey",
            //1
            "Unknown",
            //2
            "Mark Spitz",
            //3
            "Nike",
            //4
            "Byran Hutchinson",
            //5
            "Unknown",
            //6
            "Thomas A. Edison",
            //7
            "Vince Lombardi",
            //8
            "Unknown",
            //9
            "Amy Poehler",
            //10
            "Unkown",
            //11
            "Steve Martin",
            //12
            "Jennifer Lopez",
            //13
            "Unknown",
            //14
            "Unknown",
            //15
            "Oprah Winfrey",
            //16
            "Stephen Chbosky",
            //17
            "Wilson Kanadi",
            //18
            "Buddha",
            //19
            "Albert Einstein",
            //20
            "John Green",
            //21
            "Unknown",
            //22
            "Bruce Lee",
            //23
            "Simon Sinek",
            //24
            "Nelson Mandela",
            //25
            "Thomas Carlyle",
            //26
            "Unknown",
            //27
            "Maya Angelou",
            //28
            "Jim Rohn",
            //29
            "Richard Branson",
            //30
            "George Eliot",
            //31
            "Unknown",
            //32
            "Buddhist proverb",
            //33
            "Ken Hudgins",
            //34
            "John Keats",
            //35
            "Peter Pan",
            //36
            "Aristotle",
            //37
            "Mahatma Gandhi",
            //38
            "Tupac",
            //39
            "Friedrich Nietzsche",
            //40
            "Martin Luther King Jr.",
            //41
            "Samuel Beckett",
            //42
            "Drake",
            //43
            "Henry David Thoreau",
            //44
            "Unknown",
            //45
            "Unknown",
            //46
            "William James",
            //47
            "Chris Grosser",
            //48
            "Mahatma Gandhi",
            //49
            "Dr. Seuss",
            //50
            "Confucius",
            //51
            "Atticus",
            //52
            "Unknown",
            //53
            "Dr. Seuss",
            //54
            "Nelson Mandela",
            //55
            "Unknown",
            //56
            "Unknown",
            //57
            "Japanese proverb",
            //58
            "Seneca",
            //59
            "Harvey Specter (Suits)",
            //60
            "Unknown",
            //61
            "Theodore Roosevelt",
            //62
            "Cristopher Reeve",
            //63
            "Simon Sinek",
            //64
            "Unknown",
            //65
            "Oliver Wendell Holmes",
            //66
            "T. S. Eliot",
            //67
            "Friedrich Nietzsche",
            //68
            "Unknown",
            //69
            "Unknown",
            //70
            "Unknown",
            //71
            "Pablo Picasso",
            //72
            "Simone Weil",
            //73
            "Erica Jong",
            //74
            "Macklemore",
            //75
            "Theodore Roosevelt",
            //76
            "George Bernard Shaw",
            //77
            "Robert H. Schiuller",
            //78
            "Leonardo da Vinci",
            //79
            "Walt Disney",
            //80
            "Maya Angelou",
            //81
            "Eminem",
            //82
            "Aristotle",
            //83
            "William Wallace",
            //84
            "William Shakespeare",
            //85
            "Khalifatul Masih III",
            //86
            "Abraham Lincoln",
            //87
            "Aristotle",
            //88
            "Mark Twain",
            //89
            "William Blake",
            //90
            "Tony Robbins",
            //91
            "Thomas A. Edison",
            //92
            "Lebron James",
            //93
            "Maxime Lagacé",
            //94
            "Unknown",
            //95
            "Unknown",
            //96
            "Audrey Hepburn",
            //97
            "Camilla Eyring Kimball",
            //98
            "Buddha",
            //99
            "Robert H. Schiuller",
            //100
            "Albert Einstein",
            //101
            "Thomas A. Edison",
            //102
            "John C. Maxwell",
            //103
            "Susan J. Bissonette",
            //104
            "Wayne Dyer",
            //105
            "Samuel Johnson",
            //106
            "Maya Lin",
            //107
            "Drake",
            //108
            "Mort Sahl",
            //109
            "John C. Maxwell",
            //110
            "John Cage",
            //111
            "John Wooden",
            //112
            "J. K. Rowling",
            //113
            "Unknown",
            //114
            "Unknown",
            //115
            "Unknown",
            //116
            "Unknown",
            //117
            "Unknown",
            //118
            "Unknown",
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
            "Unknown",
            //126
            "Unknown",
            //127
            "Unknown",
            //128
            "Unknown",
            //129
            "Unknown",
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
            "Unknown",
            //140
            "Unknown",
            //141
            "Unknown",
            //142
            "Unknown",
            //143
            "Unknown",
            //144
            "Unknown",
            //145
            "Unknown",
            //146
            "Unknown",
            //147
            "Unknown",
            //148
            "Unknown",
            //149
            "Unknown",
            //150
            "Unknown",
            //151
            "Unknown"
    };
    private static String[][] shortTags = {
            //0
            {"short", "charlie", "gilkey", "if", "it", "matters", "to", "you", "you'll", "find", "a", "way"},
            //1
            {"short", "the", "only", "thing", "that", "can", "stop", "me", "is"},
            //2
            {"short", "mark", "spitz", "if", "you", "fail", "to", "prepare", "your're", "prepared"},
            //3
            {"short", "nike", "yesterday", "you", "said", "tomorrow", "just", "do", "it"},
            //4
            {"short", "bryan", "hutchinson", "keep", "going", "be", "all", "in"},
            //5
            {"short", "don't", "tell", "people", "your", "plans", "show", "them", "results"},
            //6
            {"short", "thomas", "a", "alpha", "edison", "i", "failed", "my", "way", "to", "success"},
            //7
            {"short", "vince", "lombardi", "success", "demands", "singleness", "of", "purpose"},
            //8
            {"short", "take", "the", "risk", "or", "lose", "chance"},
            //9
            {"short", "amy", "poehler", "change", "the", "world", "by", "being", "yourself"},
            //10
            {"short", "life", "begins", "at", "the", "end", "of", "your", "comfort", "zone"},
            //11
            {"short", "steve", "martin", "be", "so", "good", "they", "can't", "ignore", "you"},
            //12
            {"short", "jennifer", "lopez", "you", "get", "what", "give"},
            //13
            {"short", "know", "your", "worth"},
            //14
            {"short", "may", "god", "have", "mercy", "upon", "my", "enemies", "cause", "i", "won't"},
            //15
            {"short", "oprah", "winfrey", "turn", "your", "wounds", "into", "wisdom"},
            //16
            {"short", "stephen", "chbosky", "we", "accept", "the", "love", "think", "deserve"},
            //17
            {"short", "wilson", "kanadi", "to", "be", "the", "best", "you", "must", "able", "handle", "worst"},
            //18
            {"short", "buddha", "what", "we", "think", "become"},
            //19
            {"short", "albert", "einstein", "be", "a", "voice", "not", "an", "echo"},
            //20
            {"short", "john", "green", "it", "hurt", "because", "mattered"},
            //21
            {"short", "i", "won’t", "apologize", "for", "who", "am"},
            //22
            {"short", "bruce", "lee", "the", "key", "to", "immortality", "is", "first", "living", "a", "life", "worth", "remembering"},
            //23
            {"short", "simon", "sinek", "don’t", "show", "up", "to", "prove", "improve"},
            //24
            {"short", "nelson", "mandela", "it", "always", "seems", "impossible", "until", "it’s", "done"},
            //25
            {"short", "thomas", "carlyle", "no", "pressure", "diamonds"},
            //26
            {"short", "die", "with", "memories", "not", "dreams"},
            //27
            {"short", "maya", "angelou", "try", "to", "be", "a", "rainbow", "in", "someone’s", "cloud"},
            //28
            {"short", "jim", "rohn", "happiness", "is", "not", "by", "chance", "but", "choice"},
            //29
            {"short", "richard", "branson", "screw", "it", "let’s", "do"},
            //30
            {"short", "george", "eliot", "it", "is", "never", "too", "late", "to", "be", "what", "you", "might", "have", "been"},
            //31
            {"short", "when", "nothing", "goes", "right", "go", "left"},
            //32
            {"short", "buddhist", "proverb", "with", "our", "thoughts", "we", "make", "the", "world"},
            //33
            {"short", "ken", "hudgins", "the", "meaning", "of", "life", "is", "to", "give"},
            //34
            {"short", "john", "keats", "impossible", "is", "for", "the", "unwilling"},
            //35
            {"short", "peter", "pan", "to", "live", "will", "be", "an", "awfully", "big", "adventure"},
            //36
            {"short", "aristotle", "happiness", "depends", "upon", "ourselves"},
            //37
            {"short", "mahatma", "gandhi", "my", "life", "is", "message"},
            //38
            {"short", "tupac", "reality", "is", "wrong", "dreams", "are", "for", "real"},
            //39
            {"short", "friedrich", "nietzsche", "he", "who", "has", "a", "why", "to", "live", "can", "bear", "almost", "any", "how"},
            //40
            {"short", "martin", "luther", "king", "jr", "act", "as", "if", "what", "you", "do", "makes", "a", "difference", "it", "does"},
            //41
            {"short", "samuel", "beckett", "try", "again", "fail", "better"},
            //42
            {"short", "drake", "never", "let", "your", "emotions", "overpower", "intelligence"},
            //43
            {"short", "henry", "d", "david", "thoreau", "it’s", "not", "what", "you", "look", "at", "that", "matters", "see"},
            //44
            {"short", "don’t", "let", "your", "loyalty", "become", "slavery"},
            //45
            {"short", "broken", "crayons", "still", "color"},
            //46
            {"short", "william", "james", "act", "as", "if", "what", "you", "do", "makes", "a", "difference", "it", "does"},
            //47
            {"short", "chris", "grosser", "opportunities", "don’t", "happen", "you", "create", "them"},
            //48
            {"short", "mahatma", "gandhi", "you", "must", "be", "the", "change", "wish", "to", "see", "in", "world"},
            //49
            {"short", "dr", "seuss", "think", "and", "wonder"},
            //50
            {"short", "confucius", "everything", "has", "beauty", "but", "not", "everyone", "sees", "it"},
            //51
            {"short", "atticus", "a", "happy", "soul", "is", "the", "best", "shield", "for", "cruel", "world"},
            //52
            {"short", "be", "a", "good", "person", "but", "don’t", "waste", "time", "to", "prove", "it"},
            //53
            {"short", "dr", "seuss", "why", "fit", "in", "when", "you", "were", "born", "to", "stand", "out"},
            //54
            {"short", "nelson", "mandela", "change", "your", "life", "today"},
            //55
            {"short", "don’t", "let", "the", "past", "steal", "your", "present"},
            //56
            {"short", "perception", "is", "the", "root", "of", "all", "evil"},
            //57
            {"short", "japanese", "proverb", "fall", "seven", "times", "stand", "up", "eight"},
            //58
            {"short", "seneca", "he", "who", "is", "brave", "free"},
            //59
            {"short", "harvey", "specter", "suits", "i", "could", "agree", "with", "you", "but", "then", "we’d", "both", "be", "wrong"},
            //60
            {"short", "make", "it", "happen"},
            //61
            {"short", "theodore", "roosevelt", "believe", "you", "can", "and", "you’re", "halfway", "there"},
            //62
            {"short", "cristopher", "reeve", "once", "you", "choose", "hope", "anything’s", "possible"},
            //63
            {"short", "simon", "sinek", "dream", "big", "start", "small", "but", "most", "of", "all"},
            //64
            {"short", "aspire", "to", "inspire", "before", "we", "expire"},
            //65
            {"short", "oliver", "wendell", "holmes", "all", "limitations", "are", "selfimposed"},
            //66
            {"short", "t", "s", "eliot", "every", "moment", "is", "a", "fresh", "beginning"},
            //67
            {"short", "friedrich", "nietzsche", "there", "are", "no", "facts", "only", "interpretations"},
            //68
            {"short", "stay", "close", "to", "what", "keeps", "you", "alive"},
            //69
            {"short", "those", "who", "fly", "alone", "have", "the", "strongest", "wings"},
            //70
            {"short", "one", "day", "at", "a", "time"},
            //71
            {"short", "pablo", "picasso", "everything", "you", "can", "imagine", "is", "real"},
            //72
            {"short", "simone", "weil", "i", "can", "therefore", "am"},
            //73
            {"short", "erica", "jong", "if", "you", "don’t", "risk", "anything", "even", "more"},
            //74
            {"short", "macklemore", "change", "the", "game", "don’t", "let", "you"},
            //75
            {"short", "theodore", "roosevelt", "believe", "you", "can", "and", "you’re", "halfway", "there"},
            //76
            {"short", "george", "b", "bernard", "shaw", "life", "isn’t", "about", "finding", "yourself", "is", "creating"},
            //77
            {"short", "robert", "h", "schiuller", "tough", "times", "never", "last", "but", "people", "do"},
            //78
            {"short", "leonardo", "da", "vinci", "simplicity", "is", "the", "ultimate", "sophistication"},
            //79
            {"short", "walt", "disney", "whatever", "you", "do", "it", "well"},
            //80
            {"short", "maya", "angelou", "we", "need", "much", "less", "than", "think"},
            //81
            {"short", "eminem", "i", "have", "nothing", "to", "lose", "but", "something", "gain"},
            //82
            {"short", "aristotle", "the", "roots", "of", "education", "are", "bitter", "but", "fruit", "is", "sweet"},
            //83
            {"short", "william", "wallace", "every", "man", "dies", "not", "lives"},
            //84
            {"short", "william", "shakespeare", "when", "words", "fail", "music", "speaks"},
            //85
            {"short", "khalifatul", "masih", "3", "love", "for", "all", "hatred", "none"},
            //86
            {"short", "abraham", "lincoln", "whatever", "you", "are", "be", "a", "good", "one"},
            //87
            {"short", "aristotle", "happiness", "depends", "upon", "ourselves"},
            //88
            {"short", "mark", "twain", "never", "regret", "anything", "that", "made", "you", "smile"},
            //89
            {"short", "william", "blake", "the", "bird", "a", "nest", "spider", "web", "man", "friendship"},
            //90
            {"short", "tony", "robbins", "the", "past", "does", "not", "equal", "future"},
            //91
            {"short", "thomas", "a", "alpha", "edison", "there", "is", "no", "substitute", "for", "hard", "work"},
            //92
            {"short", "lebron", "james", "strive", "for", "greatness"},
            //93
            {"short", "maxime", "legacé", "legace", "stay", "foolish", "to", "sane"},
            //94
            {"short", "some", "days", "you", "have", "to", "create", "your", "own", "sunshine"},
            //95
            {"short", "times", "will", "change", "for", "the", "better", "when", "you"},
            //96
            {"short", "audrey", "hepburn", "nothing", "is", "impossible", "the", "word", "itself", "says", "im", "possible"},
            //97
            {"short", "camilla", "e", "eyring", "kimball", "you", "do", "not", "find", "the", "happy", "life", "make", "it"},
            //98
            {"short", "buddha", "the", "trouble", "is", "you", "think", "have", "time"},
            //99
            {"short", "robert", "h", "schiuller", "problems", "are", "not", "stop", "signs", "they", "guidelines"},
            //100
            {"short", "albert", "einstein", "creativity", "is", "intelligence", "having", "fun"},
            //101
            {"short", "thomas", "a", "alpha", "edison", "genius", "is", "1%", "inspiration", "99%", "perspiration"},
            //102
            {"short", "john", "c", "maxwell", "sometimes", "you", "win", "learn"},
            //103
            {"short", "susan", "j", "bissonette", "an", "optimist", "ist", "he", "human", "personification", "of", "spring"},
            //104
            {"short", "wayne", "dyer", "attitude", "is", "everything", "so", "pick", "a", "good", "one"},
            //105
            {"short", "samuel", "johnson", "your", "aspirations", "are", "possibilities"},
            //106
            {"short", "maya", "lin", "to", "fly", "we", "have", "resistance"},
            //107
            {"short", "drake", "i", "was", "born", "to", "make", "mistakes", "not", "fake", "perfection"},
            //108
            {"short", "mort", "sahl", "my", "life", "needs", "editing"},
            //109
            {"short", "john", "c", "maxwell", "dreams", "don't", "work", "unless", "you", "do"},
            //110
            {"short", "john", "cage", "begin", "anywhere"},
            //111
            {"short", "john", "wooden", "make", "each", "day", "your", "masterpiece"},
            //112
            {"short", "j", "joanne", "k", "rowling", "what", "is", "life", "without", "a", "little", "risk"},
            //113
            {"short", "don't", "seek", "happiness", "create", "it"},
            //114
            {"short", "good", "vibes", "only"},
            //115
            {"short", "the", "world", "is", "not", "what", "it", "seems"},
            //116
            {"short", "a", "fake", "smile", "can", "hide", "million", "tears"},
            //117
            {"short", "love", "yourself", "your", "day", "life"},
            //118
            {"short", "ask", "me", "no", "questions", "and", "i’ll", "tell", "you", "lies"},
            //119
            {"short", "do", "more", "of", "what", "makes", "you", "happy"},
            //120
            {"short", "you", "have", "to", "stay", "strong", "when", "it", "gets", "tough"},
            //121
            {"short", "true", "love", "stories", "never", "have", "an", "ending"},
            //122
            {"short", "i", "don’t", "trust", "words", "actions"},
            //123
            {"short", "there", "are", "no", "mistakes", "in", "life", "only", "lessons"},
            //124
            {"short", "comparison", "is", "the", "thief", "of", "joy"},
            //125
            {"short", "trust", "is", "a", "small", "word", "with", "big", "concept"},
            //126
            {"short", "time", "is", "precious", "waste", "it", "wisely"},
            //127
            {"short", "respect", "for", "those", "who", "deserve", "it", "not", "demand"},
            //128
            {"short", "love", "me", "or", "hate", "i’m", "still", "gonna", "shine"},
            //129
            {"short", "always", "hope", "never", "expect"},
            //130
            {"short", "stop", "checking", "my", "status", "go", "get", "a", "life"},
            //131
            {"short", "if", "you", "have", "never", "failed", "lived"},
            //132
            {"short", "always", "smile", "it", "confuses", "people"},
            //133
            {"short", "enjoy", "life", "there’s", "plenty", "of", "time", "to", "be", "dead"},
            //134
            {"short", "totally", "available", "please", "disturb", "me"},
            //135
            {"short", "life", "is", "a", "onetime", "offer", "use", "it", "well"},
            //136
            {"short", "life", "is", "break", "the", "rules"},
            //137
            {"short", "sometimes", "the", "wrong", "person", "teaches", "us", "right", "lessons", "in", "life"},
            //138
            {"short", "always", "be", "kinder", "than", "you", "feel"},
            //139
            {"short", "life", "is", "a", "data", "pack", "use", "every", "gb", "completely"},
            //140
            {"short", "follow", "your", "heart"},
            //141
            {"short", "life", "is", "a", "beautiful", "struggle"},
            //142
            {"short", "make", "more", "moves", "and", "less", "announcements"},
            //143
            {"short", "care", "less", "smile", "more"},
            //144
            {"short", "work", "hard", "dream", "big"},
            //145
            {"short", "life", "is", "a", "game", "play", "it"},
            //146
            {"short", "nowadays", "people", "know", "the", "price", "of", "everything", "and", "value", "nothing"},
            //147
            {"short", "love", "the", "life", "you", "live", "and"},
            //148
            {"short", "life", "goes", "on", "with", "or", "without", "you"},
            //149
            {"short", "you", "can", "do", "anything", "but", "not", "everything"},
            //150
            {"short", "life", "is", "better", "when", "you’re", "laughing"},
            //151
            {"short", "don’t", "go", "through", "life", "grow"}
    };

    public static String getShortQuote(int position) {
        return quotesShort[position];
    }

    public static String getShortAuthor(int position) {
        return quotesShortAuthors[position];
    }

    public static String[] getShortList() {
        return quotesShort;
    }

    static String[][] getShortTags() {
        return shortTags;
    }

    public static int getShortListSize() {
        return quotesShort.length;
    }
}
