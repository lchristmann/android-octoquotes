package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Love {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesLove and quotesLoveAuthors
        int listSize = getLoveListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesLove[randomIndexToSwap];
            tempAuthor = quotesLoveAuthors[randomIndexToSwap];
            tempTags = loveTags[randomIndexToSwap];
            quotesLove[randomIndexToSwap] = quotesLove[i];
            quotesLoveAuthors[randomIndexToSwap] = quotesLoveAuthors[i];
            loveTags[randomIndexToSwap] = loveTags[i];
            quotesLove[i] = tempQuote;
            quotesLoveAuthors[i] = tempAuthor;
            loveTags[i] = tempTags;
        }
    }

    private static String[] quotesLove = {
            //0
            "\"The best and most beautiful things in the world cannot be seen or even touched – they must be felt with the heart.\"",
            //1
            "\"Forever is a long time, but I wouldn’t mind spending it by your side.\"",
            //2
            "\"Love is not only something you feel, it is something you do.\"",
            //3
            "\"I never could have accomplished what I have today without the love I feel from you!\"",
            //4
            "\"I still fall in love with you every day!\"",
            //5
            "\"Love looks not with the eyes, but with the mind, and therefore is winged Cupid painted blind.\"",
            //6
            "\"My mind thinks of you the second I fall asleep and as soon as I wake up each morning.\"",
            //7
            "\"We love because it‘s the only true adventure.\"",
            //8
            "\"Love does not dominate; it cultivates.\"",
            //9
            "\"I love you without knowing how, or when, or from where. I love you simply, without problems or pride.\"",
            //10
            "\"Love is not about how many days, weeks or months you’ve been together, it’s all about how much you love each other every day.\"",
            //11
            "\"Where there is love there is life.\"",
            //12
            "\"I could never say how much I like you, and just how special you are to me. But I can say that my world is all smiles whenever I am with you. I love you a lot.\"",
            //13
            "\"My six words love story: I can’t imagine life without you.\"",
            //14
            "\"I think the perfection of love is that it’s not perfect.\"",
            //15
            "\"It is better to have loved and lost that never to have loved at all.\"",
            //16
            "\"Love takes off masks that we fear we cannot live without and know we cannot live within.\"",
            //17
            "\"At the touch of love everyone becomes a poet.\"",
            //18
            "\"I know no greater happiness than to be with you all the time, without interruption, without end.\"",
            //19
            "\"You are the last thought in my mind before I drift off to sleep and the first thought when I wake up each morning.\"",
            //20
            "\"I love you and that’s the beginning and end of everything.\"",
            //21
            "\"I will never be perfect for you, but I will always imperfectly try to be.\"",
            //22
            "\"Keep love in your heart. A life without it is like a sunless garden when the flowers are dead.\"",
            //23
            "\"Our greatest joy and out greatest pain come in our relationships with others.\"",
            //24
            "\"Thinking of you keeps me awake. Dreaming of you keeps me asleep. Being with you keeps me alive.\"",
            //25
            "\"Lots of people want to ride with you in the limo, but what you want is someone who will take the bus with you when the limo breaks down.\"",
            //26
            "\"And then my soul saw you and it kind of went, ‘Oh, there you are. I’ve been looking all over for you.\"",
            //27
            "\"I wish that you were here or I were there or we were together anywhere.\"",
            //28
            "\"I’ll never ask you to change for me because you are perfect just the way you are.\"",
            //29
            "\"I am very indecisive and always have trouble picking my favorite anything. But, without a doubt, you are my favorite everything.\"",
            //30
            "\"I swear I couldn’t love you more than I do right now, and yet I know I will tomorrow.\"",
            //31
            "\"I can’t stop thinking about you, today… tomorrow… always.\"",
            //32
            "\"I love you not because of who you are, but because of who I am when I am with you.\"",
            //33
            "\"To the world you may be one person, but to one person you are the world.\"",
            //34
            "\"I don’t need paradise because I found you. I don’t need dreams because I already have you.\"",
            //35
            "\"You are every reason, every hope and every dream I’ve ever had.\"",
            //36
            "\"The only way to have a friend is to be one.\"",
            //37
            "\"If I had a flower for every time I thought of you, I could walk in my garden forever.\"",
            //38
            "\"Love is like the wind, you can’t see it but you can feel it.\"",
            //39
            "\"I went to sleep last night with a smile because I knew I’d be dreaming of you… but I woke up this morning with a smile because you weren’t a dream.\"",
            //40
            "\"I hope you know that every time I tell you to get home safe, stay warm, have a good day or sleep well what I am really saying is I love you. I love you so damn much that it is starting to steal other word’s meanings.\"",
            //41
            "\"You are the source of my joy, the center of my world and the whole of my heart.\"",
            //42
            "\"Be kind to unkind people, they need it the most.\"",
            //43
            "\"Love yourself first and everything else falls into line. You really have to love yourself to get anything done in this world.\"",
            //44
            "\"Life without love is like a tree without blossoms or fruit.\"",
            //45
            "\"Love is a fire. But whether it is going to warm your hearth or burn down your house, you can never tell.\"",
            //46
            "\"You know it’s not love when all you want is that person to be happy, even if you’re not part of their happiness.\"",
            //47
            "\"I saw that you were perfect and so I loved you. Then I saw that you were not perfect and I loved you even more.\"",
            //48
            "\"Love is what makes the ride worthwhile.\"",
            //49
            "\"Remember, we’re madly in love, so it’s all right to kiss me any time you feel like it.\"",
            //50
            "\"The only thing we never get enough of is love; and the only thing we never give enough of is love.\"",
            //51
            "\"Thank you for going on this journey through life with me. There is nobody else who I would want by my side but you my angel.\"",
            //52
            "\"Keep love in your heart. A life without it is like a sunless garden when the flowers are dead.\"",
            //53
            "\"The love of life is necessary to the vigorous prosecution of any undertaking.\"",
            //54
            "\"In all the world, there is no heart for me like yours. In all the world, there is on love for you like mine.\"",
            //55
            "\"The real lover is the man who can thrill you by kissing your forehead or smiling into your eyes or just staring into space.\"",
            //56
            "\"Love grows by giving. The love we give away is the only love we keep. The only way to retain love to give it away.\"",
            //57
            "\"Thank you for always being my rainbow after the storm.\"",
            //58
            "\"Every day and night, my mind is filled with thoughts of you. As long as the sun continues to shine, you can be sure that my heart will remain yours.\"",
            //59
            "\"You are my best friend, my human diary, and my other half. You mean the world to me and I love you.\"",
            //60
            "\"One word frees us of all the weight and pain in life. That word is love!\"",
            //61
            "\"You are nothing short of my everything.\"",
            //62
            "\"When someone loves you, the way they talk about you is different. You feel safe and comfortable.\"",
            //63
            "\"If I did anything right in my life it was when I gave my heart to you.\"",
            //64
            "\"To be your friend was all I ever wanted; to be your lover was all I ever dreamed.\"",
            //65
            "\"To love or have loved, that is enough. Ask nothing further. There is no other pearl to be found in the dark folds of life.\"",
            //66
            "\"Where love reigns, the impossible may be attained.\"",
            //67
            "\"If you live to be a hundred, I want to live to be a hundred minus one day, so I never have to live without you.\"",
            //68
            "\"Love recognizes no barriers. It jumps hurdles, leaps fences, penetrates walls to arrive at its destination full of hope.\"",
            //69
            "\"I love those hugs where you just don’t want to let go.\"",
            //70
            "\"If you have the ability to love, love yourself first.\"",
            //71
            "\"A woman knows the face of the man she loves as a sailor knows the open sea.\"",
            //72
            "\"If you judge people, you have no time to love them.\"",
            //73
            "\"Here is my heart, accept it please because I am so clumsy and I am afraid I just might lose it.\"",
            //74
            "\"I love you for all that you are, all that you have been and all that you’re yet to be.\"",
            //75
            "\"If I know what love is, it is because of you.\"",
            //76
            "\"If I had to dream up the perfect woman, she wouldn’t even come close to you.\"",
            //77
            "\"Spread love everywhere you go. Let no one ever come to you without leaving happier.\"",
            //78
            "\"Sometimes I look at you and I wonder how I got to be so damn lucky.\"",
            //79
            "\"In this crazy world, full of change and chaos, there is one thing of which I am certain, one thing which does not change: my love for you.\"",
            //80
            "\"I’ve fallen in love many times… always with you.\"",
            //81
            "\"Love is supposed to be based on trust, and trust on love, it’s something rare and beautiful when people can confide in each other without fearing what the other person will think.\"",
            //82
            "\"So, I love you because the entire universe conspired to help me find you.\"",
            //83
            "\"I don’t want to lose you in my life. You are the stars in my sky and the sun to my world. You are the reason I survive.\"",
            //84
            "\"I love how she makes me feel like anything is possible, or like life is worth it.\"",
            //85
            "\"When I wake up in the morning, I am thinking of you. When I go to sleep at night, I am thinking of you. And all those hours in between, I think of us.\"",
            //86
            "\"We are most alive when we’re in love.\"",
            //87
            "\"Where love rules, there is no will to power, and where power predominates, love is lacking. The one is the shadow of the other.\"",
            //88
            "\"Being deeply loved by someone gives you strength, while loving someone deeply gives you courage.\"",
            //89
            "\"The best thing to hold onto in life is each other.\"",
            //90
            "\"My love for you is past the mind, beyond my heart, and into my soul.\"",
            //91
            "\"We are shaped and fashioned by what we love.\"",
            //92
            "\"You are my paradise and I would happily get stranded on you for a lifetime.\"",
            //93
            "\"I love making you laugh because for those few seconds, I made you happy and seeing you happy, it makes me happy too.\"",
            //94
            "\"Never love anybody who treats you like you’re ordinary.\"",
            //95
            "\"To love is nothing, to be loved is something… to love and be loved is everything.\"",
            //96
            "\"When I tell you I love you, I don’t say it out of habit. I say it to remind you that you’re the best thing that ever happened to me.\"",
            //97
            "\"Love is a friendship set to music.\"",
            //98
            "\"A truly rich man is one whose children run into his arms when his hands are empty.\"",
            //99
            "\"You have no idea how fast my heart races when I see you.\"",
            //100
            "\"The way to love anything is to realize that it may be lost.\"",
            //101
            "\"A flower cannot blossom without sunshine, and man cannot live without love.\"",
            //102
            "\"You may hold my hand for a while, but you hold my heart forever.\"",
            //103
            "\"My heart is perfect because you are in it.\"",
            //104
            "\"Love is of all passions the strongest, for it attacks simultaneously the head, the heart, and the senses.\"",
            //105
            "\"You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.\"",
            //106
            "\"All you need is love. But a little chocolate now and then doesn’t hurt.\"",
            //107
            "\"When we are in love we seem to ourselves quite different from what we were before.\"",
            //108
            "\"Love is what you’ve been through with somebody.\"",
            //109
            "\"The most important thing in life is to learn how to give out love, and to let it come in.\"",
            //110
            "\"A person that truly loves you will never let you go, no matter how hard the situation is.\"",
            //111
            "\"He’s more myself than I am. Whatever our souls are made of, his and mine are the same.\"",
            //112
            "\"I am just a small girl in a big world trying to find someone to love.\"",
            //113
            "\"There is always madness in love. But there is also always some reason in madness.\"",
            //114
            "\"To love deeply in one direction makes us more loving in all others.\"",
            //115
            "\"Love has nothing to do with what you are expecting to get -  only with what you are expecting to give – which is everything.\"",
            //116
            "\"Love is, above all, the gift of oneself.\"",
            //117
            "\"When you realize you want to spend the rest of your life with somebody, you want the rest of your life to start as soon as possible.\"",
            //118
            "\"Loved you yesterday, love you still, always have, always will.\"",
            //119
            "\"Women are meant to be loved, not to be understood.\"",
            //120
            "\"To love someone is to see a miracle invisible to others.\"",
            //121
            "\"Love is a lot like a backache, it doesn’t show up on X-rays, but you know it’s there.\"",
            //122
            "\"What the world really needs is more love and less paperwork.\"",
            //123
            "\"When you love someone, you love the whole person, just as he or she is, and not as you would like them to be.\"",
            //124
            "\"Love is that condition in which the happiness of another person is essential to your own.\"",
            //125
            "\"We can’t help everyone, but everyone can help someone.\"",
            //126
            "\"Love is the pursuit of the whole.\"",
            //127
            "\"The greatest thing you’ll ever learn is to love and be loved in return.\"",
            //128
            "\"Love is the whole thing. We are only pieces.\"",
            //129
            "\"A successful marriage requires falling in love many times, always with the same person.\"",
            //130
            "\"Love is something sent from heaven to worry the hell out of you.\"",
            //131
            "\"Love is born into every human being; it calls back the halves of our original nature together; it tries to make one out of two and heal the wound of human nature.\"",
            //132
            "\"I would rather spend one lifetime with you, than face all the ages of this world alone.\"",
            //133
            "\"Life is the flower for which love is the honey.\"",
            //134
            "\"The greatest happiness in life is the conviction that we are loved; loved for ourselves, or rather, loved in spite of ourselves.\"",
            //135
            "\"Love is a great beautifier.\"",
            //136
            "\"To love and be loved is to feel the sun from both sides.\""
    };
    private static String[] quotesLoveAuthors = {
            //0
            "Helen Keller",
            //1
            "Unknown",
            //2
            "David Wilkerson",
            //3
            "Unknown",
            //4
            "Unknown",
            //5
            "William Shakespeare",
            //6
            "Unknown",
            //7
            "Nikki Giovanni",
            //8
            "Johann Wolfgang von Goethe",
            //9
            "Pablo Neruda",
            //10
            "Unknown",
            //11
            "Mahatma Gandhi",
            //12
            "Unknown",
            //13
            "Unknown",
            //14
            "Taylor Swift",
            //15
            "Alfred Lord Tennyson",
            //16
            "James Baldwin",
            //17
            "Plato",
            //18
            "Franz Kafka",
            //19
            "Unknown",
            //20
            "F. Scott Fitzgerald",
            //21
            "Atticus",
            //22
            "Oscar Wilde",
            //23
            "Stephen R. Covey",
            //24
            "Unknown",
            //25
            "Oprah Winfrey",
            //26
            "Unknown",
            //27
            "Unknown",
            //28
            "Unknown",
            //29
            "Unknown",
            //30
            "Leo Cristopher",
            //31
            "Unknown",
            //32
            "Roy Croft",
            //33
            "Bill Wilson",
            //34
            "Unknown",
            //35
            "Nicholas Sparks",
            //36
            "Ralph Waldo Emerson",
            //37
            "Alfred Lord Tennyson",
            //38
            "Nicholas Sparks",
            //39
            "Unknown",
            //40
            "Unknown",
            //41
            "Unknown",
            //42
            "Unknown",
            //43
            "Lucille Ball",
            //44
            "Khali Gibran",
            //45
            "Joan Crawford",
            //46
            "Julia Roberts",
            //47
            "Unknown",
            //48
            "Franklin P. Jones",
            //49
            "Peeta (The Hunger Games)",
            //50
            "Henry Miller",
            //51
            "Unknown",
            //52
            "Oscar Wilde",
            //53
            "Samuel Johnson",
            //54
            "Maya Angelou",
            //55
            "Marilyn Monroe",
            //56
            "Elbert Hubbard",
            //57
            "Unknown",
            //58
            "Unknown",
            //59
            "Unknown",
            //60
            "Sophocles",
            //61
            "Unknown",
            //62
            "Jess C. Scott",
            //63
            "Unknown",
            //64
            "Valerie Lombardo",
            //65
            "Victor Hugo (Les Misérables)",
            //66
            "Indian proverb",
            //67
            "A. A. Milne (Winnie the Pooh)",
            //68
            "Maya Angelou",
            //69
            "Unknown",
            //70
            "Charles Bukowski",
            //71
            "Honore de Balzac",
            //72
            "Mother Teresa",
            //73
            "Unknown",
            //74
            "Ernest Hemingway",
            //75
            "Hermann Hesse",
            //76
            "Cory Matthews (Boy Meets World)",
            //77
            "Mother Teresa",
            //78
            "Unknown",
            //79
            "Unknown",
            //80
            "Unknown",
            //81
            "E. A. Bucchianeri",
            //82
            "Paulo Coelho",
            //83
            "Unknown",
            //84
            "Tom Hansen (500 Days of Summer)",
            //85
            "Unknown",
            //86
            "John Updike",
            //87
            "Carl Jung",
            //88
            "Lao Tzu",
            //89
            "Audrey Hepburn",
            //90
            "Boris Kodjoe",
            //91
            "Johann Wolfgang von Goethe",
            //92
            "Unknown",
            //93
            "Unknown",
            //94
            "Oscar Wilde",
            //95
            "Bill Russell",
            //96
            "Unknown",
            //97
            "Joseph Campbell",
            //98
            "Unknown",
            //99
            "Unknown",
            //100
            "Gilbert K. Chesterton",
            //101
            "Max Müller",
            //102
            "Unknown",
            //103
            "Unknown",
            //104
            "Lao Tzu",
            //105
            "Dr. Seuss",
            //106
            "Charles Schulz",
            //107
            "Blaise Pascal",
            //108
            "James Thurber",
            //109
            "Morrie Schwartz",
            //110
            "Unknown",
            //111
            "Emily Bronte",
            //112
            "Marilyn Monroe",
            //113
            "Friedrich Nietzsche",
            //114
            "Anne-Sophie Swetchine",
            //115
            "Katharine Hepburn",
            //116
            "Jean Anouilh",
            //117
            "Nora Ephron",
            //118
            "Elaine Davis",
            //119
            "Oscar Wilde",
            //120
            "François Mauriac",
            //121
            "George Burns",
            //122
            "Pearl Bailey",
            //123
            "Leo Tolstoy",
            //124
            "Robert A. Heinlein",
            //125
            "Ronald Reagan",
            //126
            "Plato",
            //127
            "Natalie Cole",
            //128
            "Rumi",
            //129
            "Mignon McLaughlin",
            //130
            "Dolly Parton",
            //131
            "Plato",
            //132
            "J. R. R. Tolkien",
            //133
            "Victor Hugo",
            //134
            "Victor Hugo",
            //135
            "Louisa May Alcott",
            //136
            "David Viscott"
    };
    private static String[][] loveTags = {
            //0
            {"love", "helen", "keller", "the", "best", "and", "most", "beautiful", "things", "in", "world", "cannot", "be", "seen", "or", "even", "touched", "they", "must", "felt", "with", "heart"},
            //1
            {"love", "forever", "is", "a", "long", "time", "but", "i", "wouldn’t", "mind", "spending", "it", "by", "your", "side"},
            //2
            {"love", "david", "wilkerson", "is", "not", "only", "something", "you", "feel", "it", "do"},
            //3
            {"love", "i", "never", "could", "have", "accomplished", "what", "today", "without", "the", "feel", "from", "you"},
            //4
            {"love", "i", "still", "fall", "in", "with", "you", "every", "day"},
            //5
            {"love", "william", "shakespeare", "looks", "not", "with", "the", "eyes", "but", "mind", "and", "therefore", "is", "winged", "cupid", "painted", "blind"},
            //6
            {"love", "my", "mind", "thinks", "of", "you", "the", "second", "i", "fall", "asleep", "and", "as", "soon", "wake", "up", "each", "morning"},
            //7
            {"love", "nikki", "giovanni", "we", "because", "it‘s", "the", "only", "true", "adventure"},
            //8
            {"love", "johann", "wolfgang", "von", "goethe", "does", "not", "dominate", "it", "cultivates"},
            //9
            {"love", "pablo", "neruda", "i", "you", "without", "knowing", "how", "or", "when", "from", "where", "simply", "problems", "pride"},
            //10
            {"love", "is", "not", "about", "how", "many", "days", "weeks", "or", "months", "you’ve", "been", "together", "it’s", "all", "much", "you", "each", "other", "every", "day"},
            //11
            {"love", "mahatma", "gandhi", "where", "there", "is", "life"},
            //12
            {"love", "i", "could", "never", "say", "how", "much", "like", "you", "and", "just", "special", "are", "to", "me", "but", "can", "that", "my", "world", "is", "all", "smiles", "whenever", "am", "with", "a", "lot"},
            //13
            {"love", "my", "six", "words", "story", "i", "can’t", "imagine", "life", "without", "you"},
            //14
            {"love", "taylor", "swift", "i", "think", "the", "perfection", "of", "is", "that", "it’s", "not", "perfect"},
            //15
            {"love", "alfred", "lord", "tennison", "it", "is", "better", "to", "have", "loved", "and", "lost", "that", "never", "at", "all"},
            //16
            {"love", "james", "baldwin", "takes", "off", "masks", "that", "we", "fear", "cannot", "live", "without", "and", "know", "within"},
            //17
            {"love", "plato", "at", "the", "touch", "of", "everyone", "becomes", "a", "poet"},
            //18
            {"love", "franz", "kafka", "i", "know", "no", "greater", "happiness", "than", "to", "be", "with", "you", "all", "the", "time", "without", "interruption", "end"},
            //19
            {"love", "you", "are", "the", "last", "thought", "in", "my", "mind", "before", "i", "drift", "off", "to", "sleep", "and", "first", "when", "wake", "up", "each", "morning"},
            //20
            {"love", "f", "scott", "fitzgerald", "i", "you", "and", "that’s", "the", "beginning", "end", "of", "everything"},
            //21
            {"love", "atticus", "i", "will", "never", "be", "perfect", "for", "you", "but", "always", "imperfectly", "try", "to"},
            //22
            {"love", "oscar", "wilde", "keep", "in", "your", "heart", "a", "life", "without", "it", "is", "like", "sunless", "garden", "when", "the", "flowers", "are", "dead"},
            //23
            {"love", "stephen", "r", "covey", "our", "greatest", "joy", "and", "out", "pain", "come", "in", "relationships", "with", "others"},
            //24
            {"love", "thinking", "of", "you", "keeps", "me", "awake", "dreaming", "asleep", "being", "with", "alive"},
            //25
            {"love", "oprah", "winfrey", "lots", "of", "people", "want", "to", "ride", "with", "you", "in", "the", "limo", "but", "what", "is", "someone", "who", "will", "take", "bus", "when", "breaks", "down"},
            //26
            {"love", "and", "then", "my", "soul", "saw", "you", "it", "kind", "of", "went", "‘oh", "there", "are", "i’ve", "been", "looking", "all", "over", "for"},
            //27
            {"love", "i", "wish", "that", "you", "were", "here", "or", "there", "we", "together", "anywhere"},
            //28
            {"love", "i’ll", "never", "ask", "you", "to", "change", "for", "me", "because", "are", "perfect", "just", "the", "way"},
            //29
            {"love", "i", "am", "very", "indecisive", "and", "always", "have", "trouble", "picking", "my", "favorite", "anything", "but", "without", "a", "doubt", "you", "are", "everything"},
            //30
            {"love", "leo", "cristopher", "i", "swear", "couldn’t", "you", "more", "than", "do", "right", "now", "and", "yet", "know", "will", "tomorrow"},
            //31
            {"love", "i", "can’t", "stop", "thinking", "about", "you", "today…", "tomorrow", "always"},
            //32
            {"love", "roy", "croft", "i", "you", "not", "because", "of", "who", "are", "but", "am", "when", "with"},
            //33
            {"love", "bill", "wilson", "to", "the", "world", "you", "may", "be", "one", "person", "but", "are"},
            //34
            {"love", "i", "don’t", "need", "paradise", "because", "found", "you", "dreams", "already", "have"},
            //35
            {"love", "nicholas", "sparks", "you", "are", "every", "reason", "hope", "and", "dream", "i’ve", "ever", "had"},
            //36
            {"love", "ralph", "w", "waldo", "emerson", "the", "only", "way", "to", "have", "a", "friend", "is", "be", "one"},
            //37
            {"love", "alfred", "lord", "tennyson", "if", "i", "had", "a", "flower", "for", "every", "time", "thought", "of", "you", "could", "walk", "in", "my", "garden", "forever"},
            //38
            {"love", "nicholas", "sparks", "is", "like", "the", "wind", "you", "can’t", "see", "it", "but", "can", "feel"},
            //39
            {"love", "i", "went", "to", "sleep", "last", "night", "with", "a", "smile", "because", "knew", "i’d", "be", "dreaming", "of", "you…", "but", "woke", "up", "this", "morning", "you", "weren’t", "dream"},
            //40
            {"love", "i", "hope", "you", "know", "that", "every", "time", "tell", "to", "get", "home", "safe", "stay", "warm", "have", "a", "good", "day", "or", "sleep", "well", "what", "am", "really", "saying", "is", "so", "damn", "much", "it", "starting", "steal", "other", "word’s", "meanings"},
            //41
            {"love", "you", "are", "the", "source", "of", "my", "joy", "center", "world", "and", "whole", "heart"},
            //42
            {"love", "be", "kind", "to", "unkind", "people", "they", "need", "it", "the", "most"},
            //43
            {"love", "lucille", "ball", "yourself", "first", "and", "everything", "else", "falls", "into", "line", "you", "really", "have", "to", "get", "anything", "done", "in", "this", "world"},
            //44
            {"love", "khali", "gibran", "life", "without", "is", "like", "a", "tree", "blossoms", "or", "fruit"},
            //45
            {"love", "joan", "crawford", "is", "a", "fire", "but", "whether", "it", "going", "to", "warm", "your", "hearth", "or", "burn", "down", "house", "you", "can", "never", "tell"},
            //46
            {"love", "julia", "roberts", "you", "know", "it’s", "not", "when", "all", "want", "is", "that", "person", "to", "be", "happy", "even", "if", "you’re", "part", "of", "their", "happiness"},
            //47
            {"love", "i", "saw", "that", "you", "were", "perfect", "and", "so", "loved", "then", "not", "even", "more"},
            //48
            {"love", "franklin", "p", "jones", "is", "what", "makes", "the", "ride", "worthwhile"},
            //49
            {"love", "peeta", "the", "hunger", "games", "remember", "we’re", "madly", "in", "so", "it’s", "all", "right", "to", "kiss", "me", "any", "time", "you", "feel", "like", "it"},
            //50
            {"love", "henry", "miller", "the", "only", "thing", "we", "never", "get", "enough", "of", "is", "and", "give"},
            //51
            {"love", "thank", "you", "for", "going", "on", "this", "journey", "through", "life", "with", "me", "there", "is", "nobody", "else", "who", "i", "would", "want", "by", "my", "side", "but", "angel"},
            //52
            {"love", "oscar", "wilde", "keep", "in", "your", "heart", "a", "life", "without", "it", "is", "like", "sunless", "garden", "when", "the", "flowers", "are", "dead"},
            //53
            {"love", "samuel", "johnson", "the", "of", "life", "is", "necessary", "to", "vigorous", "prosecution", "any", "undertaking"},
            //54
            {"love", "maya", "angelou", "in", "all", "the", "world", "there", "is", "no", "heart", "for", "me", "like", "yours", "on", "you", "mine"},
            //55
            {"love", "marilyn", "monroe", "the", "real", "lover", "is", "man", "who", "can", "thrill", "you", "by", "kissing", "your", "forehead", "or", "smiling", "into", "eyes", "just", "staring", "space"},
            //56
            {"love", "elbert", "hubbard", "grows", "by", "giving", "the", "we", "give", "away", "is", "only", "keep", "way", "to", "retain", "it"},
            //57
            {"love", "thank", "you", "for", "always", "being", "my", "rainbow", "after", "the", "storm"},
            //58
            {"love", "every", "day", "and", "night", "my", "mind", "is", "filled", "with", "thoughts", "of", "you", "as", "long", "the", "sun", "continues", "to", "shine", "can", "be", "sure", "that", "heart", "will", "remain", "yours"},
            //59
            {"love", "you", "are", "my", "best", "friend", "human", "diary", "and", "other", "half", "mean", "the", "world", "to", "me", "i"},
            //60
            {"love", "sophocles", "one", "word", "frees", "us", "of", "all", "the", "weight", "and", "pain", "in", "life", "that", "is"},
            //61
            {"love", "you", "are", "nothing", "short", "of", "my", "everything"},
            //62
            {"love", "jess", "c", "scott", "when", "someone", "loves", "you", "the", "way", "they", "talk", "about", "is", "different", "feel", "safe", "and", "comfortable"},
            //63
            {"love", "if", "i", "did", "anything", "right", "in", "my", "life", "it", "was", "when", "gave", "heart", "to", "you"},
            //64
            {"love", "valerie", "lombardo", "to", "be", "your", "friend", "was", "all", "i", "ever", "wanted", "lover", "dreamed"},
            //65
            {"love", "victor", "hugo", "les", "misérables", "miserables", "to", "or", "have", "loved", "that", "is", "enough", "ask", "nothing", "further", "there", "no", "other", "pearl", "be", "found", "in", "the", "dark", "folds", "of", "life"},
            //66
            {"love", "indian", "proverb", "where", "reigns", "the", "impossible", "may", "be", "attained"},
            //67
            {"love", "a", "milne", "if", "you", "live", "to", "be", "a", "hundred", "i", "want", "minus", "one", "day", "so", "never", "have", "without"},
            //68
            {"love", "maya", "angelou", "recognizes", "no", "barriers", "it", "jumps", "hurdles", "leaps", "fences", "penetrates", "walls", "to", "arrive", "at", "its", "destination", "full", "of", "hope"},
            //69
            {"love", "i", "those", "hugs", "where", "you", "just", "don’t", "want", "to", "let", "go"},
            //70
            {"love", "charles", "bukowski", "if", "you", "have", "the", "ability", "to", "yourself", "first"},
            //71
            {"love", "honore", "de", "balzac", "a", "woman", "knows", "the", "face", "of", "man", "she", "loves", "as", "sailor", "open", "sea"},
            //72
            {"love", "mother", "teresa", "if", "you", "judge", "people", "have", "no", "time", "to", "them"},
            //73
            {"love", "here", "is", "my", "heart", "accept", "it", "please", "because", "i", "am", "so", "clumsy", "and", "afraid", "just", "might", "lose"},
            //74
            {"love", "ernest", "hemingway", "i", "you", "for", "all", "that", "are", "have", "been", "and", "you’re", "yet", "to", "be"},
            //75
            {"love", "hermann", "hesse", "if", "i", "know", "what", "is", "it", "because", "of", "you"},
            //76
            {"love", "cory", "matthews", "boy", "meets", "the", "world", "if", "i", "had", "to", "dream", "up", "the", "perfect", "woman", "she", "wouldn’t", "even", "come", "close", "you"},
            //77
            {"love", "mother", "teresa", "spread", "everywhere", "you", "go", "let", "no", "one", "ever", "come", "to", "without", "leaving", "happier"},
            //78
            {"love", "sometimes", "i", "look", "at", "you", "and", "wonder", "how", "got", "to", "be", "so", "damn", "lucky"},
            //79
            {"love", "in", "this", "crazy", "world", "full", "of", "change", "and", "chaos", "there", "is", "one", "thing", "which", "i", "am", "certain", "does", "not", "my", "for", "you"},
            //80
            {"love", "i’ve", "fallen", "in", "many", "times…", "always", "with", "you"},
            //81
            {"love", "e", "a", "bucchianeri", "is", "supposed", "to", "be", "based", "on", "trust", "and", "it’s", "something", "rare", "beautiful", "when", "people", "can", "confide", "in", "each", "other", "without", "fearing", "what", "the", "person", "will", "think"},
            //82
            {"love", "paulo", "coelho", "so", "i", "you", "because", "the", "entire", "universe", "conspired", "to", "help", "me", "find"},
            //83
            {"love", "i", "don’t", "want", "to", "lose", "you", "in", "my", "life", "are", "the", "stars", "sky", "and", "sun", "world", "reason", "survive"},
            //84
            {"love", "tom", "hansen", "500", "days", "of", "summer", "i", "how", "she", "makes", "me", "feel", "like", "anything", "is", "possible", "or", "life", "worth", "it"},
            //85
            {"love", "when", "i", "wake", "up", "in", "the", "morning", "am", "thinking", "of", "you", "go", "to", "sleep", "at", "night", "and", "all", "those", "hours", "between", "think", "us"},
            //86
            {"love", "john", "updike", "we", "are", "most", "alive", "when", "we’re", "in"},
            //87
            {"love", "c", "carl", "g", "gustav", "jung", "where", "rules", "there", "is", "no", "will", "to", "power", "and", "predominates", "lacking", "the", "one", "shadow", "of", "other"},
            //88
            {"love", "lao", "tzu", "being", "deeply", "loved", "by", "someone", "gives", "you", "strength", "while", "loving", "courage"},
            //89
            {"love", "audrey", "hepburn", "the", "best", "thing", "to", "hold", "onto", "in", "life", "is", "each", "other"},
            //90
            {"love", "boris", "kodjoe", "my", "for", "you", "is", "past", "the", "mind", "beyond", "heart", "and", "into", "soul"},
            //91
            {"love", "johann", "wolfgang", "von", "goethe", "we", "are", "shaped", "and", "fashioned", "by", "what"},
            //92
            {"love", "you", "are", "my", "paradise", "and", "i", "would", "happily", "get", "stranded", "on", "for", "a", "lifetime"},
            //93
            {"love", "i", "making", "you", "laugh", "because", "for", "those", "few", "seconds", "made", "happy", "and", "seeing", "it", "makes", "me", "too"},
            //94
            {"love", "oscar", "wilde", "never", "anybody", "who", "treats", "you", "like", "you’re", "ordinary"},
            //95
            {"love", "bill", "russell", "to", "is", "nothing", "be", "loved", "something…", "and", "everything"},
            //96
            {"love", "when", "i", "tell", "you", "don’t", "say", "it", "out", "of", "habit", "to", "remind", "that", "you’re", "the", "best", "thing", "ever", "happened", "me"},
            //97
            {"love", "joseph", "campbell", "is", "a", "friendship", "set", "to", "music"},
            //98
            {"love", "a", "truly", "rich", "man", "is", "one", "whose", "children", "run", "into", "his", "arms", "when", "hands", "are", "empty"},
            //99
            {"love", "you", "have", "no", "idea", "how", "fast", "my", "heart", "races", "when", "i", "see"},
            //100
            {"love", "gilbert", "k", "chesterton", "the", "way", "to", "anything", "is", "realize", "that", "it", "may", "be", "lost"},
            //101
            {"love", "max", "müller", "muller", "a", "flower", "cannot", "blossom", "without", "sunshine", "and", "man", "live"},
            //102
            {"love", "you", "may", "hold", "my", "hand", "for", "a", "while", "but", "heart", "forever"},
            //103
            {"love", "my", "heart", "is", "perfect", "because", "you", "are", "in", "it"},
            //104
            {"love", "lao", "tzu", "is", "of", "all", "passions", "the", "strongest", "for", "it", "attacks", "simultaneously", "head", "heart", "and", "senses"},
            //105
            {"love", "dr", "seuss", "you", "know", "you’re", "in", "when", "can’t", "fall", "asleep", "because", "reality", "is", "finally", "better", "than", "your", "dreams"},
            //106
            {"love", "charles", "schulz", "all", "you", "need", "is", "but", "a", "little", "chocolate", "now", "and", "then", "doesn’t", "hurt"},
            //107
            {"love", "blaise", "pascal", "when", "we", "are", "in", "seem", "to", "ourselves", "quite", "different", "from", "what", "were", "before"},
            //108
            {"love", "james", "thurber", "is", "what", "you’ve", "been", "through", "with", "somebody"},
            //109
            {"love", "morrie", "schwartz", "the", "most", "important", "thing", "in", "life", "is", "to", "learn", "how", "give", "out", "and", "let", "it", "come"},
            //110
            {"love", "a", "person", "that", "truly", "loves", "you", "will", "never", "let", "go", "no", "matter", "how", "hard", "the", "situation", "is"},
            //111
            {"love", "emily", "bronte", "he’s", "more", "myself", "than", "i", "am", "whatever", "our", "souls", "are", "made", "of", "his", "and", "mine", "the", "same"},
            //112
            {"love", "marilyn", "monroe", "i", "am", "just", "a", "small", "girl", "in", "big", "world", "trying", "to", "find", "someone"},
            //113
            {"love", "friedrich", "nietzsche", "there", "is", "always", "madness", "in", "but", "also", "some", "reason"},
            //114
            {"love", "annesophie", "swetchine", "to", "deeply", "in", "one", "direction", "makes", "us", "more", "loving", "all", "others"},
            //115
            {"love", "katharine", "hepburn", "has", "nothing", "to", "do", "with", "what", "you", "are", "expecting", "get", "only", "give", "which", "is", "everything"},
            //116
            {"love", "jean", "anouilh", "is", "above", "all", "the", "gift", "of", "oneself"},
            //117
            {"love", "nora", "ephron", "when", "you", "realize", "want", "to", "spend", "the", "rest", "of", "your", "life", "with", "somebody", "start", "as", "soon", "possible"},
            //118
            {"love", "elaine", "davis", "loved", "you", "yesterday", "still", "always", "have", "will"},
            //119
            {"love", "oscar", "wilde", "women", "are", "meant", "to", "be", "loved", "not", "understood"},
            //120
            {"love", "francois", "mauriac", "to", "someone", "is", "see", "a", "miracle", "invisible", "others"},
            //121
            {"love", "george", "burns", "is", "a", "lot", "like", "backache", "it", "doesn’t", "show", "up", "on", "xrays", "but", "you", "know", "it’s", "there"},
            //122
            {"love", "pearl", "bailey", "what", "the", "world", "really", "needs", "is", "more", "and", "less", "paperwork"},
            //123
            {"love", "leo", "tolstoy", "when", "you", "someone", "the", "whole", "person", "just", "as", "he", "or", "she", "is", "and", "not", "would", "like", "them", "to", "be"},
            //124
            {"love", "robert", "a", "heinlein", "is", "that", "condition", "in", "which", "the", "happiness", "of", "another", "person", "essential", "to", "your", "own"},
            //125
            {"love", "ronald", "reagan", "we", "can’t", "help", "everyone", "but", "can", "someone"},
            //126
            {"love", "plato", "is", "the", "pursuit", "of", "whole"},
            //127
            {"love", "natalie", "cole", "the", "greatest", "thing", "you’ll", "ever", "learn", "is", "to", "and", "be", "loved", "in", "return"},
            //128
            {"love", "rumi", "is", "the", "whole", "thing", "we", "are", "only", "pieces"},
            //129
            {"love", "mignon", "mclaughlin", "a", "successful", "marriage", "requires", "falling", "in", "many", "times", "always", "with", "the", "same", "person"},
            //130
            {"love", "dolly", "parton", "is", "something", "sent", "from", "heaven", "to", "worry", "the", "hell", "out", "of", "you"},
            //131
            {"love", "plato", "is", "born", "into", "every", "human", "being", "it", "calls", "back", "the", "halves", "of", "our", "original", "nature", "together", "tries", "to", "make", "one", "out", "two", "and", "heal", "wound"},
            //132
            {"love", "j", "r", "tolkien", "i", "would", "rather", "spend", "one", "lifetime", "with", "you", "than", "face", "all", "the", "ages", "of", "this", "world", "alone"},
            //133
            {"love", "victor", "hugo", "life", "is", "the", "flower", "for", "which", "honey"},
            //134
            {"love", "victor", "hugo", "the", "greatest", "happiness", "in", "life", "is", "conviction", "that", "we", "are", "loved", "for", "ourselves", "or", "rather", "spite", "of"},
            //135
            {"love", "louisa", "may", "alcott", "is", "a", "great", "beautifier"},
            //136
            {"love", "david", "viscott", "to", "and", "be", "loved", "is", "feel", "the", "sun", "from", "both", "sides"}
    };

    public static String getLoveQuote(int position) {
        return quotesLove[position];
    }

    public static String getLoveAuthor(int position) {
        return quotesLoveAuthors[position];
    }

    public static String[] getLoveList() {
        return quotesLove;
    }

    static String[][] getLoveTags() {
        return loveTags;
    }

    public static int getLoveListSize() {
        return quotesLove.length;
    }
}
