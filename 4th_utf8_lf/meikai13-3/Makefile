.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)
MAIN	= JankenGame

all: $(CLASS)

test: $(CLASS)
	$(JAVA) $(MAIN) < input.txt

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class

