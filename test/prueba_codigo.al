procedure calcular_mcd is 
    i, j: integer;

    function mcd(a: integer) return integer is
        i: integer;
    begin
        i := a + 1;
        return i;
    end;

begin
    mcd(j);
	if i > j then
        i := i + 1;
    else 
        j := 2 * i;
    end if;
end;