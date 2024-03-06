package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Sports {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesSports and quotesSportsAuthors
        int listSize = getSportsListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesSports[randomIndexToSwap];
            tempAuthor = quotesSportsAuthors[randomIndexToSwap];
            tempTags = sportsTags[randomIndexToSwap];
            quotesSports[randomIndexToSwap] = quotesSports[i];
            quotesSportsAuthors[randomIndexToSwap] = quotesSportsAuthors[i];
            sportsTags[randomIndexToSwap] = sportsTags[i];
            quotesSports[i] = tempQuote;
            quotesSportsAuthors[i] = tempAuthor;
            sportsTags[i] = tempTags;
        }
    }

    private static String[] quotesSports = {
            //0
            "\"Without self-discipline, success is impossible, period.\"",
            //1
            "\"It’s hard to beat a person who never gives up.\"",
            //2
            "\"Success is where preparation and opportunity meet.\"",
            //3
            "\"Sports creates a bond between contemporaries that lasts a lifetime. It also gives your life structure, discipline and a genuine, sincere, pure fulfillment that few other areas of endeavor provide.\"",
            //4
            "\"I fear not the man who has practised 10,000 kicks once, but I fear the man who has practised one kick 10,000 times.\"",
            //5
            "\"No man has the right to be an amateur in the matter of physical training. It is a shame for a man to grow old without seeing the beauty and strength of which his body is capable.\"",
            //6
            "\"It is better to be a warrior in a garden than a gardener in war.\"",
            //7
            "\"You have to expect things of yourself before you can do them.\"",
            //8
            "\"Champions keep playing until they get it right.\"",
            //9
            "\"Be more than motivated, be more than driven, become literally obsessed to the point where people think you’re fucking nuts.\"",
            //10
            "\"Nobody cares what you did yesterday. What have you done today to better yourself?\"",
            //11
            "\"Pain unlocks a secret doorway in the mind, one that leads to both peak performance, and beautiful silence.\"",
            //12
            "\"It’s not the will to win that matters – everyone has that. It’s the will to prepare to win that matters.\"",
            //13
            "\"The only thing more contagious than a good attitude is a bad one.\"",
            //14
            "\"Whoever said, 'It's not whether you win or lose that counts,' probably lost.\"",
            //15
            "\"Sports do not build character. They reveal it.\"",
            //16
            "\"The more I practice, the luckier I get.\"",
            //17
            "\"Self-praise is for losers. Be a winner. Stand for something. Always have class, and be humble.\"",
            //18
            "\"Sportsmanship for me is when a guy walks off the court and you really can’t tell whether he won or lost, when he carries himself with pride either way.\"",
            //19
            "\"Just play. Have fun. Enjoy the game.\"",
            //20
            "\"Just keep going. Everybody gets better if they keep at it.\"",
            //21
            "\"There are no shortcuts – everything is reps, reps, reps.\"",
            //22
            "\"Sports not only build better athletes but also better people.\"",
            //23
            "\"Success isn’t owned, it’s leased. And rent is due every day.\"",
            //24
            "\"Always make a total effort, even when the odds are against you.\"",
            //25
            "\"To uncover your true potential you must first find your own limits and then you have to have the courage to blow past them.\"",
            //26
            "\"I don’t count my sit-ups. I only start counting once it starts hurting.\"",
            //27
            "\"What makes something special is not just what you have to gain, but what you feel there is to lose.\"",
            //28
            "\"I am building a fire, and every day I train, I add more fuel. At just the right moment, I light the match.\"",
            //29
            "\"For me, winning isn't something that happens suddenly on the field when the whistle blows and the crowds roar. Winning is something that builds physically and mentally every day that you train and every night that you dream.\"",
            //30
            "\"Baseball is the only field of endeavour where a man can succeed three times out of ten and be considered a good performer.\"",
            //31
            "\"When I race my mind is full of doubts – who will finish second, who will finish third?\"",
            //32
            "\"Run when you can, walk if you have to, crawl if you must; just never give up.\"",
            //33
            "\"A champion is someone who gets up when he can’t.\"",
            //34
            "\"You miss 100 percent of the shots you don’t take.\"",
            //35
            "\"The difference between the impossible and the possible lies in a man’s determination.\"",
            //36
            "\"Do you know what my favorite part of the game is? The opportunity to play.\"",
            //37
            "\"It isn’t the mountains ahead to climb that wear you out; it’s the pebble in your shoe.\"",
            //38
            "\"Age is no barrier. It’s a limitation you put on your mind.\"",
            //39
            "\"If you train hard, you'll not only be hard, you'll be hard to beat.\"",
            //40
            "\"Set your goals high, and don't stop till you get there.\"",
            //41
            "\"When you’ve got something to prove, there’s nothing greater than a challenge.\"",
            //42
            "\"If you ever lack the motivation to train then think what happens to your mind and body when you don’t.\"",
            //43
            "\"I have always tried to be true to myself, to pick those battles I felt were important. My ultimate responsibility is to myself. I could never be anything else.\"",
            //44
            "\"It took me seventeen years to get three thousand hits in baseball. I did it in one afternoon on the golf course.\"",
            //45
            "\"The time when there is no one there to feel sorry for you or to cheer for you is when a player is made.\"",
            //46
            "\"It’s just a job. Grass grows, birds fly, waves pound the sand. I beat people up.\"",
            //47
            "\"The will is decisive.\"",
            //48
            "\"Competitive sports are played mainly on a five-and-a-half inch court, the space between your ears.\"",
            //49
            "\"Discipline is your best friend. It will take care of you like nothing else can.\"",
            //50
            "\"There’s no overnight success. Whatever you can do each minute of today to make your dream that much closer to being reality, that’s what it takes to be successful.\"",
            //51
            "\"You’ll never know what you’re capable of until you take that first step and just go for it.\"",
            //52
            "\"An athlete cannot run with money in his pockets. He must run with hope in his heart and dreams in his head.\"",
            //53
            "\"A warrior is a guy that goes, ‘Im here again today. I’ll be here again tomorrow and the next day.’ It’s a person who puts no limit on what’s possible.\"",
            //54
            "\"If you are afraid of failure you don’t deserve to be successful!\"",
            //55
            "\"Only you can master your mind, which is what it takes to live a bold life filled with accomplishments most people consider beyond their capability.\"",
            //56
            "\"The worst thing that can happen to a man is to become civilized.\"",
            //57
            "\"Never say never, because limits, like fears, are often just an illusion.\"",
            //58
            "\"Mental toughness is a lifestyle.\"",
            //59
            "\"You’re never a loser until you quit trying.\"",
            //60
            "\"It's not the size of the dog in the fight, but the size of the fight in the dog!\"",
            //61
            "\"I’ve learned that something constructive comes from every defeat.\"",
            //62
            "\"When you fail you learn from the mistakes you made and it motivates you to work even harder.\"",
            //63
            "\"Never limit yourself, never be satisfied, and smile… It’s free!\"",
            //64
            "\"Nobody who ever gave his best regretted it.\"",
            //65
            "\"Greatness pulls mediocrity into the mud. Get out there and get after it.\"",
            //66
            "\"Some people believe football is a matter of life and death. I'm very disappointed with that attitude. I can assure you it is much, much more important than that.\"",
            //67
            "\"Take your victories, whatever they may be, cherish them, use them, but don’t settle for them.\"",
            //68
            "\"Hard work beats talent when talent doesn’t work hard.\"",
            //69
            "\"I feel like I’m the best, but you’re not going to get me to say that.\"",
            //70
            "\"If you fail to prepare, you’re prepared to fail.\"",
            //71
            "\"Without training, they lacked knowledge. Without knowledge, they lacked confidence. Without confidence, they lacked victory.\"",
            //72
            "\"You are in danger of living a life so comfortable and soft, that you will die without ever realizing your true potential.\"",
            //73
            "\"There is only one way to succeed in anything… and that is to give it everything.\"",
            //74
            "\"Statistics are like bikinis – they show a lot but not everything.\"",
            //75
            "\"He who is not courageous enough to take risks will accomplish nothing in life.\"",
            //76
            "\"You play to win the game...Hello. You play to win the game.\"",
            //77
            "\"No matter the circumstances you may be going through, just push through it.\"",
            //78
            "\"I don’t stop when I’m tired, I stop when I’m done.\"",
            //79
            "\"It is not the mountain we conquer, but ourselves.\"",
            //80
            "\"I’ve failed over and over again in my life. And that is why I succeed.\"",
            //81
            "\"Doctors and scientists said that breaking the four-minute mile was impossible, that one would die in the attempt. Thus, when I got up from the track after collapsing at the finish line, I figured I was dead.\"",
            //82
            "\"It’s possible to transcend anything that doesn’t kill you.\"",
            //83
            "\"Winners never quit and quitters never win.\"",
            //84
            "\"Kill them with success and bury them with a smile.\"",
            //85
            "\"Never let people who choose the path of least resistance steer you away from your chosen path of most resistance.\"",
            //86
            "\"Excellence is not a singular act but a habit. You are what you do repeatedly.\"",
            //87
            "\"It ain’t over ‘til it’s over.\"",
            //88
            "\"Never give up! Failure and rejection are only the first step to succeeding.\"",
            //89
            "\"There may be people that have more talent than you, but there’s no excuse for anyone to work harder than you do.\"",
            //90
            "\"If you can believe it, the mind can achieve it.\"",
            //91
            "\"From the time you take your first breath, you become eligible to die. You also become eligible to find your greatness and become the one warrior.\"",
            //92
            "\"You have to be able to center yourself, to let all of your emotions go. Don’t ever forget that you play with your soul as well as your body.\"",
            //93
            "\"Passion first and everything will fall into place.\"",
            //94
            "\"Never give up, never give in, and when the upper hand is ours, may we have the ability to handle the win with the dignity that we absorbed the loss.\"",
            //95
            "\"A trophy carries dust. Memories last forever.\"",
            //96
            "\"Your goals should be out of reach, but never out of sight.\"",
            //97
            "\"If you can’t outplay them, outwork them.\"",
            //98
            "\"The harder the battle, the sweeter the victory.\"",
            //99
            "\"It’s not whether you get knocked down; it’s whether you get up.\"",
            //100
            "\"I figure practice puts your brains in your muscles.\"",
            //101
            "\"When the mind is controlled and spirit aligned with purpose, the body is capable of so much more than we realize.\"",
            //102
            "\"Pain is temporary. It may last a minute, or an hour, or a day, or a year, but eventually it will subside and something else will take its place. If I quit, however, it lasts forever.\"",
            //103
            "\"No one ever drowned in sweat.\"",
            //104
            "\"Worrying gets you nowhere. If you turn up worrying about how you’re going to perform, you’ve already lost. Train hard, turn up, run your best and the rest will take care of itself.\"",
            //105
            "\"But effort? Nobody can judge that because effort is between you and you.\"",
            //106
            "\"If you aren’t going all the way, why go at all?.\"",
            //107
            "\"Look in the mirror… that’s your competition.\"",
            //108
            "\"Believe me, the reward is not so great without the struggle.\"",
            //109
            "\"To be the man, you have to beat the man.\"",
            //110
            "\"It is more difficult to stay on top than to get there.\"",
            //111
            "\"To give any less than your best is to sacrifice a gift.\"",
            //112
            "\"I’ve learned two things. Never, ever believe in ‘can’t.’ And be good to people and people will be good to you.\"",
            //113
            "\"Don’t focus on what you think you deserve. Take aim at what you are willing to earn.\"",
            //114
            "\"I learned that if you want to make it bad enough, no matter how bad it is, you can make it.\"",
            //115
            "\"If you choose to do something, attack it.\"",
            //116
            "\"The most valuable player is the one who makes the most players valuable.\"",
            //117
            "\"Only losers are making excuses, winners are making history.\"",
            //118
            "\"If football has taught me anything it is that you can overcome anything if, and only if, you love something enough.\"",
            //119
            "\"Never give up! Failure and rejection are only the first step to succeeding.\"",
            //120
            "\"We don’t rise to the level of our expectations, we fall to the level of our training.\"",
            //121
            "\"It’s all about the journey, not the outcome.\"",
            //122
            "\"Golf and sex are the only things you can enjoy without being good at them!.\"",
            //123
            "\"What’s the difference between a 3-week-old puppy and a sportswriter? In six weeks, the puppy stops whining.\"",
            //124
            "\"Persistence can change failure into extraordinary achievement.\"",
            //125
            "\"We talkin’ bout practice?.\"",
            //126
            "\"Nobody roots for Goliath.\"",
            //127
            "\"To succeed...You need to find something to hold on to, something to motivate you, something to inspire you.\"",
            //128
            "\"Strength does not come from winning. Your struggles develop your strengths.\"",
            //129
            "\"The most difficult thing is the decision to act, the rest is merely tenacity.\"",
            //130
            "\"Never let the fear of striking out keep you from playing the game.\"",
            //131
            "\"Most people give up just when they’re about to achieve success. They quit on the one-yard line. They give up at the last minute of the game one foot from a winning touchdown.\"",
            //132
            "\"Number one is just to gain a passion for running. To love the morning, to love the trail, to love the pace on the track. And if some kid gets really good at it, that’s cool too.\"",
            //133
            "\"You were born to be a player. You were meant to be here. The moment is yours.\"",
            //134
            "\"Make sure your worst enemy doesn’t live between your own two ears.\"",
            //135
            "\"Continuous effort – not strength or intelligence – is the key to unlocking our potential.\"",
            //136
            "\"Sports serve society by providing vivid examples of excellence.\"",
            //137
            "\"You are never really playing an opponent. You are playing yourself, your own highest standards, and when you reach your limits, that is real joy.\"",
            //138
            "\"Somewhere behind the athlete you’ve become and the hours of practice and the coaches who have pushed you is a little girl who fell in love with the game and never looked back… play for her.\"",
            //139
            "\"The five S’s of sports training are: stamina, speed, strength, skill, and spirit; but the greatest of these is spirit.\"",
            //140
            "\"The principle is competing against yourself. It’s about self-improvement, about being better than you were the day before.\"",
            //141
            "\"The road to easy street goes through the sewer.\"",
            //142
            "\"People ask me what I do in winter when there’s no baseball. I’ll tell you what I do. I stare out the window and wait for spring.\"",
            //143
            "\"When you’re riding only the race in which you’re riding is important.\"",
            //144
            "\"I always felt that my greatest asset was not my physical ability, it was my mental ability.\"",
            //145
            "\"Good is not good when better is expected.\""
    };
    private static String[] quotesSportsAuthors = {
            //0
            "Lou Holtz",
            //1
            "Babe Ruth",
            //2
            "Bobby Unser",
            //3
            "Bob Cousy",
            //4
            "Bruce Lee",
            //5
            "Socrates",
            //6
            "Japanese saying",
            //7
            "Michael Jordan",
            //8
            "Billie Jean King",
            //9
            "David Goggins",
            //10
            "David Goggins",
            //11
            "David Goggins",
            //12
            "Paul Bryant",
            //13
            "David Goggins",
            //14
            "Martina Navratilova",
            //15
            "Heywood Broun",
            //16
            "Gary Player",
            //17
            "John Madden",
            //18
            "Jim Courier",
            //19
            "Michael Jordan",
            //20
            "Ted Williams",
            //21
            "Arnold Schwarzenegger",
            //22
            "Julie Foudy",
            //23
            "J. J. Watt",
            //24
            "Arnold Palmer",
            //25
            "Picabo Street",
            //26
            "Muhammad Ali",
            //27
            "Andre Agassi",
            //28
            "Mia Hamm",
            //29
            "Emmitt Smith",
            //30
            "Ted Williams",
            //31
            "Noureddine Morceli",
            //32
            "Dean Karnazes",
            //33
            "Jack Dempsey",
            //34
            "Wayne Gretzky",
            //35
            "Tommy Lasorda",
            //36
            "Mike Singletary",
            //37
            "Muhammad Ali",
            //38
            "Jackie Joyner-Kersee",
            //39
            "Herschel Walker",
            //40
            "Bo Jackson",
            //41
            "Terry Bradshaw",
            //42
            "Shifu Yan Lei",
            //43
            "Arthur Ashe",
            //44
            "Hank Aaron",
            //45
            "Tim Duncan",
            //46
            "Muhammad Ali",
            //47
            "German special forces (KSK) motto",
            //48
            "Bobby Jones",
            //49
            "Jocko Willink",
            //50
            "J. J. Watt",
            //51
            "Natasha Hastings",
            //52
            "Emil Zatopek",
            //53
            "David Goggins",
            //54
            "Charles Barkley",
            //55
            "David Goggins",
            //56
            "David Goggins",
            //57
            "Michael Jordan",
            //58
            "David Goggins",
            //59
            "Mike Ditka",
            //60
            "Archie Griffin",
            //61
            "Tom Landry",
            //62
            "Natalie Gulbis",
            //63
            "Jennie Finch",
            //64
            "George Halas",
            //65
            "David Goggins",
            //66
            "Bill Shankly",
            //67
            "Mia Hamm",
            //68
            "Tim Notke",
            //69
            "Jerry Rice",
            //70
            "Mark Spitz",
            //71
            "Julius Caesar",
            //72
            "David Goggins",
            //73
            "Vince Lombardi",
            //74
            "Lou Piniella",
            //75
            "Muhammad Ali",
            //76
            "Herman Edwards",
            //77
            "Ray Lewis",
            //78
            "David Goggins",
            //79
            "Sir Edmund Hillary",
            //80
            "Michael Jordan",
            //81
            "Roger Bannister",
            //82
            "David Goggins",
            //83
            "Vince Lombardi",
            //84
            "Usain Bolt",
            //85
            "David Goggins",
            //86
            "Shaquille O’Neal",
            //87
            "Yogi Berra",
            //88
            "Jim Valvano",
            //89
            "Derek Jeter",
            //90
            "Ronnie Lott",
            //91
            "David Goggins",
            //92
            "Kareem Abdul-Jabbar",
            //93
            "Holly Holm",
            //94
            "Doug Williams",
            //95
            "Mary Lou Retton",
            //96
            "Felicity Luckey",
            //97
            "Ben Hogan",
            //98
            "Les Brown",
            //99
            "Vince Lombardi",
            //100
            "Sam Snead",
            //101
            "Rich Roll",
            //102
            "Lance Armstrong",
            //103
            "Lou Holtz",
            //104
            "Usain Bolt",
            //105
            "Ray Lewis",
            //106
            "Joe Namath",
            //107
            "Unknown",
            //108
            "Wilma Rudolph",
            //109
            "Ric Flair",
            //110
            "Mia Hamm",
            //111
            "Steve Prefontaine",
            //112
            "Dick Vitale",
            //113
            "David Goggins",
            //114
            "Gale Sayers",
            //115
            "David Goggins",
            //116
            "Peyton Manning",
            //117
            "Unknown",
            //118
            "Lionel Messi",
            //119
            "Jim Valvano",
            //120
            "David Goggins",
            //121
            "Carl Lewis",
            //122
            "Jimmy Demaret",
            //123
            "Mike Ditka",
            //124
            "Matt Biondi",
            //125
            "Allen Iverson",
            //126
            "Wilt Chamberlain",
            //127
            "Tony Dorsett",
            //128
            "Arnold Schwarzenegger",
            //129
            "Amelia Earhart",
            //130
            "Babe Ruth",
            //131
            "Ross Perot",
            //132
            "Pat Tyson",
            //133
            "Herb Brooks",
            //134
            "Laird Hamilton",
            //135
            "Liane Cardes",
            //136
            "George F. Will",
            //137
            "Arthur Ashe",
            //138
            "Mia Hamm",
            //139
            "Ken Doherty",
            //140
            "Steve Young",
            //141
            "John Madden",
            //142
            "Rogers Hornsby",
            //143
            "Bill Shoemaker",
            //144
            "Bruce Jenner",
            //145
            "Vin Scully"
    };
    private static String[][] sportsTags = {
            //0
            {"sports", "lou", "holtz", "without", "selfdiscipline", "success", "is", "impossible", "period"},
            //1
            {"sports", "babe", "ruth", "it’s", "hard", "to", "beat", "a", "person", "who", "never", "gives", "up"},
            //2
            {"sports", "bobby", "unser", "success", "is", "where", "preparation", "and", "opportunity", "meet"},
            //3
            {"sports", "bob", "cousy", "creates", "a", "bond", "between", "contemporaries", "that", "lasts", "lifetime", "it", "also", "gives", "your", "life", "structure", "discipline", "and", "genuine", "sincere", "pure", "fulfillment", "few", "other", "areas", "of", "endeavor", "provide"},
            //4
            {"sports", "bruce", "lee", "i", "fear", "not", "the", "man", "who", "has", "practised", "10000", "kicks", "once", "but", "one", "kick", "times"},
            //5
            {"sports", "socrates", "no", "man", "has", "the", "right", "to", "be", "an", "amateur", "in", "matter", "of", "physical", "training", "it", "is", "a", "shame", "for", "grow", "old", "without", "seeing", "beauty", "and", "strength", "which", "his", "body", "capable"},
            //6
            {"sports", "japanese", "proverb", "it", "is", "better", "to", "be", "a", "warrior", "in", "garden", "than", "gardener", "war"},
            //7
            {"sports", "michael", "jordan", "you", "have", "to", "expect", "things", "of", "yourself", "before", "can", "do", "them"},
            //8
            {"sports", "billie", "j", "jean", "king", "champions", "keep", "playing", "until", "they", "get", "it", "right"},
            //9
            {"sports", "david", "goggins", "be", "more", "than", "motivated", "driven", "become", "literally", "obsessed", "to", "the", "point", "where", "people", "think", "you’re", "fucking", "nuts"},
            //10
            {"sports", "david", "goggins", "nobody", "cares", "what", "you", "did", "yesterday", "have", "done", "today", "to", "better", "yourself"},
            //11
            {"sports", "david", "goggins", "pain", "unlocks", "a", "secret", "doorway", "in", "the", "mind", "one", "that", "leads", "to", "both", "peak", "performance", "and", "beautiful", "silence"},
            //12
            {"sports", "paul", "bryant", "it’s", "not", "the", "will", "to", "win", "that", "matters", "everyone", "has", "prepare"},
            //13
            {"sports", "david", "goggins", "the", "only", "thing", "more", "contagious", "than", "a", "good", "attitude", "is", "bad", "one"},
            //14
            {"sports", "martina", "navratilova", "whoever", "said", "'it's", "not", "whether", "you", "win", "or", "lose", "that", "counts'", "probably", "lost"},
            //15
            {"sports", "heywood", "broun", "do", "not", "build", "character", "they", "reveal", "it"},
            //16
            {"sports", "gary", "player", "the", "more", "i", "practice", "luckier", "get"},
            //17
            {"sports", "john", "madden", "selfpraise", "is", "for", "losers", "be", "a", "winner", "stand", "something", "always", "have", "class", "and", "humble"},
            //18
            {"sports", "jim", "courier", "sportsmanship", "for", "me", "is", "when", "a", "guy", "walks", "off", "the", "court", "and", "you", "really", "can’t", "tell", "whether", "he", "won", "or", "lost", "carries", "himself", "with", "pride", "either", "way"},
            //19
            {"sports", "michael", "jordan", "just", "play", "have", "fun", "enjoy", "the", "game"},
            //20
            {"sports", "ted", "williams", "just", "keep", "going", "everybody", "gets", "better", "if", "they", "at", "it"},
            //21
            {"sports", "arnold", "schwarzenegger", "there", "are", "no", "shortcuts", "everything", "is", "reps"},
            //22
            {"sports", "julie", "foudy", "not", "only", "build", "better", "athletes", "but", "also", "people"},
            //23
            {"sports", "j", "watt", "success", "isn’t", "owned", "it’s", "leased", "and", "rent", "is", "due", "every", "day"},
            //24
            {"sports", "arnold", "palmer", "always", "make", "a", "total", "effort", "even", "when", "the", "odds", "are", "against", "you"},
            //25
            {"sports", "picabo", "street", "to", "uncover", "your", "true", "potential", "you", "must", "first", "find", "own", "limits", "and", "then", "have", "the", "courage", "blow", "past", "them"},
            //26
            {"sports", "muhammad", "ali", "i", "don’t", "count", "my", "situps", "only", "start", "counting", "once", "it", "starts", "hurting"},
            //27
            {"sports", "andre", "agassi", "what", "makes", "something", "special", "is", "not", "just", "you", "have", "to", "gain", "but", "feel", "there", "lose"},
            //28
            {"sports", "mia", "hamm", "i", "am", "building", "a", "fire", "and", "every", "day", "train", "add", "more", "fuel", "at", "just", "the", "right", "moment", "light", "match"},
            //29
            {"sports", "emmitt", "smith", "for", "me", "winning", "isn't", "something", "that", "happens", "suddenly", "on", "the", "field", "when", "whistle", "blows", "and", "crowds", "roar", "is", "builds", "physically", "mentally", "every", "day", "you", "train", "night", "dream"},
            //30
            {"sports", "ted", "williams", "baseball", "is", "the", "only", "field", "of", "endeavour", "where", "a", "man", "can", "succeed", "three", "times", "out", "ten", "and", "be", "considered", "good", "performer"},
            //31
            {"sports", "noureddine", "morceli", "when", "i", "race", "my", "mind", "is", "full", "of", "doubts", "who", "will", "finish", "second", "third"},
            //32
            {"sports", "dean", "karnazes", "run", "when", "you", "can", "walk", "if", "have", "to", "crawl", "must", "just", "never", "give", "up"},
            //33
            {"sports", "jack", "dempsey", "a", "champion", "is", "someone", "who", "gets", "up", "when", "he", "can’t"},
            //34
            {"sports", "wayne", "gretzky", "you", "miss", "100", "percent", "of", "the", "shots", "don’t", "take"},
            //35
            {"sports", "tommy", "lasorda", "the", "difference", "between", "impossible", "and", "possible", "lies", "in", "a", "man’s", "determination"},
            //36
            {"sports", "mike", "singletary", "do", "you", "know", "what", "my", "favorite", "part", "of", "the", "game", "is", "opportunity", "to", "play"},
            //37
            {"sports", "muhammad", "ali", "it", "isn’t", "the", "mountains", "ahead", "to", "climb", "that", "wear", "you", "out", "it’s", "pebble", "in", "your", "shoe"},
            //38
            {"sports", "jackie", "joynerkersee", "age", "is", "no", "barrier", "it’s", "a", "limitation", "you", "put", "on", "your", "mind"},
            //39
            {"sports", "herschel", "walker", "if", "you", "train", "hard", "you'll", "not", "only", "be", "to", "beat"},
            //40
            {"sports", "bo", "jackson", "set", "your", "goals", "high", "and", "don't", "stop", "till", "you", "get", "there"},
            //41
            {"sports", "terry", "bradshaw", "when", "you’ve", "got", "something", "to", "prove", "there’s", "nothing", "greater", "than", "a", "challenge"},
            //42
            {"sports", "shifu", "yan", "lei", "if", "you", "ever", "lack", "the", "motivation", "to", "train", "then", "think", "what", "happens", "your", "mind", "and", "body", "when", "don’t"},
            //43
            {"sports", "arthur", "ashe", "i", "have", "always", "tried", "to", "be", "true", "myself", "pick", "those", "battles", "felt", "were", "important", "my", "ultimate", "responsibility", "is", "could", "never", "anything", "else"},
            //44
            {"sports", "hak", "aaron", "it", "took", "me", "seventeen", "years", "to", "get", "three", "thousand", "hits", "in", "baseball", "i", "did", "one", "afternoon", "on", "the", "golf", "course"},
            //45
            {"sports", "tim", "duncan", "the", "time", "when", "there", "is", "no", "one", "to", "feel", "sorry", "for", "you", "or", "cheer", "a", "player", "made"},
            //46
            {"sports", "muhammad", "ali", "it’s", "just", "a", "job", "grass", "grows", "birds", "fly", "waves", "pound", "the", "sand", "i", "beat", "people", "up"},
            //47
            {"sports", "german", "special", "forces", "ksk", "the", "will", "is", "decisive"},
            //48
            {"sports", "bobby", "jones", "competitive", "are", "played", "mainly", "on", "a", "fiveandahalf", "inch", "court", "the", "space", "between", "your", "ears"},
            //49
            {"sports", "jocko", "willink", "discipline", "is", "your", "best", "friend", "it", "will", "take", "care", "of", "you", "like", "nothing", "else", "can"},
            //50
            {"sports", "j", "watt", "there’s", "no", "overnight", "success", "whatever", "you", "can", "do", "each", "minute", "of", "today", "to", "make", "your", "dream", "that", "much", "closer", "being", "reality", "that’s", "what", "it", "takes", "be", "successful"},
            //51
            {"sports", "natasha", "hastings", "you’ll", "never", "know", "what", "you’re", "capable", "of", "until", "you", "take", "that", "first", "step", "and", "just", "go", "for", "it"},
            //52
            {"sports", "emil", "zatopek", "an", "athlete", "cannot", "run", "with", "money", "in", "his", "pockets", "he", "must", "hope", "heart", "and", "dreams", "head"},
            //53
            {"sports", "david", "goggins", "a", "warrior", "is", "guy", "that", "goes", "‘im", "here", "again", "today", "i’ll", "be", "tomorrow", "and", "the", "next", "day’", "it’s", "person", "who", "puts", "no", "limit", "on", "what’s", "possible"},
            //54
            {"sports", "charles", "barkley", "if", "you", "are", "afraid", "of", "failure", "don’t", "deserve", "to", "be", "successful"},
            //55
            {"sports", "david", "goggins", "only", "you", "can", "master", "your", "mind", "which", "is", "what", "it", "takes", "to", "live", "a", "bold", "life", "filled", "with", "accomplishments", "most", "people", "consider", "beyond", "their", "capability"},
            //56
            {"sports", "david", "goggins", "the", "worst", "thing", "that", "can", "happen", "to", "a", "man", "is", "become", "civilized"},
            //57
            {"sports", "michael", "jordan", "never", "say", "because", "limits", "like", "fears", "are", "often", "just", "an", "illusion"},
            //58
            {"sports", "david", "goggins", "mental", "toughness", "is", "a", "lifestyle"},
            //59
            {"sports", "mike", "ditka", "you’re", "never", "a", "loser", "until", "you", "quit", "trying"},
            //60
            {"sports", "archie", "griffin", "it's", "not", "the", "size", "of", "dog", "in", "fight", "but"},
            //61
            {"sports", "tom", "landry", "i’ve", "learned", "that", "something", "constructive", "comes", "from", "every", "defeat"},
            //62
            {"sports", "natalie", "gulbis", "when", "you", "fail", "learn", "from", "the", "mistakes", "made", "and", "it", "motivates", "to", "work", "even", "harder"},
            //63
            {"sports", "jennie", "finch", "never", "limit", "yourself", "be", "satisfied", "and", "smile", "it’s", "free"},
            //64
            {"sports", "george", "halas", "nobody", "who", "ever", "gave", "his", "best", "regretted", "it"},
            //65
            {"sports", "david", "goggins", "greatness", "pulls", "mediocrity", "into", "the", "mud", "get", "out", "there", "and", "after", "it"},
            //66
            {"sports", "bill", "shankly", "some", "people", "believe", "football", "is", "a", "matter", "of", "life", "and", "death", "i'm", "very", "disappointed", "with", "that", "attitude", "i", "can", "assure", "you", "it", "much", "more", "important", "than"},
            //67
            {"sports", "mia", "hamm", "take", "your", "victories", "whatever", "they", "may", "be", "cherish", "them", "use", "but", "don’t", "settle", "for"},
            //68
            {"sports", "tim", "notke", "hard", "work", "beats", "talent", "when", "doesn’t"},
            //69
            {"sports", "jerry", "rice", "i", "feel", "like", "i’m", "the", "best", "but", "you’re", "not", "going", "to", "get", "me", "say", "that"},
            //70
            {"sports", "mark", "spitz", "if", "you", "fail", "to", "prepare", "you’re", "prepared"},
            //71
            {"sports", "julius", "caesar", "without", "training", "they", "lacked", "knowledge", "confidence", "victory"},
            //72
            {"sports", "david", "goggins", "you", "are", "in", "danger", "of", "living", "a", "life", "so", "comfortable", "and", "soft", "that", "will", "die", "without", "ever", "realizing", "your", "true", "potential"},
            //73
            {"sports", "vince", "lombardi", "there", "is", "only", "one", "way", "to", "succeed", "in", "anything", "and", "that", "give", "it", "everything"},
            //74
            {"sports", "lou", "piniella", "statistics", "are", "like", "bikinis", "they", "show", "a", "lot", "but", "not", "everything"},
            //75
            {"sports", "muhammad", "ali", "he", "who", "is", "not", "courageous", "enough", "to", "take", "risks", "will", "accomplish", "nothing", "in", "life"},
            //76
            {"sports", "herman", "edwards", "you", "play", "to", "win", "the", "gamehello", "game"},
            //77
            {"sports", "ray", "lewis", "no", "matter", "the", "circumstances", "you", "may", "be", "going", "through", "just", "push", "it"},
            //78
            {"sports", "david", "goggins", "i", "don’t", "stop", "when", "i’m", "tired", "done"},
            //79
            {"sports", "sir", "edmund", "hillary", "it", "is", "not", "the", "mountain", "we", "conquer", "but", "ourselves"},
            //80
            {"sports", "michael", "jordan", "i’ve", "failed", "over", "and", "again", "in", "my", "life", "that", "is", "why", "i", "succeed"},
            //81
            {"sports", "roger", "bannister", "doctors", "and", "scientists", "said", "that", "breaking", "the", "fourminute", "mile", "was", "impossible", "one", "would", "die", "in", "attempt", "thus", "when", "i", "got", "up", "from", "track", "after", "collapsing", "at", "finish", "line", "figured", "dead"},
            //82
            {"sports", "david", "goggins", "it’s", "possible", "to", "transcend", "anything", "that", "doesn’t", "kill", "you"},
            //83
            {"sports", "vince", "lombardi", "winners", "never", "quit", "and", "quitters", "win"},
            //84
            {"sports", "usain", "bolt", "kill", "them", "with", "success", "and", "bury", "a", "smile"},
            //85
            {"sports", "david", "goggins", "never", "let", "people", "who", "choose", "the", "path", "of", "least", "resistance", "steer", "you", "away", "from", "your", "chosen", "most"},
            //86
            {"sports", "shaquille", "o'neal", "excellence", "is", "not", "a", "singular", "act", "but", "habit", "you", "are", "what", "do", "repeatedly"},
            //87
            {"sports", "yogi", "berra", "it", "ain’t", "over", "‘til", "it’s"},
            //88
            {"sports", "jim", "valvano", "never", "give", "up", "failure", "and", "rejection", "are", "only", "the", "first", "step", "to", "succeeding"},
            //89
            {"sports", "derek", "jeter", "there", "may", "be", "people", "that", "have", "more", "talent", "than", "you", "but", "there’s", "no", "excuse", "for", "anyone", "to", "work", "harder", "do"},
            //90
            {"sports", "ronnie", "lott", "if", "you", "can", "believe", "it", "the", "mind", "achieve"},
            //91
            {"sports", "david", "goggins", "from", "the", "time", "you", "take", "your", "first", "breath", "become", "eligible", "to", "die", "also", "find", "greatness", "and", "one", "warrior"},
            //92
            {"sports", "kareem", "abduljabbar", "you", "have", "to", "be", "able", "center", "yourself", "let", "all", "of", "your", "emotions", "go", "don’t", "ever", "forget", "that", "play", "with", "soul", "as", "well", "body"},
            //93
            {"sports", "holly", "holm", "passion", "first", "and", "everything", "will", "fall", "into", "place"},
            //94
            {"sports", "doug", "williams", "never", "give", "up", "in", "and", "when", "the", "upper", "hand", "is", "ours", "may", "we", "have", "ability", "to", "handle", "win", "with", "dignity", "that", "absorbed", "loss"},
            //95
            {"sports", "mary", "l", "lou", "retton", "a", "trophy", "carries", "dust", "memories", "last", "forever"},
            //96
            {"sports", "felicity", "luckey", "your", "goals", "should", "be", "out", "of", "reach", "but", "never", "sight"},
            //97
            {"sports", "ben", "hogan", "if", "you", "can’t", "outplay", "them", "outwork"},
            //98
            {"sports", "les", "brown", "the", "harder", "battle", "sweeter", "victory"},
            //99
            {"sports", "vince", "lombardi", "it’s", "not", "whether", "you", "get", "knocked", "down", "up"},
            //100
            {"sports", "sam", "snead", "i", "figure", "practice", "puts", "your", "brains", "in", "muscles"},
            //101
            {"sports", "rich", "roll", "when", "the", "mind", "is", "controlled", "and", "spirit", "aligned", "with", "purpose", "body", "capable", "of", "so", "much", "more", "than", "we", "realize"},
            //102
            {"sports", "lance", "armstrong", "pain", "is", "temporary", "it", "may", "last", "a", "minute", "or", "an", "hour", "day", "year", "but", "eventually", "will", "subside", "and", "something", "else", "take", "its", "place", "if", "i", "quit", "however", "lasts", "forever"},
            //103
            {"sports", "lou", "holtz", "no", "one", "ever", "drowned", "in", "sweat"},
            //104
            {"sports", "usain", "bolt", "worrying", "gets", "you", "nowhere", "if", "turn", "up", "about", "how", "you’re", "going", "to", "perform", "you’ve", "already", "lost", "train", "hard", "run", "your", "best", "and", "the", "rest", "will", "take", "care", "of", "itself"},
            //105
            {"sports", "ray", "lewis", "but", "effort", "nobody", "can", "judge", "that", "because", "is", "between", "you", "and"},
            //106
            {"sports", "joe", "namath", "if", "you", "aren’t", "going", "all", "the", "way", "why", "go", "at"},
            //107
            {"sports", "look", "in", "the", "mirror", "that’s", "your", "competition"},
            //108
            {"sports", "wilma", "rudolph", "believe", "me", "the", "reward", "is", "not", "so", "great", "without", "struggle"},
            //109
            {"sports", "ric", "flair", "to", "be", "the", "man", "you", "have", "beat"},
            //110
            {"sports", "mia", "hamm", "it", "is", "more", "difficult", "to", "stay", "on", "top", "than", "get", "there"},
            //111
            {"sports", "steve", "prefontaine", "to", "give", "any", "less", "than", "your", "best", "is", "sacrifice", "a", "gift"},
            //112
            {"sports", "dick", "vitale", "i’ve", "learned", "two", "things", "never", "ever", "believe", "in", "‘can’t’", "and", "be", "good", "to", "people", "will", "you"},
            //113
            {"sports", "david", "goggins", "don’t", "focus", "on", "what", "you", "think", "deserve", "take", "aim", "at", "are", "willing", "to", "earn"},
            //114
            {"sports", "gale", "sayers", "i", "learned", "that", "if", "you", "want", "to", "make", "it", "bad", "enough", "no", "matter", "how", "is", "can"},
            //115
            {"sports", "david", "goggins", "if", "you", "choose", "to", "do", "something", "attack", "it"},
            //116
            {"sports", "peyton", "manning", "the", "most", "valuable", "player", "is", "one", "who", "makes", "players"},
            //117
            {"sports", "only", "losers", "are", "making", "excuses", "winners", "history"},
            //118
            {"sports", "lionel", "messi", "if", "football", "has", "taught", "me", "anything", "it", "is", "that", "you", "can", "overcome", "and", "only", "love", "something", "enough"},
            //119
            {"sports", "jim", "valvano", "never", "give", "up", "failure", "and", "rejection", "are", "only", "the", "first", "step", "to", "succeeding"},
            //120
            {"sports", "david", "goggins", "we", "don’t", "rise", "to", "the", "level", "of", "our", "expectations", "fall", "training"},
            //121
            {"sports", "carl", "lewis", "it’s", "all", "about", "the", "journey", "not", "outcome"},
            //122
            {"sports", "jimmy", "demaret", "golf", "and", "sex", "are", "the", "only", "things", "you", "can", "enjoy", "without", "being", "good", "at", "them"},
            //123
            {"sports", "mike", "ditka", "what’s", "the", "difference", "between", "a", "3weekold", "puppy", "and", "sportswriter", "in", "six", "weeks", "stops", "whining"},
            //124
            {"sports", "matt", "biondi", "persistence", "can", "change", "failure", "into", "extraordinary", "achievement"},
            //125
            {"sports", "allen", "iverson", "we", "talkin’", "bout", "practice"},
            //126
            {"sports", "wilt", "chamberlain", "nobody", "roots", "for", "goliath"},
            //127
            {"sports", "tony", "dorsett", "to", "succeedyou", "need", "find", "something", "hold", "on", "motivate", "you", "inspire"},
            //128
            {"sports", "arnold", "schwarzenegger", "strength", "does", "not", "come", "from", "winning", "your", "struggles", "develop", "strengths"},
            //129
            {"sports", "amelia", "earhart", "the", "most", "difficult", "thing", "is", "decision", "to", "act", "rest", "merely", "tenacity"},
            //130
            {"sports", "babe", "ruth", "never", "let", "the", "fear", "of", "striking", "out", "keep", "you", "from", "playing", "game"},
            //131
            {"sports", "ross", "perot", "most", "people", "give", "up", "just", "when", "they’re", "about", "to", "achieve", "success", "they", "quit", "on", "the", "oneyard", "line", "at", "last", "minute", "of", "game", "one", "foot", "from", "a", "winning", "touchdown"},
            //132
            {"sports", "pat", "tyson", "number", "one", "is", "just", "to", "gain", "a", "passion", "for", "running", "love", "the", "morning", "trail", "pace", "on", "track", "and", "if", "some", "kid", "gets", "really", "good", "at", "it", "that’s", "cool", "too"},
            //133
            {"sports", "herb", "brooks", "you", "were", "born", "to", "be", "a", "player", "meant", "here", "the", "moment", "is", "yours"},
            //134
            {"sports", "laird", "hamilton", "make", "sure", "your", "worst", "enemy", "doesn’t", "live", "between", "own", "two", "ears"},
            //135
            {"sports", "liane", "cardes", "continuous", "effort", "not", "strength", "or", "intelligence", "is", "the", "key", "to", "unlocking", "our", "potential"},
            //136
            {"sports", "george", "f", "will", "serve", "society", "by", "providing", "vivid", "examples", "of", "excellence"},
            //137
            {"sports", "arthur", "ashe", "you", "are", "never", "really", "playing", "an", "opponent", "yourself", "your", "own", "highest", "standards", "and", "when", "reach", "limits", "that", "is", "real", "joy"},
            //138
            {"sports", "mia", "hamm", "somewhere", "behind", "the", "athlete", "you’ve", "become", "and", "hours", "of", "practice", "coaches", "who", "have", "pushed", "you", "is", "a", "little", "girl", "fell", "in", "love", "with", "game", "never", "looked", "back", "play", "for", "her"},
            //139
            {"sports", "ken", "doherty", "the", "five", "s’s", "of", "training", "are", "stamina", "speed", "strength", "skill", "and", "spirit", "but", "greatest", "these", "is"},
            //140
            {"sports", "steve", "young", "the", "principle", "is", "competing", "against", "yourself", "it’s", "about", "selfimprovement", "being", "better", "than", "you", "were", "day", "before"},
            //141
            {"sports", "john", "madden", "the", "road", "to", "easy", "street", "goes", "through", "sewer"},
            //142
            {"sports", "rogers", "hornsby", "people", "ask", "me", "what", "i", "do", "in", "winter", "when", "there’s", "no", "baseball", "i’ll", "tell", "you", "stare", "out", "the", "window", "and", "wait", "for", "spring"},
            //143
            {"sports", "bill", "shoemaker", "when", "you’re", "riding", "only", "the", "race", "in", "which", "is", "important"},
            //144
            {"sports", "bruce", "jenner", "i", "always", "felt", "that", "my", "greatest", "asset", "was", "not", "physical", "ability", "it", "mental"},
            //145
            {"sports", "vin", "scully", "good", "is", "not", "when", "better", "expected"}
    };

    public static String getSportsQuote(int position) {
        return quotesSports[position];
    }

    public static String getSportsAuthor(int position) {
        return quotesSportsAuthors[position];
    }

    public static String[] getSportsList() {
        return quotesSports;
    }

    static String[][] getSportsTags() {
        return sportsTags;
    }

    public static int getSportsListSize() {
        return quotesSports.length;
    }


}
