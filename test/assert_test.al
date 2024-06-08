------------------------------------------------------
procedure probar_assert is 

    i, j: integer;
    colonia: array(0..100) of integer;

------------------------------------------------------
begin
    get(i);
    get(j);
    while i <= 80 loop
        assert: colonia(i)>0 : "''colonia(i)'' tiene que ser positivo";
    colonia(i) := (i >= 37) and (i <= 43);
    i := i + 1;
end loop;
        assert: i=j : "''i'' y ''j'' han de tener el mismo valor";
end;
