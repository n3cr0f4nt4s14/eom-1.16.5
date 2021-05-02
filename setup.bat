@echo off
echo Setting up minecraft forge...
echo

gradlew genEclipseRuns --refresh-dependencies&&gradlew eclipse

echo
echo Generating run configurations...
echo

gradlew genEclipseRuns

echo
echo Finished!

PAUSE

