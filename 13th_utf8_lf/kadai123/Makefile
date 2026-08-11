.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: kadai1 kadai2 kadai3

.java.class:
	$(JAVAC) $<
	
kadai1: all
	$(JAVA) GraphTester sample.txt

kadai2: all
	$(JAVA) DijkstraTester sample.txt

kadai3: all
	$(JAVA) PQDijkstraTester sample.txt

clean:;	\rm -f *.class
