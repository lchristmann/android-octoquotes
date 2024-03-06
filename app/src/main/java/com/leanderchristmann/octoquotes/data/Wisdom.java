package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Wisdom {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesWisdom and quotesWisdomAuthors
        int listSize = getWisdomListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesWisdom[randomIndexToSwap];
            tempAuthor = quotesWisdomAuthors[randomIndexToSwap];
            tempTags = wisdomTags[randomIndexToSwap];
            quotesWisdom[randomIndexToSwap] = quotesWisdom[i];
            quotesWisdomAuthors[randomIndexToSwap] = quotesWisdomAuthors[i];
            wisdomTags[randomIndexToSwap] = wisdomTags[i];
            quotesWisdom[i] = tempQuote;
            quotesWisdomAuthors[i] = tempAuthor;
            wisdomTags[i] = tempTags;
        }
    }

    private static String[] quotesWisdom = {
            //0
            "\"Understanding does not cure evil, but it is a definite help, inasmuch as one can cope with a comprehensible darkness.\"",
            //1
            "\"Whatever is reasonable is true, and whatever is true is reasonable.\"",
            //2
            "\"Man only likes to count his troubles; he doesn’t calculate his happiness.\"",
            //3
            "\"The essence of philosophy is that a man should so live that his happiness shall depend as little as possible on external things.\"",
            //4
            "\"The only thing I know is that I know nothing.\"",
            //5
            "\"If you have a garden and a library, you have everything you need.\"",
            //6
            "\"Adopt the pace of nature: her secret is patience.\"",
            //7
            "\"Employ your time in improving yourself by other men’s writings, so that you shall gain easily what others have labored hard for.\"",
            //8
            "\"Man cannot remake himself without suffering, for he is both the marble and the sculptor.\"",
            //9
            "\"The greatest obstacle to discovery is not ignorance – it is the illusion of knowledge.\"",
            //10
            "\"Life is short, death is forever.\"",
            //11
            "\"A tree is known by its fruit; a man by his deeds. A good deed is never lost; he who sows courtesy reaps friendship, and he who plants kindness gathers love.\"",
            //12
            "\"One of the greatest regrets in life is being what others would want you to be, rather than being yourself.\"",
            //13
            "\"Life is not a problem to be solved but a reality to be experienced.\"",
            //14
            "\"Maturity is learning to walk away from people and situation that threaten your peace of mind, self-respect, values, morals and self-worth.\"",
            //15
            "\"Few things can help an individual more than to place responsibility on him, and to let him know that you trust him.\"",
            //16
            "\"Talent hits the target no one else can hit. Genius hits the target no one else can see.\"",
            //17
            "\"The philosophers have only interpreted the world in various ways. The point, however, is to change it.\"",
            //18
            "\"If men were born free, they would, so long as they remained free, form no conception of good and evil.\"",
            //19
            "\"He who thinks great thoughts, often makes great errors.\"",
            //20
            "\"We are more often frightened than hurt; and we suffer more often in imagination than in reality.\"",
            //21
            "\"Seek opportunity, not security. A boat in a harbour is safe, but in time its bottom will rot out.\"",
            //22
            "\"He who asks a question is a fool for 5 minutes. He who does not ask a question remains a fool forever.\"",
            //23
            "\"Stop planting flowers in peoples’ yards who aren’t going to water them.\"",
            //24
            "\"Let him that would move the world first move himself.\"",
            //25
            "\"If God did not exist, it would be necessary to invent him.\"",
            //26
            "\"If you hate a person, then you’re defeated by them.\"",
            //27
            "\"The heart of a man is made to reconcile the most glaring contradictions.\"",
            //28
            "\"The young man knows the rules, but the old man knows the exceptions.\"",
            //29
            "\"God, grant me the serenity to accept the things I cannot change, courage to change the things I can, and wisdom to know the difference.\"",
            //30
            "\"Entities should not be multiplied unnecessarily.\"",
            //31
            "\"Morality is not the doctrine of how we may make ourselves happy, but of how we may make ourselves worthy of happiness.\"",
            //32
            "\"Don’t raise your voice. Improve your argument.\"",
            //33
            "\"Learn from the mistakes of others. You can’t live long enough to make them all yourself.\"",
            //34
            "\"The line dividing good and evil cuts through the heart of every human being. And who is willing to destroy a piece of his own heart?\"",
            //35
            "\"After the game, the king and the pawn go into the same box.\"",
            //36
            "\"Honesty is the first chapter in the book of wisdom.\"",
            //37
            "\"Two things to remember in life: 1. Take care of your thoughts when you’re alone. 2. Take care of your words when you’re with people.\"",
            //38
            "\"If you would be a real seeker after truth, it is necessary that at least once in your life you doubt, as far as possible, all things.\"",
            //39
            "\"The eyes are useless when the mind is blind.\"",
            //40
            "\"Man is the measure of all things.\"",
            //41
            "\"The wisest mind has something yet to learn.\"",
            //42
            "\"Thinking is difficult, that’s why most people judge.\"",
            //43
            "\"Time is the soul of this world.\"",
            //44
            "\"The unexamined life is not worth living.\"",
            //45
            "\"Life is a mirror and will reflect back to the thinker what he thinks into it.\"",
            //46
            "\"God is dead! He remains dead! And we have killed him.\"",
            //47
            "\"Until you make the unconscious conscious, it will direct your life and you will call it fate.\"",
            //48
            "\"Give me six hours to chop down a tree and I will spend the first four sharpening the axe.\"",
            //49
            "\"We are what we repeatedly do. Excellence, then, is not an act, but a habit.\"",
            //50
            "\"Great minds discuss ideas; average minds discuss events; small minds discuss people.\"",
            //51
            "\"Accept whatever comes to you woven in the pattern of your destiny, for what could more aptly fit your needs?\"",
            //52
            "\"Life is really simple, but we insist on making it complicated.\"",
            //53
            "\"There are no facts, only interpretations.\"",
            //54
            "\"There is only one good, knowledge, and one evil, ignorance.\"",
            //55
            "\"Wisdom is knowing what to do next; virtue is doing it.\"",
            //56
            "\"The meeting of two personalities is like the contact of two chemical substances: if there is any reaction, both are transformed.\"",
            //57
            "\"Death smiles at us all, but all a man can do is smile back.\"",
            //58
            "\"Experience is not what happens to you; it’s what you do with what happens to you.\"",
            //59
            "\"The greatest blessings of mankind are within us and within our reach. A wise man is content with his lot, whatever it may be, without wishing for what he has not.\"",
            //60
            "\"For many men, the acquisition of wealth does not end their troubles, it only changes them.\"",
            //61
            "\"Death is not the greatest loss in life. The greatest loss is what dies inside us while we live.\"",
            //62
            "\"There is no royal road to anything. One thing at a time, all things in succession. That which grows fast, withers as rapidly. That which grows slowly, endures.\"",
            //63
            "\"Man is born free, but is everywhere in chains.\"",
            //64
            "\"Reflect upon your present blessings, of which every man has many: not on your past misfortunes of which all men have some.\"",
            //65
            "\"It’s not what you look at that matters, it’s what you see.\"",
            //66
            "\"Speak less than you know; have more than you show.\"",
            //67
            "\"Happiness is the meaning and the purpose of life, the whole aim and end of human existence.\"",
            //68
            "\"Religion is the sign of the oppressed… it is the opium of the people.\"",
            //69
            "\"Everybody says they’re trying to get their piece of the pie. They don’t realize that the world is a kitchen – you can make your own pie.\"",
            //70
            "\"The function of prayer is not to influence God, but rather to change the nature of the one who prays.\"",
            //71
            "\"To enjoy good health, to bring true happiness to one’s family, to bring peace to all, one must first discipline and control one’s own mind. If a man can control his mind he can find the way to Enlightenment, and all wisdom and virtue will naturally come to him.\"",
            //72
            "\"Slow and steady wins the race.\"",
            //73
            "\"The best revenge is not to be like your enemy.\"",
            //74
            "\"Knowledge is of no value unless you put it into practice.\"",
            //75
            "\"Plant seeds of happiness, hope, success, and love; it will all come back to you in abundance. This is the law of nature.\"",
            //76
            "\"Be happy. It’s one way of being wise.\"",
            //77
            "\"I can control my passions and emotions if I can understand their nature.\"",
            //78
            "\"The secret of happiness, you see, is not found in seeking more, but in developing the capacity to enjoy less.\"",
            //79
            "\"Don’t let what you cannot do interfere with what you can do.\"",
            //80
            "\"Whereof one cannot speak, thereof one must be silent.\"",
            //81
            "\"I would never die for my beliefs because I might be wrong.\"",
            //82
            "\"People only see what they are prepared to see.\"",
            //83
            "\"Success is a lousy teacher. It seduces smart people into thinking they can’t lose.\"",
            //84
            "\"Life must be understood backward. But it must be lived forward.\"",
            //85
            "\"Hope is a good breakfast, but a bad supper.\"",
            //86
            "\"A bad day for your ego is a great day for your soul.\"",
            //87
            "\"There is but one truly serious philosophical problem, and that is suicide.\"",
            //88
            "\"The superior man blames himself. The inferior man blames others.\"",
            //89
            "\"Chop your own wood and it will warm you twice.\"",
            //90
            "\"Happiness is the highest good.\"",
            //91
            "\"Yesterday I was clever, so I wanted to change the world. Today I am wise, so I am changing myself.\"",
            //92
            "\"Be who you needed when you were young.\"",
            //93
            "\"If you don’t learn to control your thoughts, you will never learn how to control your behaviour.\"",
            //94
            "\"The greatest happiness of the greatest number is the foundation of morals and legislation.\"",
            //95
            "\"Never respond to an angry person with a fiery comeback, even if he deserves it… Don’t allow his anger to become your anger.\"",
            //96
            "\"Contentment is natural wealth, luxury is artificial poverty.\"",
            //97
            "\"Freedom is secured not by the fulfilling of one’s desires, but by the removal of desire.\"",
            //98
            "\"Know how to listen, and you will profit even from those who talk badly.\"",
            //99
            "\"Courage is the first of human qualities because it is the quality which guarantees all others.\"",
            //100
            "\"Mirrors show us what we look like, not who we are.\"",
            //101
            "\"The bamboo that bends is stronger than the oak that resists.\"",
            //102
            "\"We are what we repeatedly do. Excellence, then, is not an act, but a habit.\"",
            //103
            "\"Leisure is the mother of philosophy.\"",
            //104
            "\"This is patently absurd; but whoever wishes to become a philosopher must learn not to be frightened by absurdities.\"",
            //105
            "\"Take criticism seriously, but not personally. If there is truth or merit in the criticism, try to learn from it. Otherwise, let it roll right off you.\"",
            //106
            "\"That man is wisest who, like Socrates, realizes that his wisdom is worthless.\"",
            //107
            "\"When you talk, you are only repeating what you know. But if you listen, you may learn something new.\"",
            //108
            "\"Our actions are like ships which we may watch set out to sea, and not know when or with what cargo they will return to port.\"",
            //109
            "\"Whatever you do, do with all your might.\"",
            //110
            "\"Your visions will become clear only when you can look into your own heart. Who looks outside, dreams; who looks inside, awakens.\"",
            //111
            "\"If you talk to a man in a language he understands, that goes to his head. If you talk to him in his language, that goes to his heart.\"",
            //112
            "\"Most human beings have an almost infinite capacity for taking things for granted.\"",
            //113
            "\"I think therefore I am. (Cogito, ergo sum.).\"",
            //114
            "\"It requires wisdom to understand wisdom: the music is nothing if the audience is deaf.\"",
            //115
            "\"I have taken great care not to laugh at human actions, not to weep at them, nor to hate them, but to understand them.\"",
            //116
            "\"It is not because things are difficult that we do not dare; it is because we do not dare that things are difficult.\"",
            //117
            "\"Pain is inevitable. Suffering is optional.\"",
            //118
            "\"It is better to remain silent and be thought a fool than to open one’s mouth and remove all doubt.\"",
            //119
            "\"Truth is not what you want it to be; it is what it is, and you must bend to its power or live a lie.\"",
            //120
            "\"The whole problem with the world is that fools and fanatics are always so certain of themselves, and wiser people so full of doubts.\"",
            //121
            "\"A river cuts through rock, not because of its power, but because of its persistence.\"",
            //122
            "\"Being entirely honest with oneself is a good exercise.\"",
            //123
            "\"Wise men speak because they have something to say; fools because they have to say something.\"",
            //124
            "\"By three methods we may learn wisdom: first, by reflection, which is noblest; second, by imitation, which is easiest; and third by experience, which is the bitterest.\"",
            //125
            "\"The superior man thinks always of virtue; the common man thinks of comfort.\"",
            //126
            "\"A wise man can learn more from a foolish question than a fool can learn from a wise answer.\"",
            //127
            "\"Big-picture thinkers are comfortable with ambiguity. They don't try to force every observation or piece of data into pre-formulated mental cubby holes.\"",
            //128
            "\"A clever person solves a problem. A wise person avoids it.\"",
            //129
            "\"You've heard that it's wise to learn from experience, but it is wiser to learn from the experience of others.\"",
            //130
            "\"Do not be wise in words be wise in deeds.\"",
            //131
            "\"He who knows all the answers has not been asked all the questions.\"",
            //132
            "\"Imagination is more important than knowledge.\"",
            //133
            "\"The essence of knowledge is, having it, to use it.\"",
            //134
            "\"Do not impose on others what you yourself do not desire.\"",
            //135
            "\"To do harm is to do yourself harm. To do an injustice is to do yourself an injustice, it degrades you.\"",
            //136
            "\"How can you prove whether at this moment we are sleeping, and all our thoughts are a dream; or whether we are awake, and talking to one another in the waking state?\"",
            //137
            "\"Just because we feel a certain way doesn't make that feeling a fact. It only means that we feel that way. We must learn to press past our feelings.\"",
            //138
            "\"Excellence is not a gift, but a skill that takes practice. We do not act ‘rightly’ because we are ‘excellent’, in fact we achieve ‘excellence’ by acting ‘rightly’.\"",
            //139
            "\"Good people do not need laws to tell them to act responsibly, while bad people will find a way around the laws.\"",
            //140
            "\"If it’s not right, don’t do it. If it’s not true, don’t say it.\"",
            //141
            "\"When anger rises, think of the consequences.\"",
            //142
            "\"None of us is as smart as all of us.\""
    };
    private static String[] quotesWisdomAuthors = {
            //0
            "Carl Jung",
            //1
            "G. W. F. Hegel",
            //2
            "Fyodor Dostoyevsky",
            //3
            "Epictetus",
            //4
            "Socrates",
            //5
            "Cicero",
            //6
            "Ralph Waldo Emerson",
            //7
            "Socrates",
            //8
            "Alexis Carrel",
            //9
            "Daniel J. Boorstin",
            //10
            "Chuck Palahniuk",
            //11
            "Saint Basil",
            //12
            "Shannon L. Alder",
            //13
            "Soren Kierkegaard",
            //14
            "Buddha",
            //15
            "Booker T. Washington",
            //16
            "Arthur Schopenhauer",
            //17
            "Karl Marx",
            //18
            "Baruch de Spinoza",
            //19
            "Martin Heidegger",
            //20
            "Seneca",
            //21
            "H. Jackson Brown Jr.",
            //22
            "Chinese proverb",
            //23
            "Unknown",
            //24
            "Socrates",
            //25
            "Voltaire",
            //26
            "Confucius",
            //27
            "David Hume",
            //28
            "Oliver Wendell Holmes Sr.",
            //29
            "Reinhold Niebuhr",
            //30
            "William of Ockham",
            //31
            "Immanuel Kant",
            //32
            "Unknown",
            //33
            "Eleanor Roosevelt",
            //34
            "Aleksandr Solzhenitsyn",
            //35
            "Italian proverb",
            //36
            "Thomas Jefferson",
            //37
            "Lorde",
            //38
            "René Descartes",
            //39
            "Unknown",
            //40
            "Protagoras",
            //41
            "George Santanaya",
            //42
            "Carl Jung",
            //43
            "Pythagoras",
            //44
            "Socrates",
            //45
            "Ernest Holmes",
            //46
            "Friedrich Nietzsche",
            //47
            "Carl Jung",
            //48
            "Abraham Lincoln",
            //49
            "Aristotle",
            //50
            "Eleanor Roosevelt",
            //51
            "Marcus Aurelius",
            //52
            "Confucius",
            //53
            "Friedrich Nietzsche",
            //54
            "Socrates",
            //55
            "David Starr Jordan",
            //56
            "Carl Jung",
            //57
            "Marcus Aurelius",
            //58
            "Aldous Huxley",
            //59
            "Seneca",
            //60
            "Seneca",
            //61
            "Norman Cousins",
            //62
            "Josiah Gilbert Holland",
            //63
            "Jean-Jacques Rousseau",
            //64
            "Charles Dickens",
            //65
            "Henry David Thoreau",
            //66
            "William Shakespeare",
            //67
            "Aristotle",
            //68
            "Karl Marx",
            //69
            "Terry Crews",
            //70
            "Soren Kierkegaard",
            //71
            "Buddha",
            //72
            "Robert Llyod",
            //73
            "Marcus Aurelius",
            //74
            "Anton Chekhov",
            //75
            "Steve Maraboli",
            //76
            "Sidonie Gabrielle Colette",
            //77
            "Baruch de Spinoza",
            //78
            "Socrates",
            //79
            "John Wooden",
            //80
            "Ludwig Wittgenstein",
            //81
            "Bertrand Russell",
            //82
            "Ralph Waldo Emerson",
            //83
            "Bill Gates",
            //84
            "Soren Kierkegaard",
            //85
            "Francis Bacon",
            //86
            "Jillian Michaels",
            //87
            "Albert Camus",
            //88
            "Don Shula",
            //89
            "Henry Ford",
            //90
            "Aristotle",
            //91
            "Rumi",
            //92
            "Unknown",
            //93
            "Joyce Meyer",
            //94
            "Jeremy Bentham",
            //95
            "Bohdi Sanders",
            //96
            "Socrates",
            //97
            "Epictetus",
            //98
            "Plutarch",
            //99
            "Winston Churchill",
            //100
            "Unknown",
            //101
            "Japanese proverb",
            //102
            "Aristotle",
            //103
            "Thomas Hobbes",
            //104
            "Bertrand Russell",
            //105
            "Hillary Clinton",
            //106
            "Plato",
            //107
            "Dalai Lama",
            //108
            "Iris Murdoch",
            //109
            "Marcus Tullius Cicero",
            //110
            "Carl Jung",
            //111
            "Nelson Mandela",
            //112
            "Aldous Huxley",
            //113
            "René Descartes",
            //114
            "Walter Lippmann",
            //115
            "Baruch de Spinoza",
            //116
            "Seneca",
            //117
            "Haruki Murakami",
            //118
            "Mark Twain",
            //119
            "Miyamoto Musashi",
            //120
            "Bertrand Russell",
            //121
            "Jim Watkins",
            //122
            "Sigmund Freud",
            //123
            "Plato",
            //124
            "Confucius",
            //125
            "Confucius",
            //126
            "Bruce Lee",
            //127
            "John C. Maxwell",
            //128
            "Albert Einstein",
            //129
            "Rick Warren",
            //130
            "Jewish proverb",
            //131
            "Confucius",
            //132
            "Confucius",
            //133
            "Confucius",
            //134
            "Confucius",
            //135
            "Marcus Aurelius",
            //136
            "Plato",
            //137
            "Joyce Meyer",
            //138
            "Plato",
            //139
            "Plato",
            //140
            "Marcus Aurelius",
            //141
            "Confucius",
            //142
            "Ken Blanchard"
    };
    private static String[][] wisdomTags = {
            //0
            {"wisdom", "c", "carl", "g", "gustav", "jung", "understanding", "does", "not", "cure", "evil", "but", "it", "is", "a", "definite", "help", "inasmuch", "as", "one", "can", "cope", "with", "comprehensible", "darkness"},
            //1
            {"wisdom", "g", "w", "f", "hegel", "whatever", "is", "reasonable", "true", "and"},
            //2
            {"wisdom", "fyodor", "dostoyevsky", "man", "only", "likes", "to", "count", "his", "troubles", "he", "doesn’t", "calculate", "happiness"},
            //3
            {"wisdom", "epictetus", "the", "essence", "of", "philosophy", "is", "that", "a", "man", "should", "so", "live", "his", "happiness", "shall", "depend", "as", "little", "possible", "on", "external", "things"},
            //4
            {"wisdom", "socrates", "the", "only", "thing", "i", "know", "is", "that", "nothing"},
            //5
            {"wisdom", "cicero", "if", "you", "have", "a", "garden", "and", "library", "everything", "need"},
            //6
            {"wisdom", "ralph", "waldo", "emerson", "adopt", "the", "pace", "of", "nature", "her", "secret", "is", "patience"},
            //7
            {"wisdom", "socrates", "employ", "your", "time", "in", "improving", "yourself", "by", "other", "men’s", "writings", "so", "that", "you", "shall", "gain", "easily", "what", "others", "have", "labored", "hard", "for"},
            //8
            {"wisdom", "alexis", "carrel", "man", "cannot", "remake", "himself", "without", "suffering", "for", "he", "is", "both", "the", "marble", "and", "sculptor"},
            //9
            {"wisdom", "daniel", "j", "boorstin", "the", "greatest", "obstacle", "to", "discovery", "is", "not", "ignorance", "it", "illusion", "of", "knowledge"},
            //10
            {"wisdom", "chuck", "palahniuk", "life", "is", "short", "death", "forever"},
            //11
            {"wisdom", "saint", "basil", "a", "tree", "is", "known", "by", "its", "fruit", "man", "his", "deeds", "good", "deed", "never", "lost", "he", "who", "sows", "courtesy", "reaps", "friendship", "and", "plants", "kindness", "gathers", "love"},
            //12
            {"wisdom", "shannon", "l", "alder", "one", "of", "the", "greatest", "regrets", "in", "life", "is", "being", "what", "others", "would", "want", "you", "to", "be", "rather", "than", "yourself"},
            //13
            {"wisdom", "soren", "kierkegaard", "life", "is", "not", "a", "problem", "to", "be", "solved", "but", "reality", "experienced"},
            //14
            {"wisdom", "buddha", "maturity", "is", "learning", "to", "walk", "away", "from", "people", "and", "situation", "that", "threaten", "your", "peace", "of", "mind", "selfrespect", "values", "morals", "selfworth"},
            //15
            {"wisdom", "booker", "t", "wasington", "few", "things", "can", "help", "an", "individual", "more", "than", "to", "place", "responsibility", "on", "him", "and", "let", "know", "that", "you", "trust"},
            //16
            {"wisdom", "arthur", "schopenhauer", "talent", "hits", "the", "target", "no", "one", "else", "can", "hit", "genius", "see"},
            //17
            {"wisdom", "karl", "marx", "the", "philosophers", "have", "only", "interpreted", "world", "in", "various", "ways", "point", "however", "is", "to", "change", "it"},
            //18
            {"wisdom", "baruch", "de", "spinoza", "if", "men", "were", "born", "free", "they", "would", "so", "long", "as", "remained", "form", "no", "conception", "of", "good", "and", "evil"},
            //19
            {"wisdom", "martin", "heidegger", "he", "who", "thinks", "great", "thoughts", "often", "makes", "errors"},
            //20
            {"wisdom", "seneca", "we", "are", "more", "often", "frightened", "than", "hurt", "and", "suffer", "in", "imagination", "reality"},
            //21
            {"wisdom", "h", "jackson", "brown", "jr", "seek", "opportunity", "not", "security", "a", "boat", "in", "harbour", "is", "safe", "but", "time", "its", "bottom", "will", "rot", "out"},
            //22
            {"wisdom", "chinese", "proverb", "he", "who", "asks", "a", "question", "is", "fool", "for", "5", "minutes", "does", "not", "ask", "remains", "forever"},
            //23
            {"wisdom", "stop", "planting", "flowers", "in", "peoples’", "yards", "who", "aren’t", "going", "to", "water", "them"},
            //24
            {"wisdom", "socrates", "let", "him", "that", "would", "move", "the", "world", "first", "himself"},
            //25
            {"wisdom", "voltaire", "if", "god", "did", "not", "exist", "it", "would", "be", "necessary", "to", "invent", "him"},
            //26
            {"wisdom", "confucius", "if", "you", "hate", "a", "person", "then", "you’re", "defeated", "by", "them"},
            //27
            {"wisdom", "david", "hume", "the", "heart", "of", "a", "man", "is", "made", "to", "reconcile", "most", "glaring", "contradictions"},
            //28
            {"wisdom", "oliver", "wendell", "holmes", "sr", "the", "young", "man", "knows", "rules", "but", "old", "exceptions"},
            //29
            {"wisdom", "reinhold", "niebuhr", "god", "grant", "me", "the", "serenity", "to", "accept", "things", "i", "cannot", "change", "courage", "can", "and", "know", "difference"},
            //30
            {"wisdom", "william", "of", "ockham", "entities", "should", "not", "be", "multiplied", "unnecessarily"},
            //31
            {"wisdom", "immanuel", "kant", "morality", "is", "not", "the", "doctrine", "of", "how", "we", "may", "make", "ourselves", "happy", "but", "worthy", "happiness"},
            //32
            {"wisdom", "don’t", "raise", "your", "voice", "improve", "argument"},
            //33
            {"wisdom", "eleanor", "roosevelt", "learn", "from", "the", "mistakes", "of", "others", "you", "can’t", "live", "long", "enough", "to", "make", "them", "all", "yourself"},
            //34
            {"wisdom", "aleksandr", "solzhenitsyn", "the", "line", "dividing", "good", "and", "evil", "cuts", "through", "heart", "of", "every", "human", "being", "who", "is", "willing", "to", "destroy", "a", "piece", "his", "own"},
            //35
            {"wisdom", "italian", "proverb", "after", "the", "game", "king", "and", "pawn", "go", "into", "same", "box"},
            //36
            {"wisdom", "thomas", "jefferson", "honesty", "is", "the", "first", "chapter", "in", "book", "of"},
            //37
            {"wisdom", "lorde", "two", "things", "to", "remember", "in", "life", "1", "take", "care", "of", "your", "thoughts", "when", "you’re", "alone", "2", "words", "with", "people"},
            //38
            {"wisdom", "rené", "rene", "descartes", "if", "you", "would", "be", "a", "real", "seeker", "after", "truth", "it", "is", "necessary", "that", "at", "least", "once", "in", "your", "life", "doubt", "as", "far", "possible", "all", "things"},
            //39
            {"wisdom", "the", "eyes", "are", "useless", "when", "mind", "is", "blind"},
            //40
            {"wisdom", "portagoras", "man", "is", "the", "measure", "of", "all", "things"},
            //41
            {"wisdom", "george", "santanaya", "the", "wisest", "mind", "has", "something", "yet", "to", "learn"},
            //42
            {"wisdom", "c", "carl", "g", "gustav", "jung", "thinking", "is", "difficult", "that’s", "why", "most", "people", "judge"},
            //43
            {"wisdom", "pythagoras", "time", "is", "the", "soul", "of", "this", "world"},
            //44
            {"wisdom", "socrates", "the", "unexamined", "life", "is", "not", "worth", "living"},
            //45
            {"wisdom", "ernest", "holmes", "life", "is", "a", "mirror", "and", "will", "reflect", "back", "to", "the", "thinker", "what", "he", "thinks", "into", "it"},
            //46
            {"wisdom", "friedrich", "nietzsche", "god", "is", "dead", "he", "remains", "and", "we", "have", "killed", "him"},
            //47
            {"wisdom", "c", "carl", "g", "gustav", "jung", "until", "you", "make", "the", "unconscious", "conscious", "it", "will", "direct", "your", "life", "and", "call", "fate"},
            //48
            {"wisdom", "abraham", "lincoln", "give", "me", "six", "hours", "to", "chop", "down", "a", "tree", "and", "i", "will", "spend", "the", "first", "four", "sharpening", "axe"},
            //49
            {"wisdom", "aristotle", "we", "are", "what", "repeatedly", "do", "excellence", "then", "is", "not", "an", "act", "but", "a", "habit"},
            //50
            {"wisdom", "eleanor", "roosevelt", "great", "minds", "discuss", "ideas", "average", "events", "small", "people"},
            //51
            {"wisdom", "marcus", "aurelius", "accept", "whatever", "comes", "to", "you", "woven", "in", "the", "pattern", "of", "your", "destiny", "for", "what", "could", "more", "aptly", "fit", "needs"},
            //52
            {"wisdom", "confucius", "life", "is", "really", "simple", "but", "we", "insist", "on", "making", "it", "complicated"},
            //53
            {"wisdom", "friedrich", "nietzsche", "there", "are", "no", "facts", "only", "interpretations"},
            //54
            {"wisdom", "socrates", "there", "is", "only", "one", "good", "knowledge", "and", "evil", "ignorance"},
            //55
            {"wisdom", "david", "s", "starr", "jordan", "is", "knowing", "what", "to", "do", "next", "virtue", "doing", "it"},
            //56
            {"wisdom", "c", "carl", "g", "gustav", "jung", "the", "meeting", "of", "two", "personalities", "is", "like", "contact", "chemical", "substances", "if", "there", "any", "reaction", "both", "are", "transformed"},
            //57
            {"wisdom", "marcus", "aurelius", "death", "smiles", "at", "us", "all", "but", "a", "man", "can", "do", "is", "smile", "back"},
            //58
            {"wisdom", "aldous", "huxley", "experience", "is", "not", "what", "happens", "to", "you", "it’s", "do", "with"},
            //59
            {"wisdom", "seneca", "the", "greatest", "blessings", "of", "mankind", "are", "within", "us", "and", "our", "reach", "a", "wise", "man", "is", "content", "with", "his", "lot", "whatever", "it", "may", "be", "without", "wishing", "for", "what", "he", "has", "not"},
            //60
            {"wisdom", "seneca", "for", "many", "men", "the", "acquisition", "of", "wealth", "does", "not", "end", "their", "troubles", "it", "only", "changes", "them"},
            //61
            {"wisdom", "norman", "cousins", "death", "is", "not", "the", "greatest", "loss", "in", "life", "what", "dies", "inside", "us", "while", "we", "live"},
            //62
            {"wisdom", "josiah", "gilbert", "holland", "there", "is", "no", "royal", "road", "to", "anything", "one", "thing", "at", "a", "time", "all", "things", "in", "succession", "that", "which", "grows", "fast", "withers", "as", "rapidly", "slowly", "endures"},
            //63
            {"wisdom", "jeanjacques", "rousseau", "man", "is", "born", "free", "but", "everywhere", "in", "chains"},
            //64
            {"wisdom", "charles", "dickens", "reflect", "upon", "your", "present", "blessings", "of", "which", "every", "man", "has", "many", "not", "on", "past", "misfortunes", "all", "men", "have", "some"},
            //65
            {"wisdom", "henry", "d", "david", "thoreau", "it’s", "not", "what", "you", "look", "at", "that", "matters", "see"},
            //66
            {"wisdom", "william", "shakespeare", "speak", "less", "than", "you", "know", "have", "more", "show"},
            //67
            {"wisdom", "aristotle", "happiness", "is", "the", "meaning", "and", "purpose", "of", "life", "whole", "aim", "end", "human", "existence"},
            //68
            {"wisdom", "karl", "marx", "religion", "is", "the", "sign", "of", "oppressed", "it", "opium", "people"},
            //69
            {"wisdom", "terry", "terry", "crews", "everybody", "says", "they’re", "trying", "to", "get", "their", "piece", "of", "the", "pie", "they", "don’t", "realize", "that", "world", "is", "a", "kitchen", "you", "can", "make", "your", "own"},
            //70
            {"wisdom", "soren", "kierkegaard", "the", "function", "of", "prayer", "is", "not", "to", "influence", "god", "but", "rather", "change", "nature", "one", "who", "prays"},
            //71
            {"wisdom", "buddha", "to", "enjoy", "good", "health", "bring", "true", "happiness", "one’s", "family", "peace", "all", "one", "must", "first", "discipline", "and", "control", "own", "mind", "if", "a", "man", "can", "his", "he", "find", "the", "way", "enlightenment", "virtue", "will", "naturally", "come", "him"},
            //72
            {"wisdom", "robert", "lloyd", "slow", "and", "steady", "wins", "the", "race"},
            //73
            {"wisdom", "marcus", "aurelius", "the", "best", "revenge", "is", "not", "to", "be", "like", "your", "enemy"},
            //74
            {"wisdom", "anton", "chekhov", "knowledge", "is", "of", "no", "value", "unless", "you", "put", "it", "into", "practice"},
            //75
            {"wisdom", "steve", "maraboli", "plant", "seeds", "of", "happiness", "hope", "success", "and", "love", "it", "will", "all", "come", "back", "to", "you", "in", "abundance", "this", "is", "the", "law", "nature"},
            //76
            {"wisdom", "sidonie", "g", "gabrielle", "colette", "be", "happy", "it’s", "one", "way", "of", "being", "wise"},
            //77
            {"wisdom", "baruch", "de", "spinoza", "i", "can", "control", "my", "passions", "and", "emotions", "if", "understand", "their", "nature"},
            //78
            {"wisdom", "socrates", "the", "secret", "of", "happiness", "you", "see", "is", "not", "found", "in", "seeking", "more", "but", "developing", "capacity", "to", "enjoy", "less"},
            //79
            {"wisdom", "john", "wooden", "don’t", "let", "what", "you", "cannot", "do", "interfere", "with", "can"},
            //80
            {"wisdom", "ludwig", "wittgenstein", "whereof", "one", "cannot", "speak", "thereof", "must", "be", "silent"},
            //81
            {"wisdom", "bertrand", "russell", "i", "would", "never", "die", "for", "my", "beliefs", "because", "might", "be", "wrong"},
            //82
            {"wisdom", "ralph", "w", "waldo", "emerson", "people", "only", "see", "what", "they", "are", "prepared", "to"},
            //83
            {"wisdom", "bill", "gates", "success", "is", "a", "lousy", "teacher", "it", "seduces", "smart", "people", "into", "thinking", "they", "can’t", "lose"},
            //84
            {"wisdom", "soren", "kierkegaard", "life", "must", "be", "understood", "backward", "but", "it", "lived", "forward"},
            //85
            {"wisdom", "francis", "bacon", "hope", "is", "a", "good", "breakfast", "but", "bad", "supper"},
            //86
            {"wisdom", "jillian", "michaels", "a", "bad", "day", "for", "your", "ego", "is", "great", "soul"},
            //87
            {"wisdom", "albert", "camus", "there", "is", "but", "one", "truly", "serious", "philosophical", "problem", "and", "that", "suicide"},
            //88
            {"wisdom", "don", "shula", "the", "superior", "man", "blames", "himself", "inferior", "others"},
            //89
            {"wisdom", "henry", "ford", "chop", "your", "own", "wood", "and", "it", "will", "warm", "you", "twice"},
            //90
            {"wisdom", "aristotle", "happiness", "is", "the", "highest", "good"},
            //91
            {"wisdom", "rumi", "yesterday", "i", "was", "clever", "so", "wanted", "to", "change", "the", "world", "today", "am", "wise", "changing", "myself"},
            //92
            {"wisdom", "be", "who", "you", "needed", "when", "were", "young"},
            //93
            {"wisdom", "joyce", "meyer", "if", "you", "don’t", "learn", "to", "control", "your", "thoughts", "will", "never", "how", "behaviour"},
            //94
            {"wisdom", "jeremy", "bentham", "the", "greatest", "happiness", "of", "number", "is", "foundation", "morals", "and", "legislation"},
            //95
            {"wisdom", "bohdi", "sanders", "never", "respond", "to", "an", "angry", "person", "with", "a", "fiery", "comeback", "even", "if", "he", "deserves", "it", "don’t", "allow", "his", "anger", "become", "your"},
            //96
            {"wisdom", "socrates", "contentment", "is", "natural", "wealth", "luxury", "artificial", "poverty"},
            //97
            {"wisdom", "epictetus", "freedom", "is", "secured", "not", "by", "the", "fulfilling", "of", "one’s", "desires", "but", "removal", "desire"},
            //98
            {"wisdom", "plutarch", "know", "how", "to", "listen", "and", "you", "will", "profit", "even", "from", "those", "who", "talk", "badly"},
            //99
            {"wisdom", "winston", "churchill", "courage", "is", "the", "first", "of", "human", "qualities", "because", "it", "quality", "which", "guarantees", "all", "others"},
            //100
            {"wisdom", "mirrors", "show", "us", "what", "we", "look", "like", "not", "are"},
            //101
            {"wisdom", "japanese", "proverb", "the", "bamboo", "that", "bends", "is", "stronger", "than", "oak", "resists"},
            //102
            {"wisdom", "aristotle", "we", "are", "what", "repeatedly", "do", "excellence", "then", "is", "not", "an", "act", "but", "a", "habit"},
            //103
            {"wisdom", "thomas", "hobbes", "leisure", "is", "the", "mother", "of", "philosophy"},
            //104
            {"wisdom", "bertrand", "russell", "this", "is", "patently", "absurd", "but", "whoever", "wishes", "to", "become", "a", "philosopher", "must", "learn", "not", "be", "frightened", "by", "absurdities"},
            //105
            {"wisdom", "hillary", "clinton", "take", "criticism", "seriously", "but", "not", "personally", "if", "there", "is", "truth", "or", "merit", "in", "the", "try", "to", "learn", "from", "it", "otherwise", "let", "roll", "right", "off", "you"},
            //106
            {"wisdom", "plato", "that", "man", "is", "wisest", "who", "like", "socrates", "realizes", "his", "worthless"},
            //107
            {"wisdom", "dalai", "lama", "when", "you", "talk", "are", "only", "repeating", "what", "know", "but", "if", "listen", "may", "learn", "something", "new"},
            //108
            {"wisdom", "iris", "murdoch", "our", "actions", "are", "like", "ships", "which", "we", "may", "watch", "set", "out", "to", "sea", "and", "not", "know", "when", "or", "with", "what", "cargo", "they", "will", "return", "port"},
            //109
            {"wisdom", "marcus", "t", "tullius", "cicero", "whatever", "you", "do", "with", "all", "your", "might"},
            //110
            {"wisdom", "c", "carl", "g", "gustav", "jung", "your", "visions", "will", "become", "clear", "only", "when", "you", "can", "look", "into", "own", "heart", "who", "looks", "outside", "dreams", "inside", "awakens"},
            //111
            {"wisdom", "nelson", "mandela", "if", "you", "talk", "to", "a", "man", "in", "language", "he", "understands", "that", "goes", "his", "head", "him", "heart"},
            //112
            {"wisdom", "aldous", "huxley", "most", "human", "beings", "have", "an", "almost", "infinite", "capacity", "for", "taking", "things", "granted"},
            //113
            {"wisdom", "rené", "rene", "descartes", "i", "think", "therefore", "am", "cogito", "ergo", "sum"},
            //114
            {"wisdom", "walter", "lippmann", "it", "requires", "to", "understand", "the", "music", "is", "nothing", "if", "audience", "deaf"},
            //115
            {"wisdom", "baruch", "de", "spinoza", "i", "have", "taken", "great", "care", "not", "to", "laugh", "at", "human", "actions", "weep", "them", "nor", "hate", "but", "understand"},
            //116
            {"wisdom", "seneca", "it", "is", "not", "because", "things", "are", "difficult", "that", "we", "do", "dare"},
            //117
            {"wisdom", "haruki", "murakami", "pain", "is", "inevitable", "suffering", "optional"},
            //118
            {"wisdom", "mark", "twain", "it", "is", "better", "to", "remain", "silent", "and", "be", "thought", "a", "fool", "than", "open", "one’s", "mouth", "remove", "all", "doubt"},
            //119
            {"wisdom", "miyamoto", "musashi", "truth", "is", "not", "what", "you", "want", "it", "to", "be", "and", "must", "bend", "its", "power", "or", "live", "a", "lie"},
            //120
            {"wisdom", "bertrand", "russell", "the", "whole", "problem", "with", "world", "is", "that", "fools", "and", "fanatics", "are", "always", "so", "certain", "of", "themselves", "wiser", "people", "full", "doubts"},
            //121
            {"wisdom", "jim", "watkins", "a", "river", "cuts", "through", "rock", "not", "because", "of", "its", "power", "but", "persistence"},
            //122
            {"wisdom", "sigmund", "freud", "being", "entirely", "honest", "with", "oneself", "is", "a", "good", "exercise"},
            //123
            {"wisdom", "plato", "wise", "men", "speak", "because", "they", "have", "something", "to", "say", "fools"},
            //124
            {"wisdom", "confucius", "by", "three", "methods", "we", "may", "learn", "first", "reflection", "which", "is", "noblest", "second", "imitation", "easiest", "and", "third", "experience", "the", "bitterest"},
            //125
            {"wisdom", "confucius", "the", "superior", "man", "thinks", "always", "of", "virtue", "common", "comfort"},
            //126
            {"wisdom", "bruce", "lee", "a", "wise", "man", "can", "learn", "more", "from", "foolish", "question", "than", "fool", "answer"},
            //127
            {"wisdom", "john", "c", "maxwell", "bigpicture", "thinkers", "are", "comfortable", "with", "ambiguity", "they", "don't", "try", "to", "force", "every", "observation", "or", "piece", "of", "data", "into", "preformulated", "mental", "cubby", "holes"},
            //128
            {"wisdom", "albert", "einstein", "a", "clever", "person", "solves", "problem", "wise", "avoids", "it"},
            //129
            {"wisdom", "rick", "warren", "you've", "heard", "that", "it's", "wise", "to", "learn", "from", "experience", "but", "it", "is", "wiser", "the", "of", "others"},
            //130
            {"wisdom", "jewish", "proverb", "do", "not", "be", "wise", "in", "words", "deeds"},
            //131
            {"wisdom", "confucius", "he", "who", "knows", "all", "the", "answers", "has", "not", "been", "asked", "questions"},
            //132
            {"wisdom", "confucius", "imagination", "is", "more", "important", "than", "knowledge"},
            //133
            {"wisdom", "confucius", "the", "essence", "of", "knowledge", "is", "having", "it", "to", "use"},
            //134
            {"wisdom", "confucius", "do", "not", "impose", "on", "others", "what", "you", "yourself", "desire"},
            //135
            {"wisdom", "marcus", "aurelius", "to", "do", "harm", "is", "yourself", "an", "injustice", "it", "degrades", "you"},
            //136
            {"wisdom", "plato", "how", "can", "you", "prove", "whether", "at", "this", "moment", "we", "are", "sleeping", "and", "all", "our", "thoughts", "a", "dream", "or", "awake", "talking", "to", "one", "another", "in", "the", "waking", "state"},
            //137
            {"wisdom", "joyce", "meyer", "just", "because", "we", "feel", "a", "certain", "way", "doesn't", "make", "that", "feeling", "fact", "it", "only", "means", "must", "learn", "to", "press", "past", "our", "feelings"},
            //138
            {"wisdom", "plato", "excellence", "is", "not", "a", "gift", "but", "skill", "that", "takes", "practice", "we", "do", "act", "‘rightly’", "because", "are", "‘excellent’", "in", "fact", "achieve", "‘excellence’", "by", "acting"},
            //139
            {"wisdom", "plato", "good", "people", "do", "not", "need", "laws", "to", "tell", "them", "act", "responsibly", "while", "bad", "will", "find", "a", "way", "around", "the"},
            //140
            {"wisdom", "marcus", "aurelius", "if", "it’s", "not", "right", "don’t", "do", "it", "true", "say"},
            //141
            {"wisdom", "confucius", "when", "anger", "rises", "think", "of", "the", "consequences"},
            //142
            {"wisdom", "ken", "blenchard", "none", "of", "us", "is", "as", "smart", "all"}
    };

    public static String getWisdomQuote(int position) {
        return quotesWisdom[position];
    }

    public static String getWisdomAuthor(int position) {
        return quotesWisdomAuthors[position];
    }

    public static String[] getWisdomList() {
        return quotesWisdom;
    }

    static String[][] getWisdomTags() {
        return wisdomTags;
    }

    public static int getWisdomListSize() {
        return quotesWisdom.length;
    }
}
