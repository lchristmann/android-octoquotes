package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Attitude {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesAttitude and quotesAttitudeAuthors
        int listSize = getAttitudeListSize();
        for (int i = 0; i < listSize; i++) {
            //one randomIndexToSwap for both related lists, so quote and author stay matching (at same position)
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            //temporary saved Strings, so those don't get lost
            tempQuote = quotesAttitude[randomIndexToSwap];
            tempAuthor = quotesAttitudeAuthors[randomIndexToSwap];
            tempTags = attitudeTags[randomIndexToSwap];
            //replace Strings at the randomIndex with the String at the loop variable
            quotesAttitude[randomIndexToSwap] = quotesAttitude[i];
            quotesAttitudeAuthors[randomIndexToSwap] = quotesAttitudeAuthors[i];
            attitudeTags[randomIndexToSwap] = attitudeTags[i];
            //replace Strings at the loop variable with the String who had been at the randomPosition (saved in temp variables)
            quotesAttitude[i] = tempQuote;
            quotesAttitudeAuthors[i] = tempAuthor;
            attitudeTags[i] = tempTags;
        }
    }

    private static String[] quotesAttitude = {
            //0
            "\"Be who you are and say what you feel, because those who mind don’t matter and those who matter don’t mind.\"",
            //1
            "\"Attitudes are nothing more than habits of thought.\"",
            //2
            "\"Gratitude builds a bridge to abundance.\"",
            //3
            "\"In the depth of winter I finally learned that there was in me an invincible summer.\"",
            //4
            "\"Attitude is more important than the past, than education, than money, than circumstances, than what people do or say. It is more important than appearance, giftedness, or skill.\"",
            //5
            "\"If you do not change direction, you may end up where you are heading.\"",
            //6
            "\"The meaning of things lies not in the things themselves, but in our attitude towards them.\"",
            //7
            "\"Life is 10% what happens to me and 90% of how I react to it.\"",
            //8
            "\"Low self-esteem is like driving through life with your hand-break on.\"",
            //9
            "\"To err is human; to admit it, superhuman.\"",
            //10
            "\"You cannot tailor-make the situations in life but you can tailor-make the attitudes to fit those situations.\"",
            //11
            "\"Keep your face to the sunshine and you cannot see a shadow.\"",
            //12
            "\"The quickest way to change your attitude toward pain is to accept the fact that everything that happens to us has been designed for our spiritual growth.\"",
            //13
            "\"Crawling is acceptable. Falling is acceptable. Crying is acceptable. Blood is acceptable. Pain is acceptable, quitting is not.\"",
            //14
            "\"It is far better to be alone, than to be in bad company.\"",
            //15
            "\"I have the power to create my future.\"",
            //16
            "\"A man sees in the world what he carries in his heart.\"",
            //17
            "\"A positive mind finds a way it can be done; a negative mind looks for all the ways it can’t be done.\"",
            //18
            "\"The most important decision you make is to be in a good mood.\"",
            //19
            "\"Things turn out best for the people who make the best of the way things turn out.\"",
            //20
            "\"Even the darkest night will end and the sun will rise.\"",
            //21
            "\"I’m a great believer in luck and I find the harder I work, the more I have of it.\"",
            //22
            "\"Resolve that whatever you do, you will bring the whole man to it; that you will fling the whole weight of your being into it.\"",
            //23
            "\"If opportunity doesn’t knock, build a door.\"",
            //24
            "\"No one can make you feel inferior without your consent.\"",
            //25
            "\"I am not what happened to me, I am what I choose to become.\"",
            //26
            "\"Strength and growth come only through continuous effort and struggle.\"",
            //27
            "\"People who say it cannot be done should not interrupt those who are doing it.\"",
            //28
            "\"The most effective attitude to adopt is one of supreme acceptance.\"",
            //29
            "\"You really can change the world if you care enough.\"",
            //30
            "\"No pain, no palm; no thorns, no throne; no gall, no glory; no cross, no crown.\"",
            //31
            "\"It is better to light a candle than curse the darkness.\"",
            //32
            "\"Challenges are what make life interesting and overcoming them is what makes life meaningful.\"",
            //33
            "\"The ideal man bears the accidents of life with dignity and grace, making the best of circumstances.\"",
            //34
            "\"Attitude is a little thing that makes a big difference.\"",
            //35
            "\"You must be the change you want to see in the world.\"",
            //36
            "\"We cannot live better than in seeking to become better.\"",
            //37
            "\"Your attitude, not your aptitude, will determine your altitude.\"",
            //38
            "\"Attitudes are a secret power working twenty-four hours a day, for good or bad. It is of paramount importance that we know how to harness and control this great force.\"",
            //39
            "\"When you can’t change the direction of the wind – adjust your sails.\"",
            //40
            "\"Ability is what you’re capable of doing. Motivation determines what you do. Attitude determines how well you do it.\"",
            //41
            "\"Attitude will always define who we are in life.\"",
            //42
            "\"Happiness is a conscious choice, not an automatic response.\"",
            //43
            "\"The world belongs to those who set out to conquer it armed with self-confidence and good humour.\"",
            //44
            "\"Never whine, never complain, never try to justify yourself.\"",
            //45
            "\"If you think you can, you can. And if you think you can’t, you’re right.\"",
            //46
            "\"Knowledge will give you power, but character respect.\"",
            //47
            "\"Whatever happens, take responsibility.\"",
            //48
            "\"Weakness of attitude becomes weakness of character.\"",
            //49
            "\"The weak make others feel inferior. The strong make others feel equal.\"",
            //50
            "\"Men do not attract that which they want, but that which they are.\"",
            //51
            "\"I have learned over the years that when one’s mind is made up, this diminishes fear.\"",
            //52
            "\"To have striven, to have made the effort, to have been true to certain ideals – this alone is worth the struggle.\"",
            //53
            "\"You cannot dream yourself into a character; you must hammer and forge yourself one.\"",
            //54
            "\"Only you can control your future.\"",
            //55
            "\"Plenty of people miss their share of happiness, not because they never found it, but because they didn’t stop to enjoy it.\"",
            //56
            "\"The best way out is always through.\"",
            //57
            "\"Only put off until tomorrow what you are willing to die having left undone.\"",
            //58
            "\"It’s been my experience that you can nearly always enjoy things if you make up your mind firmly that you will.\"",
            //59
            "\"When everything seems to be going against you, remember that the airplane takes off against the wind, not with it.\"",
            //60
            "\"One resolution I have made, and try always to keep, is this: to rise above little things.\"",
            //61
            "\"Responsibility is the great developer of men.\"",
            //62
            "\"Do every act of your life as if it were your last.\"",
            //63
            "\"Don’t waste your time in anger, regrets, worries, and grudges. Life is too short to be unhappy.\"",
            //64
            "\"It is better to disappoint people with the truth  than to appease them with a lie.\"",
            //65
            "\"Happiness is the default state. It’s what’s there when you remove the sense that something is missing in life.\"",
            //66
            "\"You take your life in your own hands, and what happens? A terrible thing, no one to blame.\"",
            //67
            "\"You will never do anything in this world without courage. It is the greatest quality of the mind next to honor.\"",
            //68
            "\"The same boiling water that softens the potato hardens the egg. It’s what you’re made of. Not the circumstances.\"",
            //69
            "\"I don’t like that man. I must get to know him better.\"",
            //70
            "\"Life isn’t about finding yourself. Life is about creating yourself.\"",
            //71
            "\"When you’re backed against the wall, break the goddamn thing down.\"",
            //72
            "\"Expect problems and eat them for breakfast.\"",
            //73
            "\"There is nothing either good or bad but thinking makes it so.\"",
            //74
            "\"No one will hit you harder than life itself. It doesn’t matter how hard you hit back. It’s about how much you can take, and keep fighting, how much you can suffer and keep moving forward. That’s how you win.\"",
            //75
            "\"It is always easier to fight for one’s principles than to live up to them.\"",
            //76
            "\"You can only work on yourself. Start there.\"",
            //77
            "\"Your living is determined not so much by what life brings to you as by the attitude you bring to life; not so much by what happens to you as by the way your mind looks at what happens.\"",
            //78
            "\"Action springs not from thought, but from a readiness for responsibility.\"",
            //79
            "\"If you are going to achieve excellence in big things, you develop the habit in little matters. Excellence is not an exception, it is a prevailing attitude.\"",
            //80
            "\"People who wonder if the glass is half empty or full miss the point. The glass is refillable.\"",
            //81
            "\"Sooner or later, those who win are those who think they can.\"",
            //82
            "\"You cannot have a positive life and a negative mind.\"",
            //83
            "\"If you don’t like something, change it. If you can’t change it, change your attitude.\"",
            //84
            "\"Everything can be taken from a man but one thing: the last of the human freedoms – to choose one’s attitude in any given set of circumstances, to choose one’s own way.\"",
            //85
            "\"Excellence is not a skill. It is an attitude.\"",
            //86
            "\"What they call you is one thing. What you answer to is something else.\"",
            //87
            "\"Those who can laugh without cause have either found the true meaning of happiness or have gone stark raving mad.\"",
            //88
            "\"A discriminating irreverence is the creator and protector of human liberty.\"",
            //89
            "\"What helps you preserve is your resilience and commitment.\"",
            //90
            "\"We lost because we told ourselves we lost.\"",
            //91
            "\"Lighten up on yourself. No one is perfect. Gently accept your humanness.\"",
            //92
            "\"The greatest discovery of all time is that a person can change his future by merely changing his attitude.\"",
            //93
            "\"A warrior must only take care that his spirit is never broken.\"",
            //94
            "\"How you do anything is how you do everything.\"",
            //95
            "\"A pessimist is one who makes difficulties of his opportunities and an optimist is one who makes opportunities of his difficulties.\"",
            //96
            "\"Positive thinking can be contagious. Being surrounded by winners helps you develop into a winner.\"",
            //97
            "\"What others think of me is none of my business.\"",
            //98
            "\"Always bear in mind that your own resolution to succeed is more important than any other one thing.\"",
            //99
            "\"The greatest revolution of our generation is the discovery that human beings, by changing the inner attitudes of their minds, can change the outer aspects of their lives.\"",
            //100
            "\"To put the world right in order, we must first put the nation in order; to put the nation in order, we must first put the family in order; to put the family in order, we must first cultivate our personal life; we must first set our hearts right.\"",
            //101
            "\"A million likes will never be enough if you don’t like yourself.\"",
            //102
            "\"Take the attitude of a student, never be too big to ask questions, never know too much to learn something new.\"",
            //103
            "\"Your problem isn’t the problem, it’s your attitude about the problem.\"",
            //104
            "\"Care about what other people think and you will always be their prisoner.\"",
            //105
            "\"Action is character.\"",
            //106
            "\"If you believe it’ll work out, you’ll see opportunities. If you don’t believe it’ll work out, you’ll see obstacles.\"",
            //107
            "\"Ups and downs. Victories and defeats. Sadness and happiness. That’s the best kind of life.\"",
            //108
            "\"Our greatest glory is not in never falling, but in rising every time we fall.\"",
            //109
            "\"Happiness in this world, when it comes, comes incidentally. Make it the object of pursuit, and it leads us a wild-goose chase, and is never attained.\"",
            //110
            "\"We can complain because rose bushes have thorns, or rejoice because thorn bushes have roses.\"",
            //111
            "\"Live boldly. Push yourself. Don’t settle.\"",
            //112
            "\"There’s only one corner of the universe you can be certain of improving, and that’s your own self.\"",
            //113
            "\"Good character is not formed in a week or a month. It is created little by little, day by day. Protracted and patient effort is needed.\"",
            //114
            "\"Don’t be pushed around by the fears in your mind. Be led by the dreams in your heart.\"",
            //115
            "\"Pessimism never won any battle.\"",
            //116
            "\"I am not a product of my circumstances. I am a product of my decisions.\"",
            //117
            "\"You become what you think about.\"",
            //118
            "\"Believe in yourself and you’ll be able to achieve anything you want in life.\"",
            //119
            "\"Great losses are great lessons.\"",
            //120
            "\"We are all in the gutter, but some of us are looking at the stars.\"",
            //121
            "\"Don’t take life too seriously. You’ll never get out of it alive.\"",
            //122
            "\"It’s not what happens to you, but how you react to it that matters.\"",
            //123
            "\"When you take control of your attitude, you take control of your life.\"",
            //124
            "\"Two things define you: your patience when you have nothing and your attitude when you have everything.\"",
            //125
            "\"Having a positive mental attitude is asking how something can be done rather than saying it can’t be done.\"",
            //126
            "\"If you own this story you get to write the ending.\"",
            //127
            "\"Keep your values positive because your values become your destiny.\"",
            //128
            "\"A quick temper will make a fool of you soon enough.\"",
            //129
            "\"I never see what has been done; I only see what remains to be done.\"",
            //130
            "\"A gem cannot be polished without friction, nor a man perfected without trials.\"",
            //131
            "\"The reason we struggle with insecurity is because we compare our behind-the-scenes with everyone else’s highlight reel.\"",
            //132
            "\"I can’t change the direction of the wind, but I can adjust my sails to always reach my destination.\"",
            //133
            "\"Don’t spend your precious time asking ‘Why isn’t the world a better place?’ It will only be time wasted. The question to ask is ‘How can I make it better?’ To that there is an answer.\"",
            //134
            "\"The one who falls and gets up is stronger than the one who never tried. Do not fear failure, but rather fear not trying.\"",
            //135
            "\"And as we let our own light shine, we unconsciously give other people permission to do the same. As we are liberated from our fear, our presence automatically liberates others.\"",
            //136
            "\"Always turn a negative situation into a positive situation.\"",
            //137
            "\"Nothing can stop the man with the right mental attitude from achieving his goal; nothing on earth can help the man with the wrong mental attitude.\"",
            //138
            "\"Which way you choose to see your life in the future depends on your attitude today.\"",
            //139
            "\"There are two things a person should never be angry at, what they can help, and what they cannot.\"",
            //140
            "\"Don’t complain about the snow on your neighbour’s roof when your own doorstep is unclean.\"",
            //141
            "\"Absorb what is useful, reject what is useless, add what is specifically your own.\"",
            //142
            "\"We never have more than we can bear. The present hour we are always able to endure.\"",
            //143
            "\"You cannot do epic things with an average attitude.\"",
            //144
            "\"It’s nice to be important, but it’s much more important to be nice.\"",
            //145
            "\"Optimism is a happiness magnet. If you stay positive, good thing and good people will be drawn to you.\"",
            //146
            "\"If you don’t like where you are, move… you are not a tree.\"",
            //147
            "\"Your attitude is like a price tag, it shows how valuable you are.\"",
            //148
            "\"Call me whatever you like; I am who I must be.\"",
            //149
            "\"I am who I am. Your approval isn’t needed.\"",
            //150
            "\"I’m not shy, I’m just really good at figuring out who’s worth talking to.\"",
            //151
            "\"Worry not that no one knows you; seek to be worth knowing.\"",
            //152
            "\"No matter how bad the economy of the jungle, a lion will never eat grass.\"",
            //153
            "\"Your vibe attracts your tribe.\"",
            //154
            "\"It’s so important to have manners and treat people from all walks of life the way they should be treated.\"",
            //155
            "\"Don’t be the girl who needs a man. Be the girl a man needs.\"",
            //156
            "\"Adventure isn’t hanging on a rope off the side of a mountain. Adventure is an attitude that we must apply to the day to day obstacles in life.\"",
            //157
            "\"Be so positive that negative people don’t want to be around you.\"",
            //158
            "\"A superior man is modest in his speech, but exceeds in his actions.\"",
            //159
            "\"Attitude is a choice. Happiness is a choice. Optimism is a choice. Kindness is a choice. Giving is a choice. Respect is a choice. Whatever choice you make makes you. Choose wisely.\"",
            //160
            "\"People may hear your words, but they feel your attitude.\"",
            //161
            "\"Lion’s don’t dream of hunting, they just go and hunt.\""
    };
    private static String[] quotesAttitudeAuthors = {
            //0
            "Bernard Baruch",
            //1
            "John C. Maxwell",
            //2
            "Roy T. Bennett",
            //3
            "Albert Camus",
            //4
            "W. C. Fields",
            //5
            "Lao Tzu",
            //6
            "Antoine de Saint-Exupéry",
            //7
            "John C. Maxwell",
            //8
            "Unknown",
            //9
            "Doug Larson",
            //10
            "Zig Ziglar",
            //11
            "Helen Keller",
            //12
            "M. Scott Peck",
            //13
            "Unknown",
            //14
            "George Washington",
            //15
            "Unknown",
            //16
            "Johann Wolfgang von Goethe",
            //17
            "Napoleon Hill",
            //18
            "Voltaire",
            //19
            "John Wooden",
            //20
            "Victor Hugo",
            //21
            "Thomas Jefferson",
            //22
            "Orison Swett Marden",
            //23
            "Milton Berle",
            //24
            "Eleanor Roosevelt",
            //25
            "Carl Jung",
            //26
            "Napoleon Hill",
            //27
            "George Bernard Shaw",
            //28
            "Robert Greene",
            //29
            "Marian Wright Edelman",
            //30
            "William Penn",
            //31
            "Chinese proverb",
            //32
            "Joshua J. Marine",
            //33
            "Aristotle",
            //34
            "Winston Churchill",
            //35
            "Mahatma Gandhi",
            //36
            "Socrates",
            //37
            "Zig Ziglar",
            //38
            "Irving Berlin",
            //39
            "H. Jackson Brown Jr.",
            //40
            "Lou Holtz",
            //41
            "Mark A. Brennan",
            //42
            "Mildred Barthel",
            //43
            "Charles Dickens",
            //44
            "Robert Greene",
            //45
            "Henry Ford",
            //46
            "Bruce Lee",
            //47
            "Tony Robbins",
            //48
            "Albert Einstein",
            //49
            "Maxime Legacé",
            //50
            "James Allen",
            //51
            "Rosa Parks",
            //52
            "William Penn",
            //53
            "James A. Froude",
            //54
            "Dr. Seuss",
            //55
            "William Feather",
            //56
            "Robert Frost",
            //57
            "Pablo Picasso",
            //58
            "L. M. Montgomery",
            //59
            "Henry Ford",
            //60
            "John Burroughs",
            //61
            "Mary Parker Follett",
            //62
            "Marcus Aurelius",
            //63
            "Roy T. Bennett",
            //64
            "Simon Sinek",
            //65
            "Naval Ravikant",
            //66
            "Erica Jong",
            //67
            "Aristotle",
            //68
            "Unknown",
            //69
            "Abraham Lincoln",
            //70
            "George Bernard Shaw",
            //71
            "Harvey Specter (Suits)",
            //72
            "Alfred A. Montapert",
            //73
            "William Shakespeare",
            //74
            "Sylvester Stallone",
            //75
            "Alfred Adler",
            //76
            "Alice O. Howell",
            //77
            "Khalil Gibran",
            //78
            "Dietrich Bonhoeffer",
            //79
            "Colin Powell",
            //80
            "Unknown",
            //81
            "Richard Bach",
            //82
            "Joyce Meyer",
            //83
            "Maya Angelou",
            //84
            "Viktor E. Frankl",
            //85
            "Ralph Marston",
            //86
            "Lucille Clifton",
            //87
            "Norm Papernick",
            //88
            "Mark Twain",
            //89
            "Roy T. Bennett",
            //90
            "Leo Tolstoy",
            //91
            "Deborah Day",
            //92
            "Oprah Winfrey",
            //93
            "Shissai",
            //94
            "Zen Buddhist proverb",
            //95
            "Harry S. Truman",
            //96
            "Arnold Schwarzenegger",
            //97
            "Unknown",
            //98
            "Abraham Lincoln",
            //99
            "William James",
            //100
            "Confucius",
            //101
            "Unknown",
            //102
            "Og Mandino",
            //103
            "Ann Brashares",
            //104
            "Lao Tzu",
            //105
            "F. Scott Fitzgerald",
            //106
            "Wayne Dyer",
            //107
            "Maxime Legacé",
            //108
            "Confucius",
            //109
            "Nathaniel Hawthorne",
            //110
            "Abraham Lincoln",
            //111
            "Jojo Moyes",
            //112
            "Aldous Huxley",
            //113
            "Heraclitus",
            //114
            "Roy T. Bennett",
            //115
            "Dwight D. Eisenhower",
            //116
            "Stephen Covey",
            //117
            "Napoleon Hill",
            //118
            "Unknown",
            //119
            "Amit Kalantri",
            //120
            "Oscar Wilde",
            //121
            "Elbert Hubbard",
            //122
            "Epictetus",
            //123
            "Roy T. Bennett",
            //124
            "George Bernard Shaw",
            //125
            "Robert Foster Bennett",
            //126
            "Brené Brown",
            //127
            "Mahatma Gandhi",
            //128
            "Bruce Lee",
            //129
            "Marie Curie",
            //130
            "Seneca",
            //131
            "Steven Furtick",
            //132
            "Jimmy Dean",
            //133
            "Leo Buscaglia",
            //134
            "Roy T. Bennett",
            //135
            "Marianne Williamson",
            //136
            "Michael Jordan",
            //137
            "Thomas Jefferson",
            //138
            "Amy E. Dean",
            //139
            "Plato",
            //140
            "Confucius",
            //141
            "Bruce Lee",
            //142
            "H. E. Manning",
            //143
            "Unknown",
            //144
            "John Templeton",
            //145
            "Mary Lou Retton",
            //146
            "Jim Rohn",
            //147
            "Unknown",
            //148
            "Friedrich Nietzsche",
            //149
            "Unknown",
            //150
            "Unknown",
            //151
            "Confucius",
            //152
            "Unknown",
            //153
            "Unknown",
            //154
            "David Beckham",
            //155
            "Unknown",
            //156
            "John Amatt",
            //157
            "Unknown",
            //158
            "Confucius",
            //159
            "Roy T. Bennett",
            //160
            "John C. Maxwell",
            //161
            "Unknown"
    };
    private static String[][] attitudeTags = {
            //0
            {"attitude", "bernard", "baruch", "be", "who", "you", "are", "and", "say", "what", "feel", "because", "those", "mind", "don’t", "matter"},
            //1
            {"attitude", "john", "c", "maxwell", "attitudes", "are", "nothing", "more", "than", "habits", "of", "thought"},
            //2
            {"attitude", "roy", "t", "bennett", "gratitude", "builds", "a", "bridge", "to", "abundance"},
            //3
            {"attitude", "albert", "camus", "in", "the", "depth", "of", "winter", "i", "finally", "learned", "that", "there", "was", "me", "an", "invincible", "summer"},
            //4
            {"attitude", "w", "c", "fields","is", "more", "important", "than", "the", "past", "education", "money", "circumstances", "what", "people", "do", "or", "say", "it", "appearance", "giftedness", "skill"},
            //5
            {"attitude", "lao", "tzu", "if", "you", "do", "not", "don't", "change", "direction", "may", "end", "up", "where", "are", "heading"},
            //6
            {"attitude", "antoine", "de", "saintexupéry", "saintexupery", "the", "meaning", "of", "things", "lies", "not", "in", "themselves", "but", "our", "towards", "them"},
            //7
            {"attitude", "john", "c", "maxwell", "life", "is", "10%", "what", "happens", "to", "me", "and", "90%", "of", "how", "I", "react", "it"},
            //8
            {"attitude", "low", "selfesteem", "is", "like", "driving", "through", "life", "with", "your", "hand-break", "on"},
            //9
            {"attitude", "doug", "larson", "to", "err", "is", "human", "admit", "it", "superhuman"},
            //10
            {"attitude", "zig", "ziglar", "you", "cannot", "can't", "tailor-make", "the", "situations", "in", "life", "but", "can", "attitudes", "to", "fit", "those"},
            //11
            {"attitude", "helen", "keller", "keep", "your", "face", "to", "the", "sunshine", "and", "you", "cam't", "cannot", "see", "a", "shadow"},
            //12
            {"attitude", "m", "scott", "peck"," the", "quickest", "way", "to", "change", "your", "toward", "pain", "is", "fact", "that", "everything", "happens", "us", "has", "been", "designed", "for", "our", "spiritual", "growth"},
            //13
            {"attitude", "crawling", "is", "acceptable", "falling", "crying", "blood", "pain", "but", "quitting", "not"},
            //14
            {"attitude", "george", "washington", "it", "is", "far", "better", "to", "be", "alone", "than", "in", "bad", "company"},
            //15
            {"attitude", "i", "have", "the", "power", "to", "create", "my", "future"},
            //16
            {"attitude", "johann", "wolfgang", "von", "goethe", "a", "man", "sees", "in", "the", "world", "what", "he", "carries", "his", "heart"},
            //17
            {"attitude", "napoleon", "hill", "a", "positive", "mind", "finds", "way", "it", "can", "be", "done", "negative", "looks", "for", "all", "the", "ways", "can't"},
            //18
            {"attitude", "voltaire", "the", "most", "important", "decision", "you", "make", "is", "to", "be", "in", "a", "good", "mood"},
            //19
            {"attitude", "john", "wooden", "things", "turn", "out", "best", "for", "the", "people", "who", "make", "of", "way"},
            //20
            {"attitude", "victor", "hugo", "even", "the", "darkest", "night", "will", "end", "and", "sun", "rise"},
            //21
            {"attitude", "thomas", "jefferson", "i'm", "a", "great", "believer", "in", "luck", "and", "i", "find", "the", "harder", "work", "more", "have", "of", "it"},
            //22
            {"attitude", "orison", "s", "swett", "marden", "resolve", "that", "whatever", "you", "do"," will", "bring", "the", "whole", "man", "to", "it", "fling", "weight", "of", "your", "being", "into"},
            //23
            {"attitude", "milton", "berle", "if", "opportunity", "doesn't", "knock", "build", "a", "door"},
            //24
            {"attitude", "eleanor", "roosevelt", "no", "one", "can", "make", "you", "feel", "inferior", "without", "your", "consent"},
            //25
            {"attitude", "carl", "c", "gustav", "g","jung", "i", "am", "not", "what", "happened", "to", "me", "choose", "become"},
            //26
            {"attitude", "napoleon", "hill", "strength", "and", "growth", "come", "only", "through", "continuous", "effort", "struggle"},
            //27
            {"attitude", "george", "b","bernard", "shaw", "people", "who", "say", "it", "cannot", "be", "done", "should", "not", "interrupt", "those", "are", "doing"},
            //28
            {"attitude", "robert", "greene", "the", "most", "effective", "attitude", "to", "adopt", "is", "one", "of", "supreme", "acceptance"},
            //29
            {"attitude", "marian", "w","wright", "edelman", "you", "really", "can", "change", "the", "world", "if", "care", "enough"},
            //30
            {"attitude", "william", "penn", "no", "pain", "gain", "thorns", "throne", "gall", "glory", "cross", "crown"},
            //31
            {"attitude", "chinese", "proverb", "it", "is", "better", "to", "light", "a", "candle", "than", "curse", "the", "darkness"},
            //32
            {"attitude", "joshua", "j", "marine", "challenges", "are", "what", "make", "life", "interesting", "and", "overcoming", "them", "is", "makes", "meaningful"},
            //33
            {"attitude", "aristotle", "the", "ideal", "man", "bears", "the", "accidents", "of", "life", "with", "dignity", "and", "grace", "making", "best", "circumstances"},
            //34
            {"attitude", "winston", "churchill", "is", "a", "little", "thing", "that", "makes", "big", "difference"},
            //35
            {"attitude", "mahatma", "gandhi", "you", "must", "be","the", "change", "want", "to", "see", "in", "world"},
            //36
            {"attitude", "socrates", "we", "cannot", "live", "better", "than", "in", "seeking", "to", "become"},
            //37
            {"attitude", "zig", "ziglar", "your", "not", "aptitude", "will", "determine", "altitude"},
            //38
            {"attitude", "irving", "berlin", "attitudes", "are", "a", "secret", "power", "working", "twentyfour", "hours", "day", "for", "good", "or", "bad", "it", "is", "of", "paramount", "importance", "that", "we", "know", "how", "to", "harness", "and", "control", "this", "great", "force"},
            //39
            {"attitude", "h", "jackson", "brown", "jr", "when", "you", "can't", "change", "the", "direction", "of", "wind", "adjust", "your", "sails"},
            //40
            {"attitude", "lou", "holtz", "ability", "is", "what", "you're", "capable", "of", "doing", "motivation", "determines", "you", "do", "how", "well", "it"},
            //41
            {"attitude", "mark", "a", "brennan", "will", "always", "define", "who", "we", "are", "in", "life"},
            //42
            {"attitude", "mildred", "barthel", "happiness", "is", "a", "conscious", "choice", "not", "an", "automatic", "response"},
            //43
            {"attitude", "charles", "dickens", "the", "world", "belongs", "to", "those", "who", "set", "out", "conquer", "it", "armed", "with", "selfconfidence", "and", "good", "humour", "humor"},
            //44
            {"attitude", "robert", "greene", "never", "whine", "complain", "try", "to", "justify", "yourself"},
            //45
            {"attitude", "henry", "ford", "if", "you", "think", "can", "and", "can't", "you're", "right"},
            //46
            {"attitude", "bruce", "lee", "knowledge", "will", "give", "you", "power", "but", "character", "respect"},
            //47
            {"attitude", "tony", "robbins", "whatever", "happens", "take", "responsibility"},
            //48
            {"attitude", "albert", "einstein", "weakness", "of", "becomes", "character"},
            //49
            {"attitude", "maxime", "legacé", "legace", "the", "weak", "make", "others", "feel", "inferior", "strong", "equal"},
            //50
            {"attitude", "james", "allen", "men", "do", "not", "attract", "that", "which", "they", "want", "but", "are"},
            //51
            {"attitude", "rosa", "parks", "i", "have", "learned", "over", "the", "years", "that", "when", "one's", "mind", "is", "made", "up", "this", "diminishes", "fear"},
            //52
            {"attitude", "william", "penn", "to", "have", "striven", "made", "the", "effort", "been", "true", "to", "certain", "ideals", "this", "alone", "is", "worth", "struggle"},
            //53
            {"attitude", "james", "a", "froude", "you", "cannot", "dream", "yourself", "into", "a", "character", "must", "hammer", "and", "forge", "one"},
            //54
            {"attitude", "dr", "seuss", "only", "you", "can", "control", "your", "future"},
            //55
            {"attitude", "william", "feather", "plenty", "of", "people", "miss", "their", "share", "happiness", "not", "because", "they", "never", "found", "it", "but", "didn't", "stop", "to", "enjoy"},
            //56
            {"attitude", "robert", "frost", "the", "best", "way", "out", "is", "always", "through"},
            //57
            {"attitude", "pablo", "picasso", "only", "put", "off", "until", "tomorrow", "what", "you", "are", "willing", "to", "die", "having", "left", "undone"},
            //58
            {"attitude", "l", "m", "montgomery", "it's", "been", "my", "experience", "that", "you", "can", "nearly", "always", "enjoy", "things", "if", "make", "your", "mind", "firmly", "will"},
            //59
            {"attitude", "henry", "ford", "when", "everything", "seems", "to", "be", "going", "against", "you", "remember", "that", "the", "airplane", "takes", "off", "against", "the", "wind", "not", "with", "it"},
            //60
            {"attitude", "john", "burroughs", "one", "resolution", "i", "have", "made", "and", "try", "always", "to", "keep", "is", "this", "rise", "above", "little", "things"},
            //61
            {"attitude", "mary", "parker", "follett", "responsibility", "is", "the", "great", "developer", "of", "men"},
            //62
            {"attitude", "marcus", "aurelius", "do", "every", "act", "of", "your", "life", "as", "if", "it","were", "your", "last"},
            //63
            {"attitude", "roy", "t", "bennett", "don't", "waste", "your", "time", "in", "anger", "regrets", "worries", "and", "grudges", "life", "is", "too", "short", "to", "be", "unhappy"},
            //64
            {"attitude", "simon", "sinek", "it", "is", "better", "to", "disappoint", "people", "with", "the", "truth", "than", "to", "appease", "them", "a", "lie"},
            //65
            {"attitude", "naval", "ravikant", "happiness", "is", "the", "default", "state", "it's", "what's", "there", "when", "you", "remove", "sense", "that", "something", "missing", "in", "life"},
            //66
            {"attitude", "erica", "jong", "you", "take", "your", "in", "own", "hands", "and", "what", "happens", "a", "terrible", "thing", "no", "one", "to", "blame"},
            //67
            {"attitude", "aristotle", "you", "will", "never", "do", "anything", "in", "this", "world", "without", "courage", "it", "is", "the", "greatest", "quality", "of", "mind", "next", "to", "honor", "honour"},
            //68
            {"attitude", "the", "same", "boiling", "water", "that", "softens", "potato", "hardens", "egg", "it's", "what", "you're", "you", "are", "made", "of", "not", "circumstances"},
            //69
            {"attitude", "abraham", "lincoln", "i", "don't", "like", "that", "man", "must", "get", "to", "know", "him", "better"},
            //70
            {"attitude", "george", "b","bernard", "shaw", "life", "isn't", "about", "finding", "yourself", "is", "about", "creating"},
            //71
            {"attitude", "harvey", "specter", "suits", "when", "you're", "backed", "against", "a", "wall", "break", "the", "goddamn", "thing", "down"},
            //72
            {"attitude", "alfred", "a", "montapert", "expect", "problems", "and", "eat", "them", "for", "breakfast"},
            //73
            {"attitude", "william", "shakespeare", "there", "is", "nothing", "either", "good", "or", "bad", "but", "thinking", "makes", "it", "so"},
            //74
            {"attitude", "sylvester", "stallone", "no", "one", "will", "hit", "you", "harder", "than", "life", "itself", "it", "doesn't", "matter", "how", "hard", "hit", "back", "it's", "about", "much", "can", "take", "and", "keep", "fighting", "suffer", "moving", "forward", "that's", "win"},
            //75
            {"attitude", "alfred", "adler", "it", "is", "always", "easier", "to", "fight", "for", "one's", "principles", "than", "live", "up", "them"},
            //76
            {"attitude", "alice", "o", "howell", "you", "can", "only", "work", "on", "yourself", "start", "there"},
            //77
            {"attitude", "khalil", "gibran", "your", "living", "is", "determined", "not", "so", "much", "by", "what", "life", "brings", "to", "you", "as", "the", "bring", "happens", "way", "mind", "looks", "at"},
            //78
            {"attitude", "dietrich", "bonhoeffer", "action", "springs", "not", "from", "thought", "but", "from", "a", "readiness", "for", "responsibility"},
            //79
            {"attitude", "colin", "powell", "if", "you", "are", "going", "to", "achieve", "excellence", "in", "big", "things", "develop", "the", "habit", "little", "matters", "is", "not", "an", "exception", "is", "a", "prevailing"},
            //80
            {"attitude", "people", "who", "wonder", "if", "the", "glass", "is", "half", "empty", "or", "full", "miss", "point", "refillable"},
            //81
            {"attitude", "richard", "bach", "sooner", "or", "later", "those", "who", "win", "are", "think", "they", "can"},
            //82
            {"attitude", "joyce", "meyer", "you", "cannot", "can't", "have", "a", "positive", "life", "and", "negative", "mind"},
            //83
            {"attitude", "maya", "angelou", "if", "you", "don't", "like", "something", "change", "it", "can't", "change", "your"},
            //84
            {"attitude", "viktor", "e", "emil", "frankl", "everything", "can", "be", "taken", "from", "a", "man", "but", "one", "thing", "the", "last", "of", "human", "freedoms", "to", "choose", "one's", "in", "any", "given", "set", "circumstances", "own", "way"},
            //85
            {"attitude", "ralph", "marston", "excellence", "is", "not", "a", "skill", "it", "an"},
            //86
            {"attitude", "lucille", "clifton", "what", "they", "call", "you", "is", "one", "thing", "answer", "to", "something", "else"},
            //87
            {"attitude", "norm", "papernick", "those", "who", "can", "laugh", "without", "cause", "have", "either", "found", "the", "true", "meaning", "of", "happiness", "or", "gone", "stark", "raving", "mad"},
            //88
            {"attitude", "mark", "twain", "a", "discriminating", "irreverence", "is", "the", "creator", "and", "protector", "of", "human", "liberty"},
            //89
            {"attitude", "roy", "t", "bennett", "what", "helps", "you", "preserve", "is", "your", "resilience", "and", "commitment"},
            //90
            {"attitude", "leo", "tolstoy", "we", "lost", "because", "told", "ourselves"},
            //91
            {"attitude", "deborah", "day", "lighten", "up","on", "yourself", "no", "one", "is", "perfect", "gently", "accept", "your", "humanness"},
            //92
            {"attitude", "oprah", "winfrey", "the", "greatest", "discovery", "of", "all", "time", "is", "that", "a", "person", "can", "change", "his", "future", "by", "merely", "changing"},
            //93
            {"attitude", "shissai", "a", "warrior", "must", "only", "take", "care", "that", "his", "spirit", "is", "never", "broken"},
            //94
            {"attitude", "zen", "buddhist", "proverb", "how", "you", "do", "anything", "is", "everything"},
            //95
            {"attitude", "harry", "s", "truman", "a", "pessimist", "is", "one", "who", "makes", "difficulties", "of", "his", "opportunities", "and", "an", "optimist"},
            //96
            {"attitude", "arnold", "schwarzenegger", "positive", "thinking", "can", "be", "contagious", "being", "surrounded", "by", "winners", "helps", "you", "develop", "into", "a", "winner"},
            //97
            {"attitude", "what", "others", "think", "of", "me", "is", "none", "my", "business"},
            //98
            {"attitude", "abraham", "lincoln", "always", "bear", "in", "mind", "that", "your", "own", "resolution", "to", "succeed", "is", "more", "important", "than", "any", "other", "one", "thing"},
            //99
            {"attitude", "william", "james", "the", "greatest", "revolution", "of", "our", "generation", "is", "discovery", "that", "human", "beings", "by", "changing", "inner", "attitudes", "their", "minds", "can", "change", "outer", "aspects", "lives"},
            //100
            {"attitude", "confucius", "to", "put", "the", "world", "right", "in", "order", "we", "must", "first", "nation", "family", "cultivate", "our", "personal", "life", "set", "hearts"},
            //101
            {"attitude", "a", "million", "likes", "will", "never", "be", "enough", "if", "you", "don’t", "like", "yourself"},
            //102
            {"attitude", "og", "mandino", "take", "the", "of", "a", "student", "never", "be", "too", "big", "to", "ask", "questions",  "know", "much", "learn", "something", "new"},
            //103
            {"attitude", "ann", "brashares", "your", "problem", "isn’t", "the", "it’s", "your", "about"},
            //104
            {"attitude", "lao", "tzu", "care", "about", "what", "other", "people", "think", "and", "you", "will", "always", "be", "their", "prisoner"},
            //105
            {"attitude", "f", "scott", "fitzgerald", "action", "is", "character"},
            //106
            {"attitude", "wayne", "dyer", "if", "you", "believe", "it’ll", "work", "out", "you’ll", "see", "opportunities", "don’t", "obstacles"},
            //107
            {"attitude", "maxime", "legacé", "legace", "ups", "and", "downs", "victories", "defeats", "sadness", "happiness", "that’s", "the", "best", "kind", "of", "life"},
            //108
            {"attitude", "confucius", "our", "greatest", "glory", "is", "not", "in", "never", "falling", "but", "rising", "every", "time", "we", "fall"},
            //109
            {"attitude", "nathaniel", "hawthorne", "happiness", "in", "this", "world", "when", "it", "comes", "incidentally", "make", "the", "object", "of", "pursuit", "and", "leads", "us", "a", "wild-goose", "chase", "is", "never", "attained"},
            //110
            {"attitude", "abraham", "lincoln", "we", "can", "complain", "because", "rose", "bushes", "have", "thorns", "or", "rejoice", "thorn", "roses"},
            //111
            {"attitude", "jojo", "moyes", "live", "boldly", "push", "yourself", "don’t", "settle"},
            //112
            {"attitude", "aldous", "huxley", "there’s", "only", "one", "corner", "of", "the", "universe", "you", "can", "be", "certain", "improving", "and", "that’s", "your", "own", "self"},
            //113
            {"attitude", "heraclitus", "good", "character", "is", "not", "formed", "in", "a", "week", "or", "a", "month", "it", "created", "little", "by", "day", "protracted", "and", "patient", "effort", "needed"},
            //114
            {"attitude", "roy", "t", "bennett", "don’t", "be", "pushed", "around", "by", "the", "fears", "in", "your", "mind", "led", "dreams", "heart"},
            //115
            {"attitude", "dwight", "d", "eisenhower", "pessimism", "never", "won", "any", "battle"},
            //116
            {"attitude", "stephen", "r", "covey", "i", "am", "not", "a", "product", "of", "my", "circumstances", "decisions"},
            //117
            {"attitude", "napoleon", "hill", "you", "become", "what", "think", "about"},
            //118
            {"attitude", "believe", "in", "yourself", "and", "you’ll", "be", "able", "to", "achieve", "anything", "you", "want", "life"},
            //119
            {"attitude", "amit", "kalantri", "great", "losses", "are", "lessons"},
            //120
            {"attitude", "oscar", "wilde", "we", "are", "all", "in", "the", "gutter", "but", "some", "of", "us", "looking", "at", "stars"},
            //121
            {"attitude", "elbert", "hubbard", "don’t", "take", "life", "too", "seriously", "you’ll", "never", "get", "out", "of", "it", "alive"},
            //122
            {"attitude", "epictetus", "it’s", "not", "what", "happens", "to", "you", "but", "how", "react", "it", "that", "matters"},
            //123
            {"attitude", "roy", "t", "bennett", "when", "you", "take", "control", "of", "your", "life"},
            //124
            {"attitude", "george", "b", "bernard", "shaw", "two", "things", "define", "you", "your", "patience", "when", "have", "nothing", "and", "everything"},
            //125
            {"attitude", "robert", "foster", "bennett", "having", "a", "positive", "mental", "is", "asking", "how", "something", "can", "be", "done", "rather", "than", "saying", "it", "can't"},
            //126
            {"attitude", "brené", "brene", "brown", "if", "you", "own", "this", "story", "you", "get", "to", "write", "the", "ending"},
            //127
            {"attitude", "mahatma", "gandhi", "keep", "your", "values", "positive", "because", "become", "destiny"},
            //128
            {"attitude", "bruce", "lee", "a", "quick", "temper", "will", "make", "fool", "of", "you", "soon", "enough"},
            //129
            {"attitude", "marie", "curie", "i", "never", "see", "what", "has", "been", "done", "only", "remains", "to", "be"},
            //130
            {"attitude", "seneca", "a", "gem", "cannot", "be", "polished", "without", "friction", "nor", "man", "perfected", "trials"},
            //131
            {"attitude", "steven", "furtick", "the", "reason", "we", "struggle", "with", "insecurity", "is", "because", "compare", "our", "behindthescenes", "everyone", "else's", "highlight", "reel"},
            //132
            {"attitude", "jimmy", "dean", "i", "can't", "change", "the", "direction", "of", "wind", "but", "can", "adjust", "my", "sails", "to", "always", "reach", "destination"},
            //133
            {"attitude", "leo", "buscaglia", "don't", "spend", "your", "precious", "time", "asking", "why", "isn't", "the", "world", "a", "better", "place", "it", "will", "only", "be", "wasted", "question", "to", "ask", "is", "how", "can", "i", "make"},
            //134
            {"attitude", "roy", "t", "bennett", "the", "one", "who", "falls", "and", "gets", "up", "is", "stronger", "than", "never", "tried", "do", "not", "fear", "failure", "but", "rather", "trying"},
            //135
            {"attitude", "marianne", "williamson", "and", "as", "we", "let", "our", "own", "light", "shine", "unconsciously", "give", "other", "people", "permission", "to", "do", "the", "same", "are", "liberated", "from", "fear", "presence", "automatically", "liberates", "others"},
            //136
            {"attitude", "michael", "jordan", "always", "turn", "a", "negative", "situation", "into", "positive"},
            //137
            {"attitude", "thomas", "jefferson", "nothing", "can", "stop", "the", "man", "with", "right", "mental", "from", "achieving", "his", "goal", "on", "earth", "help", "wrong"},
            //138
            {"attitude", "amy", "e", "dean", "which", "way", "you", "choose", "to", "see", "your", "life", "in", "the", "future", "depends", "on", "today"},
            //139
            {"attitude", "plato", "there", "are", "two", "things", "a", "person", "should", "never", "be", "angry", "at", "what", "they", "can", "help", "and", "cannot"},
            //140
            {"attitude", "confucius", "don’t", "complain", "about", "the", "snow", "on", "your", "neighbour’s", "roof", "when", "own", "doorstep", "is", "unclean"},
            //141
            {"attitude", "bruce", "lee", "absorb", "what", "is", "useful", "reject", "useless", "add", "specifically", "your", "own"},
            //142
            {"attitude", "h", "e", "manning", "we", "never", "have", "more", "than", "can", "bear", "the", "present", "hour", "are", "always", "able", "to", "endure"},
            //143
            {"attitude", "you", "cannot", "do", "epic", "things", "with", "an", "average"},
            //144
            {"attitude", "john", "templeton", "it’s", "nice", "to", "be", "important", "but", "much", "more"},
            //145
            {"attitude", "mary", "lou", "retton", "optimism", "is", "a", "happiness", "magnet", "if", "you", "stay", "positive", "good", "thing", "and", "people", "will", "be", "drawn", "to"},
            //146
            {"attitude", "jim", "rohn", "if", "you", "don’t", "like", "where", "are", "move", "not", "a", "tree"},
            //147
            {"attitude", "your", "is", "like", "a", "price", "tag", "it", "shows", "how", "valuable", "you", "are"},
            //148
            {"attitude", "friedrich", "nietzsche", "call", "me", "whatever", "you", "like", "i", "am", "who", "must", "be"},
            //149
            {"attitude", "i", "am", "who", "your", "approval", "isn’t", "needed"},
            //150
            {"attitude", "i’m", "not", "shy", "just", "really", "good", "at", "figuring", "out", "who’s", "worth", "talking", "to"},
            //151
            {"attitude", "confucius", "worry", "not", "that", "no", "one", "knows", "you", "seek", "to", "be", "worth", "knowing"},
            //152
            {"attitude", "no", "matter", "how", "bad", "the", "economy", "of", "jungle", "a", "lion", "will", "never", "eat", "grass"},
            //153
            {"attitude", "your", "vibe", "attracts", "tribe"},
            //154
            {"attitude", "david", "beckham", "it’s", "so", "important", "to", "have", "manners", "and", "treat", "people", "from", "all", "walks", "of", "life", "the", "way", "they", "should", "be", "treated"},
            //155
            {"attitude", "don’t", "be", "the", "girl", "who", "needs", "a", "man"},
            //156
            {"attitude", "john", "amatt", "adventure", "isn’t", "hanging", "on", "a", "rope", "off", "the", "side", "of", "mountain", "is", "an", "that", "we", "must", "apply", "to", "day", "obstacles", "in", "life"},
            //157
            {"attitude", "be", "so", "positive", "that", "negative", "people", "don’t", "want", "to", "around", "you"},
            //158
            {"attitude", "confucius", "a", "superior", "man", "is", "modest", "in", "his", "speech", "but", "exceeds", "actions"},
            //159
            {"attitude", "roy", "t", "bennett", "is", "a", "choice", "happiness", "optimism", "kindness", "giving", "respect", "whatever", "you", "make", "makes", "choose", "wisely"},
            //160
            {"attitude", "john", "c", "maxwell", "people", "may", "hear", "your", "words", "but", "they", "feel"},
            //161
            {"attitude", "lion’s", "don’t", "dream", "of", "hunting", "they", "just", "go", "and", "hunt"}
    };

    public static String getAttitudeQuote(int position) {
        return quotesAttitude[position];
    }

    public static String getAttitudeAuthor(int position) {
        return quotesAttitudeAuthors[position];
    }

    public static String[] getAttitudeList() {
        return quotesAttitude;
    }

    static String[][] getAttitudeTags() {
        return attitudeTags;
    }

    public static int getAttitudeListSize() {
        return quotesAttitude.length;
    }
}
