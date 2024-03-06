package com.leanderchristmann.octoquotes.data;

import java.util.Random;

public final class Coding {

    //this method shuffles the list
    static void shuffle() {

        //the helper variables we need to shuffle the lists
        Random randomGenerator = new Random();
        int randomIndexToSwap;
        String tempQuote, tempAuthor;
        String[] tempTags;

        //shuffle quotesCoding and quotesCodingAuthors
        int listSize = getCodingListSize();
        for (int i = 0; i < listSize; i++) {
            randomIndexToSwap = randomGenerator.nextInt(listSize);
            tempQuote = quotesCoding[randomIndexToSwap];
            tempAuthor = quotesCodingAuthors[randomIndexToSwap];
            tempTags = codingTags[randomIndexToSwap];
            quotesCoding[randomIndexToSwap] = quotesCoding[i];
            quotesCodingAuthors[randomIndexToSwap] = quotesCodingAuthors[i];
            codingTags[randomIndexToSwap] = codingTags[i];
            quotesCoding[i] = tempQuote;
            quotesCodingAuthors[i] = tempAuthor;
            codingTags[i] = tempTags;
        }
    }

    private static String[] quotesCoding = {
            //0
            "\"Programming isn’t about what you know; it’s about what you can figure out.\"",
            //1
            "\"Optimism is an occupational hazard of programming: feedback is the treatment.\"",
            //2
            "\"Code is like humor. When you have to explain it, it’s bad.\"",
            //3
            "\"Without requirements or design, programming is the art of adding bugs to an empty text file.\"",
            //4
            "\"Beware of bugs in the above code; I have only proved it correct, not tried it.\"",
            //5
            "\"Some of the best programming is done on paper, really. Putting it into the computer is just a minor detail.\"",
            //6
            "\"You might not think that programmers are artists, but programming is an extremely creative progression. It’s logic-based creativity.\"",
            //7
            "\"It always takes longer than you expect, even when you take into account Hofstadter’s Law.\"",
            //8
            "\"Measuring programming progress by lines of code is like measuring aircraft building progress by weight.\"",
            //9
            "\"When debugging, novices insert corrective code; experts remove defective code.\"",
            //10
            "\"No code has zero defects.\"",
            //11
            "\"There are only 10 types of people in this world. Those who know binary and those who don’t.\"",
            //12
            "\"Everyday life is like programming, I guess. If you love something you can put beauty into it.\"",
            //13
            "\"Whether you want to uncover the secrets of the universe, or you just want to pursue a career in the 21st century, basic computer programming is an essential skill to learn.\"",
            //14
            "\"Why do Java programmers have to wear glasses? Because they don’t C#.\"",
            //15
            "\"All of my friends who have younger siblings who are going to college or high school – my number one piece of advice is: You should learn how to program.\"",
            //16
            "\"There is no Ctrl-Z in life.\"",
            //17
            "\"Don’t worry if it doesn’t work right. If everything did, you’d be out of a job.\"",
            //18
            "\"Always code as if they guy who ends up maintaining your code will be a violent psychopath who knows where you live.\"",
            //19
            "\"In theory, there is no difference between theory and practice. But, in practice, there is.\"",
            //20
            "\"One man’s crappy software is another man’s full-time job.\"",
            //21
            "\"Any fool can write code that a computer can understand. Good programmers write code that humans can understand.\"",
            //22
            "\"Most of you are familiar with the virtues of a programmer. There are three, of course: laziness, impatience, and hubris.\"",
            //23
            "\"One: Demonstrations always crash. And two: The probability of them crashing goes up exponentially with the number of people watching.\"",
            //24
            "\"Documentation is a love letter that you write to your future self.\"",
            //25
            "\"C makes it easy to shoot yourself in the foot; C++ makes it harder, but when you do, it blows your whole leg off.\"",
            //26
            "\"Programmers are not to be measured by their ingenuity and their logic but by the completeness of their case analysis.\"",
            //27
            "\"Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter.\"",
            //28
            "\"It’s not at all important to get it right the first time. It’s vitally important to get it right the last time.\"",
            //29
            "\"It’s not a bug – it’s an undocumented feature.\"",
            //30
            "\"99 little bugs in the code. 99 little bugs in the code. Take one down, patch it around. 127 little bugs in the code...\"",
            //31
            "\"Long time ago, people who sacrificed their sleep, family, food, laughter and other luxuries of life were called saints. Now, they are called programmers.\"",
            //32
            "\"Programming is like any other sport. You might know the rules but you have to play to learn.\"",
            //33
            "\"Software and cathedrals are much the same – first we build them, then we pray.\"",
            //34
            "\"There’s a big difference between making a simple product & making a product simple.\"",
            //35
            "\"Deleted code is debugged code.\"",
            //36
            "\"Programming today is a race between software engineers striving to build bigger and better idiot-proof programs, and the Universe trying to produce bigger and better idiots. So far, the Universe is winning.\"",
            //37
            "\"If Java had true garbage collection, most programs would delete themselves upon execution.\"",
            //38
            "\"It compiles; ship it.\"",
            //39
            "\"Perfection is achieved not when there is nothing more to add, but rather when there is nothing more to take away.\"",
            //40
            "\"Debugging is twice as hard as writing the code in the first place. Therefore, if you write the code as cleverly as possible, you are, by definition, not smart enough to debug it.\"",
            //41
            "\"No one in the brief history of computing has ever written a piece of perfect software. It’s unlikely that you’ll be the first.\"",
            //42
            "\"Coding is the language of the future, and every girl should learn it. As I’ve learned from watching girls grow and learn in our classrooms, coding is fun, collaborative and creative.\"",
            //43
            "\"Documentation is like sex: When it is bad, it is better than nothing. When it is good, it is really, really good.\"",
            //44
            "\"The most important property of a program is whether it accomplishes the intention of its user.\"",
            //45
            "\"C++: An octopus made by nailing extra legs onto a dog.\"",
            //46
            "\"Remember that there is no code faster than no code.\"",
            //47
            "\"Programming is not a zero-sum game. Teaching something to a fellow programmer doesn’t take it away from you. I’m happy to share what I can, because I’m in it for the love of programming.\"",
            //48
            "\"Good code is its own best documentation. As you’re about to add a comment, ask yourself, 'How can I improve the code so that this comment isn’t needed?' Improve the code and then document it to make it even clearer.\"",
            //49
            "\"How many programmers does it take to change a light bulb? None, that’s a hardware problem.\"",
            //50
            "\"Algorithm: word used by programmers when they don’t want to explain what they did.\"",
            //51
            "\"Object-oriented programming offers a sustainable way to write spaghetti code. It lets you accrete programs as a series of patches.\"",
            //52
            "\"Programming is like sex: one mistake and you have to support it for the rest of your life.\"",
            //53
            "\"A computer is like a mischievous genie. It will give you exactly what you ask for, but not always what you want.\"",
            //54
            "\"Don’t comment your code. If it was hard to write, it should be hard to read.\"",
            //55
            "\"Commenting your code is like cleaning your bathroom – you never want to do it, but it really does create a more pleasant experience for you and your guests.\"",
            //56
            "\"Simplicity is the soul of efficiency.\"",
            //57
            "\"There are only two kinds of programming languages out there. The ones people complain about and the ones no one uses.\"",
            //58
            "\"Linux is only free if your time has no value.\"",
            //59
            "\"You’ll surely have fun when programming Kotlin, promised.\"",
            //60
            "\"Code never lies, comments sometimes do.\"",
            //61
            "\"It’s all talk until the code runs.\"",
            //62
            "\"The most damaging phrase in the language is ‘It’s always been done this way.\"",
            //63
            "\"If debugging is the process of removing software bugs, then programming must be the process of putting them in.\"",
            //64
            "\"Many people tend to look at programming styles and languages like religions: if you belong to one, you cannot belong to others. But this analogy is another fallacy.\"",
            //65
            "\"A son asked his father (a programmer) why the sun rises in the east, and sets in the west. His response? It works, don’t touch!\"",
            //66
            "\"A programming language is low level when its programs require attention to the irrelevant\"",
            //67
            "\"Programs must be written for people to read, and only incidentally for machines to execute.\"",
            //68
            "\"C programmers never die. They are just cast into void.\"",
            //69
            "\"When I wrote this code, only God and I understood what I did. Now only God knows.\"",
            //70
            "\"Some people when confronted with a problem think, “I know, I’ll use regular expressions.” Now they have two problems.\"",
            //71
            "\"Perl – the only language that looks the same before and after RSA encryption.\"",
            //72
            "\"If you put a million monkeys at a million keyboards, one of them will eventually write a Java program. The rest of them will write Perl programs.\"",
            //73
            "\"In a software project team of ten, there are probably three people who produce enough defects to make them net-negative producers.\"",
            //74
            "\"To understand what recursion is, you must first understand recursion.\"",
            //75
            "\"PHP is a minor evil perpetrated and created by incompetent amateurs, whereas Perl is a great and insidious evil perpetrated by skilled but perverted professionals.\"",
            //76
            "\"The first 90% of the code accounts for the first 90% of the development time. The remaining 10% of the code accounts for the other 90% of the development time.\"",
            //77
            "\"Give a man a program, frustrate him for a day. Teach a man to program, frustrate him for lifetime.\"",
            //78
            "\"A great lathe operator commands several times the wage of an average lathe operator, but a great writer of software code is worth 10,000 times the price of an average software writer.\"",
            //79
            "\"Good design adds value faster than it adds cost.\"",
            //80
            "\"Fix the cause, not the symptom.\"",
            //81
            "\"A C program is like a fast dance on a newly waxed dance floor by people carrying razors.\"",
            //82
            "\"Programming can be fun, and so can cryptography; however, they should not be combined.\"",
            //83
            "\"A good programmer is someone who always looks both ways before crossing a one-way street.\"",
            //84
            "\"The most disastrous thing that you can ever learn is your first programming language.\"",
            //85
            "\"Most software today is very much like an Egyptian pyramid with millions of bricks piled on top of each other, with no structural integrity, but just done by brute force and thousands of slaves.\"",
            //86
            "\"Walking on water and developing software from a specification are easy if both are frozen.\"",
            //87
            "\"First, solve the problem. Then, write the code.\"",
            //88
            "\"Theory is when you know something, but it doesn’t work. Practice is when something works, but you don’t know why. Programmers combine theory and practice: Nothing works and they don’t know why.\"",
            //89
            "\"Computers are good at following instructions but not at reading your mind.\"",
            //90
            "\"Before software can be reusable it first has to be usable.\"",
            //91
            "\"A SQL query goes into a bar, walks up to two tables, and asks, ‘Can I join you?'\"",
            //92
            "\"A user interface should be so simple that a beginner in an emergency can understand it within ten seconds\"",
            //93
            "\"There are two ways write error-free programs; only the third works.\"",
            //94
            "\"It works on my machine.\"",
            //95
            "\"What’s the object-oriented way to get wealthy? Inheritance.\"",
            //96
            "\"Programmer: A machine that turns coffee into code.\"",
            //97
            "\"Make it work, make it right, make it fast.\"",
            //98
            "\"The best thing about a boolean is even if you are wrong, you are only off by a bit.\"",
            //99
            "\"Ruby is rubbish! PHP is phpantastic!.\"",
            //100
            "\"When to use iterative development? You should use iterative development only on projects that you want to succeed\"",
            //101
            "\"When your hammer is C++, everything begins to look like a thumb.\"",
            //102
            "\"Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.\"",
            //103
            "\"Talk is cheap. Show me the code.\"",
            //104
            "\"Any code of your own that you haven’t looked at for six or more months might as well have been written by someone else.\"",
            //105
            "\"The only way to learn a new programming language is by writing programs in it.\"",
            //106
            "\"The cheapest, fastest, and most reliable components are those that aren’t there.\"",
            //107
            "\"In programming, the hard part isn’t solving problems, but deciding what problems to solve.\"",
            //108
            "\"Copy-and-Paste was programmed by programmers for programmers actually.\"",
            //109
            "\"If debugging is the process of removing bugs, then programming must be the process of putting them in.\"",
            //110
            "\"Coding is today’s language of creativity. All our children deserve a chance to become creators instead of consumers of computer science.\"",
            //111
            "\"Programmer’s partner: ‘Are you going to sit and type in front of that thing all day, or are you going out with me?’ Programmer: ‘Yes’.\"",
            //112
            "\"I don’t care if it works on your machine! We are not shipping your machine!\"",
            //113
            "\"SELECT *\nFROM `world`\nWHERE `someone`\nLIKE ‘%You%’\n\n/> no results!\"",
            //114
            "\"Everybody should learn to program a computer, because it teaches you how to think.\"",
            //115
            "\"In a room full of top software designers, if two agree on the same thing, that’s a majority.\"",
            //116
            "\"Measuring programming progress by lines of code is like measuring aircraft building progress by weight.\"",
            //117
            "\"Software undergoes beta testing shortly before it’s released. Beta is Latin for still doesn’t work.\"",
            //118
            "\"Python’s a drop-in replacement for BASIC in the sense that Optimus Prime is a drop-in replacement for a truck.\"",
            //119
            "\"I don't see women as objects. I consider each to be in a class of her own..\"",
            //120
            "\"Java is to JavaScript what car is to carpet.\"",
            //121
            "\"Copy and paste is a design error.\"",
            //122
            "\"Testing can only prove the presence of bugs, not their absence.\"",
            //123
            "\"Programming is like kicking yourself in the face, sooner or later your nose will bleed.\"",
            //124
            "\"The only people who have anything to fear from free software are those whose products are worth even less.\"",
            //125
            "\"Java is, in many ways, C++-.\"",
            //126
            "\"The use of COBOL cripples the mind; its teaching should therefore be regarded as a criminal offense.\"",
            //127
            "\"The function of good software is to make the complx appear to be simple.\"",
            //128
            "\"Complexity kills. It sucks the life out of developers, it makes products difficult to plan, build and test, it introduces security challenges, and it causes end-user and administrator frustration.\"",
            //129
            "\"We are Microsoft. Resistance is futile. You will be assimilated.\"",
            //130
            "\"Testing leads to failure, and failure leads to understanding.\"",
            //131
            "\"In some ways, programming is like painting. You start with a blank canvas and certain basic raw materials. You use a combination of science, art, and craft to determine what to do with them.\"",
            //132
            "\"Good programmers use their brains, but good guidelines save us having to think out every case.\"",
            //133
            "\"You can either have software quality or you can have pointer arithmetic, but you cannot have both at the same time.\"",
            //134
            "\"A computer lets you make more mistakes faster than any invention in human history – with the possible exceptions of handguns and tequila.\"",
            //135
            "\"The best error message is the one that never shows up.\"",
            //136
            "\"I think there’s a world market for about 5 computers.\"",
            //137
            "\"I think Microsoft named .Net so it wouldn’t show up in a Unix directory listing.\"",
            //138
            "\"When someone says, ‘I want a programming language in which I need only say what I want done’, give him a lollipop.\"",
            //139
            "\"Writing in C or C++ is like running a chain saw with all the safety guards removed.\"",
            //140
            "\"Most good programmers do programming not because they expect to get paid or get adulation by the public, but because it is fun to program.\"",
            //141
            "\"Software undergoes beta testing shortly before it’s released. Beta is Latin for ‘still doesn’t work’.\"",
            //142
            "\"The trouble with programmers is that you can never tell what a programmer is doing until it’s too late.\"",
            //143
            "\"You can’t have a great software without a great team, and most software teams behave like dysfunctional families.\"",
            //144
            "\"Should array indices start at 0 or 1? My compromise of 0.5 was rejected without, I thought, proper consideration.\"",
            //145
            "\"To err is human, but to really foul things up you need a computer.\"",
            //146
            "\"First learn computer science and all the theory. Next develop a programming style. Then forget all that and just hack.\"",
            //147
            "\"To iterate is human, to recurse divine.\"",
            //148
            "\"Controlling complexity is the essence of computer programming.\"",
            //149
            "\"That’s what’s cool about working with computers. They don’t argue, they remember everything, and they don’t drink all your beer.\"",
            //150
            "\"The best performance improvement is the transition from the nonworking state to the working state.\"",
            //151
            "\"Computer language design is just like a stroll in the park. Jurassic Park, that is.\""
    };
    private static String[] quotesCodingAuthors = {
            //0
            "Chris Pine",
            //1
            "Kent Beck",
            //2
            "Cory House",
            //3
            "Louis Srygley",
            //4
            "Donald Knuth",
            //5
            "Max Kanat-Alexander",
            //6
            "John Romero",
            //7
            "Hofstadter's Law",
            //8
            "Unknown",
            //9
            "Richard Pattis",
            //10
            "Unknown",
            //11
            "Unknown",
            //12
            "Donald Knuth",
            //13
            "Stephen Hawking",
            //14
            "Unknown",
            //15
            "Mark Zuckerberg",
            //16
            "Unknown",
            //17
            "Unknown",
            //18
            "Rick Osborne",
            //19
            "Jan L. A. van de Snepscheut",
            //20
            "Unknown",
            //21
            "Martin Fowler",
            //22
            "Unknown",
            //23
            "Unknown",
            //24
            "Damian Conway",
            //25
            "Bjarne Stroustrup",
            //26
            "Alan J. Perlis",
            //27
            "Eric Raymond",
            //28
            "Andrew Hunt & David Thomas",
            //29
            "Unknown",
            //30
            "Unknown",
            //31
            "Unknown",
            //32
            "Mark Zuckerberg",
            //33
            "Unknown",
            //34
            "Des Traynor",
            //35
            "Jeff Sickel",
            //36
            "Unknown",
            //37
            "Robert Sewell",
            //38
            "Unknown",
            //39
            "Antoine de Saint-Exupéry",
            //40
            "Unknown",
            //41
            "Andy Hunt",
            //42
            "Reshma Saujani",
            //43
            "Unknown",
            //44
            "C. A. R. Hoare",
            //45
            "Unknown",
            //46
            "Unknown",
            //47
            "John Carmack",
            //48
            "Steve McConnell",
            //49
            "Unknown",
            //50
            "Unknown",
            //51
            "Paul Graham",
            //52
            "Michael Sinz",
            //53
            "Joe Sondow",
            //54
            "Unknown",
            //55
            "Ryan Campbell",
            //56
            "Austin Freeman",
            //57
            "Bjarne Stroustrup",
            //58
            "Jamie Zawinski",
            //59
            "Unknown",
            //60
            "Ron Jeffries",
            //61
            "Ward Cunningham",
            //62
            "Grace Hopper",
            //63
            "Edsger Dijkstra",
            //64
            "Niklaus Wirth",
            //65
            "Unknown",
            //66
            "Alan J. Perlis",
            //67
            "Hal Abelson",
            //68
            "Unknown",
            //69
            "UnKnown",
            //70
            "Jamie Zawinski",
            //71
            "Keith Bostic",
            //72
            "Unknown",
            //73
            "Unknown",
            //74
            "Unknown",
            //75
            "Jon Ribbens",
            //76
            "Tom Cargill",
            //77
            "Muhammad Waseem",
            //78
            "Bill Gates",
            //79
            "Thomas C. Gale",
            //80
            "Steve Maguire",
            //81
            "Waldi Ravens",
            //82
            "Kreitzberg & Shneiderman",
            //83
            "Unknown",
            //84
            "Alan Kay",
            //85
            "Alan Kay",
            //86
            "Edward V. Berard",
            //87
            "John Johnson",
            //88
            "Unknown",
            //89
            "Unknown",
            //90
            "Ralph Johnson",
            //91
            "Unknown",
            //92
            "Ted Nelson",
            //93
            "Unknown",
            //94
            "Unknown",
            //95
            "Unknown",
            //96
            "Unknown",
            //97
            "Kent Beck",
            //98
            "Unknown",
            //99
            "Nikita Popov",
            //100
            "Martin Fowler",
            //101
            "Unknown",
            //102
            "Dan Salomon",
            //103
            "Linus Torvalds",
            //104
            "Eagleson’s law",
            //105
            "Dennis Ritchie",
            //106
            "Gordon Bell",
            //107
            "Paul Graham",
            //108
            "Unknown",
            //109
            "Unknown",
            //110
            "Maria Klawe",
            //111
            "Unknown",
            //112
            "Vidiu Platon",
            //113
            "Unknown",
            //114
            "Steve Jobs",
            //115
            "Unknown",
            //116
            "Bill Gates",
            //117
            "Unknown",
            //118
            "Cory Dodt",
            //119
            "Unknown",
            //120
            "Chris Heilmann",
            //121
            "David Parnas",
            //122
            "Edsger W. Dijkstra",
            //123
            "Kyle Woodbury",
            //124
            "David Emery",
            //125
            "Michael Feldman",
            //126
            "E. W. Dijkstra",
            //127
            "Grady Booch",
            //128
            "Ray Ozzie",
            //129
            "Unknown",
            //130
            "Burt Rutan",
            //131
            "Andrew Hunt",
            //132
            "Francis Glassborow",
            //133
            "Bertrand Meyer",
            //134
            "Mitch Radcliffe",
            //135
            "Thomas Fuchs",
            //136
            "Thomas J. Watson, IBM, 1948",
            //137
            "Unknown",
            //138
            "Unknown",
            //139
            "Bob Gray",
            //140
            "Linus Torvalds",
            //141
            "Unknown",
            //142
            "Seymour Cray",
            //143
            "Jim McCarthy",
            //144
            "Stan Kelly-Bootle",
            //145
            "Paul Ehrlich",
            //146
            "George Carrette",
            //147
            "L. Peter Deutsch",
            //148
            "Brian Kernigan",
            //149
            "Paul Leary",
            //150
            "John Osterhout",
            //151
            "Larry Wall"
    };
    private static String[][] codingTags = {
            //0
            {"coding", "chris", "pine", "programming", "isn’t", "about", "what", "you", "know", "it’s", "can", "figure", "out"},
            //1
            {"coding", "kent", "beck", "optimism", "is", "an", "occupational", "hazard", "of", "programming", "feedback", "the", "treatment"},
            //2
            {"coding", "cory", "house", "code", "is", "like", "humor", "when", "you", "have", "to", "explain", "it", "it’s", "bad"},
            //3
            {"coding", "louis", "srygley", "without", "requirements", "or", "design", "programming", "is", "the", "art", "of", "adding", "bugs", "to", "an", "empty", "text", "file"},
            //4
            {"coding", "donald", "knuth", "beware", "of", "bugs", "in", "the", "above", "code", "i", "have", "only", "proved", "it", "correct", "not", "tried"},
            //5
            {"coding", "max", "kanatalexander", "some", "of", "the", "best", "programming", "is", "done", "on", "paper", "really", "putting", "it", "into", "computer", "just", "a", "minor", "detail"},
            //6
            {"coding", "john", "romero", "you", "might", "not", "think", "that", "programmers", "are", "artists", "but", "programming", "is", "an", "extremely", "creative", "progression", "it’s", "logicbased", "creativity"},
            //7
            {"coding", "douglas", "hofstadter", "it", "always", "takes", "longer", "than", "you", "expect", "even", "when", "take", "into", "account", "hofstadter’s", "law"},
            //8
            {"coding", "measuring", "programming", "progress", "by", "lines", "of", "code", "is", "like", "aircraft", "building", "weight"},
            //9
            {"coding", "richard", "pattis", "when", "debugging", "novices", "insert", "corrective", "code", "experts", "remove", "defective"},
            //10
            {"coding", "no", "code", "has", "zero", "defects"},
            //11
            {"coding", "there", "are", "only", "10", "types", "of", "people", "in", "this", "world", "those", "who", "know", "binary", "and", "don’t"},
            //12
            {"coding", "donald", "knuth", "everyday", "life", "is", "like", "programming", "i", "guess", "if", "you", "love", "something", "can", "put", "beauty", "into", "it"},
            //13
            {"coding", "stephen", "hawking", "whether", "you", "want", "to", "uncover", "the", "secrets", "of", "universe", "or", "just", "pursue", "a", "career", "in", "21st", "century", "basic", "computer", "programming", "is", "an", "essential", "skill", "learn"},
            //14
            {"coding", "why", "do", "java", "programmers", "have", "to", "wear", "glasses", "because", "they", "don’t", "c#"},
            //15
            {"coding", "mark", "zuckerberg", "all", "of", "my", "friends", "who", "have", "younger", "siblings", "are", "going", "to", "college", "or", "high", "school", "number", "one", "piece", "advice", "is", "you", "should", "learn", "how", "program"},
            //16
            {"coding", "there", "is", "no", "ctrlz", "in", "life"},
            //17
            {"coding", "don’t", "worry", "if", "it", "doesn’t", "work", "right", "everything", "did", "you’d", "be", "out", "of", "a", "job"},
            //18
            {"coding", "rick", "osborne", "always", "code", "as", "if", "they", "guy", "who", "ends", "up", "maintaining", "your", "will", "be", "a", "violent", "psychopath", "knows", "where", "you", "live"},
            //19
            {"coding", "jan", "l", "a", "van", "de", "snepscheut", "in", "theory", "there", "is", "no", "difference", "between", "and", "practice", "but"},
            //20
            {"coding", "one", "man’s", "crappy", "software", "is", "another", "fulltime", "job"},
            //21
            {"coding", "martin", "fowler", "any", "fool", "can", "write", "code", "that", "a", "computer", "understand", "good", "programmers", "humans"},
            //22
            {"coding", "most", "of", "you", "are", "familiar", "with", "the", "virtues", "a", "programmer", "there", "three", "course", "laziness", "impatience", "and", "hubris"},
            //23
            {"coding", "one", "demonstrations", "always", "crash", "and", "two", "the", "probability", "of", "them", "crashing", "goes", "up", "exponentially", "with", "number", "people", "watching"},
            //24
            {"coding", "damian", "conway", "documentation", "is", "a", "love", "letter", "that", "you", "write", "to", "your", "future", "self"},
            //25
            {"coding", "c", "makes", "it", "easy", "to", "shoot", "yourself", "in", "the", "foot", "c++", "harder", "but", "when", "you", "do", "blows", "your", "whole", "leg", "off"},
            //26
            {"coding", "alan", "j", "perlis", "programmers", "are", "not", "to", "be", "measured", "by", "their", "ingenuity", "and", "logic", "but", "the", "completeness", "of", "case", "analysis"},
            //27
            {"coding", "eric", "raymond", "computer", "science", "education", "cannot", "make", "anybody", "an", "expert", "programmer", "any", "more", "than", "studying", "brushes", "and", "pigment", "can", "somebody", "painter"},
            //28
            {"coding", "andrew", "h", "hunt", "and", "david", "thomas", "it’s", "not", "at", "all", "important", "to", "get", "it", "right", "the", "first", "time", "vitally", "last"},
            //29
            {"coding", "it’s", "not", "a", "bug", "an", "undocumented", "feature"},
            //30
            {"coding", "99", "little", "bugs", "in", "the", "code", "take", "one", "down", "patch", "it", "around", "127"},
            //31
            {"coding", "long", "time", "ago", "people", "who", "sacrificed", "their", "sleep", "family", "food", "laughter", "and", "other", "luxuries", "of", "life", "were", "called", "saints", "now", "they", "are", "programmers"},
            //32
            {"coding", "mark", "zuckerberg", "programming", "is", "like", "any", "other", "sport", "you", "might", "know", "the", "rules", "but", "have", "to", "play", "learn"},
            //33
            {"coding", "software", "and", "cathedrals", "are", "much", "the", "same", "first", "we", "build", "them", "then", "pray"},
            //34
            {"coding", "des", "traynor", "there’s", "a", "big", "difference", "between", "making", "simple", "product"},
            //35
            {"coding", "jeff", "sickel", "deleted", "code", "is", "debugged"},
            //36
            {"coding", "programming", "today", "is", "a", "race", "between", "software", "engineers", "striving", "to", "build", "bigger", "and", "better", "idiotproof", "programs", "the", "universe", "trying", "produce", "idiots", "so", "far", "winning"},
            //37
            {"coding", "robert", "sewell", "if", "java", "had", "true", "garbage", "collection", "most", "programs", "would", "delete", "themselves", "upon", "execution"},
            //38
            {"coding", "it", "compiles", "ship"},
            //39
            {"coding", "antoine", "de", "saintexupéry", "saintexupery", "perfection", "is", "achieved", "not", "when", "there", "nothing", "more", "to", "add", "but", "rather", "take", "away"},
            //40
            {"coding", "debugging", "is", "twice", "as", "hard", "writing", "the", "code", "in", "first", "place", "therefore", "if", "you", "write", "cleverly", "possible", "are", "by", "definition", "not", "smart", "enough", "to", "debug", "it"},
            //41
            {"coding", "andy", "hunt", "no", "one", "in", "the", "brief", "history", "of", "computing", "has", "ever", "written", "a", "piece", "perfect", "software", "it’s", "unlikely", "that", "you’ll", "be", "first"},
            //42
            {"coding", "reshma", "saujani", "is", "the", "language", "of", "future", "and", "every", "girl", "should", "learn", "it", "as", "i’ve", "learned", "from", "watching", "girls", "grow", "in", "our", "classrooms", "fun", "collaborative", "creative"},
            //43
            {"coding", "documentation", "is", "like", "sex", "when", "it", "bad", "better", "than", "nothing", "good", "really"},
            //44
            {"coding", "c", "a", "r", "hoare", "the", "most", "important", "property", "of", "a", "program", "is", "whether", "it", "accomplishes", "intention", "its", "user"},
            //45
            {"coding", "c++", "an", "octopus", "made", "by", "nailing", "extra", "legs", "onto", "a", "dog"},
            //46
            {"coding", "remember", "that", "there", "is", "no", "code", "faster", "than"},
            //47
            {"coding", "john", "carmack", "programming", "is", "not", "a", "zerosum", "game", "teaching", "something", "to", "fellow", "programmer", "doesn’t", "take", "it", "away", "from", "you", "i’m", "happy", "share", "what", "i", "can", "because", "in", "for", "the", "love", "of"},
            //48
            {"coding", "steve", "mcconell", "good", "code", "is", "its", "own", "best", "documentation", "as", "you’re", "about", "to", "add", "a", "comment", "ask", "yourself", "'how", "can", "i", "improve", "the", "so", "that", "this", "isn’t", "needed'", "and", "then", "document", "it", "make", "even", "clearer"},
            //49
            {"coding", "how", "many", "programmers", "does", "it", "take", "to", "change", "a", "light", "bulb", "none", "that’s", "hardware", "problem"},
            //50
            {"coding", "algorithm", "word", "used", "by", "programmers", "when", "they", "don’t", "want", "to", "explain", "what", "did"},
            //51
            {"coding", "paul", "graham", "objectoriented", "programming", "offers", "a", "sustainable", "way", "to", "write", "spaghetti", "code", "it", "lets", "you", "accrete", "programs", "as", "series", "of", "patches"},
            //52
            {"coding", "michael", "sinz", "programming", "is", "like", "sex", "one", "mistake", "and", "you", "have", "to", "support", "it", "for", "the", "rest", "of", "your", "life"},
            //53
            {"coding", "joe", "sondow", "a", "computer", "is", "like", "mischievous", "genie", "it", "will", "give", "you", "exactly", "what", "ask", "for", "but", "not", "always", "want"},
            //54
            {"coding", "don’t", "comment", "your", "code", "if", "it", "was", "hard", "to", "write", "should", "be", "read"},
            //55
            {"coding", "ryan", "campbell", "commenting", "your", "code", "is", "like", "cleaning", "bathroom", "you", "never", "want", "to", "do", "it", "but", "really", "does", "create", "a", "more", "pleasant", "experience", "for", "and", "guests"},
            //56
            {"coding", "austin", "freeman", "simplicity", "is", "the", "soul", "of", "efficiency"},
            //57
            {"coding", "bjarne", "stroustrup", "there", "are", "only", "two", "kinds", "of", "programming", "languages", "out", "the", "ones", "people", "complain", "about", "and", "no", "one", "uses"},
            //58
            {"coding", "jamie", "zawinski", "linux", "is", "only", "free", "if", "your", "time", "has", "no", "value"},
            //59
            {"coding", "you’ll", "surely", "have", "fun", "when", "programming", "kotlin", "promised"},
            //60
            {"coding", "ron", "jeffries", "code", "never", "lies", "comments", "sometimes", "do"},
            //61
            {"coding", "ward", "cunningham", "it’s", "all", "talk", "until", "the", "code", "runs"},
            //62
            {"coding", "grace", "hopper", "the", "most", "damaging", "phrase", "in", "language", "is", "‘it’s", "always", "been", "done", "this", "way"},
            //63
            {"coding", "edsger", "dijkstra", "if", "debugging", "is", "the", "process", "of", "removing", "software", "bugs", "then", "programming", "must", "be", "putting", "them", "in"},
            //64
            {"coding", "niklaus", "wirth", "many", "people", "tend", "to", "look", "at", "programming", "styles", "and", "languages", "like", "religions", "if", "you", "belong", "one", "cannot", "others", "but", "this", "analogy", "is", "another", "fallacy"},
            //65
            {"coding", "a", "son", "asked", "his", "father", "programmer", "why", "the", "sun", "rises", "in", "east", "and", "sets", "west", "response", "it", "works", "don’t", "touch"},
            //66
            {"coding", "alan", "j", "perlis", "a", "programming", "language", "is", "low", "level", "when", "its", "programs", "require", "attention", "to", "the", "irrelevant"},
            //67
            {"coding", "hal", "abelson", "programs", "must", "be", "written", "for", "people", "to", "read", "and", "only", "incidentally", "machines", "execute"},
            //68
            {"coding", "c", "programmers", "never", "die", "they", "are", "just", "cast", "into", "void"},
            //69
            {"coding", "when", "i", "wrote", "this", "code", "only", "god", "and", "understood", "what", "did", "now", "knows"},
            //70
            {"coding", "jamie", "zawinski", "some", "people", "when", "confronted", "with", "a", "problem", "think", "“i", "know", "i’ll", "use", "regular", "expressions”", "now", "they", "have", "two", "problems"},
            //71
            {"coding", "keith", "bostic", "perl", "the", "only", "language", "that", "looks", "same", "before", "and", "after", "rsa", "encryption"},
            //72
            {"coding", "if", "you", "put", "a", "million", "monkeys", "at", "keyboards", "one", "of", "them", "will", "eventually", "write", "java", "program", "the", "rest", "perl", "programs"},
            //73
            {"coding", "in", "a", "software", "project", "team", "of", "ten", "there", "are", "probably", "three", "people", "who", "produce", "enough", "defects", "to", "make", "them", "netnegative", "producers"},
            //74
            {"coding", "to", "understand", "what", "recursion", "is", "you", "must", "first"},
            //75
            {"coding", "jon", "ribbens", "php", "is", "a", "minor", "evil", "perpetrated", "and", "created", "by", "incompetent", "amateurs", "whereas", "perl", "great", "insidious", "skilled", "but", "perverted", "professionals"},
            //76
            {"coding", "tom", "cargill", "the", "first", "90%", "of", "code", "accounts", "for", "development", "time", "remaining", "10%", "other"},
            //77
            {"coding", "muhammad", "waseem", "give", "a", "man", "program", "frustrate", "him", "for", "day", "teach", "to", "lifetime"},
            //78
            {"coding", "bill", "gates", "a", "great", "lathe", "operator", "commands", "several", "times", "the", "wage", "of", "an", "average", "but", "writer", "software", "code", "is", "worth", "10000", "price"},
            //79
            {"coding", "thomas", "c", "gale", "good", "design", "adds", "value", "faster", "than", "it", "cost"},
            //80
            {"coding", "steve", "maguire", "fix", "the", "cause", "not", "symptom"},
            //81
            {"coding", "waldi", "ravens", "a", "c", "program", "is", "like", "fast", "dance", "on", "newly", "waxed", "floor", "by", "people", "carrying", "razors"},
            //82
            {"coding", "kreitzberg", "and", "shneiderman", "programming", "can", "be", "fun", "and", "so", "cryptography", "however", "they", "should", "not", "combined"},
            //83
            {"coding", "a", "good", "programmer", "is", "someone", "who", "always", "looks", "both", "ways", "before", "crossing", "oneway", "street"},
            //84
            {"coding", "alan", "kay", "the", "most", "disastrous", "thing", "that", "you", "can", "ever", "learn", "is", "your", "first", "programming", "language"},
            //85
            {"coding", "alan", "kay", "most", "software", "today", "is", "very", "much", "like", "an", "egyptian", "pyramid", "with", "millions", "of", "bricks", "piled", "on", "top", "each", "other", "no", "structural", "integrity", "but", "just", "done", "by", "brute", "force", "and", "thousands", "slaves"},
            //86
            {"coding", "edward", "v", "berard", "walking", "on", "water", "and", "developing", "software", "from", "a", "specification", "are", "easy", "if", "both", "frozen"},
            //87
            {"coding", "john", "johnson", "first", "solve", "the", "problem", "then", "write", "code"},
            //88
            {"coding", "theory", "is", "when", "you", "know", "something", "but", "it", "doesn’t", "work", "practice", "works", "don’t", "why", "programmers", "combine", "and", "nothing", "they"},
            //89
            {"coding", "computers", "are", "good", "at", "following", "instructions", "but", "not", "reading", "your", "mind"},
            //90
            {"coding", "ralph", "johnson", "before", "software", "can", "be", "reusable", "it", "first", "has", "to", "usable"},
            //91
            {"coding", "a", "sql", "query", "goes", "into", "bar", "walks", "up", "to", "two", "tables", "and", "asks", "can", "i", "join", "you"},
            //92
            {"coding", "ted", "nelson", "a", "user", "interface", "should", "be", "so", "simple", "that", "beginner", "in", "an", "emergency", "can", "understand", "it", "within", "ten", "seconds"},
            //93
            {"coding", "there", "are", "two", "ways", "write", "errorfree", "programs", "only", "the", "third", "works"},
            //94
            {"coding", "it", "works", "on", "my", "machine"},
            //95
            {"coding", "what’s", "the", "objectoriented", "way", "to", "get", "wealthy", "inheritance"},
            //96
            {"coding", "programmer", "a", "machine", "that", "turns", "coffee", "into", "code"},
            //97
            {"coding", "kent", "beck", "make", "it", "work", "right", "fast"},
            //98
            {"coding", "the", "best", "thing", "about", "a", "boolean", "is", "even", "if", "you", "are", "wrong", "only", "off", "by", "bit"},
            //99
            {"coding", "nikita", "popov", "ruby", "is", "rubbish", "php", "phpantastic"},
            //100
            {"coding", "martin", "fowler", "when", "to", "use", "iterative", "development", "you", "should", "only", "on", "projects", "that", "want", "succeed"},
            //101
            {"coding", "when", "your", "hammer", "is", "c++", "everything", "begins", "to", "look", "like", "a", "thumb"},
            //102
            {"coding", "dan", "salomon", "sometimes", "it", "pays", "to", "stay", "in", "bed", "on", "monday", "rather", "than", "spending", "the", "rest", "of", "week", "debugging", "monday’s", "code"},
            //103
            {"coding", "linux", "linus", "torvalds", "talk", "is", "cheap", "show", "me", "the", "code"},
            //104
            {"coding", "eagleson's", "law", "any", "code", "of", "your", "own", "that", "you", "haven’t", "looked", "at", "for", "six", "or", "more", "months", "might", "as", "well", "have", "been", "written", "by", "someone", "else"},
            //105
            {"coding", "dennis", "ritchie", "the", "only", "way", "to", "learn", "a", "new", "programming", "language", "is", "by", "writing", "programs", "in", "it"},
            //106
            {"coding", "gordon", "bell", "the", "cheapest", "fastest", "and", "most", "reliable", "components", "are", "those", "that", "aren’t", "there"},
            //107
            {"coding", "paul", "graham", "in", "programming", "the", "hard", "part", "isn’t", "solving", "problems", "but", "deciding", "what", "to", "solve"},
            //108
            {"coding", "copyandpaste", "was", "programmed", "by", "programmers", "for", "actually"},
            //109
            {"coding", "if", "debugging", "is", "the", "process", "of", "removing", "bugs", "then", "programming", "must", "be", "putting", "them", "in"},
            //110
            {"coding", "maria", "klawe", "is", "today’s", "language", "of", "creativity", "all", "our", "children", "deserve", "a", "chance", "to", "become", "creators", "instead", "consumers", "computer", "science"},
            //111
            {"coding", "programmer’s", "partner", "are", "you", "going", "to", "sit", "and", "type", "in", "front", "of", "that", "thing", "all", "day", "or", "are", "out", "with", "me", "programmer", "yes"},
            //112
            {"coding", "vidiu", "platon", "i", "don’t", "care", "if", "it", "works", "on", "your", "machine", "we", "are", "not", "shipping"},
            //113
            {"coding", "select", "from", "world", "where", "someone", "like", "you", "no", "results"},
            //114
            {"coding", "steve", "jobs", "everybody", "should", "learn", "to", "program", "a", "computer", "because", "it", "teaches", "you", "how", "think"},
            //115
            {"coding", "in", "a", "room", "full", "of", "top", "software", "designers", "if", "two", "agree", "on", "the", "same", "thing", "that’s", "majority"},
            //116
            {"coding", "bill", "gates", "measuring", "programming", "progress", "by", "lines", "of", "code", "is", "like", "aircraft", "building", "weight"},
            //117
            {"coding", "software", "undergoes", "beta", "testing", "shortly", "before", "it’s", "released", "is", "latin", "for", "still", "doesn’t", "work"},
            //118
            {"coding", "cory", "dodth", "python’s", "a", "dropin", "replacement", "for", "basic", "in", "the", "sense", "that", "optimus", "prime", "is", "truck"},
            //119
            {"coding", "bjarne", "stroustrup", "i", "don't", "see", "women", "as", "objects", "consider", "each", "to", "be", "in", "a", "class", "of", "her", "own"},
            //120
            {"coding", "chris", "heilmann", "java", "is", "to", "javascript", "what", "car", "carpet"},
            //121
            {"coding", "david", "parnas", "copy", "and", "paste", "is", "a", "design", "error"},
            //122
            {"coding", "edsger", "w", "dijkstra", "testing", "can", "only", "prove", "the", "presence", "of", "bugs", "not", "their", "absence"},
            //123
            {"coding", "kyle", "woodbury", "programming", "is", "like", "kicking", "yourself", "in", "the", "face", "sooner", "or", "later", "your", "nose", "will", "bleed"},
            //124
            {"coding", "david", "emery", "the", "only", "people", "who", "have", "anything", "to", "fear", "from", "free", "software", "are", "those", "whose", "products", "worth", "even", "less"},
            //125
            {"coding", "michael", "feldman", "java", "is", "in", "many", "ways", "c++"},
            //126
            {"coding", "e", "w", "dijkstra", "the", "use", "of", "cobol", "cripples", "mind", "its", "teaching", "should", "therefore", "be", "regarded", "as", "a", "criminal", "offense"},
            //127
            {"coding", "grady", "booch", "the", "function", "of", "good", "software", "is", "to", "make", "complx", "appear", "be", "simple"},
            //128
            {"coding", "ray", "ozzie", "complexity", "kills", "it", "sucks", "the", "life", "out", "of", "developers", "makes", "products", "difficult", "to", "plan", "build", "and", "test", "introduces", "security", "challenges", "causes", "enduser", "administrator", "frustration"},
            //129
            {"coding", "we", "are", "microsoft", "resistance", "is", "futile", "you", "will", "be", "assimilated"},
            //130
            {"coding", "burt", "rutan", "testing", "leads", "to", "failure", "and", "understanding"},
            //131
            {"coding", "andrew", "hunt", "in", "some", "ways", "programming", "is", "like", "painting", "you", "start", "with", "a", "blank", "canvas", "and", "certain", "basic", "raw", "materials", "use", "combination", "of", "science", "art", "craft", "to", "determine", "what", "do", "them"},
            //132
            {"coding", "francis", "glassborow", "good", "programmers", "use", "their", "brains", "but", "guidelines", "save", "us", "having", "to", "think", "out", "every", "case"},
            //133
            {"coding", "bertrand", "meyer", "you", "can", "either", "have", "software", "quality", "or", "pointer", "arithmetic", "but", "cannot", "both", "at", "the", "same", "time"},
            //134
            {"coding", "mitch", "radcliffe", "a", "computer", "lets", "you", "make", "more", "mistakes", "faster", "than", "any", "invention", "in", "human", "history", "with", "the", "possible", "exceptions", "of", "handguns", "and", "tequila"},
            //135
            {"coding", "thomas", "fuchs", "the", "best", "error", "message", "is", "one", "that", "never", "shows", "up"},
            //136
            {"coding", "thomas", "j", "watson", "i", "think", "there’s", "a", "world", "market", "for", "about", "5", "computers"},
            //137
            {"coding", "i", "think", "microsoft", "named", "net", "so", "it", "wouldn’t", "show", "up", "in", "a", "unix", "directory", "listing"},
            //138
            {"coding", "when", "someone", "says", "‘i", "want", "a", "programming", "language", "in", "which", "i", "need", "only", "say", "what", "done’", "give", "him", "lollipop"},
            //139
            {"coding", "bob", "gray", "writing", "in", "c", "or", "c++", "is", "like", "running", "a", "chain", "saw", "with", "all", "the", "safety", "guards", "removed"},
            //140
            {"coding", "linus", "torvalds", "most", "good", "programmers", "do", "programming", "not", "because", "they", "expect", "to", "get", "paid", "or", "adulation", "by", "the", "public", "but", "it", "is", "fun", "program"},
            //141
            {"coding", "software", "undergoes", "beta", "testing", "shortly", "before", "it’s", "released", "is", "latin", "for", "still", "doesn’t", "work"},
            //142
            {"coding", "seymour", "cray", "the", "trouble", "with", "programmers", "is", "that", "you", "can", "never", "tell", "what", "a", "programmer", "doing", "until", "it’s", "too", "late"},
            //143
            {"coding", "jim", "mccarthy", "you", "can’t", "have", "a", "great", "software", "without", "team", "and", "most", "teams", "behave", "like", "dysfunctional", "families"},
            //144
            {"coding", "stan", "kellybootle", "should", "array", "indices", "start", "at", "0", "or", "1", "my", "compromise", "of", "05", "was", "rejected", "without", "i", "thought", "proper", "consideration"},
            //145
            {"coding", "paul", "ehrlich", "to", "err", "is", "human", "but", "really", "foul", "things", "up", "you", "need", "a", "computer"},
            //146
            {"coding", "george", "carrette", "first", "learn", "computer", "science", "and", "all", "the", "theory", "next", "develop", "a", "programming", "style", "then", "forget", "that", "just", "hack"},
            //147
            {"coding", "l", "peter", "deutsch", "to", "iterate", "is", "human", "recurse", "divine"},
            //148
            {"coding", "brian", "kernigan", "controlling", "complexity", "is", "the", "essence", "of", "computer", "programming"},
            //149
            {"coding", "paul", "leary", "that’s", "what’s", "cool", "about", "working", "with", "computers", "they", "don’t", "argue", "remember", "everything", "and", "drink", "all", "your", "beer"},
            //150
            {"coding", "john", "osterhout", "the", "best", "performance", "improvement", "is", "transition", "from", "nonworking", "state", "to", "working"},
            //151
            {"coding", "larry", "wall", "computer", "language", "design", "is", "just", "like", "a", "stroll", "in", "the", "park", "jurassic", "that"}
    };

    public static String getCodingQuote(int position) {
        return quotesCoding[position];
    }

    public static String getCodingAuthor(int position) {
        return quotesCodingAuthors[position];
    }

    public static String[] getCodingList() {
        return quotesCoding;
    }

    static String[][] getCodingTags() {
        return codingTags;
    }

    public static int getCodingListSize() {
        return quotesCoding.length;
    }
}
