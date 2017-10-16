JFLAGS = -g 
JC = javac 
JE= java 
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	problem4/ImprovedRandom.java \
	problem5/ImprovedStringTokenizer.java \
	problem4_5_acceptanceTest/ImprovedClasses.java \
	tests/ImprovedStringTokenizerTest.java \
	tests/testRunner.java 

default: classes

classes: $(CLASSES:.java=.class)

run:
	$(JE) problem4_5_acceptanceTest/ImprovedClasses
test:
	$(JE) tests/testRunner	
clean:
	$(RM) problem4/*.class
	$(RM) problem5/*.class
	$(RM) problem4_5_acceptanceTest/*.class
	$(RM) tests/*.class
