grammar Json;

json:     object
        | array
        |
;
object: '{' kv (',' kv)* '}' | '{' '}';

kv: STRING ':' value;


array: '[' value (',' value)* ']' | '[' ']';

value: STRING #stringValue
        | NUMBER #numberValue
        | object #objectValue
        | array  #arrayValue
        | 'true' # trueValue
        | 'false'# falseValue
        | 'null' #nullValue
        ;


STRING: '"' (ESC |~["\\])* '"';

fragment ESC: '\\'([bfnrt"\\/] | UNICODE);

fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];


NUMBER: '-' ? INT EXP ?
        | '-' ? INT '.' INT EXP?



;

fragment INT: '0'
    | [1-9][0-9]*
    ;

fragment EXP: [Ee] [+\-]? INT;


WS: [ \t\r\n] -> skip;

