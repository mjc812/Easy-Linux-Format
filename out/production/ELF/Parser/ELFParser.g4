parser grammar ELFParser;
options { tokenVocab= ELFLexer; }

program : path statement* EOF;
path: PATH EQUALS GETPATH TEXT SEMICOLON;
statement: (assignment | command) SEMICOLON;

assignment: (FILE | FILES| FOLDER) EQUALS get;
get: (GETFILE | GETFILES RECURSIVELY? | GETFOLDER) getClause (COMMA LOGIC getClause)*;

command: (delete | move | copy) (IF commandClause (COMMA LOGIC commandClause)*)? ;
delete: DELETE VAR_TEXT ;
move: MOVE VAR_TEXT TO VAR_TEXT ;
copy: COPY VAR_TEXT TO VAR_TEXT ;

getClause: WHERE (propertyClause | locationClause);
commandClause: propertyClause;
propertyClause: nameClause | touchedClause | dateClause;
locationClause: folderClause | pathClause;
nameClause: NAME NAMECONDITION TEXT;
touchedClause: TOUCHED BY TEXT;
dateClause: DATE TOUCHED DATECONDITION TEXT;
folderClause: INFOLDER TEXT;
pathClause: ATPATH TEXT;

