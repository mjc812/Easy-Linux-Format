# milestones

# Group 16 Project 1: Bulk File Manipulator

> Authored by: Michael Chung, Elizabeth McDonald, Brandon Symmers, Katharine Zhang
> 

# Milestone 1

## Description

Our DSL – named **ELF** – is a language that would make writing scripts for bulk file manipulation more accessible and beginner friendly. Users can easily write re-usable executable scripts for linux machines that will move, copy, rename, and/or delete files en masse using our more human-readable commands.

## Ideas so far

### Properties of files a user can filter on:

- Name:
    - Prefixed with given string
    - Name matches string
    - Contains string within name
    - All of the above but with case sensitivity on/off
- Date Created:
    - On given date
    - Before given date
    - After given
    - Between given start date and given end date
- File Owner:
    - Created by given owner name
    - Created by one of the owners in given list of names
- Location:
    - Within the folder of a given path
    - Within one of the folders in a given list of paths

### Language Features

- Manipulation commands:
    - Move, copy, rename and/or delete given file (eg. delete file homework.txt)
    - Move all, copy all, rename all, delete all of the files in a given list data structure (e.g. deleteAll files in list [fileA, fileB, fileC]).
- Data Structures:
    - List commands:
        - Users can perform getAll on some condition and all valid files will be added to the list
- For Loops:
    - Users can define loops (eg. for every file in the folder structure, rename it to something else)
- If Statements:
    - Create if conditions (eg. if this file was created on 2022/09/24, rename it to ‘newFileName’)

**Note: a file is an object/structure in our language** ## Notes of any important changes/feedback from TA discussion Flesh out language more, keep the style of the language consistent, and make sure it’s actually a better experience than just using the shell commands.

## Any planned follow up tasks or features still to design

Follow up tasks are as follow: - Refine language syntax to differentiate from existing languages such as SQL and Python - Add complexity to language in the form of boolean operators - Continue to add more meaningful language features as we see fit

# Milestone 2

## Division of Responsibilities

> 2/3 Tasks Each
> 

Task Owner:

- Oversees task
- Gives directive on action items related to task
- Reviews PRs for that task
- Provide documentation on task

| Task | Task Owner |
| --- | --- |
| Bootstrapping project | Michael |
| Implementation | Elizabeth |
| Lexer | Michael |
| Parser | Michael |
| User Story #1 | Elizabeth |
| AST Conversion | Katherine |
| Static Checks | Katherine |
| Dynamic Checks | Brandon |
| User Story # 2 | Brandon |
| Debugging | Brandon |

## Roadmap

| Focus | Dates | Duration |
| --- | --- | --- |
| Tokenization & Parsing, Research + Start Implementation, User Story #1 | Sept 25 - October 3 | 1 week 2 days |
| AST Conversion, Static Checks, Validate AST, Dynamic Checks, Finish Implementation | October 3 - 10 | 1 week |
| User Story #2, Evaluate & Debug | October 10-17 | 6 days |

---

## Draft Grammar

```bash
program: path statement* EOF;
path: ‘path’ ‘=’ TEXT ‘;’ ;

statement: (assignment | commandStatement) ‘;’ ;
assignment: TYPE? VAR_TEXT ‘=’ getStatement;
getStatement: getOneStatement | getListStatement ;
getOneStatement: ‘get’ SINGLE_TYPE ‘where’ (propertyClause | locationClause) (LOGIC getClause)*;
getListStatement: ‘get all’ LIST_TYPE ‘where’ (propertyClause | locationClause) (LOGIC getClause)*;
commandStatement: (delete | moveOrCopy | rename) (‘if propertyClause (LOGIC propertyClause)*)?;

propertyClause: nameClause | userClause | dateClause ;
locationClause: folderClause | pathClause ;

nameClause: ‘name’ (‘is’ | ‘contains’ | ‘prefix’ | ‘suffix’) TEXT ;
userClause: (‘created’ | ‘modified’) ‘by’ TEXT;
dateClause: ‘date’ (‘created’ | ‘modified’) (‘before’ | ‘after’) TEXT;
folderClause: ‘in folder’ TEXT;
pathClause: ‘at path’ TEXT;

delete: ‘delete’ (‘all from’)? VAR_TEXT;
moveOrCopy: (‘move’ | ‘copy’) (‘all from’)? VAR_TEXT ‘to’ VAR_TEXT;
rename: ‘rename’ VAR_TEXT ‘to’ TEXT;

TYPE: SINGLE_TYPE | LIST_TYPES ;
SINGLE_TYPE: ‘file’ | ‘folder’ ;
LIST_TYPE: ‘files’ ;
LOGIC: ‘AND’ | ‘OR’;
VAR_TEXT = [a-zA-Z];
PATH_TEXT = [does allow the backslash]
TEXT = [does not allow the backslash];
```

## Summary of progress

- [x]  Input Specification
- [x]  Draft Grammar
- [x]  Specified target user
- [x]  Defined features we want to support in our DSL
- [x]  Roadmap
- [x]  Division of responsibilities

---

# Milestone 3:

For this milestone, our focus has been on our user study. We’ve further revised our formal grammar and based on this — we’ve crafted a cheat sheet for our DSL which the subjects of our user studies can use to gain a better understand of ELF (our DSL) and how to use it. You can find our *[cheatSheet.md](http://cheatSheet.md) file located in the root directory of this repo which includes mockups of our language design!*

## User Study #1

Task (given):

You are returning a laptop you borrowed for a couple months and want to clean up the files first.

- Copy all files in the Downloads folder where the name contains the word “receipt” into the folder My Files.
- Delete all the files in Downloads folder
- Rename “skdfhkshf.docx” to “quiz1-questions.docx”
- Move all files in the Documents folder and its subfolders that were created after 2022-08-01 into the folder My Files.

### Examples Given to User Study Participant:

**File Structure Before** 

<img width="296" alt="Screen Shot 2022-09-29 at 11 22 52 PM" src="https://media.github.students.cs.ubc.ca/user/1578/files/cf1329bf-5653-4d5f-9856-f09b76752836">


**File Structure After**

<img width="293" alt="Screen Shot 2022-09-29 at 11 23 11 PM" src="https://media.github.students.cs.ubc.ca/user/1578/files/6bdfd61f-660e-40c6-ba40-0d701465db0b">


**EXAMPLE INPUT: script.elf**

---

```markdown
path = get path /home/e/emcd4/cs-410/Documents; // absolute path

folder homeworkFolder = get folder where name is Homework

file igneousFile = get file where name is igneous.jpg, AND in folder homeworkFolder;

rename igneousFile as igneous-rock.jpg;

folder archivedRocks = get folder at path /Archive/Rock Photos;

files rockFiles = get all files where name contains rock, AND in folder homeworkFolder;

move all from rockFiles to archivedRocks;

files oldHwk = get all files recursively where name prefix SFU;

folder archivedHwk = get folder at path /Archive/Homework;

move all from oldHwk to archivedHwk;

folder schoolFolder = get folder at path /Homework/School2020;

delete schoolFolder;
```

**EXAMPLE OUTPUT: script.sh**

---

```bash
HOME_PATH="/home/e/emcd4/cs-410/Documents"
homeworkFolder="$HOME_PATH/Homework"
igneousFile="igneous.jpg"
mv $homeworkFolder/$igneousFile $homeworkFolder/igneous-rock.jpg
archivedRocks="$HOME_PATH/Archive/Rock Photos"
REGEX=".*(rock).*"
rockFiles=`ls "$homeworkFolder"`
for file in $rockFiles
do
    if [[ $file =~ $REGEX ]]
    then
        mv "$homeworkFolder"/"$file" "$archivedRocks"
    fi
done
archivedHwk="$HOME_PATH/Archive/Homework"
REGEX="^(SFU).*"
shopt -s globstar nullglob
HOME_PATH_FILES_RECURSIVE="$HOME_PATH/**/*"
for file in $HOME_PATH_FILES_RECURSIVE
do
    NAME="$(basename "$file")"
    if [[ $NAME =~ $REGEX ]]
    then
        mv "$file" "$archivedHwk"
    fi
done
schoolFolder="$HOME_PATH/Homework/School2020"
rm -r "$schoolFolder"
```

## Changes to original language design:

- We now support rename for files and folders
- We now use “,” as a delimiter for our AND expressions

## Progress vs Roadmap:

We are currently on schedule according to our roadmap and the only changes have been:

- Doing AST Conversion and the first user study at the same time
- Potentially eliminating dynamic checking if it doesn’t make sense for our end use case — still TBD

# Milestone 4

## Status of implementation:

- We have our grammar finalized and we have finished the AST conversion step
- We are currently working on implementing the core functionality of our language including integrating a visitor pattern, processing the commands defined in our DSL and generating our output

## Planning our final user study:

- We plan on doing a user study once our MVP has been completed and our DSL is fully functioning
- Our second user study will be similar to our first user study except the participant will be expected to carry out the outlined tasks using our DSL (not on paper)
- There will be more of a focus on how the user is interacting with the DSL and potential errors vs the usability of the language syntax (which was our focus for the first user study)

## Planned timeline for the remaining days:

- We hope to finish the implementation, static and dynamic checks by October 14th so that we can carry out our user study on the 15th
- We will be creating the video after the 14th


