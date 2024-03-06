package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Motivation {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesMotivation and quotesMotivationAuthors
        int listSize = getMotivationListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesMotivation[randomIndexToSwap];
            tempAuthor = quotesMotivationAuthors[randomIndexToSwap];
            tempTags = motivationTags[randomIndexToSwap];
            quotesMotivation[randomIndexToSwap] = quotesMotivation[i];
            quotesMotivationAuthors[randomIndexToSwap] = quotesMotivationAuthors[i];
            motivationTags[randomIndexToSwap] = motivationTags[i];
            quotesMotivation[i] = tempQuote;
            quotesMotivationAuthors[i] = tempAuthor;
            motivationTags[i] = tempTags;
        }
    }

    private static String[] quotesMotivation = {
            //0
            "\"Hard work beats talent when talent doesn’t work hard.\"",
            //1
            "\"Endurance is one of the most difficult disciplines, but it is to the one who endures that the final victory comes.\"",
            //2
            "\"Dreams don’t work unless you do.\"",
            //3
            "\"Don’t quit yet, the worst moments are usually followed by the most beautiful silver linings. You have to stay strong, remember to keep your head up and remain hopeful.\"",
            //4
            "\"This is a reminder to you to create your own rule book, and live your life the way you want it.\"",
            //5
            "\"At the end of the day, let there be no excuses, no explanations, no regrets.\"",
            //6
            "\"Change is painful, but nothing is as painful as staying stuck somewhere you don’t belong.\"",
            //7
            "\"Those who cannot change their minds cannot change anything.\"",
            //8
            "\"By making yourself better, that’s how you make your team better.\"",
            //9
            "\"When written in Chinese the word ‘crisis’ is composed of two characters – one represents danger and the other represents opportunity.\"",
            //10
            "\"Falling down is how we grow. Staying down is how we die.\"",
            //11
            "\"A man is not finished when he is defeated. He is finished when he quits.\"",
            //12
            "\"If you can dream it, you can do it.\"",
            //13
            "\"Today I will do what others won’t, so tomorrow I can do what others can’t.\"",
            //14
            "\"Life is like riding a bicycle. To keep your balance, you must keep moving.\"",
            //15
            "\"Never stop doing your best just because someone doesn’t give you credit.\"",
            //16
            "\"Make today worth remembering.\"",
            //17
            "\"Start where you are. Use what you have. Do what you can.\"",
            //18
            "\"You never know what you can do until you try.\"",
            //19
            "\"Don’t tell everyone your plans, instead show them your results.\"",
            //20
            "\"I always thought it was me against the world and then one day I realized it’s just me against me.\"",
            //21
            "\"The question isn’t who is going to let me; it’s who is going to stop me.\"",
            //22
            "\"Falling down is an accident, staying down is a choice.\"",
            //23
            "\"Don’t talk, just act. Don’t say, just show. Don’t promise, just prove.\"",
            //24
            "\"You can’t go back and change the beginning, but you can start where you are and change the ending.\"",
            //25
            "\"When you feel like giving up just remember that there are a lot of people you still have to prove wrong.\"",
            //26
            "\"There is no easy way. There is only: hard work, late nights, early mornings, practice, repetition, study, sweat, blood, frustration, and discipline.\"",
            //27
            "\"Just stick with it. What seems so hard now will one day be your warm up.\"",
            //28
            "\"The secret of getting ahead is getting started.\"",
            //29
            "\"Don’t limit yourself. Many people limit themselves to what they think they can do. You can go as far as you mind lets you. What you believe, remember, you can achieve.\"",
            //30
            "\"Things will get better. So don’t give up, okay?\"",
            //31
            "\"You’re so much stronger than you excuses.\"",
            //32
            "\"You will face many defeats in life, but never let yourself be defeated.\"",
            //33
            "\"The ambitious are criticised by those that have given up.\"",
            //34
            "\"Great things are done by a series of small things brought together.\"",
            //35
            "\"Your passion is waiting for your courage to catch up.\"",
            //36
            "\"Stop giving meaningless praise and start giving meaningful action.\"",
            //37
            "\"Everyone has inside them a piece of good news. The good news is you don’t know how great you can be! How much you can love! What you can accomplish! And what your potential is.\"",
            //38
            "\"You have two choices, to conquer your fear or to let your fear conquer you.\"",
            //39
            "\"Victory is reserved for those who are willing to pay its price.\"",
            //40
            "\"Adversity causes some men to break; others to break records.\"",
            //41
            "\"Dreams are the seeds of change. Nothing every grows without a seed, and nothing every changes without a dream.\"",
            //42
            "\"We are all here for some special reason. Stop being a prisoner of your past. Become the architect of your future.\"",
            //43
            "\"If you work on something a little bit every day, you end up with something that is massive.\"",
            //44
            "\"Don’t say you don’t have enough time. You have exactly the same number of hours per day that were given to Helen Keller, Pasteur, Michelangelo, Mother Teresa, Leonardo Da Vinci, Thomas Jefferson, and Albert Einstein.\"",
            //45
            "\"The struggle you’re in today is developing the strength you need tomorrow. Stay safe. Stay smart. Stay healthy.\"",
            //46
            "\"Defeat is a state of mind; no one is ever defeated until defeat is accepted as a reality.\"",
            //47
            "\"It’s okay to outgrow people who don’t grow. Grow tall anyways.\"",
            //48
            "\"Let the rest do whatever while you do whatever it takes.\"",
            //49
            "\"Everything is hard before it is easy.\"",
            //50
            "\"Even if you’re on the right track, you’ll get run over if you just sit there.\"",
            //51
            "\"I hated every minute of training, but I said, ‘Don’t quit. Suffer now and live the rest of your life as a champion.\"",
            //52
            "\"Twenty years from now you’ll be more disappointed by the things you did not do than the ones you did.\"",
            //53
            "\"In the middle of every difficulty lies opportunity.\"",
            //54
            "\"Go with the choice that scares you the most, because that’s the one that’s going to help you grow.\"",
            //55
            "\"Don’t limit your challenges. Challenge your limits.\"",
            //56
            "\"Motivation comes from working on things we care about.\"",
            //57
            "\"Things may come to those who wait, but only the things left by those who hustle.\"",
            //58
            "\"First say to yourself what you would be; and then do what you have to do.\"",
            //59
            "\"You did not wake up today to be average.\"",
            //60
            "\"The best way to predict your future is to create it.\"",
            //61
            "\"Never confuse a single defeat with a final defeat.\"",
            //62
            "\"Impossible is just an opinion.\"",
            //63
            "\"The best time to plant a tree was 20 years ago. He second best time is now.\"",
            //64
            "\"How wonderful it is that nobody needs to wait a single moment before starting to improve the world.\"",
            //65
            "\"Forget your excuses. You either want it bad or don’t want it at all.\"",
            //66
            "\"The only thing standing in the way between you and your goals is the BS story you keep telling yourself as to why you can’t achieve it.\"",
            //67
            "\"It doesn’t matter what you did or where you were… it matters where you are and what you’re doing. Get out there! Sing the song in your heart and NEVER let anyone shut you up!\"",
            //68
            "\"If you fell down yesterday, stand up today.\"",
            //69
            "\"If you are struggling, you are progressing.\"",
            //70
            "\"Good, better, best. Never let it rest. ‘Til your good is better and your better is best.\"",
            //71
            "\"Those who fly alone have the strongest wings.\"",
            //72
            "\"Even at your best someone will have something negative to say. Pursue greatness anyways!\"",
            //73
            "\"It’s not what you do once in a while it’s what you do day in and day out that makes the difference.\"",
            //74
            "\"A winner is a dreamer who never gives up.\"",
            //75
            "\"You can have results or excuses, not both.\"",
            //76
            "\"Stop being afraid of what could go wrong, and start being excited about what could go right.\"",
            //77
            "\"It’s about identity. Be the kind of person that gets things done. Even when it’s hard.\"",
            //78
            "\"All your ideas may be solid or even good. But you have to actually execute on them for them to matter.\"",
            //79
            "\"Work hard for what you want because it won’t come to you without a fight. You have to be strong and courageous and know that you can do anything you put your mind to.\"",
            //80
            "\"A hill is just another opportunity to leave your competition behind.\"",
            //81
            "\"Believe with all your heart that you will do what you were made to do.\"",
            //82
            "\"It’s hard to beat a person who never gives up.\"",
            //83
            "\"Dreams don’t work unless you take action. The surest way to make your dreams come true is to live them.\"",
            //84
            "\"Believe in yourself, take on your challenges, dig deep within yourself to conquer fears. Never let anyone bring you down. You got to keep going.\"",
            //85
            "\"There is nothing noble in being superior to your fellow man; true nobility is being superior to your former self.\"",
            //86
            "\"It’s never about how you start. It’s always about how you finish.\"",
            //87
            "\"You have to do what others won’t to achieve what others don’t.\"",
            //88
            "\"When someone tells me “no”, it doesn’t mean I can’t do it, it simply means I can’t do it with them.\"",
            //89
            "\"Be so good they can’t ignore you.\"",
            //90
            "\"If you dreams don’t scare you, they are too small.\"",
            //91
            "\"If people are doubting how far you can go, go so far that you can’t hear them anymore.\"",
            //92
            "\"Everyone thinks of changing the world, but no one thinks of changing himself.\"",
            //93
            "\"Doubt kills more dreams than failure ever will.\"",
            //94
            "\"Difficult doesn’t mean impossible. It simply means that you have to work hard.\"",
            //95
            "\"We need to accept that we won’t always make the right decisions, that we’ll screw up royally sometimes – understanding that failure is not the opposite of success, it’s part of success.\"",
            //96
            "\"May god have mercy upon my enemies. Cause I won’t.\"",
            //97
            "\"We can do anything we want to if we stick to it long enough.\"",
            //98
            "\"Mastering others is strength. Mastering yourself is true power.\"",
            //99
            "\"I can and I will. Watch me.\"",
            //100
            "\"If you’re going to quit anything, quit being lazy, quit making excuses and quit waiting for the right time.\"",
            //101
            "\"The world is changed by your example, not by your opinion.\"",
            //102
            "\"Know that deep inside, you are resilient, brave, and so much stronger than your fears.\"",
            //103
            "\"I never lose. Either I win or I learn.\"",
            //104
            "\"All our dreams can come true, if we have the courage to pursue them.\"",
            //105
            "\"Learn the rules like a pro, so you can break them like an artist.\"",
            //106
            "\"If you want to fly give up everything that weighs you down.\"",
            //107
            "\"The world is a jungle. You either fight or run forever.\"",
            //108
            "\"Whatever you can do, or dream you can, begin it. Boldness has genius, power and magic in it.\"",
            //109
            "\"You know what you have to do. You just have to make it a priority.\"",
            //110
            "\"Some people want it to happen, some wish it would happen, others make it happen.\"",
            //111
            "\"Today is your opportunity to build the tomorrow you want.\"",
            //112
            "\"Act the way you’d like to be and soon you’ll be the way you’d like to act.\"",
            //113
            "\"Study while others are sleeping; work while others are loading; prepare while others are playing; and dream while others are wishing.\"",
            //114
            "\"You’ve got to get up every morning with determination if you’re going to go to bed with satisfaction.\"",
            //115
            "\"Never give up on a dream just because of the time it will take to accomplish it. The time will pass anyway.\"",
            //116
            "\"Blood, sweat and respect. First two you give, last one you earn.\"",
            //117
            "\"Words can inspire, thoughts can provoke, but only action truly brings you closer to your dreams.\"",
            //118
            "\"You can do anything you set your mind to.\"",
            //119
            "\"There are no traffic jams along the extra mile.\"",
            //120
            "\"The spirit of the individual is determined by his dominating thought habits.\"",
            //121
            "\"You can’t let failures define you. You have to let your failures teach you.\"",
            //122
            "\"Whenever you find yourself doubting how far you can go, just remember how far you have come.\"",
            //123
            "\"Think back 5 years ago. Think of where you’re at today. Think ahead 5 years and what you want to accomplish. Be unstoppable.\"",
            //124
            "\"Take the risk or lose the chance.\"",
            //125
            "\"Trust yourself that you can do it and get it.\"",
            //126
            "\"You are only confined by the walls you build yourself.\"",
            //127
            "\"The hard days are what make you stronger.\"",
            //128
            "\"Let your action manifest your thought, your belief and your passion.\"",
            //129
            "\"Work hard, be kind, and amazing things will happen.\"",
            //130
            "\"A good plan violently executed now is better than a perfect plan executed next week.\"",
            //131
            "\"It is okay to be scared, it is okay to cry, but giving up should not be an option.\"",
            //132
            "\"Nobody ever wrote down a plan to be broke, fat, lazy, or stupid. Those things are what happen when you don’t have a plan.\"",
            //133
            "\"The big secret in life is that there is no secret. Whatever your goal, you can get there if you’re willing to work.\"",
            //134
            "\"Learn as if you were not reaching your goal and as though you were scared of missing it.\"",
            //135
            "\"If you want to achieve excellence, you can get there today. As of this second, quit doing less-than-excellent work.\"",
            //136
            "\"A plan is what, a schedule is when. It takes both a plan and a schedule to get things done.\"",
            //137
            "\"I have been impressed with the urgency of doing. Knowing is not enough; we must apply. Being willing is not enough; we must do.\"",
            //138
            "\"No matter how many mistakes you make or how slow you progress, you are still way ahead of everyone who isn’t trying.\"",
            //139
            "\"Practice even what seems impossible. The left hand is useless at almost everything, for lack of practice. But it guides the reins better than the right. From practice.\"",
            //140
            "\"Amateurs sit and wait for inspiration, the rest of us just get up and go to work.\""
    };
    private static String[] quotesMotivationAuthors = {
            //0
            "Tim Notke",
            //1
            "Buddha",
            //2
            "John C. Maxwell",
            //3
            "Unknown",
            //4
            "Reese Evans",
            //5
            "Steve Maraboli",
            //6
            "Mandy Hale",
            //7
            "George Bernard Shaw",
            //8
            "Jimmy Garoppolo",
            //9
            "John F. Kennedy",
            //10
            "Brian Vaszily",
            //11
            "Richard Nixon",
            //12
            "Walt Disney",
            //13
            "Jerry Rice",
            //14
            "Albert Einstein",
            //15
            "Unknown",
            //16
            "Zig Ziglar",
            //17
            "Arthur Ashe",
            //18
            "William Cobbett",
            //19
            "Unknown",
            //20
            "Kendrick Lamar",
            //21
            "Ayn Rand",
            //22
            "Unknown",
            //23
            "Unknown",
            //24
            "C. S. Lewis",
            //25
            "Unknown",
            //26
            "Jocko Willink",
            //27
            "Unknown",
            //28
            "Mark Twain",
            //29
            "Mary Kay Ash",
            //30
            "Unknown",
            //31
            "Unknown",
            //32
            "Maya Angelou",
            //33
            "Grant Cardone",
            //34
            "Vincent Van Gogh",
            //35
            "Isabelle Lafleche",
            //36
            "Steve Maraboli",
            //37
            "Anne Frank",
            //38
            "Roy T. Bennett",
            //39
            "Unknown",
            //40
            "William Arthur Ward",
            //41
            "Debby Boone",
            //42
            "Robin S. Sharma",
            //43
            "Kenneth Goldsmith",
            //44
            "H. Jackson Brown Jr.",
            //45
            "Unknown",
            //46
            "Bruce Lee",
            //47
            "Unknown",
            //48
            "Grant Cardone",
            //49
            "Johann Wolfgang von Goethe",
            //50
            "Will Rogers",
            //51
            "Muhammad Ali",
            //52
            "Mark Twain",
            //53
            "Albert Einstein",
            //54
            "Caroline Myss",
            //55
            "Unknown",
            //56
            "Sheryl Sandberg",
            //57
            "Abraham Lincoln",
            //58
            "Epictetus",
            //59
            "Unknown",
            //60
            "Abraham Lincoln",
            //61
            "F. Scott. Fitzgerald",
            //62
            "Paulo Coelho",
            //63
            "Chinese proverb",
            //64
            "Anne Frank",
            //65
            "Unknown",
            //66
            "Jordan Belfort",
            //67
            "Steve Maraboli",
            //68
            "H. G. Wells",
            //69
            "Unknown",
            //70
            "St. Jerome",
            //71
            "Unknown",
            //72
            "Tony Gaskins",
            //73
            "Jenny Craig",
            //74
            "Nelson Mandela",
            //75
            "Arnold Schwarzenegger",
            //76
            "Tony Robbins",
            //77
            "Tom Bilyeu",
            //78
            "Gary Vaynerchuck",
            //79
            "Leah LaBelle",
            //80
            "Unknown",
            //81
            "Orison Swett Marden",
            //82
            "Babe Ruth",
            //83
            "Roy T. Bennett",
            //84
            "Chantal Sutherland",
            //85
            "Ernest Hemingway",
            //86
            "Dwayne Johnson",
            //87
            "Unknown",
            //88
            "Karen E. Quinones Miller",
            //89
            "Steve Martin",
            //90
            "Richard Branson",
            //91
            "Michele Ruiz",
            //92
            "Leo Tolstoy",
            //93
            "Suzy Kassem",
            //94
            "Unknown",
            //95
            "Arianna Huffington",
            //96
            "Unknown",
            //97
            "Helen Keller",
            //98
            "Lao Tzu",
            //99
            "Carrie Green",
            //100
            "Unknown",
            //101
            "Paulo Coelho",
            //102
            "Unknown",
            //103
            "Nelson Mandela",
            //104
            "Walt Disney",
            //105
            "Pablo Picasso",
            //106
            "Buddha",
            //107
            "Unknown",
            //108
            "Johann Wolfgang von Goethe",
            //109
            "Unknown",
            //110
            "Michael Jordan",
            //111
            "Ken Poirot",
            //112
            "Bob Dylan",
            //113
            "William Arthur Ward",
            //114
            "George Lorimer",
            //115
            "Earl Nightingale",
            //116
            "Dwayne Johnson",
            //117
            "Brad Sugars",
            //118
            "Benjamin Franklin",
            //119
            "Roger Staubach",
            //120
            "Bruce Lee",
            //121
            "Barack Obama",
            //122
            "Unknown",
            //123
            "Unknown",
            //124
            "Unknown",
            //125
            "Baz Luhrmann",
            //126
            "Unknown",
            //127
            "Aly Raisman",
            //128
            "Mohammad Ali Bapir",
            //129
            "Conan O’Brien",
            //130
            "George S. Patton",
            //131
            "Unknown",
            //132
            "Larry Winget",
            //133
            "Oprah Winfrey",
            //134
            "Confucius",
            //135
            "Thomas J. Watson",
            //136
            "Peter Turla",
            //137
            "Leonardo da Vinci",
            //138
            "Tony Robbins",
            //139
            "Marcus Aurelius",
            //140
            "Stephen King"
    };
    private static String[][] motivationTags = {
            //0
            {"motivation", "tim", "notke", "hard", "work", "beats", "talent", "when", "doesn’t"},
            //1
            {"motivation", "buddha", "endurance", "is", "one", "of", "the", "most", "difficult", "disciplines", "but", "it", "to", "who", "endures", "that", "final", "victory", "comes"},
            //2
            {"motivation", "john", "c", "maxwell", "dreams", "don’t", "work", "unless", "you", "do"},
            //3
            {"motivation", "don’t", "quit", "yet", "the", "worst", "moments", "are", "usually", "followed", "by", "most", "beautiful", "silver", "linings", "you", "have", "to", "stay", "strong", "remember", "keep", "your", "head", "up", "and", "remain", "hopeful"},
            //4
            {"motivation", "reese", "evans", "this", "is", "a", "reminder", "to", "you", "create", "your", "own", "rule", "book", "and", "live", "life", "the", "way", "want", "it"},
            //5
            {"motivation", "steve", "maraboli", "at", "the", "end", "of", "day", "let", "there", "be", "no", "excuses", "explanations", "regrets"},
            //6
            {"motivation", "mandy", "hale", "change", "is", "painful", "but", "nothing", "as", "staying", "stuck", "somewhere", "you", "don’t", "belong"},
            //7
            {"motivation", "george", "b", "bernard", "shaw", "those", "who", "cannot", "change", "their", "minds", "anything"},
            //8
            {"motivation", "jimmy", "garoppolo", "by", "making", "yourself", "better", "that’s", "how", "you", "make", "your", "team"},
            //9
            {"motivation", "john", "f", "kennedy", "when", "written", "in", "chinese", "the", "word", "‘crisis’", "is", "composed", "of", "two", "characters", "one", "represents", "danger", "and", "other", "opportunity"},
            //10
            {"motivation", "brian", "vaszily", "falling", "down", "is", "how", "we", "grow", "staying", "die"},
            //11
            {"motivation", "richard", "nixon", "a", "man", "is", "not", "finished", "when", "he", "defeated", "quits"},
            //12
            {"motivation", "walt", "disney", "if", "you", "can", "dream", "it", "do"},
            //13
            {"motivation", "jerry", "rice", "today", "i", "will", "do", "what", "others", "won’t", "so", "tomorrow", "can", "can’t"},
            //14
            {"motivation", "albert", "einstein", "life", "is", "like", "riding", "a", "bicycle", "to", "keep", "your", "balance", "you", "must", "moving"},
            //15
            {"motivation", "never", "stop", "doing", "your", "best", "just", "because", "someone", "doesn’t", "give", "you", "credit"},
            //16
            {"motivation", "zig", "ziglar", "make", "today", "worth", "remembering"},
            //17
            {"motivation", "arthur", "ashe", "start", "where", "you", "are", "use", "what", "have", "do", "can"},
            //18
            {"motivation", "william", "cobbett", "you", "never", "know", "what", "can", "do", "until", "try"},
            //19
            {"motivation", "don’t", "tell", "everyone", "your", "plans", "instead", "show", "them", "results"},
            //20
            {"motivation", "kendrick", "lamar", "i", "always", "thought", "it", "was", "me", "against", "the", "world", "and", "then", "one", "day", "realized", "it’s", "just"},
            //21
            {"motivation", "ayn", "rand", "the", "question", "isn’t", "who", "is", "going", "to", "let", "me", "it’s", "stop"},
            //22
            {"motivation", "falling", "down", "is", "an", "accident", "staying", "a", "choice"},
            //23
            {"motivation", "don’t", "talk", "just", "act", "say", "show", "promise", "prove"},
            //24
            {"motivation", "c", "s", "lewis", "you", "can’t", "go", "back", "and", "change", "the", "beginning", "but", "can", "start", "where", "are", "ending"},
            //25
            {"motivation", "when", "you", "feel", "like", "giving", "up", "just", "remember", "that", "there", "are", "a", "lot", "of", "people", "still", "have", "to", "prove", "wrong"},
            //26
            {"motivation", "jocko", "willink", "there", "is", "no", "easy", "way", "only", "hard", "work", "late", "nights", "early", "mornings", "practice", "repetition", "study", "sweat", "blood", "frustration", "and", "discipline"},
            //27
            {"motivation", "just", "stick", "with", "it", "what", "seems", "so", "hard", "now", "will", "one", "day", "be", "your", "warm", "up"},
            //28
            {"motivation", "mark", "twain", "the", "secret", "of", "getting", "ahead", "is", "started"},
            //29
            {"motivation", "mary", "kay", "ash", "don’t", "limit", "yourself", "many", "people", "themselves", "to", "what", "they", "think", "can", "do", "you", "go", "as", "far", "mind", "lets", "believe", "remember", "achieve"},
            //30
            {"motivation", "things", "will", "get", "better", "so", "don’t", "give", "up", "okay"},
            //31
            {"motivation", "you’re", "so", "much", "stronger", "than", "you", "excuses"},
            //32
            {"motivation", "maya", "angelou", "you", "will", "face", "many", "defeats", "in", "life", "but", "never", "let", "yourself", "be", "defeated"},
            //33
            {"motivation", "grant", "cardone", "the", "ambitious", "are", "criticised", "by", "those", "that", "have", "given", "up"},
            //34
            {"motivation", "vincent", "van", "gogh", "great", "things", "are", "done", "by", "a", "series", "of", "small", "brought", "together"},
            //35
            {"motivation", "isabelle", "lafleche", "your", "passion", "is", "waiting", "for", "courage", "to", "catch", "up"},
            //36
            {"motivation", "steve", "maraboli", "stop", "giving", "meaningless", "praise", "and", "start", "meaningful", "action"},
            //37
            {"motivation", "anne", "frank", "everyone", "has", "inside", "them", "a", "piece", "of", "good", "news", "the", "is", "you", "don’t", "know", "how", "great", "can", "be", "much", "love", "what", "accomplish", "and", "your", "potential"},
            //38
            {"motivation", "ray", "t", "bennett", "you", "have", "two", "choices", "to", "conquer", "your", "fear", "or", "let"},
            //39
            {"motivation", "victory", "is", "reserved", "for", "those", "who", "are", "willing", "to", "pay", "its", "price"},
            //40
            {"motivation", "william", "arthur", "ward", "adversity", "causes", "some", "men", "to", "break", "others", "records"},
            //41
            {"motivation", "debby", "boone", "dreams", "are", "the", "seeds", "of", "change", "nothing", "every", "grows", "without", "a", "seed", "and", "changes", "dream"},
            //42
            {"motivation", "robin", "s", "sharma", "we", "are", "all", "here", "for", "some", "special", "reason", "stop", "being", "a", "prisoner", "of", "your", "past", "become", "the", "architect", "future"},
            //43
            {"motivation", "kenneth", "goldsmith", "if", "you", "work", "on", "something", "a", "little", "bit", "every", "day", "end", "up", "with", "that", "is", "massive"},
            //44
            {"motivation", "h", "jackson", "brown", "jr", "don’t", "say", "you", "have", "enough", "time", "exactly", "the", "same", "number", "of", "hours", "per", "day", "that", "were", "given", "to", "helen", "keller", "pasteur", "michelangelo", "mother", "teresa", "leonardo", "da", "vinci", "thomas", "jefferson", "and", "albert", "einstein"},
            //45
            {"motivation", "the", "struggle", "you’re", "in", "today", "is", "developing", "strength", "you", "need", "tomorrow", "stay", "safe", "smart", "healthy"},
            //46
            {"motivation", "bruce", "lee", "defeat", "is", "a", "state", "of", "mind", "no", "one", "ever", "defeated", "until", "accepted", "as", "reality"},
            //47
            {"motivation", "it’s", "okay", "to", "outgrow", "people", "who", "don’t", "grow", "tall", "anyways"},
            //48
            {"motivation", "grant", "cardone", "let", "the", "rest", "do", "whatever", "while", "you", "it", "takes"},
            //49
            {"motivation", "johann", "wolfgang", "von", "goethe", "everything", "is", "hard", "before", "it", "easy"},
            //50
            {"motivation", "will", "rogers", "even", "if", "you’re", "on", "the", "right", "track", "you’ll", "get", "run", "over", "you", "just", "sit", "there"},
            //51
            {"motivation", "muhammad", "ali", "i", "hated", "every", "minute", "of", "training", "but", "said", "‘don’t", "quit", "suffer", "now", "and", "live", "the", "rest", "your", "life", "as", "a", "champion"},
            //52
            {"motivation", "mark", "twain", "twenty", "years", "from", "now", "you’ll", "be", "more", "disappointed", "by", "the", "things", "you", "did", "not", "do", "than", "ones"},
            //53
            {"motivation", "albert", "einstein", "in", "the", "middle", "of", "every", "difficulty", "lies", "opportunity"},
            //54
            {"motivation", "caroline", "myss", "go", "with", "the", "choice", "that", "scares", "you", "most", "because", "that’s", "one", "going", "to", "help", "grow"},
            //55
            {"motivation", "don’t", "limit", "your", "challenges", "challenge", "limits"},
            //56
            {"motivation", "sheryl", "sandberg", "comes", "from", "working", "on", "things", "we", "care", "about"},
            //57
            {"motivation", "abraham", "lincoln", "things", "may", "come", "to", "those", "who", "wait", "but", "only", "the", "left", "by", "hustle"},
            //58
            {"motivation", "epictetus", "first", "say", "to", "yourself", "what", "you", "would", "be", "and", "then", "do", "have"},
            //59
            {"motivation", "you", "did", "not", "wake", "up", "today", "to", "be", "average"},
            //60
            {"motivation", "abraham", "lincoln", "the", "best", "way", "to", "predict", "your", "future", "is", "create", "it"},
            //61
            {"motivation", "f", "scott", "fitzergerald", "never", "confuse", "a", "single", "defeat", "with", "final"},
            //62
            {"motivation", "paulo", "coelho", "impossible", "is", "just", "an", "opinion"},
            //63
            {"motivation", "chinese", "proverb", "the", "best", "time", "to", "plant", "a", "tree", "was", "20", "years", "ago", "he", "second", "is", "now"},
            //64
            {"motivation", "anne", "frank", "how", "wonderful", "it", "is", "that", "nobody", "needs", "to", "wait", "a", "single", "moment", "before", "starting", "improve", "the", "world"},
            //65
            {"motivation", "forget", "your", "excuses", "you", "either", "want", "it", "bad", "or", "don’t", "at", "all"},
            //66
            {"motivation", "jordan", "belfort", "the", "only", "thing", "standing", "in", "way", "between", "you", "and", "your", "goals", "is", "bs", "story", "keep", "telling", "yourself", "as", "to", "why", "can’t", "achieve", "it"},
            //67
            {"motivation", "steve", "maraboli", "it", "doesn’t", "matter", "what", "you", "did", "or", "where", "were", "matters", "are", "and", "you’re", "doing", "get", "out", "there", "sing", "the", "song", "in", "your", "heart", "never", "let", "anyone", "shut", "up"},
            //68
            {"motivation", "h", "g", "wells", "if", "you", "fell", "down", "yesterday", "stand", "up", "today"},
            //69
            {"motivation", "if", "you", "are", "struggling", "progressing"},
            //70
            {"motivation", "st", "jerome", "good", "better", "best", "never", "let", "it", "rest", "‘til", "your", "is", "and"},
            //71
            {"motivation", "those", "who", "fly", "alone", "have", "the", "strongest", "wings"},
            //72
            {"motivation", "tony", "gaskins", "even", "at", "your", "best", "someone", "will", "have", "something", "negative", "to", "say", "pursue", "greatness", "anyways"},
            //73
            {"motivation", "jenny", "craig", "it’s", "not", "what", "you", "do", "once", "in", "a", "while", "day", "and", "out", "that", "makes", "the", "difference"},
            //74
            {"motivation", "nelson", "mandela", "a", "winner", "is", "dreamer", "who", "never", "gives", "up"},
            //75
            {"motivation", "arnold", "schwarzenegger", "you", "can", "have", "results", "or", "excuses", "not", "both"},
            //76
            {"motivation", "tony", "robbins", "stop", "being", "afraid", "of", "what", "could", "go", "wrong", "and", "start", "excited", "about", "right"},
            //77
            {"motivation", "tom", "bilyeu", "it’s", "about", "identity", "be", "the", "kind", "of", "person", "that", "gets", "things", "done", "even", "when", "hard"},
            //78
            {"motivation", "gary", "vaynerchuck", "all", "your", "ideas", "may", "be", "solid", "or", "even", "good", "but", "you", "have", "to", "actually", "execute", "on", "them", "for", "matter"},
            //79
            {"motivation", "leah", "labelle", "work", "hard", "for", "what", "you", "want", "because", "it", "won’t", "come", "to", "without", "a", "fight", "have", "be", "strong", "and", "courageous", "know", "that", "can", "do", "anything", "put", "your", "mind"},
            //80
            {"motivation", "a", "hill", "is", "just", "another", "opportunity", "to", "leave", "your", "competition", "behind"},
            //81
            {"motivation", "orison", "s", "swett", "marden", "believe", "with", "all", "your", "heart", "that", "you", "will", "do", "what", "were", "made", "to"},
            //82
            {"motivation", "babe", "ruth", "it’s", "hard", "to", "beat", "a", "person", "who", "never", "gives", "up"},
            //83
            {"motivation", "roy", "t", "bennett", "dreams", "don’t", "work", "unless", "you", "take", "action", "the", "surest", "way", "to", "make", "your", "come", "true", "is", "live", "them"},
            //84
            {"motivation", "chantal", "sutherland", "believe", "in", "yourself", "take", "on", "your", "challenges", "dig", "deep", "within", "to", "conquer", "fears", "never", "let", "anyone", "bring", "you", "down", "got", "keep", "going"},
            //85
            {"motivation", "ernest", "hemingway", "there", "is", "nothing", "noble", "in", "being", "superior", "to", "your", "fellow", "man", "true", "nobility", "former", "self"},
            //86
            {"motivation", "dwayne", "johnson", "it’s", "never", "about", "how", "you", "start", "always", "finish"},
            //87
            {"motivation", "you", "have", "to", "do", "what", "others", "won’t", "achieve", "don’t"},
            //88
            {"motivation", "karen", "e", "q", "quinones", "miller", "when", "someone", "tells", "me", "“no”", "it", "doesn’t", "mean", "i", "can’t", "do", "simply", "means", "with", "them"},
            //89
            {"motivation", "steve", "martin", "be", "so", "good", "they", "can’t", "ignore", "you"},
            //90
            {"motivation", "richard", "branson", "if", "you", "dreams", "don’t", "scare", "they", "are", "too", "small"},
            //91
            {"motivation", "michele", "ruiz", "if", "people", "are", "doubting", "how", "far", "you", "can", "go", "so", "that", "can’t", "hear", "them", "anymore"},
            //92
            {"motivation", "leo", "tolstoy", "everyone", "thinks", "of", "changing", "the", "world", "but", "no", "one", "himself"},
            //93
            {"motivation", "suzy", "kassem", "doubt", "kills", "more", "dreams", "than", "failure", "ever", "will"},
            //94
            {"motivation", "difficult", "doesn’t", "mean", "impossible", "it", "simply", "means", "that", "you", "have", "to", "work", "hard"},
            //95
            {"motivation", "arianna", "huffington", "we", "need", "to", "accept", "that", "won’t", "always", "make", "the", "right", "decisions", "we’ll", "screw", "up", "royally", "sometimes", "understanding", "failure", "is", "not", "opposite", "of", "success", "it’s", "part"},
            //96
            {"motivation", "may", "god", "have", "mercy", "upon", "my", "enemies", "cause", "i", "won’t"},
            //97
            {"motivation", "helen", "keller", "we", "can", "do", "anything", "want", "to", "if", "stick", "it", "long", "enough"},
            //98
            {"motivation", "lao", "tzu", "mastering", "others", "is", "strength", "yourself", "true", "power"},
            //99
            {"motivation", "carrie", "green", "i", "can", "and", "will", "watch", "me"},
            //100
            {"motivation", "if", "you’re", "going", "to", "quit", "anything", "being", "lazy", "making", "excuses", "and", "waiting", "for", "the", "right", "time"},
            //101
            {"motivation", "paulo", "coelho", "the", "world", "is", "changed", "by", "your", "example", "not", "opinion"},
            //102
            {"motivation", "know", "that", "deep", "inside", "you", "are", "resilient", "brave", "and", "so", "much", "stronger", "than", "your", "fears"},
            //103
            {"motivation", "nelson", "mandela", "i", "never", "lose", "either", "win", "or", "learn"},
            //104
            {"motivation", "walt", "disney", "all", "our", "dreams", "can", "come", "true", "if", "we", "have", "the", "courage", "to", "pursue", "them"},
            //105
            {"motivation", "pablo", "picasso", "learn", "the", "rules", "like", "a", "pro", "so", "you", "can", "break", "them", "an", "artist"},
            //106
            {"motivation", "buddha", "if", "you", "want", "to", "fly", "give", "up", "everything", "that", "weighs", "down"},
            //107
            {"motivation", "the", "world", "is", "a", "jungle", "you", "either", "fight", "or", "run", "forever"},
            //108
            {"motivation", "johann", "wolfgang", "von", "goethe", "whatever", "you", "can", "do", "or", "dream", "begin", "it", "boldness", "has", "genius", "power", "and", "magic", "in"},
            //109
            {"motivation", "you", "know", "what", "have", "to", "do", "just", "make", "it", "a", "priority"},
            //110
            {"motivation", "michael", "jordan", "some", "people", "want", "it", "to", "happen", "wish", "would", "others", "make"},
            //111
            {"motivation", "ken", "poirot", "today", "is", "your", "opportunity", "to", "build", "the", "tomorrow", "you", "want"},
            //112
            {"motivation", "bob", "dylan", "act", "the", "way", "you’d", "like", "to", "be", "and", "soon", "you’ll"},
            //113
            {"motivation", "william", "arthur", "ward", "study", "while", "others", "are", "sleeping", "work", "loading", "prepare", "playing", "and", "dream", "wishing"},
            //114
            {"motivation", "george", "lorimer", "you’ve", "got", "to", "get", "up", "every", "morning", "with", "determination", "if", "you’re", "going", "go", "bed", "satisfaction"},
            //115
            {"motivation", "earl", "nightingale", "never", "give", "up", "on", "a", "dream", "just", "because", "of", "the", "time", "it", "will", "take", "to", "accomplish", "pass", "anyway"},
            //116
            {"motivation", "dwayne", "johnson", "blood", "sweat", "and", "respect", "first", "two", "you", "give", "last", "one", "earn"},
            //117
            {"motivation", "brad", "sugars", "words", "can", "inspire", "thoughts", "provoke", "but", "only", "action", "truly", "brings", "you", "closer", "to", "your", "dreams"},
            //118
            {"motivation", "benjamin", "franklin", "you", "can", "do", "anything", "set", "your", "mind", "to"},
            //119
            {"motivation", "roger", "staubach", "there", "are", "no", "traffic", "jams", "along", "the", "extra", "mile"},
            //120
            {"motivation", "bruce", "lee", "the", "spirit", "of", "individual", "is", "determined", "by", "his", "dominating", "thought", "habits"},
            //121
            {"motivation", "barack", "obama", "you", "can’t", "let", "failures", "define", "have", "to", "your", "teach"},
            //122
            {"motivation", "whenever", "you", "find", "yourself", "doubting", "how", "far", "can", "go", "just", "remember", "have", "come"},
            //123
            {"motivation", "think", "back", "5", "years", "ago", "of", "where", "you’re", "at", "today", "ahead", "and", "what", "you", "want", "to", "accomplish", "be", "unstoppable"},
            //124
            {"motivation", "take", "the", "risk", "or", "lose", "chance"},
            //125
            {"motivation", "baz", "luhrmann", "trust", "yourself", "that", "you", "can", "do", "it", "and", "get"},
            //126
            {"motivation", "you", "are", "only", "confined", "by", "the", "walls", "build", "yourself"},
            //127
            {"motivation", "aly", "raisman", "the", "hard", "days", "are", "what", "make", "you", "stronger"},
            //128
            {"motivation", "mohammad", "ali", "bapir", "let", "your", "action", "manifest", "thought", "belief", "and", "passion"},
            //129
            {"motivation", "conan", "o'brien", "work", "hard", "be", "kind", "and", "amazing", "things", "will", "happen"},
            //130
            {"motivation", "george", "s", "patton", "a", "good", "plan", "violently", "executed", "now", "is", "better", "than", "perfect", "next", "week"},
            //131
            {"motivation", "it", "is", "okay", "to", "be", "scared", "cry", "but", "giving", "up", "should", "not", "an", "option"},
            //132
            {"motivation", "larry", "winget", "nobody", "ever", "wrote", "down", "a", "plan", "to", "be", "broke", "fat", "lazy", "or", "stupid", "those", "things", "are", "what", "happen", "when", "you", "don’t", "have"},
            //133
            {"motivation", "oprah", "winfrey", "the", "big", "secret", "in", "life", "is", "that", "there", "no", "whatever", "your", "goal", "you", "can", "get", "if", "you’re", "willing", "to", "work"},
            //134
            {"motivation", "confucius"},
            //135
            {"motivation", "thomas", "j", "watson"},
            //136
            {"motivation", "peter", "turla"},
            //137
            {"motivation", "leonardo", "da", "vinci"},
            //138
            {"motivation", "tony", "robbins"},
            //139
            {"motivation", "marcus", "aurelius"},
            //140
            {"motivation", "stephen", "king"}
    };

    public static String getMotivationQuote(int position) {
        return quotesMotivation[position];
    }

    public static String getMotivationAuthor(int position) {
        return quotesMotivationAuthors[position];
    }

    public static String[] getMotivationList() {
        return quotesMotivation;
    }

    static String[][] getMotivationTags() {
        return motivationTags;
    }

    public static int getMotivationListSize() {
        return quotesMotivation.length;
    }
}
