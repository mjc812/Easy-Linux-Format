parser grammar ELFParser;
options { tokenVocab= ELFLexer; }

program : path statement* EOF;
path: PATH EQUALS GETPATH TEXT SEMICOLON;
statement: statementType SEMICOLON;
statementType: get | command;

get: type VAR_TEXT EQUALS getType WHERE getClause (COMMA AND getClause)*;
type: FILE | FILES | FOLDER;
getType: GETFILE | GETFILES RECURSIVELY? | GETFOLDER;

command: commandChoice (IF commandClause (COMMA AND commandClause)*)?;
commandChoice: delete | move | copy | rename;
delete: deleteChoice VAR_TEXT;
deleteChoice: DELETE | DELETEALLFROM;
move: moveChoice VAR_TEXT TO VAR_TEXT;
moveChoice: MOVE | MOVEALLFROM;
copy: copyChoice VAR_TEXT TO VAR_TEXT;
copyChoice: COPY | COPYALLFROM;
rename: RENAME VAR_TEXT AS TEXT;

getClause: nameClause | ownedClause | dateClause | folderClause | pathClause;
commandClause: nameClause | ownedClause | dateClause;
nameClause: NAME nameCondition TEXT;
nameCondition: IS | CONTAINS | PREFIX | SUFFIX;
ownedClause: OWNED BY TEXT;
dateClause: DATE MODIFIED dateCondition TEXT;
dateCondition: BEFORE | ON | AFTER;
folderClause: INFOLDER TEXT;
pathClause: ATPATH TEXT;