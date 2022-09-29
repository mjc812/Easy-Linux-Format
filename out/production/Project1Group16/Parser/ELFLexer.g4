lexer grammar ELFLexer;

PATH: 'path';
FILE: 'file' WS* -> mode(VAR_TEXT_MODE);
FILES: 'files' WS* -> mode(VAR_TEXT_MODE);
FOLDER: 'folder' WS* -> mode(VAR_TEXT_MODE);

GETFILE: 'get file';
GETFILES: 'get all files';
GETFOLDER: 'get folder';
GETPATH: 'get path' WS* -> mode(TEXT_MODE);

DELETE: 'delete' WS* -> mode(VAR_TEXT_MODE);
DELETEALLFROM: 'delete all from' WS* -> mode(VAR_TEXT_MODE);
MOVE: 'move' WS* -> mode(VAR_TEXT_MODE);
MOVEALLFROM: 'move all from' WS* -> mode(VAR_TEXT_MODE);
COPY: 'copy' WS* -> mode(VAR_TEXT_MODE);
COPYALLFROM: 'copy all from' WS* -> mode(VAR_TEXT_MODE);
RENAME: 'rename' WS* -> mode(VAR_TEXT_MODE);
TO: 'to' WS* -> mode(VAR_TEXT_MODE);
IF: 'if';

WHERE: 'where';
RECURSIVELY: 'recursively';
NAME: 'name';
IS: 'is' WS* -> mode(TEXT_MODE);
CONTAINS: 'contains' WS* -> mode(TEXT_MODE);
PREFIX: 'prefix' WS* -> mode(TEXT_MODE);
SUFFIX: 'suffix' WS* -> mode(TEXT_MODE);
DATE: 'date';
BEFORE: 'before' WS* -> mode(TEXT_MODE);
ON: 'on' WS* -> mode(TEXT_MODE);
AFTER: 'after' WS* -> mode(TEXT_MODE);
INFOLDER: 'in folder'  WS* -> mode(TEXT_MODE);
ATPATH: 'at path'  WS* -> mode(TEXT_MODE);
CREATED: 'created';
MODIFIED: 'modified';
BY: 'by' WS* -> mode(TEXT_MODE);
AND: 'AND';
AS: 'as' WS* -> mode(TEXT_MODE);

COMMA: ',';
SEMICOLON: ';';
EQUALS: '=';
WS : [\r\n\t ] -> channel(HIDDEN);

mode VAR_TEXT_MODE;
VAR_TEXT: [a-zA-Z]+ -> mode(DEFAULT_MODE);

mode TEXT_MODE;
TEXT: ~[;,]+ -> mode(DEFAULT_MODE);