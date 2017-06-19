echo off

set RHAP_JARS_DIR=
set FRAMEWORK_NONE_JARS=;
set FRAMEWORK_ANIM_JARS=;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=None   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist Default\SnakePart.class del Default\SnakePart.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Default\BoundingBox.class del Default\BoundingBox.class
if exist Default\Snake.class del Default\Snake.class
if exist Default\Nibbles.class del Default\Nibbles.class
if exist Default\Direction.class del Default\Direction.class
if exist Default\ICollidable.class del Default\ICollidable.class
if exist Default\SnakeHead.class del Default\SnakeHead.class
if exist Default\Sparkle.class del Default\Sparkle.class
if exist Default\Edible.class del Default\Edible.class
if exist Default\NibblesGUI.class del Default\NibblesGUI.class
if exist Default\IDrawable.class del Default\IDrawable.class
if exist Default\PlayingField.class del Default\PlayingField.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


