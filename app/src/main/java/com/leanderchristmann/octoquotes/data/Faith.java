package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Faith {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesFaith and quotesFaithAuthors
        int listSize = getFaithListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesFaith[randomIndexToSwap];
            tempAuthor = quotesFaithAuthors[randomIndexToSwap];
            tempTags = faithTags[randomIndexToSwap];
            quotesFaith[randomIndexToSwap] = quotesFaith[i];
            quotesFaithAuthors[randomIndexToSwap] = quotesFaithAuthors[i];
            faithTags[randomIndexToSwap] = faithTags[i];
            quotesFaith[i] = tempQuote;
            quotesFaithAuthors[i] = tempAuthor;
            faithTags[i] = tempTags;
        }
    }

    private static String[] quotesFaith = {
            //0
            "\"For God so loved the world that He gave his one and only Son, that whoever believes in Him shall not perish but have eternal life.\"",
            //1
            "\"And above all things have fervent love for one another, for love will cover a multitude of sins.\"",
            //2
            "\"Be not quick in your spirit to become angry, for anger lodges in the heart of fools.\"",
            //3
            "\"When I called, you answered me; you made me bold and stout-hearted.\"",
            //4
            "\"For whatever things were written before were written for our learning, that we through the patience and comfort of the Scriptures might have hope.\"",
            //5
            "\"You have turned for me my mourning into dancing; you have loosed my sackcloth and clothed me with gladness.\"",
            //6
            "\"But they who wait for the Lord shall renew their strength; they shall mount up with wings like eagles; they shall run and not be weary; they shall walk and not faint.\"",
            //7
            "\"Don’t you know that you yourselves are God’s temple and that God’s Spirit dwells in your midst?\"",
            //8
            "\"And now these three remain: faith, hope, and love. But the greatest of these is love.\"",
            //9
            "\"The light shines in the darkness, and the darkness has not overcome it.\"",
            //10
            "\"Follow the way of love and eagerly desire spiritual gifts, especially the gift of prophecy.\"",
            //11
            "\"Do not be misled: ‘Bad company corrupts good character.\"",
            //12
            "\"Your faith can move mountains and your doubt can create them.\"",
            //13
            "\"Be very careful, then, how you live – not as unwise but as wise.\"",
            //14
            "\"Enter through the narrow gate. For wide is the gate and broad is the road that leads to destruction, and many enter through it.\"",
            //15
            "\"For as woman came from man, so also man is born of woman. But everything comes from God.\"",
            //16
            "\"Start children off on the way they should go, and even when they are old they will not turn from it.\"",
            //17
            "\"Now faith is the assurance of things hoped for, the conviction of things not seen.\"",
            //18
            "\"There is no fear in love. But perfect love drives out fear, because fear has to do with punishment. The one who fears is not made perfect in love.\"",
            //19
            "\"Be on your guard; stand firm in the faith; be courageous; be strong.\"",
            //20
            "\"Woe to those who call evil good and good evil, who put darkness for light and light for darkness, who put bitter for sweet and sweet for bitter.\"",
            //21
            "\"My command is this: Love each other as I have loved you.\"",
            //22
            "\"For sin shall no longer be your master, because you are not under the law, but under grace.\"",
            //23
            "\"Even so the body is not made up of one part but of many.\"",
            //24
            "\"Blessed are the merciful, for they will be shown mercy.\"",
            //25
            "\"Do not let any unwholesome talk come out of your mouths, but only what is helpful for building others up according to their needs, that it may benefit those who listen.\"",
            //26
            "\"For the Lord takes delight in His people; He crowns the humble with salvation.\"",
            //27
            "\"But seek first the kingdom of God and his righteousness, and all these things will be added to you.\"",
            //28
            "\"Our faith can move mountains.\"",
            //29
            "\"Do not forget to show hospitality to strangers, for by so doing some people have shown hospitality to angels without knowing it.\"",
            //30
            "\"For we walk by faith, not by sight.\"",
            //31
            "\"The lord of hosts is with us; the God of Jacob is our fortress.\"",
            //32
            "\"Have I not commanded you? Be strong and courageous. Do not be frightened, and do not be dismayed, for the LORD your God is with you wherever you go.\"",
            //33
            "\"Do not judge, or you too will be judged.\"",
            //34
            "\"I am the good shepherd. The good shepherd lays down his life for the sheep.\"",
            //35
            "\"But I tell you, love your enemies and pray for those who persecute you.\"",
            //36
            "\"Ask and it will be given to you; seek and you will find; knock and the door will be opened to you.\"",
            //37
            "\"Pride goes before destruction, a haughty spirit before a fall.\"",
            //38
            "\"There is a time for everything, and a season for every activity under the heavens.\"",
            //39
            "\"Do to others as you would have them do to you.\"",
            //40
            "\"With God all things are possible.\"",
            //41
            "\"Don’t let anyone look down on you because you are young, but set an example for the believers in speech, in conduct, in love, in faith and in purity.\"",
            //42
            "\"If we claim to be without sin, we deceive ourselves and the truth is not in us.\"",
            //43
            "\"God promises to make something good out of the storms that bring devastation to your life.\"",
            //44
            "\"I consider that our present sufferings are not worth comparing with the glory that will be revealed in us.\"",
            //45
            "\"Remember this: Whoever sows sparingly will also reap sparingly, and whoever sows generously will also reap generously.\"",
            //46
            "\"Now faith is being sure of what we hope for and certain of what we do not see.\"",
            //47
            "\"Be strong and courageous. Do not be afraid or terrified because of them, for the lord your God goes with you; he will never leave you nor forsake you.\"",
            //48
            "\"And let us consider how we may spur one another on toward love and good deeds.\"",
            //49
            "\"Be alert and of sober mind. Your enemy the devil prowls around like a roaring lion looking for someone to devour.\"",
            //50
            "\"Jesus looked at them and said, ‘With man this is impossible, but not with God; all things are possible with God.\"",
            //51
            "\"Do not store up for yourselves treasures on earth, where moth and rust destroy, and where thieves break in and steal.\"",
            //52
            "\"The lord is my shepherd, I lack nothing.\"",
            //53
            "\"For where your treasure is, there your heart will be also.\"",
            //54
            "\"I have no greater joy than to hear that my children are walking in the truth.\"",
            //55
            "\"For our struggle is not against flesh and blood, but against the rulers, against the authorities, against the powers of this dark world and against the spiritual forces of evil in the heavenly realms.\"",
            //56
            "\"A faithful man shall abound with blessings.\"",
            //57
            "\"Give thanks to the Lord for He is good: His love endures forever.\"",
            //58
            "\"A new command I give you: Love one another. As I have loved you, so you must love one another.\"",
            //59
            "\"Here are different kinds of gifts, but the same Spirit distributes them.\"",
            //60
            "\"Be strong and take heart, all who hope in the Lord.\"",
            //61
            "\"We must pay the most careful attention, therefore, to what we have heard, so that we do not drift away.\"",
            //62
            "\"But the fruit of the Spirit is love, joy, peace, patience, kindness, goodness, faithfulness.\"",
            //63
            "\"Consider it pure joy, my brothers and sisters, whenever you face trials of many kinds.\"",
            //64
            "\"So, if you think you are standing firm, be careful that you don’t fall!\"",
            //65
            "\"My dear brothers and sisters, take note of this: Everyone should be quick to listen, slow to speak and slow to become angry.\"",
            //66
            "\"Blessed are the meek, for they will inherit the earth.\"",
            //67
            "\"You have been born anew, not from perishable but from imperishable seed, through the living and abiding word of God.\"",
            //68
            "\"Have nothing to do with the fruitless deeds of darkness, but rather expose them.\"",
            //69
            "\"He only is my rock and my salvation, my fortress; I shall not be shaken.\"",
            //70
            "\"Accept those whose faith is weak, without quarreling over disputable matters.\"",
            //71
            "\"A cheerful heart is good medicine, but a crushed spirit dries up the bones.\"",
            //72
            "\"So whether you eat or drink or whatever you do, do it all for the glory of God.\"",
            //73
            "\"Mercy, peace and love be yours in abundance.\"",
            //74
            "\"Be on your guard; stand firm in the faith; be courageous; be strong.\"",
            //75
            "\"Whoever does not love does not know God, because God is love.\"",
            //76
            "\"For I know the plans I have for you ... plans to prosper you and not to harm you, plans to give you hope and a future.\"",
            //77
            "\"If it is possible, as far as it depends on you, live at peace with everyone.\"",
            //78
            "\"And my God will supply every need of yours according to his riches in glory in Christ Jesus.\"",
            //79
            "\"And now these three remain: faith, hope and love. But the greatest of these is love.\"",
            //80
            "\"Finally, all of you, be like-minded, be sympathetic, love one another, be compassionate and humble.\"",
            //81
            "\"This is my comfort in my affliction, that your promise gives me life.\"",
            //82
            "\"Let love be genuine. Abhor what is evil; hold fast to what is good.\"",
            //83
            "\"And the peace of God, which transcends all understanding, will guard your hearts and your minds in Christ Jesus.\"",
            //84
            "\"You see that people are justified by what they do and not by faith alone.\"",
            //85
            "\"Train up a child in the way he should go, and when he is old, he will not depart from it.\"",
            //86
            "\"Be careful, however, that the exercise of your rights does not become a stumbling block to the weak.\"",
            //87
            "\"There is no fear in love; for perfect love drives out fear.\"",
            //88
            "\"Do nothing out of selfish ambition or vain conceit. Rather, in humility value others above yourselves.\"",
            //89
            "\"Above all else, guard your heart, for everything you do flows from it.\"",
            //90
            "\"He gives power to the weak and strength to the powerless.\"",
            //91
            "\"What good is it for you to gain the whole world, yet forfeit your soul?\"",
            //92
            "\"Be joyful in hope, patient in affliction, faithful in prayer.\"",
            //93
            "\"Come to me, all who labor and are heavy laden, and I will give you rest.\"",
            //94
            "\"’I have the right to do anything,’ you say – but not everything is beneficial. ‘I have the right to do anything’ – but I will not be mastered by anything.\"",
            //95
            "\"Have you experienced so much in vain – if it really was in vain?\"",
            //96
            "\"They joy before thee according the joy in the harvest.\"",
            //97
            "\"Blessed are the peacemakers, for they will be called children of God.\"",
            //98
            "\"Old things are passed away; behold, all things are become new.\"",
            //99
            "\"Forget the former things; do not dwell on the past. See, I am doing a new thing!\"",
            //100
            "\"Then shall the righteous shine forth as the sun in the kingdom of the Father.\"",
            //101
            "\"Even though I walk through the valley of the shadow of death, I fear no evil, for You are with me; Your rod and Your staff, they comfort me.\"",
            //102
            "\"Be devoted to one another in love. Honor one another above yourselves.\"",
            //103
            "\"Cast all your anxiety on him because he cares for you.\"",
            //104
            "\"But the Lord stood with me and gave me strength.\"",
            //105
            "\"As a mother comforts her child, so I will comfort you; in Jerusalem you shall find your comfort.\"",
            //106
            "\"Keep on loving one another as brothers and sisters.\"",
            //107
            "\"Love is patient, love is kind. It does not envy, it does not boast, it is not proud.\"",
            //108
            "\"Dear children, let us not love with words or tongue but with actions and in truth.\"",
            //109
            "\"Get rid of all bitterness, rage and anger, brawling and slander, along with every form of malice.\"",
            //110
            "\"Blessed are those who hunger and thirst for righteousness, for they will be filled.\"",
            //111
            "\"Love must be sincere. Hate what is evil; cling to what is good.\"",
            //112
            "\"Afflictions are but the shadows of God’s wings.\"",
            //113
            "\"Faith is taking the first step even when you don’t see the whole staircase.\"",
            //114
            "\"Meet your fears with faith.\"",
            //115
            "\"The lord of hosts is with us; the God of Jacob is our fortress.\"",
            //116
            "\"But they who wait for the lord shall renew their strength; they shall mount up with wings like eagles; they shall run and not be weary; they shall walk and not faint.\"",
            //117
            "\"The name of the lord is a strong tower; the righteous man runs into it and is safe.\"",
            //118
            "\"God is more glorified in us when we are most satisfied in him.\"",
            //119
            "\"This is my comfort in my affliction, that your promise gives me life.\"",
            //120
            "\"You are my hiding place and my shield;I hope in your word. Depart from me, you evildoers, that I may keep the commandments of my God.\"",
            //121
            "\"Even though I walk through the valley of the shadow of death, I will fear no evil, for you are with me; your rod and your staff, they comfort me.\"",
            //122
            "\"Come to me, all who labor and are heavy laden, and I will give you rest.\"",
            //123
            "\"And my God will supply every need of yours according to his riches in glory in Christ Jesus.\"",
            //124
            "\"I have set the lord always before me; because he is at my right hand, I shall not be shaken.\"",
            //125
            "\"This life was not intended to be the place of our perfection, but the preparation for it.\"",
            //126
            "\"When you pass through the waters, I will be with you; and through the rivers, they shall not overwhelm you; when you walk through fire you shall not be burned, and the flame shall not consume you.\"",
            //127
            "\"The steadfast love of the lord never ceases; his mercies never come to an end; they are new every morning; great is your faithfulness.\"",
            //128
            "\"Fear not, for I am with you; be not dismayed, for I am your God; I will strengthen you, I will help you, I will uphold you with my righteous right hand.\"",
            //129
            "\"Prayer puts God’s work in his hands and keeps it there.\"",
            //130
            "\"Be strong, and let your heart take courage, all you who wait for the lord\"",
            //131
            "\"You will never need more than he can supply.\"",
            //132
            "\"My home is in heaven. I’m just traveling through this world.\"",
            //133
            "\"Therefore encourage one another and build one another up, just as you are doing.\""
    };
    private static String[] quotesFaithAuthors = {
            //0
            "John 3:16",
            //1
            "1 Peter 4:8",
            //2
            "Ecclesiastes 7:9",
            //3
            "Psalm 138:3",
            //4
            "Romans 15:4",
            //5
            "Psalm 30:11",
            //6
            "Isaiah 40:31",
            //7
            "1 Corinthians 3:16",
            //8
            "Corinthians 13:13",
            //9
            "John 1:5",
            //10
            "1 Corinthians 14:1",
            //11
            "1 Corinthians 15:33",
            //12
            "Unknown",
            //13
            "Ephesians 5:15",
            //14
            "Matthew 7:13",
            //15
            "1 Corinthians 11:12",
            //16
            "Proverbs 22:6",
            //17
            "Hebrews 11:1",
            //18
            "1 John 4:18",
            //19
            "1 Corinthians 16:33",
            //20
            "Isaiah 5:20",
            //21
            "John 15:12",
            //22
            "Romans 6:14",
            //23
            "1 Corinthians 12:14",
            //24
            "Matthew 5:7",
            //25
            "Ephesians 4:29",
            //26
            "Psalm 149:4",
            //27
            "Matthew 6:33",
            //28
            "Matthew 17:20",
            //29
            "Hebrews 13:2",
            //30
            "2 Corinthians 5:7",
            //31
            "Psalm 46:7",
            //32
            "Joshua 1:9",
            //33
            "Matthew 7:1",
            //34
            "John 10:11",
            //35
            "Matthew 5:44",
            //36
            "Matthew 7:7",
            //37
            "Proverbs 16:8",
            //38
            "Ecclesiastes 3:1",
            //39
            "Luke 6:31",
            //40
            "Matthew 19:26",
            //41
            "1 Timothy 4:12",
            //42
            "1 John 1:8",
            //43
            "Romans 8:28",
            //44
            "Romans 8:18",
            //45
            "2 Corinthians 9:6",
            //46
            "Hebrews 11:1",
            //47
            "Deuteronomy 31:6",
            //48
            "Hebrews 10:24",
            //49
            "1 Peter 5:8",
            //50
            "Mark 10:27",
            //51
            "Matthew 6:19",
            //52
            "Psalm 23:1",
            //53
            "Matthew 6:21",
            //54
            "3 John 1:4",
            //55
            "Ephesians 6:12",
            //56
            "Proverbs 28:20",
            //57
            "Psalm 107:1",
            //58
            "John 13:34",
            //59
            "1 Corinthians 12:4",
            //60
            "Psalm 31:25",
            //61
            "Hebrews 2:1",
            //62
            "Galatians 5:22",
            //63
            "James 1:2",
            //64
            "1 Corinthians 10:12",
            //65
            "James 1:19",
            //66
            "Matthew 5:5",
            //67
            "1 Peter 1:23",
            //68
            "Ephesians 5:11",
            //69
            "Psalm 62:6",
            //70
            "Romans 14:1",
            //71
            "Proverbs 17:22",
            //72
            "1 Corinthians 10:31",
            //73
            "Jude 1:2",
            //74
            "1 Corinthians 16:13",
            //75
            "1 John 4:8",
            //76
            "Jeremiah 29:11",
            //77
            "Romans 12:18",
            //78
            "Philippians 4:19",
            //79
            "1 Corinthians 13:13",
            //80
            "1 Peter 3:8",
            //81
            "Psalm 119:50",
            //82
            "Romans 12:9",
            //83
            "Philippians 4:7",
            //84
            "James 2:24",
            //85
            "Proverbs 22:6",
            //86
            "1 Corinthians 8:9",
            //87
            "John 4:18",
            //88
            "Philippians 2:3",
            //89
            "Proverbs 4:23",
            //90
            "Isaiah 40:29",
            //91
            "Mark 8:36",
            //92
            "Romans 12:12",
            //93
            "Matthew 11:28",
            //94
            "1 Corinthians 6:12",
            //95
            "Galatians 3:4",
            //96
            "Isaiah 9:3",
            //97
            "Matthew 5:9",
            //98
            "2 Corinthians 5:17",
            //99
            "Isaiah 43:18-19",
            //100
            "Matthew 13:43",
            //101
            "Psalm 23:4",
            //102
            "Romans 12:10",
            //103
            "1 Peter 5:7",
            //104
            "2 Timothy 4:17",
            //105
            "Isaiah 66:13",
            //106
            "Hebrews 13:1",
            //107
            "1 Corinthians 13:4",
            //108
            "1 John 3:18",
            //109
            "Ephesians 4:31",
            //110
            "Matthew 5:6",
            //111
            "Romans 12:9",
            //112
            "George MacDonald",
            //113
            "Martin Luther King Jr",
            //114
            "Max Lucado",
            //115
            "Psalm 46:7",
            //116
            "Isaiah 40:31",
            //117
            "Proverbs 18:10",
            //118
            "John Piper",
            //119
            "Psalm 119:50",
            //120
            "Psalm 119:114-115",
            //121
            "Psalm 23:4",
            //122
            "Matthew 11:28",
            //123
            "Philippians 4:19",
            //124
            "Psalm 16:8",
            //125
            "Richard Baxter",
            //126
            "Isaiah 43:2",
            //127
            "Lamentations 3:22-23",
            //128
            "Isaiah 41:10",
            //129
            "E.M. Bound",
            //130
            "Psalm 31:24",
            //131
            "J. I. Packer",
            //132
            "Billy Graham",
            //133
            "Thesselanonians 5:11"
    };
    private static String[][] faithTags = {
            //0
            {"faith", "john", "for", "god", "so", "loved", "the", "world", "that", "he", "gave", "his", "one", "and", "only", "son", "whoever", "believes", "in", "him", "shall", "not", "perish", "but", "have", "eternal", "life"},
            //1
            {"faith", "peter", "and", "above", "all", "things", "have", "fervent", "love", "for", "one", "another", "will", "cover", "a", "multitude", "of", "sins"},
            //2
            {"faith", "ecclesiastes", "be", "not", "quick", "in", "your", "spirit", "to", "become", "angry", "for", "anger", "lodges", "the", "heart", "of", "fools"},
            //3
            {"faith", "psalm", "when", "i", "called", "you", "answered", "me", "made", "bold", "and", "stouthearted"},
            //4
            {"faith", "romans", "for", "whatever", "things", "were", "written", "before", "our", "learning", "that", "we", "through", "the", "patience", "and", "comfort", "of", "scriptures", "might", "have", "hope"},
            //5
            {"faith", "psalm", "you", "have", "turned", "for", "me", "my", "mourning", "into", "dancing", "loosed", "sackcloth", "and", "clothed", "with", "gladness"},
            //6
            {"faith", "isaiah", "but", "they", "who", "wait", "for", "the", "lord", "shall", "renew", "their", "strength", "mount", "up", "with", "wings", "like", "eagles", "run", "and", "not", "be", "weary", "walk", "faint"},
            //7
            {"faith", "corinthians", "don’t", "you", "know", "that", "yourselves", "are", "god’s", "temple", "and", "spirit", "dwells", "in", "your", "midst"},
            //8
            {"faith", "corinthians", "and", "now", "these", "three", "remain", "hope", "love", "but", "the", "greatest", "of", "is"},
            //9
            {"faith", "john", "the", "light", "shines", "in", "darkness", "and", "has", "not", "overcome", "it"},
            //10
            {"faith", "corinthians", "follow", "the", "way", "of", "love", "and", "eagerly", "desire", "spiritual", "gifts", "especially", "gift", "prophecy"},
            //11
            {"faith", "corinthians", "do", "not", "be", "misled", "‘bad", "company", "corrupts", "good", "character"},
            //12
            {"faith", "your", "can", "move", "mountains", "and", "doubt", "create", "them"},
            //13
            {"faith", "ephesians", "be", "very", "careful", "then", "how", "you", "live", "not", "as", "unwise", "but", "wise"},
            //14
            {"faith", "matthew", "enter", "through", "the", "narrow", "gate", "for", "wide", "is", "and", "broad", "road", "that", "leads", "to", "destruction", "many", "it"},
            //15
            {"faith", "corinthians", "for", "as", "woman", "came", "from", "man", "so", "also", "is", "born", "of", "but", "everything", "comes", "god"},
            //16
            {"faith", "proverbs", "start", "children", "off", "on", "the", "way", "they", "should", "go", "and", "even", "when", "are", "old", "will", "not", "turn", "from", "it"},
            //17
            {"faith", "hebrews", "now", "is", "the", "assurance", "of", "things", "hoped", "for", "conviction", "not", "seen"},
            //18
            {"faith", "john", "there", "is", "no", "fear", "in", "love", "but", "perfect", "drives", "out", "because", "has", "to", "do", "with", "punishment", "the", "one", "who", "fears", "not", "made"},
            //19
            {"faith", "corinthians", "be", "on", "your", "guard", "stand", "firm", "in", "the", "courageous", "strong"},
            //20
            {"faith", "isaiah", "woe", "to", "those", "who", "call", "evil", "good", "and", "put", "darkness", "for", "light", "bitter", "sweet"},
            //21
            {"faith", "john", "my", "command", "is", "this", "love", "each", "other", "as", "i", "have", "loved", "you"},
            //22
            {"faith", "romans", "for", "sin", "shall", "no", "longer", "be", "your", "master", "because", "you", "are", "not", "under", "the", "law", "but", "grace"},
            //23
            {"faith", "corinthians", "even", "so", "the", "body", "is", "not", "made", "up", "of", "one", "part", "but", "many"},
            //24
            {"faith", "matthew", "blessed", "are", "the", "merciful", "for", "they", "will", "be", "shown", "mercy"},
            //25
            {"faith", "ephesians", "do", "not", "let", "any", "unwholesome", "talk", "come", "out", "of", "your", "mouths", "but", "only", "what", "is", "helpful", "for", "building", "others", "up", "according", "to", "their", "needs", "that", "it", "may", "benefit", "those", "who", "listen"},
            //26
            {"faith", "psalm", "for", "the", "lord", "takes", "delight", "in", "his", "people", "he", "crowns", "humble", "with", "salvation"},
            //27
            {"faith", "matthew", "but", "seek", "first", "the", "kingdom", "of", "god", "and", "his", "righteousness", "all", "these", "things", "will", "be", "added", "to", "you"},
            //28
            {"faith", "matthew", "our", "can", "move", "mountains"},
            //29
            {"faith", "hebrews", "do", "not", "forget", "to", "show", "hospitality", "strangers", "for", "by", "so", "doing", "some", "people", "have", "shown", "angels", "without", "knowing", "it"},
            //30
            {"faith", "corinthians", "for", "we", "walk", "by", "not", "sight"},
            //31
            {"faith", "psalm", "the", "lord", "of", "hosts", "is", "with", "us", "god", "jacob", "our", "fortress"},
            //32
            {"faith", "joshua", "have", "i", "not", "commanded", "you", "be", "strong", "and", "courageous", "do", "frightened", "dismayed", "for", "the", "lord", "your", "god", "is", "with", "wherever", "go"},
            //33
            {"faith", "matthew", "do", "not", "judge", "or", "you", "too", "will", "be", "judged"},
            //34
            {"faith", "john", "i", "am", "the", "good", "shepherd", "lays", "down", "his", "life", "for", "sheep"},
            //35
            {"faith", "matthew", "but", "i", "tell", "you", "love", "your", "enemies", "and", "pray", "for", "those", "who", "persecute"},
            //36
            {"faith", "matthew", "ask", "and", "it", "will", "be", "given", "to", "you", "seek", "find", "knock", "the", "door", "opened"},
            //37
            {"faith", "proverbs", "pride", "goes", "before", "destruction", "a", "haughty", "spirit", "fall"},
            //38
            {"faith", "ecclesiastes", "there", "is", "a", "time", "for", "everything", "and", "season", "every", "activity", "under", "the", "heavens"},
            //39
            {"faith", "luke", "do", "to", "others", "as", "you", "would", "have", "them"},
            //40
            {"faith", "matthew", "with", "god", "all", "things", "are", "possible"},
            //41
            {"faith", "timothy", "don’t", "let", "anyone", "look", "down", "on", "you", "because", "are", "young", "but", "set", "an", "example", "for", "the", "believers", "in", "speech", "conduct", "love", "and", "purity"},
            //42
            {"faith", "john", "if", "we", "claim", "to", "be", "without", "sin", "deceive", "ourselves", "and", "the", "truth", "is", "not", "in", "us"},
            //43
            {"faith", "romans", "god", "promises", "to", "make", "something", "good", "out", "of", "the", "storms", "that", "bring", "devastation", "your", "life"},
            //44
            {"faith", "romans", "i", "consider", "that", "our", "present", "sufferings", "are", "not", "worth", "comparing", "with", "the", "glory", "will", "be", "revealed", "in", "us"},
            //45
            {"faith", "corinthians", "remember", "this", "whoever", "sows", "sparingly", "will", "also", "reap", "and", "generously"},
            //46
            {"faith", "hebrews", "now", "is", "being", "sure", "of", "what", "we", "hope", "for", "and", "certain", "do", "not", "see"},
            //47
            {"faith", "deuteronomy", "be", "strong", "and", "courageous", "do", "not", "afraid", "or", "terrified", "because", "of", "them", "for", "the", "lord", "your", "god", "goes", "with", "you", "he", "will", "never", "leave", "nor", "forsake"},
            //48
            {"faith", "hebrews", "and", "let", "us", "consider", "how", "we", "may", "spur", "one", "another", "on", "toward", "love", "good", "deeds"},
            //49
            {"faith", "peter", "be", "alert", "and", "of", "sober", "mind", "your", "enemy", "the", "devil", "prowls", "around", "like", "a", "roaring", "lion", "looking", "for", "someone", "to", "devour"},
            //50
            {"faith", "mark", "jesus", "looked", "at", "them", "and", "said", "‘with", "man", "this", "is", "impossible", "but", "not", "with", "god", "all", "things", "are", "possible"},
            //51
            {"faith", "matthews", "do", "not", "store", "up", "for", "yourselves", "treasures", "on", "earth", "where", "moth", "and", "rust", "destroy", "thieves", "break", "in", "steal"},
            //52
            {"faith", "psalm", "the", "lord", "is", "my", "shepherd", "i", "lack", "nothing"},
            //53
            {"faith", "matthew", "for", "where", "your", "treasure", "is", "there", "heart", "will", "be", "also"},
            //54
            {"faith", "john", "i", "have", "no", "greater", "joy", "than", "to", "hear", "that", "my", "children", "are", "walking", "in", "the", "truth"},
            //55
            {"faith", "ephesians", "for", "our", "struggle", "is", "not", "against", "flesh", "and", "blood", "but", "the", "rulers", "authorities", "powers", "of", "this", "dark", "world", "spiritual", "forces", "evil", "in", "heavenly", "realms"},
            //56
            {"faith", "proverbs", "a", "faithful", "man", "shall", "abound", "with", "blessings"},
            //57
            {"faith", "psalm", "give", "thanks", "to", "the", "lord", "for", "he", "is", "good", "his", "love", "endures", "forever"},
            //58
            {"faith", "john", "a", "new", "command", "i", "give", "you", "love", "one", "another", "as", "have", "loved", "so", "must"},
            //59
            {"faith", "corinthians", "here", "are", "different", "kinds", "of", "gifts", "but", "the", "same", "spirit", "distributes", "them"},
            //60
            {"faith", "psalm", "be", "strong", "and", "take", "heart", "all", "who", "hope", "in", "the", "lord"},
            //61
            {"faith", "hebrews", "we", "must", "pay", "the", "most", "careful", "attention", "therefore", "to", "what", "have", "heard", "so", "that", "do", "not", "drift", "away"},
            //62
            {"faith", "galatians", "but", "the", "fruit", "of", "spirit", "is", "love", "joy", "peace", "patience", "kindness", "goodness", "faithfulness"},
            //63
            {"faith", "james", "consider", "it", "pure", "joy", "my", "brothers", "and", "sisters", "whenever", "you", "face", "trials", "of", "many", "kinds"},
            //64
            {"faith", "corinthians", "so", "if", "you", "think", "are", "standing", "firm", "be", "careful", "that", "don’t", "fall"},
            //65
            {"faith", "james", "my", "dear", "brothers", "and", "sisters", "take", "note", "of", "this", "everyone", "should", "be", "quick", "to", "listen", "slow", "speak", "become", "angry"},
            //66
            {"faith", "matthew", "blessed", "are", "the", "meek", "for", "they", "will", "inherit", "earth"},
            //67
            {"faith", "peter", "you", "have", "been", "born", "anew", "not", "from", "perishable", "but", "imperishable", "seed", "through", "the", "living", "and", "abiding", "word", "of", "god"},
            //68
            {"faith", "ephesians", "have", "nothing", "to", "do", "with", "the", "fruitless", "deeds", "of", "darkness", "but", "rather", "expose", "them"},
            //69
            {"faith", "psalm", "he", "only", "is", "my", "rock", "and", "salvation", "fortress", "i", "shall", "not", "be", "shaken"},
            //70
            {"faith", "romans", "accept", "those", "whose", "is", "weak", "without", "quarreling", "over", "disputable", "matters"},
            //71
            {"faith", "proverbs", "a", "cheerful", "heart", "is", "good", "medicine", "but", "crushed", "spirit", "dries", "up", "the", "bones"},
            //72
            {"faith", "corinthians", "so", "whether", "you", "eat", "or", "drink", "whatever", "do", "it", "all", "for", "the", "glory", "of", "god"},
            //73
            {"faith", "jude", "mercy", "peace", "and", "love", "be", "yours", "in", "abundance"},
            //74
            {"faith", "corinthians", "be", "on", "your", "guard", "stand", "firm", "in", "the", "courageous", "strong"},
            //75
            {"faith", "john", "whoever", "does", "not", "love", "know", "god", "because", "is"},
            //76
            {"faith", "jeremiah", "for", "i", "know", "the", "plans", "have", "you", "to", "prosper", "and", "not", "harm", "give", "hope", "a", "future"},
            //77
            {"faith", "romans", "if", "it", "is", "possible", "as", "far", "depends", "on", "you", "live", "at", "peace", "with", "everyone"},
            //78
            {"faith", "philippians", "and", "my", "god", "will", "supply", "every", "need", "of", "yours", "according", "to", "his", "riches", "in", "glory", "christ", "jesus"},
            //79
            {"faith", "corinthians", "and", "now", "these", "three", "remain", "hope", "love", "but", "the", "greatest", "of", "is"},
            //80
            {"faith", "peter", "finally", "all", "of", "you", "be", "likeminded", "sympathetic", "love", "one", "another", "compassionate", "and", "humble"},
            //81
            {"faith", "psalm", "this", "is", "my", "comfort", "in", "affliction", "that", "your", "promise", "gives", "me", "life"},
            //82
            {"faith", "romans", "let", "love", "be", "genuine", "abhor", "what", "is", "evil", "hold", "fast", "to", "good"},
            //83
            {"faith", "philippians", "and", "the", "peace", "of", "god", "which", "transcends", "all", "understanding", "will", "guard", "your", "hearts", "minds", "in", "christ", "jesus"},
            //84
            {"faith", "james", "you", "see", "that", "people", "are", "justified", "by", "what", "they", "do", "and", "not", "alone"},
            //85
            {"faith", "proverbs", "train", "up", "a", "child", "in", "the", "way", "he", "should", "go", "and", "when", "is", "old", "will", "not", "depart", "from", "it"},
            //86
            {"faith", "corinthians", "be", "careful", "however", "that", "the", "exercise", "of", "your", "rights", "does", "not", "become", "a", "stumbling", "block", "to", "weak"},
            //87
            {"faith", "john", "there", "is", "no", "fear", "in", "love", "for", "perfect", "drives", "out"},
            //88
            {"faith", "philippians", "do", "nothing", "out", "of", "selfish", "ambition", "or", "vain", "conceit", "rather", "in", "humility", "value", "others", "above", "yourselves"},
            //89
            {"faith", "proverbs", "above", "all", "else", "guard", "your", "heart", "for", "everything", "you", "do", "flows", "from", "it"},
            //90
            {"faith", "isaiah", "he", "gives", "power", "to", "the", "weak", "and", "strength", "powerless"},
            //91
            {"faith", "mark", "what", "good", "is", "it", "for", "you", "to", "gain", "the", "whole", "world", "yet", "forfeit", "your", "soul"},
            //92
            {"faith", "romans", "be", "joyful", "in", "hope", "patient", "affliction", "faithful", "prayer"},
            //93
            {"faith", "matthew", "come", "to", "me", "all", "who", "labor", "and", "are", "heavy", "laden", "i", "will", "give", "you", "rest"},
            //94
            {"faith", "corinthians", "’i", "have", "the", "right", "to", "do", "anything’", "you", "say", "but", "not", "everything", "is", "beneficial", "‘i", "i", "will", "be", "mastered", "by", "anything"},
            //95
            {"faith", "galatians", "have", "you", "experienced", "so", "much", "in", "vain", "if", "it", "really", "was"},
            //96
            {"faith", "isaiah", "they", "joy", "before", "thee", "according", "the", "in", "harvest"},
            //97
            {"faith", "matthew", "blessed", "are", "the", "peacemakers", "for", "they", "will", "be", "called", "children", "of", "god"},
            //98
            {"faith", "corinthians", "old", "things", "are", "passed", "away", "behold", "all", "become", "new"},
            //99
            {"faith", "isaiah", "forget", "the", "former", "things", "do", "not", "dwell", "on", "past", "see", "i", "am", "doing", "a", "new", "thing"},
            //100
            {"faith", "matthew", "then", "shall", "the", "righteous", "shine", "forth", "as", "sun", "in", "kingdom", "of", "father"},
            //101
            {"faith", "psalm", "even", "though", "i", "walk", "through", "the", "valley", "of", "shadow", "death", "fear", "no", "evil", "for", "you", "are", "with", "me", "your", "rod", "and", "staff", "they", "comfort"},
            //102
            {"faith", "romans", "be", "devoted", "to", "one", "another", "in", "love", "honor", "above", "yourselves"},
            //103
            {"faith", "peter", "cast", "all", "your", "anxiety", "on", "him", "because", "he", "cares", "for", "you"},
            //104
            {"faith", "timothy", "but", "the", "lord", "stood", "with", "me", "and", "gave", "strength"},
            //105
            {"faith", "isaiah", "as", "a", "mother", "comforts", "her", "child", "so", "i", "will", "comfort", "you", "in", "jerusalem", "shall", "find", "your"},
            //106
            {"faith", "hebrews", "keep", "on", "loving", "one", "another", "as", "brothers", "and", "sisters"},
            //107
            {"faith", "corinthians", "love", "is", "patient", "kind", "it", "does", "not", "envy", "boast", "proud"},
            //108
            {"faith", "john", "dear", "children", "let", "us", "not", "love", "with", "words", "or", "tongue", "but", "actions", "and", "in", "truth"},
            //109
            {"faith", "ephesians", "get", "rid", "of", "all", "bitterness", "rage", "and", "anger", "brawling", "slander", "along", "with", "every", "form", "malice"},
            //110
            {"faith", "matthew", "blessed", "are", "those", "who", "hunger", "and", "thirst", "for", "righteousness", "they", "will", "be", "filled"},
            //111
            {"faith", "romans", "love", "must", "be", "sincere", "hate", "what", "is", "evil", "cling", "to", "good"},
            //112
            {"faith", "george", "macdonald", "afflictions", "are", "but", "the", "shadows", "of", "god’s", "wings"},
            //113
            {"faith", "martin", "luther", "king", "jr", "is", "taking", "the", "first", "step", "even", "when", "you", "don’t", "see", "whole", "staircase"},
            //114
            {"faith", "max", "lucado", "meet", "your", "fears", "with"},
            //115
            {"faith", "psalm", "467", "the", "lord", "of", "hosts", "is", "with", "us", "god", "jacob", "our", "fortress"},
            //116
            {"faith", "isaiah", "4031", "but", "they", "who", "wait", "for", "the", "lord", "shall", "renew", "their", "strength", "mount", "up", "with", "wings", "like", "eagles", "run", "and", "not", "be", "weary", "walk", "faint"},
            //117
            {"faith", "proverbs", "1810", "the", "name", "of", "lord", "is", "a", "strong", "tower", "righteous", "man", "runs", "into", "it", "and", "safe"},
            //118
            {"faith", "john", "piper", "god", "is", "more", "glorified", "in", "us", "when", "we", "are", "most", "satisfied", "him"},
            //119
            {"faith", "psalm", "11950", "this", "is", "my", "comfort", "in", "affliction", "that", "your", "promise", "gives", "me", "life"},
            //120
            {"faith", "psalm", "119114115", "you", "are", "my", "hiding", "place", "and", "shieldi", "hope", "in", "your", "word", "depart", "from", "me", "evildoers", "that", "i", "may", "keep", "the", "commandments", "of", "god"},
            //121
            {"faith", "psalm", "234", "even", "though", "i", "walk", "through", "the", "valley", "of", "shadow", "death", "will", "fear", "no", "evil", "for", "you", "are", "with", "me", "your", "rod", "and", "staff", "they", "comfort"},
            //122
            {"faith", "matthew", "1128", "come", "to", "me", "all", "who", "labor", "and", "are", "heavy", "laden", "i", "will", "give", "you", "rest"},
            //123
            {"faith", "philippians", "419", "and", "my", "god", "will", "supply", "every", "need", "of", "yours", "according", "to", "his", "riches", "in", "glory", "christ", "jesus"},
            //124
            {"faith", "psalm", "168", "i", "have", "set", "the", "lord", "always", "before", "me", "because", "he", "is", "at", "my", "right", "hand", "shall", "not", "be", "shaken"},
            //125
            {"faith", "richard", "baxter", "this", "life", "was", "not", "intended", "to", "be", "the", "place", "of", "our", "perfection", "but", "preparation", "for", "it"},
            //126
            {"faith", "isaiah", "432", "when", "you", "pass", "through", "the", "waters", "i", "will", "be", "with", "and", "rivers", "they", "shall", "not", "overwhelm", "walk", "fire", "burned", "flame", "consume"},
            //127
            {"faith", "lamentations", "32223", "the", "steadfast", "love", "of", "lord", "never", "ceases", "his", "mercies", "come", "to", "an", "end", "they", "are", "new", "every", "morning", "great", "is", "your", "faithfulness"},
            //128
            {"faith", "isaiah", "4110", "fear", "not", "for", "i", "am", "with", "you", "be", "dismayed", "your", "god", "will", "strengthen", "help", "uphold", "my", "righteous", "right", "hand"},
            //129
            {"faith", "e", "m", "bound", "prayer", "puts", "god’s", "work", "in", "his", "hands", "and", "keeps", "it", "there"},
            //130
            {"faith", "psalm", "3124", "be", "strong", "and", "let", "your", "heart", "take", "courage", "all", "you", "who", "wait", "for", "the", "lord"},
            //131
            {"faith", "j", "i", "packer", "you", "will", "never", "need", "more", "than", "he", "can", "supply"},
            //132
            {"faith", "bily", "graham", "my", "home", "is", "in", "heaven", "i’m", "just", "traveling", "through", "this", "world"},
            //133
            {"faith", "thesselanonians", "511", "therefore", "encourage", "one", "another", "and", "build", "up", "just", "as", "you", "are", "doing"}
    };

    public static String getFaithQuote(int position) {
        return quotesFaith[position];
    }

    public static String getFaithAuthor(int position) {
        return quotesFaithAuthors[position];
    }

    public static String[] getFaithList() {
        return quotesFaith;
    }

    static String[][] getFaithTags() {
        return faithTags;
    }

    public static int getFaithListSize() {
        return quotesFaith.length;
    }
}
