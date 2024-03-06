package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Inspiration {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesInspiration and quotesInspirationAuthors
        int listSize = getInspirationListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesInspiration[randomIndexToSwap];
            tempAuthor = quotesInspirationAuthors[randomIndexToSwap];
            tempTags = inspirationTags[randomIndexToSwap];
            quotesInspiration[randomIndexToSwap] = quotesInspiration[i];
            quotesInspirationAuthors[randomIndexToSwap] = quotesInspirationAuthors[i];
            inspirationTags[randomIndexToSwap] = inspirationTags[i];
            quotesInspiration[i] = tempQuote;
            quotesInspirationAuthors[i] = tempAuthor;
            inspirationTags[i] = tempTags;
        }
    }

    private static String[] quotesInspiration = {
            //0
            "\"The biggest adventure you can take is to live the life of your dreams.\"",
            //1
            "\"Inspiration comes from within yourself. One has to be positive. When you’re positive, good things happen.\"",
            //2
            "\"Do not go where the path may lead, go instead where there is no path and leave a trail.\"",
            //3
            "\"What would you do if you weren’t afraid?\"",
            //4
            "\"You are never too old to set another goal or to dreams a new dream.\"",
            //5
            "\"If you cannot do great things, do small things in a great way.\"",
            //6
            "\"Sometimes the smallest step in the right direction ends up being the biggest step of our life.\"",
            //7
            "\"If you’re offered a seat on a rocket ship, don’t ask what seat! Just get on.\"",
            //8
            "\"The value of an idea lies in the using of it.\"",
            //9
            "\"We can easily forgive a child who is afraid of the dark; the real tragedy of life is when men are afraid of the light.\"",
            //10
            "\"Life is not measured by the number of breaths we take, but by the moments that take our breath away.\"",
            //11
            "\"Everybody is a genius. But if you judge a fish by its ability to climb a tree, it will live its whole life believing that it is stupid.\"",
            //12
            "\"Ask yourself if what you are doing today is getting you closer to where you want to be tomorrow.\"",
            //13
            "\"If you do what you’ve always done, you’ll get where you’ve always gotten.\"",
            //14
            "\"Be an innovator, not an imitator.\"",
            //15
            "\"Make your life a masterpiece; imagine no limitations on what you can be, have or do.\"",
            //16
            "\"You can’t wait for inspiration, you have to go after it with a club.\"",
            //17
            "\"Anything’s possible if you’ve got enough nerve.\"",
            //18
            "\"Let your past make you better, not bitter.\"",
            //19
            "\"Only those who will risk going too far can possibly find out how far one can go.\"",
            //20
            "\"Never limit yourself because of others’ limited imagination; never limit others because of your own limited imagination.\"",
            //21
            "\"It’s your place in the world; it’s your life. Go on and do all you can with it, and make it the life you want to live.\"",
            //22
            "\"Working hard for something we don’t care about is called stress. Working hard for something we love is called passion.\"",
            //23
            "\"When something is important enough, you do it even if the odds are not in your favor.\"",
            //24
            "\"With the new day comes new strength and new thoughts.\"",
            //25
            "\"Inspiration is some mysterious blessing which happens when the wheels are turning smoothly.\"",
            //26
            "\"We must believe that we are gifted for something, and that this thing, at whatever cost, must be attained.\"",
            //27
            "\"Without deviation from the norm, progress is not possible.\"",
            //28
            "\"We cannot become what we need to be by remaining what we are.\"",
            //29
            "\"You can’t use up creativity. The more you use, the more you have.\"",
            //30
            "\"Life is what we make it, always has been, always will be.\"",
            //31
            "\"Life is about making an impact, not making an income.\"",
            //32
            "\"What is now proved was once only imagined.\"",
            //33
            "\"Life is black and white, it’s up to you to pain the colours.\"",
            //34
            "\"Some people look for a beautiful place. Other make a place beautiful.\"",
            //35
            "\"It’s not what you look at that matters, it’s what you see.\"",
            //36
            "\"If opportunity doesn’t knock, build a door.\"",
            //37
            "\"Always keep your eyes open. Keep watching. Because whatever you see can inspire you.\"",
            //38
            "\"The world needs dreamers and the world needs doers. But above all what the world needs most are dreamers that do.\"",
            //39
            "\"Set your course by the stars, not by the lights of every passing ship.\"",
            //40
            "\"No matter what people tell you, words and ideas can change world.\"",
            //41
            "\"We must be willing to let go of the life we planned so as to have the life that is waiting for us.\"",
            //42
            "\"Just don’t give up trying to do what you really want to do. Where there is love and inspiration, I don’t think you can go wrong.\"",
            //43
            "\"I can’t change the direction of the wind, but I can adjust my sails to always reach my destination.\"",
            //44
            "\"What good is an idea if it remains an idea? Try. Experiment. Fail. Try again. Change the world.\"",
            //45
            "\"I would rather die of passion than of boredom.\"",
            //46
            "\"It isn’t where you came from. It’s where you’re going that counts.\"",
            //47
            "\"Listen to anyone with an original idea, no matter how absurd it may sound at first. If you put fences around people, you get sheep. Give people the room they need.\"",
            //48
            "\"Aim for the moon. If you miss, you may hit a star.\"",
            //49
            "\"Inspiration responds to our attentiveness in various and sometimes unexpected ways.\"",
            //50
            "\"Never bend your head. Always hold it high. Look the world straight in the eye.\"",
            //51
            "\"If you don’t get out of the box you’ve been raised in, you won’t understand how much bigger the world is.\"",
            //52
            "\"Life changes very quickly, in a very positive way, if you let it.\"",
            //53
            "\"When the winds of change blow, some people build walls and others build windmills.\"",
            //54
            "\"If I have a thousand ideas and only one turns out to be good, I am satisfied.\"",
            //55
            "\"If the only tool you have is a hammer, you tend to see every problem as a nail.\"",
            //56
            "\"You can’t solve a problem on the same level that it was created. You have to rise above it to the next level.\"",
            //57
            "\"The life in front of you is far more important than the life behind you.\"",
            //58
            "\"Innovation survives only when people believe in their own ideas.\"",
            //59
            "\"Act as if what you do makes a difference. It does.\"",
            //60
            "\"Two roads diverged in a wood, and I – I took the one less travelled by, and that has made all the difference.\"",
            //61
            "\"There’s a way to do it better – find it.\"",
            //62
            "\"Dream big and dare to fail.\"",
            //63
            "\"You don’t always need a plan. Sometimes you just need to breathe, trust , let go, and see what happens.\"",
            //64
            "\"A walk to a nearby park may give you more energy and inspiration in life than spending two hours in front of a screen.\"",
            //65
            "\"When I let go of what I am, I become what I might be.\"",
            //66
            "\"Every morning you have two choices: continue to sleep with your dreams, or wake up and chase them.\"",
            //67
            "\"You can’t just ask customers what they want and then try to give that to them. By the time you get it built, they’ll want something new.\"",
            //68
            "\"The best way to predict the future is to create it.\"",
            //69
            "\"Everything you’ve ever wanted is on the other side of fear.\"",
            //70
            "\"What lies behind you and what lies in front of you, pales in comparison to what lies inside you.\"",
            //71
            "\"If you want something new, you have to stop doing something old.\"",
            //72
            "\"Ideas are like rabbits. You get a couple and learn how to handle them, and pretty soon you have a dozen.\"",
            //73
            "\"Innovation is taking two things that exist and putting them together in a new way.\"",
            //74
            "\"The world will change by your example, not by your opinion.\"",
            //75
            "\"In the face of such hopelessness as our eventual, unavoidable death, there is little sense in not at least trying to accomplish all of your wildest dreams in life.\"",
            //76
            "\"Modern society is built upon two things: truth, which is discovered, and innovation, which is created.\"",
            //77
            "\"The bad news is time flies. The good news is you’re the pilot.\"",
            //78
            "\"There are only two ways to influence human behaviour: you can manipulate it or you can inspire it.\"",
            //79
            "\"Life begins at the end of your comfort zone.\"",
            //80
            "\"Inspiration in life is born when we have a purpose.\"",
            //81
            "\"Be the change that you wish to see in the world.\"",
            //82
            "\"My mission in life is not merely to survive, but to thrive.\"",
            //83
            "\"The content of your character is your choice. Day by day, what you choose, what you think and what you do is who you become.\"",
            //84
            "\"Limitations live only in our minds. But if we use our imaginations, our possibilities become limitless.\"",
            //85
            "\"Finding opportunity is a matter of believing it’s there.\"",
            //86
            "\"The Stone Age didn’t end because they ran out of stones.\"",
            //87
            "\"Creativity is intelligence having fun.\"",
            //88
            "\"If the wind will not serve, take the oars.\"",
            //89
            "\"Whatever the mind of man can conceive and believe, it can achieve.\"",
            //90
            "\"Daring ideas are like chessmen moved forward; they may be beaten, but they may start a winning game.\"",
            //91
            "\"Nurture your mind with great thoughts, for you will never go any higher than you think.\"",
            //92
            "\"A ship is safe in the harbour, but that’s not what ships are for.\"",
            //93
            "\"Don’t be pushed around by the fears in your mind. Be led by the dreams in your heart.\"",
            //94
            "\"The flower that blooms in adversity is the rarest and most beautiful of all.\"",
            //95
            "\"You must do the things you think you cannot do.\"",
            //96
            "\"The uncreative mind can spot wrong answers, but it takes a very creative mind to spot wrong questions.\"",
            //97
            "\"The secret of change is to focus all of your energy, not on fighting the old, but building on the new.\"",
            //98
            "\"Whenever you find yourself on the side of the majority, it is time to pause and reflect.\"",
            //99
            "\"Too many of us are not living our dreams because we are living our fears.\"",
            //100
            "\"You can’t fall if you don’t climb. But there’s no joy in living your whole life on the ground.\"",
            //101
            "\"We know what we are, but know not what we may be.\"",
            //102
            "\"Life is a gift, and it offers us the privilege, opportunity, and responsibility to give something back by becoming more.\"",
            //103
            "\"There is no innovation and creativity without failure. Period.\"",
            //104
            "\"Creativity is thinking up new things. Innovation is doing new things.\"",
            //105
            "\"The 3 C’s in life: Choice, Chance, Change. You must make the choice, to make the change, if you want anything in life to change.\"",
            //106
            "\"No matter what people tell you, words and ideas can change the world.\"",
            //107
            "\"The journey of a thousand miles begins with one step.\"",
            //108
            "\"Innovation is the unrelenting drive to break the status quo and develop a new where few have dared to go.\"",
            //109
            "\"Be yourself; everyone else is already taken.\"",
            //110
            "\"You can never cross the ocean until you have the courage to lose sight of the shore.\"",
            //111
            "\"Go confidently in the direction of your dreams. Live the life you have imagined.\"",
            //112
            "\"The world is full of magical things patiently waiting for our wits to grow sharper.\"",
            //113
            "\"Once we believe in ourselves, we can risk curiosity, wonder, spontaneous delight, or any experience that reveals the human spirit.\"",
            //114
            "\"A No.2 pencil and a dream can take you anywhere.\"",
            //115
            "\"I believe that if one always looked at the skies, one would end up with wings.\"",
            //116
            "\"Let your life lightly dance on the edges of time like dew on the tip of a leaf.\"",
            //117
            "\"In a gentle way, you can shake the world.\"",
            //118
            "\"The power of imagination makes us infinite.\"",
            //119
            "\"Follow your bliss and the universe will open doors where there were only walls.\"",
            //120
            "\"Light tomorrow with today.\"",
            //121
            "\"All you need is the plan, the road map, and the courage to press on to your destination.\"",
            //122
            "\"Let us make our future now, and let us make our dreams tomorrow’s reality.\"",
            //123
            "\"It is always the simple that produces the marvellous.\"",
            //124
            "\"Each day provides its own gifts.\""
    };
    private static String[] quotesInspirationAuthors = {
            //0
            "Oprah Winfrey",
            //1
            "Deep Roy",
            //2
            "Ralph Waldo Emerson",
            //3
            "Sheryl Sandberg",
            //4
            "C. S. Lewis",
            //5
            "Napoleon Hill",
            //6
            "Emma Stone",
            //7
            "Sheryl Sandberg",
            //8
            "Thomas A. Edison",
            //9
            "Plato",
            //10
            "Maya Angelou",
            //11
            "Albert Einstein",
            //12
            "Unknown",
            //13
            "Tony Robbins",
            //14
            "Audrey Carballo",
            //15
            "Brian Tracey",
            //16
            "Jack London",
            //17
            "J. K. Rowling",
            //18
            "Unknown",
            //19
            "T. S. Eliot",
            //20
            "Mae Jemison",
            //21
            "Mae Jemison",
            //22
            "Simon Sinek",
            //23
            "Elon Musk",
            //24
            "Eleanor Roosevelt",
            //25
            "Quentin Blake",
            //26
            "Marie Curie",
            //27
            "Frank Zappa",
            //28
            "Max de Pree",
            //29
            "Maya Angelou",
            //30
            "Grandma Moses",
            //31
            "Kevin Kruse",
            //32
            "William Blake",
            //33
            "Unknown",
            //34
            "Hazrat Inayat Khan",
            //35
            "Henry David Thoreau",
            //36
            "Milton Berle",
            //37
            "Grace Coddington",
            //38
            "Sarah Ban Breathnach",
            //39
            "Omar R. Bradley",
            //40
            "Robin Williams",
            //41
            "Joseph Campbell",
            //42
            "Ella Fitzgerald",
            //43
            "Jimmy Dean",
            //44
            "Simon Sinek",
            //45
            "Vincent van Gogh",
            //46
            "Ella Fitzgerald",
            //47
            "William McKnight",
            //48
            "W. Clement Stone",
            //49
            "Wayne W. Dyer",
            //50
            "Helen Keller",
            //51
            "Angelina Jolie",
            //52
            "Lindsey Vonn",
            //53
            "Chinese proverb",
            //54
            "Alfred Nobel",
            //55
            "Abraham Maslow",
            //56
            "Albert Einstein",
            //57
            "Joel Osteen",
            //58
            "Levo League",
            //59
            "William James",
            //60
            "Robert Frost",
            //61
            "Thomas A. Edison",
            //62
            "Norman Vaughan",
            //63
            "Mandy Hale",
            //64
            "Tsang Lindsay",
            //65
            "Lao Tzu",
            //66
            "Unknown",
            //67
            "Steve Jobs",
            //68
            "Abraham Lincoln",
            //69
            "George Addair",
            //70
            "Ralph Waldo Emerson",
            //71
            "Peter F. Drucker",
            //72
            "John Steinbeck",
            //73
            "Tom Freston",
            //74
            "Paulo Coelho",
            //75
            "Kevin Smith",
            //76
            "True Tamplin",
            //77
            "Michael Altshuler",
            //78
            "Simon Sinek",
            //79
            "Neale Donald Walsch",
            //80
            "Daniel Longwe",
            //81
            "Mahatma Gandhi",
            //82
            "Maya Angelou",
            //83
            "Heraclitus",
            //84
            "Jamie Paolinetti",
            //85
            "Barbara Corcoran",
            //86
            "Unknown",
            //87
            "Albert Einstein",
            //88
            "Latin proverb",
            //89
            "Napoleon Hill",
            //90
            "Johann Wolfgang von Goethe",
            //91
            "Benjamin Disraeli",
            //92
            "William Shedd",
            //93
            "Roy T. Bennett",
            //94
            "Walt Disney",
            //95
            "Eleanor Roosevelt",
            //96
            "Antony Jay",
            //97
            "Socrates",
            //98
            "Mark Twain",
            //99
            "Les Brown",
            //100
            "Unknown",
            //101
            "William Shakespeare",
            //102
            "Tony Robbins",
            //103
            "Brené Brown ",
            //104
            "Theodore Levitt",
            //105
            "Unknown",
            //106
            "Robin Williams",
            //107
            "Lao Tzu",
            //108
            "Steven Jeffes",
            //109
            "Oscar Wilde",
            //110
            "Cristopher Columbus",
            //111
            "Henry David Thoreau",
            //112
            "Bertrand Russell",
            //113
            "E. E. Cummings",
            //114
            "Joyce Meyer",
            //115
            "Gustave Flaubert",
            //116
            "Rabindranath Tagore",
            //117
            "Mahatma Gandhi",
            //118
            "John Muir",
            //119
            "Joseph Campbell",
            //120
            "Elizabeth B. Browning",
            //121
            "Earl Nightingale",
            //122
            "Malala Yousafzai",
            //123
            "Amelia Barr",
            //124
            "Marcus Aurelius"
    };
    private static String[][] inspirationTags = {
            //0
            {"inspiration", "oprah", "winfrey", "the", "biggest", "adventure", "you", "can", "take", "is", "to", "live", "life", "of", "your", "dreams"},
            //1
            {"inspiration", "deep", "roy", "comes", "from", "within", "yourself", "one", "has", "to", "be", "positive", "when", "you’re", "good", "things", "happen"},
            //2
            {"inspiration", "ralph", "w", "waldo", "emerson", "do", "not", "go", "where", "the", "path", "may", "lead", "instead", "there", "is", "no", "and", "leave", "a", "trail"},
            //3
            {"inspiration", "sheryl", "sandberg", "what", "would", "you", "do", "if", "weren’t", "afraid"},
            //4
            {"inspiration", "c", "s", "lewis", "you", "are", "never", "too", "old", "to", "set", "another", "goal", "or", "dreams", "a", "new", "dream"},
            //5
            {"inspiration", "napoleon", "hill", "if", "you", "cannot", "do", "great", "things", "small", "in", "a", "way"},
            //6
            {"inspiration", "emma", "stone", "sometimes", "the", "smallest", "step", "in", "right", "direction", "ends", "up", "being", "biggest", "of", "our", "life"},
            //7
            {"inspiration", "sheryl", "sandberg", "if", "you’re", "offered", "a", "seat", "on", "rocket", "ship", "don’t", "ask", "what", "just", "get"},
            //8
            {"inspiration", "thomas", "a", "alpha", "edison", "the", "value", "of", "an", "idea", "lies", "in", "using", "it"},
            //9
            {"inspiration", "plato", "we", "can", "easily", "forgive", "a", "child", "who", "is", "afraid", "of", "the", "dark", "real", "tragedy", "life", "when", "men", "are", "light"},
            //10
            {"inspiration", "maya", "angelou", "life", "is", "not", "measured", "by", "the", "number", "of", "breaths", "we", "take", "but", "moments", "that", "our", "breath", "away"},
            //11
            {"inspiration", "albert", "einstein", "everybody", "is", "a", "genius", "but", "if", "you", "judge", "fish", "by", "its", "ability", "to", "climb", "tree", "it", "will", "live", "whole", "life", "believing", "that", "stupid"},
            //12
            {"inspiration", "ask", "yourself", "if", "what", "you", "are", "doing", "today", "is", "getting", "closer", "to", "where", "want", "be", "tomorrow"},
            //13
            {"inspiration", "tony", "robbins", "if", "you", "do", "what", "you’ve", "always", "done", "you’ll", "get", "where", "gotten"},
            //14
            {"inspiration", "audrey", "carballo", "be", "an", "innovator", "not", "imitator"},
            //15
            {"inspiration", "brian", "tracey", "make", "your", "life", "a", "masterpiece", "imagine", "no", "limitations", "on", "what", "you", "can", "be", "have", "or", "do"},
            //16
            {"inspiration", "jack", "london", "you", "can’t", "wait", "for", "have", "to", "go", "after", "it", "with", "a", "club"},
            //17
            {"inspiration", "j", "joanne","k", "rowling", "anything’s", "possible", "if", "you’ve", "got", "enough", "nerve"},
            //18
            {"inspiration", "let", "your", "past", "make", "you", "better", "not", "bitter"},
            //19
            {"inspiration", "t", "s", "eliot", "only", "those", "who", "will", "risk", "going", "too", "far", "can", "possibly", "find", "out", "how", "one", "go"},
            //20
            {"inspiration", "mae", "jemison", "never", "limit", "yourself", "because", "of", "others’", "limited", "imagination", "others", "your", "own"},
            //21
            {"inspiration", "mae", "jemison", "it’s", "your", "place", "in", "the", "world", "life", "go", "on", "and", "do", "all", "you", "can", "with", "it", "make", "want", "to", "live"},
            //22
            {"inspiration", "simon", "sinek", "working", "hard", "for", "something", "we", "don’t", "care", "about", "is", "called", "stress", "love", "passion"},
            //23
            {"inspiration", "elon", "musk", "when", "something", "is", "important", "enough", "you", "do", "it", "even", "if", "the", "odds", "are", "not", "in", "your", "favor"},
            //24
            {"inspiration", "eleanor", "roosevelt", "with", "the", "new", "day", "comes", "strength", "and", "thoughts"},
            //25
            {"inspiration", "quentin", "blake", "is", "some", "mysterious", "blessing", "which", "happens", "when", "the", "wheels", "are", "turning", "smoothly"},
            //26
            {"inspiration", "marie", "curie", "we", "must", "believe", "that", "are", "gifted", "for", "something", "and", "this", "thing", "at", "whatever", "cost", "be", "attained"},
            //27
            {"inspiration", "frank", "zappa", "without", "deviation", "from", "the", "norm", "progress", "is", "not", "possible"},
            //28
            {"inspiration", "max", "de", "pree", "we", "cannot", "become", "what", "need", "to", "be", "by", "remaining", "are"},
            //29
            {"inspiration", "maya", "angelou", "you", "can’t", "use", "up", "creativity", "the", "more", "have"},
            //30
            {"inspiration", "grandma", "moses", "life", "is", "what", "we", "make", "it", "always", "has", "been", "will", "be"},
            //31
            {"inspiration", "kevin", "kruse", "life", "is", "about", "making", "an", "impact", "not", "income"},
            //32
            {"inspiration", "william", "blake", "what", "is", "now", "proved", "was", "once", "only", "imagined"},
            //33
            {"inspiration", "life", "is", "black", "and", "white", "it’s", "up", "to", "you", "paint", "the", "colours"},
            //34
            {"inspiration", "hazrat", "i","inayat", "khan", "some", "people", "look", "for", "a", "beautiful", "place", "other", "make", "beautiful"},
            //35
            {"inspiration", "henry", "d","david", "thoreau", "it’s", "not", "what", "you", "look", "at", "that", "matters", "see"},
            //36
            {"inspiration", "milton", "berle", "if", "opportunity", "doesn’t", "knock", "build", "a", "door"},
            //37
            {"inspiration", "grace", "coddington", "always", "keep", "your", "eyes", "open", "watching", "because", "whatever", "you", "see", "can", "inspire"},
            //38
            {"inspiration", "sarah", "ban", "breathnach", "the", "world", "needs", "dreamers", "and", "doers", "but", "above", "all", "what", "most", "are", "that", "do"},
            //39
            {"inspiration", "omar", "r", "bradley", "set", "your", "course", "by", "the", "stars", "not", "lights", "of", "every", "passing", "ship"},
            //40
            {"inspiration", "robin", "williams", "no", "matter", "what", "people", "tell", "you", "words", "and", "ideas", "can", "change", "world"},
            //41
            {"inspiration", "joseph", "campbell", "we", "must", "be", "willing", "to", "let", "go", "of", "the", "life", "planned", "so", "as", "have", "that", "is", "waiting", "for", "us"},
            //42
            {"inspiration", "ella", "fitzgerald", "just", "don’t", "give", "up", "trying", "to", "do", "what", "you", "really", "want", "where", "there", "is", "love", "and", "i", "think", "can", "go", "wrong"},
            //43
            {"inspiration", "jimmy", "dean", "i", "can’t", "change", "the", "direction", "of", "wind", "but", "can", "adjust", "my", "sails", "to", "always", "reach", "destination"},
            //44
            {"inspiration", "simon", "sinek", "what", "good", "is", "an", "idea", "if", "it", "remains", "try", "experiment", "fail", "again", "change", "the", "world"},
            //45
            {"inspiration", "vincent", "van", "gogh", "i", "would", "rather", "die", "of", "passion", "than", "boredom"},
            //46
            {"inspiration", "ella", "fitzgerald", "it", "isn’t", "where", "you", "came", "from", "it’s", "you’re", "going", "that", "counts"},
            //47
            {"inspiration", "william", "mcknight", "listen", "to", "anyone", "with", "an", "original", "idea", "no", "matter", "how", "absurd", "it", "may", "sound", "at", "first", "if", "you", "put", "fences", "around", "people", "get", "sheep", "give", "the", "room", "they", "need"},
            //48
            {"inspiration", "w", "william", "c","clement", "stone", "aim", "for", "the", "moon", "if", "you", "miss", "may", "hit", "a", "star"},
            //49
            {"inspiration", "wayne", "w", "dyer", "responds", "to", "our", "attentiveness", "in", "various", "and", "sometimes", "unexpected", "ways"},
            //50
            {"inspiration", "helen", "keller", "never", "bend", "your", "head", "always", "hold", "it", "high", "look", "the", "world", "straight", "in", "eye"},
            //51
            {"inspiration", "angelina", "jolie", "if", "you", "don’t", "get", "out", "of", "the", "box", "you’ve", "been", "raised", "in", "won’t", "understand", "how", "much", "bigger", "world", "is"},
            //52
            {"inspiration", "lindsey", "vonn", "life", "changes", "very", "quickly", "in", "a", "positive", "way", "if", "you", "let", "it"},
            //53
            {"inspiration", "chinese", "proverb", "when", "the", "winds", "of", "change", "blow", "some", "people", "build", "walls", "and", "others", "windmills"},
            //54
            {"inspiration", "alfred", "nobel", "if", "i", "have", "a", "thousand", "ideas", "and", "only", "one", "turns", "out", "to", "be", "good", "am", "satisfied"},
            //55
            {"inspiration", "abraham", "maslow", "if", "the", "only", "tool", "you", "have", "is", "a", "hammer", "tend", "to", "see", "every", "problem", "as", "nail"},
            //56
            {"inspiration", "albert", "einstein", "you", "can’t", "solve", "a", "problem", "on", "the", "same", "level", "that", "it", "was", "created", "have", "to", "rise", "above", "next"},
            //57
            {"inspiration", "joel", "osteen", "the", "life", "in", "front", "of", "you", "is", "far", "more", "important", "than", "behind"},
            //58
            {"inspiration", "levo", "league", "innovation", "survives", "only", "when", "people", "believe", "in", "their", "own", "ideas"},
            //59
            {"inspiration", "william", "james", "act", "as", "if", "what", "you", "do", "makes", "a", "difference", "it", "does"},
            //60
            {"inspiration", "robert", "frost", "two", "roads", "diverged", "in", "a", "wood", "and", "i", "took", "the", "one", "less", "travelled", "by", "that", "has", "made", "all", "difference"},
            //61
            {"inspiration", "thomas", "a", "alpha", "edison", "there’s", "a", "way", "to", "do", "it", "better", "find"},
            //62
            {"inspiration", "norman", "vaughan", "dream", "big", "and", "dare", "to", "fail"},
            //63
            {"inspiration", "mandy", "hale", "you", "don’t", "always", "need", "a", "plan", "sometimes", "just", "to", "breathe", "trust", "let", "go", "and", "see", "what", "happens"},
            //64
            {"inspiration", "tsang", "lindsay", "a", "walk", "to", "nearby", "park", "may", "give", "you", "more", "energy", "and", "in", "life", "than", "spending", "two", "hours", "front", "of", "screen"},
            //65
            {"inspiration", "lao", "tzu", "when", "i", "let", "go", "of", "what", "am", "become", "might", "be"},
            //66
            {"inspiration", "every", "morning", "you", "have", "two", "choices", "continue", "to", "sleep", "with", "your", "dreams", "or", "wake", "up", "and", "chase", "them"},
            //67
            {"inspiration", "steve", "jobs", "you", "can’t", "just", "ask", "customers", "what", "they", "want", "and", "then", "try", "to", "give", "that", "them", "by", "the", "time", "get", "it", "built", "they’ll", "something", "new"},
            //68
            {"inspiration", "abraham", "lincoln", "the", "best", "way", "to", "predict", "future", "is", "create", "it"},
            //69
            {"inspiration", "george", "addair", "everything", "you’ve", "ever", "wanted", "is", "on", "the", "other", "side", "of", "fear"},
            //70
            {"inspiration", "ralph", "w", "waldo", "emerson", "what", "lies", "behind", "you", "and", "in", "front", "of", "pales", "comparison", "to", "inside"},
            //71
            {"inspiration", "peter", "f", "drucker", "if", "you", "want", "something", "new", "have", "to", "stop", "doing", "old"},
            //72
            {"inspiration", "john", "steinbeck", "ideas", "are", "like", "rabbits", "you", "get", "a", "couple", "and", "learn", "how", "to", "handle", "them", "pretty", "soon", "have", "dozen"},
            //73
            {"inspiration", "tom", "freston", "innovation", "is", "taking", "two", "things", "that", "exist", "and", "putting", "them", "together", "in", "a", "new", "way"},
            //74
            {"inspiration", "paulo", "coelho", "the", "world", "will", "change", "by", "your", "example", "not", "opinion"},
            //75
            {"inspiration", "kevin", "smith", "in", "the", "face", "of", "such", "hopelessness", "as", "our", "eventual", "unavoidable", "death", "there", "is", "little", "sense", "not", "at", "least", "trying", "to", "accomplish", "all", "your", "wildest", "dreams", "life"},
            //76
            {"inspiration", "true", "tamplin", "modern", "society", "is", "built", "upon", "two", "things", "truth", "which", "discovered", "and", "innovation", "created"},
            //77
            {"inspiration", "michael", "altshuler", "the", "bad", "news", "is", "time", "flies", "good", "you’re", "pilot"},
            //78
            {"inspiration", "simon", "sinek", "there", "are", "only", "two", "ways", "to", "influence", "human", "behaviour", "you", "can", "manipulate", "it", "or", "inspire"},
            //79
            {"inspiration", "neale", "d", "donald", "walsch", "life", "begins", "at", "the", "end", "of", "your", "comfort", "zone"},
            //80
            {"inspiration", "daniel", "longwe", "in", "life", "is", "born", "when", "we", "have", "a", "purpose"},
            //81
            {"inspiration", "mahatma", "gandhi", "be", "the", "change", "that", "you", "wish", "to", "see", "in", "world"},
            //82
            {"inspiration", "maya", "angelou", "my", "mission", "in", "life", "is", "not", "merely", "to", "survive", "but", "thrive"},
            //83
            {"inspiration", "heraclitus", "the", "content", "of", "your", "character", "is", "choice", "day", "by", "what", "you", "choose", "think", "and", "do", "who", "become"},
            //84
            {"inspiration", "jamie", "paolinetti", "limitations", "live", "only", "in", "our", "minds", "but", "if", "we", "use", "imaginations", "possibilities", "become", "limitless"},
            //85
            {"inspiration", "barbara", "corcoran", "finding", "opportunity", "is", "a", "matter", "of", "believing", "it’s", "there"},
            //86
            {"inspiration", "the", "stone", "age", "didn’t", "end", "because", "they", "ran", "out", "of", "stones"},
            //87
            {"inspiration", "albert", "einstein", "creativity", "is", "intelligence", "having", "fun"},
            //88
            {"inspiration", "latin", "proverb", "if", "the", "wind", "will", "not", "serve", "take", "oars"},
            //89
            {"inspiration", "napoleon", "hill", "whatever", "the", "mind", "of", "man", "can", "conceive", "and", "believe", "it", "achieve"},
            //90
            {"inspiration", "johann", "wolfgang", "von", "goethe", "daring", "ideas", "are", "like", "chessmen", "moved", "forward", "they", "may", "be", "beaten", "but", "start", "a", "winning", "game"},
            //91
            {"inspiration", "benjamin", "disraeli", "nurture", "your", "mind", "with", "great", "thoughts", "for", "you", "will", "never", "go", "any", "higher", "than", "think"},
            //92
            {"inspiration", "william", "shedd", "a", "ship", "is", "safe", "in", "the", "harbour", "but", "that’s", "not", "what", "ships", "are", "for"},
            //93
            {"inspiration", "roy", "t", "bennett", "don’t", "be", "pushed", "around", "by", "the", "fears", "in", "your", "mind", "led", "dreams", "heart"},
            //94
            {"inspiration", "walt", "disney", "the", "flower", "that", "blooms", "in", "adversity", "is", "rarest", "and", "most", "beautiful", "of", "all"},
            //95
            {"inspiration", "eleanor", "roosevelt", "you", "must", "do", "the", "things", "think", "cannot"},
            //96
            {"inspiration", "antony", "jay", "the", "uncreative", "mind", "can", "spot", "wrong", "answers", "but", "it", "takes", "a", "very", "creative", "to", "questions"},
            //97
            {"inspiration", "socrates", "the", "secret", "of", "change", "is", "to", "focus", "all", "your", "energy", "not", "on", "fighting", "old", "but", "building", "new"},
            //98
            {"inspiration", "mark", "twain", "whenever", "you", "find", "yourself", "on", "the", "side", "of", "majority", "it", "is", "time", "to", "pause", "and", "reflect"},
            //99
            {"inspiration", "les", "brown", "too", "many", "of", "us", "are", "not", "living", "our", "dreams", "because", "we", "fears"},
            //100
            {"inspiration", "you", "can’t", "fall", "if", "don’t", "climb", "but", "there’s", "no", "joy", "in", "living", "your", "whole", "life", "on", "the", "ground"},
            //101
            {"inspiration", "william", "shakespeare", "we", "know", "what", "are", "but", "not", "may", "be"},
            //102
            {"inspiration", "tony", "robbins", "life", "is", "a", "gift", "and", "it", "offers", "us", "the", "privilege", "opportunity", "responsibility", "to", "give", "something", "back", "by", "becoming", "more"},
            //103
            {"inspiration", "brené", "brene", "brown", "there", "is", "no", "innovation", "and", "creativity", "without", "failure", "period"},
            //104
            {"inspiration", "theodore", "levitt", "creativity", "is", "thinking", "up", "new", "things", "innovation", "doing"},
            //105
            {"inspiration", "the", "3", "c’s", "in", "life", "choice", "chance", "change", "you", "must", "make", "to", "if", "want", "anything"},
            //106
            {"inspiration", "robin", "williams", "no", "matter", "what", "people", "tell", "you", "words", "and", "ideas", "can", "change", "the", "world"},
            //107
            {"inspiration", "lao", "tzu", "the", "journey", "of", "a", "thousand", "miles", "begins", "with", "one", "step"},
            //108
            {"inspiration", "steven", "jeffres", "innovation", "is", "the", "unrelenting", "drive", "to", "break", "status", "quo", "and", "develop", "a", "new", "where", "few", "have", "dared", "go"},
            //109
            {"inspiration", "oscar", "wilde", "be", "yourself", "everyone", "else", "is", "already", "taken"},
            //110
            {"inspiration", "cristopher", "columbus", "you", "can", "never", "cross", "the", "ocean", "until", "have", "courage", "to", "lose", "sight", "of", "shore"},
            //111
            {"inspiration", "henry", "d", "david", "thoreau", "go", "confidently", "in", "the", "direction", "of", "your", "dreams", "live", "life", "you", "have", "imagined"},
            //112
            {"inspiration", "bertrand", "russell", "the", "world", "is", "full", "of", "magical", "things", "patiently", "waiting", "for", "our", "wits", "to", "grow", "sharper"},
            //113
            {"inspiration", "e", "cummings", "once", "we", "believe", "in", "ourselves", "can", "risk", "curiosity", "wonder", "spontaneous", "delight", "or", "any", "experience", "that", "reveals", "the", "human", "spirit"},
            //114
            {"inspiration", "joyce", "meyer", "a", "no2", "pencil", "and", "dream", "can", "take", "you", "anywhere"},
            //115
            {"inspiration", "gustave", "flaubert", "i", "believe", "that", "if", "one", "always", "looked", "at", "the", "skies", "would", "end", "up", "with", "wings"},
            //116
            {"inspiration", "rabindranath", "tagore", "let", "your", "life", "lightly", "dance", "on", "the", "edges", "of", "time", "like", "dew", "tip", "a", "leaf"},
            //117
            {"inspiration", "mahatma", "gandhi", "in", "a", "gentle", "way", "you", "can", "shake", "the", "world"},
            //118
            {"inspiration", "john", "muir", "the", "power", "of", "imagination", "makes", "us", "infinite"},
            //119
            {"inspiration", "joseph", "campbell", "follow", "your", "bliss", "and", "the", "universe", "will", "open", "doors", "where", "there", "were", "only", "walls"},
            //120
            {"inspiration", "elizabeth", "b", "browing", "light", "tomorrow", "with", "today"},
            //121
            {"inspiration", "earl", "nightingale", "all", "you", "need", "is", "the", "plan", "road", "map", "and", "courage", "to", "press", "on", "your", "destination"},
            //122
            {"inspiration", "malala", "yousafzai", "let", "us", "make", "our", "future", "now", "and", "dreams", "tomorrow’s", "reality"},
            //123
            {"inspiration", "amelia", "barr", "it", "is", "always", "the", "simple", "that", "produces", "marvellous"},
            //124
            {"inspiration", "marcus", "aurelius", "each", "day", "provides", "its", "own", "gifts"}
    };

    public static String getInspirationQuote(int position) {
        return quotesInspiration[position];
    }

    public static String getInspirationAuthor(int position) {
        return quotesInspirationAuthors[position];
    }

    public static String[] getInspirationList() {
        return quotesInspiration;
    }

    static String[][]getInspirationTags() {
        return inspirationTags;
    }

    public static int getInspirationListSize() {
        return quotesInspiration.length;
    }
}
