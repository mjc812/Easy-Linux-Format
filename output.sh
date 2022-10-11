HOME_PATH="/home/c/cwl/cs-410/Documents"
homeworkFolder=$(find "$HOME_PATH" -maxdepth 1 -type d -name "Homework" -print -quit)
mathCourse=$(find "$homeworkFolder" -maxdepth 1 -type d -name "math-100" -print -quit)
photosFolder=$(find "$HOME_PATH" -maxdepth 1 -type d -name "*Photo*" -print -quit)
recentFolder=$(find "$HOME_PATH" -maxdepth 1 -type d -newermt 2022-10-10 ! -newermt 2022-10-11 -print -quit)
biol=$(find "$HOME_PATH" -maxdepth 1 -type d -name "biol-111" -print -quit)
special=$(find "$HOME_PATH" -maxdepth 1 -type f -name "mySpecialTextFile.txt" -print -quit)
containsString=$(find "$HOME_PATH" -maxdepth 1 -type f -name "*string*" -print -quit)
photo=$(find "$HOME_PATH" -maxdepth 1 -type f -name "*.png" -print -quit)
firstHomework=$(find "$homeworkFolder" -maxdepth 1 -type f -print -quit)
suffering=$(find "$HOME_PATH"/Inner/turmoil.txt -print -quit)
PBAndJ=$(find "$HOME_PATH" -maxdepth 1 -type f -name "*peanut butter*" -name "*jelly*" -print -quit)
modBeforeFile=$(find "$HOME_PATH" -maxdepth 1 -type f ! -newermt 2022-10-11 -print -quit)
modAfterFile=$(find "$HOME_PATH" -maxdepth 1 -type f -newermt 2022-10-10 -print -quit)
fileZ=$(find "$homeworkFolder" -maxdepth 1 -type f -name "ian*" -name "*lark*" -user cwl -newermt 2022-10-10 -print -quit)
prefixUBCFiles=$(find "$HOME_PATH" -type f -name "UBC*")
homeworkFiles=$(find "$homeworkFolder" -maxdepth 1 -type f)
filesThisYear=$(find "$HOME_PATH" -maxdepth 1 -type f -newermt 2022-01-02)
myFiles=$(find "$HOME_PATH" -maxdepth 1 -type f -user cwl)
pictures=$(find "$HOME_PATH" -maxdepth 1 -type f -name "*.jpg")
mv "$special" "$homeworkFolder"
for file in $prefixUBCFiles
do
	mv "$file" "$homeworkFolder"
done
mv "$PBAndJ" "$homeworkFolder"
mv "$biol" "$homeworkFolder"
parentDir=$(dirname "$suffering")
mv "$suffering" "$parentDir/torment.txt"
parentDir=$(dirname "$fileZ")
mv "$fileZ" "$parentDir/somethingDifferent.txt"
parentDir=$(dirname "$mathCourse")
mv "$mathCourse" "$parentDir/MATH-100"
InnerFolder=$(find "$HOME_PATH" -maxdepth 1 -type d -name "Inner" -print -quit)
torment=$(find "$InnerFolder" -maxdepth 1 -type f -name "*torment*" -print -quit)
cp "$torment" "$homeworkFolder"
for file in $pictures
do
	cp "$file" "$photosFolder"
done
