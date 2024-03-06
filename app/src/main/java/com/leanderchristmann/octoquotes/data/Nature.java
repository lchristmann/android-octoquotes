package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Nature {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesInspiration and quotesInspirationAuthors
        int listSize = getNatureListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesNature[randomIndexToSwap];
            tempAuthor = quotesNatureAuthors[randomIndexToSwap];
            tempTags = natureTags[randomIndexToSwap];
            quotesNature[randomIndexToSwap] = quotesNature[i];
            quotesNatureAuthors[randomIndexToSwap] = quotesNatureAuthors[i];
            natureTags[randomIndexToSwap] = natureTags[i];
            quotesNature[i] = tempQuote;
            quotesNatureAuthors[i] = tempAuthor;
            natureTags[i] = tempTags;
        }
    }

    private static String[] quotesNature = {
            //0
            "\"For most of history, man has had to fight nature to survive; in this century he is beginning to realize that, in order to survive, he must protect it.\"",
            //1
            "\"I go to nature to be soothed and healed, and to have my senses put in order.\"",
            //2
            "\"One touch of nature makes the whole world kin.\"",
            //3
            "\"To make a prairie it takes a clover and one bee, One clover, and a bee, And revery. The revery alone will do, if bees are few.\"",
            //4
            "\"Nature always wears the colors of the spirit.\"",
            //5
            "\"Nature does not hurry, yet everything is accomplished.\"",
            //6
            "\"Plant seeds of happiness, hope, success, and love; it will all come back to you in abundance. This is the law of nature.\"",
            //7
            "\"The least movement is of importance to all nature. The entire ocean is affected by a pebble.\"",
            //8
            "\"This curious world we inhabit is more wonderful than convenient; more beautiful than it is useful; it is more to be admired and enjoyed than used.\"",
            //9
            "\"If you wish to know the divine, feel the wind on your face and the warm sun on your hand.\"",
            //10
            "\"Autumn is a second spring when every leaf is a flower.\"",
            //11
            "\"Nature is cheaper than therapy.\"",
            //12
            "\"Everything in nature is lyrical in its ideal essence, tragic in its fate, and comic in its existence.\"",
            //13
            "\"In every walk with nature one receives far more than he seeks.\"",
            //14
            "\"Nature teaches more than she preaches. There are no sermons in stones. It is easier to get a spark out of a stone than a moral.\"",
            //15
            "\"God is the friend of silence. See how nature – trees, flowers, grass- grows in silence; see the stars, the moon and the sun, how they move in silence… We need silence to be able to touch souls.\"",
            //16
            "\"We don’t inherit the earth from our ancestors, we borrow it from our children.\"",
            //17
            "\"Every particular in nature, a leaf, a drop, a crystal, a moment of time is related to the whole, and partakes of the perfection of the whole.\"",
            //18
            "\"Beautiful things don’t ask for attention.\"",
            //19
            "\"Heaven is under our feet as well as over our heads.\"",
            //20
            "\"Solitary trees, if they grow at all, grow strong.\"",
            //21
            "\"To forget how to dig the earth and to tend the soil is to forget ourselves.\"",
            //22
            "\"Study nature, love nature, stay close to nature. It will never fail you.\"",
            //23
            "\"Spring is nature’s way of saying, ‘Let’s party!’.\"",
            //24
            "\"To sit in the shade on a fine day and look upon verdure is the most perfect refreshment.\"",
            //25
            "\"Never, no, never did nature say one thing and wisdom another.\"",
            //26
            "\"I believe a leaf of grass is no less than the journey-work of the stars.\"",
            //27
            "\"I went to the woods because I wished to live deliberately, to front only the essential facts of life, and see if I could not learn what it had to teach, and not, when I came to die, discover that I had not lived.\"",
            //28
            "\"The goal of life is to make your heartbeat match the beat of the universe, to match your nature with Nature.\"",
            //29
            "\"It is our collective and individual responsibility… to preserve and tend to the world in which we all live.\"",
            //30
            "\"Nature is an infinite sphere of which the center is everywhere and the circumference nowhere.\"",
            //31
            "\"The first in time and the first in importance of the influences upon the mind is that of nature. Every day, the sun; and, after sunset, night and her stars.\"",
            //32
            "\"Nature, time and patience are the three great physicians.\"",
            //33
            "\"The poetry of the earth is never dead.\"",
            //34
            "\"An inflexible tree breaks in a storm.\"",
            //35
            "\"To me a lush carpet of pine needles or spongy grass is more welcome than the most luxurious Persian rug.\"",
            //36
            "\"The earth has music for those who listen.\"",
            //37
            "\"Adopt the pace of nature. Her secret is patience.\"",
            //38
            "\"Sunshine is delicious, rain is refreshing, wind braces us up, snow is exhilarating; there is really no such thing as bad weather, only different kinds of good weather.\"",
            //39
            "\"Men argue. Nature acts.\"",
            //40
            "\"There’s a whole world out there, right outside your window. You’d be a fool to miss it.\"",
            //41
            "\"Like music and art, love of nature is a common language that can transcend political or social boundaries.\"",
            //42
            "\"The woods are lovely, dark and deep. But I have promises to keep, and miles to go before I sleep.\"",
            //43
            "\"Time spent amongst trees is never wasted time.\"",
            //44
            "\"An early morning walk is a blessing for the whole day.\"",
            //45
            "\"Nature is pleased with simplicity. And nature is no dummy.\"",
            //46
            "\"Rest is not idleness, and to lie sometimes on the grass under trees on a summer’s day, listening to the murmur of the water, or watching the clouds float across the sky, is by no means a waste of time.\"",
            //47
            "\"A weed is no more than a flower in disguise.\"",
            //48
            "\"Let us permit nature to have her way. She understands her business better than we do.\"",
            //49
            "\"Water is the driving force of all nature.\"",
            //50
            "\"Sunset is still my favorite color, and rainbow is second.\"",
            //51
            "\"I took a walk in the woods and came out taller than the trees.\"",
            //52
            "\"Don’t judge each day by the harvest you reap but by the seeds you plant.\"",
            //53
            "\"Not just beautiful, though—the stars are like the trees in the forest, alive and breathing. And they’re watching me.\"",
            //54
            "\"The Amen of nature is always a flower.\"",
            //55
            "\"Be kind to everything that lives.\"",
            //56
            "\"All my life through, the new sights of Nature made me rejoice like a child.\"",
            //57
            "\"I felt my lungs inflate with the onrush of scenery—air, mountains, trees, people. I thought, ‘This is what it is to be happy.\"",
            //58
            "\"I believe the best way to begin reconnecting humanity's heart, mind, and soul to nature is for us to share our individual stories.\"",
            //59
            "\"I think nature’s imagination is so much greater than man’s, she’s never going to let us relax.\"",
            //60
            "\"Land really is the best art.\"",
            //61
            "\"Looking at beauty in the world, is the first step of purifying the mind.\"",
            //62
            "\"For in the true nature of things, if we rightly consider, every green tree is far more glorious than if it were made of gold and silver.\"",
            //63
            "\"Everything in nature invites us constantly to be what we are.\"",
            //64
            "\"If you can’t be in awe of Mother Nature, there’s something wrong with you.\"",
            //65
            "\"Colors are the smiles of nature.\"",
            //66
            "\"The fairest thing in nature, a flower, still has its roots in earth and manure.\"",
            //67
            "\"Deep in their roots, all flowers keep the light.\"",
            //68
            "\"A friend may well be reckoned the masterpiece of nature.\"",
            //69
            "\"Everything in nature goes by law, and not by luck.\"",
            //70
            "\"Nature is loved by what is best in us.\"",
            //71
            "\"Between every two pines there is a doorway to a new world.\"",
            //72
            "\"If we surrendered to earth’s intelligence we could rise up rooted, like trees.\"",
            //73
            "\"Caring for the Earth is not a hippie thing, it’s a survival thing.\"",
            //74
            "\"The goal of life is living in agreement with nature.\"",
            //75
            "\"If you truly love nature, you will find beauty everywhere.\"",
            //76
            "\"The best thing one can do when it’s raining is to let it rain.\"",
            //77
            "\"Some of nature’s most exquisite handiwork is on a miniature scale, as anyone knows who has applied a magnifying glass to a snowflake.\"",
            //78
            "\"Those who find beauty in all of nature will find themselves at one with the secrets of life itself.\"",
            //79
            "\"Life sucks a lot less when you add mountain air, a campfire and some peace and quiet.\"",
            //80
            "\"Nature, in the broadest sense, is the natural, physical, or material world or universe.\"",
            //81
            "\"Every flower is a soul blossoming in nature.\"",
            //82
            "\"The earth laughs in flowers.\"",
            //83
            "\"Preserve and cherish the pale blue dot, the only home we’ve ever known.\"",
            //84
            "\"Although we say mountains belong to the country, actually, they belong to those that love them.\"",
            //85
            "\"At some point in life the world’s beauty becomes enough. You don’t need to photograph, paint, or even remember it. It is enough.\"",
            //86
            "\"Knowing trees, I understand the meaning of patience. Knowing grass, I can appreciate persistence.\"",
            //87
            "\"The best remedy for those who are afraid, lonely or unhappy is to go outside, somewhere where they can be quite alone with the heavens, nature, and God.\"",
            //88
            "\"The beauty of the natural world lies in the details.\"",
            //89
            "\"My father considered a walk among the mountains as the equivalent of churchgoing.\"",
            //90
            "\"The clearest way into the universe is through a forest wilderness.\"",
            //91
            "\"If the bee disappears from the surface of the earth, man would have no more than four years to live.\"",
            //92
            "\"Use what talents you possess: the woods would be very silent if no birds sang there except those that sang best.\"",
            //93
            "\"Just living is not enough. One must have sunshine, freedom, and a little flower.\"",
            //94
            "\"Nature does nothing uselessly.\"",
            //95
            "\"The sun, with all those planets revolving around it and dependent on it, can still ripen a bunch of grapes as if it had nothing else in the universe to do.\"",
            //96
            "\"By discovering nature, you discover yourself.\"",
            //97
            "\"In all things of nature there is something of the marvelous.\"",
            //98
            "\"Leave the road, take the trails.\"",
            //99
            "\"I like this place and could willingly waste my time in it.\"",
            //100
            "\"All the trees are losing their leaves, and not one of them is worried.\"",
            //101
            "\"We are the first generation to feel the effect of climate change and the last generation who can do something about it.\"",
            //102
            "\"Nature’s beauty is a gift that cultivates appreciation and gratitude.\"",
            //103
            "\"I never saw a discontented tree.\"",
            //104
            "\"Yosemite Valley, to me, is always a sunrise, a glitter of green and golden wonder in a vast edifice of stone and space.\"",
            //105
            "\"Live in each season as it passes; breathe the air, drink the drink, taste the fruit, and resign yourself to the influence of the earth.\"",
            //106
            "\"I’d rather have roses on my table than diamonds on my neck.\"",
            //107
            "\"The world is not to be put in order. The world is order. It is for us to put ourselves in unison with this order.\"",
            //108
            "\"I believe in God, only I spell it Nature.\"",
            //109
            "\"Should you shield the canyons from the windstorms you would never see the true beauty of their carvings.\"",
            //110
            "\"Look deep into nature, and then you will understand everything better.\"",
            //111
            "\"The family is one of nature’s masterpieces.\"",
            //112
            "\"The world is mud-luscious and puddle-wonderful.\"",
            //113
            "\"If one way be better than another, that you may be sure is nature’s way.\"",
            //114
            "\"And into the forest I go to lose my mind and find my soul.\"",
            //115
            "\"Nature is the art of God.\"",
            //116
            "\"There is something infinitely healing in the repeated refrains of nature - the assurance that dawn comes after night, and spring after winter.\"",
            //117
            "\"Whoever loves and understands a garden will find contentment within.\"",
            //118
            "\"Forget not that the earth delights to feel your bare feet and the winds long to play with your hair.\"",
            //119
            "\"Man’s heart away from nature becomes hard.\"",
            //120
            "\"When one tugs at a single thing in nature, he finds it attached to the rest of the world.\"",
            //121
            "\"Birds have always had the ability to bring me out of a dark space and provide relief in bad times.\"",
            //122
            "\"God has cared for these trees, saved them from drought, disease, avalanches, and a thousand tempests and floods. But he cannot save them from fools.\"",
            //123
            "\"Nature is not a place to visit. It is home.\"",
            //124
            "\"Choose only one master - nature.\"",
            //125
            "\"The earth is what we all have in common.\"",
            //126
            "\"Those who contemplate the beauty of the earth find reserves of strength that will endure as long as life lasts.\"",
            //127
            "\"Many eyes go through the meadow, but few see the flowers in it.\"",
            //128
            "\"To walk into nature is to witness a thousand miracles.\"",
            //129
            "\"Let the rain kiss you. Let the rain beat upon your head with silver liquid drops. Let the rain sing you a lullaby.\"",
            //130
            "\"Take a quit walk with mother nature. It will nurture your mind, body, and soul.\"",
            //131
            "\"My wish is to stay always like this, living quietly in a corner of nature.\"",
            //132
            "\"The ocean is a mighty harmonist.\"",
            //133
            "\"Deforestation is changing our climate, harming people and the natural world. We must, and can, reverse this trend.\"",
            //134
            "\"Nature is just enough; but men and women must comprehend and accept her suggestions.\"",
            //135
            "\"Love the world as your own self; then you can truly care for all things.\"",
            //136
            "\"I love places that make you realize how tiny you and your problems are.\"",
            //137
            "\"There are always flowers for those who want to see them.\"",
            //138
            "\"I just wish the world was twice as big and half of it was still unexplored.\"",
            //139
            "\"It is not so much for its beauty that the forest makes a claim upon men’s hearts, as for that subtle something, that quality of air that emanation from old trees, that so wonderfully changes and renews a weary spirit.\"",
            //140
            "\"Nature, to be controlled, must be obeyed.\"",
            //141
            "\"A morning-glory at my window satisfies me more than the metaphysics of books.\"",
            //142
            "\"In a world of constant change and streaming technology, I find solace in the forest where a tree remains a tree.\"",
            //143
            "\"We still do not know one thousandth of one percent of what nature has revealed to us.\"",
            //144
            "\"In nature, nothing is perfect and everything is perfect. Trees can be contorted, bent in weird ways, and they’re still beautiful.\"",
            //145
            "\"Being able to smell the fresh air and disconnect from the news and your phone—there’s nothing like it.\"",
            //146
            "\"Over every mountain there is a path, although it may not be seen from the valley.\"",
            //147
            "\"The richness I achieve comes from Nature, the source of my inspiration.\"",
            //148
            "\"Going to the mountains is like going home.\"",
            //149
            "\"It is said that the forest has a certain limit if you look straight ahead, but the sides are boundless.\""
    };
    private static String[] quotesNatureAuthors = {
            //0
            "Jacques-Yves Cousteau",
            //1
            "John Burroughs",
            //2
            "William Shakespeare",
            //3
            "Emily Dickinson",
            //4
            "Ralph Waldo Emerson",
            //5
            "Lao Tzu",
            //6
            "Steve Maraboli",
            //7
            "Blaise Pascal",
            //8
            "Henry David Thoreau",
            //9
            "Buddha",
            //10
            "Albert Camus",
            //11
            "Unknown",
            //12
            "George Santanaya",
            //13
            "John Muir",
            //14
            "John Burroughs",
            //15
            "Mother Teresa",
            //16
            "Native American proverb",
            //17
            "Ralph Waldo Emerson",
            //18
            "Unknown",
            //19
            "Henry David Thoreau",
            //20
            "Winston Churchill",
            //21
            "Mahatma Gandhi",
            //22
            "Frank Lloyd Wright",
            //23
            "Robin Williams",
            //24
            "Jane Austen",
            //25
            "Edmund Burke",
            //26
            "Walt Whitman",
            //27
            "Henry David Thoreau",
            //28
            "Joseph Campbell",
            //29
            "Dalai Lama",
            //30
            "Blaise Pascal",
            //31
            "Ralph Waldo Emerson",
            //32
            "Chinese proverb",
            //33
            "John Keats",
            //34
            "Matshona Dhliwayo",
            //35
            "Helen Keller",
            //36
            "William Shakespeare",
            //37
            "Ralph Waldo Emerson",
            //38
            "John Ruskin",
            //39
            "Voltaire",
            //40
            "Charlotte Eriksson",
            //41
            "Jimmy Carter",
            //42
            "Robert Frost",
            //43
            "Katrina Mayer",
            //44
            "Henry David Thoreau",
            //45
            "Isaac Newton",
            //46
            "John Lubbock",
            //47
            "James Russell Lowell",
            //48
            "Michel de Montaigne",
            //49
            "Leonardo da Vinci",
            //50
            "Mattie Stepanek",
            //51
            "Henry David Thoreau",
            //52
            "Robert Louis Stevenson",
            //53
            "Haruki Murakami",
            //54
            "Oliver Wendell Holmes Sr.",
            //55
            "Unknown",
            //56
            "Marie Curie",
            //57
            "Sylvia Plath",
            //58
            "J. Drew Lanham",
            //59
            "Richard Feynman",
            //60
            "Andy Warhol",
            //61
            "Amit Ray",
            //62
            "Martin Luther King Jr.",
            //63
            "Gretel Ehrlich",
            //64
            "Alex Trebek",
            //65
            "Leigh Hunt",
            //66
            "D. H. Lawrence",
            //67
            "Theodore Roethke",
            //68
            "Ralph Waldo Emerson",
            //69
            "Ralph Waldo Emerson",
            //70
            "Ralph Waldo Emerson",
            //71
            "John Muir",
            //72
            "Rainer Maria Rilke",
            //73
            "Unknown",
            //74
            "Zeno",
            //75
            "Laura Ingalls Wilder",
            //76
            "Henry Wadsworth Longfellow",
            //77
            "Rachel Carson",
            //78
            "L. Wolfe Gilbert",
            //79
            "Brooke Hampton",
            //80
            "Wikipedia",
            //81
            "Gerard De Nerval",
            //82
            "Ralph Waldo Emerson",
            //83
            "Carl Sagan",
            //84
            "Dogen",
            //85
            "Toni Morrison",
            //86
            "Hal Borland",
            //87
            "Anne Frank",
            //88
            "Natalie Angier",
            //89
            "Aldous Huxley",
            //90
            "John Muir",
            //91
            "Albert Einstein",
            //92
            "Henry van Dyke",
            //93
            "Hans Christian Andersen",
            //94
            "Aristotle",
            //95
            "Galileo Galilei",
            //96
            "Maxime Lagacé",
            //97
            "Aristotle",
            //98
            "Pythagoras",
            //99
            "William Shakespeare",
            //100
            "Donald Miller",
            //101
            "Barack Obama",
            //102
            "Louis Schwartzberg",
            //103
            "John Muir",
            //104
            "Ansel Adams",
            //105
            "Henry David Thoreau",
            //106
            "Emma Goldman",
            //107
            "Henry Miller",
            //108
            "Frank Lloyd Wright",
            //109
            "Elisabeth Kübler-Ross",
            //110
            "Albert Einstein",
            //111
            "George Santayana",
            //112
            "E. E. Cummings",
            //113
            "Aristotle",
            //114
            "John Muir",
            //115
            "Dante Alighieri",
            //116
            "Rachel Carson",
            //117
            "Chinese proverb",
            //118
            "Khalil Gibran",
            //119
            "Standing Bear",
            //120
            "John Muir",
            //121
            "Jason Ward",
            //122
            "John Muir",
            //123
            "Gary Snyder",
            //124
            "Rembrandt",
            //125
            "Wendell Berry",
            //126
            "Rachel Carson",
            //127
            "Ralph Waldo Emerson",
            //128
            "Mary Davis",
            //129
            "Langston Hughes",
            //130
            "A. D. Williams",
            //131
            "Claude Monet",
            //132
            "William Wordsworth",
            //133
            "Jane Goodall",
            //134
            "Antoinette Brown Blackwell",
            //135
            "Lao Tzu",
            //136
            "Unknown",
            //137
            "Henri Matisse",
            //138
            "David Attenborough",
            //139
            "Robert Louis Stevenson",
            //140
            "Francis Bacon",
            //141
            "Walt Whitman",
            //142
            "Angie Weiland-Crosby",
            //143
            "Albert Einstein",
            //144
            "Alice Walker",
            //145
            "Jason Ward",
            //146
            "Theodore Roethke",
            //147
            "Claude Monet",
            //148
            "John Muir",
            //149
            "Riccardo Bozzi"
    };
    private static String[][] natureTags = {
            //0
            {"nature", "jacquesyves", "cousteau", "for", "most", "of", "history", "man", "has", "had", "to", "fight", "survive", "in", "this", "century", "he", "is", "beginning", "realize", "that", "order", "must", "protect", "it"},
            //1
            {"nature", "john", "burroughs", "i", "go", "to", "be", "soothed", "and", "healed", "have", "my", "senses", "put", "in", "order"},
            //2
            {"nature", "william", "shakespeare", "one", "touch", "of", "makes", "the", "whole", "world", "kin"},
            //3
            {"nature", "emily", "dickinson", "to", "make", "a", "prairie", "it", "takes", "clover", "and", "one", "bee", "revery", "the", "alone", "will", "do", "if", "bees", "are", "few"},
            //4
            {"nature", "ralph", "waldo", "emerson", "always", "wears", "the", "colors", "of", "spirit"},
            //5
            {"nature", "lao", "tzu", "does", "not", "hurry", "yet", "everything", "is", "accomplished"},
            //6
            {"nature", "steve", "maraboli", "plant", "seeds", "of", "happiness", "hope", "success", "and", "love", "it", "will", "all", "come", "back", "to", "you", "in", "abundance", "this", "is", "the", "law"},
            //7
            {"nature", "blaise", "pascal", "the", "least", "movement", "is", "of", "importance", "to", "all", "entire", "ocean", "affected", "by", "a", "pebble"},
            //8
            {"nature", "henry", "david", "thoreau", "this", "curious", "world", "we", "inhabit", "is", "more", "wonderful", "than", "convenient", "beautiful", "it", "useful", "to", "be", "admired", "and", "enjoyed", "used"},
            //9
            {"nature", "buddha", "if", "you", "wish", "to", "know", "the", "divine", "feel", "wind", "on", "your", "face", "and", "warm", "sun", "hand"},
            //10
            {"nature", "albert", "camus", "autumn", "is", "a", "second", "spring", "when", "every", "leaf", "flower"},
            //11
            {"nature", "is", "cheaper", "than", "therapy"},
            //12
            {"nature", "george", "santanaya", "everything", "in", "is", "lyrical", "its", "ideal", "essence", "tragic", "fate", "and", "comic", "existence"},
            //13
            {"nature", "john", "muir", "in", "every", "walk", "with", "one", "receives", "far", "more", "than", "he", "seeks"},
            //14
            {"nature", "john", "burroughs", "teaches", "more", "than", "she", "preaches", "there", "are", "no", "sermons", "in", "stones", "it", "is", "easier", "to", "get", "a", "spark", "out", "of", "stone", "moral"},
            //15
            {"nature", "mother", "teresa", "god", "is", "the", "friend", "of", "silence", "see", "how", "trees", "flowers", "grass", "grows", "in", "stars", "moon", "and", "sun", "they", "move", "we", "need", "to", "be", "able", "touch", "souls"},
            //16
            {"nature", "native", "american", "proverb", "we", "don’t", "inherit", "the", "earth", "from", "our", "ancestors", "borrow", "it", "children"},
            //17
            {"nature", "ralph", "waldo", "emerson", "every", "particular", "in", "a", "leaf", "drop", "crystal", "moment", "of", "time", "is", "related", "to", "the", "whole", "and", "partakes", "perfection"},
            //18
            {"nature", "beautiful", "things", "don’t", "ask", "for", "attention"},
            //19
            {"nature", "henry", "david", "thoreau", "heaven", "is", "under", "our", "feet", "as", "well", "over", "heads"},
            //20
            {"nature", "winston", "churchill", "solitary", "trees", "if", "they", "grow", "at", "all", "strong"},
            //21
            {"nature", "mahatma", "gandhi", "to", "forget", "how", "dig", "the", "earth", "and", "tend", "soil", "is", "ourselves"},
            //22
            {"nature", "frank", "lloyd", "wright", "study", "love", "stay", "close", "to", "it", "will", "never", "fail", "you"},
            //23
            {"nature", "robin", "williams", "spring", "is", "nature’s", "way", "of", "saying", "let’s", "party"},
            //24
            {"nature", "jane", "austen", "to", "sit", "in", "the", "shade", "on", "a", "fine", "day", "and", "look", "upon", "verdure", "is", "most", "perfect", "refreshment"},
            //25
            {"nature", "edmund", "burke", "never", "no", "did", "say", "one", "thing", "and", "wisdom", "another"},
            //26
            {"nature", "walt", "whitman", "i", "believe", "a", "leaf", "of", "grass", "is", "no", "less", "than", "the", "journeywork", "stars"},
            //27
            {"nature", "henry", "david", "thoreau", "i", "went", "to", "the", "woods", "because", "wished", "live", "deliberately", "front", "only", "essential", "facts", "of", "life", "and", "see", "if", "could", "not", "learn", "what", "it", "had", "teach", "when", "came", "die", "discover", "that", "lived"},
            //28
            {"nature", "joseph", "campbell", "the", "goal", "of", "life", "is", "to", "make", "your", "heartbeat", "match", "beat", "universe", "with"},
            //29
            {"nature", "dalai", "lama", "it", "is", "our", "collective", "and", "individual", "responsibility", "to", "preserve", "tend", "the", "world", "in", "which", "we", "all", "live"},
            //30
            {"nature", "blaise", "pascal", "is", "an", "infinite", "sphere", "of", "which", "the", "center", "everywhere", "and", "circumference", "nowhere"},
            //31
            {"nature", "ralph", "waldo", "emerson", "the", "first", "in", "time", "and", "importance", "of", "influences", "upon", "mind", "is", "that", "every", "day", "sun", "after", "sunset", "night", "her", "stars"},
            //32
            {"nature", "chinese", "proverb", "time", "and", "patience", "are", "the", "three", "great", "physicians"},
            //33
            {"nature", "john", "keats", "the", "poetry", "of", "earth", "is", "never", "dead"},
            //34
            {"nature", "matshona", "dhliwayo", "an", "inflexible", "tree", "breaks", "in", "a", "storm"},
            //35
            {"nature", "helen", "keller", "to", "me", "a", "lush", "carpet", "of", "pine", "needles", "or", "spongy", "grass", "is", "more", "welcome", "than", "the", "most", "luxurious", "persian", "rug"},
            //36
            {"nature", "william", "shakespeare", "the", "earth", "has", "music", "for", "those", "who", "listen"},
            //37
            {"nature", "ralph", "waldo", "emerson", "adopt", "the", "pace", "of", "her", "secret", "is", "patience"},
            //38
            {"nature", "john", "ruskin", "sunshine", "is", "delicious", "rain", "refreshing", "wind", "braces", "us", "up", "snow", "exhilarating", "there", "really", "such", "thing", "as", "bad", "weather", "only", "different", "kinds", "of", "good"},
            //39
            {"nature", "voltaire", "men", "argue", "acts"},
            //40
            {"nature", "charlotte", "eriksson", "there’s", "a", "whole", "world", "out", "there", "right", "outside", "your", "window", "you’d", "be", "fool", "to", "miss", "it"},
            //41
            {"nature", "jimmy", "carter", "like", "music", "and", "art", "love", "of", "is", "a", "common", "language", "that", "can", "transcend", "political", "or", "social", "boundaries"},
            //42
            {"nature", "robert", "frost", "the", "woods", "are", "lovely", "dark", "and", "deep", "but", "i", "have", "promises", "to", "keep", "miles", "go", "before", "sleep"},
            //43
            {"nature", "katrina", "mayer", "time", "spent", "amongst", "trees", "is", "never", "wasted"},
            //44
            {"nature", "henry", "david", "thoreau", "an", "early", "morning", "walk", "is", "a", "blessing", "for", "the", "whole", "day"},
            //45
            {"nature", "isaac", "newton", "is", "pleased", "with", "simplicity", "and", "no", "dummy"},
            //46
            {"nature", "john", "lubbock", "rest", "is", "not", "idleness", "and", "to", "lie", "sometimes", "on", "the", "grass", "under", "trees", "a", "summer’s", "day", "listening", "murmur", "of", "water", "or", "watching", "clouds", "float", "across", "sky", "by", "no", "means", "waste", "time"},
            //47
            {"nature", "james", "russell", "lowell", "a", "weed", "is", "no", "more", "than", "flower", "in", "disguise"},
            //48
            {"nature", "michel", "de", "montaigne", "let", "us", "permit", "to", "have", "her", "way", "she", "understands", "business", "better", "than", "we", "do"},
            //49
            {"nature", "leonardo", "da", "vinci", "water", "is", "the", "driving", "force", "of", "all"},
            //50
            {"nature", "mattie", "stepanek", "sunset", "is", "still", "my", "favorite", "color", "and", "rainbow", "second"},
            //51
            {"nature", "henry", "david", "thoreau", "i", "took", "a", "walk", "in", "the", "woods", "and", "came", "out", "taller", "than", "trees"},
            //52
            {"nature", "robert", "louis", "stevenson", "don’t", "judge", "each", "day", "by", "the", "harvest", "you", "reap", "but", "seeds", "plant"},
            //53
            {"nature", "haruki", "murakami", "not", "just", "beautiful", "though—the", "stars", "are", "like", "the", "trees", "in", "forest", "alive", "and", "breathing", "they’re", "watching", "me"},
            //54
            {"nature", "oliver", "wendell", "holmes", "sr", "the", "amen", "of", "is", "always", "a", "flower"},
            //55
            {"nature", "be", "kind", "to", "everything", "that", "lives"},
            //56
            {"nature", "marie", "curie", "all", "my", "life", "through", "the", "new", "sights", "of", "made", "me", "rejoice", "like", "a", "child"},
            //57
            {"nature", "sylvia", "plath", "i", "felt", "my", "lungs", "inflate", "with", "the", "onrush", "of", "scenery—air", "mountains", "trees", "people", "thought", "‘this", "is", "what", "it", "to", "be", "happy"},
            //58
            {"nature", "j", "drew", "lanham", "i", "believe", "the", "best", "way", "to", "begin", "reconnecting", "humanity's", "heart", "mind", "and", "soul", "is", "for", "us", "share", "our", "individual", "stories"},
            //59
            {"nature", "richard", "feynman", "i", "think", "nature’s", "imagination", "is", "so", "much", "greater", "than", "man’s", "she’s", "never", "going", "to", "let", "us", "relax"},
            //60
            {"nature", "andy", "warhol", "land", "really", "is", "the", "best", "art"},
            //61
            {"nature", "amit", "ray", "looking", "at", "beauty", "in", "the", "world", "is", "first", "step", "of", "purifying", "mind"},
            //62
            {"nature", "martin", "luther", "king", "jr", "for", "in", "the", "true", "of", "things", "if", "we", "rightly", "consider", "every", "green", "tree", "is", "far", "more", "glorious", "than", "it", "were", "made", "gold", "and", "silver"},
            //63
            {"nature", "gretel", "ehrlich", "everything", "in", "invites", "us", "constantly", "to", "be", "what", "we", "are"},
            //64
            {"nature", "alex", "trebek", "if", "you", "can’t", "be", "in", "awe", "of", "mother", "there’s", "something", "wrong", "with"},
            //65
            {"nature", "leigh", "hunt", "colors", "are", "the", "smiles", "of"},
            //66
            {"nature", "d", "h", "lawrence", "the", "fairest", "thing", "in", "a", "flower", "still", "has", "its", "roots", "earth", "and", "manure"},
            //67
            {"nature", "theodore", "roethke", "deep", "in", "their", "roots", "all", "flowers", "keep", "the", "light"},
            //68
            {"nature", "ralph", "waldo", "emerson", "a", "friend", "may", "well", "be", "reckoned", "the", "masterpiece", "of"},
            //69
            {"nature", "ralph", "waldo", "emerson", "everything", "in", "goes", "by", "law", "and", "not", "luck"},
            //70
            {"nature", "ralph", "waldo", "emerson", "is", "loved", "by", "what", "best", "in", "us"},
            //71
            {"nature", "john", "muir", "between", "every", "two", "pines", "there", "is", "a", "doorway", "to", "new", "world"},
            //72
            {"nature", "rainer", "maria", "rilke", "if", "we", "surrendered", "to", "earth’s", "intelligence", "could", "rise", "up", "rooted", "like", "trees"},
            //73
            {"nature", "caring", "for", "the", "earth", "is", "not", "a", "hippie", "thing", "it’s", "survival"},
            //74
            {"nature", "zeno", "the", "goal", "of", "life", "is", "living", "in", "agreement", "with"},
            //75
            {"nature", "laura", "ingalls", "wilder", "if", "you", "truly", "love", "will", "find", "beauty", "everywhere"},
            //76
            {"nature", "henry", "wadsworth", "longfellow", "the", "best", "thing", "one", "can", "do", "when", "it’s", "raining", "is", "to", "let", "it", "rain"},
            //77
            {"nature", "rachel", "carson", "some", "of", "nature’s", "most", "exquisite", "handiwork", "is", "on", "a", "miniature", "scale", "as", "anyone", "knows", "who", "has", "applied", "magnifying", "glass", "to", "snowflake"},
            //78
            {"nature", "l", "wolfe", "gilbert", "those", "who", "find", "beauty", "in", "all", "of", "will", "themselves", "at", "one", "with", "the", "secrets", "life", "itself"},
            //79
            {"nature", "brooke", "hampton", "life", "sucks", "a", "lot", "less", "when", "you", "add", "mountain", "air", "campfire", "and", "some", "peace", "quiet"},
            //80
            {"nature", "wikipedia", "in", "the", "broadest", "sense", "is", "natural", "physical", "or", "material", "world", "universe"},
            //81
            {"nature", "gerard", "de", "nerval", "every", "flower", "is", "a", "soul", "blossoming", "in"},
            //82
            {"nature", "ralph", "waldo", "emerson", "the", "earth", "laughs", "in", "flowers"},
            //83
            {"nature", "carl", "sagan", "preserve", "and", "cherish", "the", "pale", "blue", "dot", "only", "home", "we’ve", "ever", "known"},
            //84
            {"nature", "dogen", "although", "we", "say", "mountains", "belong", "to", "the", "country", "actually", "they", "those", "that", "love", "them"},
            //85
            {"nature", "toni", "morrison", "at", "some", "point", "in", "life", "the", "world’s", "beauty", "becomes", "enough", "you", "don’t", "need", "to", "photograph", "paint", "or", "even", "remember", "it", "is"},
            //86
            {"nature", "hal", "borland", "knowing", "trees", "i", "understand", "the", "meaning", "of", "patience", "grass", "can", "appreciate", "persistence"},
            //87
            {"nature", "anne", "frank", "the", "best", "remedy", "for", "those", "who", "are", "afraid", "lonely", "or", "unhappy", "is", "to", "go", "outside", "somewhere", "where", "they", "can", "be", "quite", "alone", "with", "heavens", "and", "god"},
            //88
            {"nature", "natalie", "angier", "the", "beauty", "of", "natural", "world", "lies", "in", "details"},
            //89
            {"nature", "aldous", "huxley", "my", "father", "considered", "a", "walk", "among", "the", "mountains", "as", "equivalent", "of", "churchgoing"},
            //90
            {"nature", "john", "muir", "the", "clearest", "way", "into", "universe", "is", "through", "a", "forest", "wilderness"},
            //91
            {"nature", "albert", "einstein", "if", "the", "bee", "disappears", "from", "surface", "of", "earth", "man", "would", "have", "no", "more", "than", "four", "years", "to", "live"},
            //92
            {"nature", "henry", "van", "dyke", "use", "what", "talents", "you", "possess", "the", "woods", "would", "be", "very", "silent", "if", "no", "birds", "sang", "there", "except", "those", "that", "best"},
            //93
            {"nature", "hans", "christian", "andersen", "just", "living", "is", "not", "enough", "one", "must", "have", "sunshine", "freedom", "and", "a", "little", "flower"},
            //94
            {"nature", "aristotle", "does", "nothing", "uselessly"},
            //95
            {"nature", "galileo", "galilei", "the", "sun", "with", "all", "those", "planets", "revolving", "around", "it", "and", "dependent", "on", "can", "still", "ripen", "a", "bunch", "of", "grapes", "as", "if", "had", "nothing", "else", "in", "universe", "to", "do"},
            //96
            {"nature", "maxime", "lagacé", "by", "discovering", "you", "discover", "yourself"},
            //97
            {"nature", "aristotle", "in", "all", "things", "of", "there", "is", "something", "the", "marvelous"},
            //98
            {"nature", "pythagoras", "leave", "the", "road", "take", "trails"},
            //99
            {"nature", "william", "shakespeare", "i", "like", "this", "place", "and", "could", "willingly", "waste", "my", "time", "in", "it"},
            //100
            {"nature", "donald", "miller", "all", "the", "trees", "are", "losing", "their", "leaves", "and", "not", "one", "of", "them", "is", "worried"},
            //101
            {"nature", "barack", "obama", "we", "are", "the", "first", "generation", "to", "feel", "effect", "of", "climate", "change", "and", "last", "who", "can", "do", "something", "about", "it"},
            //102
            {"nature", "louis", "schwartzberg", "nature’s", "beauty", "is", "a", "gift", "that", "cultivates", "appreciation", "and", "gratitude"},
            //103
            {"nature", "john", "muir", "i", "never", "saw", "a", "discontented", "tree"},
            //104
            {"nature", "ansel", "adams", "yosemite", "valley", "to", "me", "is", "always", "a", "sunrise", "glitter", "of", "green", "and", "golden", "wonder", "in", "vast", "edifice", "stone", "space"},
            //105
            {"nature", "henry", "david", "thoreau", "live", "in", "each", "season", "as", "it", "passes", "breathe", "the", "air", "drink", "taste", "fruit", "and", "resign", "yourself", "to", "influence", "of", "earth"},
            //106
            {"nature", "emma", "goldman", "i’d", "rather", "have", "roses", "on", "my", "table", "than", "diamonds", "neck"},
            //107
            {"nature", "henry", "miller", "the", "world", "is", "not", "to", "be", "put", "in", "order", "it", "for", "us", "ourselves", "unison", "with", "this"},
            //108
            {"nature", "frank", "lloyd", "wright", "i", "believe", "in", "god", "only", "spell", "it"},
            //109
            {"nature", "elisabeth", "küblerross", "kublerross", "should", "you", "shield", "the", "canyons", "from", "windstorms", "would", "never", "see", "true", "beauty", "of", "their", "carvings"},
            //110
            {"nature", "albert", "einstein", "look", "deep", "into", "and", "then", "you", "will", "understand", "everything", "better"},
            //111
            {"nature", "george", "santayana", "the", "family", "is", "one", "of", "nature’s", "masterpieces"},
            //112
            {"nature", "e", "cummings", "the", "world", "is", "mudluscious", "and", "puddlewonderful"},
            //113
            {"nature", "aristotle", "if", "one", "way", "be", "better", "than", "another", "that", "you", "may", "sure", "is", "nature’s"},
            //114
            {"nature", "john", "muir", "and", "into", "the", "forest", "i", "go", "to", "lose", "my", "mind", "find", "soul"},
            //115
            {"nature", "dante", "alighieri", "is", "the", "art", "of", "god"},
            //116
            {"nature", "rachel", "carson", "there", "is", "something", "infinitely", "healing", "in", "the", "repeated", "refrains", "of", "assurance", "that", "dawn", "comes", "after", "night", "and", "spring", "winter"},
            //117
            {"nature", "chinese", "proverb", "whoever", "loves", "and", "understands", "a", "garden", "will", "find", "contentment", "within"},
            //118
            {"nature", "khalil", "gibran", "forget", "not", "that", "the", "earth", "delights", "to", "feel", "your", "bare", "feet", "and", "winds", "long", "play", "with", "hair"},
            //119
            {"nature", "standing", "bear", "man’s", "heart", "away", "from", "becomes", "hard"},
            //120
            {"nature", "john", "muir", "when", "one", "tugs", "at", "a", "single", "thing", "in", "he", "finds", "it", "attached", "to", "the", "rest", "of", "world"},
            //121
            {"nature", "jason", "ward", "birds", "have", "always", "had", "the", "ability", "to", "bring", "me", "out", "of", "a", "dark", "space", "and", "provide", "relief", "in", "bad", "times"},
            //122
            {"nature", "john", "muir", "god", "has", "cared", "for", "these", "trees", "saved", "them", "from", "drought", "disease", "avalanches", "and", "a", "thousand", "tempests", "floods", "but", "he", "cannot", "save", "fools"},
            //123
            {"nature", "gary", "snyder", "is", "not", "a", "place", "to", "visit", "it", "home"},
            //124
            {"nature", "rembrandt", "choose", "only", "one", "master"},
            //125
            {"nature", "wendell", "berry", "the", "earth", "is", "what", "we", "all", "have", "in", "common"},
            //126
            {"nature", "rachel", "carson", "those", "who", "contemplate", "the", "beauty", "of", "earth", "find", "reserves", "strength", "that", "will", "endure", "as", "long", "life", "lasts"},
            //127
            {"nature", "ralph", "waldo", "emerson", "many", "eyes", "go", "through", "the", "meadow", "but", "few", "see", "flowers", "in", "it"},
            //128
            {"nature", "mary", "davis", "to", "walk", "into", "is", "witness", "a", "thousand", "miracles"},
            //129
            {"nature", "langston", "hughes", "let", "the", "rain", "kiss", "you", "beat", "upon", "your", "head", "with", "silver", "liquid", "drops", "sing", "a", "lullaby"},
            //130
            {"nature", "a", "d", "williams", "take", "a", "quit", "walk", "with", "mother", "it", "will", "nurture", "your", "mind", "body", "and", "soul"},
            //131
            {"nature", "claude", "monet", "my", "wish", "is", "to", "stay", "always", "like", "this", "living", "quietly", "in", "a", "corner", "of"},
            //132
            {"nature", "william", "wordsworth", "the", "ocean", "is", "a", "mighty", "harmonist"},
            //133
            {"nature", "jane", "goodall", "deforestation", "is", "changing", "our", "climate", "harming", "people", "and", "the", "natural", "world", "we", "must", "can", "reverse", "this", "trend"},
            //134
            {"nature", "antoinette", "brown", "blackwell", "is", "just", "enough", "but", "men", "and", "women", "must", "comprehend", "accept", "her", "suggestions"},
            //135
            {"nature", "lao", "tzu", "love", "the", "world", "as", "your", "own", "self", "then", "you", "can", "truly", "care", "for", "all", "things"},
            //136
            {"nature", "i", "love", "places", "that", "make", "you", "realize", "how", "tiny", "and", "your", "problems", "are"},
            //137
            {"nature", "henri", "matisse", "there", "are", "always", "flowers", "for", "those", "who", "want", "to", "see", "them"},
            //138
            {"nature", "david", "attenborough", "i", "just", "wish", "the", "world", "was", "twice", "as", "big", "and", "half", "of", "it", "still", "unexplored"},
            //139
            {"nature", "robert", "louis", "stevenson", "it", "is", "not", "so", "much", "for", "its", "beauty", "that", "the", "forest", "makes", "a", "claim", "upon", "men’s", "hearts", "as", "subtle", "something", "quality", "of", "air", "emanation", "from", "old", "trees", "wonderfully", "changes", "and", "renews", "weary", "spirit"},
            //140
            {"nature", "francis", "bacon", "to", "be", "controlled", "must", "obeyed"},
            //141
            {"nature", "walt", "whitman", "a", "morningglory", "at", "my", "window", "satisfies", "me", "more", "than", "the", "metaphysics", "of", "books"},
            //142
            {"nature", "angie", "weilandcrosby", "in", "a", "world", "of", "constant", "change", "and", "streaming", "technology", "i", "find", "solace", "the", "forest", "where", "tree", "remains"},
            //143
            {"nature", "albert", "einstein", "we", "still", "do", "not", "know", "one", "thousandth", "of", "percent", "what", "has", "revealed", "to", "us"},
            //144
            {"nature", "alice", "walker", "in", "nothing", "is", "perfect", "and", "everything", "trees", "can", "be", "contorted", "bent", "weird", "ways", "they’re", "still", "beautiful"},
            //145
            {"nature", "jason", "ward", "being", "able", "to", "smell", "the", "fresh", "air", "and", "disconnect", "from", "news", "your", "phone—there’s", "nothing", "like", "it"},
            //146
            {"nature", "theodore", "roethke", "over", "every", "mountain", "there", "is", "a", "path", "although", "it", "may", "not", "be", "seen", "from", "the", "valley"},
            //147
            {"nature", "claude", "monet", "the", "richness", "i", "achieve", "comes", "from", "source", "of", "my", "inspiration"},
            //148
            {"nature", "john", "muir", "going", "to", "the", "mountains", "is", "like", "home"},
            //149
            {"nature", "riccardo", "bozzi", "it", "is", "said", "that", "the", "forest", "has", "a", "certain", "limit", "if", "you", "look", "straight", "ahead", "but", "sides", "are", "boundless"}
    };

    public static String getNatureQuote(int position) {
        return quotesNature[position];
    }

    public static String getNatureAuthor(int position) {
        return quotesNatureAuthors[position];
    }

    public static String[] getNatureList() {
        return quotesNature;
    }

    static String[][] getNatureTags() {
        return natureTags;
    }

    public static int getNatureListSize() {
        return quotesNature.length;
    }
}
