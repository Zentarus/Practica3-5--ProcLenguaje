procedure hello is
    i, n, fn, fnm1, fnm2: integer;
begin
    i := 3;
    fnm1 := 1;
    fnm2 := 1;
    fn := fnm1 + fnm2;
    put_line ("fib(", i,") = ", fn); -- fn es la ultima expresión, el ArrayList tendra [0] = "fib(" y de [1] a [ArrayList.size] = fn
end;