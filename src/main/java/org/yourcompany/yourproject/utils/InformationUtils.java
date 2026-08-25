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
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran I", "The first commercial scientific programming language, designed by John Backus at IBM in 1957. It introduced the revolutionary concept of a compiler capable of translating high-level mathematical formulas directly into efficient machine code, bypassing the need for manual assembly programming.\n\nBy providing a more intuitive, formula-based syntax, Fortran I drastically reduced the time required to write complex computational programs. It laid the foundational concepts for compiler optimization and high-level language design that established the bedrock for modern scientific computing.", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 2: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran II", "An evolution of Fortran I released in 1958 that introduced early procedural programming concepts to the language. Most notably, it allowed users to write custom subroutines and functions, which could be compiled independently from the main program.\n\nThis introduction of procedural modularity meant that developers could finally reuse code across multiple projects and build much larger, more complex software systems without having to recompile the entire program from scratch every time a minor change was made.", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 3: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran IV", "Released in 1962, this became a highly popular and widely standardized version of Fortran. It explicitly removed many of the machine-dependent features of earlier versions, making it highly portable, and introduced the logical IF statement alongside boolean data types.\n\nIts portability and robust feature set led to it becoming the dominant programming language for scientific and engineering applications throughout the 1960s and 1970s. It eventually served as the basis for the first ANSI standard for the language in 1966.", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 4: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran 77", "A major update finalized in 1978 that brought modern structured programming concepts to the language. It officially introduced block IF/THEN/ELSE statements, significantly reducing the reliance on GO TO statements, and added built-in character data types.\n\nFortran 77 became an incredibly entrenched standard in the scientific community, leading to the creation of massive, highly optimized legacy libraries (like LAPACK and BLAS) that are still actively used as the mathematical backbones of modern software today.", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 5: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran 90", "A massive modernization of the language that completely changed its look and feel. It introduced free-form source input (eliminating the strict column-based formatting of punch cards), dynamic memory allocation, modules, and powerful array programming capabilities.\n\nThese additions allowed Fortran to compete with newer languages like C++ while maintaining its extreme performance advantages in numerical analysis. It shifted the paradigm of the language to support data encapsulation and more modern software engineering practices.", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 6: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 58", "Originally known as IAL (International Algebraic Language), this was an early algorithmic language proposed in 1958 by a joint committee of European and American computer scientists. It was designed to be a universal language for algorithm description.\n\nAlgol 58 introduced several pioneering concepts, including compound statements and block structure, which allowed multiple statements to be grouped together. Though rarely implemented in compilers itself, it set the critical groundwork for the vastly more successful Algol 60.", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 7: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 60", "A profoundly influential language that introduced lexical scoping, nested functions, and block-level variable declarations. Furthermore, it was the first language whose syntax was formally defined using Backus-Naur Form (BNF).\n\nWhile not as commercially dominant as Fortran or COBOL, Algol 60 became the absolute standard for algorithm publication in computer science research for decades. Almost all modern imperative languages, including C, Pascal, and Java, are considered 'Algol-like' in their fundamental structure.", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 8: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol W", "Created by Niklaus Wirth and Tony Hoare in 1966 as a proposed successor to Algol 60. It introduced complex data structures like record types, dynamic data allocation, and the CASE statement for multi-way branching.\n\nAlthough the Algol committee ultimately rejected Algol W in favor of the vastly more complex Algol 68, Wirth used the highly successful concepts developed in Algol W as the direct foundational blueprint for creating the Pascal programming language.", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 9: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 68", "The official, highly complex, and theoretically rigorous successor to Algol 60. It introduced the concept of orthogonal language design, meaning its features could be combined in predictable ways without arbitrary restrictions.\n\nIts specification was written using a complex two-level formal grammar (van Wijngaarden grammar), making it notoriously difficult for developers to understand and implement. Despite its steep learning curve, it pioneered concepts like expression-orientation and user-defined data types that heavily influenced C and C++.", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 10: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Pascal", "Created by Niklaus Wirth in 1970, Pascal was explicitly designed to encourage good programming practices by strictly enforcing structured programming techniques and strong data typing. It was heavily influenced by his earlier work on Algol W.\n\nBecause of its clean syntax and strict compiler checks, Pascal became the dominant language for teaching computer science in universities throughout the 1970s and 1980s. It also achieved massive commercial success through Borland's Turbo Pascal and later the Delphi environment.", "src/main/java/org/yourcompany/yourproject/resources/pascal.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 11: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Modula-2", "Developed by Niklaus Wirth as the direct successor to Pascal, primarily designed to address Pascal's lack of support for large-scale software systems and systems-level programming.\n\nIts defining feature was the introduction of the 'module,' which allowed developers to strictly separate the definition of an interface from its implementation. This encapsulation enabled safer separate compilation and paved the way for modern package and namespace systems.", "src/main/java/org/yourcompany/yourproject/resources/modula2.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 12: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Modula-3", "An evolution of Modula-2 developed in the late 1980s by DEC and Olivetti. It maintained the strong type safety and modularity of its predecessor while adding modern features like object-oriented programming, exception handling, and garbage collection.\n\nAlthough it never achieved widespread commercial dominance, Modula-3 was highly respected in academic and research circles. Its elegant design choices heavily influenced the architecture of later mainstream languages, most notably Python, Java, and C#.", "src/main/java/org/yourcompany/yourproject/resources/modula3.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 13: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Oberon", "A minimalist, object-oriented language created by Niklaus Wirth in 1987. It was designed to increase the power of Modula-2 while simultaneously reducing its complexity, stripping away features Wirth deemed unnecessary.\n\nOberon introduced type extension (a streamlined form of inheritance) and was used to build the entirely graphical Oberon operating system. Its philosophy of extreme simplicity and fast compilation times remains a benchmark for minimalist language design.", "src/main/java/org/yourcompany/yourproject/resources/oberon.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 14: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Ada 83", "Commissioned by the US Department of Defense to consolidate the hundreds of disparate languages used in their military systems. Ada is a strongly typed, block-structured language famous for its extreme focus on safety and reliability.\n\nIt featured built-in support for concurrent processing (tasking), exception handling, and strict compile-time checking. Because of its robust design, it became the mandatory standard for developing mission-critical systems in aviation, aerospace, and defense applications.", "src/main/java/org/yourcompany/yourproject/resources/ada83.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 15: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Ada 95", "A major revision to the Ada language standard that introduced comprehensive support for object-oriented programming, including dynamic dispatch and inheritance. Upon its release, it became the first internationally standardized OOP language.\n\nThis update allowed Ada to remain highly relevant in modern software engineering while retaining all of the safety, concurrency, and real-time processing guarantees of Ada 83. It continues to be actively used globally in air traffic control, railway systems, and satellites.", "src/main/java/org/yourcompany/yourproject/resources/ada95.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 16: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Simula I", "Designed in Norway in the early 1960s by Ole-Johan Dahl and Kristen Nygaard, primarily as a highly specialized tool for writing discrete event simulations to model complex systems like queuing networks and ship movements.\n\nTo manage the complexity of these simulations, the creators developed early abstractions to group data and behavior together. These early modeling concepts laid the vital architectural groundwork for what would soon evolve into true object-oriented programming.", "src/main/java/org/yourcompany/yourproject/resources/simula.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 17: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Simula 67", "Widely recognized by computer scientists as the first true object-oriented programming language in history. It took the simulation concepts of Simula I and generalized them into a universal programming paradigm.\n\nSimula 67 officially introduced the concepts of classes, objects, inheritance, subclasses, and virtual procedures. Its revolutionary approach directly inspired the creation of Smalltalk and heavily influenced Bjarne Stroustrup when he created C++.", "src/main/java/org/yourcompany/yourproject/resources/simula.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 18: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Smalltalk 80", "Developed at Xerox PARC, Smalltalk was a pure object-oriented language and environment where absolutely everything—including numbers and control structures—was treated as an object communicating via message passing.\n\nSmalltalk revolutionized human-computer interaction by introducing the overlapping window graphical user interface (GUI) and the Model-View-Controller (MVC) architectural pattern. Its highly dynamic, interactive programming environment profoundly shaped the future of modern IDEs and software design.", "src/main/java/org/yourcompany/yourproject/resources/smalltalk.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 19: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Eiffel", "An object-oriented language created by Bertrand Meyer in 1985 with a strict emphasis on producing highly reliable, bug-free software components. It is most famous for introducing the 'Design by Contract' methodology.\n\nDesign by Contract enforces that software modules specify strict preconditions, postconditions, and invariants. This ensures that objects interact exactly as intended, making Eiffel highly favored in industries where software failure carries extreme financial or safety risks.", "src/main/java/org/yourcompany/yourproject/resources/eiffel.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 20: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "APL", "A Programming Language, designed by Kenneth Iverson, is an interactive array-oriented language known for its extreme conciseness and entirely unique syntax. It requires a specialized keyboard to type its vast array of non-ASCII Greek and mathematical symbols.\n\nBecause a single character in APL can perform complex matrix operations that would take dozens of lines in other languages, it became wildly popular in financial, actuarial, and heavy mathematical modeling sectors, heavily influencing modern data analysis tools.", "src/main/java/org/yourcompany/yourproject/resources/apl.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 21: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "BASIC", "Beginner's All-purpose Symbolic Instruction Code, created at Dartmouth College in 1964. It was designed to democratize computing by allowing non-science students to write simple programs using a highly readable, interactive syntax.\n\nBecause of its small memory footprint and ease of use, BASIC became the absolute standard programming language built into the ROM of almost every early microcomputer in the 1970s and 1980s, triggering the personal computing revolution and inspiring a generation of programmers.", "src/main/java/org/yourcompany/yourproject/resources/basic.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 22: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "QuickBASIC", "Microsoft's highly successful evolution of BASIC, released in the late 1980s. It transformed the language from a slow, interpreted beginner tool into a fast, compiled language with a built-in graphical IDE.\n\nQuickBASIC completely eliminated the need for rigid line numbers and introduced modern structured programming features like user-defined types, subprograms, and WHILE loops, bridging the gap between hobbyist coding and professional software development.", "src/main/java/org/yourcompany/yourproject/resources/quickbasic.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 23: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Visual BASIC", "A massively popular, event-driven programming language released by Microsoft in 1991. It allowed developers to build complex Windows graphical applications incredibly rapidly using a drag-and-drop WYSIWYG interface.\n\nVisual BASIC's ability to abstract away the massive complexity of the Windows API made it the undisputed king of rapid application development (RAD) throughout the 1990s, completely dominating enterprise and internal business software creation.", "src/main/java/org/yourcompany/yourproject/resources/visualbasic.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 24: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "FLOW-MATIC", "Created by pioneering computer scientist Grace Hopper in 1957, FLOW-MATIC was the first programming language in history to express operations using English-like statements rather than cryptic mathematical notation.\n\nHopper firmly believed that business professionals needed a language they could easily read and understand. FLOW-MATIC's successful implementation proved that data processing software could be written in a human-readable format, directly laying the conceptual foundation for COBOL.", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 25: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "COBOL", "Common Business-Oriented Language, developed in 1959 under the guidance of the US Department of Defense. Heavily influenced by FLOW-MATIC, it was strictly designed for massive business data processing and record management.\n\nCharacterized by its verbose, English-like syntax and strict division into programmatic divisions, COBOL became the absolute backbone of global banking, payroll, and government systems. Decades later, billions of lines of legacy COBOL code still actively run the world's financial infrastructure.", "src/main/java/org/yourcompany/yourproject/resources/cobol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 26: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "PL/I", "Programming Language One, heavily backed by IBM in the 1960s, was an incredibly ambitious attempt to create a single, unified 'Swiss Army Knife' language that combined the scientific prowess of Fortran with the business record-handling of COBOL.\n\nDue to its massive feature set, including macro processing, exception handling, and complex data structures, PL/I compilers were notoriously difficult to write. While it dominated IBM mainframe environments for decades, its complexity prevented it from completely replacing Fortran or COBOL.", "src/main/java/org/yourcompany/yourproject/resources/pl1.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 27: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "CPL", "Combined Programming Language, developed jointly by Cambridge and London universities in the early 1960s. It was designed to be an incredibly comprehensive academic language capable of both numerical science and systems programming.\n\nCPL proved to be far too large and complex for the hardware of its time, making it nearly impossible to implement a working compiler. However, its ambitious design and structural paradigms directly spawned a lineage of scaled-down languages that ultimately led to C.", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 28: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "BCPL", "Basic CPL, designed by Martin Richards in 1967 as a radically stripped-down, practical version of CPL. It was specifically intended for writing system software and compilers.\n\nBCPL was a typeless language that relied heavily on raw word manipulation. It is most famous for introducing the use of curly braces for defining code blocks and for popularizing the concept of the virtual machine compiler approach to achieve high portability across different architectures.", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 29: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "B", "Created by Ken Thompson at Bell Labs around 1969. B was essentially a simplified, memory-optimized derivative of BCPL designed specifically to run on the severely resource-constrained minicomputers of the era.\n\nLike BCPL, B was entirely typeless, treating everything as a raw machine word. Thompson utilized B to bootstrap the early development of the Unix operating system, setting the immediate stage for the creation of C when hardware began supporting distinct character and integer types.", "src/main/java/org/yourcompany/yourproject/resources/b.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 30: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "C", "Created by Dennis Ritchie at Bell Labs in 1972. By adding a robust data typing system and array structures to the B language, Ritchie created a high-level language that still offered low-level memory manipulation and extreme execution speed.\n\nC was famously used to completely rewrite the Unix operating system, proving that systems software did not need to be written in assembly. It is arguably the most influential programming language in history, serving as the basis for C++, Java, C#, and countless operating system kernels.", "src/main/java/org/yourcompany/yourproject/resources/c.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 31: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "C++", "Developed by Bjarne Stroustrup in 1985 as 'C with Classes'. Stroustrup wanted the high-level organizational benefits of Simula's object-oriented programming without sacrificing the raw, bare-metal performance and portability of C.\n\nC++ successfully integrated classes, inheritance, strong typing, templates, and exception handling into the C ecosystem. It became the dominant language for performance-critical applications, including AAA video games, high-frequency trading platforms, and major browser engines.", "src/main/java/org/yourcompany/yourproject/resources/cpp.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 32: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "ANSI C", "The first official standardization of the C programming language, ratified in 1989 (C89) and adopted internationally in 1990 (C90). Prior to this, developers relied on an informal standard based on Ritchie's original documentation, which led to compiler inconsistencies.\n\nANSI C introduced function prototypes, standard library headers, and stricter type checking. This standardization ensured that C code could be written portably, allowing the exact same software to be compiled and run across vastly different hardware architectures.", "src/main/java/org/yourcompany/yourproject/resources/ansi.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 33: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Java", "Developed by James Gosling at Sun Microsystems in 1995. Originally designed for interactive television, Java pivoted to the early internet by leveraging a strict object-oriented syntax heavily modeled on C++ but with automatic garbage collection.\n\nJava's defining breakthrough was its 'Write Once, Run Anywhere' philosophy, achieved by compiling down to bytecode that executed on the Java Virtual Machine (JVM). It subsequently became the dominant force in enterprise backend systems, web applications, and the Android operating system.", "src/main/java/org/yourcompany/yourproject/resources/java.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 34: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "LISP", "Created by John McCarthy in 1958, LISt Processing is the second-oldest high-level language still in use today. It pioneered functional programming, dynamic typing, tree data structures, and the concept of code operating as interchangeable data.\n\nCharacterized by its heavy reliance on parentheses and recursive functions, LISP quickly became the undisputed language of choice for early artificial intelligence research. Its powerful macro system allowed developers to essentially write programs that could write their own programs.", "src/main/java/org/yourcompany/yourproject/resources/lisp.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 35: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Scheme", "A highly elegant, minimalist dialect of Lisp developed at MIT in the 1970s. Scheme drastically simplified Lisp by strictly enforcing lexical scoping and introducing first-class continuations to control program flow.\n\nBecause of its extreme simplicity and clean mathematical foundation, Scheme became widely adopted in academia as the premier language for teaching fundamental computer science paradigms, most notably featured in the legendary textbook 'Structure and Interpretation of Computer Programs' (SICP).", "src/main/java/org/yourcompany/yourproject/resources/scheme.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 36: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Common LISP", "An extensive, standardized dialect of Lisp finalized in the 1980s. It was specifically created to unify the highly fractured ecosystem of various Lisp implementations that were competing against each other in the AI community.\n\nCommon Lisp is a massive, multi-paradigm language that supports functional, procedural, and object-oriented programming through the Common Lisp Object System (CLOS). It remains one of the most powerful and flexible dynamically typed languages in existence.", "src/main/java/org/yourcompany/yourproject/resources/lisp.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 37: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "SNOBOL", "StriNg Oriented and symBOlic Language, developed at Bell Labs in the 1960s. Unlike languages focused on numerical computation, SNOBOL was a specialized language explicitly engineered for highly advanced text manipulation and string processing.\n\nIt pioneered incredibly sophisticated pattern matching techniques long before regular expressions became standard in programming. SNOBOL was widely used in the humanities, linguistics, and early natural language processing research for parsing complex text data.", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 38: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "ICON", "The conceptual successor to SNOBOL, developed by Ralph Griswold in the late 1970s. It significantly modernized SNOBOL's string processing capabilities by integrating them into a more structured, readable syntax resembling Pascal or C.\n\nICON's most powerful feature is goal-directed execution, where expressions act as generators that can yield multiple successful results or fail. This made it an incredibly expressive and powerful tool for complex text analysis, scripting, and data parsing tasks.", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                default:
                    throw new AssertionError();
            }
        }


}