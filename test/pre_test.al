------------------------------------------------------
procedure probar_test is 

i, j: integer;
------------------------------------------------------
procedure dato (dato: ref integer) is
------------------------------------------------------
    pre: dato > 4;
begin
    dato := dato + 2;
end;
------------------------------------------------------
begin
    
    i := 2;
    j := 6;

    dato(i);
    dato(j);

    i := j + 1;
end;
