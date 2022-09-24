lexer grammar ELFLexer;

PATH: 'path';
FILE: 'file' WS* -> mode(VAR_TEXT_MODE);
FILES: 'files' WS* -> mode(VAR_TEXT_MODE);
FOLDER: 'folder' WS* -> mode(VAR_TEXT_MODE);

GETFILE: 'get file';
GETFILES: 'get all files';
GETFOLDER: 'get folder';
GETPATH: 'get path' WS* -> mode(TEXT_MODE);

DELETE: ('delete' | 'delete all from') WS* -> mode(VAR_TEXT_MODE);
MOVE: ('move' | 'move all from') WS* -> mode(VAR_TEXT_MODE);
COPY: ('copy' | 'copy all from') WS* -> mode(VAR_TEXT_MODE);
TO: 'to' WS* -> mode(VAR_TEXT_MODE);
IF: 'if';

WHERE: 'where';
RECURSIVELY: 'recursively';
NAME: 'name';
NAMECONDITION: ('is' | 'contains' | 'prefix' | 'suffix') WS* -> mode(TEXT_MODE);
DATE: 'date';
DATECONDITION: ('before' | 'on' | 'after') WS* -> mode(TEXT_MODE);
INFOLDER: 'in folder'  WS* -> mode(TEXT_MODE);
ATPATH: 'at path'  WS* -> mode(TEXT_MODE);
TOUCHED: ('created' | 'modified');
BY: 'by' WS* -> mode(TEXT_MODE);

LOGIC: ('AND' | 'OR');
COMMA: ',';
SEMICOLON: ';';
EQUALS: '=';
WS : [\r\n\t ] -> channel(HIDDEN);

mode VAR_TEXT_MODE;
VAR_TEXT: [a-zA-Z]+ -> mode(DEFAULT_MODE);

mode TEXT_MODE;
TEXT: ~[;,]+ -> mode(DEFAULT_MODE);