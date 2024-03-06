package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Happiness {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesHappiness and quotesHappinessAuthors
        int listSize = getHappinessListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesHappiness[randomIndexToSwap];
            tempAuthor = quotesHappinessAuthors[randomIndexToSwap];
            tempTags = happinessTags[randomIndexToSwap];
            quotesHappiness[randomIndexToSwap] = quotesHappiness[i];
            quotesHappinessAuthors[randomIndexToSwap] = quotesHappinessAuthors[i];
            happinessTags[randomIndexToSwap] = happinessTags[i];
            quotesHappiness[i] = tempQuote;
            quotesHappinessAuthors[i] = tempAuthor;
            happinessTags[i] = tempTags;
        }
    }

    private static String[] quotesHappiness = {
            //0
            "\"Shine your light and make a positive impact on the world; there is nothing so honourable as helping improve the lives of others.\"",
            //1
            "\"An entire sea of water can’t sink a ship unless it gets inside the ship. Similarly, the negativity of the world can’t put you down unless you allow it to get inside you.\"",
            //2
            "\"Happiness is not by chance, but by choice.\"",
            //3
            "\"Being happy doesn’t mean everything is perfect. It means that you have decided to look beyond the imperfections.\"",
            //4
            "\"Happiness is being content with what you have, living in freedom and liberty, having a good family life and good friends.\"",
            //5
            "\"Happiness is not something ready-made. It comes from your own actions.\"",
            //6
            "\"Happiness cannot be traveled to, owned, earned, worn or consumed. Happiness is the spiritual experience of living every minute with love, grace, and gratitude.\"",
            //7
            "\"Happiness is not a goal; it is a by-product.\"",
            //8
            "\"Remember, happiness doesn’t depend upon who you are or what you have, it depends solely upon what you think.\"",
            //9
            "\"Happiness is the ability to move forward knowing that the future will be better than the past.\"",
            //10
            "\"In our lives, change is unavoidable, loss is unavoidable. In the adaptability and ease with which we experience change, lies our happiness and freedom.\"",
            //11
            "\"If you want to live a happy life, tie it to a goal, not to people or things.\"",
            //12
            "\"Happiness hides in life’s small details. If you’re not looking it becomes invisible.\"",
            //13
            "\"Happiness can be found even in the darkest of times, if one only remembers to turn on the light.\"",
            //14
            "\"A happy person is not a person in a certain set of circumstances, but rather a person with a certain set of attitudes.\"",
            //15
            "\"If you get up in the morning and think the future is going to be better, it is a bright day. Otherwise, it’s not.\"",
            //16
            "\"This is morning I awoke and was reminded of the preciousness of life. I realized I should express my gratitude to those who are so very important to me. Thank you for all you have done and have a great day!\"",
            //17
            "\"Happiness is a choice and a skill and you can dedicate yourself to learning that skill and making that choice.\"",
            //18
            "\"In my life I’ve learned that true happiness comes from giving. Helping others along the way makes you evaluate who you are. I think that love is what we’re all searching for. I haven’t come across anyone who didn’t become a better person through love.\"",
            //19
            "\"Today is life – the only life you are sure of. Make the most of today. Get interested in something. Shake yourself awake. Develop a hobby. Let the winds of enthusiasm sweep through you.\"",
            //20
            "\"The greatest happiness you can have is knowing that you do not necessarily require happiness.\"",
            //21
            "\"Who is the happiest of men? He who values the merits of others, and in their pleasure takes joy, even as though it were his own.\"",
            //22
            "\"My mission in life is not merely to survive, but to thrive; and to do so with some passion, some compassion, some humor, and some style.\"",
            //23
            "\"What we think determines what happens to us, so if we want to change our lives, we need to stretch our minds.\"",
            //24
            "\"You can’t be happy unless you’re unhappy sometimes.\"",
            //25
            "\"Rise above the storm and you will find the sunshine.\"",
            //26
            "\"Time you enjoy wasting is not wasted time.\"",
            //27
            "\"Happiness comes when you believe in what you are doing, know what you are doing and love what you are doing.\"",
            //28
            "\"Don’t let your happiness depend on something you may lose.\"",
            //29
            "\"Sometimes your joy is the source of your smile, but sometimes your smile can be the source of your joy.\"",
            //30
            "\"If you aren’t grateful for what you already have, what makes you think you would be happy with more.\"",
            //31
            "\"Happiness comes in waves. It will find you again.\"",
            //32
            "\"Happiness often sneaks through a door you didn’t know you left open.\"",
            //33
            "\"Cry. Forgive. Learn. Move on. Let your tears water the seeds of your future happiness.\"",
            //34
            "\"True happiness is not attained through self-gratification, but through fidelity to a worthy purpose.\"",
            //35
            "\"The best way to cheer yourself is to try to cheer someone else up.\"",
            //36
            "\"To fall in love with yourself is the first secret to happiness.\"",
            //37
            "\"How simple it is to see that we can only be happy now, and there will never be a time when it is not now.\"",
            //38
            "\"Thousands of candles can be lit from a single candle, and the life of the candle will not be shortened. Happiness never decreases by being shared.\"",
            //39
            "\"Three grand essentials to happiness in this life are something to do, something to love, and something to hope for.\"",
            //40
            "\"When one door of happiness closes, another opens; but often we look so long at the closed door that we do not see the one which has been opened for us.\"",
            //41
            "\"Happiness is like a butterfly. The more you chase it, the more farther away it will fly. But if you turn your attention to other things, it will come and sit softly on your shoulder.\"",
            //42
            "\"Very little is needed to make a happy life; it is all within yourself in your way of thinking.\"",
            //43
            "\"Difficult roads often lead to beautiful destinations.\"",
            //44
            "\"One way to get the most out of life is to look upon it as an adventure.\"",
            //45
            "\"Always laugh when you can. It is cheap medicine.\"",
            //46
            "\"There is no way to happiness – happiness is the way.\"",
            //47
            "\"Happiness grows at our own firesides, and is not to be picked in stranger’s gardens.\"",
            //48
            "\"Truly happy people don’t need to show others that they are.\"",
            //49
            "\"Let us be grateful to people who make us happy, they are the charming gardeners who make our souls blossom.\"",
            //50
            "\"When you arise in the morning, think of what precious privilege it is to be alive to breathe, to think, to enjoy, to love.\"",
            //51
            "\"Some people cause happiness wherever they go, others whenever they go.\"",
            //52
            "\"The true secret of happiness lies in taking a genuine interest in all the details of daily life.\"",
            //53
            "\"Happiness is not a state to arrive at, but a manner of travelling.\"",
            //54
            "\"Life is beautiful not because of the things we see or do. Life is beautiful because of the people we meet.\"",
            //55
            "\"The foolish man seeks happiness in the distance, the wise grows it under his feet.\"",
            //56
            "\"In order to have great happiness you have to have great pain and unhappiness – otherwise how would you know when you’re happy?\"",
            //57
            "\"Until you make peace with who you are, you’ll never be content with what you have.\"",
            //58
            "\"Start each day with a positive thought and a grateful heart.\"",
            //59
            "\"On the whole, the happiest people seem to be those who have no particular cause for being happy except that they are so.\"",
            //60
            "\"Happiness is not the absence of problems, it’s the ability to deal with them.\"",
            //61
            "\"Happiness is enjoying the little things in life.\"",
            //62
            "\"If you want to be happy, be.\"",
            //63
            "\"To be without some of the things you want is an indispensable part of happiness.\"",
            //64
            "\"If you want happiness for an hour- take a nap. If you want happiness for a day – go fishing. If you want happiness for a year – inherit a fortune. If you want happiness for a life time – help someone else.\"",
            //65
            "\"Happiness is not in our circumstances, but in ourselves. It is not something we see like a rainbow or something we feel like the heat of a fire. Happiness is something we are.\"",
            //66
            "\"There’s some good in this world, and it’s worth fighting for.\"",
            //67
            "\"There are two things to aim at in life: first, to get what you want; and after that, to enjoy it. Only the wisest of mankind achieve the second.\"",
            //68
            "\"As a well-spent day brings happy sleep, so a life well spent brings happy death.\"",
            //69
            "\"Don’t seek happiness. Create it.\"",
            //70
            "\"The happiness of your life depends upon the quality of your thoughts.\"",
            //71
            "\"Doing what you like is freedom. Liking what you do is happiness.\"",
            //72
            "\"Very little is needed to make a happy life; it is all within yourself in your way of thinking.\"",
            //73
            "\"A shared joy is a double joy; shared sorrow is half a sorrow.\"",
            //74
            "\"Happiness is more than doing fun things. It’s about doing meaningful things.\"",
            //75
            "\"Happiness is not an ideal of reason, but of imagination.\"",
            //76
            "\"For every minute you are angry you lose sixty seconds of happiness.\"",
            //77
            "\"The world is full of nice people. If you can’t find one, be one.\"",
            //78
            "\"Be happy not because everything is good, but because you can see the good side of everything.\"",
            //79
            "\"Happiness always looks small while you hold it in your hands, but let it go, and you learn at once how big and precious it is.\"",
            //80
            "\"Folks are usually about as happy as they make their minds up to be.\"",
            //81
            "\"I think the key to life is just being a happy person, and happiness will bring you success.\"",
            //82
            "\"The key to being happy is knowing that you have the power to choose what to accept and what to let go.\"",
            //83
            "\"True happiness is when we are happy with ourselves.\"",
            //84
            "\"People should find happiness in the little things, like family.\"",
            //85
            "\"Write the bad things that are done to you in sand, but write the good things that happen to you on a piece of marble.\"",
            //86
            "\"To be happy, we must not be too concerned with others.\"",
            //87
            "\"There is no happiness like that of being loved by your fellow creatures, and feeling that your presence is an addition to their comfort.\"",
            //88
            "\"If you want happiness for an hour, take a nap. If you want happiness for a day, go fishing. If you want happiness for a year, inherit a fortune. If you want happiness for a lifetime, help someone else.\"",
            //89
            "\"The greatest secret to happiness and peace is letting every life situation be what it is, instead of what you think it should be. Then, make the very best of it.\"",
            //90
            "\"Don’t cry because it’s over, smile because it happened.\"",
            //91
            "\"Happiness is the warm breeze you feel when you open the door to yourself.\"",
            //92
            "\"May you live every day of your life.\"",
            //93
            "\"He is richest who is content with the least, for content is the wealth of nature.\"",
            //94
            "\"Happiness does not lead to gratitude. Gratitude leads to happiness.\"",
            //95
            "\"We all live with the objective of being happy; our lives are all different and yet the same.\"",
            //96
            "\"Happiness is the best make-up.\"",
            //97
            "\"It is not how much we have, but how much we enjoy that makes happiness.\"",
            //98
            "\"True happiness is to enjoy the present, without anxious dependence upon the future, not to amuse ourselves with either hopes or dears but to rest satisfied with what we have.\"",
            //99
            "\"Keep your face to the sunshine and you cannot see a shadow.\"",
            //100
            "\"Even a happy life cannot be without a measure of darkness, and the word ‘happy’ would lose its meaning if it were not balanced by sadness.\"",
            //101
            "\"Happiness is when what you think, what you say, and what you do are in harmony.\"",
            //102
            "\"Whoever is happy will make others happy.\"",
            //103
            "\"Pursuing happiness is like trying to catch air. Just breathe and let it in.\"",
            //104
            "\"Happiness depends upon ourselves.\"",
            //105
            "\"Dwell on the beauty of life. Watch the stars, and see yourself running with them.\"",
            //106
            "\"Nobody really cares if you’re miserable, so you might as well be happy.\"",
            //107
            "\"Lighten up, just enjoy life, smile more, laugh more and don’t get so worked up about things.\"",
            //108
            "\"My happiness grows in direct proportion to my acceptance, and in inverse proportion to my expectations.\"",
            //109
            "\"Now and then it’s good to pause in our pursuit of happiness and just be happy.\"",
            //110
            "\"Enjoy your own life without comparing it with that of another.\"",
            //111
            "\"If thou wilt make a man happy, add not unto his riches but take away from his desires.\"",
            //112
            "\"The talent for being happy is appreciating and liking what you have, instead of what you don’t have.\"",
            //113
            "\"Life will bring you pain all by itself. Your responsibility is to create joy.\"",
            //114
            "\"Happiness is acceptance.\"",
            //115
            "\"To be kind to all, to like many and love a few, to be needed and wanted by those we love, is certainly the nearest we can come to happiness.\"",
            //116
            "\"Everyone wants to live on top of the mountain, but all the happiness and growth occurs while you're climbing it.\"",
            //117
            "\"The art of being happy lies in the power of extracting happiness from common things.\"",
            //118
            "\"Gratitude is a vaccine, an antitoxin, and an antiseptic.\"",
            //119
            "\"There is only one happiness in this life, to love and be loved.\"",
            //120
            "\"Happiness doesn’t depend on any external conditions, it is governed by our mental attitude.\"",
            //121
            "\"Happiness is not in the mere possession of money; it lies in the joy of achievement, in the thrill of creative effort.\"",
            //122
            "\"If you are too busy to laugh, you are too busy.\"",
            //123
            "\"Happy he who learns to bear what he cannot change.\"",
            //124
            "\"The only thing that will make you happy is being happy with who you are, and not who people think you are.\"",
            //125
            "\"When I look back on all these worries, I remember the story of the old man who said on his deathbed that he had had a lot of trouble in his life, most of which had never happened.\"",
            //126
            "\"No act of kindness, no matter how small, is ever wasted.\"",
            //127
            "\"The most important thing is to enjoy your life—to be happy—it's all that matters.\"",
            //128
            "\"There's nothing like deep breaths after laughing that hard. Nothing in the world like a sore stomach for the right reasons.\"",
            //129
            "\"Happiness consists of living each day as if it were the first day of your honeymoon and the last day of your vacation.\"",
            //130
            "\"Happiness is nothing more than good health and a bad memory.\"",
            //131
            "\"We don’t stop playing because we grow old; we grow old because we stop playing.\"",
            //132
            "\"Happiness is a choice. You can choose to be happy. There’s going to be stress in life, but it’s your choice whether you let it affect you or not.\"",
            //133
            "\"The two enemies of human happiness are pain and boredom.\"",
            //134
            "\"The first recipe for happiness is: avoid too lengthy meditation on the past.\"",
            //135
            "\"Happiness is not something you postpone for the future; it is something you design for the present.\"",
            //136
            "\"Worry never robs tomorrow of its sorrow. It only saps today of its joy.\"",
            //137
            "\"The moments of happiness we enjoy take us by surprise. It is not that we seize them, but that they seize us.\"",
            //138
            "\"A well-developed sense of humor is the pole that adds balance to your steps as you walk the tightrope of life.\"",
            //139
            "\"Happiness is a how; not a what. A talent, not an object.\"",
            //140
            "\"Happiness consists more in small conveniences or pleasures that occur every day, than in great pieces of good fortune that happen but seldom to a man in the course of his life.\"",
            //141
            "\"I'd far rather be happy than right any day.\"",
            //142
            "\"Happiness radiates like the fragrance from a flower and draws all good things towards you.\"",
            //143
            "\"We tend to forget that happiness doesn't come as a result of getting something we don't have, but rather of recognizing and appreciating what we do have.\"",
            //144
            "\"If you spend your whole life waiting for the storm, you’ll never enjoy the sunshine.\"",
            //145
            "\"It is more fitting for a man to laugh at life than to lament over it.\"",
            //146
            "\"On a deeper level you are already complete. When you realize that, there is a playful, joyous energy behind what you do.\"",
            //147
            "\"It was only a sunny smile, and little it cost in the giving, but like morning light it scattered the night and made the day worth living.\"",
            //148
            "\"I believe compassion to be one of the few things we can practice that will bring immediate and long-term happiness to our lives.\"",
            //149
            "\"Most people would rather be certain they’re miserable, than risk being happy.\"",
            //150
            "\"The glow of one warm thought is to me worth more than money.\""
    };
    private static String[] quotesHappinessAuthors = {
            //0
            "Roy T. Bennett",
            //1
            "Goi Nasu",
            //2
            "Jim Rohn",
            //3
            "Unknown",
            //4
            "Divyanka Tripathi",
            //5
            "Dalai Lama",
            //6
            "Denis Waitley",
            //7
            "Eleanor Roosevelt",
            //8
            "Dale Carnegie",
            //9
            "Zig Ziglar",
            //10
            "Buddha",
            //11
            "Albert Einstein",
            //12
            "Joyce Brothers",
            //13
            "Albus Dumbledore (Harry Potter)",
            //14
            "Hugh Downs",
            //15
            "Elon Musk",
            //16
            "Unknown",
            //17
            "Naval Ravikant",
            //18
            "Marla Gibbs",
            //19
            "Dale Carnegie",
            //20
            "Unknown",
            //21
            "Johann Wolfgang von Goethe",
            //22
            "Maya Angelou",
            //23
            "Wayne Dyer",
            //24
            "Lauren Oliver",
            //25
            "Mario Fernandez",
            //26
            "Marthe Troly-Curtin",
            //27
            "Brian Tracey",
            //28
            "C. S. Lewis",
            //29
            "Thich Nhat Hanh",
            //30
            "Roy T. Bennett",
            //31
            "Unknown",
            //32
            "John Barry More",
            //33
            "Steve Maraboli",
            //34
            "Helen Keller",
            //35
            "Mark Twain",
            //36
            "Robert Morley",
            //37
            "Gerald Jampolsky",
            //38
            "Buddha",
            //39
            "Joseph Addison",
            //40
            "Helen Keller",
            //41
            "Henry David Thoreau",
            //42
            "Marcus Aurelius",
            //43
            "Unknown",
            //44
            "William Feather",
            //45
            "Lord Byron",
            //46
            "Thich Nhat Hanh",
            //47
            "Douglas Jerrold",
            //48
            "Maxime Legacé",
            //49
            "Marcel Proust",
            //50
            "Marcus Aurelius",
            //51
            "Oscar Wilde",
            //52
            "William Morris",
            //53
            "Margaret Lee Runbeck",
            //54
            "Simon Sinek",
            //55
            "James Oppenheim",
            //56
            "Leslie Caron",
            //57
            "Doris Mortman",
            //58
            "Roy T. Bennett",
            //59
            "William R. Inge",
            //60
            "Steve Maraboli",
            //61
            "Kurt Vonnegut Jr.",
            //62
            "Leo Tolstoy",
            //63
            "Bertrand Russell",
            //64
            "Chinese proverb",
            //65
            "John B. Sheerin",
            //66
            "Samwise Gamgee (The Lord of the Rings)",
            //67
            "Logan Pearsall Smith",
            //68
            "Leonardo da Vinci",
            //69
            "Unknown",
            //70
            "Marcus Aurelius",
            //71
            "Unknown",
            //72
            "Marcus Aurelius",
            //73
            "Swedish proverb",
            //74
            "Maxime Lagacé",
            //75
            "Immanuel Kant",
            //76
            "Ralph Waldo Emerson",
            //77
            "Nishan Panwar",
            //78
            "Unknown",
            //79
            "Maxim Gorky",
            //80
            "Abraham Lincoln",
            //81
            "Diego Val",
            //82
            "Dodinsky",
            //83
            "Unknown",
            //84
            "Amanda Bynes",
            //85
            "Arabic proverb",
            //86
            "Albert Camus",
            //87
            "Charlotte Bronte",
            //88
            "Chinese proverb",
            //89
            "Thibaut",
            //90
            "Ludwig Jacobowski",
            //91
            "Unknown",
            //92
            "Jonathan Swift",
            //93
            "Socrates",
            //94
            "David Steindl-Rast",
            //95
            "Anne Frank",
            //96
            "Drew Barrymore",
            //97
            "Charles Spurgeon",
            //98
            "Seneca",
            //99
            "Helen Keller",
            //100
            "Carl Jung",
            //101
            "Mahatma Gandhi",
            //102
            "Anne Frank",
            //103
            "Unknown",
            //104
            "Aristotle",
            //105
            "Marcus Aurelius",
            //106
            "Cynthia Nelms",
            //107
            "Kenneth Branagh",
            //108
            "Michael J. Fox",
            //109
            "Guillaume Apollinaire",
            //110
            "Marquis de Condorcet",
            //111
            "Epicurus",
            //112
            "Woody Allen",
            //113
            "Milton Erickson",
            //114
            "Unknown",
            //115
            "Mary Stuart",
            //116
            "Andy Rooney",
            //117
            "Henry Ward Beecher",
            //118
            "John Henry Jowett",
            //119
            "George Sand",
            //120
            "Dale Carnegie",
            //121
            "Franklin D. Roosevelt",
            //122
            "Unknown",
            //123
            "Friedrich Schiller",
            //124
            "Goldie Hawn",
            //125
            "Winston Churchill",
            //126
            "Aesop",
            //127
            "Audrey Hepburn",
            //128
            "Stephen Chbosky",
            //129
            "Leo Tolstoy",
            //130
            "Albert Schweitzer",
            //131
            "George Bernard Shaw",
            //132
            "Valerie Bertinelli",
            //133
            "Arthur Schopenhauer",
            //134
            "Andre Maurois",
            //135
            "Jim Rohn",
            //136
            "Leo Buscaglia",
            //137
            "Ashley Montagu",
            //138
            "William Arthur Ward",
            //139
            "Herman Hesse",
            //140
            "Benjamin Franklin",
            //141
            "Douglas Adams",
            //142
            "Maharishi Mahesh Yogi",
            //143
            "Frederick Keonig",
            //144
            "Morris West",
            //145
            "Seneca",
            //146
            "Eckhart Tolle",
            //147
            "F. Scott Fitzgerald",
            //148
            "Dalai Lama",
            //149
            "Dr. Robert Anthony",
            //150
            "Thomas Jefferson"
    };
    private static String[][] happinessTags = {
            //0
            {"happiness", "roy", "t", "bennett", "shine", "your", "light", "and", "make", "a", "positive", "impact", "on", "the", "world", "there", "is", "nothing", "so", "honourable", "as", "helping", "improve", "lives", "of", "others"},
            //1
            {"happiness", "goi", "nasu", "an", "entire", "sea", "of", "water", "can’t", "sink", "a", "ship", "unless", "it", "gets", "inside", "the", "similarly", "negativity", "world", "put", "you", "down", "allow", "to", "get"},
            //2
            {"happiness", "jim", "rohn", "is", "not", "by", "chance", "but", "choice"},
            //3
            {"happiness", "being", "happy", "doesn’t", "mean", "everything", "is", "perfect", "it", "means", "that", "you", "have", "decided", "to", "look", "beyond", "the", "imperfections"},
            //4
            {"happiness", "divyanka", "tripathi",  "is", "being", "content", "with", "what", "you", "have", "living", "in", "freedom", "and", "liberty", "having", "a", "good", "family", "life", "friends"},
            //5
            {"happiness", "dalai", "lama", "is", "not", "something", "ready-made", "it", "comes", "from", "your", "own", "actions"},
            //6
            {"happiness", "denis", "waitley", "cannot", "be", "traveled", "to", "owned", "earned", "worn", "or", "consumed", "is", "the", "spiritual", "experience", "of", "living", "every", "minute", "with", "love", "grace", "and", "gratitude"},
            //7
            {"happiness", "eleanor", "roosevelt", "is", "not", "a", "goal", "it", "byproduct"},
            //8
            {"happiness", "dale", "carnegie", "remember", "doesn’t", "depend", "upon", "who", "you", "are", "or", "what", "have", "it", "depends", "solely", "think"},
            //9
            {"happiness", "zig", "ziglar", "is", "the", "ability", "to", "move", "forward", "knowing", "that", "future", "will", "be", "better", "than", "past"},
            //10
            {"happiness", "buddha", "in", "our", "lives", "change", "is", "unavoidable", "loss", "the", "adaptability", "and", "ease", "with", "which", "we", "experience", "lies", "freedom"},
            //11
            {"happiness", "albert", "einstein", "if", "you", "want", "to", "live", "a", "happy", "life", "tie", "it", "goal", "not", "people", "or", "things"},
            //12
            {"happiness", "joyce", "brothers", "hides", "in", "life’s", "small", "details", "if", "you’re", "not", "looking", "it", "becomes", "invisible"},
            //13
            {"happiness", "albus", "dumbledore", "harry", "potter", "can", "be", "found", "even", "in", "the", "darkest", "of", "times", "if", "one", "only", "remembers", "to", "turn", "on", "light"},
            //14
            {"happiness", "hugh", "downs", "a", "happy", "person", "is", "not", "in", "certain", "set", "of", "circumstances", "but", "rather", "with", "attitudes"},
            //15
            {"happiness", "elon", "musk", "if", "you", "get", "up", "in", "the", "morning", "and", "think", "future", "is", "going", "to", "be", "better", "it", "a", "bright", "day", "otherwise", "it’s", "not"},
            //16
            {"happiness", "this", "is", "morning", "i", "awoke", "and", "was", "reminded", "of", "the", "preciousness", "life", "realized", "should", "express", "my", "gratitude", "to", "those", "who", "are", "so", "very", "important", "me", "thank", "you", "for", "all", "have", "done", "a", "great", "day"},
            //17
            {"happiness", "naval", "ravikant", "is", "a", "choice", "and", "skill", "you", "can", "dedicate", "yourself", "to", "learning", "that", "making"},
            //18
            {"happiness", "marla", "gibbs", "in", "my", "life", "i’ve", "learned", "that", "true", "comes", "from", "giving", "helping", "others", "along", "the", "way", "makes", "you", "evaluate", "who", "are", "i", "think", "love", "is", "what", "we’re", "all", "searching", "for", "haven’t", "come", "across", "anyone", "didn’t", "become", "a", "better", "person", "through"},
            //19
            {"happiness", "dale", "carnegie", "today", "is", "life", "–", "the", "only", "you", "are", "sure", "of", "make", "most", "get", "interested", "in", "something", "shake", "yourself", "awake", "develop", "a", "hobby", "let", "winds", "enthusiasm", "sweep", "through"},
            //20
            {"happiness", "the", "greatest", "you", "can", "have", "is", "knowing", "that", "do", "not", "necessarily", "require"},
            //21
            {"happiness", "johann", "wolfgang", "von", "goethe", "who", "is", "the", "happiest", "of", "men", "he", "values", "merits", "others", "and", "in", "their", "pleasure", "takes", "joy", "even", "as", "though", "it", "were", "his", "own"},
            //22
            {"happiness", "maya", "angelou", "my", "mission", "in", "life", "is", "not", "merely", "to", "survive", "but", "thrive", "and", "do", "so", "with", "some", "passion", "compassion", "humor", "style"},
            //23
            {"happiness", "wayne", "dyer", "what", "we", "think", "determines", "happens", "to", "us", "so", "if", "want", "change", "our", "lives", "need", "stretch", "minds"},
            //24
            {"happiness", "lauren", "oliver", "you", "can’t", "be", "happy", "unless", "you’re", "unhappy", "sometimes"},
            //25
            {"happiness", "mario", "fernandez", "rise", "above", "the", "storm", "and", "you", "will", "find", "sunshine"},
            //26
            {"happiness", "marthe", "trolycurtin", "time", "you", "enjoy", "wasting", "is", "not", "wasted"},
            //27
            {"happiness", "brian", "tracey", "comes", "when", "you", "believe", "in", "what", "are", "doing", "know", "and", "love"},
            //28
            {"happiness", "c", "s", "lewis", "don’t", "let", "your", "depend", "on", "something", "you", "may", "lose"},
            //29
            {"happiness", "thich", "nhat", "hanh", "sometimes", "your", "joy", "is", "the", "source", "of", "smile", "but", "can", "be"},
            //30
            {"happiness", "roy", "t", "bennett", "if", "you", "aren’t", "grateful", "for", "what", "already", "have", "makes", "think", "would", "be", "happy", "with", "more"},
            //31
            {"happiness", "comes", "in", "waves", "it", "will", "find", "you", "again"},
            //32
            {"happiness", "john", "b","barry", "more", "often", "sneaks", "through", "a", "door", "you", "didn’t", "know", "left", "open"},
            //33
            {"happiness", "steve", "maraboli", "cry", "forgive", "learn", "move", "on", "let", "your", "tears", "water", "the", "seeds", "of", "future"},
            //34
            {"happiness", "helen", "keller", "true", "is", "not", "attained", "through", "selfgratification", "but", "fidelity", "to", "a", "worthy", "purpose"},
            //35
            {"happiness", "mark", "twain", "the", "best", "way", "to", "cheer", "yourself", "is", "try", "someone", "else", "up"},
            //36
            {"happiness", "robert", "morley", "to", "fall", "in", "love", "with", "yourself", "is", "the", "first", "secret"},
            //37
            {"happiness", "gerald", "jampolsky", "how", "simple", "it", "is", "to", "see", "that", "we", "can", "only", "be", "happy", "now", "and", "there", "will", "never", "a", "time", "when", "not"},
            //38
            {"happiness", "buddha", "thousands", "of", "candles", "can", "be", "lit", "from", "a", "single", "candle", "and", "the", "life", "will", "not", "shortened", "never", "decreases", "by", "being", "shared"},
            //39
            {"happiness", "joseph", "addison", "three", "grand", "essentials", "to", "in", "this", "life", "are", "something", "do", "love", "and", "hope", "for"},
            //40
            {"happiness", "helen", "keller", "when", "one", "door", "of", "closes", "another", "opens", "but", "often", "we", "look", "so", "long", "at", "the", "closed", "that", "do", "not", "see", "which", "has", "been", "opened", "for", "us"},
            //41
            {"happiness", "henry", "d","david", "thoreau", "is", "like", "a", "butterfly", "the", "more", "you", "chase", "it", "farther", "away", "will", "fly", "but", "if", "turn", "your", "attention", "to", "other", "things", "come", "and", "sit", "softly", "on", "shoulder"},
            //42
            {"happiness", "marcus", "aurelius", "very", "little", "is", "needed", "to", "make", "a", "happy", "life", "it", "all", "within", "yourself", "in", "your", "way", "of", "thinking"},
            //43
            {"happiness", "difficult", "roads", "often", "lead", "to", "beautiful", "destinations"},
            //44
            {"happiness", "william", "feather", "one", "way", "to", "get", "the", "most", "out", "of", "life", "is", "look", "upon", "it", "as", "an", "adventure"},
            //45
            {"happiness", "lord", "byron", "always", "laugh", "when", "you", "can", "it", "is", "cheap", "medicine"},
            //46
            {"happiness", "thich", "nhat", "hanh", "there", "is", "no", "way", "to", "the"},
            //47
            {"happiness", "douglas", "jerrold", "grows", "at", "our", "own", "firesides", "and", "is", "not", "to", "be", "picked", "in", "stranger’s", "gardens"},
            //48
            {"happiness", "maxime", "legacé", "legace", "truly", "happy", "people", "don’t", "need", "to", "show", "others", "that", "they", "are"},
            //49
            {"happiness", "marcel", "proust", "let", "us", "be", "grateful", "to", "people", "who", "make", "happy", "they", "are", "the", "charming", "gardeners", "our", "souls", "blossom"},
            //50
            {"happiness", "marcus", "aurelius", "when", "you", "arise", "in", "the", "morning", "think", "of", "what", "precious", "privilege", "it", "is", "to", "be", "alive", "breathe", "enjoy", "love"},
            //51
            {"happiness", "oscar", "wilde", "some", "people", "cause", "wherever", "they", "go", "others", "whenever"},
            //52
            {"happiness", "william", "morris", "the", "true", "secret", "of", "lies", "in", "taking", "a", "genuine", "interest", "all", "details", "daily", "life"},
            //53
            {"happiness", "margaret", "l","lee", "runbeck", "is", "not", "a", "state", "to", "arrive", "at", "but", "manner", "of", "travelling"},
            //54
            {"happiness", "simon", "sinek", "life", "is", "beautiful", "not", "because", "of", "the", "things", "we", "see", "or", "do", "people", "meet"},
            //55
            {"happiness", "james", "oppenheim", "the", "foolish", "man", "seeks", "in", "distance", "wise", "grows", "it", "under", "his", "feet"},
            //56
            {"happiness", "leslie", "caron", "in", "order", "to", "have", "great", "you", "pain", "and", "unhappiness", "otherwise", "how", "would", "know", "when", "you’re", "happy"},
            //57
            {"happiness", "doris", "mortman", "until", "you", "make", "peace", "with", "who", "are", "you’ll", "never", "be", "content", "what", "have"},
            //58
            {"happiness", "roy", "t", "bennett", "start", "each", "day", "with", "a", "positive", "thought", "and", "grateful", "heart"},
            //59
            {"happiness", "william", "r", "inge", "on", "the", "whole", "happiest", "people", "seem", "to", "be", "those", "who", "have", "no", "particular", "cause", "for", "being", "happy", "except", "that", "they", "are", "so"},
            //60
            {"happiness", "steve", "maraboli", "is", "not", "the", "absence", "of", "problems", "it’s", "ability", "to", "deal", "with", "them"},
            //61
            {"happiness", "kurt", "vonnegut", "jr", "is", "enjoying", "the", "little", "things", "in", "life"},
            //62
            {"happiness", "leo", "tolstoy", "if", "you", "want", "to", "be", "happy"},
            //63
            {"happiness", "bertrand", "russell", "to", "be", "without", "some", "of", "the", "things", "you", "want", "is", "an", "indispensable", "part"},
            //64
            {"happiness", "chinese", "proverb", "if", "you", "want", "for", "an", "hour", "take", "a", "nap", "day", "go", "fishing", "year", "inherit", "fortune", "life", "time", "help", "someone", "else"},
            //65
            {"happiness", "john", "b", "sheerin", "is", "not", "in", "our", "circumstances", "but", "ourselves", "it", "something", "we", "see", "like", "a", "rainbow", "or", "feel", "the", "heat", "of", "fire", "are"},
            //66
            {"happiness", "samwise", "gamgee", "lord", "of", "the", "rings", "there’s", "some", "good", "in", "this", "world", "and", "it’s", "worth", "fighting", "for"},
            //67
            {"happiness", "logan", "pearsall", "smith", "there", "are", "two", "things", "to", "aim", "at", "in", "life", "first", "get", "what", "you", "want", "and", "after", "that", "enjoy", "it", "only", "the", "wisest", "of", "mankind", "achieve", "second"},
            //68
            {"happiness", "leonardo", "da", "vinci", "as", "a", "wellspent", "day", "brings", "happy", "sleep", "so", "life", "well", "spent", "death"},
            //69
            {"happiness", "don’t", "seek", "create", "it"},
            //70
            {"happiness", "marcus", "aurelius", "the", "of", "your", "life", "depends", "upon", "quality", "thoughts"},
            //71
            {"happiness", "doing", "what", "you", "like", "is", "freedom", "liking", "do"},
            //72
            {"happiness", "marcus", "aurelius", "very", "little", "is", "needed", "to", "make", "a", "happy", "life", "it", "all", "within", "yourself", "in", "your", "way", "of", "thinking"},
            //73
            {"happiness", "swedish", "proverb", "a", "shared", "joy", "is", "double", "sorrow", "half"},
            //74
            {"happiness", "maxime", "legacé", "legace", "is", "more", "than", "doing", "fun", "things", "it’s", "about", "meaningful"},
            //75
            {"happiness", "immanuel", "kant", "is", "not", "an", "ideal", "of", "reason", "but", "imagination"},
            //76
            {"happiness", "ralph", "waldo", "emerson", "for", "every", "minute", "you", "are", "angry", "lose", "sixty", "seconds", "of"},
            //77
            {"happiness", "nishan", "panwar", "the", "world", "is", "full", "of", "nice", "people", "if", "you", "can’t", "find", "one", "be"},
            //78
            {"happiness", "be", "happy", "not", "because", "everything", "is", "good", "but", "you", "can", "see", "the", "side", "of"},
            //79
            {"happiness", "maxim", "gorky", "always", "looks", "small", "while", "you", "hold", "it", "in", "your", "hands", "but", "let", "go", "and", "learn", "at", "once", "how", "big", "precious", "is"},
            //80
            {"happiness", "abraham", "lincoln", "folks", "are", "usually", "about", "as", "happy", "they", "make", "their", "minds", "up", "to", "be"},
            //81
            {"happiness", "diego", "val", "i", "think", "the", "key", "to", "life", "is", "just", "being", "a", "happy", "person", "and", "will", "bring", "you", "success"},
            //82
            {"happiness", "dodinsky", "the", "key", "to", "being", "happy", "is", "knowing", "that", "you", "have", "power", "choose", "what", "accept", "and", "let", "go"},
            //83
            {"happiness", "true", "is", "when", "we", "are", "happy", "with", "ourselves"},
            //84
            {"happiness", "amanda", "bynes", "people", "should", "find", "in", "the", "little", "things", "like", "family"},
            //85
            {"happiness", "arabic", "proverb", "write", "the", "bad", "things", "that", "are", "done", "to", "you", "in", "sand", "but", "good", "happen", "on", "a", "piece", "of", "marble"},
            //86
            {"happiness", "albert", "camus", "to", "be", "happy", "we", "must", "not", "too", "concerned", "with", "others"},
            //87
            {"happiness", "charlotte", "bronte", "there", "is", "no", "like", "that", "of", "being", "loved", "by", "your", "fellow", "creatures", "and", "feeling", "presence", "an", "addition", "to", "their", "comfort"},
            //88
            {"happiness", "chinese", "proverb", "if", "you", "want", "for", "an", "hour", "take", "a", "nap", "day", "go", "fishing", "year", "inherit", "fortune", "lifetime", "help", "someone", "else"},
            //89
            {"happiness", "thibaut", "the", "greatest", "secret", "to", "and", "peace", "is", "letting", "every", "life", "situation", "be", "what", "it", "instead", "of", "you", "think", "should", "then", "make", "very", "best"},
            //90
            {"happiness", "ludwig", "jacobowski", "don’t", "cry", "because", "it’s", "over", "smile", "it", "happened"},
            //91
            {"happiness", "is", "the", "warm", "breeze", "you", "feel", "when", "open", "door", "to", "yourself"},
            //92
            {"happiness", "jonathan", "swift", "may", "you", "live", "every", "day", "of", "your", "life"},
            //93
            {"happiness", "socrates", "he", "is", "richest", "who", "content", "with", "the", "least", "for", "wealth", "of", "nature"},
            //94
            {"happiness", "david", "steindlrast", "does", "not", "lead", "to", "gratitude", "leads"},
            //95
            {"happiness", "anne", "frank", "we", "all", "live", "with", "the", "objective", "of", "being", "happy", "our", "lives", "are", "different", "and", "yet", "same"},
            //96
            {"happiness", "drew", "barrymore", "is", "the", "best", "makeup"},
            //97
            {"happiness", "charles", "spurgeon", "it", "is", "not", "how", "much", "we", "have", "but", "enjoy", "that", "makes"},
            //98
            {"happiness", "seneca", "true", "is", "to", "enjoy", "the", "present", "without", "anxious", "dependence", "upon", "future", "not", "amuse", "ourselves", "with", "either", "hopes", "or", "dears", "but", "rest", "satisfied", "what", "we", "have"},
            //99
            {"happiness", "helen", "keller", "keep", "your", "face", "to", "the", "sunshine", "and", "you", "cannot", "see", "a", "shadow"},
            //100
            {"happiness", "c", "carl", "g", "gustav", "jung", "even", "a", "happy", "life", "cannot", "be", "without", "measure", "of", "darkness", "and", "the", "word", "‘happy’", "would", "lose", "its", "meaning", "if", "it", "were", "not", "balanced", "by", "sadness"},
            //101
            {"happiness", "mahatma", "gandhi", "is", "when", "what", "you", "think", "say", "and", "do", "are", "in", "harmony"},
            //102
            {"happiness", "anne", "frank", "whoever", "is", "happy", "will", "make", "others"},
            //103
            {"happiness", "pursuing", "is", "like", "trying", "to", "catch", "air", "just", "breathe", "and", "let", "it", "in"},
            //104
            {"happiness", "aristotle", "depends", "upon", "ourselves"},
            //105
            {"happiness", "marcus", "aurelius", "dwell", "on", "the", "beauty", "of", "life", "watch", "stars", "and", "see", "yourself", "running", "with", "them"},
            //106
            {"happiness", "cynthia", "nelms", "nobody", "really", "cares", "if", "you’re", "miserable", "so", "you", "might", "as", "well", "be", "happy"},
            //107
            {"happiness", "kenneth", "branagh", "lighten", "up", "just", "enjoy", "life", "smile", "more", "laugh", "and", "don’t", "get", "so", "worked", "about", "things"},
            //108
            {"happiness", "michael", "j", "fox", "my", "grows", "in", "direct", "proportion", "to", "acceptance", "and", "inverse", "expectations"},
            //109
            {"happiness", "guillaume", "apollinaire", "now", "and", "then", "it’s", "good", "to", "pause", "in", "our", "pursuit", "of", "just", "be", "happy"},
            //110
            {"happiness", "marquis", "de", "condorcet"},
            //111
            {"happiness", "epicurus"},
            //112
            {"happiness", "woody", "allen"},
            //113
            {"happiness", "milton", "erickson"},
            //114
            {"happiness", },
            //115
            {"happiness", "mary", "stuart"},
            //116
            {"happiness", "andy", "rooney"},
            //117
            {"happiness", "henry", "w", "ward", "beecher"},
            //118
            {"happiness", "john", "h", "henry", "jowett"},
            //119
            {"happiness", "george", "sand"},
            //120
            {"happiness", "dale", "carnegie"},
            //121
            {"happiness", "franklin", "d", "roosevelt"},
            //122
            {"happiness", },
            //123
            {"happiness", "friedrich", "schiller"},
            //124
            {"happiness", "goldie", "hawn"},
            //125
            {"happiness", "winston", "churchill"},
            //126
            {"happiness", "aesop"},
            //127
            {"happiness", "audrey", "hepburn"},
            //128
            {"happiness", "stephen", "chbosky"},
            //129
            {"happiness", "leo", "tolstoy"},
            //130
            {"happiness", "albert", "schweitzer"},
            //131
            {"happiness", "george", "b", "bernard", "shaw"},
            //132
            {"happiness", "valerie", "bertinelli"},
            //133
            {"happiness", "arthur", "schopenhauer"},
            //134
            {"happiness", "andre", "maurois"},
            //135
            {"happiness", "jim", "rohn"},
            //136
            {"happiness", "leo", "buscaglia"},
            //137
            {"happiness", "ashley", "montagu"},
            //138
            {"happiness", "william", "arthur", "ward"},
            //139
            {"happiness", "herman", "hesse"},
            //140
            {"happiness", "benjamin", "franklin"},
            //141
            {"happiness", "douglas", "adams"},
            //142
            {"happiness", "maharishi", "mahesh", "yogi"},
            //143
            {"happiness", "frederick", "keonig"},
            //144
            {"happiness", "morris", "west"},
            //145
            {"happiness", "seneca"},
            //146
            {"happiness", "eckhart", "tolle"},
            //147
            {"happiness", "f", "scott", "fitzgerald"},
            //148
            {"happiness", "dalai", "lama"},
            //149
            {"happiness", "dr", "robert", "anthony"},
            //150
            {"happiness", "thomas", "jefferson"}
    };

    public static String getHappinessQuote(int position) {
        return quotesHappiness[position];
    }

    public static String getHappinessAuthor(int position) {
        return quotesHappinessAuthors[position];
    }

    public static String[] getHappinessList() {
        return quotesHappiness;
    }

    static String[][] getHappinessTags() {
        return happinessTags;
    }

    public static int getHappinessListSize() {
        return quotesHappiness.length;
    }
}
