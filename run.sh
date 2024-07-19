export MAVEN_OPTS="$MAVEN_OPTS -javaagent:/home/user/.m2/repository/org/jacoco/org.jacoco.agent/0.8.10/org.jacoco.agent-0.8.10-runtime.jar=destfile=target/jacoco.exec,output=file,append=false,dumponexit=true" 
mvn jqf:repro -Dclass=ru.algont.exampleclass.ExampleClassFuzzTest -Dmethod=testFuzzDimMe -Dinput=target/fuzz-results/ru.algont.exampleclass.ExampleClassFuzzTest/testFuzzDimMe/corpus/ -DprintArgs
#echo "$MAVEN_OPTS"
