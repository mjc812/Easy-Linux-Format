# Project1Group16

## How to set up enviroment in IntelliJ

#### git clone using ssh

#### create a folder called 'out' in at the root level. Go to Project Structure and paste the path in the compiler output section

#### Use open-jdk 18 for the project jdk. This is the latest Java version

#### Click 'Generate Antlr Recognizer' for both ELFLexer and ELFParser

#### Make sure to add antlr-4.10.1-complete in the library

## How to use the project
1.  Write your elf script in `src/input.elf`. Refer to https://www.notion.so/ELF-Cheat-Sheet-5499fa84b8b5460e991a75b3d6f95dfc#bab23b7c92cb43c3bbd428c71735a9e0 and the example below for help creating the script.
2.  Once you are done writing your script, run the project in IntelliJ and it will output a file called `output.sh`. This is the file that will execute your commands.
3. Place the output file in the root of the directory you are editing
4. To run the .sh file use `zsh output.sh`

### Example Script
```
path = get path /home/e/emcd4/cs-410/Documents;

folder homeworkFolder = get folder where name is Homework;
file igneousFile = get file where name is igneous.jpg, AND in folder homeworkFolder;
rename igneousFile as igneous-rock.jpg;

folder archivedRocks = get folder where at path /Archive/Rock Photos;
files rockFiles = get all files where name contains rock, AND in folder homeworkFolder;
move all from rockFiles to archivedRocks;

files oldHwk = get all files recursively where name prefix SFU;
folder archivedHwk = get folder where at path /Archive/Homework;
move all from oldHwk to archivedHwk;

files ubcFiles = get all files recursively where name contains UBC;
copy all from ubcFiles to archivedRocks;

folder schoolFolder = get folder where at path /Homework/School2020;
delete schoolFolder;
```

This script will
1. Set your working directory to `/home/e/emcd4/cs-410/Documents`
2. Rename `Homework/igneous.jpg` to `Homework/igneous-rock.jpg`
3. Move all files from the first level of the folder `Homework` whose file name contains rock into the folder `Archive/Rock Photos`
4. Recursively move all files and folders that contain "SFU" in their name in the working directory to `Archive/Homework`
5. Recursively copy all files and folders that contain "UBC" in their name to /Archive/Rock Photos
6. Deletes the folder `Homework/School2020` and all its contents
