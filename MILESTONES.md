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