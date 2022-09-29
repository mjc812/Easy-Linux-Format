parser grammar ELFParser;
options { tokenVocab= ELFLexer; }

program : path statement* EOF;
path: PATH EQUALS GETPATH TEXT SEMICOLON;
statement: statementType SEMICOLON;
statementType: get | command;

get: type VAR_TEXT EQUALS getType getCondition;
type: FILE | FILES | FOLDER;
getType: GETFILE | GETFILES RECURSIVELY? | GETFOLDER;
getCondition: WHERE getClause (COMMA AND getClause)*;

command: commandChoice commandCondition;
commandChoice: delete | move | copy | rename;
delete: deleteChoice VAR_TEXT;
deleteChoice: DELETE | DELETEALLFROM;
move: moveChoice VAR_TEXT TO VAR_TEXT;
moveChoice: MOVE | MOVEALLFROM;
copy: copyChoice VAR_TEXT TO VAR_TEXT;
copyChoice: COPY | COPYALLFROM;
rename: RENAME VAR_TEXT AS TEXT;
commandCondition: (IF commandClause (COMMA AND commandClause)*)?;

getClause: nameClause | modifiedClause | dateClause | folderClause | pathClause;
commandClause: folderClause | pathClause;
nameClause: NAME nameCondition TEXT;
nameCondition: IS | CONTAINS | PREFIX | SUFFIX;
modifiedClause: MODIFIED BY TEXT;
dateClause: DATE MODIFIED dateCondition TEXT;
dateCondition: BEFORE | ON | AFTER;
folderClause: INFOLDER TEXT;
pathClause: ATPATH TEXT;