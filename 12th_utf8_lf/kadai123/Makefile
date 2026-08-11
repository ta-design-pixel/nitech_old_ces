.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: kadai1 kadai2 kadai3;

.java.class:
	$(JAVAC) $<

kadai1: all
	sh kadai1.sh

kadai2: all
	sh kadai2.sh

kadai3: all
	sh kadai3.sh

clean:;	\rm -f *.class
