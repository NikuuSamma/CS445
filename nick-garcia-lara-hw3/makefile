JFLAGS = -g
JC = javac
JE= java 
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
       bulb/LightBulb.java \
       implementation/LampImplementation.java \
       buttons/Button.java \
       buttons/PushDownButton.java \
       lamp/TableLamp.java \
       tests/ButtonTest.java \
       tests/LightBulbTest.java \
       tests/PushDownButtonTest.java \
       tests/TestRunner.java 

default: classes run

classes: $(CLASSES:.java=.class)

run:
		$(JE) lamp/TableLamp
test:
		$(JE) tests/TestRunner
clean:
		$(RM) *.class
