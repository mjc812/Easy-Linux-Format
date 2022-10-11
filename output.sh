HOME_PATH="/home/c/cwl/cs-410/Documents"
homeworkFolder=$(find "$HOME_PATH" -type d -name "Homework" -print -quit)
special=$(find "$HOME_PATH" -type f -name "mySpecialTextFile.txt" -print -quit)
containsString=$(find "$HOME_PATH" -type f -name "*string*" -print -quit)
photo=$(find "$HOME_PATH" -type f -name "*.png" -print -quit)
firstHomework=$(find "$homeworkFolder" -type f -print -quit)
suffering=$(find "$HOME_PATH"/Inner/turmoil.txt -print -quit)
PBAndJ=$(find "$HOME_PATH" -type f -name "*peanut butter*" -name "*jelly*" -print -quit)
modBeforeFile=$(find "$HOME_PATH" -type f ! -newermt 2022-10-11 -print -quit)
modAfterFile=$(find "$HOME_PATH" -type f -newermt 2022-10-10 -print -quit)
fileZ=$(find "$homeworkFolder" -type f -name "ian*" -name "*lark*" -user cwl
    AND date modified on 2022-10-09 -print -quit)
prefixUBCFiles=$(find "$HOME_PATH" -type f -name "UBC*")
homeworkFiles=$(find "$homeworkFolder" -type f)
filesThisYear=$(find "$HOME_PATH" -type f -newermt 2022-01-02)
myFiles=$(find "$HOME_PATH" -type f -user cwl)
mv "$special" "$homeworkFolder"
for file in $prefixUBCFiles
do
	mv "$file" "$homeworkFolder"
done
parentDir=$(dirname "$suffering")
mv "$suffering" "$parentDir/torment.txt"
