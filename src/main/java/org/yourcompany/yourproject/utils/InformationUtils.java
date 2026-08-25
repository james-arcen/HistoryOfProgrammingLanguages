package org.yourcompany.yourproject.utils;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JPanel;
// Call the index value of the item
public class InformationUtils{
        public static JPanel displayInfo(int index, int screenWidth, int screenHeight){
            //Dynamic size
            double displayWidth = screenWidth  *.7;
            double displayHeight = screenHeight * .7;

            //Centering
            double calculatedX = ((screenWidth - displayWidth) / 2);
            double calculatedY = ((screenHeight - displayHeight) / 2);

            Dimension panelSize = new Dimension((int)displayWidth,(int)displayHeight);
            Rectangle bounds = new Rectangle((int)calculatedX, (int)calculatedY, (int)displayWidth, (int)displayHeight);

            

            switch (index) {
                case 1: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran I", "The IBM Mathematical Formula Translating System, widely known as Fortran I, was developed by a team led by John Backus at IBM in 1957. It was a revolutionary leap in computer science, functioning as the first widely used high-level, general-purpose programming language. Prior to Fortran, programmers had to write code in raw machine language or complex assembly, meaning they had to understand the exact hardware architecture of the machine they were working on.\n\nFortran introduced the concept of an optimizing compiler. Backus knew that scientists and engineers would refuse to use a high-level language unless the generated machine code was nearly as fast as hand-coded assembly. The Fortran I compiler was an engineering marvel, analyzing code to optimize register allocation and execution paths. It allowed scientists to write equations natively (like 'A = B + C'), which drastically reduced the time it took to program the IBM 704 mainframe, decreasing code size by up to a factor of 20.\n\nWhile its syntax was rigid and tied strictly to the 72-column format of IBM punch cards, its impact was immediate. It proved that abstraction did not have to come at the cost of execution speed, laying the intellectual and architectural foundation for every compiled programming language that followed.", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 2: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran II", "Released in 1958, Fortran II was a critical evolution of the original Fortran language that solved one of its most glaring architectural flaws: the lack of modularity. In Fortran I, a program had to be compiled as a single, monolithic block of code. If an engineer found a single bug or made a typo, the entire program had to be recompiled from scratch, tying up incredibly expensive mainframe processing time.\n\nFortran II introduced the concepts of procedural programming through independent compilation. It provided the 'SUBROUTINE', 'FUNCTION', and 'END' statements, allowing developers to break their massive mathematical calculations into smaller, self-contained, and reusable modules. Teams of programmers could now work on different subroutines simultaneously, compile them independently into object code, and link them together later.\n\nTo allow these independent subroutines to share data without passing massive lists of variables back and forth, Fortran II introduced the 'COMMON' block, creating early mechanisms for global shared memory. This architectural shift from monolithic scripts to modular procedures fundamentally changed how enterprise and scientific software was engineered.", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 3: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran IV", "Introduced in 1962 for the IBM 7090 series, Fortran IV represents the point where Fortran transitioned from an IBM-specific tool into an industry-wide standard. By stripping out early machine-dependent anomalies that were hardcoded for the IBM 704, Fortran IV allowed competing mainframe manufacturers to build their own compatible compilers.\n\nOn a technical level, Fortran IV significantly expanded the language's expressiveness. It introduced the logical IF statement, which evaluated boolean expressions (TRUE or FALSE) rather than relying on the older, clunky arithmetic IF statement that branched based on positive, negative, or zero values. It also officially introduced logical data types and double-precision floating-point numbers for extreme mathematical accuracy.\n\nDue to its clean design and portability across different hardware architectures, Fortran IV dominated the 1960s and 1970s. Its widespread adoption was so absolute that it served as the baseline for 'FORTRAN 66', the very first programming language ever to be formally standardized by the American National Standards Institute (ANSI).", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 4: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran 77", "Officially standardized in 1978, Fortran 77 was a massive modernization effort that brought the aging language into the era of structured programming. By the late 1970s, computer scientists had identified that the heavy reliance on 'GO TO' statements was creating unmaintainable 'spaghetti code.' Fortran 77 solved this by introducing block-level control structures, specifically the block IF/THEN/ELSE/END IF statements.\n\nBeyond control flow, Fortran 77 introduced built-in character data types and string manipulation, heavily reducing the reliance on clunky numeric arrays for processing text. It also provided standardized file I/O operations, making it much easier to read and write data to disk drives regardless of the underlying operating system.\n\nFortran 77 became an entrenched standard in the scientific, engineering, and supercomputing communities. Throughout the 1980s, it was the primary language used to program Cray supercomputers. Its legacy is immortalized by massive, highly optimized linear algebra libraries like BLAS and LAPACK, which were written in Fortran 77 and are still actively executing under the hood of modern Python and R machine learning frameworks.", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 5: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran 90", "Released in 1991, Fortran 90 was the most dramatic revision in the language's history, completely changing its look, feel, and underlying architecture to compete with modern languages like C++. Most visibly, it abolished the archaic fixed-format punch card layout, allowing free-form source code with inline comments.\n\nUnder the hood, Fortran 90 introduced incredibly powerful array programming semantics. Engineers could now add, multiply, or slice entire matrices with a single line of code (e.g., A = B + C), which the compiler could automatically vectorize for execution on parallel supercomputers. It also introduced dynamic memory allocation, allowing arrays to be sized at runtime rather than hardcoded into the program.\n\nFurthermore, Fortran 90 introduced modules and data encapsulation, giving the language early object-oriented capabilities, as well as support for recursion and user-defined derived data types (similar to C structs). This massive overhaul ensured Fortran's survival into the 21st century as the premier language for computationally intense numerical weather prediction, fluid dynamics, and physics simulations.", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 6: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 58", "Originally designated as IAL (International Algebraic Language), Algol 58 was conceived in 1958 by a joint committee of European and American computer scientists meeting at ETH Zurich. Their goal was highly ambitious: to create a universal, hardware-independent language for describing algorithms, free from the commercial control of IBM's Fortran.\n\nAlgol 58 introduced a paradigm shift in how code was structured. It pioneered the concept of compound statements and block structure using 'begin' and 'end' keywords. This allowed multiple statements to be grouped together and treated as a single logical unit, fundamentally inventing the concept of structured control flow that defines almost all modern languages.\n\nAlthough Algol 58 itself was primarily a prototype and was rarely implemented as a working compiler on actual hardware, its theoretical contributions were seismic. It established the baseline syntax and semantic rules that the committee would spend the next two years refining into the legendary Algol 60.", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 7: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 60", "Released in 1960, Algol 60 is arguably the most influential programming language in the history of computer science. It introduced lexical scoping, nested functions, and dynamic array bounds. It was also the first language to firmly establish recursive function calls as a standard feature, heavily influencing the intersection of mathematics and programming.\n\nBeyond its features, Algol 60 changed how languages were designed. It was the very first language whose syntax was rigorously and formally defined using Backus-Naur Form (BNF). This level of mathematical precision meant that compiler writers had an exact blueprint to follow, eliminating ambiguity and guesswork from language implementation.\n\nWhile Fortran and COBOL dominated commercial mainframes, Algol 60 dominated academia. It became the absolute standard for publishing algorithms in computer science journals for over thirty years. Its block-structured DNA is the direct ancestor to Pascal, C, C++, Java, and C#—all of which are widely classified as 'Algol-like' languages.", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 8: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol W", "Designed in 1966 by Niklaus Wirth and Tony Hoare, Algol W was proposed to the IFIP working group as the official successor to Algol 60. It was intended to be a pragmatic, implementable upgrade that expanded the language's capabilities without sacrificing compilation speed or introducing undue complexity.\n\nAlgol W introduced massive innovations, most notably the 'record' data type (which allowed disparate types of data to be grouped together), dynamic memory allocation, and the 'CASE' statement for multi-way branching. It also improved the safety of parameter passing by introducing 'call-by-value-result', replacing Algol 60's notoriously complex 'call-by-name' mechanism.\n\nThe international committee ultimately rejected Algol W in favor of the much more complex Algol 68. However, Niklaus Wirth took the highly successful compiler implementations of Algol W, refined its elegant syntax and data structures, and used it as the direct foundation for his legendary Pascal programming language.", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 9: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 68", "Finalized in 1968, Algol 68 was the official, heavily anticipated successor to Algol 60. Designed by committee, it was an incredibly ambitious attempt to create a theoretically perfect programming language. It introduced the concept of orthogonal language design, meaning that every language feature could be combined with any other feature in a predictable, logical way without arbitrary exceptions.\n\nIt pioneered highly advanced concepts including expression-orientation (where statements return values), user-defined data types, pointers, concurrent processing (collateral execution), and automatic type coercions. However, its official specification was written using an infinitely complex two-level formal grammar known as a van Wijngaarden grammar.\n\nThis dense, impenetrable documentation, combined with the immense difficulty of actually writing a compiler for its vast feature set, caused a massive schism in the computer science community. While Algol 68 was a commercial failure, its brilliant innovations in type theory and orthogonality heavily influenced the design of C, C++, and Bourne shell scripts.", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 10: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Pascal", "Created by Niklaus Wirth in 1970, Pascal was explicitly engineered to enforce good programming practices. Frustrated by the chaotic complexity of languages like Fortran and Algol 68, Wirth designed Pascal with a highly readable, strict syntax that forced developers to use structured programming techniques and strong static typing.\n\nPascal required variables to be declared explicitly at the top of a block, preventing accidental bugs caused by typos. It introduced robust data structuring capabilities, including enumerations, subranges, sets, and variant records. To ensure portability, early versions compiled down to a virtual machine language called 'p-code', allowing it to run on almost any microcomputer of the era.\n\nPascal became an absolute phenomenon in academia, serving as the primary teaching language for computer science students worldwide throughout the 1970s and 1980s. Its commercial viability exploded with the release of Borland's Turbo Pascal, which offered lightning-fast compilation and a built-in IDE, eventually paving the way for the enterprise-grade Delphi environment.", "src/main/java/org/yourcompany/yourproject/resources/pascal.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 11: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Modula-2", "Developed by Niklaus Wirth in 1978, Modula-2 was designed as the direct, professional-grade successor to Pascal. While Pascal was excellent for teaching, it lacked the architectural tools necessary to build massive, multi-developer operating systems and systems software. Modula-2 was created specifically to solve this problem.\n\nIts defining innovation was the 'module', a construct that strictly separated a library's interface (DEFINITION MODULE) from its internal code (IMPLEMENTATION MODULE). This encapsulation allowed large teams to work on separate pieces of a system without causing naming collisions, and it allowed the compiler to perform strict type-checking across different files.\n\nAdditionally, Modula-2 introduced low-level systems programming features to rival C, including the ability to bypass strict typing when necessary to interact directly with hardware memory. It also introduced coroutines, providing native support for concurrent execution and interrupt handling, making it a highly robust language for embedded systems.", "src/main/java/org/yourcompany/yourproject/resources/modula2.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 12: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Modula-3", "Conceived in the late 1980s as a joint project between Digital Equipment Corporation (DEC) and Olivetti, Modula-3 sought to bring the safe, strongly-typed modularity of Modula-2 into the modern era of systems programming. \n\nModula-3 retained the clean syntax and strict interfaces of its predecessor but added massive, critical features: object-oriented programming (classes and single inheritance), robust exception handling, and automatic garbage collection. Crucially, it provided built-in support for multithreading and synchronization, recognizing that future systems would be heavily concurrent.\n\nWhile Modula-3 never achieved the massive commercial dominance of C++, it was highly revered in academic and research circles as a masterpiece of language design. Its clear, unambiguous type system and approach to safe vs. unsafe code blocks exerted a profound, acknowledged influence on the development of Java, Python, and C#.", "src/main/java/org/yourcompany/yourproject/resources/modula3.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 13: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Oberon", "Created by Niklaus Wirth in 1987, Oberon was born from his frustration with the increasing bloat and complexity of modern programming languages. Rather than adding features to Modula-2, Wirth decided to strip away anything that wasn't absolutely necessary, creating a language characterized by extreme minimalism and elegance.\n\nOberon introduced 'type extension', a streamlined, highly efficient approach to object-oriented inheritance that avoided the complexity of multiple inheritance. It also introduced automatic garbage collection to systems programming, proving that low-level hardware control did not require manual memory management.\n\nWirth used the Oberon language to write the Oberon Operating System, an entirely graphical, highly efficient OS that ran in a fraction of the memory required by Windows or Unix. The language stands as a testament to Wirth's philosophy that software engineering should focus on simplicity, speed, and safety.", "src/main/java/org/yourcompany/yourproject/resources/oberon.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 14: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Ada 83", "In the 1970s, the US Department of Defense realized they were spending billions of dollars maintaining over 450 different programming languages across their various military systems. To solve this, they commissioned the creation of a single, unified language. The winning design, created by Jean Ichbiah, was named Ada in honor of Ada Lovelace, the world's first computer programmer.\n\nStandardized in 1983, Ada was designed for massive, mission-critical systems where a software crash could cost lives. It featured incredibly strong static typing, runtime boundary checks, and robust exception handling. Most importantly, it introduced 'tasks', providing built-in, native language constructs for highly complex concurrent processing and real-time execution.\n\nDue to a Department of Defense mandate, Ada became the required language for all military aviation, aerospace, and weapons systems. Its unparalleled reliability made it the standard for commercial fly-by-wire aircraft (like the Boeing 777) and global air traffic control systems.", "src/main/java/org/yourcompany/yourproject/resources/ada83.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 15: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Ada 95", "As the software industry shifted heavily toward object-oriented programming in the early 1990s, the Ada language underwent a massive revision led by Tucker Taft. The goal was to modernize the language without compromising the extreme safety and real-time guarantees of the original Ada 83 standard.\n\nAda 95 introduced 'tagged types', which brought full object-oriented programming capabilities, including inheritance and dynamic dispatch, to the language. It also introduced 'protected objects' to provide highly efficient, data-race-free synchronization between concurrent tasks without the overhead of heavy semaphores.\n\nUpon its release, Ada 95 became the very first internationally standardized (ISO) object-oriented programming language, beating C++ to the punch. It remains a highly active language today, heavily utilized by the European Space Agency, high-speed rail networks, and financial institutions that require zero-defect software architectures.", "src/main/java/org/yourcompany/yourproject/resources/ada95.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 16: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Simula I", "Developed in 1962 at the Norwegian Computing Center by Ole-Johan Dahl and Kristen Nygaard, Simula I was not originally intended to be a general-purpose programming language. It was conceived as a highly specialized tool for designing discrete event simulations, such as modeling the complex flow of ships through a busy toll port or traffic through a network.\n\nTo accurately model these physical systems, Dahl and Nygaard needed a way to represent independent, active components that carried their own data and behavior. They created abstractions that allowed developers to define a process and then spawn multiple independent instances of that process, all operating concurrently within a simulated timeframe.\n\nThese early modeling concepts—encapsulating state and behavior into independent entities—laid the critical architectural and philosophical groundwork for what would soon evolve into true object-oriented programming.", "src/main/java/org/yourcompany/yourproject/resources/simula.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 17: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Simula 67", "Realizing that the simulation concepts they built in Simula I could be applied to general-purpose software architecture, Dahl and Nygaard expanded the language and released Simula 67. This language is universally recognized by computer scientists as the first true object-oriented programming (OOP) language in history.\n\nSimula 67 formally introduced the exact terminology and structures that define modern OOP: 'classes' (blueprints for objects), 'objects' (instantiated data structures), 'subclasses' (inheritance), and 'virtual procedures' (polymorphism). It also featured early forms of automatic garbage collection and coroutines for concurrent execution.\n\nWhile Simula 67 was primarily used in Scandinavian academia and specialized modeling, its intellectual legacy is unparalleled. Alan Kay explicitly cited it as the inspiration for Smalltalk, and Bjarne Stroustrup directly used Simula 67's class architecture as the blueprint when he created C++.", "src/main/java/org/yourcompany/yourproject/resources/simula.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 18: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Smalltalk 80", "Developed at the legendary Xerox PARC in the 1970s by a team led by Alan Kay, Smalltalk was a radical departure from traditional programming. It was a 'pure' object-oriented language; absolutely everything in the system, from numbers to control structures like IF statements, was treated as an object that interacted exclusively by passing messages to other objects.\n\nSmalltalk was not just a language; it was a completely dynamic, live programming environment. Developers didn't compile files; they modified live objects running in memory. It revolutionized human-computer interaction by introducing the graphical user interface (GUI) featuring overlapping windows, pop-up menus, and mouse interaction.\n\nFurthermore, Smalltalk introduced the Model-View-Controller (MVC) architectural pattern, which remains the absolute standard for designing graphical applications and web frameworks today. Its highly dynamic nature and syntax heavily influenced the creation of Objective-C, Ruby, and Apple's early operating systems.", "src/main/java/org/yourcompany/yourproject/resources/smalltalk.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 19: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Eiffel", "Created by Bertrand Meyer in 1985, Eiffel is a pure object-oriented language engineered with a single overarching philosophy: the production of highly robust, defect-free software components. Meyer designed the language specifically to support modern software engineering principles like reusability and extreme reliability.\n\nEiffel is most famous for introducing the 'Design by Contract' methodology directly into the compiler. Developers must write explicit preconditions (what a method requires to run), postconditions (what a method guarantees upon exit), and class invariants. If any of these contracts are violated at runtime, the program immediately halts, preventing cascading data corruption.\n\nIn addition to contracts, Eiffel features multiple inheritance, highly advanced generic programming, and 'void safety' (a type system that completely eliminates null pointer exceptions). It remains highly favored in industries where software failure carries extreme financial or physical safety risks.", "src/main/java/org/yourcompany/yourproject/resources/eiffel.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 20: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "APL", "Conceived by Kenneth Iverson at Harvard in 1957 and implemented at IBM in the 1960s, APL (A Programming Language) is one of the most unique and visually distinct languages ever created. It was originally designed as a mathematical notation to describe data processing algorithms before being converted into a highly interactive programming environment.\n\nAPL is an array-oriented language known for its extreme conciseness. It relies on a vast array of non-ASCII Greek and mathematical symbols, requiring developers to use a specialized keyboard. A single, cryptic character in APL can perform complex matrix inversions, sorts, or multidimensional array slices that would require dozens of lines of loops in languages like C or Java.\n\nBecause of its unparalleled ability to process massive datasets instantly and interactively, APL became wildly popular in the financial sector, actuarial science, and heavy mathematical modeling. Its array-processing DNA directly influenced modern data science tools like NumPy and MATLAB.", "src/main/java/org/yourcompany/yourproject/resources/apl.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 21: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "BASIC", "Beginner's All-purpose Symbolic Instruction Code was created in 1964 by John Kemeny and Thomas Kurtz at Dartmouth College. Their mission was to democratize computing. At the time, programming was strictly reserved for scientists and mathematicians. Kemeny and Kurtz designed BASIC with an intuitive, English-like syntax so that liberal arts students could interact with the university's new time-sharing mainframe.\n\nBASIC was highly interactive, allowing users to type a command and see the result instantly, bypassing the tedious punch-card compilation process. This accessibility proved revolutionary when microcomputers were invented in the 1970s. \n\nBecause the BASIC interpreter required very little memory, it was built directly into the ROM of almost every early personal computer, including the Altair 8800, the Apple II, and the Commodore 64. BASIC single-handedly triggered the home computing revolution, inspiring an entire generation of hobbyists to become professional software engineers.", "src/main/java/org/yourcompany/yourproject/resources/basic.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 22: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "QuickBASIC", "Released by Microsoft in 1985, QuickBASIC transformed BASIC from a slow, interpreted learning tool into a highly professional, high-speed development environment for MS-DOS. It was designed to bridge the gap between hobbyist scripting and serious enterprise software engineering.\n\nQuickBASIC completely eliminated the need for rigid line numbers and GO TO statements, replacing them with modern structured programming control flows like WHILE loops, DO loops, and block IF statements. It introduced user-defined data types (structs) and independent subprograms that allowed for modular architecture.\n\nMost importantly, it shipped with a blazing-fast compiler and a highly advanced Integrated Development Environment (IDE) that featured syntax highlighting and inline debugging. QuickBASIC proved that accessible syntax could still yield high-performance desktop applications.", "src/main/java/org/yourcompany/yourproject/resources/quickbasic.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 23: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Visual BASIC", "Released by Microsoft in 1991, Visual BASIC was a massive paradigm shift in how software was developed. Prior to VB, building graphical Windows applications required writing thousands of lines of dense C++ code just to draw a window and a button. Visual BASIC introduced Rapid Application Development (RAD) to the masses.\n\nIt featured a revolutionary WYSIWYG (What You See Is What You Get) drag-and-drop interface. Developers could literally draw buttons, text boxes, and menus onto a canvas, and then double-click them to write event-driven BASIC code for when the user clicked the element.\n\nVisual BASIC's ability to abstract away the immense complexity of the Windows API, combined with its deep integration with COM and ActiveX database components, made it the undisputed king of corporate IT throughout the 1990s. It empowered internal teams to build massive enterprise data applications in days rather than months.", "src/main/java/org/yourcompany/yourproject/resources/visualbasic.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 24: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "FLOW-MATIC", "Created in 1955 by computing pioneer Grace Hopper for the UNIVAC I, FLOW-MATIC was the first programming language in history to express operations using English-like statements rather than cryptic mathematical notation or assembly mnemonics.\n\nHopper firmly believed that the computer industry would never expand into the business world if executives and accountants had to learn complex mathematical symbols. She designed FLOW-MATIC to use intuitive keywords like 'COMPARE', 'TRANSFER', and 'REPLACE', making the source code readable by non-programmers.\n\nWhile initially met with heavy resistance from the scientific establishment who believed computers were strictly for math, FLOW-MATIC was a massive commercial success. It proved Hopper's theory that data processing software could be written in a human-readable format, directly laying the conceptual and syntactic foundation for COBOL.", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 25: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "COBOL", "Common Business-Oriented Language was developed in 1959 by the CODASYL committee, heavily guided by the pioneering work of Grace Hopper. It was designed specifically to handle massive-scale business data processing, payrolls, and government record management, prioritizing explicit readability over concise math.\n\nCOBOL introduced highly advanced record structuring, allowing developers to group hierarchical financial data easily. The language is famously verbose, broken into strict 'Divisions' (Data Division, Procedure Division, etc.) that read almost like corporate English sentences. This made it highly maintainable by large teams of enterprise programmers over long periods.\n\nDespite heavy criticism from computer scientists regarding its clunky syntax, COBOL became the absolute backbone of global finance and administration. Decades later, billions of lines of legacy COBOL code still actively run the world's ATM networks, credit card processing, and government mainframes.", "src/main/java/org/yourcompany/yourproject/resources/cobol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 26: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "PL/I", "Programming Language One was an incredibly ambitious project launched by IBM in 1964 alongside their revolutionary System/360 mainframes. IBM wanted to eliminate the need to support two different languages (Fortran for scientists and COBOL for business) by creating a single, massive 'Swiss Army Knife' language that could do absolutely everything.\n\nPL/I was packed with features. It included complex scientific math capabilities, advanced string processing, exception handling (ON conditions), multitasking, and complex data structuring. It was one of the first languages to introduce pointers for dynamic memory management outside of assembly language.\n\nBecause of its massive feature set, PL/I compilers were notoriously difficult to write and optimize. While it became highly entrenched in IBM mainframe environments and was famously used to write the Multics operating system, its sheer complexity prevented it from ever fully replacing the specialized dominance of Fortran and COBOL.", "src/main/java/org/yourcompany/yourproject/resources/pl1.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 27: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "CPL", "Combined Programming Language was developed jointly by Cambridge and London universities in the early 1960s. The creators aimed to build an incredibly comprehensive academic language that combined the mathematical rigor of Algol 60 with the practical systems programming capabilities needed to write compilers and operating systems.\n\nCPL was a massive, highly expressive language that introduced complex type systems and functional programming concepts. However, its design was so vast and intricate that it proved nearly impossible to implement a fully working compiler on the limited hardware of the 1960s.\n\nWhile CPL itself never achieved practical success, its intellectual legacy is immense. It served as the direct starting point for a lineage of progressively scaled-down, practical languages (BCPL, then B) that ultimately culminated in the creation of the C programming language.", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 28: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "BCPL", "Basic CPL was designed by Martin Richards at Cambridge in 1967. Realizing that the massive CPL language was too complex to compile, Richards ruthlessly stripped away its complex data types to create a lean, practical language specifically intended for writing system software and compilers.\n\nBCPL was entirely 'typeless'—every variable was simply treated as a fixed-length machine word (usually 16 or 32 bits), leaving it up to the programmer to decide if the memory represented an integer, a character, or a pointer. It is famously credited with introducing the use of curly braces '{ }' to define code blocks, a syntactic choice that dominates programming today.\n\nFurthermore, BCPL compilers generated an intermediate virtual machine code called 'O-code', which made the language incredibly portable across different mainframe architectures, heavily influencing the future design of Java's bytecode.", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 29: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "B", "Created by Ken Thompson at Bell Labs around 1969, B was essentially a highly simplified, memory-optimized derivative of BCPL. Thompson designed it specifically to run on the severely resource-constrained PDP-7 minicomputers of the era, stripping away any features that consumed too much memory.\n\nLike BCPL, B was entirely typeless, treating everything as a raw machine word. It introduced the increment ('++') and decrement ('--') operators, which were heavily tied to the auto-increment hardware registers of the PDP hardware. \n\nThompson famously used the B language to bootstrap the early development of the Unix operating system. However, as hardware evolved to support distinct character and integer memory sizes, B's typeless nature became a severe limitation, setting the immediate stage for Dennis Ritchie to develop its successor, C.", "src/main/java/org/yourcompany/yourproject/resources/b.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 30: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "C", "Created by Dennis Ritchie at Bell Labs in 1972, C is arguably the most influential programming language in computing history. Ritchie took the lean, typeless syntax of the B language and added a robust static data typing system (char, int, float) to support the new PDP-11 minicomputer architecture.\n\nC offered an unprecedented combination: the high-level structured control flow of the Algol family, paired with extreme, low-level memory manipulation via pointers. It allowed developers to write code that was almost as fast as hand-coded assembly but highly portable across different hardware architectures.\n\nRitchie and Ken Thompson famously used C to completely rewrite the Unix operating system kernel, proving that OS development did not require assembly language. C became the absolute standard for systems programming, serving as the basis for Windows, Linux, macOS, and spawning the syntactic lineage of C++, Java, and C#.", "src/main/java/org/yourcompany/yourproject/resources/c.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 31: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "C++", "Developed by Bjarne Stroustrup in 1985 at Bell Labs, C++ originally began as an extension named 'C with Classes'. Stroustrup wanted the high-level organizational benefits and data abstraction of Simula's object-oriented architecture without sacrificing the raw, bare-metal execution speed of C.\n\nC++ successfully integrated classes, inheritance, strong typing, and virtual functions directly into the C ecosystem. It introduced the concept of RAII (Resource Acquisition Is Initialization), binding memory management directly to object lifecycles, and later added powerful generic programming via Templates and the Standard Template Library (STL).\n\nBecause it provided 'zero-overhead abstractions'—meaning its high-level features cost nothing in runtime performance—C++ became the dominant language for performance-critical applications. It remains the absolute industry standard for AAA video game engines, high-frequency financial trading platforms, operating systems, and web browser rendering engines.", "src/main/java/org/yourcompany/yourproject/resources/cpp.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 32: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "ANSI C", "Ratified in 1989 (C89) and adopted internationally by ISO in 1990 (C90), ANSI C was the first official standardization of the C programming language. Prior to this, developers relied on an informal standard known as 'K&R C', which led to highly fragmented compiler implementations and severely limited code portability.\n\nThe X3J11 committee formalized the language, resolving ambiguities and introducing modern features. Most notably, they adopted 'function prototypes' directly from C++, which allowed the compiler to strictly check the number and types of arguments passed to functions, eliminating a massive source of runtime crashes.\n\nANSI C also formally defined the C Standard Library (like stdio.h and stdlib.h), ensuring that core I/O and memory functions behaved identically on every platform. This standardization ensured that C code could be written portably, allowing the exact same software to compile and run across vastly different hardware architectures.", "src/main/java/org/yourcompany/yourproject/resources/ansi.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 33: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Java", "Developed by James Gosling at Sun Microsystems and released in 1995, Java was originally designed for interactive cable television before pivoting to the exploding World Wide Web. Gosling sought to create a language with the familiar, C-style syntax of C++, but stripped of its complex, crash-prone memory management and pointer arithmetic.\n\nJava introduced a strict object-oriented architecture backed by automatic garbage collection. Its most revolutionary breakthrough was its 'Write Once, Run Anywhere' (WORA) philosophy. Instead of compiling to machine code, Java compiled to an intermediate 'bytecode' that executed on a universal Java Virtual Machine (JVM), allowing the exact same application to run on Windows, Mac, or Unix without recompilation.\n\nInitially famous for interactive web applets, Java's extreme stability and platform independence propelled it to become the dominant force in massive enterprise backend systems, financial servers, and ultimately, the native language of the Android mobile operating system.", "src/main/java/org/yourcompany/yourproject/resources/java.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 34: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "LISP", "Created by John McCarthy at MIT in 1958, LISt Processing is the second-oldest high-level language still in use today (behind Fortran). Based deeply on Alonzo Church's lambda calculus, LISP pioneered functional programming, introducing tree data structures, dynamic typing, and automatic garbage collection decades before they became mainstream.\n\nLISP's architecture is utterly unique: both its data and its source code are written in exactly the same structure—nested lists enclosed in parentheses (S-expressions). This concept, known as homoiconicity, allows LISP programs to read, manipulate, and generate other LISP programs as if they were simple data.\n\nBecause of its extreme flexibility and powerful macro system, LISP quickly became the undisputed language of choice for early artificial intelligence research, expert systems, and symbolic mathematics. It remains one of the most conceptually beautiful languages in computer science.", "src/main/java/org/yourcompany/yourproject/resources/lisp.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 35: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Scheme", "Developed at MIT in the 1970s by Guy L. Steele and Gerald Jay Sussman, Scheme is a highly elegant, minimalist dialect of Lisp. The creators sought to drastically simplify the complex, sprawling implementations of Lisp by refining it down to a very small core of highly orthogonal, mathematically sound concepts.\n\nScheme was revolutionary for strictly enforcing lexical scoping (rather than Lisp's dynamic scoping) and for treating functions as true first-class citizens. It also mandated tail-call optimization, meaning recursive functions could run infinitely without crashing the memory stack, and introduced first-class continuations to manipulate program control flow.\n\nBecause of its extreme simplicity and clean mathematical foundation, Scheme became widely adopted in academia as the premier language for teaching fundamental computer science paradigms. It was famously immortalized as the language of instruction in the legendary MIT textbook 'Structure and Interpretation of Computer Programs' (SICP).", "src/main/java/org/yourcompany/yourproject/resources/scheme.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 36: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Common LISP", "Finalized in the 1980s and standardized by ANSI in 1994, Common Lisp was a massive effort to unify the highly fractured ecosystem of various incompatible Lisp dialects (like MacLisp and Interlisp) that were competing against each other in the commercial AI community.\n\nUnlike the minimalist Scheme, Common Lisp is a massive, highly pragmatic, multi-paradigm language. It supports functional, procedural, and object-oriented programming, primarily through the incredibly powerful Common Lisp Object System (CLOS), which features multiple dispatch and dynamic class redefinition at runtime.\n\nArmed with a vast standard library and an unparalleled macro system that allows developers to extend the compiler itself, Common Lisp remains one of the most powerful and flexible dynamically typed languages in existence, highly favored for complex exploratory programming and aerospace applications.", "src/main/java/org/yourcompany/yourproject/resources/lisp.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 37: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "SNOBOL", "StriNg Oriented and symBOlic Language was developed at Bell Labs in 1962 by David Farber, Ralph Griswold, and Ivan Polonsky. Unlike contemporary languages that were strictly focused on numerical computation or business records, SNOBOL was a specialized language explicitly engineered for advanced text manipulation.\n\nSNOBOL pioneered incredibly sophisticated pattern matching, string concatenation, and backtracking techniques long before regular expressions became standard in mainstream programming. Its architecture allowed developers to search, parse, and replace complex string structures with minimal code.\n\nWhile its heavy reliance on GOTOs made its control flow somewhat archaic by modern standards, SNOBOL was wildly successful in the humanities, linguistics, and early natural language processing research, proving that computers could be highly effective tools for analyzing human text.", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 38: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "ICON", "Developed by Ralph Griswold at the University of Arizona in the late 1970s, ICON was the direct, modernized conceptual successor to SNOBOL. Griswold wanted to take the immense string processing power of SNOBOL and integrate it into a cleaner, structured syntax resembling Pascal or C.\n\nICON's most revolutionary and powerful feature was 'goal-directed execution'. Instead of simply returning a boolean true or false, expressions in ICON acted as 'generators' that could yield a sequence of multiple successful results, automatically backtracking and trying alternatives if a subsequent operation failed.\n\nThis built-in backtracking mechanism made ICON an incredibly expressive and powerful tool for complex text analysis, scripting, and data parsing tasks, heavily influencing the iterator and generator concepts found in modern languages like Python.", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                default:
                    throw new AssertionError();
            }
        }


}