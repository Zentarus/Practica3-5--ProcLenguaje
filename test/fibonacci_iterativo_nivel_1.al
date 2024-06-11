procedure fibonacci is
Pre: true;

    i, n, fn, fnm1, fnm2: integer;
-----------------------------------------------------------
begin
  put_line ("");
  put_line ("Este programa pide un número positivo n y calcula fib(n) con la fórmula recursiva fib(n) = fib(n-1) + fib(n-2)");
--put_line ("Es muy rápido porque la implementación es iterativa.");
--put_line ("Habrá MATH overflow en fib(47) porque los enteros en la máquina p son de 4 bytes).");
  put_line ("");
  n := 1; --cambiar a 5
  assert: n>2 : "n tiene que ser mayo a 2"; --mostrar "Error línea 13:n tiene que ser mayo a 2" 
  put_line ("");

  put_line ("fib(1) = 1");
  put_line ("fib(2) = 1");

  i := 3;
  fnm1 := 1;
  fnm2 := 1;
  while i <= n loop
    fn := fnm1 + fnm2;
    put_line ("fib(", i,") = ", fn);
    fnm2 := fnm1;
    fnm1 := fn;
    i := i + 1;
  end loop;
  put_line;
end;