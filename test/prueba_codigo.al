procedure calcular_mcd is 
    i, j: integer;

    function mcd(a, b: integer) return integer is
        i, j, k: integer;
    begin
        j := a;
        k := b;
        i := a mod b;
        while i /= 0 loop
            j := k;
            k := i;
            i := j mod k;
        end loop;
        return k;
    end;


begin
	if i > j then
        i := i + 1;
    elsif i < j then
        i := i - 1;
    elsif 2*i < j then
        j := 4 * i;
    else 
        j := 2 * i;
    end if;
end;