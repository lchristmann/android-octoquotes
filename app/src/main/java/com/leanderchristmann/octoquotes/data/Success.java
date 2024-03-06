package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Success {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesSuccess and quotesSuccessAuthors
        int listSize = getSuccessListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesSuccess[randomIndexToSwap];
            tempAuthor = quotesSuccessAuthors[randomIndexToSwap];
            tempTags = successTags[randomIndexToSwap];
            quotesSuccess[randomIndexToSwap] = quotesSuccess[i];
            quotesSuccessAuthors[randomIndexToSwap] = quotesSuccessAuthors[i];
            successTags[randomIndexToSwap] = successTags[i];
            quotesSuccess[i] = tempQuote;
            quotesSuccessAuthors[i] = tempAuthor;
            successTags[i] = tempTags;
        }
    }

    private static String[] quotesSuccess = {
            //0
            "\"Don’t let the fear of losing be greater than the excitement of winning.\"",
            //1
            "\"Unsuccessful people make their decisions based on their current situations. Successful people make their decisions based on where they want to be.\"",
            //2
            "\"We are kept from our goal not by obstacles but by a clear path to a lesser goal.\"",
            //3
            "\"Things which matter most must never be at the mercy of things which matter least.\"",
            //4
            "\"If you really look closely, most overnight successes took a long time.\"",
            //5
            "\"The ones who are crazy enough to think they can change the world, are the ones that do.\"",
            //6
            "\"Greatness only comes before hustle in the dictionary.\"",
            //7
            "\"The master has failed more times than the beginner has even tried.\"",
            //8
            "\"If it is important to you, you will find a way. If not, you’ll find an excuse.\"",
            //9
            "\"Things may come to those who wait, but only the things left by those who hustle.\"",
            //10
            "\"I wake up every morning and think to myself, ‘how far can I push this company in the next 24 hours.\"",
            //11
            "\"Singleness of purpose is one of the chief essentials for success in life, no matter what may be one’s aim.\"",
            //12
            "\"Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do.\"",
            //13
            "\"I cannot give you the formula for success, but I can give you the formula for failure – it is: try to please everybody.\"",
            //14
            "\"Success is relative: It is what we can make of the mess we have made of things.\"",
            //15
            "\"I failed my way to success.\"",
            //16
            "\"Prepare yourself for success. You have to see it coming to get there.\"",
            //17
            "\"Success is walking from failure to failure with no loss of enthusiasm.\"",
            //18
            "\"If you chase two rabbits you will not catch either one.\"",
            //19
            "\"Every champion was once a contender that didn’t give up.\"",
            //20
            "\"Failure is success if we learn from it.\"",
            //21
            "\"Hustle in silence and let your success make the noise.\"",
            //22
            "\"Be like a postage stamp – stick to one thing until you get there.\"",
            //23
            "\"Wealth isn’t about having a lot of money it’s about having a lot of options.\"",
            //24
            "\"Productivity isn’t about being a workhorse, keeping busy or burning the midnight oil… It’s more about priorities, planning, and fiercely protecting your time.\"",
            //25
            "\"If you hang out with chickens, you’re going to cluck and if you hang out with eagles, you’re going to fly.\"",
            //26
            "\"In order to succeed, your desire for success should be greater than your fear of failure.\"",
            //27
            "\"Planning is bringing the future into the present so that you can do something about it now.\"",
            //28
            "\"A goal is a dream with a deadline.\"",
            //29
            "\"The only place where success comes before work is in the dictionary.\"",
            //30
            "\"If you are not willing to risk the unusual, you will have to settle for the ordinary.\"",
            //31
            "\"I never dreamt of success. I worked for it.\"",
            //32
            "\"To get through the hardest journey we need to take only one step at a time, but we must keep on stepping.\"",
            //33
            "\"If you really want to do something, you’ll find a way. If you don’t you’ll find an excuse.\"",
            //34
            "\"Some people dream of success while others wake up and work.\"",
            //35
            "\"The secret of success is constancy to purpose.\"",
            //36
            "\"Efficiency is doing the thing right. Effectiveness is doing the right thing.\"",
            //37
            "\"If you don’t build your dream someone will hire you to help build theirs.\"",
            //38
            "\"When 99% of people doubt your idea, you’re either gravely wrong or about to make history.\"",
            //39
            "\"It’s not all sunshine and rainbows, but a good amount of it actually is.\"",
            //40
            "\"Success is simple. Do what’s right, the right way, at the right time.\"",
            //41
            "\"All progress takes place outside the comfort zone.\"",
            //42
            "\"Success is liking yourself, liking what you do, and liking how you do it.\"",
            //43
            "\"You don’t need to see the whole staircase, just take the first step.\"",
            //44
            "\"In order to succeed, we must first believe that we can.\"",
            //45
            "\"I never did anything worth doing by accident, not did any of my intentions come by accident; they came by work.\"",
            //46
            "\"Every successful person in the world is a hustler one way or another. We all hustle to get where we need to be. Only a fool would sit around and wait on another man to feed him.\"",
            //47
            "\"Be happy with what you have while working for what you want.\"",
            //48
            "\"I never dreamed about success, I worked for it.\"",
            //49
            "\"Success seems to be connected with action. Successful people keep moving. They make mistakes, but they don’t quit.\"",
            //50
            "\"Build your own dreams, or someone else will hire you to build theirs.\"",
            //51
            "\"When you want to succeed as bad as you want to breathe, then you’ll be successful.\"",
            //52
            "\"Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful.\"",
            //53
            "\"Big results require big ambitions.\"",
            //54
            "\"For success, attitude is equally as important as ability.\"",
            //55
            "\"In the end, when it’s over, all that matters is what you’ve done.\"",
            //56
            "\"If you talk about it, it’s a dream. If you envision it, it’s possible. If you schedule it, it’s real.\"",
            //57
            "\"When you take risks you learn that there will be times when you succeed and there will be times when you fail, and both are equally important.\"",
            //58
            "\"Success demands singleness of purpose.\"",
            //59
            "\"No one is to blame for your future situation but yourself. If you want to be successful, then become successful.\"",
            //60
            "\"If you believe in yourself and have dedication and pride – and never quit, you’ll be a winner. The price of victory is high but so are the rewards.\"",
            //61
            "\"Every great change starts like falling dominoes.\"",
            //62
            "\"Focus on being productive instead of busy.\"",
            //63
            "\"If you are going to be successful, you need to give up the phrase, ‘I can’t’ and all of its cousins, such as ‘I wish I were able to.\"",
            //64
            "\"Start where you are. Use what you have. Do what you can.\"",
            //65
            "\"Don’t stop when you’re tired. Stop when you’re done.\"",
            //66
            "\"There are no secrets to success. It is the result of preparation, hard work, and learning from failure.\"",
            //67
            "\"If the plan doesn’t work, change the plan, but never the goal.\"",
            //68
            "\"Throw me to the wolves and I will return leading the pack.\"",
            //69
            "\"If you trust in yourself… and believe in your dreams… and follow your star… you’ll still get beaten by people who spent their time working hard and learning things and weren’t so lazy.\"",
            //70
            "\"People do not decide their futures, they decide their habits and their habits decide their futures.\"",
            //71
            "\"If everyone is moving forward together, then success takes care of itself.\"",
            //72
            "\"Nobody who ever gave his best regretted it.\"",
            //73
            "\"When someone says you can’t do it, do it twice and take pictures.\"",
            //74
            "\"Champions keep playing until they get it right.\"",
            //75
            "\"What you get by achieving your goals is not as important as what you become by achieving your goals.\"",
            //76
            "\"Do not be embarrassed by your failures, learn from them and start again.\"",
            //77
            "\"The best revenge is massive success.\"",
            //78
            "\"There is nothing impossible to him who will try.\"",
            //79
            "\"Focus is a matter of deciding what things you’re not going to do.\"",
            //80
            "\"Do one thing every day that scares you.\"",
            //81
            "\"One secret of success in life is for a man to be ready for his opportunity when it comes.\"",
            //82
            "\"The difference between successful people and very successful people is that very successful people say ‘no’ to almost everything.\"",
            //83
            "\"I didn’t get there by wishing for it, but by working for it.\"",
            //84
            "\"Don’t aim for success. If you want it, just do what you love and believe in, and it will come naturally.\"",
            //85
            "\"Concentrate all of your thoughts upon the work at hand. The sun’s rays do not burn until brought to a focus.\"",
            //86
            "\"Success is going from failure to failure without losing your enthusiasm.\"",
            //87
            "\"You can’t have a million-dollar dream on a minimum wage work ethic.\"",
            //88
            "\"The rung of a ladder was never meant to rest upon, but only to hold a man’s foot long enough to enable him to put the other somewhat higher.\"",
            //89
            "\"The things which are most important don’t always scream the loudest.\"",
            //90
            "\"Action is the foundational key to all success.\"",
            //91
            "\"There is a powerful driving force inside every human being that, once unleashed, can make any vision, dream, or desire a reality.\"",
            //92
            "\"Surround yourself only with people who are going to lift you higher.\"",
            //93
            "\"The difference between who you are and who you want to be is what you do.\"",
            //94
            "\"I attribute my success to this: I never gave or took any excuse.\"",
            //95
            "\"Don’t dream about success. Get out there and work for it.\"",
            //96
            "\"People who succeed have momentum. The more they succeed, the more they want to succeed, and the more they find a way to succeed.\"",
            //97
            "\"If you want rainbow, you have to deal with the rain.\"",
            //98
            "\"Quitters never win. Winners never quit!\"",
            //99
            "\"Success is not how high you have climbed, but how you make a positive difference to the world.\"",
            //100
            "\"I am thankful for all of those who said no to me. It’s because of them I’m doing it myself.\"",
            //101
            "\"It is those who concentrate on but one thing at a time who advance in this world.\"",
            //102
            "\"The secret of getting ahead is getting started. The secret to getting started is breaking your complex overwhelming tasks into small manageable tasks and then starting on the first one.\"",
            //103
            "\"The difference between a successful person and others is not lack of strength not a lack of knowledge but rather a lack of will.\"",
            //104
            "\"Success is the sum of small efforts, repeated day-in and day-out.\"",
            //105
            "\"You gotta stay hungry! Stay focused! And you better have heart! The heart of a champion!\"",
            //106
            "\"You have to learn the rules of the game. And then you have to play better than anyone else.\"",
            //107
            "\"The struggle itself towards the heights is enough to fill a man’s heart.\"",
            //108
            "\"Successful people are not gifted; they just work hard, then succeed on purpose.\"",
            //109
            "\"Eighty percent of success is showing up.\"",
            //110
            "\"When you don’t make the time to work on creating the life you want, you’re eventually going to be forced to spend a lot of time dealing with a life you don’t want.\"",
            //111
            "\"The key to success is to start before you are ready.\"",
            //112
            "\"But those Woulda-Coulda-Shouldas all ran away and hid from one little Did.\"",
            //113
            "\"Your positive action combined with positive thinking results in success.\"",
            //114
            "\"The maximum success is reached when you are never busy.\"",
            //115
            "\"You have reached the pinnacle of success as soon as you become uninterested in money, compliments, or publicity.\"",
            //116
            "\"Successful people do what unsuccessful people are not willing to do. Don’t wish it were easier; wish you were better.\"",
            //117
            "\"If you want to be successful, find out what the price is and then pay it.\"",
            //118
            "\"Success is never accidental.\"",
            //119
            "\"Success is not in what you have, but who you are.\"",
            //120
            "\"Self-Improvement and success go hand in hand. Taking the steps to make yourself a better and more well-rounded individual will prove to be a wise decision.\"",
            //121
            "\"The young do not know how to be prudent, and therefore they attempt the impossible – and achieve it, generation after generation.\"",
            //122
            "\"A minute’s success pays the failure of years.\"",
            //123
            "\"The path to success is to take massive, determined action.\"",
            //124
            "\"You get what you focus on.\"",
            //125
            "\"Failure is success in progress.\"",
            //126
            "\"The true success is the person who invented himself.\"",
            //127
            "\"Celebrate your successes. Find some humor in your failures.\"",
            //128
            "\"The people who succeed are irrationally passionate about something.\"",
            //129
            "\"Slow and steady is better than fast and shaky.\"",
            //130
            "\"If you set your goals ridiculously high and it’s a failure, you will fail above everyone else’s success.\"",
            //131
            "\"That some achieve great success, is proof to all that others can achieve it as well.\"",
            //132
            "\"Success is the progressive realization of predetermined, worthwhile, personal goals.\"",
            //133
            "\"The real opportunity for success lies within the person and not the job.\"",
            //134
            "\"Don't be distracted by criticism. Remember - the only taste of success some people get is to take a bite out of you.\"",
            //135
            "\"The secret to success is to know something nobody else knows.\"",
            //136
            "\"The biggest challenge after success is shutting up about it.\"",
            //137
            "\"You sleep on a win and you’ll wake up with a loss.\"",
            //138
            "\"Success is the child of audacity.\"",
            //139
            "\"It’s not that I’m so smart, it’s just that I stay with problems longer.\"",
            //140
            "\"Find somebody to be successful for. Raise their hopes. Think of their needs.\"",
            //141
            "\"Winning is a habit. Unfortunately, so is losing.\"",
            //142
            "\"Successful people use their time in a wise manner, unlike the mediocre people who squander it away on a daily basis.\"",
            //143
            "\"Failure is the condiment that gives success its flavor.\"",
            //144
            "\"My secret for success? I don’t know what the hell success means.\"",
            //145
            "\"When the water starts boiling it is foolish to turn off the heat.\"",
            //146
            "\"Before anything else, preparation is the key to success.\"",
            //147
            "\"Nothing is particularly hard if you break it down into small jobs.\"",
            //148
            "\"Clarity equals success.\"",
            //149
            "\"Make time for success every day, no matter what.\"",
            //150
            "\"If you have no critics you’ll likely have no success.\"",
            //151
            "\"Success is my only option, failure’s not.\"",
            //152
            "\"Shallow men believe in luck. Strong men believe in cause and effect.\"",
            //153
            "\"Your playing small does not serve the world. Who are you not to be great?\"",
            //154
            "\"Behind every successful man there’s a lot of unsuccessful years.\"",
            //155
            "\"I do not like to repeat successes, I like to go on to other things.\"",
            //156
            "\"The real test is not whether you avoid this failure, because you won't. It's whether you let it harden or shame you into inaction, or whether you learn from it; whether you choose to persevere.\""
    };
    private static String[] quotesSuccessAuthors = {
            //0
            "Robert Kiyosaki",
            //1
            "Benjamin Hardy",
            //2
            "Robert Brault",
            //3
            "Johann Wolfgang von Goethe",
            //4
            "Steve Jobs",
            //5
            "Unknown",
            //6
            "Ross Simmonds",
            //7
            "Stephen McCranie",
            //8
            "Ryan Blair",
            //9
            "Abraham Lincoln",
            //10
            "Leah Busque",
            //11
            "John D. Rockefeller",
            //12
            "Pele",
            //13
            "Herbert Bayard Swope",
            //14
            "T. S. Eliot",
            //15
            "Thomas A. Edison",
            //16
            "Destiny Booze",
            //17
            "Winston Churchill",
            //18
            "Russian proverb",
            //19
            "Gabby Douglas",
            //20
            "Malcolm Forbes",
            //21
            "Unknown",
            //22
            "Josh Billings",
            //23
            "Chris Rock",
            //24
            "Margarita Tartakovsky",
            //25
            "Steve Maraboli",
            //26
            "Bill Cosby",
            //27
            "Alan Lakein",
            //28
            "Napoleon Hill",
            //29
            "Vidal Sassoon",
            //30
            "Jim Rohn",
            //31
            "Estee Lauder",
            //32
            "Chinese proverb",
            //33
            "Jim Rohn",
            //34
            "Unknown",
            //35
            "Benjamin Disraeli",
            //36
            "Peter F. Drucker",
            //37
            "Tony Gaskins",
            //38
            "Scott Belsky",
            //39
            "Unknown",
            //40
            "Arnold H. Glasow",
            //41
            "Michael John Bobak",
            //42
            "Maya Angelou",
            //43
            "Martin Luther King Jr.",
            //44
            "Nikos Kazantzakis",
            //45
            "Plato",
            //46
            "K’wan",
            //47
            "Helen Keller",
            //48
            "Estee Lauder",
            //49
            "Conrad Hilton",
            //50
            "Farrah Gray",
            //51
            "Eric Thomas",
            //52
            "Unknown",
            //53
            "Heraclitus",
            //54
            "Harry F. Banks",
            //55
            "Alexander the Great",
            //56
            "Tony Robbins",
            //57
            "Ellen DeGeneres",
            //58
            "Vince Lombardi",
            //59
            "Jaymin Shah",
            //60
            "Bear Bryant",
            //61
            "B. J. Thornton",
            //62
            "Tim Ferriss",
            //63
            "Jack Canfield",
            //64
            "Arthur Ashe",
            //65
            "Unknkown",
            //66
            "Colin Powell",
            //67
            "Unknown",
            //68
            "Seneca",
            //69
            "Terry Pratchett",
            //70
            "F. M. Alexander",
            //71
            "Henry Ford",
            //72
            "George Halas",
            //73
            "Unknown",
            //74
            "Billie Jean King",
            //75
            "Henry David Thoreau",
            //76
            "Richard Branson",
            //77
            "Frank Sinatra",
            //78
            "Alexander the Great",
            //79
            "John Carmack",
            //80
            "Eleanor Roosevelt",
            //81
            "Benjamin Disraeli",
            //82
            "Warren Buffett",
            //83
            "Estee Lauder",
            //84
            "David Frost",
            //85
            "Alexander Graham Bell",
            //86
            "Winston Churchill",
            //87
            "Unknown",
            //88
            "Thomas Henry Huxley",
            //89
            "Bob Hawke",
            //90
            "Pablo Picasso",
            //91
            "Anthony Robbins",
            //92
            "Oprah Winfrey",
            //93
            "Unknown",
            //94
            "Florence Nightingale",
            //95
            "Unknown",
            //96
            "Tony Robbins",
            //97
            "Augustus",
            //98
            "Dr. Irene C. Kassorla",
            //99
            "Roy T. Bennett",
            //100
            "Albert Einstein",
            //101
            "Og Mandino",
            //102
            "Mark Twain",
            //103
            "Vince Lombardi",
            //104
            "Robert Collier",
            //105
            "Eric Thomas",
            //106
            "Albert Einstein",
            //107
            "Albert Camus",
            //108
            "G. K. Nielson",
            //109
            "Woody Allen",
            //110
            "Kevin Ngo",
            //111
            "Marie Forleo",
            //112
            "Shel Silverstein",
            //113
            "Shiv Khera",
            //114
            "Nassim Nicholas Taleb",
            //115
            "Thomas Wolfe",
            //116
            "Jim Rohn",
            //117
            "Scott Adam",
            //118
            "Jack Dorsey",
            //119
            "Bo Bennett",
            //120
            "Frank Long",
            //121
            "Pearl S. Buck",
            //122
            "Robert Browning",
            //123
            "Tony Robbins",
            //124
            "David Justus",
            //125
            "Albert Einstein",
            //126
            "Al Goldstein",
            //127
            "Sam Walton",
            //128
            "Naval Ravikant",
            //129
            "Maxime Legacé",
            //130
            "James Cameron",
            //131
            "Abraham Lincoln",
            //132
            "Paul J. Meyer",
            //133
            "Zig Ziglar",
            //134
            "Zig Ziglar",
            //135
            "Aristotle",
            //136
            "Criss Jami",
            //137
            "Conor McGregor",
            //138
            "Benjamin Disraeli",
            //139
            "Albert Einstein",
            //140
            "Barack Obama",
            //141
            "Vince Lombardi",
            //142
            "Unknown",
            //143
            "Truman Capote",
            //144
            "Al Lewis",
            //145
            "Nelson Mandela",
            //146
            "Alexander Graham Bell",
            //147
            "Henry Ford",
            //148
            "Greg McKeown",
            //149
            "Unknown",
            //150
            "Malcolm X",
            //151
            "Eminem",
            //152
            "Ralph Waldo Emerson",
            //153
            "Nelson Mandela",
            //154
            "Bob Brown",
            //155
            "Walt Disney",
            //156
            "Barack Obama"
    };
    private static String[][] successTags = {
            //0
            {"success", "robert", "kyosaki", "don’t", "let", "the", "fear", "of", "losing", "be", "greater", "than", "excitement", "winning"},
            //1
            {"success", "benjamin", "hardy", "unsuccessful", "people", "make", "their", "decisions", "based", "on", "current", "situations", "successful", "where", "they", "want", "to", "be"},
            //2
            {"success", "robert", "brault", "we", "are", "kept", "from", "our", "goal", "not", "by", "obstacles", "but", "a", "clear", "path", "to", "lesser"},
            //3
            {"success", "johann", "wolfgang", "von", "goethe", "things", "which", "matter", "most", "must", "never", "be", "at", "the", "mercy", "of", "least"},
            //4
            {"success", "steve", "jobs", "if", "you", "really", "look", "closely", "most", "overnight", "successes", "took", "a", "long", "time"},
            //5
            {"success", "the", "ones", "who", "are", "crazy", "enough", "to", "think", "they", "can", "change", "world", "that", "do"},
            //6
            {"success", "ross", "simmonds", "greatness", "only", "comes", "before", "hustle", "in", "the", "dictionary"},
            //7
            {"success", "stephen", "mccranie", "the", "master", "has", "failed", "more", "times", "than", "beginner", "even", "tried"},
            //8
            {"success", "ryan", "blair", "if", "it", "is", "important", "to", "you", "will", "find", "a", "way", "not", "you’ll", "an", "excuse"},
            //9
            {"success", "abraham", "lincoln", "things", "may", "come", "to", "those", "who", "wait", "but", "only", "the", "left", "by", "hustle"},
            //10
            {"success", "leah", "busque", "i", "wake", "up", "every", "morning", "and", "think", "to", "myself", "‘how", "far", "can", "push", "this", "company", "in", "the", "next", "24", "hours"},
            //11
            {"success", "john", "d", "rockefeller", "singleness", "of", "purpose", "is", "one", "the", "chief", "essentials", "for", "in", "life", "no", "matter", "what", "may", "be", "one’s", "aim"},
            //12
            {"success", "pele", "is", "no", "accident", "it", "hard", "work", "perseverance", "learning", "studying", "sacrifice", "and", "most", "of", "all", "love", "what", "you", "are", "doing", "or", "to", "do"},
            //13
            {"success", "herbert", "bayard", "swope", "i", "cannot", "give", "you", "the", "formula", "for", "but", "can", "failure", "it", "is", "try", "to", "please", "everybody"},
            //14
            {"success", "t", "s", "eliot", "is", "relative", "it", "what", "we", "can", "make", "of", "the", "mess", "have", "made", "things"},
            //15
            {"success", "thomas", "a", "alpha", "edison", "i", "failed", "my", "way", "to"},
            //16
            {"success", "destiny", "booze", "prepare", "yourself", "for", "you", "have", "to", "see", "it", "coming", "get", "there"},
            //17
            {"success", "winston", "churchill", "is", "walking", "from", "failure", "to", "with", "no", "loss", "of", "enthusiasm"},
            //18
            {"success", "russian", "proverb", "if", "you", "chase", "two", "rabbits", "will", "not", "catch", "either", "one"},
            //19
            {"success", "gabby", "douglas", "every", "champion", "was", "once", "a", "contender", "that", "didn’t", "give", "up"},
            //20
            {"success", "malcolm", "forbes", "failure", "is", "if", "we", "learn", "from", "it"},
            //21
            {"success", "hustle", "in", "silence", "and", "let", "your", "make", "the", "noise"},
            //22
            {"success", "josh", "billings", "be", "like", "a", "postage", "stamp", "stick", "to", "one", "thing", "until", "you", "get", "there"},
            //23
            {"success", "chris", "rock", "wealth", "isn’t", "about", "having", "a", "lot", "of", "money", "it’s", "options"},
            //24
            {"success", "margarita", "tartakovsky", "productivity", "isn’t", "about", "being", "a", "workhorse", "keeping", "busy", "or", "burning", "the", "midnight", "oil", "it’s", "more", "priorities", "planning", "and", "fiercely", "protecting", "your", "time"},
            //25
            {"success", "steve", "maraboli", "if", "you", "hang", "out", "with", "chickens", "you’re", "going", "to", "cluck", "and", "eagles", "fly"},
            //26
            {"success", "bill", "cosby", "in", "order", "to", "succeed", "your", "desire", "for", "should", "be", "greater", "than", "fear", "of", "failure"},
            //27
            {"success", "alan", "lakein", "planning", "is", "bringing", "the", "future", "into", "present", "so", "that", "you", "can", "do", "something", "about", "it", "now"},
            //28
            {"success", "napoleon", "hill", "a", "goal", "is", "dream", "with", "deadline"},
            //29
            {"success", "vidal", "sassoon", "the", "only", "place", "where", "comes", "before", "work", "is", "in", "dictionary"},
            //30
            {"success", "jim", "rohn", "if", "you", "are", "not", "willing", "to", "risk", "the", "unusual", "will", "have", "settle", "for", "ordinary"},
            //31
            {"success", "estee", "lauder", "i", "never", "dreamt", "of", "worked", "for", "it"},
            //32
            {"success", "chinese", "proverb", "to", "get", "through", "the", "hardest", "journey", "we", "need", "take", "only", "one", "step", "at", "a", "time", "but", "must", "keep", "on", "stepping"},
            //33
            {"success", "jim", "rohn", "if", "you", "really", "want", "to", "do", "something", "you’ll", "find", "a", "way", "don’t", "an", "excuse"},
            //34
            {"success", "some", "people", "dream", "of", "while", "others", "wake", "up", "and", "work"},
            //35
            {"success", "benjamin", "disraeli", "the", "secret", "of", "is", "constancy", "to", "purpose"},
            //36
            {"success", "peter", "f", "drucker", "efficiency", "is", "doing", "the", "thing", "right", "effectiveness"},
            //37
            {"success", "tony", "gaskins", "if", "you", "don’t", "build", "your", "dream", "someone", "will", "hire", "to", "help", "theirs"},
            //38
            {"success", "scott", "belsky", "when", "99%", "of", "people", "doubt", "your", "idea", "you’re", "either", "gravely", "wrong", "or", "about", "to", "make", "history"},
            //39
            {"success", "it’s", "not", "all", "sunshine", "and", "rainbows", "but", "a", "good", "amount", "of", "it", "actually", "is"},
            //40
            {"success", "arnold", "h", "glasow", "is", "simple", "do", "what’s", "right", "the", "way", "at", "time"},
            //41
            {"success", "michael", "j", "john", "bobak", "all", "progress", "takes", "place", "outside", "the", "comfort", "zone"},
            //42
            {"success", "maya", "angelou", "is", "liking", "yourself", "what", "you", "do", "and", "how", "it"},
            //43
            {"success", "martin", "luther", "king", "jr", "you", "don’t", "need", "to", "see", "the", "whole", "staircase", "just", "take", "first", "step"},
            //44
            {"success", "nikos", "kazantzakis", "in", "order", "to", "succeed", "we", "must", "first", "believe", "that", "can"},
            //45
            {"success", "plato", "i", "never", "did", "anything", "worth", "doing", "by", "accident", "not", "any", "of", "my", "intentions", "come", "they", "came", "work"},
            //46
            {"success", "k'wan", "every", "successful", "person", "in", "the", "world", "is", "a", "hustler", "one", "way", "or", "another", "we", "all", "hustle", "to", "get", "where", "need", "be", "only", "fool", "would", "sit", "around", "and", "wait", "on", "man", "feed", "him"},
            //47
            {"success", "helen", "keller", "be", "happy", "with", "what", "you", "have", "while", "working", "for", "want"},
            //48
            {"success", "estee", "lauder", "i", "never", "dreamed", "about", "worked", "for", "it"},
            //49
            {"success", "conrad", "hilton", "seems", "to", "be", "connected", "with", "action", "successful", "people", "keep", "moving", "they", "make", "mistakes", "but", "don’t", "quit"},
            //50
            {"success", "farrah", "gray", "build", "your", "own", "dreams", "or", "someone", "else", "will", "hire", "you", "to", "theirs"},
            //51
            {"success", "eric", "thomas", "when", "you", "want", "to", "succeed", "as", "bad", "breathe", "then", "you’ll", "be", "successful"},
            //52
            {"success", "is", "not", "the", "key", "to", "happiness", "if", "you", "love", "what", "are", "doing", "will", "be", "successful"},
            //53
            {"success", "heraclitus", "big", "results", "require", "ambitions"},
            //54
            {"success", "harry", "f", "banks", "for", "attitude", "is", "equally", "as", "important", "ability"},
            //55
            {"success", "alexander", "the", "great", "in", "the", "end", "when", "it’s", "over", "all", "that", "matters", "is", "what", "you’ve", "done"},
            //56
            {"success", "tony", "robbins", "if", "you", "talk", "about", "it", "it’s", "a", "dream", "envision", "possible", "schedule", "real"},
            //57
            {"success", "ellen", "degeneres", "when", "you", "take", "risks", "learn", "that", "there", "will", "be", "times", "succeed", "and", "fail", "both", "are", "equally", "important"},
            //58
            {"success", "vince", "lombardi", "demands", "singleness", "of", "purpose"},
            //59
            {"success", "jaymin", "shah", "no", "one", "is", "to", "blame", "for", "your", "future", "situation", "but", "yourself", "if", "you", "want", "be", "successful", "then", "become"},
            //60
            {"success", "bear", "bryant", "if", "you", "believe", "in", "yourself", "and", "have", "dedication", "pride", "never", "quit", "you’ll", "be", "a", "winner", "the", "price", "of", "victory", "is", "high", "but", "so", "are", "rewards"},
            //61
            {"success", "b", "j", "thornton", "every", "great", "change", "starts", "like", "falling", "dominoes"},
            //62
            {"success", "tim", "ferriss", "focus", "on", "being", "productive", "instead", "of", "busy"},
            //63
            {"success", "jack", "canfield", "if", "you", "are", "going", "to", "be", "successful", "need", "give", "up", "the", "phrase", "‘i", "can’t’", "and", "all", "of", "its", "cousins", "such", "as", "wish", "i", "were", "able"},
            //64
            {"success", "arthur", "ashe", "start", "where", "you", "are", "use", "what", "have", "do", "can"},
            //65
            {"success", "don’t", "stop", "when", "you’re", "tired", "done"},
            //66
            {"success", "colin", "powell", "there", "are", "no", "secrets", "to", "it", "is", "the", "result", "of", "preparation", "hard", "work", "and", "learning", "from", "failure"},
            //67
            {"success", "if", "the", "plan", "doesn’t", "work", "change", "but", "never", "goal"},
            //68
            {"success", "seneca", "throw", "me", "to", "the", "wolves", "and", "i", "will", "return", "leading", "pack"},
            //69
            {"success", "terry", "pratchett", "if", "you", "trust", "in", "yourself", "and", "believe", "your", "dreams", "follow", "star", "you’ll", "still", "get", "beaten", "by", "people", "who", "spent", "their", "time", "working", "hard", "learning", "things", "weren’t", "so", "lazy"},
            //70
            {"success", "f", "m", "alexander", "people", "do", "not", "decide", "their", "futures", "they", "habits", "and"},
            //71
            {"success", "henry", "ford", "if", "everyone", "is", "moving", "forward", "together", "then", "takes", "care", "of", "itself"},
            //72
            {"success", "george", "halas", "nobody", "who", "ever", "gave", "his", "best", "regretted", "it"},
            //73
            {"success", "when", "someone", "says", "you", "can’t", "do", "it", "twice", "and", "take", "pictures"},
            //74
            {"success", "billie", "jean", "king", "champions", "keep", "playing", "until", "they", "get", "it", "right"},
            //75
            {"success", "henry", "d", "david", "thoreau", "what", "you", "get", "by", "achieving", "your", "goals", "is", "not", "as", "important", "become"},
            //76
            {"success", "richard", "branson", "do", "not", "be", "embarrassed", "by", "your", "failures", "learn", "from", "them", "and", "start", "again"},
            //77
            {"success", "frank", "sinatra", "the", "best", "revenge", "is", "massive"},
            //78
            {"success", "alexander", "the", "great", "there", "is", "nothing", "impossible", "to", "him", "who", "will", "try"},
            //79
            {"success", "john", "carmack", "focus", "is", "a", "matter", "of", "deciding", "what", "things", "you’re", "not", "going", "to", "do"},
            //80
            {"success", "eleanor", "roosevelt", "do", "one", "thing", "every", "day", "that", "scares", "you"},
            //81
            {"success", "benjamin", "disraeli", "one", "secret", "of", "in", "life", "is", "for", "a", "man", "to", "be", "ready", "his", "opportunity", "when", "it", "comes"},
            //82
            {"success", "warren", "buffett", "the", "difference", "between", "successful", "people", "and", "very", "is", "that", "say", "‘no’", "to", "almost", "everything"},
            //83
            {"success", "estee", "lauder", "i", "didn’t", "get", "there", "by", "wishing", "for", "it", "but", "working"},
            //84
            {"success", "david", "frost", "don’t", "aim", "for", "if", "you", "want", "it", "just", "do", "what", "love", "and", "believe", "in", "will", "come", "naturally"},
            //85
            {"success", "alexander", "g", "graham", "bell", "concentrate", "all", "of", "your", "thoughts", "upon", "the", "work", "at", "hand", "sun’s", "rays", "do", "not", "burn", "until", "brought", "to", "a", "focus"},
            //86
            {"success", "winston", "churchill", "is", "going", "from", "failure", "to", "without", "losing", "your", "enthusiasm"},
            //87
            {"success", "you", "can’t", "have", "a", "milliondollar", "dream", "on", "minimum", "wage", "work", "ethic"},
            //88
            {"success", "thomas", "h", "henry", "huxley", "the", "rung", "of", "a", "ladder", "was", "never", "meant", "to", "rest", "upon", "but", "only", "hold", "man’s", "foot", "long", "enough", "enable", "him", "put", "other", "somewhat", "higher"},
            //89
            {"success", "bob", "hawke", "the", "things", "which", "are", "most", "important", "don’t", "always", "scream", "loudest"},
            //90
            {"success", "pablo", "picasso", "action", "is", "the", "foundational", "key", "to", "all"},
            //91
            {"success", "anthony", "robbins", "there", "is", "a", "powerful", "driving", "force", "inside", "every", "human", "being", "that", "once", "unleashed", "can", "make", "any", "vision", "dream", "or", "desire", "reality"},
            //92
            {"success", "oprah", "winfrey", "surround", "yourself", "only", "with", "people", "who", "are", "going", "to", "lift", "you", "higher"},
            //93
            {"success", "the", "difference", "between", "who", "you", "are", "and", "want", "to", "be", "is", "what", "do"},
            //94
            {"success", "florence", "nightingale", "i", "attribute", "my", "to", "this", "never", "gave", "or", "took", "any", "excuse"},
            //95
            {"success", "don’t", "dream", "about", "get", "out", "there", "and", "work", "for", "it"},
            //96
            {"success", "tony", "robbins", "people", "who", "succeed", "have", "momentum", "the", "more", "they", "want", "to", "and", "find", "a", "way"},
            //97
            {"success", "augustus", "if", "you", "want", "rainbow", "have", "to", "deal", "with", "the", "rain"},
            //98
            {"success", "dr", "i", "irene", "c", "kassorla", "quitters", "never", "win", "winners", "quit"},
            //99
            {"success", "roy", "t", "bennett", "is", "not", "how", "high", "you", "have", "climbed", "but", "make", "a", "positive", "difference", "to", "the", "world"},
            //100
            {"success", "albert", "einstein", "i", "am", "thankful", "for", "all", "of", "those", "who", "said", "no", "to", "me", "it’s", "because", "them", "i’m", "doing", "it", "myself"},
            //101
            {"success", "og", "mandino", "it", "is", "those", "who", "concentrate", "on", "but", "one", "thing", "at", "a", "time", "advance", "in", "this", "world"},
            //102
            {"success", "mark", "twain", "the", "secret", "of", "getting", "ahead", "is", "started", "to", "breaking", "your", "complex", "overwhelming", "tasks", "into", "small", "manageable", "and", "then", "starting", "on", "first", "one"},
            //103
            {"success", "vince", "lombardi", "the", "difference", "between", "a", "successful", "person", "and", "others", "is", "not", "lack", "of", "strength", "knowledge", "but", "rather", "will"},
            //104
            {"success", "robert", "collier", "is", "the", "sum", "of", "small", "efforts", "repeated", "dayin", "and", "dayout"},
            //105
            {"success", "eric", "thomas", "you", "gotta", "stay", "hungry", "focused", "and", "better", "have", "heart", "the", "of", "a", "champion"},
            //106
            {"success", "albert", "einstein", "you", "have", "to", "learn", "the", "rules", "of", "game", "and", "then", "play", "better", "than", "anyone", "else"},
            //107
            {"success", "albert", "camus", "the", "struggle", "itself", "towards", "heights", "is", "enough", "to", "fill", "a", "man’s", "heart"},
            //108
            {"success", "g", "k", "nielson", "successful", "people", "are", "not", "gifted", "they", "just", "work", "hard", "then", "succeed", "on", "purpose"},
            //109
            {"success", "woody", "allen", "eighty", "percent", "of", "is", "showing", "up"},
            //110
            {"success", "kevin", "ngo", "when", "you", "don’t", "make", "the", "time", "to", "work", "on", "creating", "life", "want", "you’re", "eventually", "going", "be", "forced", "spend", "a", "lot", "of", "dealing", "with"},
            //111
            {"success", "marie", "forleo", "the", "key", "to", "is", "start", "before", "you", "are", "ready"},
            //112
            {"success", "shel", "silverstein", "but", "those", "wouldacouldashouldas", "all", "ran", "away", "and", "hid", "from", "one", "little", "did"},
            //113
            {"success", "shiv", "khera", "your", "positive", "action", "combined", "with", "thinking", "results", "in"},
            //114
            {"success", "nassim", "nicholas", "taleb", "the", "maximum", "is", "reached", "when", "you", "are", "never", "busy"},
            //115
            {"success", "thomas", "wolfe", "you", "have", "reached", "the", "pinnacle", "of", "as", "soon", "become", "uninterested", "in", "money", "compliments", "or", "publicity"},
            //116
            {"success", "jim", "rohn", "successful", "people", "do", "what", "unsuccessful", "are", "not", "willing", "to", "don’t", "wish", "it", "were", "easier", "you", "better"},
            //117
            {"success", "scott", "adam", "if", "you", "want", "to", "be", "successful", "find", "out", "what", "the", "price", "is", "and", "then", "pay", "it"},
            //118
            {"success", "jack", "dorsey", "is", "never", "accidental"},
            //119
            {"success", "bo", "bennett", "is", "not", "in", "what", "you", "have", "but", "who", "are"},
            //120
            {"success", "frank", "long", "selfimprovement", "and", "go", "hand", "in", "taking", "the", "steps", "to", "make", "yourself", "a", "better", "more", "wellrounded", "individual", "will", "prove", "be", "wise", "decision"},
            //121
            {"success", "pearl", "s", "buck", "the", "young", "do", "not", "know", "how", "to", "be", "prudent", "and", "therefore", "they", "attempt", "impossible", "achieve", "it", "generation", "after"},
            //122
            {"success", "robert", "browning", "a", "minute’s", "pays", "the", "failure", "of", "years"},
            //123
            {"success", "tony", "robbins", "the", "path", "to", "is", "take", "massive", "determined", "action"},
            //124
            {"success", "david", "justus", "you", "get", "what", "focus", "on"},
            //125
            {"success", "albert", "einstein", "failure", "is", "in", "progress"},
            //126
            {"success", "al", "goldstein", "the", "true", "is", "person", "who", "invented", "himself"},
            //127
            {"success", "sam", "walton", "celebrate", "your", "successes", "find", "some", "humor", "in", "failures"},
            //128
            {"success", "naval", "ravikant", "the", "people", "who", "succeed", "are", "irrationally", "passionate", "about", "something"},
            //129
            {"success", "maxime", "legacé", "legace", "slow", "and", "steady", "is", "better", "than", "fast", "shaky"},
            //130
            {"success", "james", "cameron", "if", "you", "set", "your", "goals", "ridiculously", "high", "and", "it’s", "a", "failure", "will", "fail", "above", "everyone", "else’s"},
            //131
            {"success", "abraham", "lincoln", "that", "some", "achieve", "great", "is", "proof", "to", "all", "others", "can", "it", "as", "well"},
            //132
            {"success", "paul", "j", "meyer", "is", "the", "progressive", "realization", "of", "predetermined", "worthwhile", "personal", "goals"},
            //133
            {"success", "zig", "ziglar", "the", "real", "opportunity", "for", "lies", "within", "person", "and", "not", "job"},
            //134
            {"success", "zig", "ziglar", "don't", "be", "distracted", "by", "criticism", "remember", "the", "only", "taste", "of", "some", "people", "get", "is", "to", "take", "a", "bite", "out", "you"},
            //135
            {"success", "aristotle", "the", "secret", "to", "is", "know", "something", "nobody", "else", "knows"},
            //136
            {"success", "criss", "jami", "the", "biggest", "challenge", "after", "is", "shutting", "up", "about", "it"},
            //137
            {"success", "conor", "mcgregor", "you", "sleep", "on", "a", "win", "and", "you’ll", "wake", "up", "with", "loss"},
            //138
            {"success", "benjamin", "disraeli", "is", "the", "child", "of", "audacity"},
            //139
            {"success", "albert", "einstein", "it’s", "not", "that", "i’m", "so", "smart", "just", "i", "stay", "with", "problems", "longer"},
            //140
            {"success", "barack", "obama", "find", "somebody", "to", "be", "successful", "for", "raise", "their", "hopes", "think", "of", "needs"},
            //141
            {"success", "vince", "lombardi", "winning", "is", "a", "habit", "unfortunately", "so", "losing"},
            //142
            {"success", "successful", "people", "use", "their", "time", "in", "a", "wise", "manner", "unlike", "the", "mediocre", "who", "squander", "it", "away", "on", "daily", "basis"},
            //143
            {"success", "truman", "capote", "failure", "is", "the", "condiment", "that", "gives", "its", "flavor"},
            //144
            {"success", "al", "lewis", "my", "secret", "for", "i", "don’t", "know", "what", "the", "hell", "means"},
            //145
            {"success", "nelson", "mandela", "when", "the", "water", "starts", "boiling", "it", "is", "foolish", "to", "turn", "off", "heat"},
            //146
            {"success", "alexander", "graham", "bell", "before", "anything", "else", "preparation", "is", "the", "key", "to"},
            //147
            {"success", "henry", "ford", "nothing", "is", "particularly", "hard", "if", "you", "break", "it", "down", "into", "small", "jobs"},
            //148
            {"success", "greg", "mckeown", "clarity", "equals"},
            //149
            {"success", "make", "time", "for", "every", "day", "no", "matter", "what"},
            //150
            {"success", "malcolm", "x", "if", "you", "have", "no", "critics", "you’ll", "likely"},
            //151
            {"success", "eminem", "is", "my", "only", "option", "failure’s", "not"},
            //152
            {"success", "ralph", "waldo", "emerson", "shallow", "men", "believe", "in", "luck", "strong", "cause", "and", "effect"},
            //153
            {"success", "nelson", "mandela", "your", "playing", "small", "does", "not", "serve", "the", "world", "who", "are", "you", "to", "be", "great"},
            //154
            {"success", "bob", "brown", "behind", "every", "successful", "man", "there’s", "a", "lot", "of", "unsuccessful", "years"},
            //155
            {"success", "walt", "disney", "i", "do", "not", "like", "to", "repeat", "successes", "go", "on", "other", "things"},
            //156
            {"success", "barack", "obama", "the", "real", "test", "is", "not", "whether", "you", "avoid", "this", "failure", "because", "won't", "it's", "let", "it", "harden", "or", "shame", "into", "inaction", "learn", "from", "choose", "to", "persevere"}
    };

    public static String getSuccessQuote(int position) {
        return quotesSuccess[position];
    }

    public static String getSuccessAuthor(int position) {
        return quotesSuccessAuthors[position];
    }

    public static String[] getSuccessList() {
        return quotesSuccess;
    }

    static String[][] getSuccessTags() {
        return successTags;
    }

    public static int getSuccessListSize() {
        return quotesSuccess.length;
    }
}
