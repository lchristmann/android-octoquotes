package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Purpose {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesPurpose and quotesPurposeAuthors
        int listSize = getPurposeListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesPurpose[randomIndexToSwap];
            tempAuthor = quotesPurposeAuthors[randomIndexToSwap];
            tempTags = purposeTags[randomIndexToSwap];
            quotesPurpose[randomIndexToSwap] = quotesPurpose[i];
            quotesPurposeAuthors[randomIndexToSwap] = quotesPurposeAuthors[i];
            purposeTags[randomIndexToSwap] = purposeTags[i];
            quotesPurpose[i] = tempQuote;
            quotesPurposeAuthors[i] = tempAuthor;
            purposeTags[i] = tempTags;
        }
    }

    private static String[] quotesPurpose = {
            //0
            "\"It is better to have a meaningful life and make a difference than to merely have a long life.\"",
            //1
            "\"The soul which has no fixed purpose in life is lost; to be everywhere, is to be nowhere.\"",
            //2
            "\"The purpose of human life is to serve, and to show compassion and the will to help others.\"",
            //3
            "\"The days, the weeks and months that you’re most lit up is when you’re full on purpose.\"",
            //4
            "\"Shrinking away from death is something unhealthy and abnormal which robs the second half of life of its purpose.\"",
            //5
            "\"I cannot believe that the purpose of life is to be happy. I think the purpose of life is to be useful, to be responsible, to be compassionate. It is, above all, to matter, to count, to stand for something, to have made some difference that you lived at all.\"",
            //6
            "\"If you have a strong purpose in life, you don’t have to be pushed. Your passion will drive you there.\"",
            //7
            "\"The self is made, not given.\"",
            //8
            "\"People don’t buy WHAT you do, they buy WHY you do it.\"",
            //9
            "\"To live is the rarest thing in the world. Most people just exist.\"",
            //10
            "\"If you can tune into your purpose and really align with it, setting goals so that your vision is an expression of that purpose, then life flows much more easily.\"",
            //11
            "\"Life has no meaning. Each of us has meaning and we bring it to life. It is a waste to be asking the question when you are the answer.\"",
            //12
            "\"Work gives you meaning and purpose and life is empty without it.\"",
            //13
            "\"Every moment of your life is infinitely creative and the universe is endlessly bountiful. Just put forth a clear enough request, and everything your heart desires must come to you.\"",
            //14
            "\"Efforts and courage are not enough without purpose and direction.\"",
            //15
            "\"Above all be of single aim; have a legitimate and useful purpose, and devote yourself unreservedly to it.\"",
            //16
            "\"Too many of us are not living our dreams because we are living our fears.\"",
            //17
            "\"Certain things catch your eye, but pursue only those that capture the heart.\"",
            //18
            "\"To begin to think with purpose, is to enter the ranks of those strong ones who only recognize failure as one of the pathways to attainment.\"",
            //19
            "\"There is not one big cosmic meaning for all; there is only the meaning we each give to our life, an individual meaning, an individual plot, like an individual novel, a book for each person.\"",
            //20
            "\"Definiteness of purpose is the starting point of all achievement.\"",
            //21
            "\"I believe purpose is something for which one is responsible; it’s not just divinely assigned.\"",
            //22
            "\"Storms make trees take deeper roots.\"",
            //23
            "\"Sometimes when you’re in a dark place you think you’ve been buried but you’ve actually been planted.\"",
            //24
            "\"The purpose of computing is insight, not numbers.\"",
            //25
            "\"He who has a why to live can bear almost any how.\"",
            //26
            "\"It is not out purpose to become each other; it is to recognize each other, to learn to see the other and honor him for what he is.\"",
            //27
            "\"You have to trust in something, your gut, destiny, life, karma, whatever. This approach has never let me down, and it has made all the difference in my life.\"",
            //28
            "\"A noble purpose inspires sacrifice, stimulates innovation and encourages perseverance.\"",
            //29
            "\"At a very early age, I developed a belief that we’re all here to contribute something unique, that deep within each of us lies a special gift.\"",
            //30
            "\"The mind is not a vessel to be filled but a fire to be kindled.\"",
            //31
            "\"My purpose: to lift your spirit and to motivate you.\"",
            //32
            "\"Remember that wherever your heart is, there you will find your treasure.\"",
            //33
            "\"We all have a purpose in life, and when you find yours you will recognize it.\"",
            //34
            "\"People take different roads seeking fulfilment and happiness. Just because they’re not on your road doesn’t mean they’ve gotten lost.\"",
            //35
            "\"Nothing will divert me from my purpose.\"",
            //36
            "\"There is no greater gift you can give or receive than to honor your calling. It’s why you were born. And how you become most truly alive.\"",
            //37
            "\"Find your purpose daily and live life to the fullest and never give up.\"",
            //38
            "\"True happiness… is not attained through self-gratification, but through fidelity to a worthy purpose.\"",
            //39
            "\"If a man knows not to which port he sails, no wind is favourable.\"",
            //40
            "\"Find out who you are. And do it on purpose.\"",
            //41
            "\"In the long term, artificial intelligence and automation are going to be taking over so much of what gives humans a feeling of purpose.\"",
            //42
            "\"The purpose of life is to contribute in some way to making things better.\"",
            //43
            "\"The soul which has no fixed purpose in life is lost; to be everywhere, is to be nowhere.\"",
            //44
            "\"The purpose of technology is not to confuse the brain but to serve the body.\"",
            //45
            "\"Having a specific meaning and purpose in life helps to encourage you towards living a fulfilling and inspired life.\"",
            //46
            "\"When you walk in purpose, you collide with destiny.\"",
            //47
            "\"I would argue that nothing gives life more purpose than the realization that every moment of consciousness is a precious and fragile gift.\"",
            //48
            "\"The most important days in life are the day you are born and the day you find out why.\"",
            //49
            "\"The mystery of human existence lies not in just staying alive, but in finding something to live for.\"",
            //50
            "\"It doesn’t interest me what you do for a living. I want to know what you ache for, and if you dream of meeting your heart’s longing.\"",
            //51
            "\"The purpose of life is a life of purpose.\"",
            //52
            "\"The purpose of art is washing the dust of daily life off our souls.\"",
            //53
            "\"By setting and pursuing goals, you have nothing to lose but a lot to gain. It has been scientifically proven that people who set goals are more fulfilled and positive about life. Having a purpose to wake up to each day will challenge us and give us meaning.\"",
            //54
            "\"You were put on this earth to achieve your greatest self, to live out your purpose, and to do it courageously.\"",
            //55
            "\"The path to our destination is not always a straight one. We go down the wrong road, we get lost, we turn back. Maybe it doesn’t matter which road we embark on. Maybe what matters is that we embark.\"",
            //56
            "\"There is no hope of success for the person who does not have a central purpose, or definite goal at which to aim.\"",
            //57
            "\"Lean forward into your life. Begin each day as if it were on purpose.\"",
            //58
            "\"The person without a purpose is like a ship without a rudder.\"",
            //59
            "\"You must first be who you really are, then do what you need to do, in order to have what you want.\"",
            //60
            "\"When you find your WHY, you don’t hit snooze no more! You find a way to make it happen!\"",
            //61
            "\"Life is never made unbearable by circumstances, but only by lack of meaning and purpose.\"",
            //62
            "\"I believe we’re all put on this planet for a purpose, and we all have a different purpose.\"",
            //63
            "\"If you organize your life around your passion, you can turn your passion into your story and then turn your story into something bigger – something that matters.\"",
            //64
            "\"The ultimate aim of the human mind, in all its efforts, is to become acquainted with truth.\"",
            //65
            "\"The purpose of learning is growth, and our minds, unlike our bodies, can continue growing as we continue to live.\"",
            //66
            "\"Everyone has been made for some particular work and the dire for that work has been put in every heart.\"",
            //67
            "\"Our prime purpose in this life is to help others. And if you can’t help them, at least don’t hurt them.\"",
            //68
            "\"Whatever we are, whatever we make of ourselves, is all we will ever have – and that, in its profound simplicity, is the meaning of life.\"",
            //69
            "\"The man who is born with a talent which he is meant to use, finds his greatest happiness in using it.\"",
            //70
            "\"We’re here for a reason. I believe a bit of the reason is to throw little torches out to lead people through the dark.\"",
            //71
            "\"People take different roads seeking fulfilment and happiness. Just because they’re not on your road doesn’t mean they’ve gotten lost.\"",
            //72
            "\"The meaning of life is not simply to exist, to survive, but to move ahead, to go up, to achieve, to conquer.\"",
            //73
            "\"We’re the creators of our own experience – remembering this, and living our lives from this perspective, empowers us.\"",
            //74
            "\"The purpose of our lives is to be happy.\"",
            //75
            "\"Anything and everything you have experienced has been purposeful; it has brought you to where you are now.\"",
            //76
            "\"The purpose of life is to live it, to taste experience to the utmost, to reach out eagerly and without fear for newer and richer experience.\"",
            //77
            "\"The fates guide the person who accepts them and hinder the person who resists them.\"",
            //78
            "\"We must have a theme, a goal, a purpose in our lives. If you don’t know where you’re aiming, you don’t have a goal.\"",
            //79
            "\"When you are inspired by some great purpose, some extraordinary project, all your thoughts break their bonds.\"",
            //80
            "\"I am of the opinion that my life belongs to the community, and as long as I live, it is my privilege to do for it whatever I can.\"",
            //81
            "\"Nothing contributes so much to tranquilize the mind as a steady purpose – a point on which the soul may fix its intellectual eye.\"",
            //82
            "\"If you organize your life around your passion, you can turn your passion into your story and then turn your story into something bigger – something that matters.\"",
            //83
            "\"Having a purpose is the difference between making a living and making a life.\"",
            //84
            "\"Having a sense of purpose is having a sense of self. A course to plot is a destination to hope for.\"",
            //85
            "\"Knowing your life purpose is the first step toward living a truly conscious life. A life purpose provides us with a clear goal, a set finish line that you truly want to reach.\"",
            //86
            "\"Chase your passion, not your pension.\"",
            //87
            "\"The meaning of life is whatever you ascribe it to be. Being alive is the meaning.\"",
            //88
            "\"Happiness is the meaning and the purpose of life, the whole aim and end of human existence.\"",
            //89
            "\"I feel the capacity to care is the thing which gives life its deepest significance.\"",
            //90
            "\"There is a plan and a purpose, a value to every life, no matter what its location, age, gender or disability.\"",
            //91
            "\"Purpose is the place where your deep gladness meets the world’s needs.\"",
            //92
            "\"Just because you got money doesn't mean you're gonna be happy, and just 'cuz you can buy everything in the world doesn't mean you're gonna find your purpose.\"",
            //93
            "\"There’s a lot of things we go through and we don’t even know why… At the end of the day, God has a purpose and a plan for you, and that’s kind of how I take that.\"",
            //94
            "\"Each of us is born for a purpose, and we want our lives to matter. I don’t think it’s unique to only some of us; it’s a longing of every human being.\"",
            //95
            "\"What am I living for and what am I dying for are the same question.\"",
            //96
            "\"Great minds have purposes, others have wishes.\"",
            //97
            "\"The best way to lengthen out our days is to walk steadily and with a purpose.\"",
            //98
            "\"Never work just for money or for power. They won’t save your soul or help you sleep at night.\"",
            //99
            "\"Perhaps the single most important ingredient in all of life for achieving happiness and fulfilment: purpose.\"",
            //100
            "\"If you can’t figure out your purpose, figure out your passion. For your passion will lead you right into your purpose.\"",
            //101
            "\"Have the courage to follow your heart and intuition. They somehow know what you truly want to become.\"",
            //102
            "\"The true meaning of life is to plant trees, under whose shade you do not expect to sit.\"",
            //103
            "\"More men fail through lack of purpose than lack of talent.\"",
            //104
            "\"Life is meant to be fun, and joyous and fulfilling. May each of yours be that.\"",
            //105
            "\"You can’t connect the dots looking forward, you can only connect them looking backward. So you have to trust that the dots will somehow connect in your future.\"",
            //106
            "\"As you open yourself to living at your edge, your deepest purpose will slowly begin to make itself known.\"",
            //107
            "\"The heart of human excellence often begins to beat when you discover a pursuit that absorbs you, frees you, challenges you, or gives you a sense of meaning, joy or passion.\"",
            //108
            "\"Figure out what your purpose is in life, what you really and truly want to do with your time and your life; then be willing to sacrifice everything and then some to achieve it. If you are not willing to make the sacrifice, then keep searching.\"",
            //109
            "\"You can’t just sit there and wait for people to give you that golden dream, you’ve got to get out there and make it happen for yourself.\"",
            //110
            "\"It’s not enough to have lived. We should be determined to live for something.\"",
            //111
            "\"Do not let your grand ambitions stand in the way of small but meaningful accomplishments.\"",
            //112
            "\"When you dance, your purpose is not to get to a certain place on the floor. It’s to enjoy each step along the way.\"",
            //113
            "\"Musicians must make music, artists must paint, poets must write if they are ultimately to be at peace with themselves. What humans can be, they must be.\"",
            //114
            "\"You weren’t born to just pay bills and die.\"",
            //115
            "\"The purpose of life is not to fight against evil and misfortune; it is to unveil magnificence.\"",
            //116
            "\"Be not afraid of life. Believe that life is worth living, and your belief will help create that fact.\"",
            //117
            "\"Find a purpose to serve, not a lifestyle to live.\"",
            //118
            "\"Our chief usefulness to humanity rests on our combining power with high purpose. Power undirected by high purpose spells calamity, and high purpose by itself is utterly useless if the power to put it into effect is lacking.\"",
            //119
            "\"Our purpose in life is to be happy. From the very core of our being, we simply desire contentment.\"",
            //120
            "\"There is a purpose to our lives that each day tugs at our sleeve as an annoying distraction.\"",
            //121
            "\"You can come to understand your purpose in life by slowing down and feeling your heart’s desires.\"",
            //122
            "\"Service is the rent we pay for being. It is the very purpose of life, and not something you do in your spare time.\"",
            //123
            "\"If you have a purpose in which you can believe, there’s no end to the amount of things you can accomplish.\"",
            //124
            "\"No matter what anyone says or does, my task is to be good. Like gold or emerald or purple repeating to itself, ‘No matter what anyone says or does, my task is to be emerald, my colour undiminished.\"",
            //125
            "\"Everything in this life has a purpose, there are no mistakes, no coincidences.\"",
            //126
            "\"The first thing to do in life is to do with purpose what one purposes to do.\"",
            //127
            "\"But we are strong, each in our purpose, and we are all more strong together.\"",
            //128
            "\"The purpose of life is the expansion of happiness.\"",
            //129
            "\"I don’t think life is absurd. I think we are all here for a huge purpose. I think we shrink from the immensity of the purpose we are here for.\"",
            //130
            "\"A purpose, an intention, a design, strikes everywhere even the careless, the most stupid thinker.\"",
            //131
            "\"A purpose of human life, no matter who is controlling it, is to love whoever is around to be loved.\""
    };
    private static String[] quotesPurposeAuthors = {
            //0
            "Bryant H. McGill",
            //1
            "Michel de Montaigne",
            //2
            "Albert Schweitzer",
            //3
            "Grant Cardone",
            //4
            "Carl Jung",
            //5
            "Leo Rosten",
            //6
            "Roy T. Bennett",
            //7
            "Barbara Myerhoff",
            //8
            "Simon Sinek",
            //9
            "Oscar Wilde",
            //10
            "Jack Canfield",
            //11
            "Joseph Campbell",
            //12
            "Stephen Hawking",
            //13
            "Mahatma Gandhi",
            //14
            "John F. Kennedy",
            //15
            "James Allen",
            //16
            "Les Brown",
            //17
            "Ancient Indian proverb",
            //18
            "James Allen",
            //19
            "Anais Nin",
            //20
            "W. Clement Stone",
            //21
            "Michael J. Fox",
            //22
            "Dolly Parton",
            //23
            "Christine Caine",
            //24
            "Richard Hamming",
            //25
            "Friedrich Nietzsche",
            //26
            "Hermann Hesse",
            //27
            "Steve Jobs",
            //28
            "Gary Hamel",
            //29
            "Tony Robbins",
            //30
            "Plutarch",
            //31
            "Mavis Staples",
            //32
            "Paulo Coelho",
            //33
            "Catherine Pulsifier",
            //34
            "Dalai Lama",
            //35
            "Abraham Lincoln",
            //36
            "Oprah Winfrey",
            //37
            "M. D. Eger",
            //38
            "Helen Keller",
            //39
            "Seneca",
            //40
            "Dolly Parton",
            //41
            "Matt Bellamy",
            //42
            "Robert F. Kennedy",
            //43
            "Michel de Montaigne",
            //44
            "William S. Burroughs",
            //45
            "Vic Johnson",
            //46
            "Ralph Buchanan",
            //47
            "Steven Pinker",
            //48
            "Mark Twain",
            //49
            "Fyodor Dostoyevsky",
            //50
            "Oriah",
            //51
            "Robert Byrne",
            //52
            "Pablo Picasso",
            //53
            "Zoe McKey",
            //54
            "Steve Maraboli",
            //55
            "Barbara Hall",
            //56
            "Napoleon Hill",
            //57
            "Mary Anne Radmacher",
            //58
            "Thomas Carlyle",
            //59
            "Margaret Young",
            //60
            "Eric Thomas",
            //61
            "Viktor Frankl",
            //62
            "Ellen DeGeneres",
            //63
            "Blake Mycoskie",
            //64
            "Eliza Farnham",
            //65
            "Mortimer Adler",
            //66
            "Jalaluddin Rumi",
            //67
            "Dalai Lama",
            //68
            "Philip Appleman",
            //69
            "Johann Wolfgang von Goethe",
            //70
            "Whoopi Goldberg",
            //71
            "Dalai Lama",
            //72
            "Arnold Schwarzenegger",
            //73
            "Mike Robbins",
            //74
            "Dalai Lama",
            //75
            "Iyanla Vanzant",
            //76
            "Eleanor Roosevelt",
            //77
            "Cleanthes",
            //78
            "Mary Kay Ash",
            //79
            "Patanjali",
            //80
            "George Bernard Shaw",
            //81
            "Mary Shelley",
            //82
            "Blake Mycoskie",
            //83
            "Tom Thiss",
            //84
            "Bryant H. McGill",
            //85
            "Simon Foster",
            //86
            "Denis Waitley",
            //87
            "Joseph Campbell",
            //88
            "Aristotle",
            //89
            "Pablo Casals",
            //90
            "Sharron Angle",
            //91
            "Frederick Buechner",
            //92
            "Logic",
            //93
            "Morgan Wallen",
            //94
            "Garrett Gravesen",
            //95
            "Margaret Atwood",
            //96
            "Washington Irving",
            //97
            "Charles Dickens",
            //98
            "Marian Wright Edelman",
            //99
            "Harvey Volson",
            //100
            "Bishop T. D. Jakes",
            //101
            "Steve Jobs",
            //102
            "Nelson Henderson",
            //103
            "Billy Sunday",
            //104
            "Jim Henson",
            //105
            "Steve Jobs",
            //106
            "David Deida",
            //107
            "Terry Orlick",
            //108
            "Quintina Ragnacci",
            //109
            "Diana Ross",
            //110
            "Winston Churchill",
            //111
            "Bryant H. McGill",
            //112
            "Wayne Dyer",
            //113
            "Abraham Maslow",
            //114
            "Unknown",
            //115
            "Alan Cohen",
            //116
            "William James",
            //117
            "Criss Jami",
            //118
            "Theodore Roosevelt",
            //119
            "Dalai Lama",
            //120
            "Robert Brault",
            //121
            "Marcia Wieder",
            //122
            "Marian Wright Edelman",
            //123
            "Marian Anderson",
            //124
            "Marcus Aurelius",
            //125
            "Elisabeth Kübler-Ross",
            //126
            "Pablo Casals",
            //127
            "Bram Stoker",
            //128
            "Deepak Chopra",
            //129
            "Norman Mailer",
            //130
            "David Hume",
            //131
            "Kurt Vonnegut"
    };
    private static String[][] purposeTags = {
            //0
            {"purpose", "bryant", "h", "mcgill", "it", "is", "better", "to", "have", "a", "meaningful", "life", "and", "make", "difference", "than", "merely", "long"},
            //1
            {"purpose", "michel", "de", "montaigne", "the", "soul", "which", "has", "no", "fixed", "in", "life", "is", "lost", "to", "be", "everywhere", "nowhere"},
            //2
            {"purpose", "albert", "schweitzer", "the", "of", "human", "life", "is", "to", "serve", "and", "show", "compassion", "will", "help", "others"},
            //3
            {"purpose", "grant", "cardone", "the", "days", "weeks", "and", "months", "that", "you’re", "most", "lit", "up", "is", "when", "full", "on"},
            //4
            {"purpose", "c", "carl", "g", "gustav", "jung", "shrinking", "away", "from", "death", "is", "something", "unhealthy", "and", "abnormal", "which", "robs", "the", "second", "half", "of", "life", "its"},
            //5
            {"purpose", "leo", "rosten", "i", "cannot", "believe", "that", "the", "of", "life", "is", "to", "be", "happy", "think", "useful", "responsible", "compassionate", "it", "above", "all", "matter", "count", "stand", "for", "something", "have", "made", "some", "difference", "you", "lived", "at"},
            //6
            {"purpose", "roy", "t", "bennett", "if", "you", "have", "a", "strong", "in", "life", "don’t", "to", "be", "pushed", "your", "passion", "will", "drive", "there"},
            //7
            {"purpose", "barbara", "myerhoff", "the", "self", "is", "made", "not", "given"},
            //8
            {"purpose", "simon", "sinek", "people", "don’t", "buy", "what", "you", "do", "they", "why", "it"},
            //9
            {"purpose", "oscar", "wilde", "to", "live", "is", "the", "rarest", "thing", "in", "world", "most", "people", "just", "exist"},
            //10
            {"purpose", "jack", "canfield", "if", "you", "can", "tune", "into", "your", "and", "really", "align", "with", "it", "setting", "goals", "so", "that", "vision", "is", "an", "expression", "of", "then", "life", "flows", "much", "more", "easily"},
            //11
            {"purpose", "joseph", "campbell", "life", "has", "no", "meaning", "each", "of", "us", "and", "we", "bring", "it", "to", "is", "a", "waste", "be", "asking", "the", "question", "when", "you", "are", "answer"},
            //12
            {"purpose", "stephen", "hawking", "work", "gives", "you", "meaning", "and", "life", "is", "empty", "without", "it"},
            //13
            {"purpose", "mahatma", "gandhi", "every", "moment", "of", "your", "life", "is", "infinitely", "creative", "and", "the", "universe", "endlessly", "bountiful", "just", "put", "forth", "a", "clear", "enough", "request", "everything", "heart", "desires", "must", "come", "to", "you"},
            //14
            {"purpose", "john", "f", "kennedy", "efforts", "and", "courage", "are", "not", "enough", "without", "direction"},
            //15
            {"purpose", "james", "allen", "above", "all", "be", "of", "single", "aim", "have", "a", "legitimate", "and", "useful", "devote", "yourself", "unreservedly", "to", "it"},
            //16
            {"purpose", "les", "brown", "too", "many", "of", "us", "are", "not", "living", "our", "dreams", "because", "we", "fears"},
            //17
            {"purpose", "ancient", "indian", "proverb", "certain", "things", "catch", "your", "eye", "but", "pursue", "only", "those", "that", "capture", "the", "heart"},
            //18
            {"purpose", "james", "allen", "to", "begin", "think", "with", "is", "enter", "the", "ranks", "of", "those", "strong", "ones", "who", "only", "recognize", "failure", "as", "one", "pathways", "attainment"},
            //19
            {"purpose", "anais", "nin", "there", "is", "not", "one", "big", "cosmic", "meaning", "for", "all", "only", "the", "we", "each", "give", "to", "our", "life", "an", "individual", "plot", "like", "novel", "a", "book", "person"},
            //20
            {"purpose", "w", "clement", "stone", "definiteness", "of", "is", "the", "starting", "point", "all", "achievement"},
            //21
            {"purpose", "michael", "j", "fox", "i", "believe", "is", "something", "for", "which", "one", "responsible", "it’s", "not", "just", "divinely", "assigned"},
            //22
            {"purpose", "dolly", "parton", "storms", "make", "trees", "take", "deeper", "roots"},
            //23
            {"purpose", "christine", "caine", "sometimes", "when", "you’re", "in", "a", "dark", "place", "you", "think", "you’ve", "been", "buried", "but", "actually", "planted"},
            //24
            {"purpose", "richard", "hamming", "the", "of", "computing", "is", "insight", "not", "numbers"},
            //25
            {"purpose", "friedrich", "nietzsche", "he", "who", "has", "a", "why", "to", "live", "can", "bear", "almost", "any", "how"},
            //26
            {"purpose", "hermann", "hesse", "it", "is", "not", "out", "to", "become", "each", "other", "recognize", "learn", "see", "the", "and", "honor", "him", "for", "what", "he"},
            //27
            {"purpose", "steve", "jobs", "you", "have", "to", "trust", "in", "something", "your", "gut", "destiny", "life", "karma", "whatever", "this", "approach", "has", "never", "let", "me", "down", "and", "it", "made", "all", "the", "difference", "my"},
            //28
            {"purpose", "gary", "hamel", "a", "noble", "inspires", "sacrifice", "stimulates", "innovation", "and", "encourages", "perseverance"},
            //29
            {"purpose", "tony", "robbins", "at", "a", "very", "early", "age", "i", "developed", "belief", "that", "we’re", "all", "here", "to", "contribute", "something", "unique", "deep", "within", "each", "of", "us", "lies", "special", "gift"},
            //30
            {"purpose", "plutarch", "the", "mind", "is", "not", "a", "vessel", "to", "be", "filled", "but", "fire", "kindled"},
            //31
            {"purpose", "mavis", "staples", "my", "to", "lift", "your", "spirit", "and", "motivate", "you"},
            //32
            {"purpose", "paulo", "coelho", "remember", "that", "wherever", "your", "heart", "is", "there", "you", "will", "find", "treasure"},
            //33
            {"purpose", "catherine", "pulsifier", "we", "all", "have", "a", "in", "life", "and", "when", "you", "find", "yours", "will", "recognize", "it"},
            //34
            {"purpose", "dalai", "lama", "people", "take", "different", "roads", "seeking", "fulfilment", "and", "happiness", "just", "because", "they’re", "not", "on", "your", "road", "doesn’t", "mean", "they’ve", "gotten", "lost"},
            //35
            {"purpose", "abraham", "lincoln", "nothing", "will", "divert", "me", "from", "my"},
            //36
            {"purpose", "oprah", "winfrey", "there", "is", "no", "greater", "gift", "you", "can", "give", "or", "receive", "than", "to", "honor", "your", "calling", "it’s", "why", "were", "born", "and", "how", "become", "most", "truly", "alive"},
            //37
            {"purpose", "m", "d", "eger", "find", "your", "daily", "and", "live", "life", "to", "the", "fullest", "never", "give", "up"},
            //38
            {"purpose", "helen", "keller", "true", "happiness", "is", "not", "attained", "through", "selfgratification", "but", "fidelity", "to", "a", "worthy"},
            //39
            {"purpose", "seneca", "if", "a", "man", "knows", "not", "to", "which", "port", "he", "sails", "no", "wind", "is", "favourable"},
            //40
            {"purpose", "dolly", "parton", "find", "out", "who", "you", "are", "and", "do", "it", "on"},
            //41
            {"purpose", "matt", "bellamy", "in", "the", "long", "term", "artificial", "intelligence", "and", "automation", "are", "going", "to", "be", "taking", "over", "so", "much", "of", "what", "gives", "humans", "a", "feeling"},
            //42
            {"purpose", "robert", "f", "kennedy", "the", "of", "life", "is", "to", "contribute", "in", "some", "way", "making", "things", "better"},
            //43
            {"purpose", "michel", "de", "montaigne", "the", "soul", "which", "has", "no", "fixed", "in", "life", "is", "lost", "to", "be", "everywhere", "nowhere"},
            //44
            {"purpose", "william", "s", "burroughs", "the", "of", "technology", "is", "not", "to", "confuse", "brain", "but", "serve", "body"},
            //45
            {"purpose", "vic", "johnson", "having", "a", "specific", "meaning", "and", "in", "life", "helps", "to", "encourage", "you", "towards", "living", "fulfilling", "inspired"},
            //46
            {"purpose", "ralph", "buchanan", "when", "you", "walk", "in", "collide", "with", "destiny"},
            //47
            {"purpose", "steven", "pinker", "i", "would", "argue", "that", "nothing", "gives", "life", "more", "than", "the", "realization", "every", "moment", "of", "consciousness", "is", "a", "precious", "and", "fragile", "gift"},
            //48
            {"purpose", "mark", "twain", "the", "most", "important", "days", "in", "life", "are", "day", "you", "born", "and", "find", "out", "why"},
            //49
            {"purpose", "fyodor", "dostoyevsky", "the", "mystery", "of", "human", "existence", "lies", "not", "in", "just", "staying", "alive", "but", "finding", "something", "to", "live", "for"},
            //50
            {"purpose", "oriah", "it", "doesn’t", "interest", "me", "what", "you", "do", "for", "a", "living", "i", "want", "to", "know", "ache", "and", "if", "dream", "of", "meeting", "your", "heart’s", "longing"},
            //51
            {"purpose", "robert", "byrne", "the", "of", "life", "is", "a"},
            //52
            {"purpose", "pablo", "picasso", "the", "of", "art", "is", "washing", "dust", "daily", "life", "off", "our", "souls"},
            //53
            {"purpose", "zoe", "mckey", "by", "setting", "and", "pursuing", "goals", "you", "have", "nothing", "to", "lose", "but", "a", "lot", "gain", "it", "has", "been", "scientifically", "proven", "that", "people", "who", "set", "are", "more", "fulfilled", "positive", "about", "life", "having", "wake", "up", "each", "day", "will", "challenge", "us", "give", "meaning"},
            //54
            {"purpose", "steve", "maraboli", "you", "were", "put", "on", "this", "earth", "to", "achieve", "your", "greatest", "self", "live", "out", "and", "do", "it", "courageously"},
            //55
            {"purpose", "barbara", "hall", "the", "path", "to", "our", "destination", "is", "not", "always", "a", "straight", "one", "we", "go", "down", "wrong", "road", "get", "lost", "turn", "back", "maybe", "it", "doesn’t", "matter", "which", "embark", "on", "what", "matters", "that"},
            //56
            {"purpose", "napoleon", "hill", "there", "is", "no", "hope", "of", "success", "for", "the", "person", "who", "does", "not", "have", "a", "central", "or", "definite", "goal", "at", "which", "to", "aim"},
            //57
            {"purpose", "mary", "a", "anne", "radmacher", "lean", "forward", "into", "your", "life", "begin", "each", "day", "as", "if", "it", "were", "on"},
            //58
            {"purpose", "thomas", "carlyle", "the", "person", "without", "a", "is", "like", "ship", "rudder"},
            //59
            {"purpose", "maragaret", "young", "you", "must", "first", "be", "who", "really", "are", "then", "do", "what", "need", "to", "in", "order", "have", "want"},
            //60
            {"purpose", "eric", "thomas", "when", "you", "find", "your", "why", "don’t", "hit", "snooze", "no", "more", "a", "way", "to", "make", "it", "happen"},
            //61
            {"purpose", "viktor", "e", "emil", "frankl", "life", "is", "never", "made", "unbearable", "by", "circumstances", "but", "only", "lack", "of", "meaning", "and"},
            //62
            {"purpose", "ellen", "degeneres", "i", "believe", "we’re", "all", "put", "on", "this", "planet", "for", "a", "and", "we", "have", "different"},
            //63
            {"purpose", "blake", "mycoskie", "if", "you", "organize", "your", "life", "around", "passion", "can", "turn", "into", "story", "and", "then", "something", "bigger", "that", "matters"},
            //64
            {"purpose", "eliza", "farnham", "the", "ultimate", "aim", "of", "human", "mind", "in", "all", "its", "efforts", "is", "to", "become", "acquainted", "with", "truth"},
            //65
            {"purpose", "mortimer", "adler", "the", "of", "learning", "is", "growth", "and", "our", "minds", "unlike", "bodies", "can", "continue", "growing", "as", "we", "to", "live"},
            //66
            {"purpose", "jalaluddin", "rumi", "everyone", "has", "been", "made", "for", "some", "particular", "work", "and", "the", "dire", "that", "put", "in", "every", "heart"},
            //67
            {"purpose", "dalai", "lama", "our", "prime", "in", "this", "life", "is", "to", "help", "others", "and", "if", "you", "can’t", "them", "at", "least", "don’t", "hurt"},
            //68
            {"purpose", "philip", "appleman", "whatever", "we", "are", "make", "of", "ourselves", "is", "all", "will", "ever", "have", "and", "that", "in", "its", "profound", "simplicity", "the", "meaning", "life"},
            //69
            {"purpose", "johann", "wolfgang", "von", "goethe", "the", "man", "who", "is", "born", "with", "a", "talent", "which", "he", "meant", "to", "use", "finds", "his", "greatest", "happiness", "in", "using", "it"},
            //70
            {"purpose", "whoopi", "goldberg", "we’re", "here", "for", "a", "reason", "i", "believe", "bit", "of", "the", "is", "to", "throw", "little", "torches", "out", "lead", "people", "through", "dark"},
            //71
            {"purpose", "dalai", "lama", "people", "take", "different", "roads", "seeking", "fulfilment", "and", "happiness", "just", "because", "they’re", "not", "on", "your", "road", "doesn’t", "mean", "they’ve", "gotten", "lost"},
            //72
            {"purpose", "arnold", "schwarzenegger", "the", "meaning", "of", "life", "is", "not", "simply", "to", "exist", "survive", "but", "move", "ahead", "go", "up", "achieve", "conquer"},
            //73
            {"purpose", "mike", "robbins", "we’re", "the", "creators", "of", "our", "own", "experience", "remembering", "this", "and", "living", "lives", "from", "perspective", "empowers", "us"},
            //74
            {"purpose", "dalai", "lama", "the", "of", "our", "lives", "is", "to", "be", "happy"},
            //75
            {"purpose", "iyanla", "vanzant", "anything", "and", "everything", "you", "have", "experienced", "has", "been", "purposeful", "it", "brought", "to", "where", "are", "now"},
            //76
            {"purpose", "eleanor", "roosevelt", "the", "of", "life", "is", "to", "live", "it", "taste", "experience", "utmost", "reach", "out", "eagerly", "and", "without", "fear", "for", "newer", "richer"},
            //77
            {"purpose", "cleanthes", "the", "fates", "guide", "person", "who", "accepts", "them", "and", "hinder", "resists"},
            //78
            {"purpose", "mary", "kay", "ash", "we", "must", "have", "a", "theme", "goal", "in", "our", "lives", "if", "you", "don’t", "know", "where", "you’re", "aiming"},
            //79
            {"purpose", "patanjali", "when", "you", "are", "inspired", "by", "some", "great", "extraordinary", "project", "all", "your", "thoughts", "break", "their", "bonds"},
            //80
            {"purpose", "george", "b", "bernard", "shaw", "i", "am", "of", "the", "opinion", "that", "my", "life", "belongs", "to", "community", "and", "as", "long", "live", "it", "is", "privilege", "do", "for", "whatever", "can"},
            //81
            {"purpose", "mary", "shelley", "nothing", "contributes", "so", "much", "to", "tranquilize", "the", "mind", "as", "a", "steady", "point", "on", "which", "soul", "may", "fix", "its", "intellectual", "eye"},
            //82
            {"purpose", "blake", "mycoskie", "if", "you", "organize", "your", "life", "around", "passion", "can", "turn", "into", "story", "and", "then", "something", "bigger", "that", "matters"},
            //83
            {"purpose", "tom", "thiss", "having", "a", "is", "the", "difference", "between", "making", "living", "and", "life"},
            //84
            {"purpose", "bryant", "h", "mcgill", "having", "a", "sense", "of", "is", "self", "course", "to", "plot", "destination", "hope", "for"},
            //85
            {"purpose", "simon", "foster", "knowing", "your", "life", "is", "the", "first", "step", "toward", "living", "a", "truly", "conscious", "provides", "us", "with", "clear", "goal", "set", "finish", "line", "that", "you", "want", "to", "reach"},
            //86
            {"purpose", "denis", "waitley", "chase", "your", "passion", "not", "pension"},
            //87
            {"purpose", "joseph", "campbell", "the", "meaning", "of", "life", "is", "whatever", "you", "ascribe", "it", "to", "be", "being", "alive"},
            //88
            {"purpose", "aristotle", "happiness", "is", "the", "meaning", "and", "of", "life", "whole", "aim", "end", "human", "existence"},
            //89
            {"purpose", "pablo", "casals", "i", "feel", "the", "capacity", "to", "care", "is", "thing", "which", "gives", "life", "its", "deepest", "significance"},
            //90
            {"purpose", "sharron", "angle", "there", "is", "a", "plan", "and", "value", "to", "every", "life", "no", "matter", "what", "its", "location", "age", "gender", "or", "disability"},
            //91
            {"purpose", "frederick", "buechner", "is", "the", "place", "where", "your", "deep", "gladness", "meets", "world’s", "needs"},
            //92
            {"purpose", "logic", "just", "because", "you", "got", "money", "doesn't", "mean", "you're", "gonna", "be", "happy", "and", "'cuz", "can", "buy", "everything", "in", "the", "world", "find", "your"},
            //93
            {"purpose", "morgan", "wallen", "there’s", "a", "lot", "of", "things", "we", "go", "through", "and", "don’t", "even", "know", "why", "at", "the", "end", "day", "god", "has", "plan", "for", "you", "that’s", "kind", "how", "i", "take", "that"},
            //94
            {"purpose", "garrett", "gravesen", "each", "of", "us", "is", "born", "for", "a", "and", "we", "want", "our", "lives", "to", "matter", "i", "don’t", "think", "it’s", "unique", "only", "some", "longing", "every", "human", "being"},
            //95
            {"purpose", "maragret", "atwood", "what", "am", "i", "living", "for", "and", "dying", "are", "the", "same", "question"},
            //96
            {"purpose", "washington", "irving", "great", "minds", "have", "purposes", "others", "wishes"},
            //97
            {"purpose", "charles", "dickens", "the", "best", "way", "to", "lengthen", "out", "our", "days", "is", "walk", "steadily", "and", "with", "a"},
            //98
            {"purpose", "marian", "wright", "edelman", "never", "work", "just", "for", "money", "or", "power", "they", "won’t", "save", "your", "soul", "help", "you", "sleep", "at", "night"},
            //99
            {"purpose", "harvey", "volson", "perhaps", "the", "single", "most", "important", "ingredient", "in", "all", "of", "life", "for", "achieving", "happiness", "and", "fulfilment"},
            //100
            {"purpose", "bishop", "t", "d", "jakes", "if", "you", "can’t", "figure", "out", "your", "passion", "for", "will", "lead", "right", "into"},
            //101
            {"purpose", "steve", "jobs", "have", "the", "courage", "to", "follow", "your", "heart", "and", "intuition", "they", "somehow", "know", "what", "you", "truly", "want", "become"},
            //102
            {"purpose", "nelson", "mandela", "the", "true", "meaning", "of", "life", "is", "to", "plant", "trees", "under", "whose", "shade", "you", "do", "not", "expect", "sit"},
            //103
            {"purpose", "billy", "sunday", "more", "men", "fail", "through", "lack", "of", "than", "talent"},
            //104
            {"purpose", "jim", "henson", "life", "is", "meant", "to", "be", "fun", "and", "joyous", "fulfilling", "may", "each", "of", "yours", "that"},
            //105
            {"purpose", "steve", "jobs", "you", "can’t", "connect", "the", "dots", "looking", "forward", "can", "only", "them", "backward", "so", "have", "to", "trust", "that", "will", "somehow", "in", "your", "future"},
            //106
            {"purpose", "david", "deida", "as", "you", "open", "yourself", "to", "living", "at", "your", "edge", "deepest", "will", "slowly", "begin", "make", "itself", "known"},
            //107
            {"purpose", "terry", "orlick", "the", "heart", "of", "human", "excellence", "often", "begins", "to", "beat", "when", "you", "discover", "a", "pursuit", "that", "absorbs", "frees", "challenges", "or", "gives", "sense", "meaning", "joy", "passion"},
            //108
            {"purpose", "quintina", "ragnacci", "figure", "out", "what", "your", "is", "in", "life", "you", "really", "and", "truly", "want", "to", "do", "with", "time", "then", "be", "willing", "sacrifice", "everything", "some", "achieve", "it", "if", "are", "not", "make", "the", "keep", "searching"},
            //109
            {"purpose", "diana", "ross", "you", "can’t", "just", "sit", "there", "and", "wait", "for", "people", "to", "give", "that", "golden", "dream", "you’ve", "got", "get", "out", "make", "it", "happen", "yourself"},
            //110
            {"purpose", "winston", "churchill", "it’s", "not", "enough", "to", "have", "lived", "we", "should", "be", "determined", "live", "for", "something"},
            //111
            {"purpose", "bryant", "h", "mcgill", "do", "not", "let", "your", "grand", "ambitions", "stand", "in", "the", "way", "of", "small", "but", "meaningful", "accomplishments"},
            //112
            {"purpose", "wayne", "dyer", "when", "you", "dance", "your", "is", "not", "to", "get", "a", "certain", "place", "on", "the", "floor", "it’s", "enjoy", "each", "step", "along", "way"},
            //113
            {"purpose", "abraham", "maslow", "musicians", "must", "make", "music", "artists", "paint", "poets", "write", "if", "they", "are", "ultimately", "to", "be", "at", "peace", "with", "themselves", "what", "humans", "can"},
            //114
            {"purpose", "you", "weren’t", "born", "to", "just", "pay", "bills", "and", "die"},
            //115
            {"purpose", "alan", "cohen", "the", "of", "life", "is", "not", "to", "fight", "against", "evil", "and", "misfortune", "it", "unveil", "magnificence"},
            //116
            {"purpose", "william", "james", "be", "not", "afraid", "of", "life", "believe", "that", "is", "worth", "living", "and", "your", "belief", "will", "help", "create", "fact"},
            //117
            {"purpose", "criss", "jami", "find", "a", "to", "serve", "not", "lifestyle", "live"},
            //118
            {"purpose", "theodore", "roosevelt", "our", "chief", "usefulness", "to", "humanity", "rests", "on", "combining", "power", "with", "high", "undirected", "by", "spells", "calamity", "and", "itself", "is", "utterly", "useless", "if", "the", "put", "it", "into", "effect", "lacking"},
            //119
            {"purpose", "dalai", "lama", "our", "in", "life", "is", "to", "be", "happy", "from", "the", "very", "core", "of", "being", "we", "simply", "desire", "contentment"},
            //120
            {"purpose", "robert", "brault", "there", "is", "a", "to", "our", "lives", "that", "each", "day", "tugs", "at", "sleeve", "as", "an", "annoying", "distraction"},
            //121
            {"purpose", "marcia", "wieder", "you", "can", "come", "to", "understand", "your", "in", "life", "by", "slowing", "down", "and", "feeling", "heart’s", "desires"},
            //122
            {"purpose", "marian", "wright", "edelman", "service", "is", "the", "rent", "we", "pay", "for", "being", "it", "very", "of", "life", "and", "not", "something", "you", "do", "in", "your", "spare", "time"},
            //123
            {"purpose", "marian", "anderson", "if", "you", "have", "a", "in", "which", "can", "believe", "there’s", "no", "end", "to", "the", "amount", "of", "things", "accomplish"},
            //124
            {"purpose", "marcus", "aurelius", "no", "matter", "what", "anyone", "says", "or", "does", "my", "task", "is", "to", "be", "good", "like", "gold", "emerald", "purple", "repeating", "itself", "‘no", "colour", "undiminished"},
            //125
            {"purpose", "elisabeth", "küblerross", "kublerross", "everything", "in", "this", "life", "has", "a", "there", "are", "no", "mistakes", "coincidences"},
            //126
            {"purpose", "pablo", "casals", "the", "first", "thing", "to", "do", "in", "life", "is", "with", "what", "one", "purposes"},
            //127
            {"purpose", "bram", "stoker", "but", "we", "are", "strong", "each", "in", "our", "and", "all", "more", "together"},
            //128
            {"purpose", "deepak", "chopra", "the", "of", "life", "is", "expansion", "happiness"},
            //129
            {"purpose", "norman", "mailer", "i", "don’t", "think", "life", "is", "absurd", "we", "are", "all", "here", "for", "a", "huge", "shrink", "from", "the", "immensity", "of"},
            //130
            {"purpose", "david", "hume", "a", "an", "intention", "design", "strikes", "everywhere", "even", "the", "careless", "most", "stupid", "thinker"},
            //131
            {"purpose", "kurt", "vonnegut", "a", "of", "human", "life", "no", "matter", "who", "is", "controlling", "it", "to", "love", "whoever", "around", "be", "loved"}
    };

    public static String getPurposeQuote(int position) {
        return quotesPurpose[position];
    }

    public static String getPurposeAuthor(int position) {
        return quotesPurposeAuthors[position];
    }

    public static String[] getPurposeList() {
        return quotesPurpose;
    }

    static String[][] getPurposeTags() {
        return purposeTags;
    }

    public static int getPurposeListSize() {
        return quotesPurpose.length;
    }
}
